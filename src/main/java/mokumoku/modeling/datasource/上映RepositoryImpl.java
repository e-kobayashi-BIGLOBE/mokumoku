package mokumoku.modeling.movie.datasource;


import javaslang.collection.List;
import mokumoku.modeling.movie.domain.nowonair.上映;
import mokumoku.modeling.movie.domain.nowonair.上映Repository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public class 上映RepositoryImpl implements 上映Repository {

    public List<上映> find上映一覧(String 劇場ID, LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public List<上映> find上映一覧(LocalDateTime localDateTime) {
        return null;
    }

    @Override
    public List<上映> find上映一覧(String 作品ID) {
        return null;
    }

}
