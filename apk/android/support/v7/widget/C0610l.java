package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.LayerDrawable;
import android.os.Build.VERSION;
import android.support.p001a.p002a.C0022b;
import android.support.p001a.p002a.C0034f;
import android.support.v4.p003c.C0146a;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.p005b.C0035a;
import android.support.v4.p012f.C0161a;
import android.support.v4.p012f.C0165e;
import android.support.v4.p012f.C0166f;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0467c;
import android.support.v7.p015b.C0475a.C0469e;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.v7.widget.l */
public final class C0610l {
    private static final Mode f1790a;
    private static C0610l f1791b;
    private static final C0608b f1792c;
    private static final int[] f1793d;
    private static final int[] f1794e;
    private static final int[] f1795f;
    private static final int[] f1796g;
    private static final int[] f1797h;
    private static final int[] f1798i;
    private WeakHashMap<Context, SparseArray<ColorStateList>> f1799j;
    private C0161a<String, C0606c> f1800k;
    private SparseArray<String> f1801l;
    private final Object f1802m;
    private final WeakHashMap<Context, C0165e<WeakReference<ConstantState>>> f1803n;
    private TypedValue f1804o;
    private boolean f1805p;

    /* renamed from: android.support.v7.widget.l.c */
    private interface C0606c {
        Drawable m3096a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme);
    }

    /* renamed from: android.support.v7.widget.l.a */
    private static class C0607a implements C0606c {
        C0607a() {
        }

        public Drawable m3097a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0022b.m6a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
                return null;
            }
        }
    }

    /* renamed from: android.support.v7.widget.l.b */
    private static class C0608b extends C0166f<Integer, PorterDuffColorFilter> {
        public C0608b(int i) {
            super(i);
        }

        private static int m3098b(int i, Mode mode) {
            return ((i + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter m3099a(int i, Mode mode) {
            return (PorterDuffColorFilter) m663a((Object) Integer.valueOf(C0608b.m3098b(i, mode)));
        }

        PorterDuffColorFilter m3100a(int i, Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return (PorterDuffColorFilter) m664a(Integer.valueOf(C0608b.m3098b(i, mode)), porterDuffColorFilter);
        }
    }

    /* renamed from: android.support.v7.widget.l.d */
    private static class C0609d implements C0606c {
        C0609d() {
        }

        public Drawable m3101a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
            try {
                return C0034f.m66a(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Throwable e) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e);
                return null;
            }
        }
    }

    static {
        f1790a = Mode.SRC_IN;
        f1792c = new C0608b(6);
        f1793d = new int[]{C0469e.abc_textfield_search_default_mtrl_alpha, C0469e.abc_textfield_default_mtrl_alpha, C0469e.abc_ab_share_pack_mtrl_alpha};
        f1794e = new int[]{C0469e.abc_ic_commit_search_api_mtrl_alpha, C0469e.abc_seekbar_tick_mark_material, C0469e.abc_ic_menu_share_mtrl_alpha, C0469e.abc_ic_menu_copy_mtrl_am_alpha, C0469e.abc_ic_menu_cut_mtrl_alpha, C0469e.abc_ic_menu_selectall_mtrl_alpha, C0469e.abc_ic_menu_paste_mtrl_am_alpha};
        f1795f = new int[]{C0469e.abc_textfield_activated_mtrl_alpha, C0469e.abc_textfield_search_activated_mtrl_alpha, C0469e.abc_cab_background_top_mtrl_alpha, C0469e.abc_text_cursor_material, C0469e.abc_text_select_handle_left_mtrl_dark, C0469e.abc_text_select_handle_middle_mtrl_dark, C0469e.abc_text_select_handle_right_mtrl_dark, C0469e.abc_text_select_handle_left_mtrl_light, C0469e.abc_text_select_handle_middle_mtrl_light, C0469e.abc_text_select_handle_right_mtrl_light};
        f1796g = new int[]{C0469e.abc_popup_background_mtrl_mult, C0469e.abc_cab_background_internal_bg, C0469e.abc_menu_hardkey_panel_mtrl_mult};
        f1797h = new int[]{C0469e.abc_tab_indicator_material, C0469e.abc_textfield_search_material};
        f1798i = new int[]{C0469e.abc_btn_check_material, C0469e.abc_btn_radio_material};
    }

    public C0610l() {
        this.f1802m = new Object();
        this.f1803n = new WeakHashMap(0);
    }

    private static long m3102a(TypedValue typedValue) {
        return (((long) typedValue.assetCookie) << 32) | ((long) typedValue.data);
    }

    private ColorStateList m3103a(Context context, ColorStateList colorStateList) {
        return m3121c(context, aq.m2935a(context, C0465a.colorButtonNormal), colorStateList);
    }

    static Mode m3104a(int i) {
        return i == C0469e.abc_switch_thumb_material ? Mode.MULTIPLY : null;
    }

    public static PorterDuffColorFilter m3105a(int i, Mode mode) {
        PorterDuffColorFilter a = f1792c.m3099a(i, mode);
        if (a != null) {
            return a;
        }
        a = new PorterDuffColorFilter(i, mode);
        f1792c.m3100a(i, mode, a);
        return a;
    }

    private static PorterDuffColorFilter m3106a(ColorStateList colorStateList, Mode mode, int[] iArr) {
        return (colorStateList == null || mode == null) ? null : C0610l.m3105a(colorStateList.getColorForState(iArr, 0), mode);
    }

    private Drawable m3107a(Context context, int i, boolean z, Drawable drawable) {
        ColorStateList b = m3131b(context, i);
        if (b != null) {
            if (ad.m2839b(drawable)) {
                drawable = drawable.mutate();
            }
            drawable = C0129a.m549f(drawable);
            C0129a.m539a(drawable, b);
            Mode a = C0610l.m3104a(i);
            if (a == null) {
                return drawable;
            }
            C0129a.m542a(drawable, a);
            return drawable;
        } else if (i == C0469e.abc_seekbar_track_material) {
            r0 = (LayerDrawable) drawable;
            C0610l.m3110a(r0.findDrawableByLayerId(16908288), aq.m2935a(context, C0465a.colorControlNormal), f1790a);
            C0610l.m3110a(r0.findDrawableByLayerId(16908303), aq.m2935a(context, C0465a.colorControlNormal), f1790a);
            C0610l.m3110a(r0.findDrawableByLayerId(16908301), aq.m2935a(context, C0465a.colorControlActivated), f1790a);
            return drawable;
        } else if (i != C0469e.abc_ratingbar_material && i != C0469e.abc_ratingbar_indicator_material && i != C0469e.abc_ratingbar_small_material) {
            return (C0610l.m3114a(context, i, drawable) || !z) ? drawable : null;
        } else {
            r0 = (LayerDrawable) drawable;
            C0610l.m3110a(r0.findDrawableByLayerId(16908288), aq.m2939c(context, C0465a.colorControlNormal), f1790a);
            C0610l.m3110a(r0.findDrawableByLayerId(16908303), aq.m2935a(context, C0465a.colorControlActivated), f1790a);
            C0610l.m3110a(r0.findDrawableByLayerId(16908301), aq.m2935a(context, C0465a.colorControlActivated), f1790a);
            return drawable;
        }
    }

    private Drawable m3108a(Context context, long j) {
        synchronized (this.f1802m) {
            C0165e c0165e = (C0165e) this.f1803n.get(context);
            if (c0165e == null) {
                return null;
            }
            WeakReference weakReference = (WeakReference) c0165e.m655a(j);
            if (weakReference != null) {
                ConstantState constantState = (ConstantState) weakReference.get();
                if (constantState != null) {
                    Drawable newDrawable = constantState.newDrawable(context.getResources());
                    return newDrawable;
                }
                c0165e.m659b(j);
            }
            return null;
        }
    }

    public static C0610l m3109a() {
        if (f1791b == null) {
            f1791b = new C0610l();
            C0610l.m3112a(f1791b);
        }
        return f1791b;
    }

    private static void m3110a(Drawable drawable, int i, Mode mode) {
        if (ad.m2839b(drawable)) {
            drawable = drawable.mutate();
        }
        if (mode == null) {
            mode = f1790a;
        }
        drawable.setColorFilter(C0610l.m3105a(i, mode));
    }

    static void m3111a(Drawable drawable, at atVar, int[] iArr) {
        if (!ad.m2839b(drawable) || drawable.mutate() == drawable) {
            if (atVar.f1687e || atVar.f1686d) {
                drawable.setColorFilter(C0610l.m3106a(atVar.f1687e ? atVar.f1684b : null, atVar.f1686d ? atVar.f1685c : f1790a, iArr));
            } else {
                drawable.clearColorFilter();
            }
            if (VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("AppCompatDrawableManager", "Mutated drawable is not the same instance as the input.");
    }

    private static void m3112a(C0610l c0610l) {
        int i = VERSION.SDK_INT;
        if (i < 23) {
            c0610l.m3113a("vector", new C0609d());
            if (i >= 11) {
                c0610l.m3113a("animated-vector", new C0607a());
            }
        }
    }

    private void m3113a(String str, C0606c c0606c) {
        if (this.f1800k == null) {
            this.f1800k = new C0161a();
        }
        this.f1800k.put(str, c0606c);
    }

    static boolean m3114a(Context context, int i, Drawable drawable) {
        int i2;
        Mode mode;
        boolean z;
        int i3;
        Mode mode2 = f1790a;
        if (C0610l.m3117a(f1793d, i)) {
            i2 = C0465a.colorControlNormal;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (C0610l.m3117a(f1795f, i)) {
            i2 = C0465a.colorControlActivated;
            mode = mode2;
            z = true;
            i3 = -1;
        } else if (C0610l.m3117a(f1796g, i)) {
            z = true;
            mode = Mode.MULTIPLY;
            i2 = 16842801;
            i3 = -1;
        } else if (i == C0469e.abc_list_divider_mtrl_alpha) {
            i2 = 16842800;
            i3 = Math.round(40.8f);
            mode = mode2;
            z = true;
        } else if (i == C0469e.abc_dialog_material_background) {
            i2 = 16842801;
            mode = mode2;
            z = true;
            i3 = -1;
        } else {
            i3 = -1;
            i2 = 0;
            mode = mode2;
            z = false;
        }
        if (!z) {
            return false;
        }
        if (ad.m2839b(drawable)) {
            drawable = drawable.mutate();
        }
        drawable.setColorFilter(C0610l.m3105a(aq.m2935a(context, i2), mode));
        if (i3 == -1) {
            return true;
        }
        drawable.setAlpha(i3);
        return true;
    }

    private boolean m3115a(Context context, long j, Drawable drawable) {
        ConstantState constantState = drawable.getConstantState();
        if (constantState == null) {
            return false;
        }
        synchronized (this.f1802m) {
            C0165e c0165e = (C0165e) this.f1803n.get(context);
            if (c0165e == null) {
                c0165e = new C0165e();
                this.f1803n.put(context, c0165e);
            }
            c0165e.m660b(j, new WeakReference(constantState));
        }
        return true;
    }

    private static boolean m3116a(Drawable drawable) {
        return (drawable instanceof C0034f) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private static boolean m3117a(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private ColorStateList m3118b(Context context, ColorStateList colorStateList) {
        return m3121c(context, 0, null);
    }

    private void m3119b(Context context) {
        if (!this.f1805p) {
            this.f1805p = true;
            Drawable a = m3127a(context, C0469e.abc_vector_test);
            if (a == null || !C0610l.m3116a(a)) {
                this.f1805p = false;
                throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
            }
        }
    }

    private void m3120b(Context context, int i, ColorStateList colorStateList) {
        if (this.f1799j == null) {
            this.f1799j = new WeakHashMap();
        }
        SparseArray sparseArray = (SparseArray) this.f1799j.get(context);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            this.f1799j.put(context, sparseArray);
        }
        sparseArray.append(i, colorStateList);
    }

    private ColorStateList m3121c(Context context, int i, ColorStateList colorStateList) {
        r1 = new int[4][];
        int[] iArr = new int[4];
        int a = aq.m2935a(context, C0465a.colorControlHighlight);
        int c = aq.m2939c(context, C0465a.colorButtonNormal);
        r1[0] = aq.f1671a;
        if (colorStateList != null) {
            c = colorStateList.getColorForState(r1[0], 0);
        }
        iArr[0] = c;
        r1[1] = aq.f1674d;
        iArr[1] = C0146a.m590a(a, colorStateList == null ? i : colorStateList.getColorForState(r1[1], 0));
        r1[2] = aq.f1672b;
        iArr[2] = C0146a.m590a(a, colorStateList == null ? i : colorStateList.getColorForState(r1[2], 0));
        r1[3] = aq.f1678h;
        if (colorStateList != null) {
            i = colorStateList.getColorForState(r1[3], 0);
        }
        iArr[3] = i;
        return new ColorStateList(r1, iArr);
    }

    private ColorStateList m3122c(Context context, ColorStateList colorStateList) {
        return m3121c(context, aq.m2935a(context, C0465a.colorAccent), colorStateList);
    }

    private Drawable m3123c(Context context, int i) {
        if (this.f1804o == null) {
            this.f1804o = new TypedValue();
        }
        TypedValue typedValue = this.f1804o;
        context.getResources().getValue(i, typedValue, true);
        long a = C0610l.m3102a(typedValue);
        Drawable a2 = m3108a(context, a);
        if (a2 == null) {
            if (i == C0469e.abc_cab_background_top_material) {
                a2 = new LayerDrawable(new Drawable[]{m3127a(context, C0469e.abc_cab_background_internal_bg), m3127a(context, C0469e.abc_cab_background_top_mtrl_alpha)});
            }
            if (a2 != null) {
                a2.setChangingConfigurations(typedValue.changingConfigurations);
                m3115a(context, a, a2);
            }
        }
        return a2;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m3124d(android.content.Context r10, int r11) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 2;
        r7 = 1;
        r0 = r9.f1800k;
        if (r0 == 0) goto L_0x00bf;
    L_0x0007:
        r0 = r9.f1800k;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00bf;
    L_0x000f:
        r0 = r9.f1801l;
        if (r0 == 0) goto L_0x002f;
    L_0x0013:
        r0 = r9.f1801l;
        r0 = r0.get(r11);
        r0 = (java.lang.String) r0;
        r2 = "appcompat_skip_skip";
        r2 = r2.equals(r0);
        if (r2 != 0) goto L_0x002d;
    L_0x0023:
        if (r0 == 0) goto L_0x0036;
    L_0x0025:
        r2 = r9.f1800k;
        r0 = r2.get(r0);
        if (r0 != 0) goto L_0x0036;
    L_0x002d:
        r0 = r1;
    L_0x002e:
        return r0;
    L_0x002f:
        r0 = new android.util.SparseArray;
        r0.<init>();
        r9.f1801l = r0;
    L_0x0036:
        r0 = r9.f1804o;
        if (r0 != 0) goto L_0x0041;
    L_0x003a:
        r0 = new android.util.TypedValue;
        r0.<init>();
        r9.f1804o = r0;
    L_0x0041:
        r2 = r9.f1804o;
        r0 = r10.getResources();
        r0.getValue(r11, r2, r7);
        r4 = android.support.v7.widget.C0610l.m3102a(r2);
        r1 = r9.m3108a(r10, r4);
        if (r1 == 0) goto L_0x0056;
    L_0x0054:
        r0 = r1;
        goto L_0x002e;
    L_0x0056:
        r3 = r2.string;
        if (r3 == 0) goto L_0x008a;
    L_0x005a:
        r3 = r2.string;
        r3 = r3.toString();
        r6 = ".xml";
        r3 = r3.endsWith(r6);
        if (r3 == 0) goto L_0x008a;
    L_0x0068:
        r3 = r0.getXml(r11);	 Catch:{ Exception -> 0x0082 }
        r6 = android.util.Xml.asAttributeSet(r3);	 Catch:{ Exception -> 0x0082 }
    L_0x0070:
        r0 = r3.next();	 Catch:{ Exception -> 0x0082 }
        if (r0 == r8) goto L_0x0078;
    L_0x0076:
        if (r0 != r7) goto L_0x0070;
    L_0x0078:
        if (r0 == r8) goto L_0x0095;
    L_0x007a:
        r0 = new org.xmlpull.v1.XmlPullParserException;	 Catch:{ Exception -> 0x0082 }
        r2 = "No start tag found";
        r0.<init>(r2);	 Catch:{ Exception -> 0x0082 }
        throw r0;	 Catch:{ Exception -> 0x0082 }
    L_0x0082:
        r0 = move-exception;
        r2 = "AppCompatDrawableManager";
        r3 = "Exception while inflating drawable";
        android.util.Log.e(r2, r3, r0);
    L_0x008a:
        r0 = r1;
    L_0x008b:
        if (r0 != 0) goto L_0x002e;
    L_0x008d:
        r1 = r9.f1801l;
        r2 = "appcompat_skip_skip";
        r1.append(r11, r2);
        goto L_0x002e;
    L_0x0095:
        r0 = r3.getName();	 Catch:{ Exception -> 0x0082 }
        r7 = r9.f1801l;	 Catch:{ Exception -> 0x0082 }
        r7.append(r11, r0);	 Catch:{ Exception -> 0x0082 }
        r7 = r9.f1800k;	 Catch:{ Exception -> 0x0082 }
        r0 = r7.get(r0);	 Catch:{ Exception -> 0x0082 }
        r0 = (android.support.v7.widget.C0610l.C0606c) r0;	 Catch:{ Exception -> 0x0082 }
        if (r0 == 0) goto L_0x00b0;
    L_0x00a8:
        r7 = r10.getTheme();	 Catch:{ Exception -> 0x0082 }
        r1 = r0.m3096a(r10, r3, r6, r7);	 Catch:{ Exception -> 0x0082 }
    L_0x00b0:
        if (r1 == 0) goto L_0x00bd;
    L_0x00b2:
        r0 = r2.changingConfigurations;	 Catch:{ Exception -> 0x0082 }
        r1.setChangingConfigurations(r0);	 Catch:{ Exception -> 0x0082 }
        r0 = r9.m3115a(r10, r4, r1);	 Catch:{ Exception -> 0x0082 }
        if (r0 == 0) goto L_0x00bd;
    L_0x00bd:
        r0 = r1;
        goto L_0x008b;
    L_0x00bf:
        r0 = r1;
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.l.d(android.content.Context, int):android.graphics.drawable.Drawable");
    }

    private ColorStateList m3125e(Context context, int i) {
        if (this.f1799j == null) {
            return null;
        }
        SparseArray sparseArray = (SparseArray) this.f1799j.get(context);
        return sparseArray != null ? (ColorStateList) sparseArray.get(i) : null;
    }

    ColorStateList m3126a(Context context, int i, ColorStateList colorStateList) {
        Object obj = colorStateList == null ? 1 : null;
        ColorStateList e = obj != null ? m3125e(context, i) : null;
        if (e == null) {
            if (i == C0469e.abc_edit_text_material) {
                e = C0478b.m2243a(context, C0467c.abc_tint_edittext);
            } else if (i == C0469e.abc_switch_track_mtrl_alpha) {
                e = C0478b.m2243a(context, C0467c.abc_tint_switch_track);
            } else if (i == C0469e.abc_switch_thumb_material) {
                e = C0478b.m2243a(context, C0467c.abc_tint_switch_thumb);
            } else if (i == C0469e.abc_btn_default_mtrl_shape) {
                e = m3103a(context, colorStateList);
            } else if (i == C0469e.abc_btn_borderless_material) {
                e = m3118b(context, colorStateList);
            } else if (i == C0469e.abc_btn_colored_material) {
                e = m3122c(context, colorStateList);
            } else if (i == C0469e.abc_spinner_mtrl_am_alpha || i == C0469e.abc_spinner_textfield_background_material) {
                e = C0478b.m2243a(context, C0467c.abc_tint_spinner);
            } else if (C0610l.m3117a(f1794e, i)) {
                e = aq.m2938b(context, C0465a.colorControlNormal);
            } else if (C0610l.m3117a(f1797h, i)) {
                e = C0478b.m2243a(context, C0467c.abc_tint_default);
            } else if (C0610l.m3117a(f1798i, i)) {
                e = C0478b.m2243a(context, C0467c.abc_tint_btn_checkable);
            } else if (i == C0469e.abc_seekbar_thumb_material) {
                e = C0478b.m2243a(context, C0467c.abc_tint_seek_thumb);
            }
            if (!(obj == null || e == null)) {
                m3120b(context, i, e);
            }
        }
        return e;
    }

    public Drawable m3127a(Context context, int i) {
        return m3128a(context, i, false);
    }

    Drawable m3128a(Context context, int i, boolean z) {
        m3119b(context);
        Drawable d = m3124d(context, i);
        if (d == null) {
            d = m3123c(context, i);
        }
        if (d == null) {
            d = C0035a.m73a(context, i);
        }
        if (d != null) {
            d = m3107a(context, i, z, d);
        }
        if (d != null) {
            ad.m2838a(d);
        }
        return d;
    }

    Drawable m3129a(Context context, ax axVar, int i) {
        Drawable d = m3124d(context, i);
        if (d == null) {
            d = axVar.m3013a(i);
        }
        return d != null ? m3107a(context, i, false, d) : null;
    }

    public void m3130a(Context context) {
        synchronized (this.f1802m) {
            C0165e c0165e = (C0165e) this.f1803n.get(context);
            if (c0165e != null) {
                c0165e.m661c();
            }
        }
    }

    ColorStateList m3131b(Context context, int i) {
        return m3126a(context, i, null);
    }
}
