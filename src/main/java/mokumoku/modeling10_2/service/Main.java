package mokumoku.modeling10_2.service;

import mokumoku.modeling10_2.domain.light.*;

public class Main {
    public static void main(String[] args) {
        // ライト初期設定: 消灯（明るさは全灯）
        ライト ライト = new ライト(ライト電源.OFF, ライト明るさ.全灯);
        System.out.println(ライト.get_ライト電源().getLabel());
        System.out.println(ライト.get_ライト明るさ().getLabel());

        // リモコンでつける
        点灯 点灯イベント1 = new 点灯(ライト明るさ.標準);
        ライト 変更後ライト1 = ライト.ライトを点灯する(点灯イベント1);
        System.out.println(変更後ライト1.get_ライト電源().getLabel());
        System.out.println(変更後ライト1.get_ライト明るさ().getLabel());

        // スイッチで消す
        消灯 消灯イベント1 = new 消灯();
        ライト 変更後ライト2 = 変更後ライト1.ライトを消灯する(消灯イベント1);
        System.out.println(変更後ライト2.get_ライト電源().getLabel());
        System.out.println(変更後ライト2.get_ライト明るさ().getLabel());

    }
}