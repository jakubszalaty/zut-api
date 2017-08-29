package android.support.v4.p003c.p004a;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p003c.p004a.C0139i.C0137a;

/* renamed from: android.support.v4.c.a.k */
class C0143k extends C0141j {

    /* renamed from: android.support.v4.c.a.k.a */
    private static class C0142a extends C0137a {
        C0142a(C0137a c0137a, Resources resources) {
            super(c0137a, resources);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0143k(this, resources);
        }
    }

    C0143k(Drawable drawable) {
        super(drawable);
    }

    C0143k(C0137a c0137a, Resources resources) {
        super(c0137a, resources);
    }

    C0137a m587b() {
        return new C0142a(this.b, null);
    }

    public boolean isAutoMirrored() {
        return this.c.isAutoMirrored();
    }

    public void setAutoMirrored(boolean z) {
        this.c.setAutoMirrored(z);
    }
}
