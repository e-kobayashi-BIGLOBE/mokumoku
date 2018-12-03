package mokumoku.precure.domain.hugtto_precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.domain.hugtto_precure.cure_amour.キュアアムール;
import mokumoku.precure.domain.hugtto_precure.cure_amour.キュアアムール_チアフルスタイル;
import mokumoku.precure.domain.hugtto_precure.cure_ange.キュアアンジュ;
import mokumoku.precure.domain.hugtto_precure.cure_ange.キュアアンジュ_チアフルスタイル;
import mokumoku.precure.domain.hugtto_precure.cure_etoile.キュアエトワール;
import mokumoku.precure.domain.hugtto_precure.cure_etoile.キュアエトワール_チアフルスタイル;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.キュアマシェリ;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.キュアマシェリ_チアフルスタイル;
import mokumoku.precure.domain.hugtto_precure.cure_yell.キュアエール;
import mokumoku.precure.domain.hugtto_precure.cure_yell.キュアエール_チアフルスタイル;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class HUGっとプリキュア_チアフルスタイル {
    private final キュアエール_チアフルスタイル yell;
    private final キュアアンジュ_チアフルスタイル ange;
    private final キュアエトワール_チアフルスタイル etoile;
    private final キュアマシェリ_チアフルスタイル macherie;
    private final キュアアムール_チアフルスタイル amour;
}