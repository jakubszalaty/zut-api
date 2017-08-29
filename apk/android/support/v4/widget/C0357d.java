package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.widget.d */
class C0357d {
    private static Field f679a;
    private static boolean f680b;

    static Drawable m1737a(CompoundButton compoundButton) {
        if (!f680b) {
            try {
                f679a = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f679a.setAccessible(true);
            } catch (Throwable e) {
                Log.i("CompoundButtonCompatGingerbread", "Failed to retrieve mButtonDrawable field", e);
            }
            f680b = true;
        }
        if (f679a != null) {
            try {
                return (Drawable) f679a.get(compoundButton);
            } catch (Throwable e2) {
                Log.i("CompoundButtonCompatGingerbread", "Failed to get button drawable via reflection", e2);
                f679a = null;
            }
        }
        return null;
    }

    static void m1738a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof C0389x) {
            ((C0389x) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    static void m1739a(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof C0389x) {
            ((C0389x) compoundButton).setSupportButtonTintMode(mode);
        }
    }
}
