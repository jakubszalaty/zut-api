package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.support.v7.view.menu.C0514g;
import android.support.v7.view.menu.C0515h;
import android.support.v7.view.menu.ListMenuItemView;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class al extends ai implements ak {
    private static Method f1620a;
    private ak f1621b;

    /* renamed from: android.support.v7.widget.al.a */
    public static class C0575a extends ae {
        final int f1616g;
        final int f1617h;
        private ak f1618i;
        private MenuItem f1619j;

        public C0575a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1616g = 22;
                this.f1617h = 21;
                return;
            }
            this.f1616g = 21;
            this.f1617h = 22;
        }

        public /* bridge */ /* synthetic */ boolean m2888a(MotionEvent motionEvent, int i) {
            return super.m2853a(motionEvent, i);
        }

        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            if (this.f1618i != null) {
                int headersCount;
                C0514g c0514g;
                MenuItem a;
                MenuItem menuItem;
                C0515h a2;
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0514g = (C0514g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0514g = (C0514g) adapter;
                }
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        headersCount = pointToPosition - headersCount;
                        if (headersCount >= 0 && headersCount < c0514g.getCount()) {
                            a = c0514g.m2448a(headersCount);
                            menuItem = this.f1619j;
                            if (menuItem != a) {
                                a2 = c0514g.m2447a();
                                if (menuItem != null) {
                                    this.f1618i.m2384a(a2, menuItem);
                                }
                                this.f1619j = a;
                                if (a != null) {
                                    this.f1618i.m2385b(a2, a);
                                }
                            }
                        }
                    }
                }
                a = null;
                menuItem = this.f1619j;
                if (menuItem != a) {
                    a2 = c0514g.m2447a();
                    if (menuItem != null) {
                        this.f1618i.m2384a(a2, menuItem);
                    }
                    this.f1619j = a;
                    if (a != null) {
                        this.f1618i.m2385b(a2, a);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1616g) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1617h) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0514g) getAdapter()).m2447a().m2474a(false);
                return true;
            }
        }

        public void setHoverListener(ak akVar) {
            this.f1618i = akVar;
        }
    }

    static {
        try {
            f1620a = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException e) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public al(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    ae m2889a(Context context, boolean z) {
        ae c0575a = new C0575a(context, z);
        c0575a.setHoverListener(this);
        return c0575a;
    }

    public void m2890a(C0515h c0515h, MenuItem menuItem) {
        if (this.f1621b != null) {
            this.f1621b.m2384a(c0515h, menuItem);
        }
    }

    public void m2891a(ak akVar) {
        this.f1621b = akVar;
    }

    public void m2892a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.g.setEnterTransition((Transition) obj);
        }
    }

    public void m2893b(C0515h c0515h, MenuItem menuItem) {
        if (this.f1621b != null) {
            this.f1621b.m2385b(c0515h, menuItem);
        }
    }

    public void m2894b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.g.setExitTransition((Transition) obj);
        }
    }

    public void m2895b(boolean z) {
        if (f1620a != null) {
            try {
                f1620a.invoke(this.g, new Object[]{Boolean.valueOf(z)});
            } catch (Exception e) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
