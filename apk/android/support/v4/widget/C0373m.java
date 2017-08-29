package android.support.v4.widget;

import android.widget.ListView;

/* renamed from: android.support.v4.widget.m */
public class C0373m extends C0350a {
    private final ListView f696f;

    public C0373m(ListView listView) {
        super(listView);
        this.f696f = listView;
    }

    public void m1797a(int i, int i2) {
        C0374n.m1800a(this.f696f, i2);
    }

    public boolean m1798e(int i) {
        return false;
    }

    public boolean m1799f(int i) {
        ListView listView = this.f696f;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
