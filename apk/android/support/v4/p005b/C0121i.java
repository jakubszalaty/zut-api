package android.support.v4.p005b;

import android.content.Context;
import android.os.Process;
import android.support.v4.p006a.C0045d;

/* renamed from: android.support.v4.b.i */
public final class C0121i {
    public static int m480a(Context context, String str) {
        return C0121i.m481a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static int m481a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String a = C0045d.m95a(str);
        if (a == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return C0045d.m94a(context, a, str2) != 0 ? -2 : 0;
    }
}
