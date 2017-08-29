package android.support.v7.p014a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.C0419i;
import android.support.v7.view.C0461b;
import android.support.v7.view.C0461b.C0445a;
import android.support.v7.view.C0491g;
import android.support.v7.view.menu.C0515h;
import android.support.v7.widget.av;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.Window;
import android.view.Window.Callback;
import java.lang.Thread.UncaughtExceptionHandler;

/* renamed from: android.support.v7.a.h */
abstract class C0421h extends C0417g {
    private static boolean f849m;
    private static final boolean f850n;
    private static final int[] f851o;
    final Context f852a;
    final Window f853b;
    final Callback f854c;
    final Callback f855d;
    final C0397f f856e;
    C0396a f857f;
    MenuInflater f858g;
    boolean f859h;
    boolean f860i;
    boolean f861j;
    boolean f862k;
    boolean f863l;
    private CharSequence f864p;
    private boolean f865q;
    private boolean f866r;

    /* renamed from: android.support.v7.a.h.1 */
    static class C04181 implements UncaughtExceptionHandler {
        final /* synthetic */ UncaughtExceptionHandler f846a;

        C04181(UncaughtExceptionHandler uncaughtExceptionHandler) {
            this.f846a = uncaughtExceptionHandler;
        }

        private boolean m1986a(Throwable th) {
            if (!(th instanceof NotFoundException)) {
                return false;
            }
            String message = th.getMessage();
            return message != null ? message.contains("drawable") || message.contains("Drawable") : false;
        }

        public void uncaughtException(Thread thread, Throwable th) {
            if (m1986a(th)) {
                Throwable notFoundException = new NotFoundException(th.getMessage() + ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.");
                notFoundException.initCause(th.getCause());
                notFoundException.setStackTrace(th.getStackTrace());
                this.f846a.uncaughtException(thread, notFoundException);
                return;
            }
            this.f846a.uncaughtException(thread, th);
        }
    }

    /* renamed from: android.support.v7.a.h.a */
    class C0420a extends C0419i {
        final /* synthetic */ C0421h f848a;

        C0420a(C0421h c0421h, Callback callback) {
            this.f848a = c0421h;
            super(callback);
        }

        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f848a.m1993a(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || this.f848a.m1992a(keyEvent.getKeyCode(), keyEvent);
        }

        public void onContentChanged() {
        }

        public boolean onCreatePanelMenu(int i, Menu menu) {
            return (i != 0 || (menu instanceof C0515h)) ? super.onCreatePanelMenu(i, menu) : false;
        }

        public boolean onMenuOpened(int i, Menu menu) {
            super.onMenuOpened(i, menu);
            this.f848a.m1996b(i, menu);
            return true;
        }

        public void onPanelClosed(int i, Menu menu) {
            super.onPanelClosed(i, menu);
            this.f848a.m1990a(i, menu);
        }

        public boolean onPreparePanel(int i, View view, Menu menu) {
            C0515h c0515h = menu instanceof C0515h ? (C0515h) menu : null;
            if (i == 0 && c0515h == null) {
                return false;
            }
            if (c0515h != null) {
                c0515h.m2485c(true);
            }
            boolean onPreparePanel = super.onPreparePanel(i, view, menu);
            if (c0515h == null) {
                return onPreparePanel;
            }
            c0515h.m2485c(false);
            return onPreparePanel;
        }
    }

    static {
        f850n = VERSION.SDK_INT < 21;
        if (f850n && !f849m) {
            Thread.setDefaultUncaughtExceptionHandler(new C04181(Thread.getDefaultUncaughtExceptionHandler()));
            f849m = true;
        }
        f851o = new int[]{16842836};
    }

    C0421h(Context context, Window window, C0397f c0397f) {
        this.f852a = context;
        this.f853b = window;
        this.f856e = c0397f;
        this.f854c = this.f853b.getCallback();
        if (this.f854c instanceof C0420a) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.f855d = m1989a(this.f854c);
        this.f853b.setCallback(this.f855d);
        av a = av.m2946a(context, null, f851o);
        Drawable b = a.m2954b(0);
        if (b != null) {
            this.f853b.setBackgroundDrawable(b);
        }
        a.m2951a();
    }

    public C0396a m1987a() {
        m2002l();
        return this.f857f;
    }

    abstract C0461b m1988a(C0445a c0445a);

    Callback m1989a(Callback callback) {
        return new C0420a(this, callback);
    }

    abstract void m1990a(int i, Menu menu);

    public final void m1991a(CharSequence charSequence) {
        this.f864p = charSequence;
        m1995b(charSequence);
    }

    abstract boolean m1992a(int i, KeyEvent keyEvent);

    abstract boolean m1993a(KeyEvent keyEvent);

    public MenuInflater m1994b() {
        if (this.f858g == null) {
            m2002l();
            this.f858g = new C0491g(this.f857f != null ? this.f857f.m1895c() : this.f852a);
        }
        return this.f858g;
    }

    abstract void m1995b(CharSequence charSequence);

    abstract boolean m1996b(int i, Menu menu);

    public void m1997c() {
        this.f865q = true;
    }

    public void m1998c(Bundle bundle) {
    }

    public void m1999d() {
        this.f865q = false;
    }

    public void m2000g() {
        this.f866r = true;
    }

    public boolean m2001i() {
        return false;
    }

    abstract void m2002l();

    final C0396a m2003m() {
        return this.f857f;
    }

    final Context m2004n() {
        Context context = null;
        C0396a a = m1987a();
        if (a != null) {
            context = a.m1895c();
        }
        return context == null ? this.f852a : context;
    }

    public boolean m2005o() {
        return false;
    }

    final boolean m2006p() {
        return this.f866r;
    }

    final Callback m2007q() {
        return this.f853b.getCallback();
    }

    final CharSequence m2008r() {
        return this.f854c instanceof Activity ? ((Activity) this.f854c).getTitle() : this.f864p;
    }
}
