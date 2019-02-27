package mokumoku.precure.domain.hugtto_precure.cure_yell;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class キュアエール {

    private final 野乃はな.ミライクリスタル_ピンク miraiCrystal;

    // パッケージプライベート
    キュアエール(野乃はな.ミライクリスタル_ピンク miraiCrystal) {
        this.miraiCrystal = miraiCrystal;
    }
    
    public void attack() {
        PrintUtil.print(this.getClass(), "フラワーシュート！");
    }

    public void finishAttack() {
        PrintUtil.print(this.getClass(), "フレフレ！ハート・フォー・ユー！");
    }
}