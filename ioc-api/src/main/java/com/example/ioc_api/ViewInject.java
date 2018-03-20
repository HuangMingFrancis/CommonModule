package com.example.ioc_api;

/**
 * Created by Francis on 2018/3/17.
 */

public interface ViewInject<T>
{
    void inject(T t, Object source);
}