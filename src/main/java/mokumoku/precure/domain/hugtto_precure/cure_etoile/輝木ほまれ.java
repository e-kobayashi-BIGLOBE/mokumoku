package mokumoku.precure.domain.hugtto_precure.cure_etoile;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 輝木ほまれ {

    public キュアエトワール transform() {
        PrintUtil.print(this.getClass(), "ミライクリスタル！\nハートキラっと！\nは～ぎゅ～～！\nぎゅ～！\nぎゅ～～！\n輝く未来を抱きしめて！\nみんな輝け！力のプリキュア！キュアエトワール！");

        return new キュアエトワール(new ミライクリスタル_イエロー());
    }

    @AllArgsConstructor
    public class ミライクリスタル_イエロー {
    }

}