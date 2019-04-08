package mokumoku.modeling.movie.domain.nowonair;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 上映スケジュール {

    private String 上映時間;
    private int スクリーン番号;
    private String 劇場ID;
    private String 作品ID;
}
