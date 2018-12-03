package mokumoku.modeling9.domain.reserve;

import mokumoku.modeling9.domain.room.会議室;

public interface 予約Repository {
    予約リスト find(会議室 _会議室);

    void save(予約 _予約);
}
