package mokumoku.precure.domain.hugtto_precure.cure_macherie;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 愛崎えみる {
    public キュアマシェリ transform() {
        PrintUtil.print(this.getClass(), "ミライクリスタル！\nハートキラっと！\nは～ぎゅ～～！\nぎゅ～！\nぎゅ～～！\n輝く未来を抱きしめて！\nみんな大好き！愛のプリキュア！キュアマシェリ！");

        return new キュアマシェリ(new ミライクリスタル_レッド());
    }

    @AllArgsConstructor
    public class ミライクリスタル_レッド {
    }
}