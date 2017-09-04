package mokumoku.mobile.domain.mobile;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.option.voice.VoiceOption;
import mokumoku.mobile.domain.mobile.option.voice.answerphone.CancelContainer;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class MobileContract {
    private final MobileContractId mobileContractId;
    private final Option<VoiceOption> voiceOptionOption;

    public boolean hasVoiceOptionContract() {
        return voiceOptionOption.isDefined();
    }

    public boolean hasAnswerPhoneOptionContract() {
        return voiceOptionOption.isDefined() && voiceOptionOption.get().hasAnswerPhoneOptionContract();
    }

    public CancelContainer createAnswerPhoneCancel() {
        return voiceOptionOption
                .map(v -> v.createAnswerPhoneCancel(mobileContractId))
                .getOrElseThrow(() -> new RuntimeException("音声オプションの契約がないのに留守番電話オプションの解約が呼ばれた"));
    }
}