
package mokumoku.mobile.service.mobile.option;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import mokumoku.mobile.domain.mobile.MobileContract;
import mokumoku.mobile.domain.mobile.MobileContractRepository;
import mokumoku.mobile.domain.mobile.MobileDomainErrorMessage;
import mokumoku.mobile.domain.mobile.option.voice.OptionRepository;
import mokumoku.mobile.domain.mobile.option.voice.answerphone.AnswerPhoneOptionCancelService;
import mokumoku.mobile.domain.mobile.option.voice.answerphone.CancelContainer;
import mokumoku.mobile.domain.user.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AnswerPhoneOptionCancelApService {

    private final MobileContractRepository mobileContractRepository;
    private final AnswerPhoneOptionCancelService answerPhoneOptionCancelService;
    private final OptionRepository optionRepository;

    public Option<MobileDomainErrorMessage> cancelable(UserId userId) {
        Option<MobileContract> mobileContractOption = mobileContractRepository.find(userId);

        // 留守番電話オプションを解約するために必要になる項目を取得する
        CancelContainer cancelContainer = answerPhoneOptionCancelService.cancel(mobileContractOption);

        optionRepository.cancelAnswerPhoneOption(cancelContainer);

        return Option.none();
    }
}