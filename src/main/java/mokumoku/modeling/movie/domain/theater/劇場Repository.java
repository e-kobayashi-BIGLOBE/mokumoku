package mokumoku.modeling.movie.domain.theater;

import java.util.List;

public interface 劇場Repository {

    List<劇場> find劇場一覧();
    劇場 find(String 劇場ID);
}
