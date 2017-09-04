package mokumoku.mobile.domain.mobile.fee;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class MonthlyFee {

    private final int INIT_FEE = 0;

    private final Fee mobileContractFee;
    private final Option<Fee> voiceOptionFee;
    private final Option<Fee> answerPhoneOptionFee;

    public TotalFee getTotalFee() {
        TotalFee totalFee = new TotalFee(INIT_FEE);
        // todo:かっこよくする
        totalFee = add(totalFee, mobileContractFee);
        totalFee = add(totalFee, voiceOptionFee);
        totalFee = add(totalFee, answerPhoneOptionFee);
        return totalFee;
    }

    private TotalFee add(TotalFee totalFee, Fee fee) {
        return new TotalFee(totalFee.getValue() + fee.getFee());
    }

    private TotalFee add(TotalFee totalFee, Option<Fee> fee) {
        return fee.map(v -> new TotalFee(totalFee.getValue() + v.getFee())).getOrElse(totalFee);
    }

}