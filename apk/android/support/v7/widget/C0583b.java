package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: android.support.v7.widget.b */
class C0583b extends Drawable {
    final ActionBarContainer f1715a;

    public C0583b(ActionBarContainer actionBarContainer) {
        this.f1715a = actionBarContainer;
    }

    public void draw(Canvas canvas) {
        if (!this.f1715a.f1315d) {
            if (this.f1715a.f1312a != null) {
                this.f1715a.f1312a.draw(canvas);
            }
            if (this.f1715a.f1313b != null && this.f1715a.f1316e) {
                this.f1715a.f1313b.draw(canvas);
            }
        } else if (this.f1715a.f1314c != null) {
            this.f1715a.f1314c.draw(canvas);
        }
    }

    public int getOpacity() {
        return 0;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }
}
