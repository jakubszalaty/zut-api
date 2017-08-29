package android.support.v7.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.p007g.ae;
import android.support.v7.p015b.C0475a.C0465a;
import android.util.AttributeSet;
import android.widget.RatingBar;

/* renamed from: android.support.v7.widget.u */
public class C0619u extends RatingBar {
    private C0617s f1823a;

    public C0619u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0465a.ratingBarStyle);
    }

    public C0619u(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1823a = new C0617s(this);
        this.f1823a.m3142a(attributeSet, i);
    }

    protected synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap a = this.f1823a.m3141a();
        if (a != null) {
            setMeasuredDimension(ae.m1126a(a.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
