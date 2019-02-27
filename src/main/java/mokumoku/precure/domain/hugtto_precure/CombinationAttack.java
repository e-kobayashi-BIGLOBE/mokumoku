package mokumoku.precure.domain.hugtto_precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;
import mokumoku.precure.domain.hugtto_precure.cure_amour.キュアアムール;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.キュアマシェリ;
import mokumoku.precure.domain.hugtto_precure.kuraiasu_sya.オシマイダー;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class CombinationAttack {

    /**
     * 怪人を浄化する
     * ミライクリスタルをセットして、二人でツインラブギターを奏でる
     */
    public void ツインラブ_ロックビート(
            キュアマシェリ cureMacherie,
            キュアアムール cureAmour,
            オシマイダー oshimaida_
    ) {
        cureMacherie.ミライクリスタル_セット();
        
        PrintUtil.print(this.getClass(), "ツインラブ・ロックビート！");
        oshimaida_.ヤメサセテモライマス();
    }


}