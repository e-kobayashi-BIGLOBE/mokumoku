package mokumoku.precure.api;

import mokumoku.precure.service.OnAirApService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SamplePrecureApi {

    @Autowired
    private OnAirApService onAirApService;
    
    @GetMapping(path = "/sample/precure")
    public String invoke() {
        onAirApService.onAir();
        return "result:ok";
    }
}