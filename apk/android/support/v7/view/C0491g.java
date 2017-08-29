package android.support.v7.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.support.v4.p007g.C0286e;
import android.support.v4.p007g.C0317q;
import android.support.v4.p009d.p010a.C0147a;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.menu.C0518j;
import android.support.v7.view.menu.C0523k;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* renamed from: android.support.v7.view.g */
public class C0491g extends MenuInflater {
    static final Class<?>[] f1077a;
    static final Class<?>[] f1078b;
    final Object[] f1079c;
    final Object[] f1080d;
    Context f1081e;
    private Object f1082f;

    /* renamed from: android.support.v7.view.g.a */
    private static class C0489a implements OnMenuItemClickListener {
        private static final Class<?>[] f1048a;
        private Object f1049b;
        private Method f1050c;

        static {
            f1048a = new Class[]{MenuItem.class};
        }

        public C0489a(Object obj, String str) {
            this.f1049b = obj;
            Class cls = obj.getClass();
            try {
                this.f1050c = cls.getMethod(str, f1048a);
            } catch (Throwable e) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f1050c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f1050c.invoke(this.f1049b, new Object[]{menuItem})).booleanValue();
                }
                this.f1050c.invoke(this.f1049b, new Object[]{menuItem});
                return true;
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: android.support.v7.view.g.b */
    private class C0490b {
        C0286e f1051a;
        final /* synthetic */ C0491g f1052b;
        private Menu f1053c;
        private int f1054d;
        private int f1055e;
        private int f1056f;
        private int f1057g;
        private boolean f1058h;
        private boolean f1059i;
        private boolean f1060j;
        private int f1061k;
        private int f1062l;
        private CharSequence f1063m;
        private CharSequence f1064n;
        private int f1065o;
        private char f1066p;
        private char f1067q;
        private int f1068r;
        private boolean f1069s;
        private boolean f1070t;
        private boolean f1071u;
        private int f1072v;
        private int f1073w;
        private String f1074x;
        private String f1075y;
        private String f1076z;

        public C0490b(C0491g c0491g, Menu menu) {
            this.f1052b = c0491g;
            this.f1053c = menu;
            m2294a();
        }

        private char m2291a(String str) {
            return str == null ? '\u0000' : str.charAt(0);
        }

        private <T> T m2292a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = this.f1052b.f1081e.getClassLoader().loadClass(str).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Throwable e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        private void m2293a(MenuItem menuItem) {
            boolean z = true;
            menuItem.setChecked(this.f1069s).setVisible(this.f1070t).setEnabled(this.f1071u).setCheckable(this.f1068r >= 1).setTitleCondensed(this.f1064n).setIcon(this.f1065o).setAlphabeticShortcut(this.f1066p).setNumericShortcut(this.f1067q);
            if (this.f1072v >= 0) {
                C0317q.m1521a(menuItem, this.f1072v);
            }
            if (this.f1076z != null) {
                if (this.f1052b.f1081e.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                menuItem.setOnMenuItemClickListener(new C0489a(this.f1052b.m2302a(), this.f1076z));
            }
            if (menuItem instanceof C0518j) {
                C0518j c0518j = (C0518j) menuItem;
            }
            if (this.f1068r >= 2) {
                if (menuItem instanceof C0518j) {
                    ((C0518j) menuItem).m2519a(true);
                } else if (menuItem instanceof C0523k) {
                    ((C0523k) menuItem).m2548a(true);
                }
            }
            if (this.f1074x != null) {
                C0317q.m1519a(menuItem, (View) m2292a(this.f1074x, C0491g.f1077a, this.f1052b.f1079c));
            } else {
                z = false;
            }
            if (this.f1073w > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    C0317q.m1522b(menuItem, this.f1073w);
                }
            }
            if (this.f1051a != null) {
                C0317q.m1518a(menuItem, this.f1051a);
            }
        }

        public void m2294a() {
            this.f1054d = 0;
            this.f1055e = 0;
            this.f1056f = 0;
            this.f1057g = 0;
            this.f1058h = true;
            this.f1059i = true;
        }

        public void m2295a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = this.f1052b.f1081e.obtainStyledAttributes(attributeSet, C0474j.MenuGroup);
            this.f1054d = obtainStyledAttributes.getResourceId(C0474j.MenuGroup_android_id, 0);
            this.f1055e = obtainStyledAttributes.getInt(C0474j.MenuGroup_android_menuCategory, 0);
            this.f1056f = obtainStyledAttributes.getInt(C0474j.MenuGroup_android_orderInCategory, 0);
            this.f1057g = obtainStyledAttributes.getInt(C0474j.MenuGroup_android_checkableBehavior, 0);
            this.f1058h = obtainStyledAttributes.getBoolean(C0474j.MenuGroup_android_visible, true);
            this.f1059i = obtainStyledAttributes.getBoolean(C0474j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        public void m2296b() {
            this.f1060j = true;
            m2293a(this.f1053c.add(this.f1054d, this.f1061k, this.f1062l, this.f1063m));
        }

        public void m2297b(AttributeSet attributeSet) {
            boolean z = true;
            TypedArray obtainStyledAttributes = this.f1052b.f1081e.obtainStyledAttributes(attributeSet, C0474j.MenuItem);
            this.f1061k = obtainStyledAttributes.getResourceId(C0474j.MenuItem_android_id, 0);
            this.f1062l = (obtainStyledAttributes.getInt(C0474j.MenuItem_android_menuCategory, this.f1055e) & -65536) | (obtainStyledAttributes.getInt(C0474j.MenuItem_android_orderInCategory, this.f1056f) & 65535);
            this.f1063m = obtainStyledAttributes.getText(C0474j.MenuItem_android_title);
            this.f1064n = obtainStyledAttributes.getText(C0474j.MenuItem_android_titleCondensed);
            this.f1065o = obtainStyledAttributes.getResourceId(C0474j.MenuItem_android_icon, 0);
            this.f1066p = m2291a(obtainStyledAttributes.getString(C0474j.MenuItem_android_alphabeticShortcut));
            this.f1067q = m2291a(obtainStyledAttributes.getString(C0474j.MenuItem_android_numericShortcut));
            if (obtainStyledAttributes.hasValue(C0474j.MenuItem_android_checkable)) {
                this.f1068r = obtainStyledAttributes.getBoolean(C0474j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f1068r = this.f1057g;
            }
            this.f1069s = obtainStyledAttributes.getBoolean(C0474j.MenuItem_android_checked, false);
            this.f1070t = obtainStyledAttributes.getBoolean(C0474j.MenuItem_android_visible, this.f1058h);
            this.f1071u = obtainStyledAttributes.getBoolean(C0474j.MenuItem_android_enabled, this.f1059i);
            this.f1072v = obtainStyledAttributes.getInt(C0474j.MenuItem_showAsAction, -1);
            this.f1076z = obtainStyledAttributes.getString(C0474j.MenuItem_android_onClick);
            this.f1073w = obtainStyledAttributes.getResourceId(C0474j.MenuItem_actionLayout, 0);
            this.f1074x = obtainStyledAttributes.getString(C0474j.MenuItem_actionViewClass);
            this.f1075y = obtainStyledAttributes.getString(C0474j.MenuItem_actionProviderClass);
            if (this.f1075y == null) {
                z = false;
            }
            if (z && this.f1073w == 0 && this.f1074x == null) {
                this.f1051a = (C0286e) m2292a(this.f1075y, C0491g.f1078b, this.f1052b.f1080d);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f1051a = null;
            }
            obtainStyledAttributes.recycle();
            this.f1060j = false;
        }

        public SubMenu m2298c() {
            this.f1060j = true;
            SubMenu addSubMenu = this.f1053c.addSubMenu(this.f1054d, this.f1061k, this.f1062l, this.f1063m);
            m2293a(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean m2299d() {
            return this.f1060j;
        }
    }

    static {
        f1077a = new Class[]{Context.class};
        f1078b = f1077a;
    }

    public C0491g(Context context) {
        super(context);
        this.f1081e = context;
        this.f1079c = new Object[]{context};
        this.f1080d = this.f1079c;
    }

    private Object m2300a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? m2300a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m2301a(org.xmlpull.v1.XmlPullParser r11, android.util.AttributeSet r12, android.view.Menu r13) {
        /*
        r10 = this;
        r4 = 0;
        r1 = 1;
        r6 = 0;
        r7 = new android.support.v7.view.g$b;
        r7.<init>(r10, r13);
        r0 = r11.getEventType();
    L_0x000c:
        r2 = 2;
        if (r0 != r2) goto L_0x004a;
    L_0x000f:
        r0 = r11.getName();
        r2 = "menu";
        r2 = r0.equals(r2);
        if (r2 == 0) goto L_0x0031;
    L_0x001b:
        r0 = r11.next();
    L_0x001f:
        r2 = r4;
        r5 = r6;
        r3 = r0;
        r0 = r6;
    L_0x0023:
        if (r0 != 0) goto L_0x00dd;
    L_0x0025:
        switch(r3) {
            case 1: goto L_0x00d5;
            case 2: goto L_0x0051;
            case 3: goto L_0x0087;
            default: goto L_0x0028;
        };
    L_0x0028:
        r3 = r5;
    L_0x0029:
        r5 = r11.next();
        r9 = r3;
        r3 = r5;
        r5 = r9;
        goto L_0x0023;
    L_0x0031:
        r1 = new java.lang.RuntimeException;
        r2 = new java.lang.StringBuilder;
        r2.<init>();
        r3 = "Expecting menu, got ";
        r2 = r2.append(r3);
        r0 = r2.append(r0);
        r0 = r0.toString();
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        r0 = r11.next();
        if (r0 != r1) goto L_0x000c;
    L_0x0050:
        goto L_0x001f;
    L_0x0051:
        if (r5 == 0) goto L_0x0055;
    L_0x0053:
        r3 = r5;
        goto L_0x0029;
    L_0x0055:
        r3 = r11.getName();
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0066;
    L_0x0061:
        r7.m2295a(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0066:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0073;
    L_0x006e:
        r7.m2297b(r12);
        r3 = r5;
        goto L_0x0029;
    L_0x0073:
        r8 = "menu";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x0084;
    L_0x007b:
        r3 = r7.m2298c();
        r10.m2301a(r11, r12, r3);
        r3 = r5;
        goto L_0x0029;
    L_0x0084:
        r2 = r3;
        r3 = r1;
        goto L_0x0029;
    L_0x0087:
        r3 = r11.getName();
        if (r5 == 0) goto L_0x0096;
    L_0x008d:
        r8 = r3.equals(r2);
        if (r8 == 0) goto L_0x0096;
    L_0x0093:
        r2 = r4;
        r3 = r6;
        goto L_0x0029;
    L_0x0096:
        r8 = "group";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00a3;
    L_0x009e:
        r7.m2294a();
        r3 = r5;
        goto L_0x0029;
    L_0x00a3:
        r8 = "item";
        r8 = r3.equals(r8);
        if (r8 == 0) goto L_0x00c9;
    L_0x00ab:
        r3 = r7.m2299d();
        if (r3 != 0) goto L_0x0028;
    L_0x00b1:
        r3 = r7.f1051a;
        if (r3 == 0) goto L_0x00c3;
    L_0x00b5:
        r3 = r7.f1051a;
        r3 = r3.m1461e();
        if (r3 == 0) goto L_0x00c3;
    L_0x00bd:
        r7.m2298c();
        r3 = r5;
        goto L_0x0029;
    L_0x00c3:
        r7.m2296b();
        r3 = r5;
        goto L_0x0029;
    L_0x00c9:
        r8 = "menu";
        r3 = r3.equals(r8);
        if (r3 == 0) goto L_0x0028;
    L_0x00d1:
        r0 = r1;
        r3 = r5;
        goto L_0x0029;
    L_0x00d5:
        r0 = new java.lang.RuntimeException;
        r1 = "Unexpected end of document";
        r0.<init>(r1);
        throw r0;
    L_0x00dd:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.view.g.a(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object m2302a() {
        if (this.f1082f == null) {
            this.f1082f = m2300a(this.f1081e);
        }
        return this.f1082f;
    }

    public void inflate(int i, Menu menu) {
        if (menu instanceof C0147a) {
            XmlResourceParser xmlResourceParser = null;
            try {
                xmlResourceParser = this.f1081e.getResources().getLayout(i);
                m2301a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            } catch (Throwable e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (Throwable e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (Throwable th) {
                if (xmlResourceParser != null) {
                    xmlResourceParser.close();
                }
            }
        } else {
            super.inflate(i, menu);
        }
    }
}
