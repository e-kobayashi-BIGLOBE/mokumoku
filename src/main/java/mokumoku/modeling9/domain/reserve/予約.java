package mokumoku.modeling9.domain.reserve;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import mokumoku.modeling9.domain.room.会議室;

@AllArgsConstructor
public class 予約 {
    @Getter
    private final 予約時間 _予約時間;
    private final 予約者 _予約者;
    private final 会議室 _会議室;

    public boolean isかぶってる(予約時間 _new予約時間) {
        return _予約時間.isかぶってる(_new予約時間);
    }
}