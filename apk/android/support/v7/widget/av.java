package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.p016c.p017a.C0478b;
import android.util.AttributeSet;

public class av {
    private final Context f1689a;
    private final TypedArray f1690b;

    private av(Context context, TypedArray typedArray) {
        this.f1689a = context;
        this.f1690b = typedArray;
    }

    public static av m2945a(Context context, int i, int[] iArr) {
        return new av(context, context.obtainStyledAttributes(i, iArr));
    }

    public static av m2946a(Context context, AttributeSet attributeSet, int[] iArr) {
        return new av(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static av m2947a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new av(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public float m2948a(int i, float f) {
        return this.f1690b.getFloat(i, f);
    }

    public int m2949a(int i, int i2) {
        return this.f1690b.getInt(i, i2);
    }

    public Drawable m2950a(int i) {
        if (this.f1690b.hasValue(i)) {
            int resourceId = this.f1690b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0478b.m2246b(this.f1689a, resourceId);
            }
        }
        return this.f1690b.getDrawable(i);
    }

    public void m2951a() {
        this.f1690b.recycle();
    }

    public boolean m2952a(int i, boolean z) {
        return this.f1690b.getBoolean(i, z);
    }

    public int m2953b(int i, int i2) {
        return this.f1690b.getColor(i, i2);
    }

    public Drawable m2954b(int i) {
        if (this.f1690b.hasValue(i)) {
            int resourceId = this.f1690b.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0610l.m3109a().m3128a(this.f1689a, resourceId, true);
            }
        }
        return null;
    }

    public int m2955c(int i, int i2) {
        return this.f1690b.getInteger(i, i2);
    }

    public CharSequence m2956c(int i) {
        return this.f1690b.getText(i);
    }

    public int m2957d(int i, int i2) {
        return this.f1690b.getDimensionPixelOffset(i, i2);
    }

    public String m2958d(int i) {
        return this.f1690b.getString(i);
    }

    public int m2959e(int i, int i2) {
        return this.f1690b.getDimensionPixelSize(i, i2);
    }

    public ColorStateList m2960e(int i) {
        if (this.f1690b.hasValue(i)) {
            int resourceId = this.f1690b.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C0478b.m2243a(this.f1689a, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return this.f1690b.getColorStateList(i);
    }

    public int m2961f(int i, int i2) {
        return this.f1690b.getLayoutDimension(i, i2);
    }

    public CharSequence[] m2962f(int i) {
        return this.f1690b.getTextArray(i);
    }

    public int m2963g(int i, int i2) {
        return this.f1690b.getResourceId(i, i2);
    }

    public boolean m2964g(int i) {
        return this.f1690b.hasValue(i);
    }
}
