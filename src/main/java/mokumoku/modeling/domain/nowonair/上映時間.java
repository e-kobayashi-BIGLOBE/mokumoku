package mokumoku.modeling.movie.domain.nowonair;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.modeling.movie.domain.theater.作品;

import java.sql.Time;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 上映時間 {

    private Time 開始時刻;
    private Time 終了時刻;

    public 上映時間(Time 開始時刻, 作品 作品) {
        this.開始時刻 = 開始時刻;
        this.終了時刻 = 作品.get上映時間(); //todo: 開始時刻を足す
    }
}
