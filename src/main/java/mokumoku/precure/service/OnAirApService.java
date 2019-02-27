package mokumoku.precure.service;

import mokumoku.precure.domain.OnAirService;
import mokumoku.precure.domain.hugtto_precure.HUGっとプリキュア;
import mokumoku.precure.domain.hugtto_precure.cure_amour.ルールー_アムール;
import mokumoku.precure.domain.hugtto_precure.cure_ange.薬師寺さあや;
import mokumoku.precure.domain.hugtto_precure.cure_etoile.輝木ほまれ;
import mokumoku.precure.domain.hugtto_precure.cure_macherie.愛崎えみる;
import mokumoku.precure.domain.hugtto_precure.cure_yell.野乃はな;
import mokumoku.precure.domain.hugtto_precure.kuraiasu_sya.社員;
import org.springframework.stereotype.Service;

/**
 * APサービス
 */
@Service
public class OnAirApService {

    public void onAir() {
        PrecureRepository precureRepository = new PrecureRepository();

        // プリキュアを取得
        HUGっとプリキュア hugpre = precureRepository.getHugPre();

        // クライアス社の社員
        社員 employee = new 社員();

        // ドメインサービスへ
        OnAirService onAirService = new OnAirService();
        onAirService.onAir(hugpre, employee);

    }

    // datasource
    // stub
    class PrecureRepository {
        HUGっとプリキュア getHugPre() {
            return new HUGっとプリキュア(
                    new 野乃はな(),
                    new 薬師寺さあや(),
                    new 輝木ほまれ(),
                    new 愛崎えみる(),
                    new ルールー_アムール()
            );
        }
    }
}