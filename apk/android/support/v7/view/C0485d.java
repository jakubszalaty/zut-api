package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources.Theme;
import android.support.v7.p015b.C0475a.C0473i;
import android.view.LayoutInflater;

/* renamed from: android.support.v7.view.d */
public class C0485d extends ContextWrapper {
    private int f1032a;
    private Theme f1033b;
    private LayoutInflater f1034c;

    public C0485d(Context context, int i) {
        super(context);
        this.f1032a = i;
    }

    public C0485d(Context context, Theme theme) {
        super(context);
        this.f1033b = theme;
    }

    private void m2266b() {
        boolean z = this.f1033b == null;
        if (z) {
            this.f1033b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1033b.setTo(theme);
            }
        }
        m2268a(this.f1033b, this.f1032a, z);
    }

    public int m2267a() {
        return this.f1032a;
    }

    protected void m2268a(Theme theme, int i, boolean z) {
        theme.applyStyle(i, true);
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f1034c == null) {
            this.f1034c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f1034c;
    }

    public Theme getTheme() {
        if (this.f1033b != null) {
            return this.f1033b;
        }
        if (this.f1032a == 0) {
            this.f1032a = C0473i.Theme_AppCompat_Light;
        }
        m2266b();
        return this.f1033b;
    }

    public void setTheme(int i) {
        if (this.f1032a != i) {
            this.f1032a = i;
            m2266b();
        }
    }
}
