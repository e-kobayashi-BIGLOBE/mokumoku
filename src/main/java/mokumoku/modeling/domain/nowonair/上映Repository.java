package mokumoku.modeling.movie.domain.nowonair;

import javaslang.collection.List;

import java.time.LocalDateTime;

public interface 上映Repository {
    List<上映> find上映一覧(String 劇場ID, LocalDateTime localDateTime);
    List<上映> find上映一覧(LocalDateTime localDateTime);
    List<上映> find上映一覧(String 作品ID);

}
