package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.support.v7.p015b.C0475a.C0465a;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* renamed from: android.support.v7.widget.v */
public class C0620v extends SeekBar {
    private C0621w f1824a;

    public C0620v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.seekBarStyle);
    }

    public C0620v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1824a = new C0621w(this);
        this.f1824a.m3146a(attributeSet, i);
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1824a.m3148c();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1824a.m3147b();
    }

    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1824a.m3144a(canvas);
    }
}
