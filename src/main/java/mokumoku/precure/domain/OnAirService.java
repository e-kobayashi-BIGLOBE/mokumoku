package mokumoku.precure.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.domain.hugtto_precure.CombinationAttack;
import mokumoku.precure.domain.hugtto_precure.HUGっとプリキュア;
import mokumoku.precure.domain.hugtto_precure.HUGっとプリキュア_変身;
import mokumoku.precure.domain.hugtto_precure.kuraiasu_sya.社員;
import mokumoku.precure.domain.hugtto_precure.kuraiasu_sya.オシマイダー;

/**
 * プリキュアを放送する
 */
@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class OnAirService {
    public void onAir(
            HUGっとプリキュア hugpre,
            社員 employee
    ) {
        // クライアス社の社員が怪人を発注
        オシマイダー oshimaida_ = employee.発注();

        // プリキュアが変身
        HUGっとプリキュア_変身 hugpre_transform = hugpre.transform();

        // キュアエールの攻撃
        hugpre_transform.yellAttack();
        
        // 必殺技
        CombinationAttack combinationAttack = new CombinationAttack();
        combinationAttack.ツインラブ_ロックビート(
                hugpre_transform.getMacherie(),
                hugpre_transform.getAmour(),
                oshimaida_
        );
    }
}