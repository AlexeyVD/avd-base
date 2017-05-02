package com.avd.base.ui.navigation;

import android.os.Bundle;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public class RouterImpl implements Router {

    private NavigatorHolder mNavigatorHolder;

    public RouterImpl(NavigatorHolder navigatorHolder) {
        this.mNavigatorHolder = navigatorHolder;
    }

    @Override
    public void openScreen(String screen) {
        openScreen(screen, null);
    }

    @Override
    public void openScreen(String screen, Bundle data) {
        Navigator navigator = mNavigatorHolder.getNavigator();

        if (navigator != null) {
            navigator.openScreen(screen, data);
        }
    }

    @Override
    public void replaceScreen(String screen) {
        replaceScreen(screen, null);
    }

    @Override
    public void replaceScreen(String screen, Bundle data) {
        Navigator navigator = mNavigatorHolder.getNavigator();

        if (navigator != null) {
            navigator.replaceScreen(screen, data);
        }
    }
}
