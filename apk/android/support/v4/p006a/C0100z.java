package android.support.v4.p006a;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;

/* renamed from: android.support.v4.a.z */
class C0100z {
    public static Intent m435a(Activity activity) {
        return activity.getParentActivityIntent();
    }

    public static String m436a(ActivityInfo activityInfo) {
        return activityInfo.parentActivityName;
    }

    public static boolean m437a(Activity activity, Intent intent) {
        return activity.shouldUpRecreateTask(intent);
    }

    public static void m438b(Activity activity, Intent intent) {
        activity.navigateUpTo(intent);
    }
}
