package android.support.v4.p007g;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory;
import android.view.View;

/* renamed from: android.support.v4.g.k */
class C0303k {

    /* renamed from: android.support.v4.g.k.a */
    static class C0302a implements Factory {
        final C0077n f552a;

        C0302a(C0077n c0077n) {
            this.f552a = c0077n;
        }

        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            return this.f552a.m293a(null, str, context, attributeSet);
        }

        public String toString() {
            return getClass().getName() + "{" + this.f552a + "}";
        }
    }

    static C0077n m1481a(LayoutInflater layoutInflater) {
        Factory factory = layoutInflater.getFactory();
        return factory instanceof C0302a ? ((C0302a) factory).f552a : null;
    }

    static void m1482a(LayoutInflater layoutInflater, C0077n c0077n) {
        layoutInflater.setFactory(c0077n != null ? new C0302a(c0077n) : null);
    }
}
