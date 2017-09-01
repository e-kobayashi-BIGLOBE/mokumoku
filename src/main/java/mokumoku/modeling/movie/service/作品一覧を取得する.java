package mokumoku.modeling.movie.service;

import javaslang.collection.List;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import mokumoku.modeling.movie.domain.nowonair.上映;
import mokumoku.modeling.movie.domain.nowonair.上映Repository;
import mokumoku.modeling.movie.domain.theater.劇場;
import mokumoku.modeling.movie.domain.作品;
import mokumoku.modeling.movie.domain.作品Repository;

import java.time.LocalDateTime;

@ToString(includeFieldNames = false)
@EqualsAndHashCode(doNotUseGetters = true)
@AllArgsConstructor
public class 作品一覧を取得する {

    private final 上映Repository 上映Repository;
    private final 作品Repository 作品Repository;

    public List<作品> 作品一覧を取得する(
            劇場 劇場
    ) {
        // 劇場から作品のリストを取ってくる
        List<上映> 上映List = 上映Repository.find上映一覧(劇場.get劇場ID(), LocalDateTime.now());
        return 上映List
                .map(v -> 作品Repository.find(v.get作品ID()))
                .toList();
    }

    public List<作品> 作品一覧を取得する() {
        List<上映> 上映List = 上映Repository.find上映一覧(LocalDateTime.now());
        return 上映List
                .map(v -> 作品Repository.find(v.get作品ID()))
                .toList();
    }

}