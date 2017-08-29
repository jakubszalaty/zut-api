package android.support.v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0136h;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p018d.p019a.C0480a;

public class ad {
    public static final Rect f1556a;
    private static Class<?> f1557b;

    static {
        f1556a = new Rect();
        if (VERSION.SDK_INT >= 18) {
            try {
                f1557b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException e) {
            }
        }
    }

    static Mode m2837a(int i, Mode mode) {
        switch (i) {
            case C0474j.View_paddingEnd /*3*/:
                return Mode.SRC_OVER;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                return Mode.SRC_IN;
            case C0474j.Toolbar_contentInsetStartWithNavigation /*9*/:
                return Mode.SRC_ATOP;
            case C0474j.Toolbar_titleMargin /*14*/:
                return Mode.MULTIPLY;
            case C0474j.Toolbar_titleMarginStart /*15*/:
                return Mode.SCREEN;
            case C0474j.Toolbar_titleMarginEnd /*16*/:
                return VERSION.SDK_INT >= 11 ? Mode.valueOf("ADD") : mode;
            default:
                return mode;
        }
    }

    static void m2838a(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m2840c(drawable);
        }
    }

    public static boolean m2839b(Drawable drawable) {
        if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
            return false;
        }
        if (VERSION.SDK_INT < 17 && (drawable instanceof LayerDrawable)) {
            return false;
        }
        if (drawable instanceof DrawableContainer) {
            ConstantState constantState = drawable.getConstantState();
            if (constantState instanceof DrawableContainerState) {
                for (Drawable b : ((DrawableContainerState) constantState).getChildren()) {
                    if (!m2839b(b)) {
                        return false;
                    }
                }
            }
        } else if (drawable instanceof C0136h) {
            return m2839b(((C0136h) drawable).m576a());
        } else {
            if (drawable instanceof C0480a) {
                return m2839b(((C0480a) drawable).m2253a());
            }
            if (drawable instanceof ScaleDrawable) {
                return m2839b(((ScaleDrawable) drawable).getDrawable());
            }
        }
        return true;
    }

    private static void m2840c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(aq.f1675e);
        } else {
            drawable.setState(aq.f1678h);
        }
        drawable.setState(state);
    }
}
