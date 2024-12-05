package y;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.core.view.b1;
import java.util.Arrays;

/* loaded from: classes.dex */
public class c {

    /* renamed from: x, reason: collision with root package name */
    private static final Interpolator f9862x = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f9863a;

    /* renamed from: b, reason: collision with root package name */
    private int f9864b;

    /* renamed from: d, reason: collision with root package name */
    private float[] f9866d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f9867e;

    /* renamed from: f, reason: collision with root package name */
    private float[] f9868f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f9869g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f9870h;

    /* renamed from: i, reason: collision with root package name */
    private int[] f9871i;

    /* renamed from: j, reason: collision with root package name */
    private int[] f9872j;

    /* renamed from: k, reason: collision with root package name */
    private int f9873k;

    /* renamed from: l, reason: collision with root package name */
    private VelocityTracker f9874l;

    /* renamed from: m, reason: collision with root package name */
    private float f9875m;

    /* renamed from: n, reason: collision with root package name */
    private float f9876n;

    /* renamed from: o, reason: collision with root package name */
    private int f9877o;

    /* renamed from: p, reason: collision with root package name */
    private final int f9878p;

    /* renamed from: q, reason: collision with root package name */
    private int f9879q;

    /* renamed from: r, reason: collision with root package name */
    private OverScroller f9880r;

    /* renamed from: s, reason: collision with root package name */
    private final AbstractC0151c f9881s;

    /* renamed from: t, reason: collision with root package name */
    private View f9882t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f9883u;

    /* renamed from: v, reason: collision with root package name */
    private final ViewGroup f9884v;

    /* renamed from: c, reason: collision with root package name */
    private int f9865c = -1;

    /* renamed from: w, reason: collision with root package name */
    private final Runnable f9885w = new b();

    /* loaded from: classes.dex */
    class a implements Interpolator {
        a() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.E(0);
        }
    }

    /* renamed from: y.c$c, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0151c {
        public abstract int a(View view, int i6, int i7);

        public abstract int b(View view, int i6, int i7);

        public int c(int i6) {
            return i6;
        }

        public int d(View view) {
            return 0;
        }

        public int e(View view) {
            return 0;
        }

        public void f(int i6, int i7) {
        }

        public boolean g(int i6) {
            return false;
        }

        public void h(int i6, int i7) {
        }

        public void i(View view, int i6) {
        }

        public abstract void j(int i6);

        public abstract void k(View view, int i6, int i7, int i8, int i9);

        public abstract void l(View view, float f6, float f7);

        public abstract boolean m(View view, int i6);
    }

    private c(Context context, ViewGroup viewGroup, AbstractC0151c abstractC0151c) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (abstractC0151c == null) {
            throw new IllegalArgumentException("Callback may not be null");
        }
        this.f9884v = viewGroup;
        this.f9881s = abstractC0151c;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        int i6 = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
        this.f9878p = i6;
        this.f9877o = i6;
        this.f9864b = viewConfiguration.getScaledTouchSlop();
        this.f9875m = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f9876n = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f9880r = new OverScroller(context, f9862x);
    }

    private void A() {
        this.f9874l.computeCurrentVelocity(1000, this.f9875m);
        n(e(this.f9874l.getXVelocity(this.f9865c), this.f9876n, this.f9875m), e(this.f9874l.getYVelocity(this.f9865c), this.f9876n, this.f9875m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r3v3, types: [y.c$c] */
    private void B(float f6, float f7, int i6) {
        boolean c6 = c(f6, f7, i6, 1);
        boolean z5 = c6;
        if (c(f7, f6, i6, 4)) {
            z5 = (c6 ? 1 : 0) | 4;
        }
        boolean z6 = z5;
        if (c(f6, f7, i6, 2)) {
            z6 = (z5 ? 1 : 0) | 2;
        }
        ?? r02 = z6;
        if (c(f7, f6, i6, 8)) {
            r02 = (z6 ? 1 : 0) | 8;
        }
        if (r02 != 0) {
            int[] iArr = this.f9871i;
            iArr[i6] = iArr[i6] | r02;
            this.f9881s.f(r02, i6);
        }
    }

    private void C(float f6, float f7, int i6) {
        q(i6);
        float[] fArr = this.f9866d;
        this.f9868f[i6] = f6;
        fArr[i6] = f6;
        float[] fArr2 = this.f9867e;
        this.f9869g[i6] = f7;
        fArr2[i6] = f7;
        this.f9870h[i6] = t((int) f6, (int) f7);
        this.f9873k |= 1 << i6;
    }

    private void D(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i6 = 0; i6 < pointerCount; i6++) {
            int pointerId = motionEvent.getPointerId(i6);
            if (x(pointerId)) {
                float x5 = motionEvent.getX(i6);
                float y5 = motionEvent.getY(i6);
                this.f9868f[pointerId] = x5;
                this.f9869g[pointerId] = y5;
            }
        }
    }

    private boolean c(float f6, float f7, int i6, int i7) {
        float abs = Math.abs(f6);
        float abs2 = Math.abs(f7);
        if ((this.f9870h[i6] & i7) != i7 || (this.f9879q & i7) == 0 || (this.f9872j[i6] & i7) == i7 || (this.f9871i[i6] & i7) == i7) {
            return false;
        }
        int i8 = this.f9864b;
        if (abs <= i8 && abs2 <= i8) {
            return false;
        }
        if (abs >= abs2 * 0.5f || !this.f9881s.g(i7)) {
            return (this.f9871i[i6] & i7) == 0 && abs > ((float) this.f9864b);
        }
        int[] iArr = this.f9872j;
        iArr[i6] = iArr[i6] | i7;
        return false;
    }

    private boolean d(View view, float f6, float f7) {
        if (view == null) {
            return false;
        }
        boolean z5 = this.f9881s.d(view) > 0;
        boolean z6 = this.f9881s.e(view) > 0;
        if (!z5 || !z6) {
            return z5 ? Math.abs(f6) > ((float) this.f9864b) : z6 && Math.abs(f7) > ((float) this.f9864b);
        }
        float f8 = (f6 * f6) + (f7 * f7);
        int i6 = this.f9864b;
        return f8 > ((float) (i6 * i6));
    }

    private float e(float f6, float f7, float f8) {
        float abs = Math.abs(f6);
        if (abs < f7) {
            return 0.0f;
        }
        return abs > f8 ? f6 > 0.0f ? f8 : -f8 : f6;
    }

    private int f(int i6, int i7, int i8) {
        int abs = Math.abs(i6);
        if (abs < i7) {
            return 0;
        }
        return abs > i8 ? i6 > 0 ? i8 : -i8 : i6;
    }

    private void g() {
        float[] fArr = this.f9866d;
        if (fArr == null) {
            return;
        }
        Arrays.fill(fArr, 0.0f);
        Arrays.fill(this.f9867e, 0.0f);
        Arrays.fill(this.f9868f, 0.0f);
        Arrays.fill(this.f9869g, 0.0f);
        Arrays.fill(this.f9870h, 0);
        Arrays.fill(this.f9871i, 0);
        Arrays.fill(this.f9872j, 0);
        this.f9873k = 0;
    }

    private void h(int i6) {
        if (this.f9866d == null || !w(i6)) {
            return;
        }
        this.f9866d[i6] = 0.0f;
        this.f9867e[i6] = 0.0f;
        this.f9868f[i6] = 0.0f;
        this.f9869g[i6] = 0.0f;
        this.f9870h[i6] = 0;
        this.f9871i[i6] = 0;
        this.f9872j[i6] = 0;
        this.f9873k = (~(1 << i6)) & this.f9873k;
    }

    private int i(int i6, int i7, int i8) {
        if (i6 == 0) {
            return 0;
        }
        int width = this.f9884v.getWidth();
        float f6 = width / 2;
        float o6 = f6 + (o(Math.min(1.0f, Math.abs(i6) / width)) * f6);
        int abs = Math.abs(i7);
        return Math.min(abs > 0 ? Math.round(Math.abs(o6 / abs) * 1000.0f) * 4 : (int) (((Math.abs(i6) / i8) + 1.0f) * 256.0f), 600);
    }

    private int j(View view, int i6, int i7, int i8, int i9) {
        float f6;
        float f7;
        float f8;
        float f9;
        int f10 = f(i8, (int) this.f9876n, (int) this.f9875m);
        int f11 = f(i9, (int) this.f9876n, (int) this.f9875m);
        int abs = Math.abs(i6);
        int abs2 = Math.abs(i7);
        int abs3 = Math.abs(f10);
        int abs4 = Math.abs(f11);
        int i10 = abs3 + abs4;
        int i11 = abs + abs2;
        if (f10 != 0) {
            f6 = abs3;
            f7 = i10;
        } else {
            f6 = abs;
            f7 = i11;
        }
        float f12 = f6 / f7;
        if (f11 != 0) {
            f8 = abs4;
            f9 = i10;
        } else {
            f8 = abs2;
            f9 = i11;
        }
        return (int) ((i(i6, f10, this.f9881s.d(view)) * f12) + (i(i7, f11, this.f9881s.e(view)) * (f8 / f9)));
    }

    public static c l(ViewGroup viewGroup, float f6, AbstractC0151c abstractC0151c) {
        c m6 = m(viewGroup, abstractC0151c);
        m6.f9864b = (int) (m6.f9864b * (1.0f / f6));
        return m6;
    }

    public static c m(ViewGroup viewGroup, AbstractC0151c abstractC0151c) {
        return new c(viewGroup.getContext(), viewGroup, abstractC0151c);
    }

    private void n(float f6, float f7) {
        this.f9883u = true;
        this.f9881s.l(this.f9882t, f6, f7);
        this.f9883u = false;
        if (this.f9863a == 1) {
            E(0);
        }
    }

    private float o(float f6) {
        return (float) Math.sin((f6 - 0.5f) * 0.47123894f);
    }

    private void p(int i6, int i7, int i8, int i9) {
        int left = this.f9882t.getLeft();
        int top = this.f9882t.getTop();
        if (i8 != 0) {
            i6 = this.f9881s.a(this.f9882t, i6, i8);
            b1.a0(this.f9882t, i6 - left);
        }
        int i10 = i6;
        if (i9 != 0) {
            i7 = this.f9881s.b(this.f9882t, i7, i9);
            b1.b0(this.f9882t, i7 - top);
        }
        int i11 = i7;
        if (i8 == 0 && i9 == 0) {
            return;
        }
        this.f9881s.k(this.f9882t, i10, i11, i10 - left, i11 - top);
    }

    private void q(int i6) {
        float[] fArr = this.f9866d;
        if (fArr == null || fArr.length <= i6) {
            int i7 = i6 + 1;
            float[] fArr2 = new float[i7];
            float[] fArr3 = new float[i7];
            float[] fArr4 = new float[i7];
            float[] fArr5 = new float[i7];
            int[] iArr = new int[i7];
            int[] iArr2 = new int[i7];
            int[] iArr3 = new int[i7];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.f9867e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f9868f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.f9869g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.f9870h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.f9871i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.f9872j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.f9866d = fArr2;
            this.f9867e = fArr3;
            this.f9868f = fArr4;
            this.f9869g = fArr5;
            this.f9870h = iArr;
            this.f9871i = iArr2;
            this.f9872j = iArr3;
        }
    }

    private boolean s(int i6, int i7, int i8, int i9) {
        int left = this.f9882t.getLeft();
        int top = this.f9882t.getTop();
        int i10 = i6 - left;
        int i11 = i7 - top;
        if (i10 == 0 && i11 == 0) {
            this.f9880r.abortAnimation();
            E(0);
            return false;
        }
        this.f9880r.startScroll(left, top, i10, i11, j(this.f9882t, i10, i11, i8, i9));
        E(2);
        return true;
    }

    private int t(int i6, int i7) {
        int i8 = i6 < this.f9884v.getLeft() + this.f9877o ? 1 : 0;
        if (i7 < this.f9884v.getTop() + this.f9877o) {
            i8 |= 4;
        }
        if (i6 > this.f9884v.getRight() - this.f9877o) {
            i8 |= 2;
        }
        return i7 > this.f9884v.getBottom() - this.f9877o ? i8 | 8 : i8;
    }

    private boolean x(int i6) {
        if (w(i6)) {
            return true;
        }
        Log.e("ViewDragHelper", "Ignoring pointerId=" + i6 + " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream.");
        return false;
    }

    void E(int i6) {
        this.f9884v.removeCallbacks(this.f9885w);
        if (this.f9863a != i6) {
            this.f9863a = i6;
            this.f9881s.j(i6);
            if (this.f9863a == 0) {
                this.f9882t = null;
            }
        }
    }

    public boolean F(int i6, int i7) {
        if (this.f9883u) {
            return s(i6, i7, (int) this.f9874l.getXVelocity(this.f9865c), (int) this.f9874l.getYVelocity(this.f9865c));
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
        throw new UnsupportedOperationException("Method not decompiled: y.c.G(android.view.MotionEvent):boolean");
    }

    public boolean H(View view, int i6, int i7) {
        this.f9882t = view;
        this.f9865c = -1;
        boolean s5 = s(i6, i7, 0, 0);
        if (!s5 && this.f9863a == 0 && this.f9882t != null) {
            this.f9882t = null;
        }
        return s5;
    }

    boolean I(View view, int i6) {
        if (view == this.f9882t && this.f9865c == i6) {
            return true;
        }
        if (view == null || !this.f9881s.m(view, i6)) {
            return false;
        }
        this.f9865c = i6;
        b(view, i6);
        return true;
    }

    public void a() {
        this.f9865c = -1;
        g();
        VelocityTracker velocityTracker = this.f9874l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f9874l = null;
        }
    }

    public void b(View view, int i6) {
        if (view.getParent() == this.f9884v) {
            this.f9882t = view;
            this.f9865c = i6;
            this.f9881s.i(view, i6);
            E(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + this.f9884v + ")");
    }

    public boolean k(boolean z5) {
        if (this.f9863a == 2) {
            boolean computeScrollOffset = this.f9880r.computeScrollOffset();
            int currX = this.f9880r.getCurrX();
            int currY = this.f9880r.getCurrY();
            int left = currX - this.f9882t.getLeft();
            int top = currY - this.f9882t.getTop();
            if (left != 0) {
                b1.a0(this.f9882t, left);
            }
            if (top != 0) {
                b1.b0(this.f9882t, top);
            }
            if (left != 0 || top != 0) {
                this.f9881s.k(this.f9882t, currX, currY, left, top);
            }
            if (computeScrollOffset && currX == this.f9880r.getFinalX() && currY == this.f9880r.getFinalY()) {
                this.f9880r.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                if (z5) {
                    this.f9884v.post(this.f9885w);
                } else {
                    E(0);
                }
            }
        }
        return this.f9863a == 2;
    }

    public View r(int i6, int i7) {
        for (int childCount = this.f9884v.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = this.f9884v.getChildAt(this.f9881s.c(childCount));
            if (i6 >= childAt.getLeft() && i6 < childAt.getRight() && i7 >= childAt.getTop() && i7 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public int u() {
        return this.f9864b;
    }

    public boolean v(int i6, int i7) {
        return y(this.f9882t, i6, i7);
    }

    public boolean w(int i6) {
        return ((1 << i6) & this.f9873k) != 0;
    }

    public boolean y(View view, int i6, int i7) {
        return view != null && i6 >= view.getLeft() && i6 < view.getRight() && i7 >= view.getTop() && i7 < view.getBottom();
    }

    public void z(MotionEvent motionEvent) {
        int i6;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        if (this.f9874l == null) {
            this.f9874l = VelocityTracker.obtain();
        }
        this.f9874l.addMovement(motionEvent);
        int i7 = 0;
        if (actionMasked == 0) {
            float x5 = motionEvent.getX();
            float y5 = motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            View r5 = r((int) x5, (int) y5);
            C(x5, y5, pointerId);
            I(r5, pointerId);
            int i8 = this.f9870h[pointerId];
            int i9 = this.f9879q;
            if ((i8 & i9) != 0) {
                this.f9881s.h(i8 & i9, pointerId);
                return;
            }
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                if (this.f9863a != 1) {
                    int pointerCount = motionEvent.getPointerCount();
                    while (i7 < pointerCount) {
                        int pointerId2 = motionEvent.getPointerId(i7);
                        if (x(pointerId2)) {
                            float x6 = motionEvent.getX(i7);
                            float y6 = motionEvent.getY(i7);
                            float f6 = x6 - this.f9866d[pointerId2];
                            float f7 = y6 - this.f9867e[pointerId2];
                            B(f6, f7, pointerId2);
                            if (this.f9863a != 1) {
                                View r6 = r((int) x6, (int) y6);
                                if (d(r6, f6, f7) && I(r6, pointerId2)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i7++;
                    }
                } else {
                    if (!x(this.f9865c)) {
                        return;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(this.f9865c);
                    float x7 = motionEvent.getX(findPointerIndex);
                    float y7 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f9868f;
                    int i10 = this.f9865c;
                    int i11 = (int) (x7 - fArr[i10]);
                    int i12 = (int) (y7 - this.f9869g[i10]);
                    p(this.f9882t.getLeft() + i11, this.f9882t.getTop() + i12, i11, i12);
                }
                D(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked == 5) {
                    int pointerId3 = motionEvent.getPointerId(actionIndex);
                    float x8 = motionEvent.getX(actionIndex);
                    float y8 = motionEvent.getY(actionIndex);
                    C(x8, y8, pointerId3);
                    if (this.f9863a != 0) {
                        if (v((int) x8, (int) y8)) {
                            I(this.f9882t, pointerId3);
                            return;
                        }
                        return;
                    } else {
                        I(r((int) x8, (int) y8), pointerId3);
                        int i13 = this.f9870h[pointerId3];
                        int i14 = this.f9879q;
                        if ((i13 & i14) != 0) {
                            this.f9881s.h(i13 & i14, pointerId3);
                            return;
                        }
                        return;
                    }
                }
                if (actionMasked != 6) {
                    return;
                }
                int pointerId4 = motionEvent.getPointerId(actionIndex);
                if (this.f9863a == 1 && pointerId4 == this.f9865c) {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (true) {
                        if (i7 >= pointerCount2) {
                            i6 = -1;
                            break;
                        }
                        int pointerId5 = motionEvent.getPointerId(i7);
                        if (pointerId5 != this.f9865c) {
                            View r7 = r((int) motionEvent.getX(i7), (int) motionEvent.getY(i7));
                            View view = this.f9882t;
                            if (r7 == view && I(view, pointerId5)) {
                                i6 = this.f9865c;
                                break;
                            }
                        }
                        i7++;
                    }
                    if (i6 == -1) {
                        A();
                    }
                }
                h(pointerId4);
                return;
            }
            if (this.f9863a == 1) {
                n(0.0f, 0.0f);
            }
        } else if (this.f9863a == 1) {
            A();
        }
        a();
    }
}
