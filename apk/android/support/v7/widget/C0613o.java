package android.support.v7.widget;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: android.support.v7.widget.o */
public class C0613o {
    private final ImageView f1810a;

    public C0613o(ImageView imageView) {
        this.f1810a = imageView;
    }

    public void m3132a(int i) {
        if (i != 0) {
            Drawable b = C0478b.m2246b(this.f1810a.getContext(), i);
            if (b != null) {
                ad.m2838a(b);
            }
            this.f1810a.setImageDrawable(b);
            return;
        }
        this.f1810a.setImageDrawable(null);
    }

    public void m3133a(AttributeSet attributeSet, int i) {
        av avVar = null;
        try {
            Drawable drawable = this.f1810a.getDrawable();
            if (drawable == null) {
                avVar = av.m2947a(this.f1810a.getContext(), attributeSet, C0474j.AppCompatImageView, i, 0);
                int g = avVar.m2963g(C0474j.AppCompatImageView_srcCompat, -1);
                if (g != -1) {
                    drawable = C0478b.m2246b(this.f1810a.getContext(), g);
                    if (drawable != null) {
                        this.f1810a.setImageDrawable(drawable);
                    }
                }
            }
            if (drawable != null) {
                ad.m2838a(drawable);
            }
            if (avVar != null) {
                avVar.m2951a();
            }
        } catch (Throwable th) {
            if (avVar != null) {
                avVar.m2951a();
            }
        }
    }

    boolean m3134a() {
        return VERSION.SDK_INT < 21 || !(this.f1810a.getBackground() instanceof RippleDrawable);
    }
}
