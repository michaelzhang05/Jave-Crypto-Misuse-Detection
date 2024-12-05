package androidx.core.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.core.view.u;

/* compiled from: AutoScrollHelper.java */
/* loaded from: classes.dex */
public abstract class c implements View.OnTouchListener {

    /* renamed from: f, reason: collision with root package name */
    private static final int f1060f = ViewConfiguration.getTapTimeout();

    /* renamed from: i, reason: collision with root package name */
    final View f1063i;

    /* renamed from: j, reason: collision with root package name */
    private Runnable f1064j;
    private int m;
    private int n;
    private boolean r;
    boolean s;
    boolean t;
    boolean u;
    private boolean v;
    private boolean w;

    /* renamed from: g, reason: collision with root package name */
    final a f1061g = new a();

    /* renamed from: h, reason: collision with root package name */
    private final Interpolator f1062h = new AccelerateInterpolator();

    /* renamed from: k, reason: collision with root package name */
    private float[] f1065k = {0.0f, 0.0f};
    private float[] l = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] o = {0.0f, 0.0f};
    private float[] p = {0.0f, 0.0f};
    private float[] q = {Float.MAX_VALUE, Float.MAX_VALUE};

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private int f1066b;

        /* renamed from: c, reason: collision with root package name */
        private float f1067c;

        /* renamed from: d, reason: collision with root package name */
        private float f1068d;

        /* renamed from: j, reason: collision with root package name */
        private float f1074j;

        /* renamed from: k, reason: collision with root package name */
        private int f1075k;

        /* renamed from: e, reason: collision with root package name */
        private long f1069e = Long.MIN_VALUE;

        /* renamed from: i, reason: collision with root package name */
        private long f1073i = -1;

        /* renamed from: f, reason: collision with root package name */
        private long f1070f = 0;

        /* renamed from: g, reason: collision with root package name */
        private int f1071g = 0;

        /* renamed from: h, reason: collision with root package name */
        private int f1072h = 0;

        a() {
        }

        private float e(long j2) {
            long j3 = this.f1069e;
            if (j2 < j3) {
                return 0.0f;
            }
            long j4 = this.f1073i;
            if (j4 >= 0 && j2 >= j4) {
                float f2 = this.f1074j;
                return (1.0f - f2) + (f2 * c.e(((float) (j2 - j4)) / this.f1075k, 0.0f, 1.0f));
            }
            return c.e(((float) (j2 - j3)) / this.a, 0.0f, 1.0f) * 0.5f;
        }

        private float g(float f2) {
            return ((-4.0f) * f2 * f2) + (f2 * 4.0f);
        }

        public void a() {
            if (this.f1070f != 0) {
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                float g2 = g(e(currentAnimationTimeMillis));
                long j2 = currentAnimationTimeMillis - this.f1070f;
                this.f1070f = currentAnimationTimeMillis;
                float f2 = ((float) j2) * g2;
                this.f1071g = (int) (this.f1067c * f2);
                this.f1072h = (int) (f2 * this.f1068d);
                return;
            }
            throw new RuntimeException("Cannot compute scroll delta before calling start()");
        }

        public int b() {
            return this.f1071g;
        }

        public int c() {
            return this.f1072h;
        }

        public int d() {
            float f2 = this.f1067c;
            return (int) (f2 / Math.abs(f2));
        }

        public int f() {
            float f2 = this.f1068d;
            return (int) (f2 / Math.abs(f2));
        }

        public boolean h() {
            return this.f1073i > 0 && AnimationUtils.currentAnimationTimeMillis() > this.f1073i + ((long) this.f1075k);
        }

        public void i() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1075k = c.f((int) (currentAnimationTimeMillis - this.f1069e), 0, this.f1066b);
            this.f1074j = e(currentAnimationTimeMillis);
            this.f1073i = currentAnimationTimeMillis;
        }

        public void j(int i2) {
            this.f1066b = i2;
        }

        public void k(int i2) {
            this.a = i2;
        }

        public void l(float f2, float f3) {
            this.f1067c = f2;
            this.f1068d = f3;
        }

        public void m() {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f1069e = currentAnimationTimeMillis;
            this.f1073i = -1L;
            this.f1070f = currentAnimationTimeMillis;
            this.f1074j = 0.5f;
            this.f1071g = 0;
            this.f1072h = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoScrollHelper.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            if (cVar.u) {
                if (cVar.s) {
                    cVar.s = false;
                    cVar.f1061g.m();
                }
                a aVar = c.this.f1061g;
                if (!aVar.h() && c.this.v()) {
                    c cVar2 = c.this;
                    if (cVar2.t) {
                        cVar2.t = false;
                        cVar2.c();
                    }
                    aVar.a();
                    c.this.j(aVar.b(), aVar.c());
                    u.a0(c.this.f1063i, this);
                    return;
                }
                c.this.u = false;
            }
        }
    }

    public c(View view) {
        this.f1063i = view;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = (int) ((1575.0f * f2) + 0.5f);
        o(f3, f3);
        float f4 = (int) ((f2 * 315.0f) + 0.5f);
        p(f4, f4);
        l(1);
        n(Float.MAX_VALUE, Float.MAX_VALUE);
        s(0.2f, 0.2f);
        t(1.0f, 1.0f);
        k(f1060f);
        r(500);
        q(500);
    }

    private float d(int i2, float f2, float f3, float f4) {
        float h2 = h(this.f1065k[i2], f3, this.l[i2], f2);
        if (h2 == 0.0f) {
            return 0.0f;
        }
        float f5 = this.o[i2];
        float f6 = this.p[i2];
        float f7 = this.q[i2];
        float f8 = f5 * f4;
        if (h2 > 0.0f) {
            return e(h2 * f8, f6, f7);
        }
        return -e((-h2) * f8, f6, f7);
    }

    static float e(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    static int f(int i2, int i3, int i4) {
        return i2 > i4 ? i4 : i2 < i3 ? i3 : i2;
    }

    private float g(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i2 = this.m;
        if (i2 == 0 || i2 == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.u && i2 == 1) {
                    return 1.0f;
                }
            }
        } else if (i2 == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    private float h(float f2, float f3, float f4, float f5) {
        float interpolation;
        float e2 = e(f2 * f3, 0.0f, f4);
        float g2 = g(f3 - f5, e2) - g(f5, e2);
        if (g2 < 0.0f) {
            interpolation = -this.f1062h.getInterpolation(-g2);
        } else {
            if (g2 <= 0.0f) {
                return 0.0f;
            }
            interpolation = this.f1062h.getInterpolation(g2);
        }
        return e(interpolation, -1.0f, 1.0f);
    }

    private void i() {
        if (this.s) {
            this.u = false;
        } else {
            this.f1061g.i();
        }
    }

    private void w() {
        int i2;
        if (this.f1064j == null) {
            this.f1064j = new b();
        }
        this.u = true;
        this.s = true;
        if (!this.r && (i2 = this.n) > 0) {
            u.b0(this.f1063i, this.f1064j, i2);
        } else {
            this.f1064j.run();
        }
        this.r = true;
    }

    public abstract boolean a(int i2);

    public abstract boolean b(int i2);

    void c() {
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
        this.f1063i.onTouchEvent(obtain);
        obtain.recycle();
    }

    public abstract void j(int i2, int i3);

    public c k(int i2) {
        this.n = i2;
        return this;
    }

    public c l(int i2) {
        this.m = i2;
        return this;
    }

    public c m(boolean z) {
        if (this.v && !z) {
            i();
        }
        this.v = z;
        return this;
    }

    public c n(float f2, float f3) {
        float[] fArr = this.l;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public c o(float f2, float f3) {
        float[] fArr = this.q;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
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
            boolean r0 = r5.v
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
            r5.t = r2
            r5.r = r1
        L1e:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.f1063i
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.d(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.f1063i
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.d(r2, r7, r6, r3)
            androidx.core.widget.c$a r7 = r5.f1061g
            r7.l(r0, r6)
            boolean r6 = r5.u
            if (r6 != 0) goto L58
            boolean r6 = r5.v()
            if (r6 == 0) goto L58
            r5.w()
        L58:
            boolean r6 = r5.w
            if (r6 == 0) goto L61
            boolean r6 = r5.u
            if (r6 == 0) goto L61
            r1 = 1
        L61:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.c.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public c p(float f2, float f3) {
        float[] fArr = this.p;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    public c q(int i2) {
        this.f1061g.j(i2);
        return this;
    }

    public c r(int i2) {
        this.f1061g.k(i2);
        return this;
    }

    public c s(float f2, float f3) {
        float[] fArr = this.f1065k;
        fArr[0] = f2;
        fArr[1] = f3;
        return this;
    }

    public c t(float f2, float f3) {
        float[] fArr = this.o;
        fArr[0] = f2 / 1000.0f;
        fArr[1] = f3 / 1000.0f;
        return this;
    }

    boolean v() {
        a aVar = this.f1061g;
        int f2 = aVar.f();
        int d2 = aVar.d();
        return (f2 != 0 && b(f2)) || (d2 != 0 && a(d2));
    }
}
