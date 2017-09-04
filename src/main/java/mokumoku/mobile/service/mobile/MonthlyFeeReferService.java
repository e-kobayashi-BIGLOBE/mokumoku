package mokumoku.mobile.service.mobile;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContract;
import mokumoku.mobile.domain.mobile.MobileContractRepository;
import mokumoku.mobile.domain.mobile.fee.MonthlyFeeCulcService;
import mokumoku.mobile.domain.mobile.fee.TotalFee;
import mokumoku.mobile.domain.user.UserId;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class MonthlyFeeReferService {

    private final MobileContractRepository mobileContractRepository;
    private final MonthlyFeeCulcService monthlyFeeCulcService;

    public TotalFee referTotalMonthlyFee(UserId userId) {

        Option<MobileContract> mobileContract = mobileContractRepository.find(userId);

        return monthlyFeeCulcService.culc(mobileContract);
    }
}