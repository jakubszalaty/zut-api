package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v4.p003c.C0146a;
import android.util.TypedValue;

class aq {
    static final int[] f1671a;
    static final int[] f1672b;
    static final int[] f1673c;
    static final int[] f1674d;
    static final int[] f1675e;
    static final int[] f1676f;
    static final int[] f1677g;
    static final int[] f1678h;
    private static final ThreadLocal<TypedValue> f1679i;
    private static final int[] f1680j;

    static {
        f1679i = new ThreadLocal();
        f1671a = new int[]{-16842910};
        f1672b = new int[]{16842908};
        f1673c = new int[]{16843518};
        f1674d = new int[]{16842919};
        f1675e = new int[]{16842912};
        f1676f = new int[]{16842913};
        f1677g = new int[]{-16842919, -16842908};
        f1678h = new int[0];
        f1680j = new int[1];
    }

    public static int m2935a(Context context, int i) {
        f1680j[0] = i;
        av a = av.m2946a(context, null, f1680j);
        try {
            int b = a.m2953b(0, 0);
            return b;
        } finally {
            a.m2951a();
        }
    }

    static int m2936a(Context context, int i, float f) {
        int a = m2935a(context, i);
        return C0146a.m592b(a, Math.round(((float) Color.alpha(a)) * f));
    }

    private static TypedValue m2937a() {
        TypedValue typedValue = (TypedValue) f1679i.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f1679i.set(typedValue);
        return typedValue;
    }

    public static ColorStateList m2938b(Context context, int i) {
        f1680j[0] = i;
        av a = av.m2946a(context, null, f1680j);
        try {
            ColorStateList e = a.m2960e(0);
            return e;
        } finally {
            a.m2951a();
        }
    }

    public static int m2939c(Context context, int i) {
        ColorStateList b = m2938b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f1671a, b.getDefaultColor());
        }
        TypedValue a = m2937a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m2936a(context, i, a.getFloat());
    }
}
