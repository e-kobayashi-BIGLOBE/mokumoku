package mokumoku.precure.domain.hugtto_precure.cure_amour;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class キュアアムール {
    @Getter
    private final ルールー_アムール.ミライクリスタル_パープル miraiCrystal;

    キュアアムール(ルールー_アムール.ミライクリスタル_パープル miraiCrystal) {
        this.miraiCrystal = miraiCrystal;
    }
    
}