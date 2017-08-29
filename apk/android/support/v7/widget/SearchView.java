package android.support.v7.widget;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.ResultReceiver;
import android.support.v4.p005b.p008a.C0105a;
import android.support.v4.p007g.C0173a;
import android.support.v4.p011e.C0154d;
import android.support.v4.p011e.C0155e;
import android.support.v4.widget.C0362f;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0468d;
import android.support.v7.p015b.C0475a.C0474j;
import android.support.v7.view.C0484c;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.TouchDelegate;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewConfiguration;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends ah implements C0484c {
    static final C0548a f1455i;
    private OnClickListener f1456A;
    private boolean f1457B;
    private boolean f1458C;
    private boolean f1459D;
    private CharSequence f1460E;
    private boolean f1461F;
    private boolean f1462G;
    private int f1463H;
    private boolean f1464I;
    private CharSequence f1465J;
    private boolean f1466K;
    private int f1467L;
    private Bundle f1468M;
    private Runnable f1469N;
    private final Runnable f1470O;
    private Runnable f1471P;
    private final WeakHashMap<String, ConstantState> f1472Q;
    final SearchAutoComplete f1473a;
    final ImageView f1474b;
    final ImageView f1475c;
    final ImageView f1476d;
    final ImageView f1477e;
    OnFocusChangeListener f1478f;
    C0362f f1479g;
    SearchableInfo f1480h;
    private final View f1481j;
    private final View f1482k;
    private C0554f f1483l;
    private Rect f1484m;
    private Rect f1485n;
    private int[] f1486o;
    private int[] f1487p;
    private final ImageView f1488q;
    private final Drawable f1489r;
    private final int f1490s;
    private final int f1491t;
    private final Intent f1492u;
    private final Intent f1493v;
    private final CharSequence f1494w;
    private C0550c f1495x;
    private C0549b f1496y;
    private C0551d f1497z;

    public static class SearchAutoComplete extends C0547f {
        private int f1442a;
        private SearchView f1443b;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C0465a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1442a = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int b = C0105a.m449b(getResources());
            int a = C0105a.m448a(getResources());
            return (b < 960 || a < 720 || configuration.orientation != 2) ? (b >= 600 || (b >= 640 && a >= 480)) ? 192 : 160 : 256;
        }

        public boolean enoughToFilter() {
            return this.f1442a <= 0 || super.enoughToFilter();
        }

        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        protected void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1443b.m2743g();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                DispatcherState keyDispatcherState;
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState == null) {
                        return true;
                    }
                    keyDispatcherState.startTracking(keyEvent, this);
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1443b.clearFocus();
                        this.f1443b.setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1443b.hasFocus() && getVisibility() == 0) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                if (SearchView.m2722a(getContext())) {
                    SearchView.f1455i.m2710a(this, true);
                }
            }
        }

        public void performCompletion() {
        }

        protected void replaceText(CharSequence charSequence) {
        }

        void setSearchView(SearchView searchView) {
            this.f1443b = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1442a = i;
        }
    }

    /* renamed from: android.support.v7.widget.SearchView.a */
    private static class C0548a {
        private Method f1444a;
        private Method f1445b;
        private Method f1446c;
        private Method f1447d;

        C0548a() {
            try {
                this.f1444a = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1444a.setAccessible(true);
            } catch (NoSuchMethodException e) {
            }
            try {
                this.f1445b = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1445b.setAccessible(true);
            } catch (NoSuchMethodException e2) {
            }
            try {
                this.f1446c = AutoCompleteTextView.class.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1446c.setAccessible(true);
            } catch (NoSuchMethodException e3) {
            }
            try {
                this.f1447d = InputMethodManager.class.getMethod("showSoftInputUnchecked", new Class[]{Integer.TYPE, ResultReceiver.class});
                this.f1447d.setAccessible(true);
            } catch (NoSuchMethodException e4) {
            }
        }

        void m2709a(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1444a != null) {
                try {
                    this.f1444a.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }

        void m2710a(AutoCompleteTextView autoCompleteTextView, boolean z) {
            if (this.f1446c != null) {
                try {
                    this.f1446c.invoke(autoCompleteTextView, new Object[]{Boolean.valueOf(z)});
                } catch (Exception e) {
                }
            }
        }

        void m2711b(AutoCompleteTextView autoCompleteTextView) {
            if (this.f1445b != null) {
                try {
                    this.f1445b.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception e) {
                }
            }
        }
    }

    /* renamed from: android.support.v7.widget.SearchView.b */
    public interface C0549b {
        boolean m2712a();
    }

    /* renamed from: android.support.v7.widget.SearchView.c */
    public interface C0550c {
        boolean m2713a(String str);
    }

    /* renamed from: android.support.v7.widget.SearchView.d */
    public interface C0551d {
    }

    /* renamed from: android.support.v7.widget.SearchView.e */
    static class C0553e extends C0173a {
        public static final Creator<C0553e> CREATOR;
        boolean f1448b;

        /* renamed from: android.support.v7.widget.SearchView.e.1 */
        static class C05521 implements C0155e<C0553e> {
            C05521() {
            }

            public /* synthetic */ Object m2714a(Parcel parcel, ClassLoader classLoader) {
                return m2716b(parcel, classLoader);
            }

            public /* synthetic */ Object[] m2715a(int i) {
                return m2717b(i);
            }

            public C0553e m2716b(Parcel parcel, ClassLoader classLoader) {
                return new C0553e(parcel, classLoader);
            }

            public C0553e[] m2717b(int i) {
                return new C0553e[i];
            }
        }

        static {
            CREATOR = C0154d.m600a(new C05521());
        }

        public C0553e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1448b = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        C0553e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1448b + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1448b));
        }
    }

    /* renamed from: android.support.v7.widget.SearchView.f */
    private static class C0554f extends TouchDelegate {
        private final View f1449a;
        private final Rect f1450b;
        private final Rect f1451c;
        private final Rect f1452d;
        private final int f1453e;
        private boolean f1454f;

        public C0554f(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1453e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f1450b = new Rect();
            this.f1452d = new Rect();
            this.f1451c = new Rect();
            m2718a(rect, rect2);
            this.f1449a = view;
        }

        public void m2718a(Rect rect, Rect rect2) {
            this.f1450b.set(rect);
            this.f1452d.set(rect);
            this.f1452d.inset(-this.f1453e, -this.f1453e);
            this.f1451c.set(rect2);
        }

        /* JADX WARNING: inconsistent code. */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            /*
            r6 = this;
            r1 = 1;
            r0 = 0;
            r2 = r7.getX();
            r3 = (int) r2;
            r2 = r7.getY();
            r4 = (int) r2;
            r2 = r7.getAction();
            switch(r2) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0048;
                case 2: goto L_0x0048;
                case 3: goto L_0x0056;
                default: goto L_0x0013;
            };
        L_0x0013:
            r2 = r0;
        L_0x0014:
            if (r2 == 0) goto L_0x003b;
        L_0x0016:
            if (r1 == 0) goto L_0x005b;
        L_0x0018:
            r0 = r6.f1451c;
            r0 = r0.contains(r3, r4);
            if (r0 != 0) goto L_0x005b;
        L_0x0020:
            r0 = r6.f1449a;
            r0 = r0.getWidth();
            r0 = r0 / 2;
            r0 = (float) r0;
            r1 = r6.f1449a;
            r1 = r1.getHeight();
            r1 = r1 / 2;
            r1 = (float) r1;
            r7.setLocation(r0, r1);
        L_0x0035:
            r0 = r6.f1449a;
            r0 = r0.dispatchTouchEvent(r7);
        L_0x003b:
            return r0;
        L_0x003c:
            r2 = r6.f1450b;
            r2 = r2.contains(r3, r4);
            if (r2 == 0) goto L_0x0013;
        L_0x0044:
            r6.f1454f = r1;
            r2 = r1;
            goto L_0x0014;
        L_0x0048:
            r2 = r6.f1454f;
            if (r2 == 0) goto L_0x0014;
        L_0x004c:
            r5 = r6.f1452d;
            r5 = r5.contains(r3, r4);
            if (r5 != 0) goto L_0x0014;
        L_0x0054:
            r1 = r0;
            goto L_0x0014;
        L_0x0056:
            r2 = r6.f1454f;
            r6.f1454f = r0;
            goto L_0x0014;
        L_0x005b:
            r0 = r6.f1451c;
            r0 = r0.left;
            r0 = r3 - r0;
            r0 = (float) r0;
            r1 = r6.f1451c;
            r1 = r1.top;
            r1 = r4 - r1;
            r1 = (float) r1;
            r7.setLocation(r0, r1);
            goto L_0x0035;
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.SearchView.f.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    static {
        f1455i = new C0548a();
    }

    private Intent m2719a(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1465J);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        if (this.f1468M != null) {
            intent.putExtra("app_data", this.f1468M);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1480h.getSearchActivity());
        return intent;
    }

    private void m2720a(View view, Rect rect) {
        view.getLocationInWindow(this.f1486o);
        getLocationInWindow(this.f1487p);
        int i = this.f1486o[1] - this.f1487p[1];
        int i2 = this.f1486o[0] - this.f1487p[0];
        rect.set(i2, i, view.getWidth() + i2, view.getHeight() + i);
    }

    private void m2721a(boolean z) {
        boolean z2 = true;
        int i = 8;
        this.f1458C = z;
        int i2 = z ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.f1473a.getText());
        this.f1474b.setVisibility(i2);
        m2724b(z3);
        this.f1481j.setVisibility(z ? 8 : 0);
        if (!(this.f1488q.getDrawable() == null || this.f1457B)) {
            i = 0;
        }
        this.f1488q.setVisibility(i);
        m2729m();
        if (z3) {
            z2 = false;
        }
        m2725c(z2);
        m2728l();
    }

    static boolean m2722a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private CharSequence m2723b(CharSequence charSequence) {
        if (!this.f1457B || this.f1489r == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1473a.getTextSize()) * 1.25d);
        this.f1489r.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1489r), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private void m2724b(boolean z) {
        int i = 8;
        if (this.f1459D && m2727k() && hasFocus() && (z || !this.f1464I)) {
            i = 0;
        }
        this.f1475c.setVisibility(i);
    }

    private void m2725c(boolean z) {
        int i;
        if (this.f1464I && !m2739c() && z) {
            i = 0;
            this.f1475c.setVisibility(8);
        } else {
            i = 8;
        }
        this.f1477e.setVisibility(i);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C0468d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C0468d.abc_search_view_preferred_width);
    }

    private boolean m2726i() {
        if (this.f1480h == null || !this.f1480h.getVoiceSearchEnabled()) {
            return false;
        }
        Intent intent = null;
        if (this.f1480h.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1492u;
        } else if (this.f1480h.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1493v;
        }
        return (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) ? false : true;
    }

    private boolean m2727k() {
        return (this.f1459D || this.f1464I) && !m2739c();
    }

    private void m2728l() {
        int i = 8;
        if (m2727k() && (this.f1475c.getVisibility() == 0 || this.f1477e.getVisibility() == 0)) {
            i = 0;
        }
        this.f1482k.setVisibility(i);
    }

    private void m2729m() {
        int i = 1;
        int i2 = 0;
        int i3 = !TextUtils.isEmpty(this.f1473a.getText()) ? 1 : 0;
        if (i3 == 0 && (!this.f1457B || this.f1466K)) {
            i = 0;
        }
        ImageView imageView = this.f1476d;
        if (i == 0) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.f1476d.getDrawable();
        if (drawable != null) {
            drawable.setState(i3 != 0 ? ENABLED_STATE_SET : EMPTY_STATE_SET);
        }
    }

    private void m2730n() {
        post(this.f1470O);
    }

    private void m2731o() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1473a;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m2723b(queryHint));
    }

    private void m2732p() {
        int i = 1;
        this.f1473a.setThreshold(this.f1480h.getSuggestThreshold());
        this.f1473a.setImeOptions(this.f1480h.getImeOptions());
        int inputType = this.f1480h.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1480h.getSuggestAuthority() != null) {
                inputType = (inputType | 65536) | 524288;
            }
        }
        this.f1473a.setInputType(inputType);
        if (this.f1479g != null) {
            this.f1479g.m1750a(null);
        }
        if (this.f1480h.getSuggestAuthority() != null) {
            this.f1479g = new ap(getContext(), this, this.f1480h, this.f1472Q);
            this.f1473a.setAdapter(this.f1479g);
            ap apVar = (ap) this.f1479g;
            if (this.f1461F) {
                i = 2;
            }
            apVar.m2931a(i);
        }
    }

    private void m2733q() {
        this.f1473a.dismissDropDown();
    }

    private void setQuery(CharSequence charSequence) {
        this.f1473a.setText(charSequence);
        this.f1473a.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    public void m2734a() {
        if (!this.f1466K) {
            this.f1466K = true;
            this.f1467L = this.f1473a.getImeOptions();
            this.f1473a.setImeOptions(this.f1467L | 33554432);
            this.f1473a.setText("");
            setIconified(false);
        }
    }

    void m2735a(int i, String str, String str2) {
        getContext().startActivity(m2719a("android.intent.action.SEARCH", null, null, str2, i, str));
    }

    void m2736a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void m2737a(CharSequence charSequence, boolean z) {
        this.f1473a.setText(charSequence);
        if (charSequence != null) {
            this.f1473a.setSelection(this.f1473a.length());
            this.f1465J = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            m2740d();
        }
    }

    public void m2738b() {
        m2737a((CharSequence) "", false);
        clearFocus();
        m2721a(true);
        this.f1473a.setImeOptions(this.f1467L);
        this.f1466K = false;
    }

    public boolean m2739c() {
        return this.f1458C;
    }

    public void clearFocus() {
        this.f1462G = true;
        setImeVisibility(false);
        super.clearFocus();
        this.f1473a.clearFocus();
        this.f1462G = false;
    }

    void m2740d() {
        CharSequence text = this.f1473a.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1495x == null || !this.f1495x.m2713a(text.toString())) {
                if (this.f1480h != null) {
                    m2735a(0, null, text.toString());
                }
                setImeVisibility(false);
                m2733q();
            }
        }
    }

    void m2741e() {
        if (!TextUtils.isEmpty(this.f1473a.getText())) {
            this.f1473a.setText("");
            this.f1473a.requestFocus();
            setImeVisibility(true);
        } else if (!this.f1457B) {
        } else {
            if (this.f1496y == null || !this.f1496y.m2712a()) {
                clearFocus();
                m2721a(true);
            }
        }
    }

    void m2742f() {
        m2721a(false);
        this.f1473a.requestFocus();
        setImeVisibility(true);
        if (this.f1456A != null) {
            this.f1456A.onClick(this);
        }
    }

    void m2743g() {
        m2721a(m2739c());
        m2730n();
        if (this.f1473a.hasFocus()) {
            m2744h();
        }
    }

    public int getImeOptions() {
        return this.f1473a.getImeOptions();
    }

    public int getInputType() {
        return this.f1473a.getInputType();
    }

    public int getMaxWidth() {
        return this.f1463H;
    }

    public CharSequence getQuery() {
        return this.f1473a.getText();
    }

    public CharSequence getQueryHint() {
        return this.f1460E != null ? this.f1460E : (this.f1480h == null || this.f1480h.getHintId() == 0) ? this.f1494w : getContext().getText(this.f1480h.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.f1491t;
    }

    int getSuggestionRowLayout() {
        return this.f1490s;
    }

    public C0362f getSuggestionsAdapter() {
        return this.f1479g;
    }

    void m2744h() {
        f1455i.m2709a(this.f1473a);
        f1455i.m2711b(this.f1473a);
    }

    protected void onDetachedFromWindow() {
        removeCallbacks(this.f1470O);
        post(this.f1471P);
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m2720a(this.f1473a, this.f1484m);
            this.f1485n.set(this.f1484m.left, 0, this.f1484m.right, i4 - i2);
            if (this.f1483l == null) {
                this.f1483l = new C0554f(this.f1485n, this.f1484m, this.f1473a);
                setTouchDelegate(this.f1483l);
                return;
            }
            this.f1483l.m2718a(this.f1485n, this.f1484m);
        }
    }

    protected void onMeasure(int i, int i2) {
        if (m2739c()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = MeasureSpec.getMode(i);
        int size = MeasureSpec.getSize(i);
        switch (mode) {
            case Integer.MIN_VALUE:
                if (this.f1463H <= 0) {
                    size = Math.min(getPreferredWidth(), size);
                    break;
                } else {
                    size = Math.min(this.f1463H, size);
                    break;
                }
            case C0474j.View_android_theme /*0*/:
                if (this.f1463H <= 0) {
                    size = getPreferredWidth();
                    break;
                } else {
                    size = this.f1463H;
                    break;
                }
            case 1073741824:
                if (this.f1463H > 0) {
                    size = Math.min(this.f1463H, size);
                    break;
                }
                break;
        }
        int mode2 = MeasureSpec.getMode(i2);
        mode = MeasureSpec.getSize(i2);
        switch (mode2) {
            case Integer.MIN_VALUE:
            case C0474j.View_android_theme /*0*/:
                mode = Math.min(getPreferredHeight(), mode);
                break;
        }
        super.onMeasure(MeasureSpec.makeMeasureSpec(size, 1073741824), MeasureSpec.makeMeasureSpec(mode, 1073741824));
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof C0553e) {
            C0553e c0553e = (C0553e) parcelable;
            super.onRestoreInstanceState(c0553e.m682a());
            m2721a(c0553e.f1448b);
            requestLayout();
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    protected Parcelable onSaveInstanceState() {
        Parcelable c0553e = new C0553e(super.onSaveInstanceState());
        c0553e.f1448b = m2739c();
        return c0553e;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m2730n();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1462G || !isFocusable()) {
            return false;
        }
        if (m2739c()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1473a.requestFocus(i, rect);
        if (requestFocus) {
            m2721a(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1468M = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m2741e();
        } else {
            m2742f();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1457B != z) {
            this.f1457B = z;
            m2721a(z);
            m2731o();
        }
    }

    public void setImeOptions(int i) {
        this.f1473a.setImeOptions(i);
    }

    void setImeVisibility(boolean z) {
        if (z) {
            post(this.f1469N);
            return;
        }
        removeCallbacks(this.f1469N);
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public void setInputType(int i) {
        this.f1473a.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1463H = i;
        requestLayout();
    }

    public void setOnCloseListener(C0549b c0549b) {
        this.f1496y = c0549b;
    }

    public void setOnQueryTextFocusChangeListener(OnFocusChangeListener onFocusChangeListener) {
        this.f1478f = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0550c c0550c) {
        this.f1495x = c0550c;
    }

    public void setOnSearchClickListener(OnClickListener onClickListener) {
        this.f1456A = onClickListener;
    }

    public void setOnSuggestionListener(C0551d c0551d) {
        this.f1497z = c0551d;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1460E = charSequence;
        m2731o();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.f1461F = z;
        if (this.f1479g instanceof ap) {
            ((ap) this.f1479g).m2931a(z ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1480h = searchableInfo;
        if (this.f1480h != null) {
            m2732p();
            m2731o();
        }
        this.f1464I = m2726i();
        if (this.f1464I) {
            this.f1473a.setPrivateImeOptions("nm");
        }
        m2721a(m2739c());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1459D = z;
        m2721a(m2739c());
    }

    public void setSuggestionsAdapter(C0362f c0362f) {
        this.f1479g = c0362f;
        this.f1473a.setAdapter(this.f1479g);
    }
}
