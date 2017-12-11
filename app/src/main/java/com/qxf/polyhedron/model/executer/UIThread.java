package com.qxf.polyhedron.model.executer;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

/**
 * 主线程（UI线程）
 * Created by qixuefeng on 2017/12/11.
 */

public class UIThread implements PostExecutionThread {

    private UIThread() {}

    public static UIThread instance(){
        return Holder.instance;
    }

    private final static class Holder{
        private static final UIThread instance = new UIThread();
    }

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }

}
