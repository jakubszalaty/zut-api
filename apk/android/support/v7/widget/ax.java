package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v7.p014a.C0417g;
import java.lang.ref.WeakReference;

public class ax extends Resources {
    private final WeakReference<Context> f1713a;

    public ax(Context context, Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f1713a = new WeakReference(context);
    }

    public static boolean m3012a() {
        return C0417g.m1965k() && VERSION.SDK_INT <= 20;
    }

    final Drawable m3013a(int i) {
        return super.getDrawable(i);
    }

    public Drawable getDrawable(int i) {
        Context context = (Context) this.f1713a.get();
        return context != null ? C0610l.m3109a().m3129a(context, this, i) : super.getDrawable(i);
    }
}
