package mokumoku.precure.domain.hugtto_precure.cure_infini;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.precure.PrintUtil;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 若宮アンリ {
    public キュアアンフィニ transform() {
        PrintUtil.print(
                this.getClass(),
                "キュアアンフィニ！ …それがボクの名前かな？"
        );

        return new キュアアンフィニ();
    }
}