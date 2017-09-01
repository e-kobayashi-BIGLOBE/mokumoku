package mokumoku.modeling.movie.service;

import lombok.AllArgsConstructor;
import mokumoku.modeling.movie.domain.nowonair.上映;
import mokumoku.modeling.movie.domain.nowonair.上映Repository;
import mokumoku.modeling.movie.domain.theater.劇場;
import mokumoku.modeling.movie.domain.theater.劇場Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class 劇場一覧を取得する {

    private 劇場Repository 劇場Repository;
    private 上映Repository 上映Repository;

    public List<劇場> 劇場一覧を取得する() {
        return 劇場Repository.find劇場一覧();
    }

    public javaslang.collection.List<劇場> 劇場一覧を取得する(
            String 作品ID
    ) {
        return 上映Repository.find上映一覧(作品ID)
                .map(v -> 劇場Repository.find(v.get劇場ID()))
                .toList();
    }

}