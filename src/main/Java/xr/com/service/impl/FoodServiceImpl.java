package xr.com.service.impl;
 import xr.com.dao.FoodDao;
 import xr.com.service.FoodService;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;

@Service("foodService")
public class FoodServiceImpl implements FoodService {
    @Autowired
    FoodDao foodDao;

    public String getTitle(String  id) {
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@"+id);
        return foodDao.queryById(id);
    }


}
