package mokumoku.modeling.movie.domain.theater;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 座席 {

    private String 列;
    private int 番号;
    private String タイプ;

}
