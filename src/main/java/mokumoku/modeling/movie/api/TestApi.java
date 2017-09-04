package mokumoku.modeling.movie.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestApi {

    @RequestMapping(value = "/develop/test", method = RequestMethod.GET)
    public Map invoke() {
        java.util.Map<String, String> map = new java.util.HashMap<>();
        map.put("result", "ok");

        return map;
    }
}