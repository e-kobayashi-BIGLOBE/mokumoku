package mokumoku.modeling9.domain.reserve;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 予約結果NG {
    private final 重複予約リスト _重複予約リスト;
}