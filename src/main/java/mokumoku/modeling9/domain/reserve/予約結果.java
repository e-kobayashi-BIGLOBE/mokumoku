package mokumoku.modeling9.domain.reserve;

import javaslang.control.Either;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 予約結果 {
    @Getter
    private Either<予約結果NG, 予約結果OK> result;
}