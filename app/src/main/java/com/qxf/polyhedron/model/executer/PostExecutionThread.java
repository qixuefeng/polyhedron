package com.qxf.polyhedron.model.executer;

import io.reactivex.Scheduler;

/**
 * Created by qixuefeng on 2017/12/11.
 */

public interface PostExecutionThread {
    public Scheduler getScheduler();
}
