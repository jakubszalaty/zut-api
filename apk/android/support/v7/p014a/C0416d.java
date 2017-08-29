package android.support.v7.p014a;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.p014a.C0413c.C0410a;
import android.support.v7.p015b.C0475a.C0465a;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;

/* renamed from: android.support.v7.a.d */
public class C0416d extends C0415n implements DialogInterface {
    final C0413c f843a;

    /* renamed from: android.support.v7.a.d.a */
    public static class C0414a {
        private final C0410a f840a;
        private final int f841b;

        public C0414a(Context context) {
            this(context, C0416d.m1960a(context, 0));
        }

        public C0414a(Context context, int i) {
            this.f840a = new C0410a(new ContextThemeWrapper(context, C0416d.m1960a(context, i)));
            this.f841b = i;
        }

        public Context m1947a() {
            return this.f840a.f773a;
        }

        public C0414a m1948a(OnKeyListener onKeyListener) {
            this.f840a.f790r = onKeyListener;
            return this;
        }

        public C0414a m1949a(Drawable drawable) {
            this.f840a.f776d = drawable;
            return this;
        }

        public C0414a m1950a(View view) {
            this.f840a.f779g = view;
            return this;
        }

        public C0414a m1951a(ListAdapter listAdapter, OnClickListener onClickListener) {
            this.f840a.f792t = listAdapter;
            this.f840a.f793u = onClickListener;
            return this;
        }

        public C0414a m1952a(CharSequence charSequence) {
            this.f840a.f778f = charSequence;
            return this;
        }

        public C0416d m1953b() {
            C0416d c0416d = new C0416d(this.f840a.f773a, this.f841b);
            this.f840a.m1923a(c0416d.f843a);
            c0416d.setCancelable(this.f840a.f787o);
            if (this.f840a.f787o) {
                c0416d.setCanceledOnTouchOutside(true);
            }
            c0416d.setOnCancelListener(this.f840a.f788p);
            c0416d.setOnDismissListener(this.f840a.f789q);
            if (this.f840a.f790r != null) {
                c0416d.setOnKeyListener(this.f840a.f790r);
            }
            return c0416d;
        }
    }

    protected C0416d(Context context, int i) {
        super(context, C0416d.m1960a(context, i));
        this.f843a = new C0413c(getContext(), this, getWindow());
    }

    static int m1960a(Context context, int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C0465a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f843a.m1934a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        return this.f843a.m1940a(i, keyEvent) ? true : super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        return this.f843a.m1944b(i, keyEvent) ? true : super.onKeyUp(i, keyEvent);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f843a.m1939a(charSequence);
    }
}
