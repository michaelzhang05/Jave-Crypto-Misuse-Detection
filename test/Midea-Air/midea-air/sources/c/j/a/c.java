package c.j.a;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.u;
import java.util.Arrays;

/* compiled from: ViewDragHelper.java */
/* loaded from: classes.dex */
public class c {
    private static final Interpolator a = new a();

    /* renamed from: b, reason: collision with root package name */
    private int f2766b;

    /* renamed from: c, reason: collision with root package name */
    private int f2767c;

    /* renamed from: e, reason: collision with root package name */
    private float[] f2769e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f2770f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f2771g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f2772h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f2773i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f2774j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f2775k;
    private int l;
    private VelocityTracker m;
    private float n;
    private float o;
    private int p;
    private int q;
    private OverScroller r;
    private final AbstractC0065c s;
    private View t;
    private boolean u;
    private final ViewGroup v;

    /* renamed from: d, reason: collision with root package name */
    private int f2768d = -1;
    private final Runnable w = new b();

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    static class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* compiled from: ViewDragHelper.java */
    /* renamed from: c.j.a.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0065c {
        public abstract int a(View view, int i2, int i3);

        public abstract int b(View view, int i2, int i3);

        public int c(int i2) {
            return i2;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i2, int i3) {
        }

        public boolean g(int i2) {
            return false;
        }

        public void h(int i2, int i3) {
        }

        public void i(View view, int i2) {
        }

        public abstract void j(int i2);

        public abstract void k(View view, int i2, int i3, int i4, int i5);

        public abstract void l(View view, float f2, float f3);

        public abstract boolean m(View view, int i2);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0065c abstractC0065c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0065c != null) {
            this.v = viewGroup;
            this.s = abstractC0065c;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.p = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.f2767c = viewConfiguration.getScaledTouchSlop();
            this.n = viewConfiguration.getScaledMaximumFlingVelocity();
            this.o = viewConfiguration.getScaledMinimumFlingVelocity();
            this.r = new OverScroller(context, a);
            return;
        }
        throw new IllegalArgumentException("Callback may not be null");
    }

    private void A() {
        this.m.computeCurrentVelocity(1000, this.n);
        n(e(this.m.getXVelocity(this.f2768d), this.o, this.n), e(this.m.getYVelocity(this.f2768d), this.o, this.n));
    }

    private void B(float f2, float f3, int i2) {
        int i3 = c(f2, f3, i2, 1) ? 1 : 0;
        if (c(f3, f2, i2, 4)) {
            i3 |= 4;
        }
        if (c(f2, f3, i2, 2)) {
            i3 |= 2;
        }
        if (c(f3, f2, i2, 8)) {
            i3 |= 8;
        }
        if (i3 != 0) {
            int[] iArr = this.f2774j;
            iArr[i2] = iArr[i2] | i3;
            this.s.f(i3, i2);
        }
    }

    private void C(float f2, float f3, int i2) {
        q(i2);
        float[] fArr = this.f2769e;
        this.f2771g[i2] = f2;
        fArr[i2] = f2;
        float[] fArr2 = this.f2770f;
        this.f2772h[i2] = f3;
        fArr2[i2] = f3;
        this.f2773i[i2] = t((int) f2, (int) f3);
        this.l |= 1 << i2;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            int pointerId = motionEvent.getPointerId(i2);
            if (x(pointerId)) {
                float x = motionEvent.getX(i2);
                float y = motionEvent.getY(i2);
                this.f2771g[pointerId] = x;
                this.f2772h[pointerId] = y;
            }
        }
    }

    private boolean c(float f2, float f3, int i2, int i3) {
        float abs = Math.abs(f2);
        float abs2 = Math.abs(f3);
        if ((this.f2773i[i2] & i3) != i3 || (this.q & i3) == 0 || (this.f2775k[i2] & i3) == i3 || (this.f2774j[i2] & i3) == i3) {
            return false;
        }
        int i4 = this.f2767c;
        if (abs <= i4 && abs2 <= i4) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.s.g(i3)) {
            return (this.f2774j[i2] & i3) == 0 && abs > ((float) this.f2767c);
        }
        int[] iArr = this.f2775k;
        iArr[i2] = iArr[i2] | i3;
        return false;
    }

    private boolean d(View view, float f2, float f3) {
        if (view == null) {
            return false;
        }
        boolean z = this.s.d(view) > 0;
        boolean z2 = this.s.e(view) > 0;
        if (!z || !z2) {
            return z ? Math.abs(f2) > ((float) this.f2767c) : z2 && Math.abs(f3) > ((float) this.f2767c);
        }
        float f4 = (f2 * f2) + (f3 * f3);
        int i2 = this.f2767c;
        return f4 > ((float) (i2 * i2));
    }

    private float e(float f2, float f3, float f4) {
        float abs = Math.abs(f2);
        if (abs < f3) {
            return 0.0f;
        }
        return abs > f4 ? f2 > 0.0f ? f4 : -f4 : f2;
    }

    private int f(int i2, int i3, int i4) {
        int abs = Math.abs(i2);
        if (abs < i3) {
            return 0;
        }
        return abs > i4 ? i2 > 0 ? i4 : -i4 : i2;
    }

    private void g() {
        float[] fArr = this.f2769e;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f2770f, 0.0f);
        Arrays.fill(this.f2771g, 0.0f);
        Arrays.fill(this.f2772h, 0.0f);
        Arrays.fill(this.f2773i, 0);
        Arrays.fill(this.f2774j, 0);
        Arrays.fill(this.f2775k, 0);
        this.l = 0;
    }

    private void h(int i2) {
        if (this.f2769e == null || !w(i2)) {
            return;
        }
        this.f2769e[i2] = 0.0f;
        this.f2770f[i2] = 0.0f;
        this.f2771g[i2] = 0.0f;
        this.f2772h[i2] = 0.0f;
        this.f2773i[i2] = 0;
        this.f2774j[i2] = 0;
        this.f2775k[i2] = 0;
        this.l = ((1 << i2) ^ (-1)) & this.l;
    }

    private int i(int i2, int i3, int i4) {
        int abs;
        if (i2 == 0) {
            return 0;
        }
        int width = this.v.getWidth();
        float f2 = width / 2;
        float o = f2 + (o(Math.min(1.0f, Math.abs(i2) / width)) * f2);
        int abs2 = Math.abs(i3);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(o / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i2) / i4) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    private int j(View view, int i2, int i3, int i4, int i5) {
        float f2;
        float f3;
        float f4;
        float f5;
        int f6 = f(i4, (int) this.o, (int) this.n);
        int f7 = f(i5, (int) this.o, (int) this.n);
        int abs = Math.abs(i2);
        int abs2 = Math.abs(i3);
        int abs3 = Math.abs(f6);
        int abs4 = Math.abs(f7);
        int i6 = abs3 + abs4;
        int i7 = abs + abs2;
        if (f6 != 0) {
            f2 = abs3;
            f3 = i6;
        } else {
            f2 = abs;
            f3 = i7;
        }
        float f8 = f2 / f3;
        if (f7 != 0) {
            f4 = abs4;
            f5 = i6;
        } else {
            f4 = abs2;
            f5 = i7;
        }
        return (int) ((i(i2, f6, this.s.d(view)) * f8) + (i(i3, f7, this.s.e(view)) * (f4 / f5)));
    }

    public static c l(ViewGroup viewGroup, float f2, AbstractC0065c abstractC0065c) {
        c m = m(viewGroup, abstractC0065c);
        m.f2767c = (int) (m.f2767c * (1.0f / f2));
        return m;
    }

    public static c m(ViewGroup viewGroup, AbstractC0065c abstractC0065c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0065c);
    }

    private void n(float f2, float f3) {
        this.u = true;
        this.s.l(this.t, f2, f3);
        this.u = false;
        if (this.f2766b == 1) {
            E(0);
        }
    }

    private float o(float f2) {
        return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
    }

    private void p(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        if (i4 != 0) {
            i2 = this.s.a(this.t, i2, i4);
            u.T(this.t, i2 - left);
        }
        int i6 = i2;
        if (i5 != 0) {
            i3 = this.s.b(this.t, i3, i5);
            u.U(this.t, i3 - top);
        }
        int i7 = i3;
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.s.k(this.t, i6, i7, i6 - left, i7 - top);
    }

    private void q(int i2) {
        float[] fArr = this.f2769e;
        if (fArr == null || fArr.length <= i2) {
            int i3 = i2 + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f2770f;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f2771g;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f2772h;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f2773i;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f2774j;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f2775k;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f2769e = fArr2;
            this.f2770f = fArr3;
            this.f2771g = fArr4;
            this.f2772h = fArr5;
            this.f2773i = iArr;
            this.f2774j = iArr2;
            this.f2775k = iArr3;
        }
    }

    private boolean s(int i2, int i3, int i4, int i5) {
        int left = this.t.getLeft();
        int top = this.t.getTop();
        int i6 = i2 - left;
        int i7 = i3 - top;
        if (i6 == 0 && i7 == 0) {
            this.r.abortAnimation();
            E(0);
            return false;
        }
        this.r.startScroll(left, top, i6, i7, j(this.t, i6, i7, i4, i5));
        E(2);
        return true;
    }

    private int t(int i2, int i3) {
        int i4 = i2 < this.v.getLeft() + this.p ? 1 : 0;
        if (i3 < this.v.getTop() + this.p) {
            i4 |= 4;
        }
        if (i2 > this.v.getRight() - this.p) {
            i4 |= 2;
        }
        return i3 > this.v.getBottom() - this.p ? i4 | 8 : i4;
    }

    private boolean x(int i2) {
        if (w(i2)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i2 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i2) {
        this.v.removeCallbacks(this.w);
        if (this.f2766b != i2) {
            this.f2766b = i2;
            this.s.j(i2);
            if (this.f2766b == 0) {
                this.t = null;
            }
        }
    }

    public boolean F(int i2, int i3) {
        if (this.u) {
            return s(i2, i3, (int) this.m.getXVelocity(this.f2768d), (int) this.m.getYVelocity(this.f2768d));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00dd, code lost:
    
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean G(android.view.MotionEvent r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.j.a.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i2, int i3) {
        this.t = view;
        this.f2768d = -1;
        boolean s = s(i2, i3, 0, 0);
        if (!s && this.f2766b == 0 && this.t != null) {
            this.t = null;
        }
        return s;
    }

    boolean I(View view, int i2) {
        if (view == this.t && this.f2768d == i2) {
            return true;
        }
        if (view == null || !this.s.m(view, i2)) {
            return false;
        }
        this.f2768d = i2;
        b(view, i2);
        return true;
    }

    public void a() {
        this.f2768d = -1;
        g();
        VelocityTracker velocityTracker = this.m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.m = null;
        }
    }

    public void b(View view, int i2) {
        if (view.getParent() == this.v) {
            this.t = view;
            this.f2768d = i2;
            this.s.i(view, i2);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.v + ")");
    }

    public boolean k(boolean z) {
        if (this.f2766b == 2) {
            boolean computeScrollOffset = this.r.computeScrollOffset();
            int currX = this.r.getCurrX();
            int currY = this.r.getCurrY();
            int left = currX - this.t.getLeft();
            int top = currY - this.t.getTop();
            if (left != 0) {
                u.T(this.t, left);
            }
            if (top != 0) {
                u.U(this.t, top);
            }
            if (left != 0 || top != 0) {
                this.s.k(this.t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.r.getFinalX() && currY == this.r.getFinalY()) {
                this.r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z) {
                    this.v.post(this.w);
                } else {
                    E(0);
                }
            }
        }
        return this.f2766b == 2;
    }

    public View r(int i2, int i3) {
        for (int childCount = this.v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.v.getChildAt(this.s.c(childCount));
            if (i2 >= childAt.getLeft() && i2 < childAt.getRight() && i3 >= childAt.getTop() && i3 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f2767c;
    }

    public boolean v(int i2, int i3) {
        return y(this.t, i2, i3);
    }

    public boolean w(int i2) {
        return ((1 << i2) & this.l) != 0;
    }

    public boolean y(View view, int i2, int i3) {
        return view != null && i2 >= view.getLeft() && i2 < view.getRight() && i3 >= view.getTop() && i3 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.m == null) {
            this.m = VelocityTracker.obtain();
        }
        this.m.addMovement(motionEvent);
        int i3 = 0;
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r = r((int) x, (int) y);
            C(x, y, pointerId);
            I(r, pointerId);
            int i4 = this.f2773i[pointerId];
            int i5 = this.q;
            if ((i4 & i5) != 0) {
                this.s.h(i4 & i5, pointerId);
                return;
            }
            return;
        }
        if (actionMasked == 1) {
            if (this.f2766b == 1) {
                A();
            }
            a();
            return;
        }
        if (actionMasked == 2) {
            if (this.f2766b == 1) {
                if (x(this.f2768d)) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.f2768d);
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f2771g;
                    int i6 = this.f2768d;
                    int i7 = (int) (x2 - fArr[i6]);
                    int i8 = (int) (y2 - this.f2772h[i6]);
                    p(this.t.getLeft() + i7, this.t.getTop() + i8, i7, i8);
                    D(motionEvent);
                    return;
                }
                return;
            }
            int pointerCount = motionEvent.getPointerCount();
            while (i3 < pointerCount) {
                int pointerId2 = motionEvent.getPointerId(i3);
                if (x(pointerId2)) {
                    float x3 = motionEvent.getX(i3);
                    float y3 = motionEvent.getY(i3);
                    float f2 = x3 - this.f2769e[pointerId2];
                    float f3 = y3 - this.f2770f[pointerId2];
                    B(f2, f3, pointerId2);
                    if (this.f2766b != 1) {
                        View r2 = r((int) x3, (int) y3);
                        if (d(r2, f2, f3) && I(r2, pointerId2)) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i3++;
            }
            D(motionEvent);
            return;
        }
        if (actionMasked == 3) {
            if (this.f2766b == 1) {
                n(0.0f, 0.0f);
            }
            a();
            return;
        }
        if (actionMasked == 5) {
            int pointerId3 = motionEvent.getPointerId(actionIndex);
            float x4 = motionEvent.getX(actionIndex);
            float y4 = motionEvent.getY(actionIndex);
            C(x4, y4, pointerId3);
            if (this.f2766b == 0) {
                I(r((int) x4, (int) y4), pointerId3);
                int i9 = this.f2773i[pointerId3];
                int i10 = this.q;
                if ((i9 & i10) != 0) {
                    this.s.h(i9 & i10, pointerId3);
                    return;
                }
                return;
            }
            if (v((int) x4, (int) y4)) {
                I(this.t, pointerId3);
                return;
            }
            return;
        }
        if (actionMasked != 6) {
            return;
        }
        int pointerId4 = motionEvent.getPointerId(actionIndex);
        if (this.f2766b == 1 && pointerId4 == this.f2768d) {
            int pointerCount2 = motionEvent.getPointerCount();
            while (true) {
                if (i3 >= pointerCount2) {
                    i2 = -1;
                    break;
                }
                int pointerId5 = motionEvent.getPointerId(i3);
                if (pointerId5 != this.f2768d) {
                    View r3 = r((int) motionEvent.getX(i3), (int) motionEvent.getY(i3));
                    View view = this.t;
                    if (r3 == view && I(view, pointerId5)) {
                        i2 = this.f2768d;
                        break;
                    }
                }
                i3++;
            }
            if (i2 == -1) {
                A();
            }
        }
        h(pointerId4);
    }
}
