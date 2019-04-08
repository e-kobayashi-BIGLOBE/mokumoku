package mokumoku.modeling9.domain.reserve;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
public class 予約時間 {
    @Getter
    private final 開始時間 _開始時間;
    @Getter
    private final 終了時間 _終了時間;

    public boolean isかぶってる(予約時間 _予約時間) {
        return _開始時間.getValue().isAfter(_予約時間.get_開始時間().getValue()) ||
                _終了時間.getValue().isBefore(_予約時間.get_終了時間().getValue());
    }
}