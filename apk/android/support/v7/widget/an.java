package android.support.v7.widget;

class an {
    private int f1623a;
    private int f1624b;
    private int f1625c;
    private int f1626d;
    private int f1627e;
    private int f1628f;
    private boolean f1629g;
    private boolean f1630h;

    an() {
        this.f1623a = 0;
        this.f1624b = 0;
        this.f1625c = Integer.MIN_VALUE;
        this.f1626d = Integer.MIN_VALUE;
        this.f1627e = 0;
        this.f1628f = 0;
        this.f1629g = false;
        this.f1630h = false;
    }

    public int m2896a() {
        return this.f1623a;
    }

    public void m2897a(int i, int i2) {
        this.f1625c = i;
        this.f1626d = i2;
        this.f1630h = true;
        if (this.f1629g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1623a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1624b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1623a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1624b = i2;
        }
    }

    public void m2898a(boolean z) {
        if (z != this.f1629g) {
            this.f1629g = z;
            if (!this.f1630h) {
                this.f1623a = this.f1627e;
                this.f1624b = this.f1628f;
            } else if (z) {
                this.f1623a = this.f1626d != Integer.MIN_VALUE ? this.f1626d : this.f1627e;
                this.f1624b = this.f1625c != Integer.MIN_VALUE ? this.f1625c : this.f1628f;
            } else {
                this.f1623a = this.f1625c != Integer.MIN_VALUE ? this.f1625c : this.f1627e;
                this.f1624b = this.f1626d != Integer.MIN_VALUE ? this.f1626d : this.f1628f;
            }
        }
    }

    public int m2899b() {
        return this.f1624b;
    }

    public void m2900b(int i, int i2) {
        this.f1630h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1627e = i;
            this.f1623a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1628f = i2;
            this.f1624b = i2;
        }
    }

    public int m2901c() {
        return this.f1629g ? this.f1624b : this.f1623a;
    }

    public int m2902d() {
        return this.f1629g ? this.f1623a : this.f1624b;
    }
}
