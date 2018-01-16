package xr.com.contorller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import xr.com.service.FoodService;

@Controller
@RequestMapping("/Food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping("/getFoodtitle")
    public ModelAndView hello(ModelAndView mv,@RequestParam String id){
        String name=foodService.getTitle(id);
        mv.addObject("title",name);
        mv.setViewName("foodname");
        return mv;
    }
}
