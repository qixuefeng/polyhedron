package com.qxf.polyhedron.model.interfaces;

import com.qxf.polyhedron.constants.NetConstants;
import com.qxf.polyhedron.model.entity.Entity1;
import com.qxf.polyhedron.model.entity.Entity2;
import com.qxf.polyhedron.model.entity.Entity3;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * api请求接口
 * Created by qixuefeng on 2017/12/11.
 */

public interface IService {

    /**
     * 获取entity1
     * @param param1 参数1
     * @return 含有entity1实体的被观察者对象
     */
    @GET(NetConstants.A_service_query1)
    Observable<Entity1> getEntity1(
            @Query(NetConstants.A_parameter_1) String param1
    );

    /**
     * 获取entity2
     * @param param1 参数1
     * @param param2 参数2
     * @param param3 参数3
     * @return 含有entity2实体的被观察者对象
     */
    @GET(NetConstants.A_service_query2)
    Observable<Entity2> getEntity2(
            @Query(NetConstants.A_parameter_1) String param1,
            @Query(NetConstants.A_parameter_2) String param2,
            @Query(NetConstants.A_parameter_3) String param3
    );

    /**
     * 获取entity3
     * @param param1 参数1
     * @return 含有entity3实体的被观察者对象
     */
    @GET(NetConstants.A_service_query3)
    Observable<Entity3> getEntity3(
            @Query(NetConstants.A_parameter_1) String param1
    );

}
