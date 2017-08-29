package android.support.v4.p007g;

import android.content.Context;
import android.support.v4.p007g.C0303k.C0302a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.LayoutInflater.Factory2;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: android.support.v4.g.l */
class C0305l {
    private static Field f553a;
    private static boolean f554b;

    /* renamed from: android.support.v4.g.l.a */
    static class C0304a extends C0302a implements Factory2 {
        C0304a(C0077n c0077n) {
            super(c0077n);
        }

        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return this.a.m293a(view, str, context, attributeSet);
        }
    }

    static void m1483a(LayoutInflater layoutInflater, C0077n c0077n) {
        Factory2 c0304a = c0077n != null ? new C0304a(c0077n) : null;
        layoutInflater.setFactory2(c0304a);
        Factory factory = layoutInflater.getFactory();
        if (factory instanceof Factory2) {
            C0305l.m1484a(layoutInflater, (Factory2) factory);
        } else {
            C0305l.m1484a(layoutInflater, c0304a);
        }
    }

    static void m1484a(LayoutInflater layoutInflater, Factory2 factory2) {
        if (!f554b) {
            try {
                f553a = LayoutInflater.class.getDeclaredField("mFactory2");
                f553a.setAccessible(true);
            } catch (Throwable e) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 Could not find field 'mFactory2' on class " + LayoutInflater.class.getName() + "; inflation may have unexpected results.", e);
            }
            f554b = true;
        }
        if (f553a != null) {
            try {
                f553a.set(layoutInflater, factory2);
            } catch (Throwable e2) {
                Log.e("LayoutInflaterCompatHC", "forceSetFactory2 could not set the Factory2 on LayoutInflater " + layoutInflater + "; inflation may have unexpected results.", e2);
            }
        }
    }
}
