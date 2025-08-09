package com.wipro.restapidemo.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Repository;

import com.wipro.restapidemo.dto.Mobile;

@Repository
public class MobileRepo {
	private List<Mobile> mobileList = new CopyOnWriteArrayList<>();

    public boolean save(Mobile mobile) {
        return mobileList.addAll(mobileList);
    }

    public List<Mobile> findAll() {
        return mobileList;
    }

    public Mobile findById(Integer id) {
        return mobileList.stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void update(Mobile mobile) {
        for (int i = 0; i < mobileList.size(); i++) {
            if (mobileList.get(i).getId().equals(mobile.getId())) {
                mobileList.set(i, mobile);
                return;
            }
        }
    }

    public boolean delete(Integer id) {
        return mobileList.removeIf(m -> m.getId().equals(id));
    }
}
