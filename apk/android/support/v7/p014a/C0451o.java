package android.support.v7.p014a;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v4.p007g.ae;
import android.support.v4.p012f.C0161a;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.C0485d;
import android.support.v7.widget.C0547f;
import android.support.v7.widget.C0589p;
import android.support.v7.widget.C0602h;
import android.support.v7.widget.C0603i;
import android.support.v7.widget.C0604j;
import android.support.v7.widget.C0611m;
import android.support.v7.widget.C0612n;
import android.support.v7.widget.C0614q;
import android.support.v7.widget.C0618t;
import android.support.v7.widget.C0619u;
import android.support.v7.widget.C0620v;
import android.support.v7.widget.C0628x;
import android.support.v7.widget.aa;
import android.support.v7.widget.as;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: android.support.v7.a.o */
class C0451o {
    private static final Class<?>[] f950a;
    private static final int[] f951b;
    private static final String[] f952c;
    private static final Map<String, Constructor<? extends View>> f953d;
    private final Object[] f954e;

    /* renamed from: android.support.v7.a.o.a */
    private static class C0450a implements OnClickListener {
        private final View f946a;
        private final String f947b;
        private Method f948c;
        private Context f949d;

        public C0450a(View view, String str) {
            this.f946a = view;
            this.f947b = str;
        }

        private void m2124a(Context context, String str) {
            for (Context context2 = context; context2 != null; context2 = context2 instanceof ContextWrapper ? ((ContextWrapper) context2).getBaseContext() : null) {
                try {
                    if (!context2.isRestricted()) {
                        Method method = context2.getClass().getMethod(this.f947b, new Class[]{View.class});
                        if (method != null) {
                            this.f948c = method;
                            this.f949d = context2;
                            return;
                        }
                    }
                } catch (NoSuchMethodException e) {
                }
            }
            int id = this.f946a.getId();
            throw new IllegalStateException("Could not find method " + this.f947b + "(View) in a parent or ancestor Context for android:onClick " + "attribute defined on view " + this.f946a.getClass() + (id == -1 ? "" : " with id '" + this.f946a.getContext().getResources().getResourceEntryName(id) + "'"));
        }

        public void onClick(View view) {
            if (this.f948c == null) {
                m2124a(this.f946a.getContext(), this.f947b);
            }
            try {
                this.f948c.invoke(this.f949d, new Object[]{view});
            } catch (Throwable e) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
            } catch (Throwable e2) {
                throw new IllegalStateException("Could not execute method for android:onClick", e2);
            }
        }
    }

    static {
        f950a = new Class[]{Context.class, AttributeSet.class};
        f951b = new int[]{16843375};
        f952c = new String[]{"android.widget.", "android.view.", "android.webkit."};
        f953d = new C0161a();
    }

    C0451o() {
        this.f954e = new Object[2];
    }

    private static Context m2125a(Context context, AttributeSet attributeSet, boolean z, boolean z2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0474j.View, 0, 0);
        int resourceId = z ? obtainStyledAttributes.getResourceId(C0474j.View_android_theme, 0) : 0;
        if (z2 && resourceId == 0) {
            resourceId = obtainStyledAttributes.getResourceId(C0474j.View_theme, 0);
            if (resourceId != 0) {
                Log.i("AppCompatViewInflater", "app:theme is now deprecated. Please move to using android:theme instead.");
            }
        }
        int i = resourceId;
        obtainStyledAttributes.recycle();
        return i != 0 ? ((context instanceof C0485d) && ((C0485d) context).m2267a() == i) ? context : new C0485d(context, i) : context;
    }

    private View m2126a(Context context, String str, AttributeSet attributeSet) {
        if (str.equals("view")) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            this.f954e[0] = context;
            this.f954e[1] = attributeSet;
            View a;
            if (-1 == str.indexOf(46)) {
                for (String a2 : f952c) {
                    a = m2127a(context, str, a2);
                    if (a != null) {
                        return a;
                    }
                }
                this.f954e[0] = null;
                this.f954e[1] = null;
                return null;
            }
            a = m2127a(context, str, null);
            this.f954e[0] = null;
            this.f954e[1] = null;
            return a;
        } catch (Exception e) {
            return null;
        } finally {
            this.f954e[0] = null;
            this.f954e[1] = null;
        }
    }

    private View m2127a(Context context, String str, String str2) {
        Constructor constructor = (Constructor) f953d.get(str);
        if (constructor == null) {
            try {
                constructor = context.getClassLoader().loadClass(str2 != null ? str2 + str : str).asSubclass(View.class).getConstructor(f950a);
                f953d.put(str, constructor);
            } catch (Exception e) {
                return null;
            }
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f954e);
    }

    private void m2128a(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if (!(context instanceof ContextWrapper)) {
            return;
        }
        if (VERSION.SDK_INT < 15 || ae.m1166v(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f951b);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new C0450a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final View m2129a(View view, String str, Context context, AttributeSet attributeSet, boolean z, boolean z2, boolean z3, boolean z4) {
        Context context2 = (!z || view == null) ? context : view.getContext();
        if (z2 || z3) {
            context2 = C0451o.m2125a(context2, attributeSet, z2, z3);
        }
        if (z4) {
            context2 = as.m2942a(context2);
        }
        View view2 = null;
        Object obj = -1;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    obj = 11;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    obj = 8;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    obj = 10;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    obj = null;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    obj = 5;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    obj = 12;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    obj = 4;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    obj = 7;
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    obj = 1;
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    obj = 9;
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    obj = 6;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    obj = 3;
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    obj = 2;
                    break;
                }
                break;
        }
        switch (obj) {
            case C0474j.View_android_theme /*0*/:
                view2 = new aa(context2, attributeSet);
                break;
            case C0474j.View_android_focusable /*1*/:
                view2 = new C0589p(context2, attributeSet);
                break;
            case C0474j.View_paddingStart /*2*/:
                view2 = new C0602h(context2, attributeSet);
                break;
            case C0474j.View_paddingEnd /*3*/:
                view2 = new C0611m(context2, attributeSet);
                break;
            case C0474j.View_theme /*4*/:
                view2 = new C0628x(context2, attributeSet);
                break;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                view2 = new C0612n(context2, attributeSet);
                break;
            case C0474j.Toolbar_contentInsetEnd /*6*/:
                view2 = new C0603i(context2, attributeSet);
                break;
            case C0474j.Toolbar_contentInsetLeft /*7*/:
                view2 = new C0618t(context2, attributeSet);
                break;
            case C0474j.Toolbar_contentInsetRight /*8*/:
                view2 = new C0604j(context2, attributeSet);
                break;
            case C0474j.Toolbar_contentInsetStartWithNavigation /*9*/:
                view2 = new C0547f(context2, attributeSet);
                break;
            case C0474j.Toolbar_contentInsetEndWithActions /*10*/:
                view2 = new C0614q(context2, attributeSet);
                break;
            case C0474j.Toolbar_popupTheme /*11*/:
                view2 = new C0619u(context2, attributeSet);
                break;
            case C0474j.Toolbar_titleTextAppearance /*12*/:
                view2 = new C0620v(context2, attributeSet);
                break;
        }
        View a = (view2 != null || context == context2) ? view2 : m2126a(context2, str, attributeSet);
        if (a != null) {
            m2128a(a, attributeSet);
        }
        return a;
    }
}
