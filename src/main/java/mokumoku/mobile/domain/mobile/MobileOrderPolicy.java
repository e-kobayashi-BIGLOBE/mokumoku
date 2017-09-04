package mokumoku.mobile.domain.mobile;

import javaslang.control.Option;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class MobileOrderPolicy {

    public Option<MobileDomainErrorMessage> モバイル回線を申込可能か(Option<MobileContract> mobileContractOption) {

        return mobileContractOption.isDefined() 
                ? Option.of(MobileDomainErrorMessage.既にモバイル回線を申込済み)
                : Option.none();
    }
}