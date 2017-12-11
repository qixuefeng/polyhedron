package com.qxf.polyhedron.model.executer;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.schedulers.Schedulers;

/**
 * rxjava执行操作
 * Created by qixuefeng on 2017/12/11.
 */

public class RxJavaExecuter<T> {

    /**
     * 被观察者运行所在线程
     */
    private ThreadExecutor threadExecutor;

    /**
     * 观察者运行所在线程
     */
    private PostExecutionThread postExecutionThread;

    /**
     * 构造方法
     *
     * @param threadExecutor 被观察者运行所在线程
     * @param postExecutionThread 观察者运行所在线程
     */
    public RxJavaExecuter(ThreadExecutor threadExecutor, PostExecutionThread postExecutionThread) {
        this.threadExecutor = threadExecutor;
        this.postExecutionThread = postExecutionThread;
    }

    /**
     * 开始执行事件
     *
     * @param observable 被观察者
     * @param observer 观察者
     */
    public void execute(Observable<T> observable, Observer<T> observer) {

        observable
                .subscribeOn(Schedulers.from(threadExecutor))
                .observeOn(postExecutionThread.getScheduler())
                .subscribe(observer);

    }
}
