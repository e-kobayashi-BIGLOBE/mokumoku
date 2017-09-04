package mokumoku.mobile.domain.mobile.option.voice;

import mokumoku.mobile.domain.mobile.option.voice.answerphone.CancelContainer;

public interface OptionRepository {

    void cancelAnswerPhoneOption(CancelContainer cancelContainer);
}