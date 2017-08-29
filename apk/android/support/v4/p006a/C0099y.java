package android.support.v4.p006a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build.VERSION;
import android.support.v4.p005b.C0118f;
import android.util.Log;

/* renamed from: android.support.v4.a.y */
public final class C0099y {
    private static final C0096a f381a;

    /* renamed from: android.support.v4.a.y.a */
    interface C0096a {
        Intent m416a(Activity activity);

        String m417a(Context context, ActivityInfo activityInfo);

        boolean m418a(Activity activity, Intent intent);

        void m419b(Activity activity, Intent intent);
    }

    /* renamed from: android.support.v4.a.y.b */
    static class C0097b implements C0096a {
        C0097b() {
        }

        public Intent m420a(Activity activity) {
            String b = C0099y.m432b(activity);
            if (b == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, b);
            try {
                return C0099y.m433b((Context) activity, componentName) == null ? C0118f.m466a(componentName) : new Intent().setComponent(componentName);
            } catch (NameNotFoundException e) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + b + "' in manifest");
                return null;
            }
        }

        public String m421a(Context context, ActivityInfo activityInfo) {
            if (activityInfo.metaData == null) {
                return null;
            }
            String string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY");
            return string == null ? null : string.charAt(0) == '.' ? context.getPackageName() + string : string;
        }

        public boolean m422a(Activity activity, Intent intent) {
            String action = activity.getIntent().getAction();
            return (action == null || action.equals("android.intent.action.MAIN")) ? false : true;
        }

        public void m423b(Activity activity, Intent intent) {
            intent.addFlags(67108864);
            activity.startActivity(intent);
            activity.finish();
        }
    }

    /* renamed from: android.support.v4.a.y.c */
    static class C0098c extends C0097b {
        C0098c() {
        }

        public Intent m424a(Activity activity) {
            Intent a = C0100z.m435a(activity);
            return a == null ? m427b(activity) : a;
        }

        public String m425a(Context context, ActivityInfo activityInfo) {
            String a = C0100z.m436a(activityInfo);
            return a == null ? super.m421a(context, activityInfo) : a;
        }

        public boolean m426a(Activity activity, Intent intent) {
            return C0100z.m437a(activity, intent);
        }

        Intent m427b(Activity activity) {
            return super.m420a(activity);
        }

        public void m428b(Activity activity, Intent intent) {
            C0100z.m438b(activity, intent);
        }
    }

    static {
        if (VERSION.SDK_INT >= 16) {
            f381a = new C0098c();
        } else {
            f381a = new C0097b();
        }
    }

    public static Intent m429a(Activity activity) {
        return f381a.m416a(activity);
    }

    public static Intent m430a(Context context, ComponentName componentName) {
        String b = C0099y.m433b(context, componentName);
        if (b == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), b);
        return C0099y.m433b(context, componentName2) == null ? C0118f.m466a(componentName2) : new Intent().setComponent(componentName2);
    }

    public static boolean m431a(Activity activity, Intent intent) {
        return f381a.m418a(activity, intent);
    }

    public static String m432b(Activity activity) {
        try {
            return C0099y.m433b((Context) activity, activity.getComponentName());
        } catch (Throwable e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static String m433b(Context context, ComponentName componentName) {
        return f381a.m417a(context, context.getPackageManager().getActivityInfo(componentName, 128));
    }

    public static void m434b(Activity activity, Intent intent) {
        f381a.m419b(activity, intent);
    }
}
