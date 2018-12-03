package mokumoku.precure.domain.hugtto_precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;
import mokumoku.precure.domain.hugtto_precure.cure_amour.ルールー_アムール;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.愛崎えみる;
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
                愛崎えみる.ミライクリスタル_レッド red,
                ルールー_アムール.ミライクリスタル_パープル purple,
                オシマイダー oshimaida_
        ) {
            PrintUtil.print(this.getClass(), "ツインラブ・ロックビート！");
            oshimaida_.ヤメサセテモライマス();
        }


        /**
         * 怪人を浄化する
         * チアフルスタイルの5人が揃うと使える
         * <p>
         * ミライパットにみんなメモリアルパワーを注ぎ込み、
         * 巨大な6個のハートのエネルギーが繋がって1つの花のようになって飛んでいく
         */
        public void プリキュア_チアフルアタック(
                HUGっとプリキュア_チアフルスタイル cheerfulStyle,
                オシマイダー oshimaida_
        ) {
            PrintUtil.print(this.getClass(), "プリキュア・チアフルアタック！");
            oshimaida_.ヤメサセテモライマス();
        }
}