package android.support.v4.p012f;

import android.util.Log;
import java.io.Writer;

/* renamed from: android.support.v4.f.d */
public class C0164d extends Writer {
    private final String f426a;
    private StringBuilder f427b;

    public C0164d(String str) {
        this.f427b = new StringBuilder(128);
        this.f426a = str;
    }

    private void m651a() {
        if (this.f427b.length() > 0) {
            Log.d(this.f426a, this.f427b.toString());
            this.f427b.delete(0, this.f427b.length());
        }
    }

    public void close() {
        m651a();
    }

    public void flush() {
        m651a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                m651a();
            } else {
                this.f427b.append(c);
            }
        }
    }
}
