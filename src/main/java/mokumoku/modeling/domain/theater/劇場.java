package mokumoku.modeling.movie.domain.theater;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString(includeFieldNames = false)
@EqualsAndHashCode
@AllArgsConstructor
public class 劇場 {

    private String 劇場ID;

    public String get劇場ID(){
        return 劇場ID;
    }

    private String 劇場名;

    @Getter
    private List<スクリーン> スクリーンList;
    
    public スクリーン getスクリーン(
            int スクリーン番号
    ) {
        return スクリーンList.get(スクリーン番号);
    }
}
