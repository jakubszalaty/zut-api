package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.support.v4.p007g.C0286e.C0285b;
import android.support.v4.p009d.p010a.C0148b;
import android.support.v7.view.menu.C0523k.C0519a;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

@TargetApi(16)
/* renamed from: android.support.v7.view.menu.l */
class C0525l extends C0523k {

    /* renamed from: android.support.v7.view.menu.l.a */
    class C0524a extends C0519a implements VisibilityListener {
        C0285b f1275c;
        final /* synthetic */ C0525l f1276d;

        public C0524a(C0525l c0525l, Context context, ActionProvider actionProvider) {
            this.f1276d = c0525l;
            super(c0525l, context, actionProvider);
        }

        public View m2549a(MenuItem menuItem) {
            return this.a.onCreateActionView(menuItem);
        }

        public void m2550a(C0285b c0285b) {
            VisibilityListener visibilityListener;
            this.f1275c = c0285b;
            ActionProvider actionProvider = this.a;
            if (c0285b == null) {
                visibilityListener = null;
            }
            actionProvider.setVisibilityListener(visibilityListener);
        }

        public boolean m2551b() {
            return this.a.overridesItemVisibility();
        }

        public boolean m2552c() {
            return this.a.isVisible();
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            if (this.f1275c != null) {
                this.f1275c.m1451a(z);
            }
        }
    }

    C0525l(Context context, C0148b c0148b) {
        super(context, c0148b);
    }

    C0519a m2553a(ActionProvider actionProvider) {
        return new C0524a(this, this.a, actionProvider);
    }
}
