package mokumoku.modeling9.domain.reserve;

import javaslang.control.Either;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import mokumoku.modeling9.domain.room.会議室;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 予約 {
    @Getter
    private final 予約時間 _予約時間;
    private final 予約者 _予約者;
    private final 会議室 _会議室;

    public 予約結果 getResult(予約リスト list) {
        重複予約リスト dupList = new 重複予約リスト(
                list.getList().filter(v -> v.get_予約時間().isかぶってる(_予約時間))
        );
        return dupList.isEmpty()
                ? new 予約結果(Either.right(new 予約結果OK(this)))
                : new 予約結果(Either.left(new 予約結果NG(dupList)));
    }
}