package android.support.v7.p016c.p017a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.p003c.C0146a;
import android.support.v7.p015b.C0475a.C0465a;
import android.support.v7.p015b.C0475a.C0474j;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: android.support.v7.c.a.a */
final class C0476a {
    private static int m2238a(int i, float f) {
        return C0146a.m592b(i, Math.round(((float) Color.alpha(i)) * f));
    }

    public static ColorStateList m2239a(Resources resources, XmlPullParser xmlPullParser, Theme theme) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlPullParser);
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return C0476a.m2240a(resources, xmlPullParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    private static ColorStateList m2240a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return C0476a.m2242b(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    private static TypedArray m2241a(Resources resources, Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    private static ColorStateList m2242b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Theme theme) {
        Object trimStateSet;
        int depth = xmlPullParser.getDepth() + 1;
        Object obj = new int[20][];
        Object obj2 = obj;
        int i = 0;
        Object obj3 = new int[obj.length];
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray a = C0476a.m2241a(resources, theme, attributeSet, C0474j.ColorStateListItem);
                int color = a.getColor(C0474j.ColorStateListItem_android_color, -65281);
                float f = 1.0f;
                if (a.hasValue(C0474j.ColorStateListItem_android_alpha)) {
                    f = a.getFloat(C0474j.ColorStateListItem_android_alpha, 1.0f);
                } else if (a.hasValue(C0474j.ColorStateListItem_alpha)) {
                    f = a.getFloat(C0474j.ColorStateListItem_alpha, 1.0f);
                }
                a.recycle();
                int i2 = 0;
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i3 = 0;
                while (i3 < attributeCount) {
                    depth2 = attributeSet.getAttributeNameResource(i3);
                    if (depth2 == 16843173 || depth2 == 16843551 || depth2 == C0465a.alpha) {
                        depth2 = i2;
                    } else {
                        int i4 = i2 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i3, false)) {
                            depth2 = -depth2;
                        }
                        iArr[i2] = depth2;
                        depth2 = i4;
                    }
                    i3++;
                    i2 = depth2;
                }
                trimStateSet = StateSet.trimStateSet(iArr, i2);
                next = C0476a.m2238a(color, f);
                if (i == 0 || trimStateSet.length == 0) {
                    obj = C0479c.m2251a((int[]) obj3, i, next);
                    i++;
                    obj2 = (int[][]) C0479c.m2252a((Object[]) obj2, i, trimStateSet);
                    obj3 = obj;
                } else {
                    obj = C0479c.m2251a((int[]) obj3, i, next);
                    i++;
                    obj2 = (int[][]) C0479c.m2252a((Object[]) obj2, i, trimStateSet);
                    obj3 = obj;
                }
            }
        }
        obj = new int[i];
        trimStateSet = new int[i][];
        System.arraycopy(obj3, 0, obj, 0, i);
        System.arraycopy(obj2, 0, trimStateSet, 0, i);
        return new ColorStateList(trimStateSet, obj);
    }
}
