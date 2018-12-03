package mokumoku.precure.domain.hugtto_precure.cure_ange;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 薬師寺さあや {
    
    public キュアアンジュ transform() {
        PrintUtil.print(this.getClass(), "ミライクリスタル！\nハートキラっと！\nは～ぎゅ～～！\nぎゅ～！\nぎゅ～～！\n輝く未来を抱きしめて！\nみんなを癒す！知恵のプリキュア！キュアアンジュ！");

        return new キュアアンジュ(new ミライクリスタル_ブルー());
    }

    @AllArgsConstructor
    public class ミライクリスタル_ブルー {
    }

}