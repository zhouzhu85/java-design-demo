package com.state;

/**
 * 抽象状态类
 */
public abstract class State {
    /**
     * 对请求做处理
     * @param context
     */
    public abstract void handle(Context context);
}
