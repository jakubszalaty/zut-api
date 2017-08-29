package android.support.v4.p006a;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.p006a.C0071p.C0070a;
import android.support.v4.p007g.C0077n;
import android.support.v4.p007g.ae;
import android.support.v4.p011e.C0152c;
import android.support.v4.p012f.C0163c;
import android.support.v4.p012f.C0164d;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: android.support.v4.a.q */
final class C0078q extends C0071p implements C0077n {
    static final Interpolator f289A;
    static final Interpolator f290B;
    static final Interpolator f291C;
    static final Interpolator f292D;
    static boolean f293a;
    static final boolean f294b;
    static Field f295r;
    ArrayList<Runnable> f296c;
    Runnable[] f297d;
    boolean f298e;
    ArrayList<C0063k> f299f;
    ArrayList<C0063k> f300g;
    ArrayList<Integer> f301h;
    ArrayList<C0054f> f302i;
    ArrayList<C0063k> f303j;
    ArrayList<C0054f> f304k;
    ArrayList<Integer> f305l;
    ArrayList<C0070a> f306m;
    int f307n;
    C0065o f308o;
    C0060m f309p;
    C0063k f310q;
    boolean f311s;
    boolean f312t;
    boolean f313u;
    String f314v;
    boolean f315w;
    Bundle f316x;
    SparseArray<Parcelable> f317y;
    Runnable f318z;

    /* renamed from: android.support.v4.a.q.1 */
    class C00721 implements Runnable {
        final /* synthetic */ C0078q f281a;

        C00721(C0078q c0078q) {
            this.f281a = c0078q;
        }

        public void run() {
            this.f281a.m341d();
        }
    }

    /* renamed from: android.support.v4.a.q.a */
    static class C0073a implements AnimationListener {
        private AnimationListener f282a;
        private boolean f283b;
        View f284c;

        /* renamed from: android.support.v4.a.q.a.1 */
        class C00751 implements Runnable {
            final /* synthetic */ C0073a f287a;

            C00751(C0073a c0073a) {
                this.f287a = c0073a;
            }

            public void run() {
                ae.m1131a(this.f287a.f284c, 0, null);
            }
        }

        public C0073a(View view, Animation animation) {
            if (view != null && animation != null) {
                this.f284c = view;
            }
        }

        public C0073a(View view, Animation animation, AnimationListener animationListener) {
            if (view != null && animation != null) {
                this.f282a = animationListener;
                this.f284c = view;
                this.f283b = true;
            }
        }

        public void onAnimationEnd(Animation animation) {
            if (this.f284c != null && this.f283b) {
                if (ae.m1165u(this.f284c) || C0152c.m599a()) {
                    this.f284c.post(new C00751(this));
                } else {
                    ae.m1131a(this.f284c, 0, null);
                }
            }
            if (this.f282a != null) {
                this.f282a.onAnimationEnd(animation);
            }
        }

        public void onAnimationRepeat(Animation animation) {
            if (this.f282a != null) {
                this.f282a.onAnimationRepeat(animation);
            }
        }

        public void onAnimationStart(Animation animation) {
            if (this.f282a != null) {
                this.f282a.onAnimationStart(animation);
            }
        }
    }

    /* renamed from: android.support.v4.a.q.2 */
    class C00742 extends C0073a {
        final /* synthetic */ C0063k f285a;
        final /* synthetic */ C0078q f286b;

        C00742(C0078q c0078q, View view, Animation animation, C0063k c0063k) {
            this.f286b = c0078q;
            this.f285a = c0063k;
            super(view, animation);
        }

        public void onAnimationEnd(Animation animation) {
            super.onAnimationEnd(animation);
            if (this.f285a.f231c != null) {
                this.f285a.f231c = null;
                this.f286b.m316a(this.f285a, this.f285a.f232d, 0, 0, false);
            }
        }
    }

    /* renamed from: android.support.v4.a.q.b */
    static class C0076b {
        public static final int[] f288a;

        static {
            f288a = new int[]{16842755, 16842960, 16842961};
        }
    }

    static {
        boolean z = false;
        f293a = false;
        if (VERSION.SDK_INT >= 11) {
            z = true;
        }
        f294b = z;
        f295r = null;
        f289A = new DecelerateInterpolator(2.5f);
        f290B = new DecelerateInterpolator(1.5f);
        f291C = new AccelerateInterpolator(2.5f);
        f292D = new AccelerateInterpolator(1.5f);
    }

    C0078q() {
        this.f307n = 0;
        this.f316x = null;
        this.f317y = null;
        this.f318z = new C00721(this);
    }

    static Animation m294a(Context context, float f, float f2) {
        Animation alphaAnimation = new AlphaAnimation(f, f2);
        alphaAnimation.setInterpolator(f290B);
        alphaAnimation.setDuration(220);
        return alphaAnimation;
    }

    static Animation m295a(Context context, float f, float f2, float f3, float f4) {
        Animation animationSet = new AnimationSet(false);
        Animation scaleAnimation = new ScaleAnimation(f, f2, f, f2, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f289A);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        scaleAnimation = new AlphaAnimation(f3, f4);
        scaleAnimation.setInterpolator(f290B);
        scaleAnimation.setDuration(220);
        animationSet.addAnimation(scaleAnimation);
        return animationSet;
    }

    private void m296a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0164d("FragmentManager"));
        if (this.f308o != null) {
            try {
                this.f308o.m219a("  ", null, printWriter, new String[0]);
            } catch (Throwable e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                m319a("  ", null, printWriter, new String[0]);
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw runtimeException;
    }

    static boolean m297a(View view, Animation animation) {
        return VERSION.SDK_INT >= 19 && ae.m1144c(view) == 0 && ae.m1160p(view) && C0078q.m298a(animation);
    }

    static boolean m298a(Animation animation) {
        if (animation instanceof AlphaAnimation) {
            return true;
        }
        if (!(animation instanceof AnimationSet)) {
            return false;
        }
        List animations = ((AnimationSet) animation).getAnimations();
        for (int i = 0; i < animations.size(); i++) {
            if (animations.get(i) instanceof AlphaAnimation) {
                return true;
            }
        }
        return false;
    }

    public static int m299b(int i, boolean z) {
        switch (i) {
            case 4097:
                return z ? 1 : 2;
            case 4099:
                return z ? 5 : 6;
            case 8194:
                return z ? 3 : 4;
            default:
                return -1;
        }
    }

    private void m300b(View view, Animation animation) {
        if (view != null && animation != null && C0078q.m297a(view, animation)) {
            AnimationListener animationListener;
            try {
                if (f295r == null) {
                    f295r = Animation.class.getDeclaredField("mListener");
                    f295r.setAccessible(true);
                }
                animationListener = (AnimationListener) f295r.get(animation);
            } catch (Throwable e) {
                Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e);
                animationListener = null;
            } catch (Throwable e2) {
                Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
                animationListener = null;
            }
            ae.m1131a(view, 2, null);
            animation.setAnimationListener(new C0073a(view, animation, animationListener));
        }
    }

    public static int m301d(int i) {
        switch (i) {
            case 4097:
                return 8194;
            case 4099:
                return 4099;
            case 8194:
                return 4097;
            default:
                return 0;
        }
    }

    private void m302u() {
        if (this.f312t) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        } else if (this.f314v != null) {
            throw new IllegalStateException("Can not perform this action inside of " + this.f314v);
        }
    }

    public C0063k m303a(Bundle bundle, String str) {
        int i = bundle.getInt(str, -1);
        if (i == -1) {
            return null;
        }
        if (i >= this.f299f.size()) {
            m296a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        }
        C0063k c0063k = (C0063k) this.f299f.get(i);
        if (c0063k != null) {
            return c0063k;
        }
        m296a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i));
        return c0063k;
    }

    public C0063k m304a(String str) {
        int size;
        C0063k c0063k;
        if (!(this.f300g == null || str == null)) {
            for (size = this.f300g.size() - 1; size >= 0; size--) {
                c0063k = (C0063k) this.f300g.get(size);
                if (c0063k != null && str.equals(c0063k.f254z)) {
                    return c0063k;
                }
            }
        }
        if (!(this.f299f == null || str == null)) {
            for (size = this.f299f.size() - 1; size >= 0; size--) {
                c0063k = (C0063k) this.f299f.get(size);
                if (c0063k != null && str.equals(c0063k.f254z)) {
                    return c0063k;
                }
            }
        }
        return null;
    }

    public View m305a(View view, String str, Context context, AttributeSet attributeSet) {
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0076b.f288a);
        String string = attributeValue == null ? obtainStyledAttributes.getString(0) : attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string2 = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!C0063k.m140b(this.f308o.m230g(), string)) {
            return null;
        }
        int id = view != null ? view.getId() : 0;
        if (id == -1 && resourceId == -1 && string2 == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + string);
        }
        C0063k c0063k;
        C0063k b = resourceId != -1 ? m327b(resourceId) : null;
        if (b == null && string2 != null) {
            b = m304a(string2);
        }
        if (b == null && id != -1) {
            b = m327b(id);
        }
        if (f293a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + string + " existing=" + b);
        }
        if (b == null) {
            C0063k a = C0063k.m138a(context, string);
            a.f243o = true;
            a.f252x = resourceId != 0 ? resourceId : id;
            a.f253y = id;
            a.f254z = string2;
            a.f244p = true;
            a.f247s = this;
            a.f248t = this.f308o;
            a.m158a(this.f308o.m230g(), attributeSet, a.f233e);
            m317a(a, true);
            c0063k = a;
        } else if (b.f244p) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string2 + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + string);
        } else {
            b.f244p = true;
            b.f248t = this.f308o;
            if (!b.f207D) {
                b.m158a(this.f308o.m230g(), attributeSet, b.f233e);
            }
            c0063k = b;
        }
        if (this.f307n >= 1 || !c0063k.f243o) {
            m329b(c0063k);
        } else {
            m316a(c0063k, 1, 0, 0, false);
        }
        if (c0063k.f213J == null) {
            throw new IllegalStateException("Fragment " + string + " did not create a view.");
        }
        if (resourceId != 0) {
            c0063k.f213J.setId(resourceId);
        }
        if (c0063k.f213J.getTag() == null) {
            c0063k.f213J.setTag(string2);
        }
        return c0063k.f213J;
    }

    Animation m306a(C0063k c0063k, int i, boolean z, int i2) {
        Animation a = c0063k.m151a(i, z, c0063k.f211H);
        if (a != null) {
            return a;
        }
        if (c0063k.f211H != 0) {
            a = AnimationUtils.loadAnimation(this.f308o.m230g(), c0063k.f211H);
            if (a != null) {
                return a;
            }
        }
        if (i == 0) {
            return null;
        }
        int b = C0078q.m299b(i, z);
        if (b < 0) {
            return null;
        }
        switch (b) {
            case C0474j.View_android_focusable /*1*/:
                return C0078q.m295a(this.f308o.m230g(), 1.125f, 1.0f, 0.0f, 1.0f);
            case C0474j.View_paddingStart /*2*/:
                return C0078q.m295a(this.f308o.m230g(), 1.0f, 0.975f, 1.0f, 0.0f);
            case C0474j.View_paddingEnd /*3*/:
                return C0078q.m295a(this.f308o.m230g(), 0.975f, 1.0f, 0.0f, 1.0f);
            case C0474j.View_theme /*4*/:
                return C0078q.m295a(this.f308o.m230g(), 1.0f, 1.075f, 1.0f, 0.0f);
            case C0474j.Toolbar_contentInsetStart /*5*/:
                return C0078q.m294a(this.f308o.m230g(), 0.0f, 1.0f);
            case C0474j.Toolbar_contentInsetEnd /*6*/:
                return C0078q.m294a(this.f308o.m230g(), 1.0f, 0.0f);
            default:
                if (i2 == 0 && this.f308o.m227d()) {
                    i2 = this.f308o.m228e();
                }
                return i2 == 0 ? null : null;
        }
    }

    void m307a(int i, int i2, int i3, boolean z) {
        if (this.f308o == null && i != 0) {
            throw new IllegalStateException("No host");
        } else if (z || this.f307n != i) {
            this.f307n = i;
            if (this.f299f != null) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < this.f299f.size()) {
                    int a;
                    C0063k c0063k = (C0063k) this.f299f.get(i4);
                    if (c0063k != null) {
                        m316a(c0063k, i, i2, i3, false);
                        if (c0063k.f217N != null) {
                            a = i5 | c0063k.f217N.m408a();
                            i4++;
                            i5 = a;
                        }
                    }
                    a = i5;
                    i4++;
                    i5 = a;
                }
                if (i5 == 0) {
                    m335c();
                }
                if (this.f311s && this.f308o != null && this.f307n == 5) {
                    this.f308o.m226c();
                    this.f311s = false;
                }
            }
        }
    }

    public void m308a(int i, C0054f c0054f) {
        synchronized (this) {
            if (this.f304k == null) {
                this.f304k = new ArrayList();
            }
            int size = this.f304k.size();
            if (i < size) {
                if (f293a) {
                    Log.v("FragmentManager", "Setting back stack index " + i + " to " + c0054f);
                }
                this.f304k.set(i, c0054f);
            } else {
                while (size < i) {
                    this.f304k.add(null);
                    if (this.f305l == null) {
                        this.f305l = new ArrayList();
                    }
                    if (f293a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.f305l.add(Integer.valueOf(size));
                    size++;
                }
                if (f293a) {
                    Log.v("FragmentManager", "Adding back stack index " + i + " with " + c0054f);
                }
                this.f304k.add(c0054f);
            }
        }
    }

    void m309a(int i, boolean z) {
        m307a(i, 0, 0, z);
    }

    public void m310a(Configuration configuration) {
        if (this.f300g != null) {
            for (int i = 0; i < this.f300g.size(); i++) {
                C0063k c0063k = (C0063k) this.f300g.get(i);
                if (c0063k != null) {
                    c0063k.m159a(configuration);
                }
            }
        }
    }

    public void m311a(Bundle bundle, String str, C0063k c0063k) {
        if (c0063k.f235g < 0) {
            m296a(new IllegalStateException("Fragment " + c0063k + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, c0063k.f235g);
    }

    void m312a(Parcelable parcelable, C0079r c0079r) {
        if (parcelable != null) {
            C0081s c0081s = (C0081s) parcelable;
            if (c0081s.f321a != null) {
                List a;
                int size;
                int i;
                C0063k c0063k;
                List list;
                if (c0079r != null) {
                    a = c0079r.m361a();
                    List b = c0079r.m362b();
                    if (a != null) {
                        size = a.size();
                    } else {
                        boolean z = false;
                    }
                    for (i = 0; i < size; i++) {
                        c0063k = (C0063k) a.get(i);
                        if (f293a) {
                            Log.v("FragmentManager", "restoreAllState: re-attaching retained " + c0063k);
                        }
                        C0083t c0083t = c0081s.f321a[c0063k.f235g];
                        c0083t.f335l = c0063k;
                        c0063k.f234f = null;
                        c0063k.f246r = 0;
                        c0063k.f244p = false;
                        c0063k.f241m = false;
                        c0063k.f238j = null;
                        if (c0083t.f334k != null) {
                            c0083t.f334k.setClassLoader(this.f308o.m230g().getClassLoader());
                            c0063k.f234f = c0083t.f334k.getSparseParcelableArray("android:view_state");
                            c0063k.f233e = c0083t.f334k;
                        }
                    }
                    list = b;
                } else {
                    list = null;
                }
                this.f299f = new ArrayList(c0081s.f321a.length);
                if (this.f301h != null) {
                    this.f301h.clear();
                }
                int i2 = 0;
                while (i2 < c0081s.f321a.length) {
                    C0083t c0083t2 = c0081s.f321a[i2];
                    if (c0083t2 != null) {
                        C0079r c0079r2 = (list == null || i2 >= list.size()) ? null : (C0079r) list.get(i2);
                        c0063k = c0083t2.m367a(this.f308o, this.f310q, c0079r2);
                        if (f293a) {
                            Log.v("FragmentManager", "restoreAllState: active #" + i2 + ": " + c0063k);
                        }
                        this.f299f.add(c0063k);
                        c0083t2.f335l = null;
                    } else {
                        this.f299f.add(null);
                        if (this.f301h == null) {
                            this.f301h = new ArrayList();
                        }
                        if (f293a) {
                            Log.v("FragmentManager", "restoreAllState: avail #" + i2);
                        }
                        this.f301h.add(Integer.valueOf(i2));
                    }
                    i2++;
                }
                if (c0079r != null) {
                    a = c0079r.m361a();
                    if (a != null) {
                        i2 = a.size();
                    } else {
                        boolean z2 = false;
                    }
                    for (i = 0; i < i2; i++) {
                        c0063k = (C0063k) a.get(i);
                        if (c0063k.f239k >= 0) {
                            if (c0063k.f239k < this.f299f.size()) {
                                c0063k.f238j = (C0063k) this.f299f.get(c0063k.f239k);
                            } else {
                                Log.w("FragmentManager", "Re-attaching retained fragment " + c0063k + " target no longer exists: " + c0063k.f239k);
                                c0063k.f238j = null;
                            }
                        }
                    }
                }
                if (c0081s.f322b != null) {
                    this.f300g = new ArrayList(c0081s.f322b.length);
                    for (size = 0; size < c0081s.f322b.length; size++) {
                        c0063k = (C0063k) this.f299f.get(c0081s.f322b[size]);
                        if (c0063k == null) {
                            m296a(new IllegalStateException("No instantiated fragment for index #" + c0081s.f322b[size]));
                        }
                        c0063k.f241m = true;
                        if (f293a) {
                            Log.v("FragmentManager", "restoreAllState: added #" + size + ": " + c0063k);
                        }
                        if (this.f300g.contains(c0063k)) {
                            throw new IllegalStateException("Already added!");
                        }
                        this.f300g.add(c0063k);
                    }
                } else {
                    this.f300g = null;
                }
                if (c0081s.f323c != null) {
                    this.f302i = new ArrayList(c0081s.f323c.length);
                    for (int i3 = 0; i3 < c0081s.f323c.length; i3++) {
                        C0054f a2 = c0081s.f323c[i3].m131a(this);
                        if (f293a) {
                            Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + a2.f182p + "): " + a2);
                            a2.m128a("  ", new PrintWriter(new C0164d("FragmentManager")), false);
                        }
                        this.f302i.add(a2);
                        if (a2.f182p >= 0) {
                            m308a(a2.f182p, a2);
                        }
                    }
                    return;
                }
                this.f302i = null;
            }
        }
    }

    void m313a(C0054f c0054f) {
        if (this.f302i == null) {
            this.f302i = new ArrayList();
        }
        this.f302i.add(c0054f);
        m346f();
    }

    public void m314a(C0063k c0063k) {
        if (!c0063k.f215L) {
            return;
        }
        if (this.f298e) {
            this.f315w = true;
            return;
        }
        c0063k.f215L = false;
        m316a(c0063k, this.f307n, 0, 0, false);
    }

    public void m315a(C0063k c0063k, int i, int i2) {
        if (f293a) {
            Log.v("FragmentManager", "remove: " + c0063k + " nesting=" + c0063k.f246r);
        }
        boolean z = !c0063k.m167a();
        if (!c0063k.f205B || z) {
            if (this.f300g != null) {
                this.f300g.remove(c0063k);
            }
            if (c0063k.f208E && c0063k.f209F) {
                this.f311s = true;
            }
            c0063k.f241m = false;
            c0063k.f242n = true;
            m316a(c0063k, z ? 0 : 1, i, i2, false);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    void m316a(android.support.v4.p006a.C0063k r11, int r12, int r13, int r14, boolean r15) {
        /*
        r10 = this;
        r9 = 4;
        r6 = 3;
        r3 = 0;
        r5 = 1;
        r7 = 0;
        r0 = r11.f241m;
        if (r0 == 0) goto L_0x000d;
    L_0x0009:
        r0 = r11.f205B;
        if (r0 == 0) goto L_0x0010;
    L_0x000d:
        if (r12 <= r5) goto L_0x0010;
    L_0x000f:
        r12 = r5;
    L_0x0010:
        r0 = r11.f242n;
        if (r0 == 0) goto L_0x001a;
    L_0x0014:
        r0 = r11.f230b;
        if (r12 <= r0) goto L_0x001a;
    L_0x0018:
        r12 = r11.f230b;
    L_0x001a:
        r0 = r11.f215L;
        if (r0 == 0) goto L_0x0025;
    L_0x001e:
        r0 = r11.f230b;
        if (r0 >= r9) goto L_0x0025;
    L_0x0022:
        if (r12 <= r6) goto L_0x0025;
    L_0x0024:
        r12 = r6;
    L_0x0025:
        r0 = r11.f230b;
        if (r0 >= r12) goto L_0x02eb;
    L_0x0029:
        r0 = r11.f243o;
        if (r0 == 0) goto L_0x0032;
    L_0x002d:
        r0 = r11.f244p;
        if (r0 != 0) goto L_0x0032;
    L_0x0031:
        return;
    L_0x0032:
        r0 = r11.f231c;
        if (r0 == 0) goto L_0x0040;
    L_0x0036:
        r11.f231c = r7;
        r2 = r11.f232d;
        r0 = r10;
        r1 = r11;
        r4 = r3;
        r0.m316a(r1, r2, r3, r4, r5);
    L_0x0040:
        r0 = r11.f230b;
        switch(r0) {
            case 0: goto L_0x0080;
            case 1: goto L_0x0176;
            case 2: goto L_0x026d;
            case 3: goto L_0x0272;
            case 4: goto L_0x0293;
            default: goto L_0x0045;
        };
    L_0x0045:
        r0 = r11.f230b;
        if (r0 == r12) goto L_0x0031;
    L_0x0049:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveToState: Fragment state for ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " not updated inline; ";
        r1 = r1.append(r2);
        r2 = "expected state ";
        r1 = r1.append(r2);
        r1 = r1.append(r12);
        r2 = " found ";
        r1 = r1.append(r2);
        r2 = r11.f230b;
        r1 = r1.append(r2);
        r1 = r1.toString();
        android.util.Log.w(r0, r1);
        r11.f230b = r12;
        goto L_0x0031;
    L_0x0080:
        r0 = f293a;
        if (r0 == 0) goto L_0x009c;
    L_0x0084:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x009c:
        r0 = r11.f233e;
        if (r0 == 0) goto L_0x00e4;
    L_0x00a0:
        r0 = r11.f233e;
        r1 = r10.f308o;
        r1 = r1.m230g();
        r1 = r1.getClassLoader();
        r0.setClassLoader(r1);
        r0 = r11.f233e;
        r1 = "android:view_state";
        r0 = r0.getSparseParcelableArray(r1);
        r11.f234f = r0;
        r0 = r11.f233e;
        r1 = "android:target_state";
        r0 = r10.m303a(r0, r1);
        r11.f238j = r0;
        r0 = r11.f238j;
        if (r0 == 0) goto L_0x00d1;
    L_0x00c7:
        r0 = r11.f233e;
        r1 = "android:target_req_state";
        r0 = r0.getInt(r1, r3);
        r11.f240l = r0;
    L_0x00d1:
        r0 = r11.f233e;
        r1 = "android:user_visible_hint";
        r0 = r0.getBoolean(r1, r5);
        r11.f216M = r0;
        r0 = r11.f216M;
        if (r0 != 0) goto L_0x00e4;
    L_0x00df:
        r11.f215L = r5;
        if (r12 <= r6) goto L_0x00e4;
    L_0x00e3:
        r12 = r6;
    L_0x00e4:
        r0 = r10.f308o;
        r11.f248t = r0;
        r0 = r10.f310q;
        r11.f251w = r0;
        r0 = r10.f310q;
        if (r0 == 0) goto L_0x0124;
    L_0x00f0:
        r0 = r10.f310q;
        r0 = r0.f249u;
    L_0x00f4:
        r11.f247s = r0;
        r11.f210G = r3;
        r0 = r10.f308o;
        r0 = r0.m230g();
        r11.m157a(r0);
        r0 = r11.f210G;
        if (r0 != 0) goto L_0x012b;
    L_0x0105:
        r0 = new android.support.v4.a.ac;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " did not call through to super.onAttach()";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0124:
        r0 = r10.f308o;
        r0 = r0.m232i();
        goto L_0x00f4;
    L_0x012b:
        r0 = r11.f251w;
        if (r0 != 0) goto L_0x02ba;
    L_0x012f:
        r0 = r10.f308o;
        r0.m224b(r11);
    L_0x0134:
        r0 = r11.f207D;
        if (r0 != 0) goto L_0x02c1;
    L_0x0138:
        r0 = r11.f233e;
        r11.m194h(r0);
    L_0x013d:
        r11.f207D = r3;
        r0 = r11.f243o;
        if (r0 == 0) goto L_0x0176;
    L_0x0143:
        r0 = r11.f233e;
        r0 = r11.m170b(r0);
        r1 = r11.f233e;
        r0 = r11.m171b(r0, r7, r1);
        r11.f213J = r0;
        r0 = r11.f213J;
        if (r0 == 0) goto L_0x02d4;
    L_0x0155:
        r0 = r11.f213J;
        r11.f214K = r0;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 11;
        if (r0 < r1) goto L_0x02ca;
    L_0x015f:
        r0 = r11.f213J;
        android.support.v4.p007g.ae.m1138a(r0, r3);
    L_0x0164:
        r0 = r11.f204A;
        if (r0 == 0) goto L_0x016f;
    L_0x0168:
        r0 = r11.f213J;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x016f:
        r0 = r11.f213J;
        r1 = r11.f233e;
        r11.m164a(r0, r1);
    L_0x0176:
        if (r12 <= r5) goto L_0x026d;
    L_0x0178:
        r0 = f293a;
        if (r0 == 0) goto L_0x0194;
    L_0x017c:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0194:
        r0 = r11.f243o;
        if (r0 != 0) goto L_0x025d;
    L_0x0198:
        r0 = r11.f253y;
        if (r0 == 0) goto L_0x0421;
    L_0x019c:
        r0 = r11.f253y;
        r1 = -1;
        if (r0 != r1) goto L_0x01c2;
    L_0x01a1:
        r0 = new java.lang.IllegalArgumentException;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "Cannot create fragment ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r2 = " for a container view with no id";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        r10.m296a(r0);
    L_0x01c2:
        r0 = r10.f309p;
        r1 = r11.f253y;
        r0 = r0.m134a(r1);
        r0 = (android.view.ViewGroup) r0;
        if (r0 != 0) goto L_0x0211;
    L_0x01ce:
        r1 = r11.f245q;
        if (r1 != 0) goto L_0x0211;
    L_0x01d2:
        r1 = r11.m176c();	 Catch:{ NotFoundException -> 0x02d8 }
        r2 = r11.f253y;	 Catch:{ NotFoundException -> 0x02d8 }
        r1 = r1.getResourceName(r2);	 Catch:{ NotFoundException -> 0x02d8 }
    L_0x01dc:
        r2 = new java.lang.IllegalArgumentException;
        r4 = new java.lang.StringBuilder;
        r4.<init>();
        r8 = "No view found for id 0x";
        r4 = r4.append(r8);
        r8 = r11.f253y;
        r8 = java.lang.Integer.toHexString(r8);
        r4 = r4.append(r8);
        r8 = " (";
        r4 = r4.append(r8);
        r1 = r4.append(r1);
        r4 = ") for fragment ";
        r1 = r1.append(r4);
        r1 = r1.append(r11);
        r1 = r1.toString();
        r2.<init>(r1);
        r10.m296a(r2);
    L_0x0211:
        r11.f212I = r0;
        r1 = r11.f233e;
        r1 = r11.m170b(r1);
        r2 = r11.f233e;
        r1 = r11.m171b(r1, r0, r2);
        r11.f213J = r1;
        r1 = r11.f213J;
        if (r1 == 0) goto L_0x02e7;
    L_0x0225:
        r1 = r11.f213J;
        r11.f214K = r1;
        r1 = android.os.Build.VERSION.SDK_INT;
        r2 = 11;
        if (r1 < r2) goto L_0x02dd;
    L_0x022f:
        r1 = r11.f213J;
        android.support.v4.p007g.ae.m1138a(r1, r3);
    L_0x0234:
        if (r0 == 0) goto L_0x024b;
    L_0x0236:
        r1 = r10.m306a(r11, r13, r5, r14);
        if (r1 == 0) goto L_0x0246;
    L_0x023c:
        r2 = r11.f213J;
        r10.m300b(r2, r1);
        r2 = r11.f213J;
        r2.startAnimation(r1);
    L_0x0246:
        r1 = r11.f213J;
        r0.addView(r1);
    L_0x024b:
        r0 = r11.f204A;
        if (r0 == 0) goto L_0x0256;
    L_0x024f:
        r0 = r11.f213J;
        r1 = 8;
        r0.setVisibility(r1);
    L_0x0256:
        r0 = r11.f213J;
        r1 = r11.f233e;
        r11.m164a(r0, r1);
    L_0x025d:
        r0 = r11.f233e;
        r11.m196i(r0);
        r0 = r11.f213J;
        if (r0 == 0) goto L_0x026b;
    L_0x0266:
        r0 = r11.f233e;
        r11.m160a(r0);
    L_0x026b:
        r11.f233e = r7;
    L_0x026d:
        r0 = 2;
        if (r12 <= r0) goto L_0x0272;
    L_0x0270:
        r11.f230b = r6;
    L_0x0272:
        if (r12 <= r6) goto L_0x0293;
    L_0x0274:
        r0 = f293a;
        if (r0 == 0) goto L_0x0290;
    L_0x0278:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0290:
        r11.m214z();
    L_0x0293:
        if (r12 <= r9) goto L_0x0045;
    L_0x0295:
        r0 = f293a;
        if (r0 == 0) goto L_0x02b1;
    L_0x0299:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "moveto RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x02b1:
        r11.m141A();
        r11.f233e = r7;
        r11.f234f = r7;
        goto L_0x0045;
    L_0x02ba:
        r0 = r11.f251w;
        r0.m161a(r11);
        goto L_0x0134;
    L_0x02c1:
        r0 = r11.f233e;
        r11.m182d(r0);
        r11.f230b = r5;
        goto L_0x013d;
    L_0x02ca:
        r0 = r11.f213J;
        r0 = android.support.v4.p006a.aa.m77a(r0);
        r11.f213J = r0;
        goto L_0x0164;
    L_0x02d4:
        r11.f214K = r7;
        goto L_0x0176;
    L_0x02d8:
        r1 = move-exception;
        r1 = "unknown";
        goto L_0x01dc;
    L_0x02dd:
        r1 = r11.f213J;
        r1 = android.support.v4.p006a.aa.m77a(r1);
        r11.f213J = r1;
        goto L_0x0234;
    L_0x02e7:
        r11.f214K = r7;
        goto L_0x025d;
    L_0x02eb:
        r0 = r11.f230b;
        if (r0 <= r12) goto L_0x0045;
    L_0x02ef:
        r0 = r11.f230b;
        switch(r0) {
            case 1: goto L_0x02f6;
            case 2: goto L_0x0374;
            case 3: goto L_0x0353;
            case 4: goto L_0x0332;
            case 5: goto L_0x0310;
            default: goto L_0x02f4;
        };
    L_0x02f4:
        goto L_0x0045;
    L_0x02f6:
        if (r12 >= r5) goto L_0x0045;
    L_0x02f8:
        r0 = r10.f313u;
        if (r0 == 0) goto L_0x0307;
    L_0x02fc:
        r0 = r11.f231c;
        if (r0 == 0) goto L_0x0307;
    L_0x0300:
        r0 = r11.f231c;
        r11.f231c = r7;
        r0.clearAnimation();
    L_0x0307:
        r0 = r11.f231c;
        if (r0 == 0) goto L_0x03e3;
    L_0x030b:
        r11.f232d = r12;
        r12 = r5;
        goto L_0x0045;
    L_0x0310:
        r0 = 5;
        if (r12 >= r0) goto L_0x0332;
    L_0x0313:
        r0 = f293a;
        if (r0 == 0) goto L_0x032f;
    L_0x0317:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom RESUMED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x032f:
        r11.m143C();
    L_0x0332:
        if (r12 >= r9) goto L_0x0353;
    L_0x0334:
        r0 = f293a;
        if (r0 == 0) goto L_0x0350;
    L_0x0338:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STARTED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0350:
        r11.m144D();
    L_0x0353:
        if (r12 >= r6) goto L_0x0374;
    L_0x0355:
        r0 = f293a;
        if (r0 == 0) goto L_0x0371;
    L_0x0359:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom STOPPED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0371:
        r11.m145E();
    L_0x0374:
        r0 = 2;
        if (r12 >= r0) goto L_0x02f6;
    L_0x0377:
        r0 = f293a;
        if (r0 == 0) goto L_0x0393;
    L_0x037b:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom ACTIVITY_CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x0393:
        r0 = r11.f213J;
        if (r0 == 0) goto L_0x03a6;
    L_0x0397:
        r0 = r10.f308o;
        r0 = r0.m222a(r11);
        if (r0 == 0) goto L_0x03a6;
    L_0x039f:
        r0 = r11.f234f;
        if (r0 != 0) goto L_0x03a6;
    L_0x03a3:
        r10.m343e(r11);
    L_0x03a6:
        r11.m146F();
        r0 = r11.f213J;
        if (r0 == 0) goto L_0x03db;
    L_0x03ad:
        r0 = r11.f212I;
        if (r0 == 0) goto L_0x03db;
    L_0x03b1:
        r0 = r10.f307n;
        if (r0 <= 0) goto L_0x041f;
    L_0x03b5:
        r0 = r10.f313u;
        if (r0 != 0) goto L_0x041f;
    L_0x03b9:
        r0 = r10.m306a(r11, r13, r3, r14);
    L_0x03bd:
        if (r0 == 0) goto L_0x03d4;
    L_0x03bf:
        r1 = r11.f213J;
        r11.f231c = r1;
        r11.f232d = r12;
        r1 = r11.f213J;
        r2 = new android.support.v4.a.q$2;
        r2.<init>(r10, r1, r0, r11);
        r0.setAnimationListener(r2);
        r1 = r11.f213J;
        r1.startAnimation(r0);
    L_0x03d4:
        r0 = r11.f212I;
        r1 = r11.f213J;
        r0.removeView(r1);
    L_0x03db:
        r11.f212I = r7;
        r11.f213J = r7;
        r11.f214K = r7;
        goto L_0x02f6;
    L_0x03e3:
        r0 = f293a;
        if (r0 == 0) goto L_0x03ff;
    L_0x03e7:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r2 = "movefrom CREATED: ";
        r1 = r1.append(r2);
        r1 = r1.append(r11);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x03ff:
        r0 = r11.f207D;
        if (r0 != 0) goto L_0x0414;
    L_0x0403:
        r11.m147G();
    L_0x0406:
        r11.m148H();
        if (r15 != 0) goto L_0x0045;
    L_0x040b:
        r0 = r11.f207D;
        if (r0 != 0) goto L_0x0417;
    L_0x040f:
        r10.m339d(r11);
        goto L_0x0045;
    L_0x0414:
        r11.f230b = r3;
        goto L_0x0406;
    L_0x0417:
        r11.f248t = r7;
        r11.f251w = r7;
        r11.f247s = r7;
        goto L_0x0045;
    L_0x041f:
        r0 = r7;
        goto L_0x03bd;
    L_0x0421:
        r0 = r7;
        goto L_0x0211;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.q.a(android.support.v4.a.k, int, int, int, boolean):void");
    }

    public void m317a(C0063k c0063k, boolean z) {
        if (this.f300g == null) {
            this.f300g = new ArrayList();
        }
        if (f293a) {
            Log.v("FragmentManager", "add: " + c0063k);
        }
        m337c(c0063k);
        if (!c0063k.f205B) {
            if (this.f300g.contains(c0063k)) {
                throw new IllegalStateException("Fragment already added: " + c0063k);
            }
            this.f300g.add(c0063k);
            c0063k.f241m = true;
            c0063k.f242n = false;
            if (c0063k.f208E && c0063k.f209F) {
                this.f311s = true;
            }
            if (z) {
                m329b(c0063k);
            }
        }
    }

    public void m318a(C0065o c0065o, C0060m c0060m, C0063k c0063k) {
        if (this.f308o != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f308o = c0065o;
        this.f309p = c0060m;
        this.f310q = c0063k;
    }

    public void m319a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int i;
        C0063k c0063k;
        int i2 = 0;
        String str2 = str + "    ";
        if (this.f299f != null) {
            size = this.f299f.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.print("Active Fragments in ");
                printWriter.print(Integer.toHexString(System.identityHashCode(this)));
                printWriter.println(":");
                for (i = 0; i < size; i++) {
                    c0063k = (C0063k) this.f299f.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0063k);
                    if (c0063k != null) {
                        c0063k.m165a(str2, fileDescriptor, printWriter, strArr);
                    }
                }
            }
        }
        if (this.f300g != null) {
            size = this.f300g.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Added Fragments:");
                for (i = 0; i < size; i++) {
                    c0063k = (C0063k) this.f300g.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0063k.toString());
                }
            }
        }
        if (this.f303j != null) {
            size = this.f303j.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Fragments Created Menus:");
                for (i = 0; i < size; i++) {
                    c0063k = (C0063k) this.f303j.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0063k.toString());
                }
            }
        }
        if (this.f302i != null) {
            size = this.f302i.size();
            if (size > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack:");
                for (i = 0; i < size; i++) {
                    C0054f c0054f = (C0054f) this.f302i.get(i);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i);
                    printWriter.print(": ");
                    printWriter.println(c0054f.toString());
                    c0054f.m127a(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        synchronized (this) {
            if (this.f304k != null) {
                int size2 = this.f304k.size();
                if (size2 > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (i = 0; i < size2; i++) {
                        c0054f = (C0054f) this.f304k.get(i);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i);
                        printWriter.print(": ");
                        printWriter.println(c0054f);
                    }
                }
            }
            if (this.f305l != null && this.f305l.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.f305l.toArray()));
            }
        }
        if (this.f296c != null) {
            i = this.f296c.size();
            if (i > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                while (i2 < i) {
                    Runnable runnable = (Runnable) this.f296c.get(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i2);
                    printWriter.print(": ");
                    printWriter.println(runnable);
                    i2++;
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f308o);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f309p);
        if (this.f310q != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f310q);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f307n);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f312t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f313u);
        if (this.f311s) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f311s);
        }
        if (this.f314v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.f314v);
        }
        if (this.f301h != null && this.f301h.size() > 0) {
            printWriter.print(str);
            printWriter.print("  mAvailIndices: ");
            printWriter.println(Arrays.toString(this.f301h.toArray()));
        }
    }

    public void m320a(boolean z) {
        if (this.f300g != null) {
            for (int size = this.f300g.size() - 1; size >= 0; size--) {
                C0063k c0063k = (C0063k) this.f300g.get(size);
                if (c0063k != null) {
                    c0063k.m184d(z);
                }
            }
        }
    }

    public boolean m321a() {
        m302u();
        m333b();
        return m323a(this.f308o.m231h(), null, -1, 0);
    }

    boolean m322a(int i) {
        return this.f307n >= i;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    boolean m323a(android.os.Handler r12, java.lang.String r13, int r14, int r15) {
        /*
        r11 = this;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        r0 = r11.f302i;
        if (r0 != 0) goto L_0x0008;
    L_0x0007:
        return r3;
    L_0x0008:
        if (r13 != 0) goto L_0x003b;
    L_0x000a:
        if (r14 >= 0) goto L_0x003b;
    L_0x000c:
        r0 = r15 & 1;
        if (r0 != 0) goto L_0x003b;
    L_0x0010:
        r0 = r11.f302i;
        r0 = r0.size();
        r0 = r0 + -1;
        if (r0 < 0) goto L_0x0007;
    L_0x001a:
        r1 = r11.f302i;
        r0 = r1.remove(r0);
        r0 = (android.support.v4.p006a.C0054f) r0;
        r1 = new android.util.SparseArray;
        r1.<init>();
        r3 = new android.util.SparseArray;
        r3.<init>();
        r5 = r11.f307n;
        if (r5 < r2) goto L_0x0033;
    L_0x0030:
        r0.m126a(r1, r3);
    L_0x0033:
        r0.m118a(r2, r4, r1, r3);
        r11.m346f();
    L_0x0039:
        r3 = r2;
        goto L_0x0007;
    L_0x003b:
        r0 = -1;
        if (r13 != 0) goto L_0x0040;
    L_0x003e:
        if (r14 < 0) goto L_0x008f;
    L_0x0040:
        r0 = r11.f302i;
        r0 = r0.size();
        r1 = r0 + -1;
    L_0x0048:
        if (r1 < 0) goto L_0x005e;
    L_0x004a:
        r0 = r11.f302i;
        r0 = r0.get(r1);
        r0 = (android.support.v4.p006a.C0054f) r0;
        if (r13 == 0) goto L_0x0085;
    L_0x0054:
        r5 = r0.m120a();
        r5 = r13.equals(r5);
        if (r5 == 0) goto L_0x0085;
    L_0x005e:
        if (r1 < 0) goto L_0x0007;
    L_0x0060:
        r0 = r15 & 1;
        if (r0 == 0) goto L_0x008e;
    L_0x0064:
        r1 = r1 + -1;
    L_0x0066:
        if (r1 < 0) goto L_0x008e;
    L_0x0068:
        r0 = r11.f302i;
        r0 = r0.get(r1);
        r0 = (android.support.v4.p006a.C0054f) r0;
        if (r13 == 0) goto L_0x007c;
    L_0x0072:
        r5 = r0.m120a();
        r5 = r13.equals(r5);
        if (r5 != 0) goto L_0x0082;
    L_0x007c:
        if (r14 < 0) goto L_0x008e;
    L_0x007e:
        r0 = r0.f182p;
        if (r14 != r0) goto L_0x008e;
    L_0x0082:
        r1 = r1 + -1;
        goto L_0x0066;
    L_0x0085:
        if (r14 < 0) goto L_0x008b;
    L_0x0087:
        r0 = r0.f182p;
        if (r14 == r0) goto L_0x005e;
    L_0x008b:
        r1 = r1 + -1;
        goto L_0x0048;
    L_0x008e:
        r0 = r1;
    L_0x008f:
        r1 = r11.f302i;
        r1 = r1.size();
        r1 = r1 + -1;
        if (r0 == r1) goto L_0x0007;
    L_0x0099:
        r6 = new java.util.ArrayList;
        r6.<init>();
        r1 = r11.f302i;
        r1 = r1.size();
        r1 = r1 + -1;
    L_0x00a6:
        if (r1 <= r0) goto L_0x00b4;
    L_0x00a8:
        r5 = r11.f302i;
        r5 = r5.remove(r1);
        r6.add(r5);
        r1 = r1 + -1;
        goto L_0x00a6;
    L_0x00b4:
        r0 = r6.size();
        r7 = r0 + -1;
        r8 = new android.util.SparseArray;
        r8.<init>();
        r9 = new android.util.SparseArray;
        r9.<init>();
        r0 = r11.f307n;
        if (r0 < r2) goto L_0x00d8;
    L_0x00c8:
        r1 = r3;
    L_0x00c9:
        if (r1 > r7) goto L_0x00d8;
    L_0x00cb:
        r0 = r6.get(r1);
        r0 = (android.support.v4.p006a.C0054f) r0;
        r0.m126a(r8, r9);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00c9;
    L_0x00d8:
        r5 = r4;
        r4 = r3;
    L_0x00da:
        if (r4 > r7) goto L_0x0110;
    L_0x00dc:
        r0 = f293a;
        if (r0 == 0) goto L_0x00fc;
    L_0x00e0:
        r0 = "FragmentManager";
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r10 = "Popping back stack state: ";
        r1 = r1.append(r10);
        r10 = r6.get(r4);
        r1 = r1.append(r10);
        r1 = r1.toString();
        android.util.Log.v(r0, r1);
    L_0x00fc:
        r0 = r6.get(r4);
        r0 = (android.support.v4.p006a.C0054f) r0;
        if (r4 != r7) goto L_0x010e;
    L_0x0104:
        r1 = r2;
    L_0x0105:
        r1 = r0.m118a(r1, r5, r8, r9);
        r0 = r4 + 1;
        r4 = r0;
        r5 = r1;
        goto L_0x00da;
    L_0x010e:
        r1 = r3;
        goto L_0x0105;
    L_0x0110:
        r11.m346f();
        goto L_0x0039;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.q.a(android.os.Handler, java.lang.String, int, int):boolean");
    }

    public boolean m324a(Menu menu) {
        if (this.f300g == null) {
            return false;
        }
        boolean z = false;
        for (int i = 0; i < this.f300g.size(); i++) {
            C0063k c0063k = (C0063k) this.f300g.get(i);
            if (c0063k != null && c0063k.m179c(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean m325a(Menu menu, MenuInflater menuInflater) {
        boolean z;
        C0063k c0063k;
        int i = 0;
        ArrayList arrayList = null;
        if (this.f300g != null) {
            int i2 = 0;
            z = false;
            while (i2 < this.f300g.size()) {
                c0063k = (C0063k) this.f300g.get(i2);
                if (c0063k != null && c0063k.m174b(menu, menuInflater)) {
                    z = true;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c0063k);
                }
                i2++;
                z = z;
            }
        } else {
            z = false;
        }
        if (this.f303j != null) {
            while (i < this.f303j.size()) {
                c0063k = (C0063k) this.f303j.get(i);
                if (arrayList == null || !arrayList.contains(c0063k)) {
                    c0063k.m204p();
                }
                i++;
            }
        }
        this.f303j = arrayList;
        return z;
    }

    public boolean m326a(MenuItem menuItem) {
        if (this.f300g == null) {
            return false;
        }
        for (int i = 0; i < this.f300g.size(); i++) {
            C0063k c0063k = (C0063k) this.f300g.get(i);
            if (c0063k != null && c0063k.m180c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public C0063k m327b(int i) {
        int size;
        C0063k c0063k;
        if (this.f300g != null) {
            for (size = this.f300g.size() - 1; size >= 0; size--) {
                c0063k = (C0063k) this.f300g.get(size);
                if (c0063k != null && c0063k.f252x == i) {
                    return c0063k;
                }
            }
        }
        if (this.f299f != null) {
            for (size = this.f299f.size() - 1; size >= 0; size--) {
                c0063k = (C0063k) this.f299f.get(size);
                if (c0063k != null && c0063k.f252x == i) {
                    return c0063k;
                }
            }
        }
        return null;
    }

    public C0063k m328b(String str) {
        if (!(this.f299f == null || str == null)) {
            for (int size = this.f299f.size() - 1; size >= 0; size--) {
                C0063k c0063k = (C0063k) this.f299f.get(size);
                if (c0063k != null) {
                    c0063k = c0063k.m149a(str);
                    if (c0063k != null) {
                        return c0063k;
                    }
                }
            }
        }
        return null;
    }

    void m329b(C0063k c0063k) {
        m316a(c0063k, this.f307n, 0, 0, false);
    }

    public void m330b(C0063k c0063k, int i, int i2) {
        if (f293a) {
            Log.v("FragmentManager", "hide: " + c0063k);
        }
        if (!c0063k.f204A) {
            c0063k.f204A = true;
            if (c0063k.f213J != null) {
                Animation a = m306a(c0063k, i, false, i2);
                if (a != null) {
                    m300b(c0063k.f213J, a);
                    c0063k.f213J.startAnimation(a);
                }
                c0063k.f213J.setVisibility(8);
            }
            if (c0063k.f241m && c0063k.f208E && c0063k.f209F) {
                this.f311s = true;
            }
            c0063k.m166a(true);
        }
    }

    public void m331b(Menu menu) {
        if (this.f300g != null) {
            for (int i = 0; i < this.f300g.size(); i++) {
                C0063k c0063k = (C0063k) this.f300g.get(i);
                if (c0063k != null) {
                    c0063k.m183d(menu);
                }
            }
        }
    }

    public void m332b(boolean z) {
        if (this.f300g != null) {
            for (int size = this.f300g.size() - 1; size >= 0; size--) {
                C0063k c0063k = (C0063k) this.f300g.get(size);
                if (c0063k != null) {
                    c0063k.m187e(z);
                }
            }
        }
    }

    public boolean m333b() {
        return m341d();
    }

    public boolean m334b(MenuItem menuItem) {
        if (this.f300g == null) {
            return false;
        }
        for (int i = 0; i < this.f300g.size(); i++) {
            C0063k c0063k = (C0063k) this.f300g.get(i);
            if (c0063k != null && c0063k.m185d(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void m335c() {
        if (this.f299f != null) {
            for (int i = 0; i < this.f299f.size(); i++) {
                C0063k c0063k = (C0063k) this.f299f.get(i);
                if (c0063k != null) {
                    m314a(c0063k);
                }
            }
        }
    }

    public void m336c(int i) {
        synchronized (this) {
            this.f304k.set(i, null);
            if (this.f305l == null) {
                this.f305l = new ArrayList();
            }
            if (f293a) {
                Log.v("FragmentManager", "Freeing back stack index " + i);
            }
            this.f305l.add(Integer.valueOf(i));
        }
    }

    void m337c(C0063k c0063k) {
        if (c0063k.f235g < 0) {
            if (this.f301h == null || this.f301h.size() <= 0) {
                if (this.f299f == null) {
                    this.f299f = new ArrayList();
                }
                c0063k.m153a(this.f299f.size(), this.f310q);
                this.f299f.add(c0063k);
            } else {
                c0063k.m153a(((Integer) this.f301h.remove(this.f301h.size() - 1)).intValue(), this.f310q);
                this.f299f.set(c0063k.f235g, c0063k);
            }
            if (f293a) {
                Log.v("FragmentManager", "Allocated fragment index " + c0063k);
            }
        }
    }

    public void m338c(C0063k c0063k, int i, int i2) {
        if (f293a) {
            Log.v("FragmentManager", "show: " + c0063k);
        }
        if (c0063k.f204A) {
            c0063k.f204A = false;
            if (c0063k.f213J != null) {
                Animation a = m306a(c0063k, i, true, i2);
                if (a != null) {
                    m300b(c0063k.f213J, a);
                    c0063k.f213J.startAnimation(a);
                }
                c0063k.f213J.setVisibility(0);
            }
            if (c0063k.f241m && c0063k.f208E && c0063k.f209F) {
                this.f311s = true;
            }
            c0063k.m166a(false);
        }
    }

    void m339d(C0063k c0063k) {
        if (c0063k.f235g >= 0) {
            if (f293a) {
                Log.v("FragmentManager", "Freeing fragment index " + c0063k);
            }
            this.f299f.set(c0063k.f235g, null);
            if (this.f301h == null) {
                this.f301h = new ArrayList();
            }
            this.f301h.add(Integer.valueOf(c0063k.f235g));
            this.f308o.m218a(c0063k.f236h);
            c0063k.m202n();
        }
    }

    public void m340d(C0063k c0063k, int i, int i2) {
        if (f293a) {
            Log.v("FragmentManager", "detach: " + c0063k);
        }
        if (!c0063k.f205B) {
            c0063k.f205B = true;
            if (c0063k.f241m) {
                if (this.f300g != null) {
                    if (f293a) {
                        Log.v("FragmentManager", "remove from detach: " + c0063k);
                    }
                    this.f300g.remove(c0063k);
                }
                if (c0063k.f208E && c0063k.f209F) {
                    this.f311s = true;
                }
                c0063k.f241m = false;
                m316a(c0063k, 1, i, i2, false);
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m341d() {
        /*
        r6 = this;
        r2 = 1;
        r1 = 0;
        r0 = r6.f298e;
        if (r0 == 0) goto L_0x000e;
    L_0x0006:
        r0 = new java.lang.IllegalStateException;
        r1 = "FragmentManager is already executing transactions";
        r0.<init>(r1);
        throw r0;
    L_0x000e:
        r0 = android.os.Looper.myLooper();
        r3 = r6.f308o;
        r3 = r3.m231h();
        r3 = r3.getLooper();
        if (r0 == r3) goto L_0x0026;
    L_0x001e:
        r0 = new java.lang.IllegalStateException;
        r1 = "Must be called from main thread of fragment host";
        r0.<init>(r1);
        throw r0;
    L_0x0026:
        r0 = r1;
    L_0x0027:
        monitor-enter(r6);
        r3 = r6.f296c;	 Catch:{ all -> 0x0078 }
        if (r3 == 0) goto L_0x0034;
    L_0x002c:
        r3 = r6.f296c;	 Catch:{ all -> 0x0078 }
        r3 = r3.size();	 Catch:{ all -> 0x0078 }
        if (r3 != 0) goto L_0x0039;
    L_0x0034:
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        r6.m342e();
        return r0;
    L_0x0039:
        r0 = r6.f296c;	 Catch:{ all -> 0x0078 }
        r3 = r0.size();	 Catch:{ all -> 0x0078 }
        r0 = r6.f297d;	 Catch:{ all -> 0x0078 }
        if (r0 == 0) goto L_0x0048;
    L_0x0043:
        r0 = r6.f297d;	 Catch:{ all -> 0x0078 }
        r0 = r0.length;	 Catch:{ all -> 0x0078 }
        if (r0 >= r3) goto L_0x004c;
    L_0x0048:
        r0 = new java.lang.Runnable[r3];	 Catch:{ all -> 0x0078 }
        r6.f297d = r0;	 Catch:{ all -> 0x0078 }
    L_0x004c:
        r0 = r6.f296c;	 Catch:{ all -> 0x0078 }
        r4 = r6.f297d;	 Catch:{ all -> 0x0078 }
        r0.toArray(r4);	 Catch:{ all -> 0x0078 }
        r0 = r6.f296c;	 Catch:{ all -> 0x0078 }
        r0.clear();	 Catch:{ all -> 0x0078 }
        r0 = r6.f308o;	 Catch:{ all -> 0x0078 }
        r0 = r0.m231h();	 Catch:{ all -> 0x0078 }
        r4 = r6.f318z;	 Catch:{ all -> 0x0078 }
        r0.removeCallbacks(r4);	 Catch:{ all -> 0x0078 }
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        r6.f298e = r2;
        r0 = r1;
    L_0x0067:
        if (r0 >= r3) goto L_0x007b;
    L_0x0069:
        r4 = r6.f297d;
        r4 = r4[r0];
        r4.run();
        r4 = r6.f297d;
        r5 = 0;
        r4[r0] = r5;
        r0 = r0 + 1;
        goto L_0x0067;
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x0078 }
        throw r0;
    L_0x007b:
        r6.f298e = r1;
        r0 = r2;
        goto L_0x0027;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.a.q.d():boolean");
    }

    void m342e() {
        if (this.f315w) {
            int i = 0;
            for (int i2 = 0; i2 < this.f299f.size(); i2++) {
                C0063k c0063k = (C0063k) this.f299f.get(i2);
                if (!(c0063k == null || c0063k.f217N == null)) {
                    i |= c0063k.f217N.m408a();
                }
            }
            if (i == 0) {
                this.f315w = false;
                m335c();
            }
        }
    }

    void m343e(C0063k c0063k) {
        if (c0063k.f214K != null) {
            if (this.f317y == null) {
                this.f317y = new SparseArray();
            } else {
                this.f317y.clear();
            }
            c0063k.f214K.saveHierarchyState(this.f317y);
            if (this.f317y.size() > 0) {
                c0063k.f234f = this.f317y;
                this.f317y = null;
            }
        }
    }

    public void m344e(C0063k c0063k, int i, int i2) {
        if (f293a) {
            Log.v("FragmentManager", "attach: " + c0063k);
        }
        if (c0063k.f205B) {
            c0063k.f205B = false;
            if (!c0063k.f241m) {
                if (this.f300g == null) {
                    this.f300g = new ArrayList();
                }
                if (this.f300g.contains(c0063k)) {
                    throw new IllegalStateException("Fragment already added: " + c0063k);
                }
                if (f293a) {
                    Log.v("FragmentManager", "add from attach: " + c0063k);
                }
                this.f300g.add(c0063k);
                c0063k.f241m = true;
                if (c0063k.f208E && c0063k.f209F) {
                    this.f311s = true;
                }
                m316a(c0063k, this.f307n, i, i2, false);
            }
        }
    }

    Bundle m345f(C0063k c0063k) {
        Bundle bundle;
        if (this.f316x == null) {
            this.f316x = new Bundle();
        }
        c0063k.m198j(this.f316x);
        if (this.f316x.isEmpty()) {
            bundle = null;
        } else {
            bundle = this.f316x;
            this.f316x = null;
        }
        if (c0063k.f213J != null) {
            m343e(c0063k);
        }
        if (c0063k.f234f != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", c0063k.f234f);
        }
        if (!c0063k.f216M) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", c0063k.f216M);
        }
        return bundle;
    }

    void m346f() {
        if (this.f306m != null) {
            for (int i = 0; i < this.f306m.size(); i++) {
                ((C0070a) this.f306m.get(i)).m290a();
            }
        }
    }

    C0079r m347g() {
        List list;
        List list2;
        if (this.f299f != null) {
            int i = 0;
            list = null;
            list2 = null;
            while (i < this.f299f.size()) {
                ArrayList arrayList;
                C0063k c0063k = (C0063k) this.f299f.get(i);
                if (c0063k != null) {
                    boolean z;
                    if (c0063k.f206C) {
                        if (list2 == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(c0063k);
                        c0063k.f207D = true;
                        c0063k.f239k = c0063k.f238j != null ? c0063k.f238j.f235g : -1;
                        if (f293a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + c0063k);
                        }
                    }
                    if (c0063k.f249u != null) {
                        C0079r g = c0063k.f249u.m347g();
                        if (g != null) {
                            ArrayList arrayList2;
                            if (list == null) {
                                arrayList2 = new ArrayList();
                                for (int i2 = 0; i2 < i; i2++) {
                                    arrayList2.add(null);
                                }
                            } else {
                                arrayList2 = list;
                            }
                            arrayList2.add(g);
                            list = arrayList2;
                            z = true;
                            if (!(list == null || r0)) {
                                list.add(null);
                            }
                        }
                    }
                    z = false;
                    list.add(null);
                }
                i++;
                Object obj = arrayList;
            }
        } else {
            list = null;
            list2 = null;
        }
        return (list2 == null && list == null) ? null : new C0079r(list2, list);
    }

    Parcelable m348h() {
        C0056g[] c0056gArr = null;
        m341d();
        if (f294b) {
            this.f312t = true;
        }
        if (this.f299f == null || this.f299f.size() <= 0) {
            return null;
        }
        int size = this.f299f.size();
        C0083t[] c0083tArr = new C0083t[size];
        int i = 0;
        boolean z = false;
        while (i < size) {
            boolean z2;
            C0063k c0063k = (C0063k) this.f299f.get(i);
            if (c0063k != null) {
                if (c0063k.f235g < 0) {
                    m296a(new IllegalStateException("Failure saving state: active " + c0063k + " has cleared index: " + c0063k.f235g));
                }
                C0083t c0083t = new C0083t(c0063k);
                c0083tArr[i] = c0083t;
                if (c0063k.f230b <= 0 || c0083t.f334k != null) {
                    c0083t.f334k = c0063k.f233e;
                } else {
                    c0083t.f334k = m345f(c0063k);
                    if (c0063k.f238j != null) {
                        if (c0063k.f238j.f235g < 0) {
                            m296a(new IllegalStateException("Failure saving state: " + c0063k + " has target not in fragment manager: " + c0063k.f238j));
                        }
                        if (c0083t.f334k == null) {
                            c0083t.f334k = new Bundle();
                        }
                        m311a(c0083t.f334k, "android:target_state", c0063k.f238j);
                        if (c0063k.f240l != 0) {
                            c0083t.f334k.putInt("android:target_req_state", c0063k.f240l);
                        }
                    }
                }
                if (f293a) {
                    Log.v("FragmentManager", "Saved state of " + c0063k + ": " + c0083t.f334k);
                }
                z2 = true;
            } else {
                z2 = z;
            }
            i++;
            z = z2;
        }
        if (z) {
            int[] iArr;
            int i2;
            C0081s c0081s;
            if (this.f300g != null) {
                i = this.f300g.size();
                if (i > 0) {
                    iArr = new int[i];
                    for (i2 = 0; i2 < i; i2++) {
                        iArr[i2] = ((C0063k) this.f300g.get(i2)).f235g;
                        if (iArr[i2] < 0) {
                            m296a(new IllegalStateException("Failure saving state: active " + this.f300g.get(i2) + " has cleared index: " + iArr[i2]));
                        }
                        if (f293a) {
                            Log.v("FragmentManager", "saveAllState: adding fragment #" + i2 + ": " + this.f300g.get(i2));
                        }
                    }
                    if (this.f302i != null) {
                        i = this.f302i.size();
                        if (i > 0) {
                            c0056gArr = new C0056g[i];
                            for (i2 = 0; i2 < i; i2++) {
                                c0056gArr[i2] = new C0056g((C0054f) this.f302i.get(i2));
                                if (f293a) {
                                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f302i.get(i2));
                                }
                            }
                        }
                    }
                    c0081s = new C0081s();
                    c0081s.f321a = c0083tArr;
                    c0081s.f322b = iArr;
                    c0081s.f323c = c0056gArr;
                    return c0081s;
                }
            }
            iArr = null;
            if (this.f302i != null) {
                i = this.f302i.size();
                if (i > 0) {
                    c0056gArr = new C0056g[i];
                    for (i2 = 0; i2 < i; i2++) {
                        c0056gArr[i2] = new C0056g((C0054f) this.f302i.get(i2));
                        if (f293a) {
                            Log.v("FragmentManager", "saveAllState: adding back stack #" + i2 + ": " + this.f302i.get(i2));
                        }
                    }
                }
            }
            c0081s = new C0081s();
            c0081s.f321a = c0083tArr;
            c0081s.f322b = iArr;
            c0081s.f323c = c0056gArr;
            return c0081s;
        } else if (!f293a) {
            return null;
        } else {
            Log.v("FragmentManager", "saveAllState: no fragments!");
            return null;
        }
    }

    public void m349i() {
        this.f312t = false;
    }

    public void m350j() {
        this.f312t = false;
        m309a(1, false);
    }

    public void m351k() {
        this.f312t = false;
        m309a(2, false);
    }

    public void m352l() {
        this.f312t = false;
        m309a(4, false);
    }

    public void m353m() {
        this.f312t = false;
        m309a(5, false);
    }

    public void m354n() {
        m309a(4, false);
    }

    public void m355o() {
        this.f312t = true;
        m309a(3, false);
    }

    public void m356p() {
        m309a(2, false);
    }

    public void m357q() {
        m309a(1, false);
    }

    public void m358r() {
        this.f313u = true;
        m341d();
        m309a(0, false);
        this.f308o = null;
        this.f309p = null;
        this.f310q = null;
    }

    public void m359s() {
        if (this.f300g != null) {
            for (int i = 0; i < this.f300g.size(); i++) {
                C0063k c0063k = (C0063k) this.f300g.get(i);
                if (c0063k != null) {
                    c0063k.m142B();
                }
            }
        }
    }

    C0077n m360t() {
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        if (this.f310q != null) {
            C0163c.m650a(this.f310q, stringBuilder);
        } else {
            C0163c.m650a(this.f308o, stringBuilder);
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }
}
