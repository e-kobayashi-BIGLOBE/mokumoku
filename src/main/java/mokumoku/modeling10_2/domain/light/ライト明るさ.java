package mokumoku.modeling10_2.domain.light;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum ライト明るさ {
    全灯("全灯"),
    標準("標準"),
    豆球("豆球")
    ;
    
    @Getter//表示用
    private final String label;
}