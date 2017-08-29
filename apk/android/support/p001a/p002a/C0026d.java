package android.support.p001a.p002a;

import android.content.res.TypedArray;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: android.support.a.a.d */
class C0026d {
    public static float m21a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !C0026d.m24a(xmlPullParser, str) ? f : typedArray.getFloat(i, f);
    }

    public static int m22a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0026d.m24a(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static boolean m23a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !C0026d.m24a(xmlPullParser, str) ? z : typedArray.getBoolean(i, z);
    }

    public static boolean m24a(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static int m25b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !C0026d.m24a(xmlPullParser, str) ? i2 : typedArray.getColor(i, i2);
    }
}
