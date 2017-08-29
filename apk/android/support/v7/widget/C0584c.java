package android.support.v7.widget;

import android.graphics.Outline;

/* renamed from: android.support.v7.widget.c */
class C0584c extends C0583b {
    public C0584c(ActionBarContainer actionBarContainer) {
        super(actionBarContainer);
    }

    public void getOutline(Outline outline) {
        if (this.a.f1315d) {
            if (this.a.f1314c != null) {
                this.a.f1314c.getOutline(outline);
            }
        } else if (this.a.f1312a != null) {
            this.a.f1312a.getOutline(outline);
        }
    }
}
