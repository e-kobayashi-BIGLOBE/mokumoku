package mokumoku.precure.api;

import mokumoku.precure.service.EpisodeApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SamplePrecureApi {

    @Autowired
    private EpisodeApService episodeApService;
    
    @GetMapping(path = "/sample/precure")
    public String invoke() {
        episodeApService.onAir();
        return "result:ok";
    }
}