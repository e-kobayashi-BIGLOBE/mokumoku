package mokumoku.modeling.movie.domain.nowonair;

import java.util.List;

public interface 上映スケジュールRepository {

    List<上映スケジュール> find上映スケジュール一覧(
            String 劇場ID,
            String 作品ID
    );
}
