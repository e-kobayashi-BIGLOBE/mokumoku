package mokumoku.mobile.domain.mobile.option.voice.answerphone;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContract;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class AnswerPhoneOptionCancelService {

    public CancelContainer cancel(Option<MobileContract> mobileContractOption) {

        // 留守番電話オプションを契約している会員である前提とする
        if (mobileContractOption.map(MobileContract::hasAnswerPhoneOptionContract).isEmpty()) {
            throw new RuntimeException("留守番電話オプションを契約していないのに留守番電話オプションを解約しようとしている");
        }

        MobileContract mobileContract = mobileContractOption.get();

        return mobileContract.createAnswerPhoneCancel();
    }
}