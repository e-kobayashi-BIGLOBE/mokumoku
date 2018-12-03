package mokumoku.precure.domain.hugtto_precure.cure_yell;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 野乃はな {

    public キュアエール transform() {
        PrintUtil.print(this.getClass(), "ミライクリスタル！\nハートキラっと！\nは～ぎゅ～～！\nぎゅ～！\nぎゅ～～！\n輝く未来を抱きしめて！\nみんなを応援！元気のプリキュア！キュアエール！");

        return new キュアエール(new ミライクリスタル_ピンク());
    }

    @AllArgsConstructor
    public class ミライクリスタル_ピンク {
    }

}