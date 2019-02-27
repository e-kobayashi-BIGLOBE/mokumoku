package mokumoku.precure;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class PrintUtil {
    public static void print(Class clazz, String message) {
        System.out.println(clazz.getSimpleName() + " > " + message);
    }
}