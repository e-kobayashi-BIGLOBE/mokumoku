package mokumoku.mobile.domain.mobile.option.voice.answerphone;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContractId;
import mokumoku.mobile.domain.mobile.option.voice.VoiceOptionId;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class AnswerPhoneOption {
    @Getter
    private final AnswerPhoneOptionId answerPhoneOptionId;

    public CancelContainer createCancel(
            MobileContractId mobileContractId,
            VoiceOptionId voiceOptionId
    ) {
        return new CancelContainer(mobileContractId, voiceOptionId, answerPhoneOptionId);
    }
}