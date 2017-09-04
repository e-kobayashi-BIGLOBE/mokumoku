package mokumoku.mobile.domain.user;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import mokumoku.mobile.domain.mobile.MobileContract;
import mokumoku.mobile.domain.optical.OpticalContract;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class User {
    @Getter
    private final UserId userId;
    private final Option<OpticalContract> opticalContractOption;
    private final Option<MobileContract> mobileContractOption;
}