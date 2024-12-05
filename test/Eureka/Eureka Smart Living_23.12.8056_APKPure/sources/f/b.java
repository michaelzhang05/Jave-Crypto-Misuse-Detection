package f;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class b extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    private d f6531a;

    /* renamed from: b, reason: collision with root package name */
    private Rect f6532b;

    /* renamed from: c, reason: collision with root package name */
    private Drawable f6533c;

    /* renamed from: d, reason: collision with root package name */
    private Drawable f6534d;

    /* renamed from: f, reason: collision with root package name */
    private boolean f6536f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6538h;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f6539i;

    /* renamed from: j, reason: collision with root package name */
    private long f6540j;

    /* renamed from: k, reason: collision with root package name */
    private long f6541k;

    /* renamed from: l, reason: collision with root package name */
    private c f6542l;

    /* renamed from: e, reason: collision with root package name */
    private int f6535e = 255;

    /* renamed from: g, reason: collision with root package name */
    private int f6537g = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(true);
            b.this.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0098b {
        public static boolean a(Drawable.ConstantState constantState) {
            return constantState.canApplyTheme();
        }

        public static void b(Drawable drawable, Outline outline) {
            drawable.getOutline(outline);
        }

        public static Resources c(Resources.Theme theme) {
            return theme.getResources();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c implements Drawable.Callback {

        /* renamed from: a, reason: collision with root package name */
        private Drawable.Callback f6544a;

        c() {
        }

        public Drawable.Callback a() {
            Drawable.Callback callback = this.f6544a;
            this.f6544a = null;
            return callback;
        }

        public c b(Drawable.Callback callback) {
            this.f6544a = callback;
            return this;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
            Drawable.Callback callback = this.f6544a;
            if (callback != null) {
                callback.scheduleDrawable(drawable, runnable, j6);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            Drawable.Callback callback = this.f6544a;
            if (callback != null) {
                callback.unscheduleDrawable(drawable, runnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class d extends Drawable.ConstantState {
        int A;
        int B;
        boolean C;
        ColorFilter D;
        boolean E;
        ColorStateList F;
        PorterDuff.Mode G;
        boolean H;
        boolean I;

        /* renamed from: a, reason: collision with root package name */
        final b f6545a;

        /* renamed from: b, reason: collision with root package name */
        Resources f6546b;

        /* renamed from: c, reason: collision with root package name */
        int f6547c;

        /* renamed from: d, reason: collision with root package name */
        int f6548d;

        /* renamed from: e, reason: collision with root package name */
        int f6549e;

        /* renamed from: f, reason: collision with root package name */
        SparseArray f6550f;

        /* renamed from: g, reason: collision with root package name */
        Drawable[] f6551g;

        /* renamed from: h, reason: collision with root package name */
        int f6552h;

        /* renamed from: i, reason: collision with root package name */
        boolean f6553i;

        /* renamed from: j, reason: collision with root package name */
        boolean f6554j;

        /* renamed from: k, reason: collision with root package name */
        Rect f6555k;

        /* renamed from: l, reason: collision with root package name */
        boolean f6556l;

        /* renamed from: m, reason: collision with root package name */
        boolean f6557m;

        /* renamed from: n, reason: collision with root package name */
        int f6558n;

        /* renamed from: o, reason: collision with root package name */
        int f6559o;

        /* renamed from: p, reason: collision with root package name */
        int f6560p;

        /* renamed from: q, reason: collision with root package name */
        int f6561q;

        /* renamed from: r, reason: collision with root package name */
        boolean f6562r;

        /* renamed from: s, reason: collision with root package name */
        int f6563s;

        /* renamed from: t, reason: collision with root package name */
        boolean f6564t;

        /* renamed from: u, reason: collision with root package name */
        boolean f6565u;

        /* renamed from: v, reason: collision with root package name */
        boolean f6566v;

        /* renamed from: w, reason: collision with root package name */
        boolean f6567w;

        /* renamed from: x, reason: collision with root package name */
        boolean f6568x;

        /* renamed from: y, reason: collision with root package name */
        boolean f6569y;

        /* renamed from: z, reason: collision with root package name */
        int f6570z;

        /* JADX INFO: Access modifiers changed from: package-private */
        public d(d dVar, b bVar, Resources resources) {
            this.f6553i = false;
            this.f6556l = false;
            this.f6568x = true;
            this.A = 0;
            this.B = 0;
            this.f6545a = bVar;
            this.f6546b = resources != null ? resources : dVar != null ? dVar.f6546b : null;
            int f6 = b.f(resources, dVar != null ? dVar.f6547c : 0);
            this.f6547c = f6;
            if (dVar == null) {
                this.f6551g = new Drawable[10];
                this.f6552h = 0;
                return;
            }
            this.f6548d = dVar.f6548d;
            this.f6549e = dVar.f6549e;
            this.f6566v = true;
            this.f6567w = true;
            this.f6553i = dVar.f6553i;
            this.f6556l = dVar.f6556l;
            this.f6568x = dVar.f6568x;
            this.f6569y = dVar.f6569y;
            this.f6570z = dVar.f6570z;
            this.A = dVar.A;
            this.B = dVar.B;
            this.C = dVar.C;
            this.D = dVar.D;
            this.E = dVar.E;
            this.F = dVar.F;
            this.G = dVar.G;
            this.H = dVar.H;
            this.I = dVar.I;
            if (dVar.f6547c == f6) {
                if (dVar.f6554j) {
                    this.f6555k = dVar.f6555k != null ? new Rect(dVar.f6555k) : null;
                    this.f6554j = true;
                }
                if (dVar.f6557m) {
                    this.f6558n = dVar.f6558n;
                    this.f6559o = dVar.f6559o;
                    this.f6560p = dVar.f6560p;
                    this.f6561q = dVar.f6561q;
                    this.f6557m = true;
                }
            }
            if (dVar.f6562r) {
                this.f6563s = dVar.f6563s;
                this.f6562r = true;
            }
            if (dVar.f6564t) {
                this.f6565u = dVar.f6565u;
                this.f6564t = true;
            }
            Drawable[] drawableArr = dVar.f6551g;
            this.f6551g = new Drawable[drawableArr.length];
            this.f6552h = dVar.f6552h;
            SparseArray sparseArray = dVar.f6550f;
            this.f6550f = sparseArray != null ? sparseArray.clone() : new SparseArray(this.f6552h);
            int i6 = this.f6552h;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f6550f.put(i7, constantState);
                    } else {
                        this.f6551g[i7] = drawableArr[i7];
                    }
                }
            }
        }

        private void e() {
            SparseArray sparseArray = this.f6550f;
            if (sparseArray != null) {
                int size = sparseArray.size();
                for (int i6 = 0; i6 < size; i6++) {
                    this.f6551g[this.f6550f.keyAt(i6)] = s(((Drawable.ConstantState) this.f6550f.valueAt(i6)).newDrawable(this.f6546b));
                }
                this.f6550f = null;
            }
        }

        private Drawable s(Drawable drawable) {
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, this.f6570z);
            }
            Drawable mutate = drawable.mutate();
            mutate.setCallback(this.f6545a);
            return mutate;
        }

        public final int a(Drawable drawable) {
            int i6 = this.f6552h;
            if (i6 >= this.f6551g.length) {
                o(i6, i6 + 10);
            }
            drawable.mutate();
            drawable.setVisible(false, true);
            drawable.setCallback(this.f6545a);
            this.f6551g[i6] = drawable;
            this.f6552h++;
            this.f6549e = drawable.getChangingConfigurations() | this.f6549e;
            p();
            this.f6555k = null;
            this.f6554j = false;
            this.f6557m = false;
            this.f6566v = false;
            return i6;
        }

        final void b(Resources.Theme theme) {
            if (theme != null) {
                e();
                int i6 = this.f6552h;
                Drawable[] drawableArr = this.f6551g;
                for (int i7 = 0; i7 < i6; i7++) {
                    Drawable drawable = drawableArr[i7];
                    if (drawable != null && androidx.core.graphics.drawable.a.b(drawable)) {
                        androidx.core.graphics.drawable.a.a(drawableArr[i7], theme);
                        this.f6549e |= drawableArr[i7].getChangingConfigurations();
                    }
                }
                y(C0098b.c(theme));
            }
        }

        public boolean c() {
            if (this.f6566v) {
                return this.f6567w;
            }
            e();
            this.f6566v = true;
            int i6 = this.f6552h;
            Drawable[] drawableArr = this.f6551g;
            for (int i7 = 0; i7 < i6; i7++) {
                if (drawableArr[i7].getConstantState() == null) {
                    this.f6567w = false;
                    return false;
                }
            }
            this.f6567w = true;
            return true;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            int i6 = this.f6552h;
            Drawable[] drawableArr = this.f6551g;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                if (drawable == null) {
                    Drawable.ConstantState constantState = (Drawable.ConstantState) this.f6550f.get(i7);
                    if (constantState != null && C0098b.a(constantState)) {
                        return true;
                    }
                } else if (androidx.core.graphics.drawable.a.b(drawable)) {
                    return true;
                }
            }
            return false;
        }

        protected void d() {
            this.f6557m = true;
            e();
            int i6 = this.f6552h;
            Drawable[] drawableArr = this.f6551g;
            this.f6559o = -1;
            this.f6558n = -1;
            this.f6561q = 0;
            this.f6560p = 0;
            for (int i7 = 0; i7 < i6; i7++) {
                Drawable drawable = drawableArr[i7];
                int intrinsicWidth = drawable.getIntrinsicWidth();
                if (intrinsicWidth > this.f6558n) {
                    this.f6558n = intrinsicWidth;
                }
                int intrinsicHeight = drawable.getIntrinsicHeight();
                if (intrinsicHeight > this.f6559o) {
                    this.f6559o = intrinsicHeight;
                }
                int minimumWidth = drawable.getMinimumWidth();
                if (minimumWidth > this.f6560p) {
                    this.f6560p = minimumWidth;
                }
                int minimumHeight = drawable.getMinimumHeight();
                if (minimumHeight > this.f6561q) {
                    this.f6561q = minimumHeight;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final int f() {
            return this.f6551g.length;
        }

        public final Drawable g(int i6) {
            int indexOfKey;
            Drawable drawable = this.f6551g[i6];
            if (drawable != null) {
                return drawable;
            }
            SparseArray sparseArray = this.f6550f;
            if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i6)) < 0) {
                return null;
            }
            Drawable s5 = s(((Drawable.ConstantState) this.f6550f.valueAt(indexOfKey)).newDrawable(this.f6546b));
            this.f6551g[i6] = s5;
            this.f6550f.removeAt(indexOfKey);
            if (this.f6550f.size() == 0) {
                this.f6550f = null;
            }
            return s5;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6548d | this.f6549e;
        }

        public final int h() {
            return this.f6552h;
        }

        public final int i() {
            if (!this.f6557m) {
                d();
            }
            return this.f6559o;
        }

        public final int j() {
            if (!this.f6557m) {
                d();
            }
            return this.f6561q;
        }

        public final int k() {
            if (!this.f6557m) {
                d();
            }
            return this.f6560p;
        }

        public final Rect l() {
            Rect rect = null;
            if (this.f6553i) {
                return null;
            }
            Rect rect2 = this.f6555k;
            if (rect2 != null || this.f6554j) {
                return rect2;
            }
            e();
            Rect rect3 = new Rect();
            int i6 = this.f6552h;
            Drawable[] drawableArr = this.f6551g;
            for (int i7 = 0; i7 < i6; i7++) {
                if (drawableArr[i7].getPadding(rect3)) {
                    if (rect == null) {
                        rect = new Rect(0, 0, 0, 0);
                    }
                    int i8 = rect3.left;
                    if (i8 > rect.left) {
                        rect.left = i8;
                    }
                    int i9 = rect3.top;
                    if (i9 > rect.top) {
                        rect.top = i9;
                    }
                    int i10 = rect3.right;
                    if (i10 > rect.right) {
                        rect.right = i10;
                    }
                    int i11 = rect3.bottom;
                    if (i11 > rect.bottom) {
                        rect.bottom = i11;
                    }
                }
            }
            this.f6554j = true;
            this.f6555k = rect;
            return rect;
        }

        public final int m() {
            if (!this.f6557m) {
                d();
            }
            return this.f6558n;
        }

        public final int n() {
            if (this.f6562r) {
                return this.f6563s;
            }
            e();
            int i6 = this.f6552h;
            Drawable[] drawableArr = this.f6551g;
            int opacity = i6 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i7 = 1; i7 < i6; i7++) {
                opacity = Drawable.resolveOpacity(opacity, drawableArr[i7].getOpacity());
            }
            this.f6563s = opacity;
            this.f6562r = true;
            return opacity;
        }

        public void o(int i6, int i7) {
            Drawable[] drawableArr = new Drawable[i7];
            Drawable[] drawableArr2 = this.f6551g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i6);
            }
            this.f6551g = drawableArr;
        }

        void p() {
            this.f6562r = false;
            this.f6564t = false;
        }

        public final boolean q() {
            return this.f6556l;
        }

        abstract void r();

        public final void t(boolean z5) {
            this.f6556l = z5;
        }

        public final void u(int i6) {
            this.A = i6;
        }

        public final void v(int i6) {
            this.B = i6;
        }

        final boolean w(int i6, int i7) {
            int i8 = this.f6552h;
            Drawable[] drawableArr = this.f6551g;
            boolean z5 = false;
            for (int i9 = 0; i9 < i8; i9++) {
                Drawable drawable = drawableArr[i9];
                if (drawable != null) {
                    boolean m6 = Build.VERSION.SDK_INT >= 23 ? androidx.core.graphics.drawable.a.m(drawable, i6) : false;
                    if (i9 == i7) {
                        z5 = m6;
                    }
                }
            }
            this.f6570z = i6;
            return z5;
        }

        public final void x(boolean z5) {
            this.f6553i = z5;
        }

        final void y(Resources resources) {
            if (resources != null) {
                this.f6546b = resources;
                int f6 = b.f(resources, this.f6547c);
                int i6 = this.f6547c;
                this.f6547c = f6;
                if (i6 != f6) {
                    this.f6557m = false;
                    this.f6554j = false;
                }
            }
        }
    }

    private void d(Drawable drawable) {
        if (this.f6542l == null) {
            this.f6542l = new c();
        }
        drawable.setCallback(this.f6542l.b(drawable.getCallback()));
        try {
            if (this.f6531a.A <= 0 && this.f6536f) {
                drawable.setAlpha(this.f6535e);
            }
            d dVar = this.f6531a;
            if (dVar.E) {
                drawable.setColorFilter(dVar.D);
            } else {
                if (dVar.H) {
                    androidx.core.graphics.drawable.a.o(drawable, dVar.F);
                }
                d dVar2 = this.f6531a;
                if (dVar2.I) {
                    androidx.core.graphics.drawable.a.p(drawable, dVar2.G);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f6531a.f6568x);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            if (Build.VERSION.SDK_INT >= 23) {
                androidx.core.graphics.drawable.a.m(drawable, androidx.core.graphics.drawable.a.f(this));
            }
            androidx.core.graphics.drawable.a.j(drawable, this.f6531a.C);
            Rect rect = this.f6532b;
            if (rect != null) {
                androidx.core.graphics.drawable.a.l(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
        } finally {
            drawable.setCallback(this.f6542l.a());
        }
    }

    private boolean e() {
        return isAutoMirrored() && androidx.core.graphics.drawable.a.f(this) == 1;
    }

    static int f(Resources resources, int i6) {
        if (resources != null) {
            i6 = resources.getDisplayMetrics().densityDpi;
        }
        if (i6 == 0) {
            return 160;
        }
        return i6;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f6536f = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f6533c
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f6540j
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L20
            int r9 = r13.f6535e
            r3.setAlpha(r9)
            goto L36
        L20:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r10 = (int) r9
            f.b$d r9 = r13.f6531a
            int r9 = r9.A
            int r10 = r10 / r9
            int r9 = 255 - r10
            int r10 = r13.f6535e
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = 1
            goto L39
        L36:
            r13.f6540j = r6
        L38:
            r3 = 0
        L39:
            android.graphics.drawable.Drawable r9 = r13.f6534d
            if (r9 == 0) goto L61
            long r10 = r13.f6541k
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L4e
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f6534d = r0
            goto L61
        L4e:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            f.b$d r4 = r13.f6531a
            int r4 = r4.B
            int r3 = r3 / r4
            int r4 = r13.f6535e
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.f6541k = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            java.lang.Runnable r14 = r13.f6539i
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        this.f6531a.b(theme);
    }

    abstract d b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f6537g;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        return this.f6531a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f6534d;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(int r10) {
        /*
            r9 = this;
            int r0 = r9.f6537g
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            f.b$d r0 = r9.f6531a
            int r0 = r0.B
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f6534d
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f6533c
            if (r0 == 0) goto L29
            r9.f6534d = r0
            f.b$d r0 = r9.f6531a
            int r0 = r0.B
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.f6541k = r0
            goto L35
        L29:
            r9.f6534d = r4
            r9.f6541k = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f6533c
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            f.b$d r0 = r9.f6531a
            int r1 = r0.f6552h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.g(r10)
            r9.f6533c = r0
            r9.f6537g = r10
            if (r0 == 0) goto L5a
            f.b$d r10 = r9.f6531a
            int r10 = r10.A
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f6540j = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f6533c = r4
            r10 = -1
            r9.f6537g = r10
        L5a:
            long r0 = r9.f6540j
            r10 = 1
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 != 0) goto L67
            long r0 = r9.f6541k
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L79
        L67:
            java.lang.Runnable r0 = r9.f6539i
            if (r0 != 0) goto L73
            f.b$a r0 = new f.b$a
            r0.<init>()
            r9.f6539i = r0
            goto L76
        L73:
            r9.unscheduleSelf(r0)
        L76:
            r9.a(r10)
        L79:
            r9.invalidateSelf()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f.b.g(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6535e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f6531a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (!this.f6531a.c()) {
            return null;
        }
        this.f6531a.f6548d = getChangingConfigurations();
        return this.f6531a;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f6533c;
    }

    @Override // android.graphics.drawable.Drawable
    public void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f6532b;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.f6531a.q()) {
            return this.f6531a.i();
        }
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.f6531a.q()) {
            return this.f6531a.m();
        }
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        if (this.f6531a.q()) {
            return this.f6531a.j();
        }
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        if (this.f6531a.q()) {
            return this.f6531a.k();
        }
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6533c;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        return this.f6531a.n();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            C0098b.b(drawable, outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        boolean padding;
        Rect l6 = this.f6531a.l();
        if (l6 != null) {
            rect.set(l6);
            padding = (l6.right | ((l6.left | l6.top) | l6.bottom)) != 0;
        } else {
            Drawable drawable = this.f6533c;
            padding = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (e()) {
            int i6 = rect.left;
            rect.left = rect.right;
            rect.right = i6;
        }
        return padding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(d dVar) {
        this.f6531a = dVar;
        int i6 = this.f6537g;
        if (i6 >= 0) {
            Drawable g6 = dVar.g(i6);
            this.f6533c = g6;
            if (g6 != null) {
                d(g6);
            }
        }
        this.f6534d = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(Resources resources) {
        this.f6531a.y(resources);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        d dVar = this.f6531a;
        if (dVar != null) {
            dVar.p();
        }
        if (drawable != this.f6533c || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f6531a.C;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z5;
        Drawable drawable = this.f6534d;
        boolean z6 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f6534d = null;
            z5 = true;
        } else {
            z5 = false;
        }
        Drawable drawable2 = this.f6533c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f6536f) {
                this.f6533c.setAlpha(this.f6535e);
            }
        }
        if (this.f6541k != 0) {
            this.f6541k = 0L;
            z5 = true;
        }
        if (this.f6540j != 0) {
            this.f6540j = 0L;
        } else {
            z6 = z5;
        }
        if (z6) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f6538h && super.mutate() == this) {
            d b6 = b();
            b6.r();
            h(b6);
            this.f6538h = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6534d;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f6533c;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i6) {
        return this.f6531a.w(i6, c());
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i6) {
        Drawable drawable = this.f6534d;
        if (drawable != null) {
            return drawable.setLevel(i6);
        }
        Drawable drawable2 = this.f6533c;
        if (drawable2 != null) {
            return drawable2.setLevel(i6);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j6) {
        if (drawable != this.f6533c || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j6);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i6) {
        if (this.f6536f && this.f6535e == i6) {
            return;
        }
        this.f6536f = true;
        this.f6535e = i6;
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            if (this.f6540j == 0) {
                drawable.setAlpha(i6);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z5) {
        d dVar = this.f6531a;
        if (dVar.C != z5) {
            dVar.C = z5;
            Drawable drawable = this.f6533c;
            if (drawable != null) {
                androidx.core.graphics.drawable.a.j(drawable, z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        d dVar = this.f6531a;
        dVar.E = true;
        if (dVar.D != colorFilter) {
            dVar.D = colorFilter;
            Drawable drawable = this.f6533c;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        d dVar = this.f6531a;
        if (dVar.f6568x != z5) {
            dVar.f6568x = z5;
            Drawable drawable = this.f6533c;
            if (drawable != null) {
                drawable.setDither(z5);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f7) {
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, f6, f7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i6, int i7, int i8, int i9) {
        Rect rect = this.f6532b;
        if (rect == null) {
            this.f6532b = new Rect(i6, i7, i8, i9);
        } else {
            rect.set(i6, i7, i8, i9);
        }
        Drawable drawable = this.f6533c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.l(drawable, i6, i7, i8, i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i6) {
        setTintList(ColorStateList.valueOf(i6));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        d dVar = this.f6531a;
        dVar.H = true;
        if (dVar.F != colorStateList) {
            dVar.F = colorStateList;
            androidx.core.graphics.drawable.a.o(this.f6533c, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        d dVar = this.f6531a;
        dVar.I = true;
        if (dVar.G != mode) {
            dVar.G = mode;
            androidx.core.graphics.drawable.a.p(this.f6533c, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        boolean visible = super.setVisible(z5, z6);
        Drawable drawable = this.f6534d;
        if (drawable != null) {
            drawable.setVisible(z5, z6);
        }
        Drawable drawable2 = this.f6533c;
        if (drawable2 != null) {
            drawable2.setVisible(z5, z6);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f6533c || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
