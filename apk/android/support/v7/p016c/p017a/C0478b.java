package android.support.v7.p016c.p017a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.p005b.C0035a;
import android.support.v7.widget.C0610l;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.c.a.b */
public final class C0478b {
    private static final ThreadLocal<TypedValue> f1025a;
    private static final WeakHashMap<Context, SparseArray<C0477a>> f1026b;
    private static final Object f1027c;

    /* renamed from: android.support.v7.c.a.b.a */
    private static class C0477a {
        final ColorStateList f1023a;
        final Configuration f1024b;

        C0477a(ColorStateList colorStateList, Configuration configuration) {
            this.f1023a = colorStateList;
            this.f1024b = configuration;
        }
    }

    static {
        f1025a = new ThreadLocal();
        f1026b = new WeakHashMap(0);
        f1027c = new Object();
    }

    public static ColorStateList m2243a(Context context, int i) {
        if (VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        ColorStateList d = C0478b.m2248d(context, i);
        if (d != null) {
            return d;
        }
        d = C0478b.m2247c(context, i);
        if (d == null) {
            return C0035a.m75b(context, i);
        }
        C0478b.m2245a(context, i, d);
        return d;
    }

    private static TypedValue m2244a() {
        TypedValue typedValue = (TypedValue) f1025a.get();
        if (typedValue != null) {
            return typedValue;
        }
        typedValue = new TypedValue();
        f1025a.set(typedValue);
        return typedValue;
    }

    private static void m2245a(Context context, int i, ColorStateList colorStateList) {
        synchronized (f1027c) {
            SparseArray sparseArray = (SparseArray) f1026b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f1026b.put(context, sparseArray);
            }
            sparseArray.append(i, new C0477a(colorStateList, context.getResources().getConfiguration()));
        }
    }

    public static Drawable m2246b(Context context, int i) {
        return C0610l.m3109a().m3127a(context, i);
    }

    private static ColorStateList m2247c(Context context, int i) {
        ColorStateList colorStateList = null;
        if (!C0478b.m2249e(context, i)) {
            Resources resources = context.getResources();
            try {
                colorStateList = C0476a.m2239a(resources, resources.getXml(i), context.getTheme());
            } catch (Throwable e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        return colorStateList;
    }

    private static ColorStateList m2248d(Context context, int i) {
        synchronized (f1027c) {
            SparseArray sparseArray = (SparseArray) f1026b.get(context);
            if (sparseArray != null && sparseArray.size() > 0) {
                C0477a c0477a = (C0477a) sparseArray.get(i);
                if (c0477a != null) {
                    if (c0477a.f1024b.equals(context.getResources().getConfiguration())) {
                        ColorStateList colorStateList = c0477a.f1023a;
                        return colorStateList;
                    }
                    sparseArray.remove(i);
                }
            }
            return null;
        }
    }

    private static boolean m2249e(Context context, int i) {
        Resources resources = context.getResources();
        TypedValue a = C0478b.m2244a();
        resources.getValue(i, a, true);
        return a.type >= 28 && a.type <= 31;
    }
}
