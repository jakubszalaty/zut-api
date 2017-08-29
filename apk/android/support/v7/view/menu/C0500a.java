package android.support.v7.view.menu;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.p005b.C0035a;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.C0317q.C0316e;
import android.support.v4.p009d.p010a.C0148b;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

/* renamed from: android.support.v7.view.menu.a */
public class C0500a implements C0148b {
    private final int f1133a;
    private final int f1134b;
    private final int f1135c;
    private final int f1136d;
    private CharSequence f1137e;
    private CharSequence f1138f;
    private Intent f1139g;
    private char f1140h;
    private char f1141i;
    private Drawable f1142j;
    private int f1143k;
    private Context f1144l;
    private OnMenuItemClickListener f1145m;
    private int f1146n;

    public C0500a(Context context, int i, int i2, int i3, int i4, CharSequence charSequence) {
        this.f1143k = 0;
        this.f1146n = 16;
        this.f1144l = context;
        this.f1133a = i2;
        this.f1134b = i;
        this.f1135c = i3;
        this.f1136d = i4;
        this.f1137e = charSequence;
    }

    public C0148b m2348a(int i) {
        throw new UnsupportedOperationException();
    }

    public C0148b m2349a(C0286e c0286e) {
        throw new UnsupportedOperationException();
    }

    public C0148b m2350a(C0316e c0316e) {
        return this;
    }

    public C0148b m2351a(View view) {
        throw new UnsupportedOperationException();
    }

    public C0286e m2352a() {
        return null;
    }

    public C0148b m2353b(int i) {
        setShowAsAction(i);
        return this;
    }

    public boolean collapseActionView() {
        return false;
    }

    public boolean expandActionView() {
        return false;
    }

    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public View getActionView() {
        return null;
    }

    public char getAlphabeticShortcut() {
        return this.f1141i;
    }

    public int getGroupId() {
        return this.f1134b;
    }

    public Drawable getIcon() {
        return this.f1142j;
    }

    public Intent getIntent() {
        return this.f1139g;
    }

    public int getItemId() {
        return this.f1133a;
    }

    public ContextMenuInfo getMenuInfo() {
        return null;
    }

    public char getNumericShortcut() {
        return this.f1140h;
    }

    public int getOrder() {
        return this.f1136d;
    }

    public SubMenu getSubMenu() {
        return null;
    }

    public CharSequence getTitle() {
        return this.f1137e;
    }

    public CharSequence getTitleCondensed() {
        return this.f1138f != null ? this.f1138f : this.f1137e;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isActionViewExpanded() {
        return false;
    }

    public boolean isCheckable() {
        return (this.f1146n & 1) != 0;
    }

    public boolean isChecked() {
        return (this.f1146n & 2) != 0;
    }

    public boolean isEnabled() {
        return (this.f1146n & 16) != 0;
    }

    public boolean isVisible() {
        return (this.f1146n & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ MenuItem setActionView(int i) {
        return m2348a(i);
    }

    public /* synthetic */ MenuItem setActionView(View view) {
        return m2351a(view);
    }

    public MenuItem setAlphabeticShortcut(char c) {
        this.f1141i = c;
        return this;
    }

    public MenuItem setCheckable(boolean z) {
        this.f1146n = (z ? 1 : 0) | (this.f1146n & -2);
        return this;
    }

    public MenuItem setChecked(boolean z) {
        this.f1146n = (z ? 2 : 0) | (this.f1146n & -3);
        return this;
    }

    public MenuItem setEnabled(boolean z) {
        this.f1146n = (z ? 16 : 0) | (this.f1146n & -17);
        return this;
    }

    public MenuItem setIcon(int i) {
        this.f1143k = i;
        this.f1142j = C0035a.m73a(this.f1144l, i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable) {
        this.f1142j = drawable;
        this.f1143k = 0;
        return this;
    }

    public MenuItem setIntent(Intent intent) {
        this.f1139g = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c) {
        this.f1140h = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public MenuItem setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f1145m = onMenuItemClickListener;
        return this;
    }

    public MenuItem setShortcut(char c, char c2) {
        this.f1140h = c;
        this.f1141i = c2;
        return this;
    }

    public void setShowAsAction(int i) {
    }

    public /* synthetic */ MenuItem setShowAsActionFlags(int i) {
        return m2353b(i);
    }

    public MenuItem setTitle(int i) {
        this.f1137e = this.f1144l.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charSequence) {
        this.f1137e = charSequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f1138f = charSequence;
        return this;
    }

    public MenuItem setVisible(boolean z) {
        this.f1146n = (z ? 0 : 8) | (this.f1146n & 8);
        return this;
    }
}
