package mokumoku.mobile.domain.mobile;

import lombok.ToString;

@ToString(includeFieldNames = false)
public enum MobileDomainErrorMessage {
    既にモバイル回線を申込済み,
    留守番電話オプションを契約していない
}