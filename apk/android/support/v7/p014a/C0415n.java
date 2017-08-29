package android.support.v7.p014a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* renamed from: android.support.v7.a.n */
public class C0415n extends Dialog implements C0397f {
    private C0417g f842a;

    public C0415n(Context context, int i) {
        super(context, C0415n.m1954a(context, i));
        m1955a().m1969a(null);
        m1955a().m1985i();
    }

    private static int m1954a(Context context, int i) {
        if (i != 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0465a.dialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public C0417g m1955a() {
        if (this.f842a == null) {
            this.f842a = C0417g.m1962a((Dialog) this, (C0397f) this);
        }
        return this.f842a;
    }

    public C0461b m1956a(C0445a c0445a) {
        return null;
    }

    public void m1957a(C0461b c0461b) {
    }

    public boolean m1958a(int i) {
        return m1955a().m1979c(i);
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m1955a().m1976b(view, layoutParams);
    }

    public void m1959b(C0461b c0461b) {
    }

    public View findViewById(int i) {
        return m1955a().m1967a(i);
    }

    public void invalidateOptionsMenu() {
        m1955a().m1982f();
    }

    protected void onCreate(Bundle bundle) {
        m1955a().m1984h();
        super.onCreate(bundle);
        m1955a().m1969a(bundle);
    }

    protected void onStop() {
        super.onStop();
        m1955a().m1980d();
    }

    public void setContentView(int i) {
        m1955a().m1974b(i);
    }

    public void setContentView(View view) {
        m1955a().m1970a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m1955a().m1971a(view, layoutParams);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m1955a().m1972a(getContext().getString(i));
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m1955a().m1972a(charSequence);
    }
}
