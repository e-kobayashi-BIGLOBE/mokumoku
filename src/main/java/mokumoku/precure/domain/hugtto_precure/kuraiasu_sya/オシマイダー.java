package mokumoku.precure.domain.hugtto_precure.kuraiasu_sya;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
public class オシマイダー {

    オシマイダー() {
        PrintUtil.print(this.getClass(),"オシマイダー！");
    }
    
    public void ヤメサセテモライマス() {
        PrintUtil.print(this.getClass(), "ヤメサセテモライマース");
    }
}