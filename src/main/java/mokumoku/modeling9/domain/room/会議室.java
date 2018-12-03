package mokumoku.modeling9.domain.room;

import javaslang.collection.Stream;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum  会議室 {
    A(new 会議室名("A")),
    B(new 会議室名("B")),
    ;
    private final 会議室名 _会議室名;

    public static 会議室 create(会議室名 value) {
        return Stream
                .of(values())
                .find(v -> v._会議室名.equals(value))
                .getOrElseThrow(() -> new RuntimeException("該当する名前の会議室は存在しません"));
    }
}