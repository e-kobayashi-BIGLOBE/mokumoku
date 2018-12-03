package mokumoku.precure.domain.hugtto_precure.kuraiasu_sya;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class Employee {

    public オシマイダー 発注() {
        PrintUtil.print(this.getClass(),"発注！オシマイダー！");
        return new オシマイダー();
    }
}