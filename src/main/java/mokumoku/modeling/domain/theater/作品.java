package mokumoku.modeling.movie.domain.theater;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.sql.Time;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 作品 {

    private String 作品ID;

    private String 作品名;

    private Time 上映時間;

    public Time get上映時間() {
        return 上映時間;
    }
}
