package com.avd.base.ui.navigation;

import android.os.Bundle;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public interface Router {

    void openScreen(String screen);

    void openScreen(String screen, Bundle data);

    void replaceScreen(String screen);

    void replaceScreen(String screen, Bundle data);
}
