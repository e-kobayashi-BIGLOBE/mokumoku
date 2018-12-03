package mokumoku.modeling9.datasource.reserve;

import javaslang.collection.List;
import mokumoku.modeling9.domain.reserve.*;
import mokumoku.modeling9.domain.room.会議室;
import org.springframework.stereotype.Repository;

@Repository
public class 予約RepositoryImpl implements 予約Repository {
    @Override
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

    @Override
    public void save(予約 _予約) {
        // 永続化したことにする
    }
}