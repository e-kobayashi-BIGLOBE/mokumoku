package mokumoku.precure;

import mokumoku.precure.service.OnAirApService;

public class Main {
    public static void main(String[] args) {

        OnAirApService onAirApService = new OnAirApService();
        onAirApService.onAir();
    }
}