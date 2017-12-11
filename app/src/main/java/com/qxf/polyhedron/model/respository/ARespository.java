package com.qxf.polyhedron.model.respository;

import com.qxf.polyhedron.constants.NetConstants;
import com.qxf.polyhedron.model.entity.Entity1;
import com.qxf.polyhedron.model.entity.Entity2;
import com.qxf.polyhedron.model.entity.Entity3;
import com.qxf.polyhedron.model.interfaces.IRespository;
import com.qxf.polyhedron.model.interfaces.IService;
import com.qxf.polyhedron.model.net.RetrofitService;

import io.reactivex.Observable;

/**
 * Created by qixuefeng on 2017/12/11.
 */

public class ARespository implements IRespository {

    private static ARespository Instance = null;

    public static ARespository getInstance() {
        if (Instance == null) {
            Instance = new ARespository();
        }
        return Instance;
    }

    @Override
    public Observable<Entity1> getEntity1() {
        IService api = RetrofitService.getInstance().createApi(IService.class);
        return api.getEntity1(NetConstants.key);
    }

    @Override
    public Observable<Entity2> getEntity2(String param1, String param2) {
        IService api = RetrofitService.getInstance().createApi(IService.class);
        return api.getEntity2(NetConstants.key, param1, param2);
    }

    @Override
    public Observable<Entity3> getEntity3(String param1) {
        IService api = RetrofitService.getInstance().createApi(IService.class);
        return api.getEntity3(param1);
    }
}
