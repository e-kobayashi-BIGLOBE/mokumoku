package mokumoku.modeling10_2.domain.light;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 点灯 {
    @Getter
    private final ライト電源 _ライト電源 = ライト電源.ON;
    @Getter
    private final ライト明るさ _ライト明るさ;

}