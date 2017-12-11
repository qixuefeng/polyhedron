package com.qxf.polyhedron.model.executer;

import io.reactivex.Scheduler;

/**
 * 观察者所在线程
 * Created by qixuefeng on 2017/12/11.
 */

public interface PostExecutionThread {
    public Scheduler getScheduler();
}
