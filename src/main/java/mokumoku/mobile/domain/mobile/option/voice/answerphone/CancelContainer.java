package mokumoku.mobile.domain.mobile.option.voice.answerphone;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContractId;
import mokumoku.mobile.domain.mobile.option.voice.VoiceOptionId;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class CancelContainer {
    private final MobileContractId mobileContractId;
    private final VoiceOptionId voiceOptionId;
    private final AnswerPhoneOptionId answerPhoneOptionId;
}