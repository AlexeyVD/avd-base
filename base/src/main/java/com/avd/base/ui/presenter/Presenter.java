package com.avd.base.ui.presenter;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public interface Presenter<T> {

    void attachView(T view);

    void detachView();
}
