package mokumoku.precure.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.domain.hugtto_precure.CombinationAttack;
import mokumoku.precure.domain.hugtto_precure.HUGっとプリキュア;
import mokumoku.precure.domain.hugtto_precure.HUGっとプリキュア_チアフルスタイル;
import mokumoku.precure.domain.hugtto_precure.HUGっとプリキュア_変身;
import mokumoku.precure.domain.hugtto_precure.kuraiasu_sya.Employee;
import mokumoku.precure.domain.hugtto_precure.kuraiasu_sya.オシマイダー;

/**
 * とある1話の構成
 */
@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class EpisodeService {
    public void onAir(
            HUGっとプリキュア hugpre,
            Employee employee
    ) {
        // クライアス社の社員が怪人を発注
        オシマイダー oshimaida_ = employee.発注();

        // プリキュアが変身
        HUGっとプリキュア_変身 hugpre_transform = hugpre.transform();

        // プリキュアが戦う
        hugpre_transform.yellAttack();

        // チアフルスタイルに変身
        HUGっとプリキュア_チアフルスタイル cheerfulStyle = hugpre_transform.transform();

        // 必殺技
        CombinationAttack combinationAttack = new CombinationAttack();
        combinationAttack.プリキュア_チアフルアタック(cheerfulStyle, oshimaida_);
    }
}