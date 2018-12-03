package mokumoku.precure.domain.hugtto_precure.cure_ange;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;
import mokumoku.precure.domain.hugtto_precure.cure_yell.キュアエール;
import mokumoku.precure.domain.hugtto_precure.cure_yell.キュアエール_チアフルスタイル;
import mokumoku.precure.domain.hugtto_precure.cure_yell.野乃はな;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class キュアアンジュ {
    private final 薬師寺さあや.ミライクリスタル_ブルー miraiCrystal;

    キュアアンジュ(薬師寺さあや.ミライクリスタル_ブルー miraiCrystal) {
        this.miraiCrystal = miraiCrystal;
    }

    public キュアアンジュ_チアフルスタイル transform() {
        return new キュアアンジュ_チアフルスタイル();
    }

}