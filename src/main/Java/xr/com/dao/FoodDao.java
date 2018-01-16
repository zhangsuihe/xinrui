package xr.com.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface FoodDao {
    String queryById(String id);
}
