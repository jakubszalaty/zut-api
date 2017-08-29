package android.support.v4.p003c.p004a;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.c.a.e */
class C0133e {
    private static Method f393a;
    private static boolean f394b;
    private static Method f395c;
    private static boolean f396d;

    public static int m560a(Drawable drawable) {
        if (!f396d) {
            try {
                f395c = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                f395c.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve getLayoutDirection() method", e);
            }
            f396d = true;
        }
        if (f395c != null) {
            try {
                return ((Integer) f395c.invoke(drawable, new Object[0])).intValue();
            } catch (Throwable e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke getLayoutDirection() via reflection", e2);
                f395c = null;
            }
        }
        return -1;
    }

    public static boolean m561a(Drawable drawable, int i) {
        if (!f394b) {
            try {
                f393a = Drawable.class.getDeclaredMethod("setLayoutDirection", new Class[]{Integer.TYPE});
                f393a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to retrieve setLayoutDirection(int) method", e);
            }
            f394b = true;
        }
        if (f393a != null) {
            try {
                f393a.invoke(drawable, new Object[]{Integer.valueOf(i)});
                return true;
            } catch (Throwable e2) {
                Log.i("DrawableCompatJellybeanMr1", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                f393a = null;
            }
        }
        return false;
    }
}
