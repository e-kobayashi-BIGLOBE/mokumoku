package mokumoku.mobile.domain.mobile.fee;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString(includeFieldNames = false)
@AllArgsConstructor
public enum Fee {
    // モバイル回線は1500円、音声オプションは700円、留守番電話オプションは200円
    モバイル回線(1500),
    音声オプション(700),
    留守番電話オプション(200);

    @Getter
    private final int fee;
}