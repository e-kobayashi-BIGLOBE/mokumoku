package mokumoku.modeling.movie.datasource;

import mokumoku.modeling.movie.domain.theater.劇場;
import mokumoku.modeling.movie.domain.theater.劇場Repository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class 劇場RepositoryImpl implements 劇場Repository {


    @Override
    public List<劇場> find劇場一覧() {
        return null;
    }

    @Override
    public 劇場 find(String 劇場ID) {
        return null;
    }
}
