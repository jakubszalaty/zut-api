package android.support.p001a.p002a;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.support.p001a.p002a.C0025c.C0024b;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.p005b.p008a.C0108d;
import android.support.v4.p012f.C0161a;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Stack;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@TargetApi(21)
/* renamed from: android.support.a.a.f */
public class C0034f extends C0021e {
    static final Mode f119a;
    private C0032f f120c;
    private PorterDuffColorFilter f121d;
    private ColorFilter f122e;
    private boolean f123f;
    private boolean f124g;
    private ConstantState f125h;
    private final float[] f126i;
    private final Matrix f127j;
    private final Rect f128k;

    /* renamed from: android.support.a.a.f.d */
    private static class C0027d {
        protected C0024b[] f61m;
        String f62n;
        int f63o;

        public C0027d() {
            this.f61m = null;
        }

        public C0027d(C0027d c0027d) {
            this.f61m = null;
            this.f62n = c0027d.f62n;
            this.f63o = c0027d.f63o;
            this.f61m = C0025c.m19a(c0027d.f61m);
        }

        public void m26a(Path path) {
            path.reset();
            if (this.f61m != null) {
                C0024b.m13a(this.f61m, path);
            }
        }

        public boolean m27a() {
            return false;
        }

        public String m28b() {
            return this.f62n;
        }
    }

    /* renamed from: android.support.a.a.f.a */
    private static class C0028a extends C0027d {
        public C0028a(C0028a c0028a) {
            super(c0028a);
        }

        private void m29a(TypedArray typedArray) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.n = string;
            }
            string = typedArray.getString(1);
            if (string != null) {
                this.m = C0025c.m18a(string);
            }
        }

        public void m30a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            if (C0026d.m24a(xmlPullParser, "pathData")) {
                TypedArray b = C0021e.m4b(resources, theme, attributeSet, C0016a.f43d);
                m29a(b);
                b.recycle();
            }
        }

        public boolean m31a() {
            return true;
        }
    }

    /* renamed from: android.support.a.a.f.b */
    private static class C0029b extends C0027d {
        int f64a;
        float f65b;
        int f66c;
        float f67d;
        int f68e;
        float f69f;
        float f70g;
        float f71h;
        float f72i;
        Cap f73j;
        Join f74k;
        float f75l;
        private int[] f76p;

        public C0029b() {
            this.f64a = 0;
            this.f65b = 0.0f;
            this.f66c = 0;
            this.f67d = 1.0f;
            this.f69f = 1.0f;
            this.f70g = 0.0f;
            this.f71h = 1.0f;
            this.f72i = 0.0f;
            this.f73j = Cap.BUTT;
            this.f74k = Join.MITER;
            this.f75l = 4.0f;
        }

        public C0029b(C0029b c0029b) {
            super(c0029b);
            this.f64a = 0;
            this.f65b = 0.0f;
            this.f66c = 0;
            this.f67d = 1.0f;
            this.f69f = 1.0f;
            this.f70g = 0.0f;
            this.f71h = 1.0f;
            this.f72i = 0.0f;
            this.f73j = Cap.BUTT;
            this.f74k = Join.MITER;
            this.f75l = 4.0f;
            this.f76p = c0029b.f76p;
            this.f64a = c0029b.f64a;
            this.f65b = c0029b.f65b;
            this.f67d = c0029b.f67d;
            this.f66c = c0029b.f66c;
            this.f68e = c0029b.f68e;
            this.f69f = c0029b.f69f;
            this.f70g = c0029b.f70g;
            this.f71h = c0029b.f71h;
            this.f72i = c0029b.f72i;
            this.f73j = c0029b.f73j;
            this.f74k = c0029b.f74k;
            this.f75l = c0029b.f75l;
        }

        private Cap m32a(int i, Cap cap) {
            switch (i) {
                case C0474j.View_android_theme /*0*/:
                    return Cap.BUTT;
                case C0474j.View_android_focusable /*1*/:
                    return Cap.ROUND;
                case C0474j.View_paddingStart /*2*/:
                    return Cap.SQUARE;
                default:
                    return cap;
            }
        }

        private Join m33a(int i, Join join) {
            switch (i) {
                case C0474j.View_android_theme /*0*/:
                    return Join.MITER;
                case C0474j.View_android_focusable /*1*/:
                    return Join.ROUND;
                case C0474j.View_paddingStart /*2*/:
                    return Join.BEVEL;
                default:
                    return join;
            }
        }

        private void m34a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f76p = null;
            if (C0026d.m24a(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.n = string;
                }
                string = typedArray.getString(2);
                if (string != null) {
                    this.m = C0025c.m18a(string);
                }
                this.f66c = C0026d.m25b(typedArray, xmlPullParser, "fillColor", 1, this.f66c);
                this.f69f = C0026d.m21a(typedArray, xmlPullParser, "fillAlpha", 12, this.f69f);
                this.f73j = m32a(C0026d.m22a(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f73j);
                this.f74k = m33a(C0026d.m22a(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f74k);
                this.f75l = C0026d.m21a(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f75l);
                this.f64a = C0026d.m25b(typedArray, xmlPullParser, "strokeColor", 3, this.f64a);
                this.f67d = C0026d.m21a(typedArray, xmlPullParser, "strokeAlpha", 11, this.f67d);
                this.f65b = C0026d.m21a(typedArray, xmlPullParser, "strokeWidth", 4, this.f65b);
                this.f71h = C0026d.m21a(typedArray, xmlPullParser, "trimPathEnd", 6, this.f71h);
                this.f72i = C0026d.m21a(typedArray, xmlPullParser, "trimPathOffset", 7, this.f72i);
                this.f70g = C0026d.m21a(typedArray, xmlPullParser, "trimPathStart", 5, this.f70g);
            }
        }

        public void m35a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray b = C0021e.m4b(resources, theme, attributeSet, C0016a.f42c);
            m34a(b, xmlPullParser);
            b.recycle();
        }
    }

    /* renamed from: android.support.a.a.f.c */
    private static class C0030c {
        final ArrayList<Object> f77a;
        float f78b;
        int f79c;
        private final Matrix f80d;
        private float f81e;
        private float f82f;
        private float f83g;
        private float f84h;
        private float f85i;
        private float f86j;
        private final Matrix f87k;
        private int[] f88l;
        private String f89m;

        public C0030c() {
            this.f80d = new Matrix();
            this.f77a = new ArrayList();
            this.f78b = 0.0f;
            this.f81e = 0.0f;
            this.f82f = 0.0f;
            this.f83g = 1.0f;
            this.f84h = 1.0f;
            this.f85i = 0.0f;
            this.f86j = 0.0f;
            this.f87k = new Matrix();
            this.f89m = null;
        }

        public C0030c(C0030c c0030c, C0161a<String, Object> c0161a) {
            this.f80d = new Matrix();
            this.f77a = new ArrayList();
            this.f78b = 0.0f;
            this.f81e = 0.0f;
            this.f82f = 0.0f;
            this.f83g = 1.0f;
            this.f84h = 1.0f;
            this.f85i = 0.0f;
            this.f86j = 0.0f;
            this.f87k = new Matrix();
            this.f89m = null;
            this.f78b = c0030c.f78b;
            this.f81e = c0030c.f81e;
            this.f82f = c0030c.f82f;
            this.f83g = c0030c.f83g;
            this.f84h = c0030c.f84h;
            this.f85i = c0030c.f85i;
            this.f86j = c0030c.f86j;
            this.f88l = c0030c.f88l;
            this.f89m = c0030c.f89m;
            this.f79c = c0030c.f79c;
            if (this.f89m != null) {
                c0161a.put(this.f89m, this);
            }
            this.f87k.set(c0030c.f87k);
            ArrayList arrayList = c0030c.f77a;
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof C0030c) {
                    this.f77a.add(new C0030c((C0030c) obj, c0161a));
                } else {
                    C0027d c0029b;
                    if (obj instanceof C0029b) {
                        c0029b = new C0029b((C0029b) obj);
                    } else if (obj instanceof C0028a) {
                        c0029b = new C0028a((C0028a) obj);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f77a.add(c0029b);
                    if (c0029b.f62n != null) {
                        c0161a.put(c0029b.f62n, c0029b);
                    }
                }
            }
        }

        private void m37a(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f88l = null;
            this.f78b = C0026d.m21a(typedArray, xmlPullParser, "rotation", 5, this.f78b);
            this.f81e = typedArray.getFloat(1, this.f81e);
            this.f82f = typedArray.getFloat(2, this.f82f);
            this.f83g = C0026d.m21a(typedArray, xmlPullParser, "scaleX", 3, this.f83g);
            this.f84h = C0026d.m21a(typedArray, xmlPullParser, "scaleY", 4, this.f84h);
            this.f85i = C0026d.m21a(typedArray, xmlPullParser, "translateX", 6, this.f85i);
            this.f86j = C0026d.m21a(typedArray, xmlPullParser, "translateY", 7, this.f86j);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f89m = string;
            }
            m39b();
        }

        private void m39b() {
            this.f87k.reset();
            this.f87k.postTranslate(-this.f81e, -this.f82f);
            this.f87k.postScale(this.f83g, this.f84h);
            this.f87k.postRotate(this.f78b, 0.0f, 0.0f);
            this.f87k.postTranslate(this.f85i + this.f81e, this.f86j + this.f82f);
        }

        public String m40a() {
            return this.f89m;
        }

        public void m41a(Resources resources, AttributeSet attributeSet, Theme theme, XmlPullParser xmlPullParser) {
            TypedArray b = C0021e.m4b(resources, theme, attributeSet, C0016a.f41b);
            m37a(b, xmlPullParser);
            b.recycle();
        }
    }

    /* renamed from: android.support.a.a.f.e */
    private static class C0031e {
        private static final Matrix f90k;
        final C0030c f91a;
        float f92b;
        float f93c;
        float f94d;
        float f95e;
        int f96f;
        String f97g;
        final C0161a<String, Object> f98h;
        private final Path f99i;
        private final Path f100j;
        private final Matrix f101l;
        private Paint f102m;
        private Paint f103n;
        private PathMeasure f104o;
        private int f105p;

        static {
            f90k = new Matrix();
        }

        public C0031e() {
            this.f101l = new Matrix();
            this.f92b = 0.0f;
            this.f93c = 0.0f;
            this.f94d = 0.0f;
            this.f95e = 0.0f;
            this.f96f = 255;
            this.f97g = null;
            this.f98h = new C0161a();
            this.f91a = new C0030c();
            this.f99i = new Path();
            this.f100j = new Path();
        }

        public C0031e(C0031e c0031e) {
            this.f101l = new Matrix();
            this.f92b = 0.0f;
            this.f93c = 0.0f;
            this.f94d = 0.0f;
            this.f95e = 0.0f;
            this.f96f = 255;
            this.f97g = null;
            this.f98h = new C0161a();
            this.f91a = new C0030c(c0031e.f91a, this.f98h);
            this.f99i = new Path(c0031e.f99i);
            this.f100j = new Path(c0031e.f100j);
            this.f92b = c0031e.f92b;
            this.f93c = c0031e.f93c;
            this.f94d = c0031e.f94d;
            this.f95e = c0031e.f95e;
            this.f105p = c0031e.f105p;
            this.f96f = c0031e.f96f;
            this.f97g = c0031e.f97g;
            if (c0031e.f97g != null) {
                this.f98h.put(c0031e.f97g, this);
            }
        }

        private static float m42a(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        private float m43a(Matrix matrix) {
            float[] fArr = new float[]{0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float hypot = (float) Math.hypot((double) fArr[0], (double) fArr[1]);
            float hypot2 = (float) Math.hypot((double) fArr[2], (double) fArr[3]);
            float a = C0031e.m42a(fArr[0], fArr[1], fArr[2], fArr[3]);
            hypot = Math.max(hypot, hypot2);
            return hypot > 0.0f ? Math.abs(a) / hypot : 0.0f;
        }

        private void m46a(C0030c c0030c, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            c0030c.f80d.set(matrix);
            c0030c.f80d.preConcat(c0030c.f87k);
            canvas.save();
            for (int i3 = 0; i3 < c0030c.f77a.size(); i3++) {
                Object obj = c0030c.f77a.get(i3);
                if (obj instanceof C0030c) {
                    m46a((C0030c) obj, c0030c.f80d, canvas, i, i2, colorFilter);
                } else if (obj instanceof C0027d) {
                    m47a(c0030c, (C0027d) obj, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        private void m47a(C0030c c0030c, C0027d c0027d, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            float f = ((float) i) / this.f94d;
            float f2 = ((float) i2) / this.f95e;
            float min = Math.min(f, f2);
            Matrix a = c0030c.f80d;
            this.f101l.set(a);
            this.f101l.postScale(f, f2);
            f = m43a(a);
            if (f != 0.0f) {
                c0027d.m26a(this.f99i);
                Path path = this.f99i;
                this.f100j.reset();
                if (c0027d.m27a()) {
                    this.f100j.addPath(path, this.f101l);
                    canvas.clipPath(this.f100j);
                    return;
                }
                Paint paint;
                C0029b c0029b = (C0029b) c0027d;
                if (!(c0029b.f70g == 0.0f && c0029b.f71h == 1.0f)) {
                    float f3 = (c0029b.f70g + c0029b.f72i) % 1.0f;
                    float f4 = (c0029b.f71h + c0029b.f72i) % 1.0f;
                    if (this.f104o == null) {
                        this.f104o = new PathMeasure();
                    }
                    this.f104o.setPath(this.f99i, false);
                    float length = this.f104o.getLength();
                    f3 *= length;
                    f4 *= length;
                    path.reset();
                    if (f3 > f4) {
                        this.f104o.getSegment(f3, length, path, true);
                        this.f104o.getSegment(0.0f, f4, path, true);
                    } else {
                        this.f104o.getSegment(f3, f4, path, true);
                    }
                    path.rLineTo(0.0f, 0.0f);
                }
                this.f100j.addPath(path, this.f101l);
                if (c0029b.f66c != 0) {
                    if (this.f103n == null) {
                        this.f103n = new Paint();
                        this.f103n.setStyle(Style.FILL);
                        this.f103n.setAntiAlias(true);
                    }
                    paint = this.f103n;
                    paint.setColor(C0034f.m63a(c0029b.f66c, c0029b.f69f));
                    paint.setColorFilter(colorFilter);
                    canvas.drawPath(this.f100j, paint);
                }
                if (c0029b.f64a != 0) {
                    if (this.f102m == null) {
                        this.f102m = new Paint();
                        this.f102m.setStyle(Style.STROKE);
                        this.f102m.setAntiAlias(true);
                    }
                    paint = this.f102m;
                    if (c0029b.f74k != null) {
                        paint.setStrokeJoin(c0029b.f74k);
                    }
                    if (c0029b.f73j != null) {
                        paint.setStrokeCap(c0029b.f73j);
                    }
                    paint.setStrokeMiter(c0029b.f75l);
                    paint.setColor(C0034f.m63a(c0029b.f64a, c0029b.f67d));
                    paint.setColorFilter(colorFilter);
                    paint.setStrokeWidth((f * min) * c0029b.f65b);
                    canvas.drawPath(this.f100j, paint);
                }
            }
        }

        public int m50a() {
            return this.f96f;
        }

        public void m51a(float f) {
            m52a((int) (255.0f * f));
        }

        public void m52a(int i) {
            this.f96f = i;
        }

        public void m53a(Canvas canvas, int i, int i2, ColorFilter colorFilter) {
            m46a(this.f91a, f90k, canvas, i, i2, colorFilter);
        }

        public float m54b() {
            return ((float) m50a()) / 255.0f;
        }
    }

    /* renamed from: android.support.a.a.f.f */
    private static class C0032f extends ConstantState {
        int f106a;
        C0031e f107b;
        ColorStateList f108c;
        Mode f109d;
        boolean f110e;
        Bitmap f111f;
        ColorStateList f112g;
        Mode f113h;
        int f114i;
        boolean f115j;
        boolean f116k;
        Paint f117l;

        public C0032f() {
            this.f108c = null;
            this.f109d = C0034f.f119a;
            this.f107b = new C0031e();
        }

        public C0032f(C0032f c0032f) {
            this.f108c = null;
            this.f109d = C0034f.f119a;
            if (c0032f != null) {
                this.f106a = c0032f.f106a;
                this.f107b = new C0031e(c0032f.f107b);
                if (c0032f.f107b.f103n != null) {
                    this.f107b.f103n = new Paint(c0032f.f107b.f103n);
                }
                if (c0032f.f107b.f102m != null) {
                    this.f107b.f102m = new Paint(c0032f.f107b.f102m);
                }
                this.f108c = c0032f.f108c;
                this.f109d = c0032f.f109d;
                this.f110e = c0032f.f110e;
            }
        }

        public Paint m55a(ColorFilter colorFilter) {
            if (!m58a() && colorFilter == null) {
                return null;
            }
            if (this.f117l == null) {
                this.f117l = new Paint();
                this.f117l.setFilterBitmap(true);
            }
            this.f117l.setAlpha(this.f107b.m50a());
            this.f117l.setColorFilter(colorFilter);
            return this.f117l;
        }

        public void m56a(int i, int i2) {
            this.f111f.eraseColor(0);
            this.f107b.m53a(new Canvas(this.f111f), i, i2, null);
        }

        public void m57a(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f111f, null, rect, m55a(colorFilter));
        }

        public boolean m58a() {
            return this.f107b.m50a() < 255;
        }

        public void m59b(int i, int i2) {
            if (this.f111f == null || !m62c(i, i2)) {
                this.f111f = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
                this.f116k = true;
            }
        }

        public boolean m60b() {
            return !this.f116k && this.f112g == this.f108c && this.f113h == this.f109d && this.f115j == this.f110e && this.f114i == this.f107b.m50a();
        }

        public void m61c() {
            this.f112g = this.f108c;
            this.f113h = this.f109d;
            this.f114i = this.f107b.m50a();
            this.f115j = this.f110e;
            this.f116k = false;
        }

        public boolean m62c(int i, int i2) {
            return i == this.f111f.getWidth() && i2 == this.f111f.getHeight();
        }

        public int getChangingConfigurations() {
            return this.f106a;
        }

        public Drawable newDrawable() {
            return new C0034f(this);
        }

        public Drawable newDrawable(Resources resources) {
            return new C0034f(this);
        }
    }

    /* renamed from: android.support.a.a.f.g */
    private static class C0033g extends ConstantState {
        private final ConstantState f118a;

        public C0033g(ConstantState constantState) {
            this.f118a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f118a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f118a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable c0034f = new C0034f();
            c0034f.b = (VectorDrawable) this.f118a.newDrawable();
            return c0034f;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c0034f = new C0034f();
            c0034f.b = (VectorDrawable) this.f118a.newDrawable(resources);
            return c0034f;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c0034f = new C0034f();
            c0034f.b = (VectorDrawable) this.f118a.newDrawable(resources, theme);
            return c0034f;
        }
    }

    static {
        f119a = Mode.SRC_IN;
    }

    C0034f() {
        this.f124g = true;
        this.f126i = new float[9];
        this.f127j = new Matrix();
        this.f128k = new Rect();
        this.f120c = new C0032f();
    }

    C0034f(C0032f c0032f) {
        this.f124g = true;
        this.f126i = new float[9];
        this.f127j = new Matrix();
        this.f128k = new Rect();
        this.f120c = c0032f;
        this.f121d = m70a(this.f121d, c0032f.f108c, c0032f.f109d);
    }

    static int m63a(int i, float f) {
        return (((int) (((float) Color.alpha(i)) * f)) << 24) | (16777215 & i);
    }

    private static Mode m64a(int i, Mode mode) {
        switch (i) {
            case C0474j.View_paddingEnd /*3*/:
                return Mode.SRC_OVER;
            case C0474j.Toolbar_contentInsetStart /*5*/:
                return Mode.SRC_IN;
            case C0474j.Toolbar_contentInsetStartWithNavigation /*9*/:
                return Mode.SRC_ATOP;
            case C0474j.Toolbar_titleMargin /*14*/:
                return Mode.MULTIPLY;
            case C0474j.Toolbar_titleMarginStart /*15*/:
                return Mode.SCREEN;
            case C0474j.Toolbar_titleMarginEnd /*16*/:
                return Mode.ADD;
            default:
                return mode;
        }
    }

    public static C0034f m65a(Resources resources, int i, Theme theme) {
        if (VERSION.SDK_INT >= 23) {
            C0034f c0034f = new C0034f();
            c0034f.b = C0108d.m457a(resources, i, theme);
            c0034f.f125h = new C0033g(c0034f.b.getConstantState());
            return c0034f;
        }
        try {
            int next;
            XmlPullParser xml = resources.getXml(i);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return C0034f.m66a(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (Throwable e) {
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (Throwable e2) {
            Log.e("VectorDrawableCompat", "parser error", e2);
            return null;
        }
    }

    public static C0034f m66a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0034f c0034f = new C0034f();
        c0034f.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0034f;
    }

    private void m67a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        C0032f c0032f = this.f120c;
        C0031e c0031e = c0032f.f107b;
        c0032f.f109d = C0034f.m64a(C0026d.m22a(typedArray, xmlPullParser, "tintMode", 6, -1), Mode.SRC_IN);
        ColorStateList colorStateList = typedArray.getColorStateList(1);
        if (colorStateList != null) {
            c0032f.f108c = colorStateList;
        }
        c0032f.f110e = C0026d.m23a(typedArray, xmlPullParser, "autoMirrored", 5, c0032f.f110e);
        c0031e.f94d = C0026d.m21a(typedArray, xmlPullParser, "viewportWidth", 7, c0031e.f94d);
        c0031e.f95e = C0026d.m21a(typedArray, xmlPullParser, "viewportHeight", 8, c0031e.f95e);
        if (c0031e.f94d <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (c0031e.f95e <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        } else {
            c0031e.f92b = typedArray.getDimension(3, c0031e.f92b);
            c0031e.f93c = typedArray.getDimension(2, c0031e.f93c);
            if (c0031e.f92b <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (c0031e.f93c <= 0.0f) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            } else {
                c0031e.m51a(C0026d.m21a(typedArray, xmlPullParser, "alpha", 4, c0031e.m54b()));
                String string = typedArray.getString(0);
                if (string != null) {
                    c0031e.f97g = string;
                    c0031e.f98h.put(string, c0031e);
                }
            }
        }
    }

    private boolean m68a() {
        return false;
    }

    private void m69b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0032f c0032f = this.f120c;
        C0031e c0031e = c0032f.f107b;
        Stack stack = new Stack();
        stack.push(c0031e.f91a);
        int eventType = xmlPullParser.getEventType();
        Object obj = 1;
        while (eventType != 1) {
            if (eventType == 2) {
                Object obj2;
                String name = xmlPullParser.getName();
                C0030c c0030c = (C0030c) stack.peek();
                if ("path".equals(name)) {
                    C0029b c0029b = new C0029b();
                    c0029b.m35a(resources, attributeSet, theme, xmlPullParser);
                    c0030c.f77a.add(c0029b);
                    if (c0029b.m28b() != null) {
                        c0031e.f98h.put(c0029b.m28b(), c0029b);
                    }
                    obj2 = null;
                    c0032f.f106a = c0029b.o | c0032f.f106a;
                } else if ("clip-path".equals(name)) {
                    C0028a c0028a = new C0028a();
                    c0028a.m30a(resources, attributeSet, theme, xmlPullParser);
                    c0030c.f77a.add(c0028a);
                    if (c0028a.m28b() != null) {
                        c0031e.f98h.put(c0028a.m28b(), c0028a);
                    }
                    c0032f.f106a |= c0028a.o;
                    obj2 = obj;
                } else {
                    if ("group".equals(name)) {
                        C0030c c0030c2 = new C0030c();
                        c0030c2.m41a(resources, attributeSet, theme, xmlPullParser);
                        c0030c.f77a.add(c0030c2);
                        stack.push(c0030c2);
                        if (c0030c2.m40a() != null) {
                            c0031e.f98h.put(c0030c2.m40a(), c0030c2);
                        }
                        c0032f.f106a |= c0030c2.f79c;
                    }
                    obj2 = obj;
                }
                obj = obj2;
            } else if (eventType == 3) {
                if ("group".equals(xmlPullParser.getName())) {
                    stack.pop();
                }
            }
            eventType = xmlPullParser.next();
        }
        if (obj != null) {
            StringBuffer stringBuffer = new StringBuffer();
            if (stringBuffer.length() > 0) {
                stringBuffer.append(" or ");
            }
            stringBuffer.append("path");
            throw new XmlPullParserException("no " + stringBuffer + " defined");
        }
    }

    PorterDuffColorFilter m70a(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, Mode mode) {
        return (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    Object m71a(String str) {
        return this.f120c.f107b.f98h.get(str);
    }

    void m72a(boolean z) {
        this.f124g = z;
    }

    public /* bridge */ /* synthetic */ void applyTheme(Theme theme) {
        super.applyTheme(theme);
    }

    public boolean canApplyTheme() {
        if (this.b != null) {
            C0129a.m547d(this.b);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        copyBounds(this.f128k);
        if (this.f128k.width() > 0 && this.f128k.height() > 0) {
            ColorFilter colorFilter = this.f122e == null ? this.f121d : this.f122e;
            canvas.getMatrix(this.f127j);
            this.f127j.getValues(this.f126i);
            float abs = Math.abs(this.f126i[0]);
            float abs2 = Math.abs(this.f126i[4]);
            float abs3 = Math.abs(this.f126i[1]);
            float abs4 = Math.abs(this.f126i[3]);
            if (!(abs3 == 0.0f && abs4 == 0.0f)) {
                abs2 = 1.0f;
                abs = 1.0f;
            }
            int height = (int) (abs2 * ((float) this.f128k.height()));
            int min = Math.min(2048, (int) (abs * ((float) this.f128k.width())));
            height = Math.min(2048, height);
            if (min > 0 && height > 0) {
                int save = canvas.save();
                canvas.translate((float) this.f128k.left, (float) this.f128k.top);
                if (m68a()) {
                    canvas.translate((float) this.f128k.width(), 0.0f);
                    canvas.scale(-1.0f, 1.0f);
                }
                this.f128k.offsetTo(0, 0);
                this.f120c.m59b(min, height);
                if (!this.f124g) {
                    this.f120c.m56a(min, height);
                } else if (!this.f120c.m60b()) {
                    this.f120c.m56a(min, height);
                    this.f120c.m61c();
                }
                this.f120c.m57a(canvas, colorFilter, this.f128k);
                canvas.restoreToCount(save);
            }
        }
    }

    public int getAlpha() {
        return this.b != null ? C0129a.m546c(this.b) : this.f120c.f107b.m50a();
    }

    public int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f120c.getChangingConfigurations();
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        if (this.b != null) {
            return new C0033g(this.b.getConstantState());
        }
        this.f120c.f106a = getChangingConfigurations();
        return this.f120c;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : (int) this.f120c.f107b.f93c;
    }

    public int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : (int) this.f120c.f107b.f92b;
    }

    public /* bridge */ /* synthetic */ int getLayoutDirection() {
        return super.getLayoutDirection();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        return this.b != null ? this.b.getOpacity() : -3;
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        if (this.b != null) {
            this.b.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0129a.m541a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0032f c0032f = this.f120c;
        c0032f.f107b = new C0031e();
        TypedArray b = C0021e.m4b(resources, theme, attributeSet, C0016a.f40a);
        m67a(b, xmlPullParser);
        b.recycle();
        c0032f.f106a = getChangingConfigurations();
        c0032f.f116k = true;
        m69b(resources, xmlPullParser, attributeSet, theme);
        this.f121d = m70a(this.f121d, c0032f.f108c, c0032f.f109d);
    }

    public void invalidateSelf() {
        if (this.b != null) {
            this.b.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isStateful() {
        return this.b != null ? this.b.isStateful() : super.isStateful() || !(this.f120c == null || this.f120c.f108c == null || !this.f120c.f108c.isStateful());
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
        } else if (!this.f123f && super.mutate() == this) {
            this.f120c = new C0032f(this.f120c);
            this.f123f = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        }
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.b != null) {
            return this.b.setState(iArr);
        }
        C0032f c0032f = this.f120c;
        if (c0032f.f108c == null || c0032f.f109d == null) {
            return false;
        }
        this.f121d = m70a(this.f121d, c0032f.f108c, c0032f.f109d);
        invalidateSelf();
        return true;
    }

    public void scheduleSelf(Runnable runnable, long j) {
        if (this.b != null) {
            this.b.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else if (this.f120c.f107b.m50a() != i) {
            this.f120c.f107b.m52a(i);
            invalidateSelf();
        }
    }

    public /* bridge */ /* synthetic */ void setAutoMirrored(boolean z) {
        super.setAutoMirrored(z);
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, Mode mode) {
        super.setColorFilter(i, mode);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.b != null) {
            this.b.setColorFilter(colorFilter);
            return;
        }
        this.f122e = colorFilter;
        invalidateSelf();
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        if (this.b != null) {
            C0129a.m537a(this.b, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0129a.m539a(this.b, colorStateList);
            return;
        }
        C0032f c0032f = this.f120c;
        if (c0032f.f108c != colorStateList) {
            c0032f.f108c = colorStateList;
            this.f121d = m70a(this.f121d, colorStateList, c0032f.f109d);
            invalidateSelf();
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0129a.m542a(this.b, mode);
            return;
        }
        C0032f c0032f = this.f120c;
        if (c0032f.f109d != mode) {
            c0032f.f109d = mode;
            this.f121d = m70a(this.f121d, c0032f.f108c, mode);
            invalidateSelf();
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        return this.b != null ? this.b.setVisible(z, z2) : super.setVisible(z, z2);
    }

    public void unscheduleSelf(Runnable runnable) {
        if (this.b != null) {
            this.b.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
