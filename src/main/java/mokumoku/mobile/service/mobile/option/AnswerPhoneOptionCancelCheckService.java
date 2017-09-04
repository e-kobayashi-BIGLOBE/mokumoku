
package mokumoku.mobile.service.mobile.option;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import mokumoku.mobile.domain.mobile.MobileContract;
import mokumoku.mobile.domain.mobile.MobileContractRepository;
import mokumoku.mobile.domain.mobile.MobileDomainErrorMessage;
import mokumoku.mobile.domain.mobile.option.voice.answerphone.AnswerPhoneOptionCancelPolicy;
import mokumoku.mobile.domain.user.UserId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class AnswerPhoneOptionCancelCheckService {

    private final MobileContractRepository mobileContractRepository;
    private final AnswerPhoneOptionCancelPolicy answerPhoneOptionCancelPolicy;

    public Option<MobileDomainErrorMessage> cancelable(UserId userId) {
        Option<MobileContract> mobileContractOption = mobileContractRepository.find(userId);

        // 会員が留守番電話オプションの契約をしていれば、解約することができる
        Option<MobileDomainErrorMessage> result = answerPhoneOptionCancelPolicy.留守番電話オプションを解約可能か(mobileContractOption);

        return Option.of(result.get()).orElse(Option.none());
    }
}