package com.example.jlgu.activitytest.common;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

public class ActivityCollector {
    public static List<Activity> activityList = new ArrayList<>();

    public static void addActivity(Activity act) {
        activityList.add(act);
    }

    public static void removeActivity(Activity act) {
        activityList.remove(act);
    }

    public static void finishAll() {
        for (Activity activity : activityList){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
