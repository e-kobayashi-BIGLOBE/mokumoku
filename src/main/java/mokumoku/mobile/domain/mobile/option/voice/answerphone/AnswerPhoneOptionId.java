package mokumoku.mobile.domain.mobile.option.voice.answerphone;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class AnswerPhoneOptionId {
    private final String value;
}