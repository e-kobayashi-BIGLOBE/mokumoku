package mokumoku.modeling9.domain.reserve;

import javaslang.collection.List;
import javaslang.control.Either;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 予約リスト {
    @Getter
    private final List<予約> list;

    public 予約結果 重複チェック(予約 _予約) {
        重複予約リスト dupList = new 重複予約リスト(
                list.filter(v -> v.isかぶってる(_予約.get_予約時間()))
        );
        return dupList.isEmpty()
                ? new 予約結果(Either.right(new 予約結果OK(_予約)))
                : new 予約結果(Either.left(new 予約結果NG(dupList)));
    }
}