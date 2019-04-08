package mokumoku.modeling.service;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.modeling.movie.domain.nowonair.上映スケジュールRepository;
import mokumoku.modeling.movie.domain.theater.スクリーン;
import mokumoku.modeling.movie.domain.theater.劇場;
import mokumoku.modeling.movie.domain.theater.劇場Repository;
import mokumoku.modeling.movie.domain.theater.座席表;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 座席表を取得する {

    private final 上映スケジュールRepository 上映スケジュールRepository;
    private final 劇場Repository 劇場Repository;

    public 座席表 座席表を取得する(
            String 劇場ID,
            int スクリーン番号
    ) {
        // 劇場
        劇場 劇場 = 劇場Repository.find(劇場ID);

        // スクリーン
        スクリーン スクリーン = 劇場.getスクリーン(スクリーン番号);

        return スクリーン.get座席表();
    }

}