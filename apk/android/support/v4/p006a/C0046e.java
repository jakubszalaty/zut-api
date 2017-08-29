package android.support.v4.p006a;

import android.app.AppOpsManager;
import android.content.Context;

/* renamed from: android.support.v4.a.e */
class C0046e {
    public static int m96a(Context context, String str, String str2) {
        return ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(str, str2);
    }

    public static String m97a(String str) {
        return AppOpsManager.permissionToOp(str);
    }
}
