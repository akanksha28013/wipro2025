package com.wipro.restapidemo.service1;

import java.util.List;
import com.wipro.restapidemo.dto.Mobile;

public interface MobileService {
	Mobile createMobile(Mobile mobile);
    Mobile getMobileById(Integer id);
    List<Mobile> getAllMobiles();
    Mobile updateMobile(Integer id, Mobile mobile);
    String deleteMobile(Integer id);
}
