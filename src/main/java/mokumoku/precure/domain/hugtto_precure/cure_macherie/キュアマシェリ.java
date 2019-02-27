package mokumoku.precure.domain.hugtto_precure.cure_macherie;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class キュアマシェリ {
    private final 愛崎えみる.ミライクリスタル_レッド miraiCrystal;

    キュアマシェリ(愛崎えみる.ミライクリスタル_レッド miraiCrystal) {
        this.miraiCrystal = miraiCrystal;
    }

    public void ミライクリスタル_セット() {
        miraiCrystal.set();
    }

}