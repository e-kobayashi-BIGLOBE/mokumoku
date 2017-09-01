package mokumoku.modeling.movie.domain.nowonair;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.time.LocalDate;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 上映期間 {

    private LocalDate 上映開始日;
    private LocalDate 上映終了日;
}
