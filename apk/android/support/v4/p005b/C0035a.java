package android.support.v4.p005b;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.TypedValue;

/* renamed from: android.support.v4.b.a */
public class C0035a {
    private static final Object f129a;
    private static TypedValue f130b;

    static {
        f129a = new Object();
    }

    public static final Drawable m73a(Context context, int i) {
        int i2 = VERSION.SDK_INT;
        if (i2 >= 21) {
            return C0110b.m459a(context, i);
        }
        if (i2 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f129a) {
            if (f130b == null) {
                f130b = new TypedValue();
            }
            context.getResources().getValue(i, f130b, true);
            i2 = f130b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    public static boolean m74a(Context context, Intent[] intentArr, Bundle bundle) {
        int i = VERSION.SDK_INT;
        if (i >= 16) {
            C0113e.m462a(context, intentArr, bundle);
            return true;
        } else if (i < 11) {
            return false;
        } else {
            C0112d.m461a(context, intentArr);
            return true;
        }
    }

    public static final ColorStateList m75b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? C0111c.m460a(context, i) : context.getResources().getColorStateList(i);
    }
}
