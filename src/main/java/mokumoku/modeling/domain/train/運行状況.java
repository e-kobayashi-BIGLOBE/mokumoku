package mokumoku.modeling.domain.train;

import javaslang.control.Either;
import lombok.AllArgsConstructor;
import mokumoku.modeling.domain.train.status.正常;
import mokumoku.modeling.domain.train.status.遅延;
import mokumoku.modeling.domain.train.status.遅延時分;

@AllArgsConstructor
public class 運行状況 {
    private final Either<遅延, 正常> 運行状況;

    public static 運行状況 create(String 状態, 遅延時分 遅延時分) {
        if (状態.equals("正常") && 遅延時分.getValue().equals("0")) {
            return new 運行状況(Either.right(new 正常()));
        }
        return new 運行状況(Either.left(new 遅延(遅延時分)));
    }

    public String get運行状況() {
        if (運行状況.isRight()) {
            return "正常";
        }
        return "遅延" + 運行状況.swap().get().get遅延時分().getValue() + "分";
    }
}