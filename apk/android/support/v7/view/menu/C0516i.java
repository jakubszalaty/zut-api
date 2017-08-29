package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.os.IBinder;
import android.support.v7.p014a.C0416d;
import android.support.v7.p014a.C0416d.C0414a;
import android.support.v7.p015b.C0475a.C0471g;
import android.support.v7.view.menu.C0501o.C0442a;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* renamed from: android.support.v7.view.menu.i */
class C0516i implements OnClickListener, OnDismissListener, OnKeyListener, C0442a {
    C0513f f1238a;
    private C0515h f1239b;
    private C0416d f1240c;
    private C0442a f1241d;

    public C0516i(C0515h c0515h) {
        this.f1239b = c0515h;
    }

    public void m2506a() {
        if (this.f1240c != null) {
            this.f1240c.dismiss();
        }
    }

    public void m2507a(IBinder iBinder) {
        C0515h c0515h = this.f1239b;
        C0414a c0414a = new C0414a(c0515h.m2491e());
        this.f1238a = new C0513f(c0414a.m1947a(), C0471g.abc_list_menu_item_layout);
        this.f1238a.m2441a((C0442a) this);
        this.f1239b.m2470a(this.f1238a);
        c0414a.m1951a(this.f1238a.m2438a(), this);
        View o = c0515h.m2502o();
        if (o != null) {
            c0414a.m1950a(o);
        } else {
            c0414a.m1949a(c0515h.m2501n()).m1952a(c0515h.m2500m());
        }
        c0414a.m1948a((OnKeyListener) this);
        this.f1240c = c0414a.m1953b();
        this.f1240c.setOnDismissListener(this);
        LayoutParams attributes = this.f1240c.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1240c.show();
    }

    public void m2508a(C0515h c0515h, boolean z) {
        if (z || c0515h == this.f1239b) {
            m2506a();
        }
        if (this.f1241d != null) {
            this.f1241d.m2102a(c0515h, z);
        }
    }

    public boolean m2509a(C0515h c0515h) {
        return this.f1241d != null ? this.f1241d.m2103a(c0515h) : false;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1239b.m2476a((C0518j) this.f1238a.m2438a().getItem(i), 0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        this.f1238a.m2440a(this.f1239b, true);
    }

    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i == 82 || i == 4) {
            Window window;
            View decorView;
            DispatcherState keyDispatcherState;
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                window = this.f1240c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, this);
                            return true;
                        }
                    }
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled()) {
                window = this.f1240c.getWindow();
                if (window != null) {
                    decorView = window.getDecorView();
                    if (decorView != null) {
                        keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null && keyDispatcherState.isTracking(keyEvent)) {
                            this.f1239b.m2474a(true);
                            dialogInterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return this.f1239b.performShortcut(i, keyEvent, 0);
    }
}
