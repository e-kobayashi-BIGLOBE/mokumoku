package mokumoku.modeling9;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.modeling9.domain.reserve.*;
import mokumoku.modeling9.domain.room.会議室名;
import mokumoku.modeling9.service.ReserveService;

import java.time.LocalDateTime;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class Main {

    public static void main(String[] args) {
        ReserveService reserveService = new ReserveService(); // stub

        // リクエストパラメータ
        予約時間 _予約時間 = new 予約時間(
                new 開始時間(LocalDateTime.of(2018, 12, 1, 13, 0, 0)),
                new 終了時間(LocalDateTime.of(2018, 12, 1, 15, 0, 0))
        );
        予約者 _予約者 = new 予約者("ほげ山ほげ子");
        会議室名 _会議室名 = new 会議室名("A");

        予約結果 _予約結果 = reserveService.予約する(_予約時間, _予約者, _会議室名);
        System.out.println(_予約結果.getResult().toString());
    }
}