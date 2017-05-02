package com.avd.base.ui.view;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.avd.base.ui.navigation.Navigator;
import com.avd.base.ui.navigation.NavigatorHolder;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public abstract class NavigationActivity extends BaseActivity {

    private Navigator mNavigator;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNavigator = getNavigator();
    }

    @Override
    protected void onResume() {
        super.onResume();
        getNavigatorHolder().setNavigator(mNavigator);
    }

    @Override
    protected void onPause() {
        super.onPause();
        getNavigatorHolder().removeNavigator();
    }

    protected abstract @NonNull NavigatorHolder getNavigatorHolder();

    protected abstract @NonNull Navigator getNavigator();
}
