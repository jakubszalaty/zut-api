package android.support.v4.p003c.p004a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0139i.C0137a;

/* renamed from: android.support.v4.c.a.j */
class C0141j extends C0139i {

    /* renamed from: android.support.v4.c.a.j.a */
    private static class C0140a extends C0137a {
        C0140a(C0137a c0137a, Resources resources) {
            super(c0137a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0141j(this, resources);
        }
    }

    C0141j(Drawable drawable) {
        super(drawable);
    }

    C0141j(C0137a c0137a, Resources resources) {
        super(c0137a, resources);
    }

    C0137a m586b() {
        return new C0140a(this.b, null);
    }

    public void jumpToCurrentState() {
        this.c.jumpToCurrentState();
    }
}
