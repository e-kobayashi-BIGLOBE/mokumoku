package mokumoku.modeling9.service;

import javaslang.collection.List;
import lombok.AllArgsConstructor;
import mokumoku.modeling9.domain.reserve.*;
import mokumoku.modeling9.domain.room.会議室;
import mokumoku.modeling9.domain.room.会議室名;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ReserveService {
    
    public ReserveService() {
    }

    private 予約Repository _予約Repository = new 予約Repository();

    public 予約結果 予約する(
            予約時間 _予約時間,
            予約者 _予約者,
            会議室名 _会議室名
    ) {
        
        // 会議室を作る
        // 会議室がなければexception
        会議室 _会議室 = 会議室.create(_会議室名);

        // 会議室に対する予約リストを取得
        予約リスト _予約リスト = _予約Repository.find(_会議室);

        // 予約を作る
        予約 _予約 = new 予約(_予約時間, _予約者, _会議室);

        // 予約結果を取得
        予約結果 _予約結果 = _予約.getResult(_予約リスト);

        // 永続化
        save(_予約結果);

        return _予約結果;
    }


    private void save(予約結果 _予約結果) {
        _予約結果.getResult().forEach(v -> _予約Repository.save(v.get_予約()));
    }

    // datasource
    class 予約Repository {
        public 予約リスト find(会議室 _会議室) {
            // stub
            if (_会議室.equals(会議室.A)) {
                // 会議室A予約なし
                return new 予約リスト(List.empty());
            }

            if (_会議室.equals(会議室.B)) {
                // 会議室B予約あり 12/1 13:00-14:00 
                予約 _会議室B予約 = new 予約(
                        new 予約時間(開始時間.create("20181201130000"), 終了時間.create("20181201140000")),
                        new 予約者("ほげ川ほげのすけ"),
                        会議室.B
                );
                return new 予約リスト(List.of(_会議室B予約));
            }

            return new 予約リスト(List.empty());
        }

        public void save(予約 _予約) {
            // 永続化
        }
    }
}