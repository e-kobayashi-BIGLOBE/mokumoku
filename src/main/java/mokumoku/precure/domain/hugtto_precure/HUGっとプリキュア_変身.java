package mokumoku.precure.domain.hugtto_precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import mokumoku.precure.domain.hugtto_precure.cure_amour.キュアアムール;
import mokumoku.precure.domain.hugtto_precure.cure_ange.キュアアンジュ;
import mokumoku.precure.domain.hugtto_precure.cure_etoile.キュアエトワール;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.キュアマシェリ;
import mokumoku.precure.domain.hugtto_precure.cure_yell.キュアエール;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class HUGっとプリキュア_変身 {
    private final キュアエール yell;
    private final キュアアンジュ ange;
    private final キュアエトワール etoile;
    private final キュアマシェリ macherie;
    private final キュアアムール amour;

    public HUGっとプリキュア_チアフルスタイル transform() {
        return new HUGっとプリキュア_チアフルスタイル(
                yell.transform(),
                ange.transform(),
                etoile.transform(),
                macherie.transform(),
                amour.transform()
        );
    }
    
    public void yellAttack() {
        yell.attack();
    }

}