package android.support.v4.p006a;

import android.app.Activity;
import android.os.Build.VERSION;
import android.support.v4.p005b.C0035a;

/* renamed from: android.support.v4.a.a */
public class C0036a extends C0035a {
    public static void m76a(Activity activity) {
        if (VERSION.SDK_INT >= 16) {
            C0042c.m89a(activity);
        } else {
            activity.finish();
        }
    }
}
