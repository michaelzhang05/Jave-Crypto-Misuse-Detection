package androidx.core.view;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class k {
    private ViewParent a;

    /* renamed from: b, reason: collision with root package name */
    private ViewParent f1010b;

    /* renamed from: c, reason: collision with root package name */
    private final View f1011c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1012d;

    /* renamed from: e, reason: collision with root package name */
    private int[] f1013e;

    public k(View view) {
        this.f1011c = view;
    }

    private boolean h(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent i7;
        int i8;
        int i9;
        int[] iArr3;
        if (!m() || (i7 = i(i6)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f1011c.getLocationInWindow(iArr);
            i8 = iArr[0];
            i9 = iArr[1];
        } else {
            i8 = 0;
            i9 = 0;
        }
        if (iArr2 == null) {
            int[] j2 = j();
            j2[0] = 0;
            j2[1] = 0;
            iArr3 = j2;
        } else {
            iArr3 = iArr2;
        }
        x.d(i7, this.f1011c, i2, i3, i4, i5, i6, iArr3);
        if (iArr != null) {
            this.f1011c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i8;
            iArr[1] = iArr[1] - i9;
        }
        return true;
    }

    private ViewParent i(int i2) {
        if (i2 == 0) {
            return this.a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f1010b;
    }

    private int[] j() {
        if (this.f1013e == null) {
            this.f1013e = new int[2];
        }
        return this.f1013e;
    }

    private void o(int i2, ViewParent viewParent) {
        if (i2 == 0) {
            this.a = viewParent;
        } else {
            if (i2 != 1) {
                return;
            }
            this.f1010b = viewParent;
        }
    }

    public boolean a(float f2, float f3, boolean z) {
        ViewParent i2;
        if (!m() || (i2 = i(0)) == null) {
            return false;
        }
        return x.a(i2, this.f1011c, f2, f3, z);
    }

    public boolean b(float f2, float f3) {
        ViewParent i2;
        if (!m() || (i2 = i(0)) == null) {
            return false;
        }
        return x.b(i2, this.f1011c, f2, f3);
    }

    public boolean c(int i2, int i3, int[] iArr, int[] iArr2) {
        return d(i2, i3, iArr, iArr2, 0);
    }

    public boolean d(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        ViewParent i5;
        int i6;
        int i7;
        if (!m() || (i5 = i(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        if (iArr2 != null) {
            this.f1011c.getLocationInWindow(iArr2);
            i6 = iArr2[0];
            i7 = iArr2[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        x.c(i5, this.f1011c, i2, i3, iArr, i4);
        if (iArr2 != null) {
            this.f1011c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i6;
            iArr2[1] = iArr2[1] - i7;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        h(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public boolean f(int i2, int i3, int i4, int i5, int[] iArr) {
        return h(i2, i3, i4, i5, iArr, 0, null);
    }

    public boolean g(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return h(i2, i3, i4, i5, iArr, i6, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i2) {
        return i(i2) != null;
    }

    public boolean m() {
        return this.f1012d;
    }

    public void n(boolean z) {
        if (this.f1012d) {
            u.C0(this.f1011c);
        }
        this.f1012d = z;
    }

    public boolean p(int i2) {
        return q(i2, 0);
    }

    public boolean q(int i2, int i3) {
        if (l(i3)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f1011c;
        for (ViewParent parent = this.f1011c.getParent(); parent != null; parent = parent.getParent()) {
            if (x.f(parent, view, this.f1011c, i2, i3)) {
                o(i3, parent);
                x.e(parent, view, this.f1011c, i2, i3);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i2) {
        ViewParent i3 = i(i2);
        if (i3 != null) {
            x.g(i3, this.f1011c, i2);
            o(i2, null);
        }
    }
}
