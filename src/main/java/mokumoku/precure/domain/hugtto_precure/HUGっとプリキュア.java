package mokumoku.precure.domain.hugtto_precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.domain.hugtto_precure.cure_amour.ルールー_アムール;
import mokumoku.precure.domain.hugtto_precure.cure_ange.薬師寺さあや;
import mokumoku.precure.domain.hugtto_precure.cure_etoile.輝木ほまれ;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.愛崎えみる;
import mokumoku.precure.domain.hugtto_precure.cure_yell.野乃はな;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class HUGっとプリキュア {
    private final 野乃はな hana;
    private final 薬師寺さあや saaya;
    private final 輝木ほまれ homare;
    private final 愛崎えみる emiru;
    private final ルールー_アムール ruru;

    public HUGっとプリキュア_変身 transform() {
        return new HUGっとプリキュア_変身(
                hana.transform(),
                saaya.transform(),
                homare.transform(),
                emiru.transform(),
                ruru.transform()
        );
    }
}