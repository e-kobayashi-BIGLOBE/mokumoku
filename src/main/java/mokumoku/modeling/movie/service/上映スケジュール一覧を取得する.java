package mokumoku.modeling.movie.service;

import lombok.AllArgsConstructor;
import mokumoku.modeling.movie.domain.nowonair.上映スケジュール;
import mokumoku.modeling.movie.domain.nowonair.上映スケジュールRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class 上映スケジュール一覧を取得する {

    private final 上映スケジュールRepository 上映スケジュールRepository;

    public List<上映スケジュール> 上映スケジュール一覧を取得する(
            String 劇場ID,
            String 作品ID
    ) {
        // 上映スケジュールを選ぶ
        // 上映スケジュールの一覧を取得する
        return 上映スケジュールRepository.find上映スケジュール一覧(劇場ID, 作品ID);
    }

}