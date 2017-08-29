package android.support.v7.widget;

import android.content.Context;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import android.widget.TextView;

/* renamed from: android.support.v7.widget.j */
public class C0604j extends CheckedTextView {
    private static final int[] f1782a;
    private C0629y f1783b;

    static {
        f1782a = new int[]{16843016};
    }

    public C0604j(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16843720);
    }

    public C0604j(Context context, AttributeSet attributeSet, int i) {
        super(as.m2942a(context), attributeSet, i);
        this.f1783b = C0629y.m3160a((TextView) this);
        this.f1783b.m3164a(attributeSet, i);
        this.f1783b.m3161a();
        av a = av.m2947a(getContext(), attributeSet, f1782a, i, 0);
        setCheckMarkDrawable(a.m2950a(0));
        a.m2951a();
    }

    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f1783b != null) {
            this.f1783b.m3161a();
        }
    }

    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(C0478b.m2246b(getContext(), i));
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (this.f1783b != null) {
            this.f1783b.m3162a(context, i);
        }
    }
}
