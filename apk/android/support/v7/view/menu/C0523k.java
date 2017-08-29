package android.support.v7.view.menu;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.C0317q.C0316e;
import android.support.v4.p009d.p010a.C0148b;
import android.support.v7.view.C0484c;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

@TargetApi(14)
/* renamed from: android.support.v7.view.menu.k */
public class C0523k extends C0504c<C0148b> implements MenuItem {
    private Method f1274c;

    /* renamed from: android.support.v7.view.menu.k.a */
    class C0519a extends C0286e {
        final ActionProvider f1269a;
        final /* synthetic */ C0523k f1270b;

        public C0519a(C0523k c0523k, Context context, ActionProvider actionProvider) {
            this.f1270b = c0523k;
            super(context);
            this.f1269a = actionProvider;
        }

        public View m2538a() {
            return this.f1269a.onCreateActionView();
        }

        public void m2539a(SubMenu subMenu) {
            this.f1269a.onPrepareSubMenu(this.f1270b.m2380a(subMenu));
        }

        public boolean m2540d() {
            return this.f1269a.onPerformDefaultAction();
        }

        public boolean m2541e() {
            return this.f1269a.hasSubMenu();
        }
    }

    /* renamed from: android.support.v7.view.menu.k.b */
    static class C0520b extends FrameLayout implements C0484c {
        final CollapsibleActionView f1271a;

        C0520b(View view) {
            super(view.getContext());
            this.f1271a = (CollapsibleActionView) view;
            addView(view);
        }

        public void m2542a() {
            this.f1271a.onActionViewExpanded();
        }

        public void m2543b() {
            this.f1271a.onActionViewCollapsed();
        }

        View m2544c() {
            return (View) this.f1271a;
        }
    }

    /* renamed from: android.support.v7.view.menu.k.c */
    private class C0521c extends C0503d<OnActionExpandListener> implements C0316e {
        final /* synthetic */ C0523k f1272a;

        C0521c(C0523k c0523k, OnActionExpandListener onActionExpandListener) {
            this.f1272a = c0523k;
            super(onActionExpandListener);
        }

        public boolean m2545a(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionExpand(this.f1272a.m2379a(menuItem));
        }

        public boolean m2546b(MenuItem menuItem) {
            return ((OnActionExpandListener) this.b).onMenuItemActionCollapse(this.f1272a.m2379a(menuItem));
        }
    }

    /* renamed from: android.support.v7.view.menu.k.d */
    private class C0522d extends C0503d<OnMenuItemClickListener> implements OnMenuItemClickListener {
        final /* synthetic */ C0523k f1273a;

        C0522d(C0523k c0523k, OnMenuItemClickListener onMenuItemClickListener) {
            this.f1273a = c0523k;
            super(onMenuItemClickListener);
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            return ((OnMenuItemClickListener) this.b).onMenuItemClick(this.f1273a.m2379a(menuItem));
        }
    }

    C0523k(Context context, C0148b c0148b) {
        super(context, c0148b);
    }

    C0519a m2547a(ActionProvider actionProvider) {
        return new C0519a(this, this.a, actionProvider);
    }

    public void m2548a(boolean z) {
        try {
            if (this.f1274c == null) {
                this.f1274c = ((C0148b) this.b).getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
            }
            this.f1274c.invoke(this.b, new Object[]{Boolean.valueOf(z)});
        } catch (Throwable e) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e);
        }
    }

    public boolean collapseActionView() {
        return ((C0148b) this.b).collapseActionView();
    }

    public boolean expandActionView() {
        return ((C0148b) this.b).expandActionView();
    }

    public ActionProvider getActionProvider() {
        C0286e a = ((C0148b) this.b).m596a();
        return a instanceof C0519a ? ((C0519a) a).f1269a : null;
    }

    public View getActionView() {
        View actionView = ((C0148b) this.b).getActionView();
        return actionView instanceof C0520b ? ((C0520b) actionView).m2544c() : actionView;
    }

    public char getAlphabeticShortcut() {
        return ((C0148b) this.b).getAlphabeticShortcut();
    }

    public int getGroupId() {
        return ((C0148b) this.b).getGroupId();
    }

    public Drawable getIcon() {
        return ((C0148b) this.b).getIcon();
    }

    public Intent getIntent() {
        return ((C0148b) this.b).getIntent();
    }

    public int getItemId() {
        return ((C0148b) this.b).getItemId();
    }

    public ContextMenuInfo getMenuInfo() {
        return ((C0148b) this.b).getMenuInfo();
    }

    public char getNumericShortcut() {
        return ((C0148b) this.b).getNumericShortcut();
    }

    public int getOrder() {
        return ((C0148b) this.b).getOrder();
    }

    public SubMenu getSubMenu() {
        return m2380a(((C0148b) this.b).getSubMenu());
    }

    public CharSequence getTitle() {
        return ((C0148b) this.b).getTitle();
    }

    public CharSequence getTitleCondensed() {
        return ((C0148b) this.b).getTitleCondensed();
    }

    public boolean hasSubMenu() {
        return ((C0148b) this.b).hasSubMenu();
    }

    public boolean isActionViewExpanded() {
        return ((C0148b) this.b).isActionViewExpanded();
    }

    public boolean isCheckable() {
        return ((C0148b) this.b).isCheckable();
    }

    public boolean isChecked() {
        return ((C0148b) this.b).isChecked();
    }

    public boolean isEnabled() {
        return ((C0148b) this.b).isEnabled();
    }

    public boolean isVisible() {
        return ((C0148b) this.b).isVisible();
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        ((C0148b) this.b).m594a(actionProvider != null ? m2547a(actionProvider) : null);
        return this;
    }

    public MenuItem setActionView(int i) {
        ((C0148b) this.b).setActionView(i);
        View actionView = ((C0148b) this.b).getActionView();
        if (actionView instanceof CollapsibleActionView) {
            ((C0148b) this.b).setActionView(new C0520b(actionView));
        }
        return this;
    }

    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0520b(view);
        }
        ((C0148b) this.b).setActionView(view);
        return this;
    }

    public MenuItem setAlphabeticShortcut(char c) {
        ((C0148b) this.b).setAlphabeticShortcut(c);
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        ((C0148b) this.b).setCheckable(z);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        ((C0148b) this.b).setChecked(z);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        ((C0148b) this.b).setEnabled(z);
        return this;
    }

    public MenuItem setIcon(int i) {
        ((C0148b) this.b).setIcon(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        ((C0148b) this.b).setIcon(drawable);
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        ((C0148b) this.b).setIntent(intent);
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        ((C0148b) this.b).setNumericShortcut(c);
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        ((C0148b) this.b).m595a(onActionExpandListener != null ? new C0521c(this, onActionExpandListener) : null);
        return this;
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        ((C0148b) this.b).setOnMenuItemClickListener(onMenuItemClickListener != null ? new C0522d(this, onMenuItemClickListener) : null);
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        ((C0148b) this.b).setShortcut(c, c2);
        return this;
    }

    public void setShowAsAction(int i) {
        ((C0148b) this.b).setShowAsAction(i);
    }

    public MenuItem setShowAsActionFlags(int i) {
        ((C0148b) this.b).setShowAsActionFlags(i);
        return this;
    }

    public MenuItem setTitle(int i) {
        ((C0148b) this.b).setTitle(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        ((C0148b) this.b).setTitle(charSequence);
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        ((C0148b) this.b).setTitleCondensed(charSequence);
        return this;
    }

    public MenuItem setVisible(boolean z) {
        return ((C0148b) this.b).setVisible(z);
    }
}
