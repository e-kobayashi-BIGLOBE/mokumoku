package mokumoku.modeling9.domain.reserve;

import javaslang.collection.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
public class 重複予約リスト {
    @Getter
    private final List<予約> list;
    
    public boolean isEmpty() {
        return list.isEmpty();
    }
}