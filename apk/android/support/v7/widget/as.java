package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.p014a.C0417g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class as extends ContextWrapper {
    private static final ArrayList<WeakReference<as>> f1681a;
    private final Resources f1682b;
    private final Theme f1683c;

    static {
        f1681a = new ArrayList();
    }

    private as(Context context) {
        super(context);
        if (ax.m3012a()) {
            this.f1682b = new ax(this, context.getResources());
            this.f1683c = this.f1682b.newTheme();
            this.f1683c.setTo(context.getTheme());
            return;
        }
        this.f1682b = new au(this, context.getResources());
        this.f1683c = null;
    }

    public static Context m2942a(Context context) {
        if (!m2943b(context)) {
            return context;
        }
        Context context2;
        int size = f1681a.size();
        for (int i = 0; i < size; i++) {
            WeakReference weakReference = (WeakReference) f1681a.get(i);
            context2 = weakReference != null ? (as) weakReference.get() : null;
            if (context2 != null && context2.getBaseContext() == context) {
                return context2;
            }
        }
        context2 = new as(context);
        f1681a.add(new WeakReference(context2));
        return context2;
    }

    private static boolean m2943b(Context context) {
        return ((context instanceof as) || (context.getResources() instanceof au) || (context.getResources() instanceof ax)) ? false : !C0417g.m1965k() || VERSION.SDK_INT <= 20;
    }

    public Resources getResources() {
        return this.f1682b;
    }

    public Theme getTheme() {
        return this.f1683c == null ? super.getTheme() : this.f1683c;
    }

    public void setTheme(int i) {
        if (this.f1683c == null) {
            super.setTheme(i);
        } else {
            this.f1683c.applyStyle(i, true);
        }
    }
}
