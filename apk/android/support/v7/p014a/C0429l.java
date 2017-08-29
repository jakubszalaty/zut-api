package android.support.v7.p014a;

import android.app.UiModeManager;
import android.content.Context;
import android.support.v7.p014a.C0428k.C0422a;
import android.support.v7.p015b.C0475a.C0474j;
import android.view.ActionMode;
import android.view.Window;
import android.view.Window.Callback;

/* renamed from: android.support.v7.a.l */
class C0429l extends C0428k {
    private final UiModeManager f899t;

    /* renamed from: android.support.v7.a.l.a */
    class C0423a extends C0422a {
        final /* synthetic */ C0429l f868d;

        C0423a(C0429l c0429l, Callback callback) {
            this.f868d = c0429l;
            super(c0429l, callback);
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
            if (this.f868d.m2083o()) {
                switch (i) {
                    case C0474j.View_android_theme /*0*/:
                        return m2009a(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, i);
        }
    }

    C0429l(Context context, Window window, C0397f c0397f) {
        super(context, window, c0397f);
        this.f899t = (UiModeManager) context.getSystemService("uimode");
    }

    Callback m2084a(Callback callback) {
        return new C0423a(this, callback);
    }

    int m2085d(int i) {
        return (i == 0 && this.f899t.getNightMode() == 0) ? -1 : super.m2079d(i);
    }
}
