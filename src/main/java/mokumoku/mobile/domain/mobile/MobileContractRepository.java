package mokumoku.mobile.domain.mobile;

import javaslang.control.Option;
import mokumoku.mobile.domain.user.UserId;

public interface MobileContractRepository {
    
    Option<MobileContract> find(UserId userId);
    void register(UserId userId);

}
