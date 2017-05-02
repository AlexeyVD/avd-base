package com.avd.base.ui.navigation;

import android.os.Bundle;

/**
 * Created by Aleksey Dementyev on 02.05.2017.
 */

public interface Navigator {
    void openScreen(String screen, Bundle data);
    void replaceScreen(String screen, Bundle data);
}
