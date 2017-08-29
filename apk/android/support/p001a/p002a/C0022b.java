package android.support.p001a.p002a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.support.v4.p003c.p004a.C0129a;
import android.support.v4.p012f.C0161a;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

@TargetApi(21)
/* renamed from: android.support.a.a.b */
public class C0022b extends C0021e implements Animatable {
    final Callback f53a;
    private C0018a f54c;
    private Context f55d;
    private ArgbEvaluator f56e;

    /* renamed from: android.support.a.a.b.1 */
    class C00171 implements Callback {
        final /* synthetic */ C0022b f46a;

        C00171(C0022b c0022b) {
            this.f46a = c0022b;
        }

        public void invalidateDrawable(Drawable drawable) {
            this.f46a.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            this.f46a.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            this.f46a.unscheduleSelf(runnable);
        }
    }

    /* renamed from: android.support.a.a.b.a */
    private static class C0018a extends ConstantState {
        int f47a;
        C0034f f48b;
        ArrayList<Animator> f49c;
        C0161a<Animator, String> f50d;

        public C0018a(Context context, C0018a c0018a, Callback callback, Resources resources) {
            int i = 0;
            if (c0018a != null) {
                this.f47a = c0018a.f47a;
                if (c0018a.f48b != null) {
                    ConstantState constantState = c0018a.f48b.getConstantState();
                    if (resources != null) {
                        this.f48b = (C0034f) constantState.newDrawable(resources);
                    } else {
                        this.f48b = (C0034f) constantState.newDrawable();
                    }
                    this.f48b = (C0034f) this.f48b.mutate();
                    this.f48b.setCallback(callback);
                    this.f48b.setBounds(c0018a.f48b.getBounds());
                    this.f48b.m72a(false);
                }
                if (c0018a.f49c != null) {
                    int size = c0018a.f49c.size();
                    this.f49c = new ArrayList(size);
                    this.f50d = new C0161a(size);
                    while (i < size) {
                        Animator animator = (Animator) c0018a.f49c.get(i);
                        Animator clone = animator.clone();
                        String str = (String) c0018a.f50d.get(animator);
                        clone.setTarget(this.f48b.m71a(str));
                        this.f49c.add(clone);
                        this.f50d.put(clone, str);
                        i++;
                    }
                }
            }
        }

        public int getChangingConfigurations() {
            return this.f47a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 23.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 23.");
        }
    }

    /* renamed from: android.support.a.a.b.b */
    private static class C0019b extends ConstantState {
        private final ConstantState f51a;

        public C0019b(ConstantState constantState) {
            this.f51a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f51a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f51a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            Drawable c0022b = new C0022b();
            c0022b.b = this.f51a.newDrawable();
            c0022b.b.setCallback(c0022b.f53a);
            return c0022b;
        }

        public Drawable newDrawable(Resources resources) {
            Drawable c0022b = new C0022b();
            c0022b.b = this.f51a.newDrawable(resources);
            c0022b.b.setCallback(c0022b.f53a);
            return c0022b;
        }

        public Drawable newDrawable(Resources resources, Theme theme) {
            Drawable c0022b = new C0022b();
            c0022b.b = this.f51a.newDrawable(resources, theme);
            c0022b.b.setCallback(c0022b.f53a);
            return c0022b;
        }
    }

    C0022b() {
        this(null, null, null);
    }

    private C0022b(Context context) {
        this(context, null, null);
    }

    private C0022b(Context context, C0018a c0018a, Resources resources) {
        this.f56e = null;
        this.f53a = new C00171(this);
        this.f55d = context;
        if (c0018a != null) {
            this.f54c = c0018a;
        } else {
            this.f54c = new C0018a(context, c0018a, this.f53a, resources);
        }
    }

    static TypedArray m5a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static C0022b m6a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        C0022b c0022b = new C0022b(context);
        c0022b.inflate(resources, xmlPullParser, attributeSet, theme);
        return c0022b;
    }

    private void m7a(Animator animator) {
        if (animator instanceof AnimatorSet) {
            List childAnimations = ((AnimatorSet) animator).getChildAnimations();
            if (childAnimations != null) {
                for (int i = 0; i < childAnimations.size(); i++) {
                    m7a((Animator) childAnimations.get(i));
                }
            }
        }
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.f56e == null) {
                    this.f56e = new ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.f56e);
            }
        }
    }

    private void m8a(String str, Animator animator) {
        animator.setTarget(this.f54c.f48b.m71a(str));
        if (VERSION.SDK_INT < 21) {
            m7a(animator);
        }
        if (this.f54c.f49c == null) {
            this.f54c.f49c = new ArrayList();
            this.f54c.f50d = new C0161a();
        }
        this.f54c.f49c.add(animator);
        this.f54c.f50d.put(animator, str);
    }

    private boolean m9a() {
        ArrayList arrayList = this.f54c.f49c;
        if (arrayList == null) {
            return false;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Animator) arrayList.get(i)).isRunning()) {
                return true;
            }
        }
        return false;
    }

    public void applyTheme(Theme theme) {
        if (this.b != null) {
            C0129a.m540a(this.b, theme);
        }
    }

    public boolean canApplyTheme() {
        return this.b != null ? C0129a.m547d(this.b) : false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public void draw(Canvas canvas) {
        if (this.b != null) {
            this.b.draw(canvas);
            return;
        }
        this.f54c.f48b.draw(canvas);
        if (m9a()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        return this.b != null ? C0129a.m546c(this.b) : this.f54c.f48b.getAlpha();
    }

    public int getChangingConfigurations() {
        return this.b != null ? this.b.getChangingConfigurations() : super.getChangingConfigurations() | this.f54c.f47a;
    }

    public /* bridge */ /* synthetic */ ColorFilter getColorFilter() {
        return super.getColorFilter();
    }

    public ConstantState getConstantState() {
        return this.b != null ? new C0019b(this.b.getConstantState()) : null;
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.b != null ? this.b.getIntrinsicHeight() : this.f54c.f48b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.b != null ? this.b.getIntrinsicWidth() : this.f54c.f48b.getIntrinsicWidth();
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
        return this.b != null ? this.b.getOpacity() : this.f54c.f48b.getOpacity();
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
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        if (this.b != null) {
            C0129a.m541a(this.b, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                TypedArray a;
                if ("animated-vector".equals(name)) {
                    a = C0022b.m5a(resources, theme, attributeSet, C0016a.f44e);
                    int resourceId = a.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0034f a2 = C0034f.m65a(resources, resourceId, theme);
                        a2.m72a(false);
                        a2.setCallback(this.f53a);
                        if (this.f54c.f48b != null) {
                            this.f54c.f48b.setCallback(null);
                        }
                        this.f54c.f48b = a2;
                    }
                    a.recycle();
                } else if ("target".equals(name)) {
                    a = resources.obtainAttributes(attributeSet, C0016a.f45f);
                    String string = a.getString(0);
                    int resourceId2 = a.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        if (this.f55d != null) {
                            m8a(string, AnimatorInflater.loadAnimator(this.f55d, resourceId2));
                        } else {
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    a.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    public /* bridge */ /* synthetic */ boolean isAutoMirrored() {
        return super.isAutoMirrored();
    }

    public boolean isRunning() {
        if (this.b != null) {
            return ((AnimatedVectorDrawable) this.b).isRunning();
        }
        ArrayList arrayList = this.f54c.f49c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((Animator) arrayList.get(i)).isRunning()) {
                return true;
            }
        }
        return false;
    }

    public boolean isStateful() {
        return this.b != null ? this.b.isStateful() : this.f54c.f48b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        if (this.b != null) {
            this.b.mutate();
            return this;
        }
        throw new IllegalStateException("Mutate() is not supported for older platform");
    }

    protected void onBoundsChange(Rect rect) {
        if (this.b != null) {
            this.b.setBounds(rect);
        } else {
            this.f54c.f48b.setBounds(rect);
        }
    }

    protected boolean onLevelChange(int i) {
        return this.b != null ? this.b.setLevel(i) : this.f54c.f48b.setLevel(i);
    }

    protected boolean onStateChange(int[] iArr) {
        return this.b != null ? this.b.setState(iArr) : this.f54c.f48b.setState(iArr);
    }

    public void setAlpha(int i) {
        if (this.b != null) {
            this.b.setAlpha(i);
        } else {
            this.f54c.f48b.setAlpha(i);
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
        } else {
            this.f54c.f48b.setColorFilter(colorFilter);
        }
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
            this.f54c.f48b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        if (this.b != null) {
            C0129a.m539a(this.b, colorStateList);
        } else {
            this.f54c.f48b.setTintList(colorStateList);
        }
    }

    public void setTintMode(Mode mode) {
        if (this.b != null) {
            C0129a.m542a(this.b, mode);
        } else {
            this.f54c.f48b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (this.b != null) {
            return this.b.setVisible(z, z2);
        }
        this.f54c.f48b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).start();
        } else if (!m9a()) {
            ArrayList arrayList = this.f54c.f49c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animator) arrayList.get(i)).start();
            }
            invalidateSelf();
        }
    }

    public void stop() {
        if (this.b != null) {
            ((AnimatedVectorDrawable) this.b).stop();
            return;
        }
        ArrayList arrayList = this.f54c.f49c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Animator) arrayList.get(i)).end();
        }
    }
}
