package android.support.v7.p014a;

import android.content.Context;
import android.support.v7.p014a.C0426m.C0448d;
import android.support.v7.p014a.C0429l.C0423a;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import android.view.Window.Callback;
import java.util.List;

/* renamed from: android.support.v7.a.i */
class C0430i extends C0429l {

    /* renamed from: android.support.v7.a.i.a */
    class C0424a extends C0423a {
        final /* synthetic */ C0430i f869b;

        C0424a(C0430i c0430i, Callback callback) {
            this.f869b = c0430i;
            super(c0430i, callback);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
            C0448d a = this.f869b.m2028a(0, true);
            if (a == null || a.f935j == null) {
                super.onProvideKeyboardShortcuts(list, menu, i);
            } else {
                super.onProvideKeyboardShortcuts(list, a.f935j, i);
            }
        }
    }

    C0430i(Context context, Window window, C0397f c0397f) {
        super(context, window, c0397f);
    }

    Callback m2086a(Callback callback) {
        return new C0424a(this, callback);
    }
}
