package mokumoku.modeling10_2.domain.light;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum ライト明るさ {
    全灯,
    標準,
    豆球
    ;
}