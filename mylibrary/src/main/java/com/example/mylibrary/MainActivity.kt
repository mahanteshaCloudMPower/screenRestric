package com.example.mylibrary

import android.app.Activity
import android.view.WindowManager
class MainActivity {
  public  fun screen(activity: Activity){

      activity.window.setFlags(
            WindowManager.LayoutParams.FLAG_SECURE,
            WindowManager.LayoutParams.FLAG_SECURE
        )
    }

}