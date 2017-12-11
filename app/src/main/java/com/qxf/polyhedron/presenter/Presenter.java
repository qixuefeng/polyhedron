package com.qxf.polyhedron.presenter;

import android.content.Context;

import com.qxf.polyhedron.model.executer.JobExecutor;
import com.qxf.polyhedron.model.executer.RxJavaExecuter;
import com.qxf.polyhedron.model.executer.UIThread;

/**
 * Created by qixuefeng on 2017/12/11.
 */

public abstract class Presenter<T> {

    protected Context context;
    protected RxJavaExecuter<T> rxJavaExecuter;

    public Presenter(Context context) {
        this.context = context;
        this.rxJavaExecuter = new RxJavaExecuter<>(JobExecutor.instance(), UIThread.instance());
    }

    public abstract void destory();

}
