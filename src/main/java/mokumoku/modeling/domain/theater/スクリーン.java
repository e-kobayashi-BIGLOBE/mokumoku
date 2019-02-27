package mokumoku.modeling.movie.domain.theater;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class スクリーン {

    @Getter
    private final int スクリーン番号;
    @Getter
    private final mokumoku.modeling.movie.domain.theater.座席表 座席表;
}
