package mokumoku.mobile.domain.mobile.fee;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContract;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class MonthlyFeeCulcService {

    public TotalFee culc(Option<MobileContract> mobileContractOption) {
        MobileContract mobileContract = mobileContractOption
                .getOrElseThrow(() -> new RuntimeException("モバイル回線契約がないのに月額料金参照を呼んでいる"));

        MonthlyFee monthlyFee = new MonthlyFee(
                Fee.モバイル回線,
                mobileContract.hasVoiceOptionContract()
                        ? Option.of(Fee.音声オプション)
                        : Option.none(),
                mobileContract.hasAnswerPhoneOptionContract()
                        ? Option.of(Fee.留守番電話オプション)
                        : Option.none()
        );
        
        return monthlyFee.getTotalFee();
    }

}