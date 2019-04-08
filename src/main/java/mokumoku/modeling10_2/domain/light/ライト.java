package mokumoku.modeling10_2.domain.light;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class ライト {
    @Getter//表示用
    private final ライト電源 _ライト電源;
    @Getter//表示用
    private final ライト明るさ _ライト明るさ;
    
    public ライト ライトを点灯する(
            点灯 点灯イベント
    ) {
        return new ライト(点灯イベント.get_ライト電源(), 点灯イベント.get_ライト明るさ());
    }

    public ライト ライトを消灯する(
            消灯 消灯イベント
    ) {
        return new ライト(消灯イベント.get_ライト電源(), _ライト明るさ);
    }

}