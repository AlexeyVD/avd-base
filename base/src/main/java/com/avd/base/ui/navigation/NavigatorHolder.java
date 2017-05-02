package com.avd.base.ui.navigation;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public class NavigatorHolder {

    Navigator mNavigator;

    public void setNavigator(Navigator navigator) {
        mNavigator = navigator;
    }

    public void removeNavigator() {
        mNavigator = null;
    }

    public Navigator getNavigator() {
        return mNavigator;
    }
}
