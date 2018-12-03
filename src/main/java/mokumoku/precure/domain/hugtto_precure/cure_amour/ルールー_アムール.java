package mokumoku.precure.domain.hugtto_precure.cure_amour;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class ルールー_アムール {
    public キュアアムール transform() {
        PrintUtil.print(this.getClass(), "ミライクリスタル！\nハートキラっと！\nは～ぎゅ～～！\nぎゅ～！\nぎゅ～～！\n輝く未来を抱きしめて！\nみんな大好き！愛のプリキュア！キュアアムール！");

        return new キュアアムール(new ミライクリスタル_パープル());
    }

    @AllArgsConstructor
    public class ミライクリスタル_パープル {
    }
}