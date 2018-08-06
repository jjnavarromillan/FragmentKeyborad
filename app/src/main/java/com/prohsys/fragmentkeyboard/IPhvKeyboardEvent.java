package com.prohsys.fragmentkeyboard;

import android.app.Activity;
import android.app.Fragment;

public interface IPhvKeyboardEvent {
    void SetActivity(Activity activity);
    void KeyEvent(String value);
}
