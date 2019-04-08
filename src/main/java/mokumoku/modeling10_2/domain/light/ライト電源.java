package mokumoku.modeling10_2.domain.light;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum  ライト電源 {
    ON("ON"),
    OFF("OFF"),
    ;
    
    @Getter//表示用
    private final String label;
}