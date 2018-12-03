package mokumoku.precure.domain.hugtto_precure.cure_macherie;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class キュアマシェリ {
    @Getter
    private final 愛崎えみる.ミライクリスタル_レッド miraiCrystal;

    キュアマシェリ(愛崎えみる.ミライクリスタル_レッド miraiCrystal) {
        this.miraiCrystal = miraiCrystal;
    }

    public キュアマシェリ_チアフルスタイル transform() {
        return new キュアマシェリ_チアフルスタイル();
    }

}