package mokumoku.precure.domain.hugtto_precure.cure_etoile;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class キュアエトワール {
    private final 輝木ほまれ.ミライクリスタル_イエロー miraiCrystal;

    キュアエトワール(輝木ほまれ.ミライクリスタル_イエロー miraiCrystal) {
        this.miraiCrystal = miraiCrystal;
    }
    
}