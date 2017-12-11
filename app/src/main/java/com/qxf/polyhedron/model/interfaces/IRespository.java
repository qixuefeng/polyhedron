package com.qxf.polyhedron.model.interfaces;

import com.qxf.polyhedron.model.entity.Entity1;
import com.qxf.polyhedron.model.entity.Entity2;
import com.qxf.polyhedron.model.entity.Entity3;

import io.reactivex.Observable;

/**
 * Created by qixuefeng on 2017/12/11.
 */

public interface IRespository {

    Observable<Entity1> getEntity1();

    Observable<Entity2> getEntity2(String param1, String param2);

    Observable<Entity3> getEntity3(String param1);

}
