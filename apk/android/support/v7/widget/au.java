package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

class au extends am {
    private final WeakReference<Context> f1688a;

    public au(Context context, Resources resources) {
        super(resources);
        this.f1688a = new WeakReference(context);
    }

    public Drawable getDrawable(int i) {
        Drawable drawable = super.getDrawable(i);
        Context context = (Context) this.f1688a.get();
        if (!(drawable == null || context == null)) {
            C0610l.m3109a();
            C0610l.m3114a(context, i, drawable);
        }
        return drawable;
    }
}
