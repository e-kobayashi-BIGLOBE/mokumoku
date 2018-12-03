package mokumoku.precure;

import mokumoku.precure.service.EpisodeApService;

public class Main {
    public static void main(String[] args) {

        EpisodeApService episodeApService = new EpisodeApService();
        episodeApService.onAir();
    }
}