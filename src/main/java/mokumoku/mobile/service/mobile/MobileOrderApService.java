package mokumoku.mobile.service.mobile;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import mokumoku.mobile.domain.mobile.MobileContract;
import mokumoku.mobile.domain.mobile.MobileContractRepository;
import mokumoku.mobile.domain.mobile.MobileDomainErrorMessage;
import mokumoku.mobile.domain.mobile.MobileOrderPolicy;
import mokumoku.mobile.domain.user.UserId;
import mokumoku.mobile.domain.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class MobileOrderApService {

    private final MobileContractRepository mobileContractRepository;
    private final MobileOrderPolicy mobileOrderPolicy;

    public Option<MobileDomainErrorMessage> order(UserId userId) {
        Option<MobileContract> mobileContractOption = mobileContractRepository.find(userId);
        Option<MobileDomainErrorMessage> result = mobileOrderPolicy.モバイル回線を申込可能か(mobileContractOption);
        if (result.isDefined()) {
            return Option.of(result.get());
        }
        mobileContractRepository.register(userId);
        return Option.none();
    }
}