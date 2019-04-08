package mokumoku.modeling.movie.domain.nowonair;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 上映 {

    private String 作品ID;

    public String get作品ID(){
        return 作品ID;
    }
    @Getter
    private String 劇場ID;
    private mokumoku.modeling.movie.domain.nowonair.上映期間 上映期間;
    private String 上映ID;
}
