package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.b1;

/* loaded from: classes.dex */
public abstract class a implements View.OnTouchListener {

    /* renamed from: r, reason: collision with root package name */
    private static final int f2444r = ViewConfiguration.getTapTimeout();

    /* renamed from: c, reason: collision with root package name */
    final View f2447c;

    /* renamed from: d, reason: collision with root package name */
    private Runnable f2448d;

    /* renamed from: g, reason: collision with root package name */
    private int f2451g;

    /* renamed from: h, reason: collision with root package name */
    private int f2452h;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2456l;

    /* renamed from: m, reason: collision with root package name */
    boolean f2457m;

    /* renamed from: n, reason: collision with root package name */
    boolean f2458n;

    /* renamed from: o, reason: collision with root package name */
    boolean f2459o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2460p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f2461q;

    /* renamed from: a, reason: collision with root package name */
    final C0039a f2445a = new C0039a();

    /* renamed from: b, reason: collision with root package name */
    private final Interpolator f2446b = new AccelerateInterpolator();

    /* renamed from: e, reason: collision with root package name */
    private float[] f2449e = {0.0f, 0.0f};

    /* renamed from: f, reason: collision with root package name */
    private float[] f2450f = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* renamed from: i, reason: collision with root package name */
    private float[] f2453i = {0.0f, 0.0f};

    /* renamed from: j, reason: collision with root package name */
    private float[] f2454j = {0.0f, 0.0f};

    /* renamed from: k, reason: collision with root package name */
    private float[] f2455k = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0039a {

        /* renamed from: a, reason: collision with root package name */
        private int f2462a;

        /* renamed from: b, reason: collision with root package name */
        private int f2463b;

        /* renamed from: c, reason: collision with root package name */
        private float f2464c;

        /* renamed from: d, reason: collision with root package name */
        private float f2465d;

        /* renamed from: j, reason: collision with root package name */
        private float f2471j;

        /* renamed from: k, reason: collision with root package name */
        private int f2472k;

        /* renamed from: e, reason: collision with root package name */
        private long f2466e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f2470i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f2467f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f2468g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f2469h = 0;

        C0039a() {
        }

        private float e(long j6) {
            long j7 = this.f2466e;
            if (j6 < j7) {
                return 0.0f;
            }
            long j8 = this.f2470i;
            if (j8 < 0 || j6 < j8) {
                return a.e(((float) (j6 - j7)) / this.f2462a, 0.0f, 1.0f) * 0.5f;
            }
            float f6 = this.f2471j;
            return (1.0f - f6) + (f6 * a.e(((float) (j6 - j8)) / this.f2472k, 0.0f, 1.0f));
        }

        private float g(float f6) {
            return ((-4.0f) * f6 * f6) + (f6 * 4.0f);
        }

        public void a() {
            if (this.f2467f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            float g6 = g(e(currentAnimationTimeMillis));
            long j6 = currentAnimationTimeMillis - this.f2467f;
            this.f2467f = currentAnimationTimeMillis;
            float f6 = ((float) j6) * g6;
            this.f2468g = (int) (this.f2464c * f6);
            this.f2469h = (int) (f6 * this.f2465d);
        }

        public int b() {
            return this.f2468g;
        }

        public int c() {
            return this.f2469h;
        }

        public int d() {
            float f6 = this.f2464c;
            return (int) (f6 / Math.abs(f6));
        }

        public int f() {
            float f6 = this.f2465d;
            return (int) (f6 / Math.abs(f6));
        }

        public boolean h() {
            return this.f2470i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f2470i + ((long) this.f2472k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2472k = a.f((int) (currentAnimationTimeMillis - this.f2466e), 0, this.f2463b);
            this.f2471j = e(currentAnimationTimeMillis);
            this.f2470i = currentAnimationTimeMillis;
        }

        public void j(int i6) {
            this.f2463b = i6;
        }

        public void k(int i6) {
            this.f2462a = i6;
        }

        public void l(float f6, float f7) {
            this.f2464c = f6;
            this.f2465d = f7;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f2466e = currentAnimationTimeMillis;
            this.f2470i = -1L;
            this.f2467f = currentAnimationTimeMillis;
            this.f2471j = 0.5f;
            this.f2468g = 0;
            this.f2469h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            if (aVar.f2459o) {
                if (aVar.f2457m) {
                    aVar.f2457m = false;
                    aVar.f2445a.m();
                }
                C0039a c0039a = a.this.f2445a;
                if (c0039a.h() || !a.this.u()) {
                    a.this.f2459o = false;
                    return;
                }
                a aVar2 = a.this;
                if (aVar2.f2458n) {
                    aVar2.f2458n = false;
                    aVar2.c();
                }
                c0039a.a();
                a.this.j(c0039a.b(), c0039a.c());
                b1.i0(a.this.f2447c, this);
            }
        }
    }

    public a(View view) {
        this.f2447c = view;
        float f6 = Resources.getSystem().getDisplayMetrics().density;
        float f7 = (int) ((1575.0f * f6) + 0.5f);
        o(f7, f7);
        float f8 = (int) ((f6 * 315.0f) + 0.5f);
        p(f8, f8);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f2444r);
        r(500);
        q(500);
    }

    private float d(int i6, float f6, float f7, float f8) {
        float h6 = h(this.f2449e[i6], f7, this.f2450f[i6], f6);
        if (h6 == 0.0f) {
            return 0.0f;
        }
        float f9 = this.f2453i[i6];
        float f10 = this.f2454j[i6];
        float f11 = this.f2455k[i6];
        float f12 = f9 * f8;
        return h6 > 0.0f ? e(h6 * f12, f10, f11) : -e((-h6) * f12, f10, f11);
    }

    static float e(float f6, float f7, float f8) {
        return f6 > f8 ? f8 : f6 < f7 ? f7 : f6;
    }

    static int f(int i6, int i7, int i8) {
        return i6 > i8 ? i8 : i6 < i7 ? i7 : i6;
    }

    private float g(float f6, float f7) {
        if (f7 == 0.0f) {
            return 0.0f;
        }
        int i6 = this.f2451g;
        if (i6 == 0 || i6 == 1) {
            if (f6 < f7) {
                if (f6 >= 0.0f) {
                    return 1.0f - (f6 / f7);
                }
                if (this.f2459o && i6 == 1) {
                    return 1.0f;
                }
            }
        } else if (i6 == 2 && f6 < 0.0f) {
            return f6 / (-f7);
        }
        return 0.0f;
    }

    private float h(float f6, float f7, float f8, float f9) {
        float interpolation;
        float e6 = e(f6 * f7, 0.0f, f8);
        float g6 = g(f7 - f9, e6) - g(f9, e6);
        if (g6 < 0.0f) {
            interpolation = -this.f2446b.getInterpolation(-g6);
        } else {
            if (g6 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f2446b.getInterpolation(g6);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.f2457m) {
            this.f2459o = false;
        } else {
            this.f2445a.i();
        }
    }

    private void v() {
        int i6;
        if (this.f2448d == null) {
            this.f2448d = new b();
        }
        this.f2459o = true;
        this.f2457m = true;
        if (this.f2456l || (i6 = this.f2452h) <= 0) {
            this.f2448d.run();
        } else {
            b1.j0(this.f2447c, this.f2448d, i6);
        }
        this.f2456l = true;
    }

    public abstract boolean a(int i6);

    public abstract boolean b(int i6);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f2447c.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i6, int i7);

    public a k(int i6) {
        this.f2452h = i6;
        return this;
    }

    public a l(int i6) {
        this.f2451g = i6;
        return this;
    }

    public a m(boolean z5) {
        if (this.f2460p && !z5) {
            i();
        }
        this.f2460p = z5;
        return this;
    }

    public a n(float f6, float f7) {
        float[] fArr = this.f2450f;
        fArr[0] = f6;
        fArr[1] = f7;
        return this;
    }

    public a o(float f6, float f7) {
        float[] fArr = this.f2455k;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
    
        if (r0 != 3) goto L20;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.f2460p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r6 = 3
            if (r0 == r6) goto L16
            goto L58
        L16:
            r5.i()
            goto L58
        L1a:
            r5.f2458n = r2
            r5.f2456l = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f2447c
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f2447c
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.a$a r7 = r5.f2445a
            r7.l(r0, r6)
            boolean r6 = r5.f2459o
            if (r6 != 0) goto L58
            boolean r6 = r5.u()
            if (r6 == 0) goto L58
            r5.v()
        L58:
            boolean r6 = r5.f2461q
            if (r6 == 0) goto L61
            boolean r6 = r5.f2459o
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public a p(float f6, float f7) {
        float[] fArr = this.f2454j;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    public a q(int i6) {
        this.f2445a.j(i6);
        return this;
    }

    public a r(int i6) {
        this.f2445a.k(i6);
        return this;
    }

    public a s(float f6, float f7) {
        float[] fArr = this.f2449e;
        fArr[0] = f6;
        fArr[1] = f7;
        return this;
    }

    public a t(float f6, float f7) {
        float[] fArr = this.f2453i;
        fArr[0] = f6 / 1000.0f;
        fArr[1] = f7 / 1000.0f;
        return this;
    }

    boolean u() {
        C0039a c0039a = this.f2445a;
        int f6 = c0039a.f();
        int d6 = c0039a.d();
        return (f6 != 0 && b(f6)) || (d6 != 0 && a(d6));
    }
}
