package mokumoku.mobile.domain.mobile.option.voice.answerphone;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContract;
import mokumoku.mobile.domain.mobile.MobileDomainErrorMessage;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class AnswerPhoneOptionCancelPolicy {

    public Option<MobileDomainErrorMessage> 留守番電話オプションを解約可能か(Option<MobileContract> mobileContractOption) {

        // モバイル回線を契約している会員である前提とする
        if (mobileContractOption.isEmpty()) {
            throw new RuntimeException("モバイル回線を契約していないのに留守番電話オプションを解約しようとしている");
        }

        MobileContract mobileContract = mobileContractOption.get();

        return mobileContract.hasAnswerPhoneOptionContract()
                ? Option.of(MobileDomainErrorMessage.留守番電話オプションを契約していない)
                : Option.none();
    }
}