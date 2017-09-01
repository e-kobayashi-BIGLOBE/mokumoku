package mokumoku.modeling.movie.domain.theater;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 座席表 {

    private List<座席> 座席List;
}
