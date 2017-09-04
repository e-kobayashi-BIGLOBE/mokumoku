package mokumoku.mobile.domain.mobile.option.voice;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContractId;
import mokumoku.mobile.domain.mobile.option.voice.answerphone.AnswerPhoneOption;
import mokumoku.mobile.domain.mobile.option.voice.answerphone.CancelContainer;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class VoiceOption {
    private final VoiceOptionId voiceOptionId;
    private final Option<AnswerPhoneOption> answerPhoneOptionOption;

    public boolean hasAnswerPhoneOptionContract() {
        return answerPhoneOptionOption.isDefined();
    }

    public CancelContainer createAnswerPhoneCancel(MobileContractId mobileContractId) {
        return answerPhoneOptionOption
                .map(v -> v.createCancel(mobileContractId, voiceOptionId))
                .getOrElseThrow(() -> new RuntimeException("留守番電話オプションの契約がないのに留守番電話オプションの解約が呼ばれた"));
    }
}