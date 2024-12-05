package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.appcompat.app.f0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import androidx.core.view.q2;
import androidx.core.view.r0;
import androidx.core.view.s0;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.o;
import androidx.recyclerview.widget.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    static final boolean A0;
    private static final boolean B0;
    private static final boolean C0;
    private static final Class[] D0;
    static final Interpolator E0;

    /* renamed from: w0, reason: collision with root package name */
    private static final int[] f3246w0 = {R.attr.nestedScrollingEnabled};

    /* renamed from: x0, reason: collision with root package name */
    static final boolean f3247x0;

    /* renamed from: y0, reason: collision with root package name */
    static final boolean f3248y0;

    /* renamed from: z0, reason: collision with root package name */
    static final boolean f3249z0;
    private final AccessibilityManager A;
    private List B;
    boolean C;
    boolean D;
    private int E;
    private int F;
    private k G;
    private EdgeEffect H;
    private EdgeEffect I;
    private EdgeEffect J;
    private EdgeEffect K;
    l L;
    private int M;
    private int N;
    private VelocityTracker O;
    private int P;
    private int Q;
    private int R;
    private int S;
    private int T;
    private q U;
    private final int V;
    private final int W;

    /* renamed from: a, reason: collision with root package name */
    private final w f3250a;

    /* renamed from: a0, reason: collision with root package name */
    private float f3251a0;

    /* renamed from: b, reason: collision with root package name */
    final u f3252b;

    /* renamed from: b0, reason: collision with root package name */
    private float f3253b0;

    /* renamed from: c, reason: collision with root package name */
    private x f3254c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f3255c0;

    /* renamed from: d, reason: collision with root package name */
    androidx.recyclerview.widget.a f3256d;

    /* renamed from: d0, reason: collision with root package name */
    final b0 f3257d0;

    /* renamed from: e, reason: collision with root package name */
    androidx.recyclerview.widget.b f3258e;

    /* renamed from: e0, reason: collision with root package name */
    androidx.recyclerview.widget.e f3259e0;

    /* renamed from: f, reason: collision with root package name */
    final androidx.recyclerview.widget.p f3260f;

    /* renamed from: f0, reason: collision with root package name */
    e.b f3261f0;

    /* renamed from: g, reason: collision with root package name */
    boolean f3262g;

    /* renamed from: g0, reason: collision with root package name */
    final z f3263g0;

    /* renamed from: h, reason: collision with root package name */
    final Runnable f3264h;

    /* renamed from: h0, reason: collision with root package name */
    private s f3265h0;

    /* renamed from: i, reason: collision with root package name */
    final Rect f3266i;

    /* renamed from: i0, reason: collision with root package name */
    private List f3267i0;

    /* renamed from: j, reason: collision with root package name */
    private final Rect f3268j;

    /* renamed from: j0, reason: collision with root package name */
    boolean f3269j0;

    /* renamed from: k, reason: collision with root package name */
    final RectF f3270k;

    /* renamed from: k0, reason: collision with root package name */
    boolean f3271k0;

    /* renamed from: l, reason: collision with root package name */
    g f3272l;

    /* renamed from: l0, reason: collision with root package name */
    private l.a f3273l0;

    /* renamed from: m, reason: collision with root package name */
    o f3274m;

    /* renamed from: m0, reason: collision with root package name */
    boolean f3275m0;

    /* renamed from: n, reason: collision with root package name */
    final ArrayList f3276n;

    /* renamed from: n0, reason: collision with root package name */
    androidx.recyclerview.widget.k f3277n0;

    /* renamed from: o, reason: collision with root package name */
    private final ArrayList f3278o;

    /* renamed from: o0, reason: collision with root package name */
    private final int[] f3279o0;

    /* renamed from: p, reason: collision with root package name */
    private r f3280p;

    /* renamed from: p0, reason: collision with root package name */
    private s0 f3281p0;

    /* renamed from: q, reason: collision with root package name */
    boolean f3282q;

    /* renamed from: q0, reason: collision with root package name */
    private final int[] f3283q0;

    /* renamed from: r, reason: collision with root package name */
    boolean f3284r;

    /* renamed from: r0, reason: collision with root package name */
    private final int[] f3285r0;

    /* renamed from: s, reason: collision with root package name */
    boolean f3286s;

    /* renamed from: s0, reason: collision with root package name */
    final int[] f3287s0;

    /* renamed from: t, reason: collision with root package name */
    boolean f3288t;

    /* renamed from: t0, reason: collision with root package name */
    final List f3289t0;

    /* renamed from: u, reason: collision with root package name */
    private int f3290u;

    /* renamed from: u0, reason: collision with root package name */
    private Runnable f3291u0;

    /* renamed from: v, reason: collision with root package name */
    boolean f3292v;

    /* renamed from: v0, reason: collision with root package name */
    private final p.b f3293v0;

    /* renamed from: w, reason: collision with root package name */
    boolean f3294w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f3295x;

    /* renamed from: y, reason: collision with root package name */
    private int f3296y;

    /* renamed from: z, reason: collision with root package name */
    boolean f3297z;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f3288t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f3282q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f3294w) {
                recyclerView2.f3292v = true;
            } else {
                recyclerView2.u();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class a0 {
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.L;
            if (lVar != null) {
                lVar.u();
            }
            RecyclerView.this.f3275m0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private int f3300a;

        /* renamed from: b, reason: collision with root package name */
        private int f3301b;

        /* renamed from: c, reason: collision with root package name */
        OverScroller f3302c;

        /* renamed from: d, reason: collision with root package name */
        Interpolator f3303d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3304e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f3305f;

        b0() {
            Interpolator interpolator = RecyclerView.E0;
            this.f3303d = interpolator;
            this.f3304e = false;
            this.f3305f = false;
            this.f3302c = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        private int a(int i6, int i7, int i8, int i9) {
            int i10;
            int abs = Math.abs(i6);
            int abs2 = Math.abs(i7);
            boolean z5 = abs > abs2;
            int sqrt = (int) Math.sqrt((i8 * i8) + (i9 * i9));
            int sqrt2 = (int) Math.sqrt((i6 * i6) + (i7 * i7));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z5 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i11 = width / 2;
            float f6 = width;
            float f7 = i11;
            float b6 = f7 + (b(Math.min(1.0f, (sqrt2 * 1.0f) / f6)) * f7);
            if (sqrt > 0) {
                i10 = Math.round(Math.abs(b6 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z5) {
                    abs = abs2;
                }
                i10 = (int) (((abs / f6) + 1.0f) * 300.0f);
            }
            return Math.min(i10, 2000);
        }

        private float b(float f6) {
            return (float) Math.sin((f6 - 0.5f) * 0.47123894f);
        }

        private void d() {
            RecyclerView.this.removeCallbacks(this);
            b1.i0(RecyclerView.this, this);
        }

        public void c(int i6, int i7) {
            RecyclerView.this.setScrollState(2);
            this.f3301b = 0;
            this.f3300a = 0;
            Interpolator interpolator = this.f3303d;
            Interpolator interpolator2 = RecyclerView.E0;
            if (interpolator != interpolator2) {
                this.f3303d = interpolator2;
                this.f3302c = new OverScroller(RecyclerView.this.getContext(), interpolator2);
            }
            this.f3302c.fling(0, 0, i6, i7, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            e();
        }

        void e() {
            if (this.f3304e) {
                this.f3305f = true;
            } else {
                d();
            }
        }

        public void f(int i6, int i7, int i8, Interpolator interpolator) {
            if (i8 == Integer.MIN_VALUE) {
                i8 = a(i6, i7, 0, 0);
            }
            int i9 = i8;
            if (interpolator == null) {
                interpolator = RecyclerView.E0;
            }
            if (this.f3303d != interpolator) {
                this.f3303d = interpolator;
                this.f3302c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f3301b = 0;
            this.f3300a = 0;
            RecyclerView.this.setScrollState(2);
            this.f3302c.startScroll(0, 0, i6, i7, i9);
            if (Build.VERSION.SDK_INT < 23) {
                this.f3302c.computeScrollOffset();
            }
            e();
        }

        public void g() {
            RecyclerView.this.removeCallbacks(this);
            this.f3302c.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i6;
            int i7;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3274m == null) {
                g();
                return;
            }
            this.f3305f = false;
            this.f3304e = true;
            recyclerView.u();
            OverScroller overScroller = this.f3302c;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i8 = currX - this.f3300a;
                int i9 = currY - this.f3301b;
                this.f3300a = currX;
                this.f3301b = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.f3287s0;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.F(i8, i9, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.f3287s0;
                    i8 -= iArr2[0];
                    i9 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.t(i8, i9);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.f3272l != null) {
                    int[] iArr3 = recyclerView3.f3287s0;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.f1(i8, i9, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.f3287s0;
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                    i8 -= i7;
                    i9 -= i6;
                    y yVar = recyclerView4.f3274m.f3348g;
                    if (yVar != null && !yVar.g() && yVar.h()) {
                        int b6 = RecyclerView.this.f3263g0.b();
                        if (b6 == 0) {
                            yVar.r();
                        } else {
                            if (yVar.f() >= b6) {
                                yVar.p(b6 - 1);
                            }
                            yVar.j(i7, i6);
                        }
                    }
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (!RecyclerView.this.f3276n.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.f3287s0;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.G(i7, i6, i8, i9, null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.f3287s0;
                int i10 = i8 - iArr6[0];
                int i11 = i9 - iArr6[1];
                if (i7 != 0 || i6 != 0) {
                    recyclerView6.I(i7, i6);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z5 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i10 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i11 != 0));
                y yVar2 = RecyclerView.this.f3274m.f3348g;
                if ((yVar2 != null && yVar2.g()) || !z5) {
                    e();
                    RecyclerView recyclerView7 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView7.f3259e0;
                    if (eVar != null) {
                        eVar.f(recyclerView7, i7, i6);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i12 = i10 < 0 ? -currVelocity : i10 > 0 ? currVelocity : 0;
                        if (i11 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i11 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.a(i12, currVelocity);
                    }
                    if (RecyclerView.A0) {
                        RecyclerView.this.f3261f0.b();
                    }
                }
            }
            y yVar3 = RecyclerView.this.f3274m.f3348g;
            if (yVar3 != null && yVar3.g()) {
                yVar3.j(0, 0);
            }
            this.f3304e = false;
            if (this.f3305f) {
                d();
            } else {
                RecyclerView.this.setScrollState(0);
                RecyclerView.this.s1(1);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f6) {
            float f7 = f6 - 1.0f;
            return (f7 * f7 * f7 * f7 * f7) + 1.0f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c0 {

        /* renamed from: s, reason: collision with root package name */
        private static final List f3307s = Collections.emptyList();

        /* renamed from: a, reason: collision with root package name */
        public final View f3308a;

        /* renamed from: b, reason: collision with root package name */
        WeakReference f3309b;

        /* renamed from: j, reason: collision with root package name */
        int f3317j;

        /* renamed from: r, reason: collision with root package name */
        RecyclerView f3325r;

        /* renamed from: c, reason: collision with root package name */
        int f3310c = -1;

        /* renamed from: d, reason: collision with root package name */
        int f3311d = -1;

        /* renamed from: e, reason: collision with root package name */
        long f3312e = -1;

        /* renamed from: f, reason: collision with root package name */
        int f3313f = -1;

        /* renamed from: g, reason: collision with root package name */
        int f3314g = -1;

        /* renamed from: h, reason: collision with root package name */
        c0 f3315h = null;

        /* renamed from: i, reason: collision with root package name */
        c0 f3316i = null;

        /* renamed from: k, reason: collision with root package name */
        List f3318k = null;

        /* renamed from: l, reason: collision with root package name */
        List f3319l = null;

        /* renamed from: m, reason: collision with root package name */
        private int f3320m = 0;

        /* renamed from: n, reason: collision with root package name */
        u f3321n = null;

        /* renamed from: o, reason: collision with root package name */
        boolean f3322o = false;

        /* renamed from: p, reason: collision with root package name */
        private int f3323p = 0;

        /* renamed from: q, reason: collision with root package name */
        int f3324q = -1;

        public c0(View view) {
            if (view == null) {
                throw new IllegalArgumentException("itemView may not be null");
            }
            this.f3308a = view;
        }

        private void g() {
            if (this.f3318k == null) {
                ArrayList arrayList = new ArrayList();
                this.f3318k = arrayList;
                this.f3319l = Collections.unmodifiableList(arrayList);
            }
        }

        void A(int i6, boolean z5) {
            if (this.f3311d == -1) {
                this.f3311d = this.f3310c;
            }
            if (this.f3314g == -1) {
                this.f3314g = this.f3310c;
            }
            if (z5) {
                this.f3314g += i6;
            }
            this.f3310c += i6;
            if (this.f3308a.getLayoutParams() != null) {
                ((p) this.f3308a.getLayoutParams()).f3368c = true;
            }
        }

        void B(RecyclerView recyclerView) {
            int i6 = this.f3324q;
            if (i6 == -1) {
                i6 = b1.C(this.f3308a);
            }
            this.f3323p = i6;
            recyclerView.i1(this, 4);
        }

        void C(RecyclerView recyclerView) {
            recyclerView.i1(this, this.f3323p);
            this.f3323p = 0;
        }

        void D() {
            this.f3317j = 0;
            this.f3310c = -1;
            this.f3311d = -1;
            this.f3312e = -1L;
            this.f3314g = -1;
            this.f3320m = 0;
            this.f3315h = null;
            this.f3316i = null;
            d();
            this.f3323p = 0;
            this.f3324q = -1;
            RecyclerView.r(this);
        }

        void E() {
            if (this.f3311d == -1) {
                this.f3311d = this.f3310c;
            }
        }

        void F(int i6, int i7) {
            this.f3317j = (i6 & i7) | (this.f3317j & (~i7));
        }

        public final void G(boolean z5) {
            int i6;
            int i7 = this.f3320m;
            int i8 = z5 ? i7 - 1 : i7 + 1;
            this.f3320m = i8;
            if (i8 < 0) {
                this.f3320m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z5 && i8 == 1) {
                i6 = this.f3317j | 16;
            } else if (!z5 || i8 != 0) {
                return;
            } else {
                i6 = this.f3317j & (-17);
            }
            this.f3317j = i6;
        }

        void H(u uVar, boolean z5) {
            this.f3321n = uVar;
            this.f3322o = z5;
        }

        boolean I() {
            return (this.f3317j & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean J() {
            return (this.f3317j & 128) != 0;
        }

        void K() {
            this.f3321n.J(this);
        }

        boolean L() {
            return (this.f3317j & 32) != 0;
        }

        void a(Object obj) {
            if (obj == null) {
                b(1024);
            } else if ((1024 & this.f3317j) == 0) {
                g();
                this.f3318k.add(obj);
            }
        }

        void b(int i6) {
            this.f3317j = i6 | this.f3317j;
        }

        void c() {
            this.f3311d = -1;
            this.f3314g = -1;
        }

        void d() {
            List list = this.f3318k;
            if (list != null) {
                list.clear();
            }
            this.f3317j &= -1025;
        }

        void e() {
            this.f3317j &= -33;
        }

        void f() {
            this.f3317j &= -257;
        }

        boolean h() {
            return (this.f3317j & 16) == 0 && b1.R(this.f3308a);
        }

        void i(int i6, int i7, boolean z5) {
            b(8);
            A(i7, z5);
            this.f3310c = i6;
        }

        public final int j() {
            RecyclerView recyclerView = this.f3325r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.b0(this);
        }

        public final long k() {
            return this.f3312e;
        }

        public final int l() {
            return this.f3313f;
        }

        public final int m() {
            int i6 = this.f3314g;
            return i6 == -1 ? this.f3310c : i6;
        }

        public final int n() {
            return this.f3311d;
        }

        List o() {
            if ((this.f3317j & 1024) != 0) {
                return f3307s;
            }
            List list = this.f3318k;
            return (list == null || list.size() == 0) ? f3307s : this.f3319l;
        }

        boolean p(int i6) {
            return (i6 & this.f3317j) != 0;
        }

        boolean q() {
            return (this.f3317j & 512) != 0 || t();
        }

        boolean r() {
            return (this.f3308a.getParent() == null || this.f3308a.getParent() == this.f3325r) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean s() {
            return (this.f3317j & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean t() {
            return (this.f3317j & 4) != 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3310c + " id=" + this.f3312e + ", oldPos=" + this.f3311d + ", pLpos:" + this.f3314g);
            if (w()) {
                sb.append(" scrap ");
                sb.append(this.f3322o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (t()) {
                sb.append(" invalid");
            }
            if (!s()) {
                sb.append(" unbound");
            }
            if (z()) {
                sb.append(" update");
            }
            if (v()) {
                sb.append(" removed");
            }
            if (J()) {
                sb.append(" ignored");
            }
            if (x()) {
                sb.append(" tmpDetached");
            }
            if (!u()) {
                sb.append(" not recyclable(" + this.f3320m + ")");
            }
            if (q()) {
                sb.append(" undefined adapter position");
            }
            if (this.f3308a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public final boolean u() {
            return (this.f3317j & 16) == 0 && !b1.R(this.f3308a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean v() {
            return (this.f3317j & 8) != 0;
        }

        boolean w() {
            return this.f3321n != null;
        }

        boolean x() {
            return (this.f3317j & 256) != 0;
        }

        boolean y() {
            return (this.f3317j & 2) != 0;
        }

        boolean z() {
            return (this.f3317j & 2) != 0;
        }
    }

    /* loaded from: classes.dex */
    class d implements p.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.p.b
        public void a(c0 c0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3274m.m1(c0Var.f3308a, recyclerView.f3252b);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void b(c0 c0Var, l.b bVar, l.b bVar2) {
            RecyclerView.this.l(c0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void c(c0 c0Var, l.b bVar, l.b bVar2) {
            RecyclerView.this.f3252b.J(c0Var);
            RecyclerView.this.n(c0Var, bVar, bVar2);
        }

        @Override // androidx.recyclerview.widget.p.b
        public void d(c0 c0Var, l.b bVar, l.b bVar2) {
            c0Var.G(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z5 = recyclerView.C;
            l lVar = recyclerView.L;
            if (z5) {
                if (!lVar.b(c0Var, c0Var, bVar, bVar2)) {
                    return;
                }
            } else if (!lVar.d(c0Var, bVar, bVar2)) {
                return;
            }
            RecyclerView.this.L0();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0058b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public View a(int i6) {
            return RecyclerView.this.getChildAt(i6);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void b(View view) {
            c0 f02 = RecyclerView.f0(view);
            if (f02 != null) {
                f02.B(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void c(int i6) {
            View childAt = RecyclerView.this.getChildAt(i6);
            if (childAt != null) {
                RecyclerView.this.z(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i6);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void d() {
            int k6 = k();
            for (int i6 = 0; i6 < k6; i6++) {
                View a6 = a(i6);
                RecyclerView.this.z(a6);
                a6.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public c0 e(View view) {
            return RecyclerView.f0(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void f(int i6) {
            c0 f02;
            View a6 = a(i6);
            if (a6 != null && (f02 = RecyclerView.f0(a6)) != null) {
                if (f02.x() && !f02.J()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + f02 + RecyclerView.this.P());
                }
                f02.b(256);
            }
            RecyclerView.this.detachViewFromParent(i6);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void g(View view) {
            c0 f02 = RecyclerView.f0(view);
            if (f02 != null) {
                f02.C(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void h(View view, int i6, ViewGroup.LayoutParams layoutParams) {
            c0 f02 = RecyclerView.f0(view);
            if (f02 != null) {
                if (!f02.x() && !f02.J()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + f02 + RecyclerView.this.P());
                }
                f02.f();
            }
            RecyclerView.this.attachViewToParent(view, i6, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public void i(View view, int i6) {
            RecyclerView.this.addView(view, i6);
            RecyclerView.this.y(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public int j(View view) {
            return RecyclerView.this.indexOfChild(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0058b
        public int k() {
            return RecyclerView.this.getChildCount();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0057a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void a(int i6, int i7) {
            RecyclerView.this.B0(i6, i7);
            RecyclerView.this.f3269j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public c0 c(int i6) {
            c0 Z = RecyclerView.this.Z(i6, true);
            if (Z == null || RecyclerView.this.f3258e.n(Z.f3308a)) {
                return null;
            }
            return Z;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void d(int i6, int i7) {
            RecyclerView.this.C0(i6, i7, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f3269j0 = true;
            recyclerView.f3263g0.f3404d += i7;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void e(int i6, int i7) {
            RecyclerView.this.C0(i6, i7, false);
            RecyclerView.this.f3269j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void f(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void g(int i6, int i7) {
            RecyclerView.this.A0(i6, i7);
            RecyclerView.this.f3269j0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0057a
        public void h(int i6, int i7, Object obj) {
            RecyclerView.this.v1(i6, i7, obj);
            RecyclerView.this.f3271k0 = true;
        }

        void i(a.b bVar) {
            int i6 = bVar.f3466a;
            if (i6 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f3274m.R0(recyclerView, bVar.f3467b, bVar.f3469d);
                return;
            }
            if (i6 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f3274m.U0(recyclerView2, bVar.f3467b, bVar.f3469d);
            } else if (i6 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f3274m.W0(recyclerView3, bVar.f3467b, bVar.f3469d, bVar.f3468c);
            } else {
                if (i6 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f3274m.T0(recyclerView4, bVar.f3467b, bVar.f3469d, 1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g {

        /* renamed from: a, reason: collision with root package name */
        private final h f3329a = new h();

        /* renamed from: b, reason: collision with root package name */
        private boolean f3330b = false;

        public final void a(c0 c0Var, int i6) {
            c0Var.f3310c = i6;
            if (g()) {
                c0Var.f3312e = d(i6);
            }
            c0Var.F(1, 519);
            androidx.core.os.t.a("RV OnBindView");
            j(c0Var, i6, c0Var.o());
            c0Var.d();
            ViewGroup.LayoutParams layoutParams = c0Var.f3308a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f3368c = true;
            }
            androidx.core.os.t.b();
        }

        public final c0 b(ViewGroup viewGroup, int i6) {
            try {
                androidx.core.os.t.a("RV CreateView");
                c0 k6 = k(viewGroup, i6);
                if (k6.f3308a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                k6.f3313f = i6;
                return k6;
            } finally {
                androidx.core.os.t.b();
            }
        }

        public abstract int c();

        public long d(int i6) {
            return -1L;
        }

        public int e(int i6) {
            return 0;
        }

        public final boolean f() {
            return this.f3329a.a();
        }

        public final boolean g() {
            return this.f3330b;
        }

        public void h(RecyclerView recyclerView) {
        }

        public abstract void i(c0 c0Var, int i6);

        public void j(c0 c0Var, int i6, List list) {
            i(c0Var, i6);
        }

        public abstract c0 k(ViewGroup viewGroup, int i6);

        public void l(RecyclerView recyclerView) {
        }

        public boolean m(c0 c0Var) {
            return false;
        }

        public void n(c0 c0Var) {
        }

        public void o(c0 c0Var) {
        }

        public void p(c0 c0Var) {
        }

        public void q(i iVar) {
            this.f3329a.registerObserver(iVar);
        }

        public void r(boolean z5) {
            if (f()) {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            }
            this.f3330b = z5;
        }

        public void s(i iVar) {
            this.f3329a.unregisterObserver(iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends Observable {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
    }

    /* loaded from: classes.dex */
    public interface j {
    }

    /* loaded from: classes.dex */
    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i6) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        private a f3331a = null;

        /* renamed from: b, reason: collision with root package name */
        private ArrayList f3332b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private long f3333c = 120;

        /* renamed from: d, reason: collision with root package name */
        private long f3334d = 120;

        /* renamed from: e, reason: collision with root package name */
        private long f3335e = 250;

        /* renamed from: f, reason: collision with root package name */
        private long f3336f = 250;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface a {
            void a(c0 c0Var);
        }

        /* loaded from: classes.dex */
        public static class b {

            /* renamed from: a, reason: collision with root package name */
            public int f3337a;

            /* renamed from: b, reason: collision with root package name */
            public int f3338b;

            /* renamed from: c, reason: collision with root package name */
            public int f3339c;

            /* renamed from: d, reason: collision with root package name */
            public int f3340d;

            public b a(c0 c0Var) {
                return b(c0Var, 0);
            }

            public b b(c0 c0Var, int i6) {
                View view = c0Var.f3308a;
                this.f3337a = view.getLeft();
                this.f3338b = view.getTop();
                this.f3339c = view.getRight();
                this.f3340d = view.getBottom();
                return this;
            }
        }

        static int e(c0 c0Var) {
            int i6 = c0Var.f3317j & 14;
            if (c0Var.t()) {
                return 4;
            }
            if ((i6 & 4) != 0) {
                return i6;
            }
            int n6 = c0Var.n();
            int j6 = c0Var.j();
            return (n6 == -1 || j6 == -1 || n6 == j6) ? i6 : i6 | 2048;
        }

        public abstract boolean a(c0 c0Var, b bVar, b bVar2);

        public abstract boolean b(c0 c0Var, c0 c0Var2, b bVar, b bVar2);

        public abstract boolean c(c0 c0Var, b bVar, b bVar2);

        public abstract boolean d(c0 c0Var, b bVar, b bVar2);

        public abstract boolean f(c0 c0Var);

        public boolean g(c0 c0Var, List list) {
            return f(c0Var);
        }

        public final void h(c0 c0Var) {
            r(c0Var);
            a aVar = this.f3331a;
            if (aVar != null) {
                aVar.a(c0Var);
            }
        }

        public final void i() {
            if (this.f3332b.size() <= 0) {
                this.f3332b.clear();
            } else {
                f0.a(this.f3332b.get(0));
                throw null;
            }
        }

        public abstract void j(c0 c0Var);

        public abstract void k();

        public long l() {
            return this.f3333c;
        }

        public long m() {
            return this.f3336f;
        }

        public long n() {
            return this.f3335e;
        }

        public long o() {
            return this.f3334d;
        }

        public abstract boolean p();

        public b q() {
            return new b();
        }

        public void r(c0 c0Var) {
        }

        public b s(z zVar, c0 c0Var) {
            return q().a(c0Var);
        }

        public b t(z zVar, c0 c0Var, int i6, List list) {
            return q().a(c0Var);
        }

        public abstract void u();

        void v(a aVar) {
            this.f3331a = aVar;
        }
    }

    /* loaded from: classes.dex */
    private class m implements l.a {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.a
        public void a(c0 c0Var) {
            c0Var.G(true);
            if (c0Var.f3315h != null && c0Var.f3316i == null) {
                c0Var.f3315h = null;
            }
            c0Var.f3316i = null;
            if (c0Var.I() || RecyclerView.this.U0(c0Var.f3308a) || !c0Var.x()) {
                return;
            }
            RecyclerView.this.removeDetachedView(c0Var.f3308a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        public void d(Rect rect, int i6, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void e(Rect rect, View view, RecyclerView recyclerView, z zVar) {
            d(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        public void f(Canvas canvas, RecyclerView recyclerView) {
        }

        public void g(Canvas canvas, RecyclerView recyclerView, z zVar) {
            f(canvas, recyclerView);
        }

        public void h(Canvas canvas, RecyclerView recyclerView) {
        }

        public void i(Canvas canvas, RecyclerView recyclerView, z zVar) {
            h(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {

        /* renamed from: a, reason: collision with root package name */
        androidx.recyclerview.widget.b f3342a;

        /* renamed from: b, reason: collision with root package name */
        RecyclerView f3343b;

        /* renamed from: c, reason: collision with root package name */
        private final o.b f3344c;

        /* renamed from: d, reason: collision with root package name */
        private final o.b f3345d;

        /* renamed from: e, reason: collision with root package name */
        androidx.recyclerview.widget.o f3346e;

        /* renamed from: f, reason: collision with root package name */
        androidx.recyclerview.widget.o f3347f;

        /* renamed from: g, reason: collision with root package name */
        y f3348g;

        /* renamed from: h, reason: collision with root package name */
        boolean f3349h;

        /* renamed from: i, reason: collision with root package name */
        boolean f3350i;

        /* renamed from: j, reason: collision with root package name */
        boolean f3351j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f3352k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f3353l;

        /* renamed from: m, reason: collision with root package name */
        int f3354m;

        /* renamed from: n, reason: collision with root package name */
        boolean f3355n;

        /* renamed from: o, reason: collision with root package name */
        private int f3356o;

        /* renamed from: p, reason: collision with root package name */
        private int f3357p;

        /* renamed from: q, reason: collision with root package name */
        private int f3358q;

        /* renamed from: r, reason: collision with root package name */
        private int f3359r;

        /* loaded from: classes.dex */
        class a implements o.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i6) {
                return o.this.I(i6);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.o0() - o.this.f0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.e0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return o.this.T(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.Q(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }
        }

        /* loaded from: classes.dex */
        class b implements o.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.o.b
            public View a(int i6) {
                return o.this.I(i6);
            }

            @Override // androidx.recyclerview.widget.o.b
            public int b() {
                return o.this.W() - o.this.d0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int c() {
                return o.this.g0();
            }

            @Override // androidx.recyclerview.widget.o.b
            public int d(View view) {
                return o.this.O(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }

            @Override // androidx.recyclerview.widget.o.b
            public int e(View view) {
                return o.this.U(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i6, int i7);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a, reason: collision with root package name */
            public int f3362a;

            /* renamed from: b, reason: collision with root package name */
            public int f3363b;

            /* renamed from: c, reason: collision with root package name */
            public boolean f3364c;

            /* renamed from: d, reason: collision with root package name */
            public boolean f3365d;
        }

        public o() {
            a aVar = new a();
            this.f3344c = aVar;
            b bVar = new b();
            this.f3345d = bVar;
            this.f3346e = new androidx.recyclerview.widget.o(aVar);
            this.f3347f = new androidx.recyclerview.widget.o(bVar);
            this.f3349h = false;
            this.f3350i = false;
            this.f3351j = false;
            this.f3352k = true;
            this.f3353l = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
        
            if (r5 == 1073741824) goto L14;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static int K(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L1a
                if (r7 < 0) goto L11
                goto L1c
            L11:
                if (r7 != r1) goto L2f
                if (r5 == r2) goto L21
                if (r5 == 0) goto L2f
                if (r5 == r3) goto L21
                goto L2f
            L1a:
                if (r7 < 0) goto L1f
            L1c:
                r5 = 1073741824(0x40000000, float:2.0)
                goto L31
            L1f:
                if (r7 != r1) goto L23
            L21:
                r7 = r4
                goto L31
            L23:
                if (r7 != r0) goto L2f
                if (r5 == r2) goto L2c
                if (r5 != r3) goto L2a
                goto L2c
            L2a:
                r5 = 0
                goto L21
            L2c:
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                goto L21
            L2f:
                r5 = 0
                r7 = 0
            L31:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.o.K(int, int, int, int, boolean):int");
        }

        private int[] L(View view, Rect rect) {
            int[] iArr = new int[2];
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W = W() - d0();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i6 = left - e02;
            int min = Math.min(0, i6);
            int i7 = top - g02;
            int min2 = Math.min(0, i7);
            int i8 = width - o02;
            int max = Math.max(0, i8);
            int max2 = Math.max(0, height - W);
            if (Z() != 1) {
                if (min == 0) {
                    min = Math.min(i6, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i8);
            }
            if (min2 == 0) {
                min2 = Math.min(i7, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private void f(View view, int i6, boolean z5) {
            c0 f02 = RecyclerView.f0(view);
            if (z5 || f02.v()) {
                this.f3343b.f3260f.b(f02);
            } else {
                this.f3343b.f3260f.p(f02);
            }
            p pVar = (p) view.getLayoutParams();
            if (f02.L() || f02.w()) {
                if (f02.w()) {
                    f02.K();
                } else {
                    f02.e();
                }
                this.f3342a.c(view, i6, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f3343b) {
                int m6 = this.f3342a.m(view);
                if (i6 == -1) {
                    i6 = this.f3342a.g();
                }
                if (m6 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f3343b.indexOfChild(view) + this.f3343b.P());
                }
                if (m6 != i6) {
                    this.f3343b.f3274m.B0(m6, i6);
                }
            } else {
                this.f3342a.a(view, i6, false);
                pVar.f3368c = true;
                y yVar = this.f3348g;
                if (yVar != null && yVar.h()) {
                    this.f3348g.k(view);
                }
            }
            if (pVar.f3369d) {
                f02.f3308a.invalidate();
                pVar.f3369d = false;
            }
        }

        public static d i0(Context context, AttributeSet attributeSet, int i6, int i7) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f6649f, i6, i7);
            dVar.f3362a = obtainStyledAttributes.getInt(g0.c.f6650g, 1);
            dVar.f3363b = obtainStyledAttributes.getInt(g0.c.f6660q, 1);
            dVar.f3364c = obtainStyledAttributes.getBoolean(g0.c.f6659p, false);
            dVar.f3365d = obtainStyledAttributes.getBoolean(g0.c.f6661r, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        public static int n(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i6);
            int size = View.MeasureSpec.getSize(i6);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i7, i8) : size : Math.min(size, Math.max(i7, i8));
        }

        private boolean t0(RecyclerView recyclerView, int i6, int i7) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int e02 = e0();
            int g02 = g0();
            int o02 = o0() - f0();
            int W = W() - d0();
            Rect rect = this.f3343b.f3266i;
            P(focusedChild, rect);
            return rect.left - i6 < o02 && rect.right - i6 > e02 && rect.top - i7 < W && rect.bottom - i7 > g02;
        }

        private void v1(u uVar, int i6, View view) {
            c0 f02 = RecyclerView.f0(view);
            if (f02.J()) {
                return;
            }
            if (f02.t() && !f02.v() && !this.f3343b.f3272l.g()) {
                q1(i6);
                uVar.C(f02);
            } else {
                x(i6);
                uVar.D(view);
                this.f3343b.f3260f.k(f02);
            }
        }

        private static boolean w0(int i6, int i7, int i8) {
            int mode = View.MeasureSpec.getMode(i7);
            int size = View.MeasureSpec.getSize(i7);
            if (i8 > 0 && i6 != i8) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i6;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i6;
            }
            return true;
        }

        private void y(int i6, View view) {
            this.f3342a.d(i6);
        }

        void A(RecyclerView recyclerView, u uVar) {
            this.f3350i = false;
            I0(recyclerView, uVar);
        }

        public void A0(View view, int i6, int i7) {
            p pVar = (p) view.getLayoutParams();
            Rect j02 = this.f3343b.j0(view);
            int i8 = i6 + j02.left + j02.right;
            int i9 = i7 + j02.top + j02.bottom;
            int K = K(o0(), p0(), e0() + f0() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i8, ((ViewGroup.MarginLayoutParams) pVar).width, k());
            int K2 = K(W(), X(), g0() + d0() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i9, ((ViewGroup.MarginLayoutParams) pVar).height, l());
            if (F1(view, K, K2, pVar)) {
                view.measure(K, K2);
            }
        }

        void A1(int i6, int i7) {
            this.f3358q = View.MeasureSpec.getSize(i6);
            int mode = View.MeasureSpec.getMode(i6);
            this.f3356o = mode;
            if (mode == 0 && !RecyclerView.f3248y0) {
                this.f3358q = 0;
            }
            this.f3359r = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f3357p = mode2;
            if (mode2 != 0 || RecyclerView.f3248y0) {
                return;
            }
            this.f3359r = 0;
        }

        public View B(View view) {
            View R;
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null || (R = recyclerView.R(view)) == null || this.f3342a.n(R)) {
                return null;
            }
            return R;
        }

        public void B0(int i6, int i7) {
            View I = I(i6);
            if (I != null) {
                x(i6);
                h(I, i7);
            } else {
                throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i6 + this.f3343b.toString());
            }
        }

        public void B1(int i6, int i7) {
            this.f3343b.setMeasuredDimension(i6, i7);
        }

        public View C(int i6) {
            int J = J();
            for (int i7 = 0; i7 < J; i7++) {
                View I = I(i7);
                c0 f02 = RecyclerView.f0(I);
                if (f02 != null && f02.m() == i6 && !f02.J() && (this.f3343b.f3263g0.e() || !f02.v())) {
                    return I;
                }
            }
            return null;
        }

        public void C0(int i6) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                recyclerView.y0(i6);
            }
        }

        public void C1(Rect rect, int i6, int i7) {
            B1(n(i6, rect.width() + e0() + f0(), c0()), n(i7, rect.height() + g0() + d0(), b0()));
        }

        public abstract p D();

        public void D0(int i6) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                recyclerView.z0(i6);
            }
        }

        void D1(int i6, int i7) {
            int J = J();
            if (J == 0) {
                this.f3343b.w(i6, i7);
                return;
            }
            int i8 = Integer.MIN_VALUE;
            int i9 = Integer.MIN_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < J; i12++) {
                View I = I(i12);
                Rect rect = this.f3343b.f3266i;
                P(I, rect);
                int i13 = rect.left;
                if (i13 < i10) {
                    i10 = i13;
                }
                int i14 = rect.right;
                if (i14 > i8) {
                    i8 = i14;
                }
                int i15 = rect.top;
                if (i15 < i11) {
                    i11 = i15;
                }
                int i16 = rect.bottom;
                if (i16 > i9) {
                    i9 = i16;
                }
            }
            this.f3343b.f3266i.set(i10, i11, i8, i9);
            C1(this.f3343b.f3266i, i6, i7);
        }

        public p E(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public void E0(g gVar, g gVar2) {
        }

        void E1(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f3343b = null;
                this.f3342a = null;
                height = 0;
                this.f3358q = 0;
            } else {
                this.f3343b = recyclerView;
                this.f3342a = recyclerView.f3258e;
                this.f3358q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.f3359r = height;
            this.f3356o = 1073741824;
            this.f3357p = 1073741824;
        }

        public p F(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public boolean F0(RecyclerView recyclerView, ArrayList arrayList, int i6, int i7) {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean F1(View view, int i6, int i7, p pVar) {
            return (!view.isLayoutRequested() && this.f3352k && w0(view.getWidth(), i6, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getHeight(), i7, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public int G() {
            return -1;
        }

        public void G0(RecyclerView recyclerView) {
        }

        boolean G1() {
            return false;
        }

        public int H(View view) {
            return ((p) view.getLayoutParams()).f3367b.bottom;
        }

        public void H0(RecyclerView recyclerView) {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean H1(View view, int i6, int i7, p pVar) {
            return (this.f3352k && w0(view.getMeasuredWidth(), i6, ((ViewGroup.MarginLayoutParams) pVar).width) && w0(view.getMeasuredHeight(), i7, ((ViewGroup.MarginLayoutParams) pVar).height)) ? false : true;
        }

        public View I(int i6) {
            androidx.recyclerview.widget.b bVar = this.f3342a;
            if (bVar != null) {
                return bVar.f(i6);
            }
            return null;
        }

        public void I0(RecyclerView recyclerView, u uVar) {
            H0(recyclerView);
        }

        public abstract void I1(RecyclerView recyclerView, z zVar, int i6);

        public int J() {
            androidx.recyclerview.widget.b bVar = this.f3342a;
            if (bVar != null) {
                return bVar.g();
            }
            return 0;
        }

        public abstract View J0(View view, int i6, u uVar, z zVar);

        public void J1(y yVar) {
            y yVar2 = this.f3348g;
            if (yVar2 != null && yVar != yVar2 && yVar2.h()) {
                this.f3348g.r();
            }
            this.f3348g = yVar;
            yVar.q(this.f3343b, this);
        }

        public void K0(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3343b;
            L0(recyclerView.f3252b, recyclerView.f3263g0, accessibilityEvent);
        }

        void K1() {
            y yVar = this.f3348g;
            if (yVar != null) {
                yVar.r();
            }
        }

        public void L0(u uVar, z zVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z5 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f3343b.canScrollVertically(-1) && !this.f3343b.canScrollHorizontally(-1) && !this.f3343b.canScrollHorizontally(1)) {
                z5 = false;
            }
            accessibilityEvent.setScrollable(z5);
            g gVar = this.f3343b.f3272l;
            if (gVar != null) {
                accessibilityEvent.setItemCount(gVar.c());
            }
        }

        public abstract boolean L1();

        public boolean M() {
            RecyclerView recyclerView = this.f3343b;
            return recyclerView != null && recyclerView.f3262g;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void M0(g0 g0Var) {
            RecyclerView recyclerView = this.f3343b;
            N0(recyclerView.f3252b, recyclerView.f3263g0, g0Var);
        }

        public int N(u uVar, z zVar) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null || recyclerView.f3272l == null || !k()) {
                return 1;
            }
            return this.f3343b.f3272l.c();
        }

        public void N0(u uVar, z zVar, g0 g0Var) {
            if (this.f3343b.canScrollVertically(-1) || this.f3343b.canScrollHorizontally(-1)) {
                g0Var.a(8192);
                g0Var.q0(true);
            }
            if (this.f3343b.canScrollVertically(1) || this.f3343b.canScrollHorizontally(1)) {
                g0Var.a(4096);
                g0Var.q0(true);
            }
            g0Var.Z(g0.c.a(k0(uVar, zVar), N(uVar, zVar), v0(uVar, zVar), l0(uVar, zVar)));
        }

        public int O(View view) {
            return view.getBottom() + H(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void O0(View view, g0 g0Var) {
            c0 f02 = RecyclerView.f0(view);
            if (f02 == null || f02.v() || this.f3342a.n(f02.f3308a)) {
                return;
            }
            RecyclerView recyclerView = this.f3343b;
            P0(recyclerView.f3252b, recyclerView.f3263g0, view, g0Var);
        }

        public void P(View view, Rect rect) {
            RecyclerView.g0(view, rect);
        }

        public void P0(u uVar, z zVar, View view, g0 g0Var) {
            g0Var.a0(g0.d.a(l() ? h0(view) : 0, 1, k() ? h0(view) : 0, 1, false, false));
        }

        public int Q(View view) {
            return view.getLeft() - a0(view);
        }

        public View Q0(View view, int i6) {
            return null;
        }

        public int R(View view) {
            Rect rect = ((p) view.getLayoutParams()).f3367b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public void R0(RecyclerView recyclerView, int i6, int i7) {
        }

        public int S(View view) {
            Rect rect = ((p) view.getLayoutParams()).f3367b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void S0(RecyclerView recyclerView) {
        }

        public int T(View view) {
            return view.getRight() + j0(view);
        }

        public void T0(RecyclerView recyclerView, int i6, int i7, int i8) {
        }

        public int U(View view) {
            return view.getTop() - m0(view);
        }

        public void U0(RecyclerView recyclerView, int i6, int i7) {
        }

        public View V() {
            View focusedChild;
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f3342a.n(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void V0(RecyclerView recyclerView, int i6, int i7) {
        }

        public int W() {
            return this.f3359r;
        }

        public void W0(RecyclerView recyclerView, int i6, int i7, Object obj) {
            V0(recyclerView, i6, i7);
        }

        public int X() {
            return this.f3357p;
        }

        public abstract void X0(u uVar, z zVar);

        public int Y() {
            RecyclerView recyclerView = this.f3343b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.c();
            }
            return 0;
        }

        public void Y0(z zVar) {
        }

        public int Z() {
            return b1.E(this.f3343b);
        }

        public void Z0(u uVar, z zVar, int i6, int i7) {
            this.f3343b.w(i6, i7);
        }

        public int a0(View view) {
            return ((p) view.getLayoutParams()).f3367b.left;
        }

        public boolean a1(RecyclerView recyclerView, View view, View view2) {
            return x0() || recyclerView.t0();
        }

        public void b(View view) {
            c(view, -1);
        }

        public int b0() {
            return b1.F(this.f3343b);
        }

        public boolean b1(RecyclerView recyclerView, z zVar, View view, View view2) {
            return a1(recyclerView, view, view2);
        }

        public void c(View view, int i6) {
            f(view, i6, true);
        }

        public int c0() {
            return b1.G(this.f3343b);
        }

        public abstract void c1(Parcelable parcelable);

        public void d(View view) {
            e(view, -1);
        }

        public int d0() {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract Parcelable d1();

        public void e(View view, int i6) {
            f(view, i6, false);
        }

        public int e0() {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e1(int i6) {
        }

        public int f0() {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        void f1(y yVar) {
            if (this.f3348g == yVar) {
                this.f3348g = null;
            }
        }

        public void g(String str) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                recyclerView.o(str);
            }
        }

        public int g0() {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean g1(int i6, Bundle bundle) {
            RecyclerView recyclerView = this.f3343b;
            return h1(recyclerView.f3252b, recyclerView.f3263g0, i6, bundle);
        }

        public void h(View view, int i6) {
            i(view, i6, (p) view.getLayoutParams());
        }

        public int h0(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public boolean h1(u uVar, z zVar, int i6, Bundle bundle) {
            int W;
            int o02;
            int i7;
            int i8;
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null) {
                return false;
            }
            if (i6 == 4096) {
                W = recyclerView.canScrollVertically(1) ? (W() - g0()) - d0() : 0;
                if (this.f3343b.canScrollHorizontally(1)) {
                    o02 = (o0() - e0()) - f0();
                    i7 = W;
                    i8 = o02;
                }
                i7 = W;
                i8 = 0;
            } else if (i6 != 8192) {
                i8 = 0;
                i7 = 0;
            } else {
                W = recyclerView.canScrollVertically(-1) ? -((W() - g0()) - d0()) : 0;
                if (this.f3343b.canScrollHorizontally(-1)) {
                    o02 = -((o0() - e0()) - f0());
                    i7 = W;
                    i8 = o02;
                }
                i7 = W;
                i8 = 0;
            }
            if (i7 == 0 && i8 == 0) {
                return false;
            }
            this.f3343b.n1(i8, i7, null, Integer.MIN_VALUE, true);
            return true;
        }

        public void i(View view, int i6, p pVar) {
            c0 f02 = RecyclerView.f0(view);
            if (f02.v()) {
                this.f3343b.f3260f.b(f02);
            } else {
                this.f3343b.f3260f.p(f02);
            }
            this.f3342a.c(view, i6, pVar, f02.v());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean i1(View view, int i6, Bundle bundle) {
            RecyclerView recyclerView = this.f3343b;
            return j1(recyclerView.f3252b, recyclerView.f3263g0, view, i6, bundle);
        }

        public void j(View view, Rect rect) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j0(view));
            }
        }

        public int j0(View view) {
            return ((p) view.getLayoutParams()).f3367b.right;
        }

        public boolean j1(u uVar, z zVar, View view, int i6, Bundle bundle) {
            return false;
        }

        public abstract boolean k();

        public int k0(u uVar, z zVar) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView == null || recyclerView.f3272l == null || !l()) {
                return 1;
            }
            return this.f3343b.f3272l.c();
        }

        public void k1(u uVar) {
            for (int J = J() - 1; J >= 0; J--) {
                if (!RecyclerView.f0(I(J)).J()) {
                    n1(J, uVar);
                }
            }
        }

        public abstract boolean l();

        public int l0(u uVar, z zVar) {
            return 0;
        }

        void l1(u uVar) {
            int j6 = uVar.j();
            for (int i6 = j6 - 1; i6 >= 0; i6--) {
                View n6 = uVar.n(i6);
                c0 f02 = RecyclerView.f0(n6);
                if (!f02.J()) {
                    f02.G(false);
                    if (f02.x()) {
                        this.f3343b.removeDetachedView(n6, false);
                    }
                    l lVar = this.f3343b.L;
                    if (lVar != null) {
                        lVar.j(f02);
                    }
                    f02.G(true);
                    uVar.y(n6);
                }
            }
            uVar.e();
            if (j6 > 0) {
                this.f3343b.invalidate();
            }
        }

        public boolean m(p pVar) {
            return pVar != null;
        }

        public int m0(View view) {
            return ((p) view.getLayoutParams()).f3367b.top;
        }

        public void m1(View view, u uVar) {
            p1(view);
            uVar.B(view);
        }

        public void n0(View view, boolean z5, Rect rect) {
            Matrix matrix;
            if (z5) {
                Rect rect2 = ((p) view.getLayoutParams()).f3367b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f3343b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f3343b.f3270k;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void n1(int i6, u uVar) {
            View I = I(i6);
            q1(i6);
            uVar.B(I);
        }

        public abstract void o(int i6, int i7, z zVar, c cVar);

        public int o0() {
            return this.f3358q;
        }

        public boolean o1(Runnable runnable) {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void p(int i6, c cVar) {
        }

        public int p0() {
            return this.f3356o;
        }

        public void p1(View view) {
            this.f3342a.p(view);
        }

        public abstract int q(z zVar);

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean q0() {
            int J = J();
            for (int i6 = 0; i6 < J; i6++) {
                ViewGroup.LayoutParams layoutParams = I(i6).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public void q1(int i6) {
            if (I(i6) != null) {
                this.f3342a.q(i6);
            }
        }

        public abstract int r(z zVar);

        public boolean r0() {
            return this.f3350i;
        }

        public boolean r1(RecyclerView recyclerView, View view, Rect rect, boolean z5) {
            return s1(recyclerView, view, rect, z5, false);
        }

        public abstract int s(z zVar);

        public abstract boolean s0();

        public boolean s1(RecyclerView recyclerView, View view, Rect rect, boolean z5, boolean z6) {
            int[] L = L(view, rect);
            int i6 = L[0];
            int i7 = L[1];
            if ((z6 && !t0(recyclerView, i6, i7)) || (i6 == 0 && i7 == 0)) {
                return false;
            }
            if (z5) {
                recyclerView.scrollBy(i6, i7);
            } else {
                recyclerView.k1(i6, i7);
            }
            return true;
        }

        public abstract int t(z zVar);

        public void t1() {
            RecyclerView recyclerView = this.f3343b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public abstract int u(z zVar);

        public final boolean u0() {
            return this.f3353l;
        }

        public void u1() {
            this.f3349h = true;
        }

        public abstract int v(z zVar);

        public boolean v0(u uVar, z zVar) {
            return false;
        }

        public void w(u uVar) {
            for (int J = J() - 1; J >= 0; J--) {
                v1(uVar, J, I(J));
            }
        }

        public abstract int w1(int i6, u uVar, z zVar);

        public void x(int i6) {
            y(i6, I(i6));
        }

        public boolean x0() {
            y yVar = this.f3348g;
            return yVar != null && yVar.h();
        }

        public abstract void x1(int i6);

        public boolean y0(View view, boolean z5, boolean z6) {
            boolean z7 = this.f3346e.b(view, 24579) && this.f3347f.b(view, 24579);
            return z5 ? z7 : !z7;
        }

        public abstract int y1(int i6, u uVar, z zVar);

        void z(RecyclerView recyclerView) {
            this.f3350i = true;
            G0(recyclerView);
        }

        public void z0(View view, int i6, int i7, int i8, int i9) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f3367b;
            view.layout(i6 + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i7 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i8 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i9 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        void z1(RecyclerView recyclerView) {
            A1(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        c0 f3366a;

        /* renamed from: b, reason: collision with root package name */
        final Rect f3367b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3368c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3369d;

        public p(int i6, int i7) {
            super(i6, i7);
            this.f3367b = new Rect();
            this.f3368c = true;
            this.f3369d = false;
        }

        public int a() {
            return this.f3366a.m();
        }

        public boolean b() {
            return this.f3366a.y();
        }

        public boolean c() {
            return this.f3366a.v();
        }

        public boolean d() {
            return this.f3366a.t();
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3367b = new Rect();
            this.f3368c = true;
            this.f3369d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3367b = new Rect();
            this.f3368c = true;
            this.f3369d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3367b = new Rect();
            this.f3368c = true;
            this.f3369d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f3367b = new Rect();
            this.f3368c = true;
            this.f3369d = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class q {
        public abstract boolean a(int i6, int i7);
    }

    /* loaded from: classes.dex */
    public interface r {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z5);
    }

    /* loaded from: classes.dex */
    public static abstract class s {
        public void a(RecyclerView recyclerView, int i6) {
        }

        public abstract void b(RecyclerView recyclerView, int i6, int i7);
    }

    /* loaded from: classes.dex */
    public static class t {

        /* renamed from: a, reason: collision with root package name */
        SparseArray f3370a = new SparseArray();

        /* renamed from: b, reason: collision with root package name */
        private int f3371b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            final ArrayList f3372a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            int f3373b = 5;

            /* renamed from: c, reason: collision with root package name */
            long f3374c = 0;

            /* renamed from: d, reason: collision with root package name */
            long f3375d = 0;

            a() {
            }
        }

        private a g(int i6) {
            a aVar = (a) this.f3370a.get(i6);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.f3370a.put(i6, aVar2);
            return aVar2;
        }

        void a() {
            this.f3371b++;
        }

        public void b() {
            for (int i6 = 0; i6 < this.f3370a.size(); i6++) {
                ((a) this.f3370a.valueAt(i6)).f3372a.clear();
            }
        }

        void c() {
            this.f3371b--;
        }

        void d(int i6, long j6) {
            a g6 = g(i6);
            g6.f3375d = j(g6.f3375d, j6);
        }

        void e(int i6, long j6) {
            a g6 = g(i6);
            g6.f3374c = j(g6.f3374c, j6);
        }

        public c0 f(int i6) {
            a aVar = (a) this.f3370a.get(i6);
            if (aVar == null || aVar.f3372a.isEmpty()) {
                return null;
            }
            ArrayList arrayList = aVar.f3372a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!((c0) arrayList.get(size)).r()) {
                    return (c0) arrayList.remove(size);
                }
            }
            return null;
        }

        void h(g gVar, g gVar2, boolean z5) {
            if (gVar != null) {
                c();
            }
            if (!z5 && this.f3371b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        public void i(c0 c0Var) {
            int l6 = c0Var.l();
            ArrayList arrayList = g(l6).f3372a;
            if (((a) this.f3370a.get(l6)).f3373b <= arrayList.size()) {
                return;
            }
            c0Var.D();
            arrayList.add(c0Var);
        }

        long j(long j6, long j7) {
            return j6 == 0 ? j7 : ((j6 / 4) * 3) + (j7 / 4);
        }

        boolean k(int i6, long j6, long j7) {
            long j8 = g(i6).f3375d;
            return j8 == 0 || j6 + j8 < j7;
        }

        boolean l(int i6, long j6, long j7) {
            long j8 = g(i6).f3374c;
            return j8 == 0 || j6 + j8 < j7;
        }
    }

    /* loaded from: classes.dex */
    public final class u {

        /* renamed from: a, reason: collision with root package name */
        final ArrayList f3376a;

        /* renamed from: b, reason: collision with root package name */
        ArrayList f3377b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f3378c;

        /* renamed from: d, reason: collision with root package name */
        private final List f3379d;

        /* renamed from: e, reason: collision with root package name */
        private int f3380e;

        /* renamed from: f, reason: collision with root package name */
        int f3381f;

        /* renamed from: g, reason: collision with root package name */
        t f3382g;

        public u() {
            ArrayList arrayList = new ArrayList();
            this.f3376a = arrayList;
            this.f3377b = null;
            this.f3378c = new ArrayList();
            this.f3379d = Collections.unmodifiableList(arrayList);
            this.f3380e = 2;
            this.f3381f = 2;
        }

        private boolean H(c0 c0Var, int i6, int i7, long j6) {
            c0Var.f3325r = RecyclerView.this;
            int l6 = c0Var.l();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j6 != Long.MAX_VALUE && !this.f3382g.k(l6, nanoTime, j6)) {
                return false;
            }
            RecyclerView.this.f3272l.a(c0Var, i6);
            this.f3382g.d(c0Var.l(), RecyclerView.this.getNanoTime() - nanoTime);
            b(c0Var);
            if (!RecyclerView.this.f3263g0.e()) {
                return true;
            }
            c0Var.f3314g = i7;
            return true;
        }

        private void b(c0 c0Var) {
            if (RecyclerView.this.s0()) {
                View view = c0Var.f3308a;
                if (b1.C(view) == 0) {
                    b1.A0(view, 1);
                }
                androidx.recyclerview.widget.k kVar = RecyclerView.this.f3277n0;
                if (kVar == null) {
                    return;
                }
                androidx.core.view.a n6 = kVar.n();
                if (n6 instanceof k.a) {
                    ((k.a) n6).o(view);
                }
                b1.q0(view, n6);
            }
        }

        private void q(ViewGroup viewGroup, boolean z5) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    q((ViewGroup) childAt, true);
                }
            }
            if (z5) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        private void r(c0 c0Var) {
            View view = c0Var.f3308a;
            if (view instanceof ViewGroup) {
                q((ViewGroup) view, false);
            }
        }

        void A(int i6) {
            a((c0) this.f3378c.get(i6), true);
            this.f3378c.remove(i6);
        }

        public void B(View view) {
            c0 f02 = RecyclerView.f0(view);
            if (f02.x()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (f02.w()) {
                f02.K();
            } else if (f02.L()) {
                f02.e();
            }
            C(f02);
            if (RecyclerView.this.L == null || f02.u()) {
                return;
            }
            RecyclerView.this.L.j(f02);
        }

        void C(c0 c0Var) {
            boolean z5;
            boolean z6 = true;
            if (c0Var.w() || c0Var.f3308a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(c0Var.w());
                sb.append(" isAttached:");
                sb.append(c0Var.f3308a.getParent() != null);
                sb.append(RecyclerView.this.P());
                throw new IllegalArgumentException(sb.toString());
            }
            if (c0Var.x()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + c0Var + RecyclerView.this.P());
            }
            if (c0Var.J()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.P());
            }
            boolean h6 = c0Var.h();
            g gVar = RecyclerView.this.f3272l;
            if ((gVar != null && h6 && gVar.m(c0Var)) || c0Var.u()) {
                if (this.f3381f <= 0 || c0Var.p(526)) {
                    z5 = false;
                } else {
                    int size = this.f3378c.size();
                    if (size >= this.f3381f && size > 0) {
                        A(0);
                        size--;
                    }
                    if (RecyclerView.A0 && size > 0 && !RecyclerView.this.f3261f0.d(c0Var.f3310c)) {
                        int i6 = size - 1;
                        while (i6 >= 0) {
                            if (!RecyclerView.this.f3261f0.d(((c0) this.f3378c.get(i6)).f3310c)) {
                                break;
                            } else {
                                i6--;
                            }
                        }
                        size = i6 + 1;
                    }
                    this.f3378c.add(size, c0Var);
                    z5 = true;
                }
                if (!z5) {
                    a(c0Var, true);
                    r1 = z5;
                    RecyclerView.this.f3260f.q(c0Var);
                    if (r1 && !z6 && h6) {
                        c0Var.f3325r = null;
                        return;
                    }
                    return;
                }
                r1 = z5;
            }
            z6 = false;
            RecyclerView.this.f3260f.q(c0Var);
            if (r1) {
            }
        }

        void D(View view) {
            ArrayList arrayList;
            c0 f02 = RecyclerView.f0(view);
            if (!f02.p(12) && f02.y() && !RecyclerView.this.p(f02)) {
                if (this.f3377b == null) {
                    this.f3377b = new ArrayList();
                }
                f02.H(this, true);
                arrayList = this.f3377b;
            } else {
                if (f02.t() && !f02.v() && !RecyclerView.this.f3272l.g()) {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.P());
                }
                f02.H(this, false);
                arrayList = this.f3376a;
            }
            arrayList.add(f02);
        }

        void E(t tVar) {
            t tVar2 = this.f3382g;
            if (tVar2 != null) {
                tVar2.c();
            }
            this.f3382g = tVar;
            if (tVar == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f3382g.a();
        }

        void F(a0 a0Var) {
        }

        public void G(int i6) {
            this.f3380e = i6;
            K();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x0130  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0170  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01cc A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.c0 I(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 523
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.I(int, boolean, long):androidx.recyclerview.widget.RecyclerView$c0");
        }

        void J(c0 c0Var) {
            (c0Var.f3322o ? this.f3377b : this.f3376a).remove(c0Var);
            c0Var.f3321n = null;
            c0Var.f3322o = false;
            c0Var.e();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void K() {
            o oVar = RecyclerView.this.f3274m;
            this.f3381f = this.f3380e + (oVar != null ? oVar.f3354m : 0);
            for (int size = this.f3378c.size() - 1; size >= 0 && this.f3378c.size() > this.f3381f; size--) {
                A(size);
            }
        }

        boolean L(c0 c0Var) {
            if (c0Var.v()) {
                return RecyclerView.this.f3263g0.e();
            }
            int i6 = c0Var.f3310c;
            if (i6 >= 0 && i6 < RecyclerView.this.f3272l.c()) {
                if (RecyclerView.this.f3263g0.e() || RecyclerView.this.f3272l.e(c0Var.f3310c) == c0Var.l()) {
                    return !RecyclerView.this.f3272l.g() || c0Var.k() == RecyclerView.this.f3272l.d(c0Var.f3310c);
                }
                return false;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + c0Var + RecyclerView.this.P());
        }

        void M(int i6, int i7) {
            int i8;
            int i9 = i7 + i6;
            for (int size = this.f3378c.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.f3378c.get(size);
                if (c0Var != null && (i8 = c0Var.f3310c) >= i6 && i8 < i9) {
                    c0Var.b(2);
                    A(size);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(c0 c0Var, boolean z5) {
            RecyclerView.r(c0Var);
            View view = c0Var.f3308a;
            androidx.recyclerview.widget.k kVar = RecyclerView.this.f3277n0;
            if (kVar != null) {
                androidx.core.view.a n6 = kVar.n();
                b1.q0(view, n6 instanceof k.a ? ((k.a) n6).n(view) : null);
            }
            if (z5) {
                g(c0Var);
            }
            c0Var.f3325r = null;
            i().i(c0Var);
        }

        public void c() {
            this.f3376a.clear();
            z();
        }

        void d() {
            int size = this.f3378c.size();
            for (int i6 = 0; i6 < size; i6++) {
                ((c0) this.f3378c.get(i6)).c();
            }
            int size2 = this.f3376a.size();
            for (int i7 = 0; i7 < size2; i7++) {
                ((c0) this.f3376a.get(i7)).c();
            }
            ArrayList arrayList = this.f3377b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i8 = 0; i8 < size3; i8++) {
                    ((c0) this.f3377b.get(i8)).c();
                }
            }
        }

        void e() {
            this.f3376a.clear();
            ArrayList arrayList = this.f3377b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int f(int i6) {
            if (i6 >= 0 && i6 < RecyclerView.this.f3263g0.b()) {
                return !RecyclerView.this.f3263g0.e() ? i6 : RecyclerView.this.f3256d.m(i6);
            }
            throw new IndexOutOfBoundsException("invalid position " + i6 + ". State item count is " + RecyclerView.this.f3263g0.b() + RecyclerView.this.P());
        }

        void g(c0 c0Var) {
            RecyclerView.this.getClass();
            g gVar = RecyclerView.this.f3272l;
            if (gVar != null) {
                gVar.p(c0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.f3263g0 != null) {
                recyclerView.f3260f.q(c0Var);
            }
        }

        c0 h(int i6) {
            int size;
            int m6;
            ArrayList arrayList = this.f3377b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i7 = 0; i7 < size; i7++) {
                    c0 c0Var = (c0) this.f3377b.get(i7);
                    if (!c0Var.L() && c0Var.m() == i6) {
                        c0Var.b(32);
                        return c0Var;
                    }
                }
                if (RecyclerView.this.f3272l.g() && (m6 = RecyclerView.this.f3256d.m(i6)) > 0 && m6 < RecyclerView.this.f3272l.c()) {
                    long d6 = RecyclerView.this.f3272l.d(m6);
                    for (int i8 = 0; i8 < size; i8++) {
                        c0 c0Var2 = (c0) this.f3377b.get(i8);
                        if (!c0Var2.L() && c0Var2.k() == d6) {
                            c0Var2.b(32);
                            return c0Var2;
                        }
                    }
                }
            }
            return null;
        }

        t i() {
            if (this.f3382g == null) {
                this.f3382g = new t();
            }
            return this.f3382g;
        }

        int j() {
            return this.f3376a.size();
        }

        public List k() {
            return this.f3379d;
        }

        c0 l(long j6, int i6, boolean z5) {
            for (int size = this.f3376a.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.f3376a.get(size);
                if (c0Var.k() == j6 && !c0Var.L()) {
                    if (i6 == c0Var.l()) {
                        c0Var.b(32);
                        if (c0Var.v() && !RecyclerView.this.f3263g0.e()) {
                            c0Var.F(2, 14);
                        }
                        return c0Var;
                    }
                    if (!z5) {
                        this.f3376a.remove(size);
                        RecyclerView.this.removeDetachedView(c0Var.f3308a, false);
                        y(c0Var.f3308a);
                    }
                }
            }
            int size2 = this.f3378c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                c0 c0Var2 = (c0) this.f3378c.get(size2);
                if (c0Var2.k() == j6 && !c0Var2.r()) {
                    if (i6 == c0Var2.l()) {
                        if (!z5) {
                            this.f3378c.remove(size2);
                        }
                        return c0Var2;
                    }
                    if (!z5) {
                        A(size2);
                        return null;
                    }
                }
            }
        }

        c0 m(int i6, boolean z5) {
            View e6;
            int size = this.f3376a.size();
            for (int i7 = 0; i7 < size; i7++) {
                c0 c0Var = (c0) this.f3376a.get(i7);
                if (!c0Var.L() && c0Var.m() == i6 && !c0Var.t() && (RecyclerView.this.f3263g0.f3408h || !c0Var.v())) {
                    c0Var.b(32);
                    return c0Var;
                }
            }
            if (z5 || (e6 = RecyclerView.this.f3258e.e(i6)) == null) {
                int size2 = this.f3378c.size();
                for (int i8 = 0; i8 < size2; i8++) {
                    c0 c0Var2 = (c0) this.f3378c.get(i8);
                    if (!c0Var2.t() && c0Var2.m() == i6 && !c0Var2.r()) {
                        if (!z5) {
                            this.f3378c.remove(i8);
                        }
                        return c0Var2;
                    }
                }
                return null;
            }
            c0 f02 = RecyclerView.f0(e6);
            RecyclerView.this.f3258e.s(e6);
            int m6 = RecyclerView.this.f3258e.m(e6);
            if (m6 != -1) {
                RecyclerView.this.f3258e.d(m6);
                D(e6);
                f02.b(8224);
                return f02;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + f02 + RecyclerView.this.P());
        }

        View n(int i6) {
            return ((c0) this.f3376a.get(i6)).f3308a;
        }

        public View o(int i6) {
            return p(i6, false);
        }

        View p(int i6, boolean z5) {
            return I(i6, z5, Long.MAX_VALUE).f3308a;
        }

        void s() {
            int size = this.f3378c.size();
            for (int i6 = 0; i6 < size; i6++) {
                p pVar = (p) ((c0) this.f3378c.get(i6)).f3308a.getLayoutParams();
                if (pVar != null) {
                    pVar.f3368c = true;
                }
            }
        }

        void t() {
            int size = this.f3378c.size();
            for (int i6 = 0; i6 < size; i6++) {
                c0 c0Var = (c0) this.f3378c.get(i6);
                if (c0Var != null) {
                    c0Var.b(6);
                    c0Var.a(null);
                }
            }
            g gVar = RecyclerView.this.f3272l;
            if (gVar == null || !gVar.g()) {
                z();
            }
        }

        void u(int i6, int i7) {
            int size = this.f3378c.size();
            for (int i8 = 0; i8 < size; i8++) {
                c0 c0Var = (c0) this.f3378c.get(i8);
                if (c0Var != null && c0Var.f3310c >= i6) {
                    c0Var.A(i7, true);
                }
            }
        }

        void v(int i6, int i7) {
            int i8;
            int i9;
            int i10;
            int i11;
            if (i6 < i7) {
                i8 = -1;
                i10 = i6;
                i9 = i7;
            } else {
                i8 = 1;
                i9 = i6;
                i10 = i7;
            }
            int size = this.f3378c.size();
            for (int i12 = 0; i12 < size; i12++) {
                c0 c0Var = (c0) this.f3378c.get(i12);
                if (c0Var != null && (i11 = c0Var.f3310c) >= i10 && i11 <= i9) {
                    if (i11 == i6) {
                        c0Var.A(i7 - i6, false);
                    } else {
                        c0Var.A(i8, false);
                    }
                }
            }
        }

        void w(int i6, int i7, boolean z5) {
            int i8 = i6 + i7;
            for (int size = this.f3378c.size() - 1; size >= 0; size--) {
                c0 c0Var = (c0) this.f3378c.get(size);
                if (c0Var != null) {
                    int i9 = c0Var.f3310c;
                    if (i9 >= i8) {
                        c0Var.A(-i7, z5);
                    } else if (i9 >= i6) {
                        c0Var.b(8);
                        A(size);
                    }
                }
            }
        }

        void x(g gVar, g gVar2, boolean z5) {
            c();
            i().h(gVar, gVar2, z5);
        }

        void y(View view) {
            c0 f02 = RecyclerView.f0(view);
            f02.f3321n = null;
            f02.f3322o = false;
            f02.e();
            C(f02);
        }

        void z() {
            for (int size = this.f3378c.size() - 1; size >= 0; size--) {
                A(size);
            }
            this.f3378c.clear();
            if (RecyclerView.A0) {
                RecyclerView.this.f3261f0.b();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface v {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class w extends i {
        w() {
        }
    }

    /* loaded from: classes.dex */
    public static class x extends x.a {
        public static final Parcelable.Creator<x> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        Parcelable f3385c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel) {
                return new x(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public x createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new x(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public x[] newArray(int i6) {
                return new x[i6];
            }
        }

        x(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3385c = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        void b(x xVar) {
            this.f3385c = xVar.f3385c;
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeParcelable(this.f3385c, 0);
        }

        x(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class y {

        /* renamed from: b, reason: collision with root package name */
        private RecyclerView f3387b;

        /* renamed from: c, reason: collision with root package name */
        private o f3388c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3389d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3390e;

        /* renamed from: f, reason: collision with root package name */
        private View f3391f;

        /* renamed from: h, reason: collision with root package name */
        private boolean f3393h;

        /* renamed from: a, reason: collision with root package name */
        private int f3386a = -1;

        /* renamed from: g, reason: collision with root package name */
        private final a f3392g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private int f3394a;

            /* renamed from: b, reason: collision with root package name */
            private int f3395b;

            /* renamed from: c, reason: collision with root package name */
            private int f3396c;

            /* renamed from: d, reason: collision with root package name */
            private int f3397d;

            /* renamed from: e, reason: collision with root package name */
            private Interpolator f3398e;

            /* renamed from: f, reason: collision with root package name */
            private boolean f3399f;

            /* renamed from: g, reason: collision with root package name */
            private int f3400g;

            public a(int i6, int i7) {
                this(i6, i7, Integer.MIN_VALUE, null);
            }

            private void e() {
                if (this.f3398e != null && this.f3396c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (this.f3396c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            boolean a() {
                return this.f3397d >= 0;
            }

            public void b(int i6) {
                this.f3397d = i6;
            }

            void c(RecyclerView recyclerView) {
                int i6 = this.f3397d;
                if (i6 >= 0) {
                    this.f3397d = -1;
                    recyclerView.v0(i6);
                    this.f3399f = false;
                } else {
                    if (!this.f3399f) {
                        this.f3400g = 0;
                        return;
                    }
                    e();
                    recyclerView.f3257d0.f(this.f3394a, this.f3395b, this.f3396c, this.f3398e);
                    int i7 = this.f3400g + 1;
                    this.f3400g = i7;
                    if (i7 > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f3399f = false;
                }
            }

            public void d(int i6, int i7, int i8, Interpolator interpolator) {
                this.f3394a = i6;
                this.f3395b = i7;
                this.f3396c = i8;
                this.f3398e = interpolator;
                this.f3399f = true;
            }

            public a(int i6, int i7, int i8, Interpolator interpolator) {
                this.f3397d = -1;
                this.f3399f = false;
                this.f3400g = 0;
                this.f3394a = i6;
                this.f3395b = i7;
                this.f3396c = i8;
                this.f3398e = interpolator;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i6);
        }

        public PointF a(int i6) {
            Object e6 = e();
            if (e6 instanceof b) {
                return ((b) e6).a(i6);
            }
            Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        public View b(int i6) {
            return this.f3387b.f3274m.C(i6);
        }

        public int c() {
            return this.f3387b.f3274m.J();
        }

        public int d(View view) {
            return this.f3387b.d0(view);
        }

        public o e() {
            return this.f3388c;
        }

        public int f() {
            return this.f3386a;
        }

        public boolean g() {
            return this.f3389d;
        }

        public boolean h() {
            return this.f3390e;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void i(PointF pointF) {
            float f6 = pointF.x;
            float f7 = pointF.y;
            float sqrt = (float) Math.sqrt((f6 * f6) + (f7 * f7));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        void j(int i6, int i7) {
            PointF a6;
            RecyclerView recyclerView = this.f3387b;
            if (this.f3386a == -1 || recyclerView == null) {
                r();
            }
            if (this.f3389d && this.f3391f == null && this.f3388c != null && (a6 = a(this.f3386a)) != null) {
                float f6 = a6.x;
                if (f6 != 0.0f || a6.y != 0.0f) {
                    recyclerView.f1((int) Math.signum(f6), (int) Math.signum(a6.y), null);
                }
            }
            this.f3389d = false;
            View view = this.f3391f;
            if (view != null) {
                if (d(view) == this.f3386a) {
                    o(this.f3391f, recyclerView.f3263g0, this.f3392g);
                    this.f3392g.c(recyclerView);
                    r();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f3391f = null;
                }
            }
            if (this.f3390e) {
                l(i6, i7, recyclerView.f3263g0, this.f3392g);
                boolean a7 = this.f3392g.a();
                this.f3392g.c(recyclerView);
                if (a7 && this.f3390e) {
                    this.f3389d = true;
                    recyclerView.f3257d0.e();
                }
            }
        }

        protected void k(View view) {
            if (d(view) == f()) {
                this.f3391f = view;
            }
        }

        protected abstract void l(int i6, int i7, z zVar, a aVar);

        protected abstract void m();

        protected abstract void n();

        protected abstract void o(View view, z zVar, a aVar);

        public void p(int i6) {
            this.f3386a = i6;
        }

        void q(RecyclerView recyclerView, o oVar) {
            recyclerView.f3257d0.g();
            if (this.f3393h) {
                Log.w("RecyclerView", "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f3387b = recyclerView;
            this.f3388c = oVar;
            int i6 = this.f3386a;
            if (i6 == -1) {
                throw new IllegalArgumentException("Invalid target position");
            }
            recyclerView.f3263g0.f3401a = i6;
            this.f3390e = true;
            this.f3389d = true;
            this.f3391f = b(f());
            m();
            this.f3387b.f3257d0.e();
            this.f3393h = true;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public final void r() {
            if (this.f3390e) {
                this.f3390e = false;
                n();
                this.f3387b.f3263g0.f3401a = -1;
                this.f3391f = null;
                this.f3386a = -1;
                this.f3389d = false;
                this.f3388c.f1(this);
                this.f3388c = null;
                this.f3387b = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class z {

        /* renamed from: b, reason: collision with root package name */
        private SparseArray f3402b;

        /* renamed from: m, reason: collision with root package name */
        int f3413m;

        /* renamed from: n, reason: collision with root package name */
        long f3414n;

        /* renamed from: o, reason: collision with root package name */
        int f3415o;

        /* renamed from: p, reason: collision with root package name */
        int f3416p;

        /* renamed from: q, reason: collision with root package name */
        int f3417q;

        /* renamed from: a, reason: collision with root package name */
        int f3401a = -1;

        /* renamed from: c, reason: collision with root package name */
        int f3403c = 0;

        /* renamed from: d, reason: collision with root package name */
        int f3404d = 0;

        /* renamed from: e, reason: collision with root package name */
        int f3405e = 1;

        /* renamed from: f, reason: collision with root package name */
        int f3406f = 0;

        /* renamed from: g, reason: collision with root package name */
        boolean f3407g = false;

        /* renamed from: h, reason: collision with root package name */
        boolean f3408h = false;

        /* renamed from: i, reason: collision with root package name */
        boolean f3409i = false;

        /* renamed from: j, reason: collision with root package name */
        boolean f3410j = false;

        /* renamed from: k, reason: collision with root package name */
        boolean f3411k = false;

        /* renamed from: l, reason: collision with root package name */
        boolean f3412l = false;

        void a(int i6) {
            if ((this.f3405e & i6) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i6) + " but it is " + Integer.toBinaryString(this.f3405e));
        }

        public int b() {
            return this.f3408h ? this.f3403c - this.f3404d : this.f3406f;
        }

        public int c() {
            return this.f3401a;
        }

        public boolean d() {
            return this.f3401a != -1;
        }

        public boolean e() {
            return this.f3408h;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void f(g gVar) {
            this.f3405e = 1;
            this.f3406f = gVar.c();
            this.f3408h = false;
            this.f3409i = false;
            this.f3410j = false;
        }

        public boolean g() {
            return this.f3412l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f3401a + ", mData=" + this.f3402b + ", mItemCount=" + this.f3406f + ", mIsMeasuring=" + this.f3410j + ", mPreviousLayoutItemCount=" + this.f3403c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f3404d + ", mStructureChanged=" + this.f3407g + ", mInPreLayout=" + this.f3408h + ", mRunSimpleAnimations=" + this.f3411k + ", mRunPredictiveAnimations=" + this.f3412l + '}';
        }
    }

    static {
        int i6 = Build.VERSION.SDK_INT;
        f3247x0 = false;
        f3248y0 = i6 >= 23;
        f3249z0 = true;
        A0 = true;
        B0 = false;
        C0 = false;
        Class cls = Integer.TYPE;
        D0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        E0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g0.a.f6640a);
    }

    private void A() {
        int i6 = this.f3296y;
        this.f3296y = 0;
        if (i6 == 0 || !s0()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        androidx.core.view.accessibility.b.b(obtain, i6);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void C() {
        this.f3263g0.a(1);
        Q(this.f3263g0);
        this.f3263g0.f3410j = false;
        p1();
        this.f3260f.f();
        F0();
        N0();
        c1();
        z zVar = this.f3263g0;
        zVar.f3409i = zVar.f3411k && this.f3271k0;
        this.f3271k0 = false;
        this.f3269j0 = false;
        zVar.f3408h = zVar.f3412l;
        zVar.f3406f = this.f3272l.c();
        U(this.f3279o0);
        if (this.f3263g0.f3411k) {
            int g6 = this.f3258e.g();
            for (int i6 = 0; i6 < g6; i6++) {
                c0 f02 = f0(this.f3258e.f(i6));
                if (!f02.J() && (!f02.t() || this.f3272l.g())) {
                    this.f3260f.e(f02, this.L.t(this.f3263g0, f02, l.e(f02), f02.o()));
                    if (this.f3263g0.f3409i && f02.y() && !f02.v() && !f02.J() && !f02.t()) {
                        this.f3260f.c(c0(f02), f02);
                    }
                }
            }
        }
        if (this.f3263g0.f3412l) {
            d1();
            z zVar2 = this.f3263g0;
            boolean z5 = zVar2.f3407g;
            zVar2.f3407g = false;
            this.f3274m.X0(this.f3252b, zVar2);
            this.f3263g0.f3407g = z5;
            for (int i7 = 0; i7 < this.f3258e.g(); i7++) {
                c0 f03 = f0(this.f3258e.f(i7));
                if (!f03.J() && !this.f3260f.i(f03)) {
                    int e6 = l.e(f03);
                    boolean p6 = f03.p(8192);
                    if (!p6) {
                        e6 |= 4096;
                    }
                    l.b t5 = this.L.t(this.f3263g0, f03, e6, f03.o());
                    if (p6) {
                        Q0(f03, t5);
                    } else {
                        this.f3260f.a(f03, t5);
                    }
                }
            }
        }
        s();
        G0();
        r1(false);
        this.f3263g0.f3405e = 2;
    }

    private void D() {
        p1();
        F0();
        this.f3263g0.a(6);
        this.f3256d.j();
        this.f3263g0.f3406f = this.f3272l.c();
        z zVar = this.f3263g0;
        zVar.f3404d = 0;
        zVar.f3408h = false;
        this.f3274m.X0(this.f3252b, zVar);
        z zVar2 = this.f3263g0;
        zVar2.f3407g = false;
        this.f3254c = null;
        zVar2.f3411k = zVar2.f3411k && this.L != null;
        zVar2.f3405e = 4;
        G0();
        r1(false);
    }

    private void E() {
        this.f3263g0.a(4);
        p1();
        F0();
        z zVar = this.f3263g0;
        zVar.f3405e = 1;
        if (zVar.f3411k) {
            for (int g6 = this.f3258e.g() - 1; g6 >= 0; g6--) {
                c0 f02 = f0(this.f3258e.f(g6));
                if (!f02.J()) {
                    long c02 = c0(f02);
                    l.b s5 = this.L.s(this.f3263g0, f02);
                    c0 g7 = this.f3260f.g(c02);
                    if (g7 != null && !g7.J()) {
                        boolean h6 = this.f3260f.h(g7);
                        boolean h7 = this.f3260f.h(f02);
                        if (!h6 || g7 != f02) {
                            l.b n6 = this.f3260f.n(g7);
                            this.f3260f.d(f02, s5);
                            l.b m6 = this.f3260f.m(f02);
                            if (n6 == null) {
                                k0(c02, f02, g7);
                            } else {
                                m(g7, f02, n6, m6, h6, h7);
                            }
                        }
                    }
                    this.f3260f.d(f02, s5);
                }
            }
            this.f3260f.o(this.f3293v0);
        }
        this.f3274m.l1(this.f3252b);
        z zVar2 = this.f3263g0;
        zVar2.f3403c = zVar2.f3406f;
        this.C = false;
        this.D = false;
        zVar2.f3411k = false;
        zVar2.f3412l = false;
        this.f3274m.f3349h = false;
        ArrayList arrayList = this.f3252b.f3377b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.f3274m;
        if (oVar.f3355n) {
            oVar.f3354m = 0;
            oVar.f3355n = false;
            this.f3252b.K();
        }
        this.f3274m.Y0(this.f3263g0);
        G0();
        r1(false);
        this.f3260f.f();
        int[] iArr = this.f3279o0;
        if (x(iArr[0], iArr[1])) {
            I(0, 0);
        }
        R0();
        a1();
    }

    private void I0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            int i6 = actionIndex == 0 ? 1 : 0;
            this.N = motionEvent.getPointerId(i6);
            int x5 = (int) (motionEvent.getX(i6) + 0.5f);
            this.R = x5;
            this.P = x5;
            int y5 = (int) (motionEvent.getY(i6) + 0.5f);
            this.S = y5;
            this.Q = y5;
        }
    }

    private boolean K(MotionEvent motionEvent) {
        r rVar = this.f3280p;
        if (rVar == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return T(motionEvent);
        }
        rVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f3280p = null;
        }
        return true;
    }

    private boolean M0() {
        return this.L != null && this.f3274m.L1();
    }

    private void N0() {
        boolean z5;
        if (this.C) {
            this.f3256d.u();
            if (this.D) {
                this.f3274m.S0(this);
            }
        }
        if (M0()) {
            this.f3256d.s();
        } else {
            this.f3256d.j();
        }
        boolean z6 = false;
        boolean z7 = this.f3269j0 || this.f3271k0;
        this.f3263g0.f3411k = this.f3288t && this.L != null && ((z5 = this.C) || z7 || this.f3274m.f3349h) && (!z5 || this.f3272l.g());
        z zVar = this.f3263g0;
        if (zVar.f3411k && z7 && !this.C && M0()) {
            z6 = true;
        }
        zVar.f3412l = z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.M()
            android.widget.EdgeEffect r3 = r6.H
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.e.c(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.N()
            android.widget.EdgeEffect r3 = r6.J
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.O()
            android.widget.EdgeEffect r9 = r6.I
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.e.c(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.L()
            android.widget.EdgeEffect r9 = r6.K
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.e.c(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            androidx.core.view.b1.h0(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.P0(float, float, float, float):void");
    }

    private void R0() {
        View findViewById;
        if (!this.f3255c0 || this.f3272l == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!C0 || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.f3258e.n(focusedChild)) {
                    return;
                }
            } else if (this.f3258e.g() == 0) {
                requestFocus();
                return;
            }
        }
        View view = null;
        c0 Y = (this.f3263g0.f3414n == -1 || !this.f3272l.g()) ? null : Y(this.f3263g0.f3414n);
        if (Y != null && !this.f3258e.n(Y.f3308a) && Y.f3308a.hasFocusable()) {
            view = Y.f3308a;
        } else if (this.f3258e.g() > 0) {
            view = W();
        }
        if (view != null) {
            int i6 = this.f3263g0.f3415o;
            if (i6 != -1 && (findViewById = view.findViewById(i6)) != null && findViewById.isFocusable()) {
                view = findViewById;
            }
            view.requestFocus();
        }
    }

    private void S0() {
        boolean z5;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z5 = this.H.isFinished();
        } else {
            z5 = false;
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z5 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z5 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z5 |= this.K.isFinished();
        }
        if (z5) {
            b1.h0(this);
        }
    }

    private boolean T(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.f3278o.size();
        for (int i6 = 0; i6 < size; i6++) {
            r rVar = (r) this.f3278o.get(i6);
            if (rVar.a(this, motionEvent) && action != 3) {
                this.f3280p = rVar;
                return true;
            }
        }
        return false;
    }

    private void U(int[] iArr) {
        int g6 = this.f3258e.g();
        if (g6 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        for (int i8 = 0; i8 < g6; i8++) {
            c0 f02 = f0(this.f3258e.f(i8));
            if (!f02.J()) {
                int m6 = f02.m();
                if (m6 < i6) {
                    i6 = m6;
                }
                if (m6 > i7) {
                    i7 = m6;
                }
            }
        }
        iArr[0] = i6;
        iArr[1] = i7;
    }

    static RecyclerView V(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i6 = 0; i6 < childCount; i6++) {
            RecyclerView V = V(viewGroup.getChildAt(i6));
            if (V != null) {
                return V;
            }
        }
        return null;
    }

    private View W() {
        c0 X;
        z zVar = this.f3263g0;
        int i6 = zVar.f3413m;
        if (i6 == -1) {
            i6 = 0;
        }
        int b6 = zVar.b();
        for (int i7 = i6; i7 < b6; i7++) {
            c0 X2 = X(i7);
            if (X2 == null) {
                break;
            }
            if (X2.f3308a.hasFocusable()) {
                return X2.f3308a;
            }
        }
        int min = Math.min(b6, i6);
        do {
            min--;
            if (min < 0 || (X = X(min)) == null) {
                return null;
            }
        } while (!X.f3308a.hasFocusable());
        return X.f3308a;
    }

    private void Z0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f3266i.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f3368c) {
                Rect rect = pVar.f3367b;
                Rect rect2 = this.f3266i;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f3266i);
            offsetRectIntoDescendantCoords(view, this.f3266i);
        }
        this.f3274m.s1(this, view, this.f3266i, !this.f3288t, view2 == null);
    }

    private void a1() {
        z zVar = this.f3263g0;
        zVar.f3414n = -1L;
        zVar.f3413m = -1;
        zVar.f3415o = -1;
    }

    private void b1() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        s1(0);
        S0();
    }

    private void c1() {
        View focusedChild = (this.f3255c0 && hasFocus() && this.f3272l != null) ? getFocusedChild() : null;
        c0 S = focusedChild != null ? S(focusedChild) : null;
        if (S == null) {
            a1();
            return;
        }
        this.f3263g0.f3414n = this.f3272l.g() ? S.k() : -1L;
        this.f3263g0.f3413m = this.C ? -1 : S.v() ? S.f3311d : S.j();
        this.f3263g0.f3415o = h0(S.f3308a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 f0(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f3366a;
    }

    private void g(c0 c0Var) {
        View view = c0Var.f3308a;
        boolean z5 = view.getParent() == this;
        this.f3252b.J(e0(view));
        if (c0Var.x()) {
            this.f3258e.c(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.f3258e;
        if (z5) {
            bVar.k(view);
        } else {
            bVar.b(view, true);
        }
    }

    static void g0(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f3367b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private s0 getScrollingChildHelper() {
        if (this.f3281p0 == null) {
            this.f3281p0 = new s0(this);
        }
        return this.f3281p0;
    }

    private int h0(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private void h1(g gVar, boolean z5, boolean z6) {
        g gVar2 = this.f3272l;
        if (gVar2 != null) {
            gVar2.s(this.f3250a);
            this.f3272l.l(this);
        }
        if (!z5 || z6) {
            T0();
        }
        this.f3256d.u();
        g gVar3 = this.f3272l;
        this.f3272l = gVar;
        if (gVar != null) {
            gVar.q(this.f3250a);
            gVar.h(this);
        }
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.E0(gVar3, this.f3272l);
        }
        this.f3252b.x(gVar3, this.f3272l, z5);
        this.f3263g0.f3407g = true;
    }

    private String i0(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private void k0(long j6, c0 c0Var, c0 c0Var2) {
        int g6 = this.f3258e.g();
        for (int i6 = 0; i6 < g6; i6++) {
            c0 f02 = f0(this.f3258e.f(i6));
            if (f02 != c0Var && c0(f02) == j6) {
                g gVar = this.f3272l;
                if (gVar == null || !gVar.g()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + c0Var + P());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + f02 + " \n View Holder 2:" + c0Var + P());
            }
        }
        Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + c0Var2 + " cannot be found but it is necessary for " + c0Var + P());
    }

    private void m(c0 c0Var, c0 c0Var2, l.b bVar, l.b bVar2, boolean z5, boolean z6) {
        c0Var.G(false);
        if (z5) {
            g(c0Var);
        }
        if (c0Var != c0Var2) {
            if (z6) {
                g(c0Var2);
            }
            c0Var.f3315h = c0Var2;
            g(c0Var);
            this.f3252b.J(c0Var);
            c0Var2.G(false);
            c0Var2.f3316i = c0Var;
        }
        if (this.L.b(c0Var, c0Var2, bVar, bVar2)) {
            L0();
        }
    }

    private boolean m0() {
        int g6 = this.f3258e.g();
        for (int i6 = 0; i6 < g6; i6++) {
            c0 f02 = f0(this.f3258e.f(i6));
            if (f02 != null && !f02.J() && f02.y()) {
                return true;
            }
        }
        return false;
    }

    private void o0() {
        if (b1.D(this) == 0) {
            b1.B0(this, 8);
        }
    }

    private void p0() {
        this.f3258e = new androidx.recyclerview.widget.b(new e());
    }

    private void q() {
        b1();
        setScrollState(0);
    }

    static void r(c0 c0Var) {
        WeakReference weakReference = c0Var.f3309b;
        if (weakReference != null) {
            Object obj = weakReference.get();
            while (true) {
                for (View view = (View) obj; view != null; view = null) {
                    if (view == c0Var.f3308a) {
                        return;
                    }
                    obj = view.getParent();
                    if (obj instanceof View) {
                        break;
                    }
                }
                c0Var.f3309b = null;
                return;
            }
        }
    }

    private boolean u0(View view, View view2, int i6) {
        int i7;
        if (view2 == null || view2 == this || R(view2) == null) {
            return false;
        }
        if (view == null || R(view) == null) {
            return true;
        }
        this.f3266i.set(0, 0, view.getWidth(), view.getHeight());
        this.f3268j.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f3266i);
        offsetDescendantRectToMyCoords(view2, this.f3268j);
        char c6 = 65535;
        int i8 = this.f3274m.Z() == 1 ? -1 : 1;
        Rect rect = this.f3266i;
        int i9 = rect.left;
        Rect rect2 = this.f3268j;
        int i10 = rect2.left;
        if ((i9 < i10 || rect.right <= i10) && rect.right < rect2.right) {
            i7 = 1;
        } else {
            int i11 = rect.right;
            int i12 = rect2.right;
            i7 = ((i11 > i12 || i9 >= i12) && i9 > i10) ? -1 : 0;
        }
        int i13 = rect.top;
        int i14 = rect2.top;
        if ((i13 < i14 || rect.bottom <= i14) && rect.bottom < rect2.bottom) {
            c6 = 1;
        } else {
            int i15 = rect.bottom;
            int i16 = rect2.bottom;
            if ((i15 <= i16 && i13 < i16) || i13 <= i14) {
                c6 = 0;
            }
        }
        if (i6 == 1) {
            return c6 < 0 || (c6 == 0 && i7 * i8 <= 0);
        }
        if (i6 == 2) {
            return c6 > 0 || (c6 == 0 && i7 * i8 >= 0);
        }
        if (i6 == 17) {
            return i7 < 0;
        }
        if (i6 == 33) {
            return c6 < 0;
        }
        if (i6 == 66) {
            return i7 > 0;
        }
        if (i6 == 130) {
            return c6 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i6 + P());
    }

    private void u1() {
        this.f3257d0.g();
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.K1();
        }
    }

    private void v(Context context, String str, AttributeSet attributeSet, int i6, int i7) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String i02 = i0(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(i02, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                try {
                    constructor = asSubclass.getConstructor(D0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i6), Integer.valueOf(i7)};
                } catch (NoSuchMethodException e6) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e7) {
                        e7.initCause(e6);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + i02, e7);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + i02, e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + i02, e9);
            } catch (IllegalAccessException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + i02, e10);
            } catch (InstantiationException e11) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e11);
            } catch (InvocationTargetException e12) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + i02, e12);
            }
        }
    }

    private boolean x(int i6, int i7) {
        U(this.f3279o0);
        int[] iArr = this.f3279o0;
        return (iArr[0] == i6 && iArr[1] == i7) ? false : true;
    }

    void A0(int i6, int i7) {
        int j6 = this.f3258e.j();
        for (int i8 = 0; i8 < j6; i8++) {
            c0 f02 = f0(this.f3258e.i(i8));
            if (f02 != null && !f02.J() && f02.f3310c >= i6) {
                f02.A(i7, false);
                this.f3263g0.f3407g = true;
            }
        }
        this.f3252b.u(i6, i7);
        requestLayout();
    }

    void B() {
        String str;
        if (this.f3272l == null) {
            str = "No adapter attached; skipping layout";
        } else {
            if (this.f3274m != null) {
                z zVar = this.f3263g0;
                zVar.f3410j = false;
                if (zVar.f3405e == 1) {
                    C();
                } else if (!this.f3256d.q() && this.f3274m.o0() == getWidth() && this.f3274m.W() == getHeight()) {
                    this.f3274m.z1(this);
                    E();
                    return;
                }
                this.f3274m.z1(this);
                D();
                E();
                return;
            }
            str = "No layout manager attached; skipping layout";
        }
        Log.e("RecyclerView", str);
    }

    void B0(int i6, int i7) {
        int i8;
        int i9;
        int i10;
        int i11;
        int j6 = this.f3258e.j();
        if (i6 < i7) {
            i10 = -1;
            i9 = i6;
            i8 = i7;
        } else {
            i8 = i6;
            i9 = i7;
            i10 = 1;
        }
        for (int i12 = 0; i12 < j6; i12++) {
            c0 f02 = f0(this.f3258e.i(i12));
            if (f02 != null && (i11 = f02.f3310c) >= i9 && i11 <= i8) {
                if (i11 == i6) {
                    f02.A(i7 - i6, false);
                } else {
                    f02.A(i10, false);
                }
                this.f3263g0.f3407g = true;
            }
        }
        this.f3252b.v(i6, i7);
        requestLayout();
    }

    void C0(int i6, int i7, boolean z5) {
        int i8 = i6 + i7;
        int j6 = this.f3258e.j();
        for (int i9 = 0; i9 < j6; i9++) {
            c0 f02 = f0(this.f3258e.i(i9));
            if (f02 != null && !f02.J()) {
                int i10 = f02.f3310c;
                if (i10 >= i8) {
                    f02.A(-i7, z5);
                } else if (i10 >= i6) {
                    f02.i(i6 - 1, -i7, z5);
                }
                this.f3263g0.f3407g = true;
            }
        }
        this.f3252b.w(i6, i7, z5);
        requestLayout();
    }

    public void D0(View view) {
    }

    public void E0(View view) {
    }

    public boolean F(int i6, int i7, int[] iArr, int[] iArr2, int i8) {
        return getScrollingChildHelper().d(i6, i7, iArr, iArr2, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void F0() {
        this.E++;
    }

    public final void G(int i6, int i7, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        getScrollingChildHelper().e(i6, i7, i8, i9, iArr, i10, iArr2);
    }

    void G0() {
        H0(true);
    }

    void H(int i6) {
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.e1(i6);
        }
        J0(i6);
        s sVar = this.f3265h0;
        if (sVar != null) {
            sVar.a(this, i6);
        }
        List list = this.f3267i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f3267i0.get(size)).a(this, i6);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H0(boolean z5) {
        int i6 = this.E - 1;
        this.E = i6;
        if (i6 < 1) {
            this.E = 0;
            if (z5) {
                A();
                J();
            }
        }
    }

    void I(int i6, int i7) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i6, scrollY - i7);
        K0(i6, i7);
        s sVar = this.f3265h0;
        if (sVar != null) {
            sVar.b(this, i6, i7);
        }
        List list = this.f3267i0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((s) this.f3267i0.get(size)).b(this, i6, i7);
            }
        }
        this.F--;
    }

    void J() {
        int i6;
        for (int size = this.f3289t0.size() - 1; size >= 0; size--) {
            c0 c0Var = (c0) this.f3289t0.get(size);
            if (c0Var.f3308a.getParent() == this && !c0Var.J() && (i6 = c0Var.f3324q) != -1) {
                b1.A0(c0Var.f3308a, i6);
                c0Var.f3324q = -1;
            }
        }
        this.f3289t0.clear();
    }

    public void J0(int i6) {
    }

    public void K0(int i6, int i7) {
    }

    void L() {
        int measuredWidth;
        int measuredHeight;
        if (this.K != null) {
            return;
        }
        EdgeEffect a6 = this.G.a(this, 3);
        this.K = a6;
        if (this.f3262g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a6.setSize(measuredWidth, measuredHeight);
    }

    void L0() {
        if (this.f3275m0 || !this.f3282q) {
            return;
        }
        b1.i0(this, this.f3291u0);
        this.f3275m0 = true;
    }

    void M() {
        int measuredHeight;
        int measuredWidth;
        if (this.H != null) {
            return;
        }
        EdgeEffect a6 = this.G.a(this, 0);
        this.H = a6;
        if (this.f3262g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a6.setSize(measuredHeight, measuredWidth);
    }

    void N() {
        int measuredHeight;
        int measuredWidth;
        if (this.J != null) {
            return;
        }
        EdgeEffect a6 = this.G.a(this, 2);
        this.J = a6;
        if (this.f3262g) {
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        a6.setSize(measuredHeight, measuredWidth);
    }

    void O() {
        int measuredWidth;
        int measuredHeight;
        if (this.I != null) {
            return;
        }
        EdgeEffect a6 = this.G.a(this, 1);
        this.I = a6;
        if (this.f3262g) {
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        a6.setSize(measuredWidth, measuredHeight);
    }

    void O0(boolean z5) {
        this.D = z5 | this.D;
        this.C = true;
        x0();
    }

    String P() {
        return " " + super.toString() + ", adapter:" + this.f3272l + ", layout:" + this.f3274m + ", context:" + getContext();
    }

    final void Q(z zVar) {
        if (getScrollState() != 2) {
            zVar.f3416p = 0;
            zVar.f3417q = 0;
        } else {
            OverScroller overScroller = this.f3257d0.f3302c;
            zVar.f3416p = overScroller.getFinalX() - overScroller.getCurrX();
            zVar.f3417q = overScroller.getFinalY() - overScroller.getCurrY();
        }
    }

    void Q0(c0 c0Var, l.b bVar) {
        c0Var.F(0, 8192);
        if (this.f3263g0.f3409i && c0Var.y() && !c0Var.v() && !c0Var.J()) {
            this.f3260f.c(c0(c0Var), c0Var);
        }
        this.f3260f.e(c0Var, bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View R(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.R(android.view.View):android.view.View");
    }

    public c0 S(View view) {
        View R = R(view);
        if (R == null) {
            return null;
        }
        return e0(R);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T0() {
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.k1(this.f3252b);
            this.f3274m.l1(this.f3252b);
        }
        this.f3252b.c();
    }

    boolean U0(View view) {
        p1();
        boolean r5 = this.f3258e.r(view);
        if (r5) {
            c0 f02 = f0(view);
            this.f3252b.J(f02);
            this.f3252b.C(f02);
        }
        r1(!r5);
        return r5;
    }

    public void V0(n nVar) {
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.g("Cannot remove item decoration during a scroll  or layout");
        }
        this.f3276n.remove(nVar);
        if (this.f3276n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        w0();
        requestLayout();
    }

    public void W0(r rVar) {
        this.f3278o.remove(rVar);
        if (this.f3280p == rVar) {
            this.f3280p = null;
        }
    }

    public c0 X(int i6) {
        c0 c0Var = null;
        if (this.C) {
            return null;
        }
        int j6 = this.f3258e.j();
        for (int i7 = 0; i7 < j6; i7++) {
            c0 f02 = f0(this.f3258e.i(i7));
            if (f02 != null && !f02.v() && b0(f02) == i6) {
                if (!this.f3258e.n(f02.f3308a)) {
                    return f02;
                }
                c0Var = f02;
            }
        }
        return c0Var;
    }

    public void X0(s sVar) {
        List list = this.f3267i0;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public c0 Y(long j6) {
        g gVar = this.f3272l;
        c0 c0Var = null;
        if (gVar != null && gVar.g()) {
            int j7 = this.f3258e.j();
            for (int i6 = 0; i6 < j7; i6++) {
                c0 f02 = f0(this.f3258e.i(i6));
                if (f02 != null && !f02.v() && f02.k() == j6) {
                    if (!this.f3258e.n(f02.f3308a)) {
                        return f02;
                    }
                    c0Var = f02;
                }
            }
        }
        return c0Var;
    }

    void Y0() {
        c0 c0Var;
        int g6 = this.f3258e.g();
        for (int i6 = 0; i6 < g6; i6++) {
            View f6 = this.f3258e.f(i6);
            c0 e02 = e0(f6);
            if (e02 != null && (c0Var = e02.f3316i) != null) {
                View view = c0Var.f3308a;
                int left = f6.getLeft();
                int top = f6.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.c0 Z(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.f3258e
            int r0 = r0.j()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.f3258e
            android.view.View r3 = r3.i(r2)
            androidx.recyclerview.widget.RecyclerView$c0 r3 = f0(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.v()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f3310c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.m()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.f3258e
            android.view.View r4 = r3.f3308a
            boolean r1 = r1.n(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.Z(int, boolean):androidx.recyclerview.widget.RecyclerView$c0");
    }

    void a(int i6, int i7) {
        if (i6 < 0) {
            M();
            if (this.H.isFinished()) {
                this.H.onAbsorb(-i6);
            }
        } else if (i6 > 0) {
            N();
            if (this.J.isFinished()) {
                this.J.onAbsorb(i6);
            }
        }
        if (i7 < 0) {
            O();
            if (this.I.isFinished()) {
                this.I.onAbsorb(-i7);
            }
        } else if (i7 > 0) {
            L();
            if (this.K.isFinished()) {
                this.K.onAbsorb(i7);
            }
        }
        if (i6 == 0 && i7 == 0) {
            return;
        }
        b1.h0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public boolean a0(int i6, int i7) {
        o oVar = this.f3274m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f3294w) {
            return false;
        }
        int k6 = oVar.k();
        boolean l6 = this.f3274m.l();
        if (k6 == 0 || Math.abs(i6) < this.V) {
            i6 = 0;
        }
        if (!l6 || Math.abs(i7) < this.V) {
            i7 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            return false;
        }
        float f6 = i6;
        float f7 = i7;
        if (!dispatchNestedPreFling(f6, f7)) {
            boolean z5 = k6 != 0 || l6;
            dispatchNestedFling(f6, f7, z5);
            q qVar = this.U;
            if (qVar != null && qVar.a(i6, i7)) {
                return true;
            }
            if (z5) {
                if (l6) {
                    k6 = (k6 == true ? 1 : 0) | 2;
                }
                q1(k6, 1);
                int i8 = this.W;
                int max = Math.max(-i8, Math.min(i6, i8));
                int i9 = this.W;
                this.f3257d0.c(max, Math.max(-i9, Math.min(i7, i9)));
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i6, int i7) {
        o oVar = this.f3274m;
        if (oVar == null || !oVar.F0(this, arrayList, i6, i7)) {
            super.addFocusables(arrayList, i6, i7);
        }
    }

    int b0(c0 c0Var) {
        if (c0Var.p(524) || !c0Var.s()) {
            return -1;
        }
        return this.f3256d.e(c0Var.f3310c);
    }

    long c0(c0 c0Var) {
        return this.f3272l.g() ? c0Var.k() : c0Var.f3310c;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.f3274m.m((p) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.f3274m;
        if (oVar != null && oVar.k()) {
            return this.f3274m.q(this.f3263g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.f3274m;
        if (oVar != null && oVar.k()) {
            return this.f3274m.r(this.f3263g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.f3274m;
        if (oVar != null && oVar.k()) {
            return this.f3274m.s(this.f3263g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.f3274m;
        if (oVar != null && oVar.l()) {
            return this.f3274m.t(this.f3263g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.f3274m;
        if (oVar != null && oVar.l()) {
            return this.f3274m.u(this.f3263g0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.f3274m;
        if (oVar != null && oVar.l()) {
            return this.f3274m.v(this.f3263g0);
        }
        return 0;
    }

    public int d0(View view) {
        c0 f02 = f0(view);
        if (f02 != null) {
            return f02.m();
        }
        return -1;
    }

    void d1() {
        int j6 = this.f3258e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            c0 f02 = f0(this.f3258e.i(i6));
            if (!f02.J()) {
                f02.E();
            }
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f6, float f7, boolean z5) {
        return getScrollingChildHelper().a(f6, f7, z5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f6, float f7) {
        return getScrollingChildHelper().b(f6, f7);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i6, int i7, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i6, i7, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i6, int i7, int i8, int i9, int[] iArr) {
        return getScrollingChildHelper().f(i6, i7, i8, i9, iArr);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z5;
        float f6;
        int i6;
        super.draw(canvas);
        int size = this.f3276n.size();
        boolean z6 = false;
        for (int i7 = 0; i7 < size; i7++) {
            ((n) this.f3276n.get(i7)).i(canvas, this, this.f3263g0);
        }
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z5 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.f3262g ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            z5 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.f3262g) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            z5 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f3262g ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.J;
            z5 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f3262g) {
                f6 = (-getWidth()) + getPaddingRight();
                i6 = (-getHeight()) + getPaddingBottom();
            } else {
                f6 = -getWidth();
                i6 = -getHeight();
            }
            canvas.translate(f6, i6);
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z6 = true;
            }
            z5 |= z6;
            canvas.restoreToCount(save4);
        }
        if ((z5 || this.L == null || this.f3276n.size() <= 0 || !this.L.p()) ? z5 : true) {
            b1.h0(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j6) {
        return super.drawChild(canvas, view, j6);
    }

    public c0 e0(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return f0(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    boolean e1(int i6, int i7, MotionEvent motionEvent) {
        int i8;
        int i9;
        int i10;
        int i11;
        u();
        if (this.f3272l != null) {
            int[] iArr = this.f3287s0;
            iArr[0] = 0;
            iArr[1] = 0;
            f1(i6, i7, iArr);
            int[] iArr2 = this.f3287s0;
            int i12 = iArr2[0];
            int i13 = iArr2[1];
            i8 = i13;
            i9 = i12;
            i10 = i6 - i12;
            i11 = i7 - i13;
        } else {
            i8 = 0;
            i9 = 0;
            i10 = 0;
            i11 = 0;
        }
        if (!this.f3276n.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.f3287s0;
        iArr3[0] = 0;
        iArr3[1] = 0;
        G(i9, i8, i10, i11, this.f3283q0, 0, iArr3);
        int[] iArr4 = this.f3287s0;
        int i14 = iArr4[0];
        int i15 = i10 - i14;
        int i16 = iArr4[1];
        int i17 = i11 - i16;
        boolean z5 = (i14 == 0 && i16 == 0) ? false : true;
        int i18 = this.R;
        int[] iArr5 = this.f3283q0;
        int i19 = iArr5[0];
        this.R = i18 - i19;
        int i20 = this.S;
        int i21 = iArr5[1];
        this.S = i20 - i21;
        int[] iArr6 = this.f3285r0;
        iArr6[0] = iArr6[0] + i19;
        iArr6[1] = iArr6[1] + i21;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !r0.a(motionEvent, 8194)) {
                P0(motionEvent.getX(), i15, motionEvent.getY(), i17);
            }
            t(i6, i7);
        }
        if (i9 != 0 || i8 != 0) {
            I(i9, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z5 && i9 == 0 && i8 == 0) ? false : true;
    }

    void f1(int i6, int i7, int[] iArr) {
        p1();
        F0();
        androidx.core.os.t.a("RV Scroll");
        Q(this.f3263g0);
        int w12 = i6 != 0 ? this.f3274m.w1(i6, this.f3252b, this.f3263g0) : 0;
        int y12 = i7 != 0 ? this.f3274m.y1(i7, this.f3252b, this.f3263g0) : 0;
        androidx.core.os.t.b();
        Y0();
        G0();
        r1(false);
        if (iArr != null) {
            iArr[0] = w12;
            iArr[1] = y12;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i6) {
        View view2;
        boolean z5;
        View Q0 = this.f3274m.Q0(view, i6);
        if (Q0 != null) {
            return Q0;
        }
        boolean z6 = (this.f3272l == null || this.f3274m == null || t0() || this.f3294w) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z6 && (i6 == 2 || i6 == 1)) {
            if (this.f3274m.l()) {
                int i7 = i6 == 2 ? 130 : 33;
                z5 = focusFinder.findNextFocus(this, view, i7) == null;
                if (B0) {
                    i6 = i7;
                }
            } else {
                z5 = false;
            }
            if (!z5 && this.f3274m.k()) {
                int i8 = (this.f3274m.Z() == 1) ^ (i6 == 2) ? 66 : 17;
                boolean z7 = focusFinder.findNextFocus(this, view, i8) == null;
                if (B0) {
                    i6 = i8;
                }
                z5 = z7;
            }
            if (z5) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                this.f3274m.J0(view, i6, this.f3252b, this.f3263g0);
                r1(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i6);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i6);
            if (findNextFocus == null && z6) {
                u();
                if (R(view) == null) {
                    return null;
                }
                p1();
                view2 = this.f3274m.J0(view, i6, this.f3252b, this.f3263g0);
                r1(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 == null || view2.hasFocusable()) {
            return u0(view, view2, i6) ? view2 : super.focusSearch(view, i6);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i6);
        }
        Z0(view2, null);
        return view;
    }

    public void g1(int i6) {
        if (this.f3294w) {
            return;
        }
        t1();
        o oVar = this.f3274m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.x1(i6);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.f3274m;
        if (oVar != null) {
            return oVar.D();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.f3274m;
        if (oVar != null) {
            return oVar.E(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.f3272l;
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.f3274m;
        return oVar != null ? oVar.G() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i6, int i7) {
        return super.getChildDrawingOrder(i6, i7);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f3262g;
    }

    public androidx.recyclerview.widget.k getCompatAccessibilityDelegate() {
        return this.f3277n0;
    }

    public k getEdgeEffectFactory() {
        return this.G;
    }

    public l getItemAnimator() {
        return this.L;
    }

    public int getItemDecorationCount() {
        return this.f3276n.size();
    }

    public o getLayoutManager() {
        return this.f3274m;
    }

    public int getMaxFlingVelocity() {
        return this.W;
    }

    public int getMinFlingVelocity() {
        return this.V;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (A0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public q getOnFlingListener() {
        return this.U;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f3255c0;
    }

    public t getRecycledViewPool() {
        return this.f3252b.i();
    }

    public int getScrollState() {
        return this.M;
    }

    public void h(n nVar) {
        i(nVar, -1);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().j();
    }

    public void i(n nVar, int i6) {
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.g("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f3276n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i6 < 0) {
            this.f3276n.add(nVar);
        } else {
            this.f3276n.add(i6, nVar);
        }
        w0();
        requestLayout();
    }

    boolean i1(c0 c0Var, int i6) {
        if (!t0()) {
            b1.A0(c0Var.f3308a, i6);
            return true;
        }
        c0Var.f3324q = i6;
        this.f3289t0.add(c0Var);
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f3282q;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.f3294w;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().l();
    }

    public void j(r rVar) {
        this.f3278o.add(rVar);
    }

    Rect j0(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f3368c) {
            return pVar.f3367b;
        }
        if (this.f3263g0.e() && (pVar.b() || pVar.d())) {
            return pVar.f3367b;
        }
        Rect rect = pVar.f3367b;
        rect.set(0, 0, 0, 0);
        int size = this.f3276n.size();
        for (int i6 = 0; i6 < size; i6++) {
            this.f3266i.set(0, 0, 0, 0);
            ((n) this.f3276n.get(i6)).e(this.f3266i, view, this, this.f3263g0);
            int i7 = rect.left;
            Rect rect2 = this.f3266i;
            rect.left = i7 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f3368c = false;
        return rect;
    }

    boolean j1(AccessibilityEvent accessibilityEvent) {
        if (!t0()) {
            return false;
        }
        int a6 = accessibilityEvent != null ? androidx.core.view.accessibility.b.a(accessibilityEvent) : 0;
        this.f3296y |= a6 != 0 ? a6 : 0;
        return true;
    }

    public void k(s sVar) {
        if (this.f3267i0 == null) {
            this.f3267i0 = new ArrayList();
        }
        this.f3267i0.add(sVar);
    }

    public void k1(int i6, int i7) {
        l1(i6, i7, null);
    }

    void l(c0 c0Var, l.b bVar, l.b bVar2) {
        c0Var.G(false);
        if (this.L.a(c0Var, bVar, bVar2)) {
            L0();
        }
    }

    public boolean l0() {
        return !this.f3288t || this.C || this.f3256d.p();
    }

    public void l1(int i6, int i7, Interpolator interpolator) {
        m1(i6, i7, interpolator, Integer.MIN_VALUE);
    }

    public void m1(int i6, int i7, Interpolator interpolator, int i8) {
        n1(i6, i7, interpolator, i8, false);
    }

    void n(c0 c0Var, l.b bVar, l.b bVar2) {
        g(c0Var);
        c0Var.G(false);
        if (this.L.c(c0Var, bVar, bVar2)) {
            L0();
        }
    }

    void n0() {
        this.f3256d = new androidx.recyclerview.widget.a(new f());
    }

    void n1(int i6, int i7, Interpolator interpolator, int i8, boolean z5) {
        o oVar = this.f3274m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3294w) {
            return;
        }
        if (!oVar.k()) {
            i6 = 0;
        }
        if (!this.f3274m.l()) {
            i7 = 0;
        }
        if (i6 == 0 && i7 == 0) {
            return;
        }
        if (!(i8 == Integer.MIN_VALUE || i8 > 0)) {
            scrollBy(i6, i7);
            return;
        }
        if (z5) {
            int i9 = i6 != 0 ? 1 : 0;
            if (i7 != 0) {
                i9 |= 2;
            }
            q1(i9, 1);
        }
        this.f3257d0.f(i6, i7, i8, interpolator);
    }

    void o(String str) {
        if (t0()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + P());
        }
        if (this.F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + P()));
        }
    }

    public void o1(int i6) {
        if (this.f3294w) {
            return;
        }
        o oVar = this.f3274m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.I1(this, this.f3263g0, i6);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.E = r0
            r1 = 1
            r5.f3282q = r1
            boolean r2 = r5.f3288t
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r5.f3288t = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r5.f3274m
            if (r1 == 0) goto L1e
            r1.z(r5)
        L1e:
            r5.f3275m0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.A0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f3557e
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f3259e0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f3259e0 = r1
            android.view.Display r1 = androidx.core.view.b1.x(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f3259e0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f3561c = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f3259e0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.L;
        if (lVar != null) {
            lVar.k();
        }
        t1();
        this.f3282q = false;
        o oVar = this.f3274m;
        if (oVar != null) {
            oVar.A(this, this.f3252b);
        }
        this.f3289t0.clear();
        removeCallbacks(this.f3291u0);
        this.f3260f.j();
        if (!A0 || (eVar = this.f3259e0) == null) {
            return;
        }
        eVar.j(this);
        this.f3259e0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f3276n.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((n) this.f3276n.get(i6)).g(canvas, this, this.f3263g0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f3274m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f3294w
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.f3274m
            boolean r0 = r0.l()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f3274m
            boolean r3 = r3.k()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f3274m
            boolean r3 = r3.l()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.f3274m
            boolean r3 = r3.k()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.f3251a0
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f3253b0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.e1(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z5;
        if (this.f3294w) {
            return false;
        }
        this.f3280p = null;
        if (T(motionEvent)) {
            q();
            return true;
        }
        o oVar = this.f3274m;
        if (oVar == null) {
            return false;
        }
        boolean k6 = oVar.k();
        boolean l6 = this.f3274m.l();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f3295x) {
                this.f3295x = false;
            }
            this.N = motionEvent.getPointerId(0);
            int x5 = (int) (motionEvent.getX() + 0.5f);
            this.R = x5;
            this.P = x5;
            int y5 = (int) (motionEvent.getY() + 0.5f);
            this.S = y5;
            this.Q = y5;
            if (this.M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                s1(1);
            }
            int[] iArr = this.f3285r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i6 = k6;
            if (l6) {
                i6 = (k6 ? 1 : 0) | 2;
            }
            q1(i6, 0);
        } else if (actionMasked == 1) {
            this.O.clear();
            s1(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.N);
            if (findPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x6 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.M != 1) {
                int i7 = x6 - this.P;
                int i8 = y6 - this.Q;
                if (k6 == 0 || Math.abs(i7) <= this.T) {
                    z5 = false;
                } else {
                    this.R = x6;
                    z5 = true;
                }
                if (l6 && Math.abs(i8) > this.T) {
                    this.S = y6;
                    z5 = true;
                }
                if (z5) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            q();
        } else if (actionMasked == 5) {
            this.N = motionEvent.getPointerId(actionIndex);
            int x7 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.R = x7;
            this.P = x7;
            int y7 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.S = y7;
            this.Q = y7;
        } else if (actionMasked == 6) {
            I0(motionEvent);
        }
        return this.M == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i6, int i7, int i8, int i9) {
        androidx.core.os.t.a("RV OnLayout");
        B();
        androidx.core.os.t.b();
        this.f3288t = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i6, int i7) {
        o oVar = this.f3274m;
        if (oVar == null) {
            w(i6, i7);
            return;
        }
        boolean z5 = false;
        if (oVar.s0()) {
            int mode = View.MeasureSpec.getMode(i6);
            int mode2 = View.MeasureSpec.getMode(i7);
            this.f3274m.Z0(this.f3252b, this.f3263g0, i6, i7);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z5 = true;
            }
            if (z5 || this.f3272l == null) {
                return;
            }
            if (this.f3263g0.f3405e == 1) {
                C();
            }
            this.f3274m.A1(i6, i7);
            this.f3263g0.f3410j = true;
            D();
            this.f3274m.D1(i6, i7);
            if (this.f3274m.G1()) {
                this.f3274m.A1(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f3263g0.f3410j = true;
                D();
                this.f3274m.D1(i6, i7);
                return;
            }
            return;
        }
        if (this.f3284r) {
            this.f3274m.Z0(this.f3252b, this.f3263g0, i6, i7);
            return;
        }
        if (this.f3297z) {
            p1();
            F0();
            N0();
            G0();
            z zVar = this.f3263g0;
            if (zVar.f3412l) {
                zVar.f3408h = true;
            } else {
                this.f3256d.j();
                this.f3263g0.f3408h = false;
            }
            this.f3297z = false;
            r1(false);
        } else if (this.f3263g0.f3412l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        g gVar = this.f3272l;
        if (gVar != null) {
            this.f3263g0.f3406f = gVar.c();
        } else {
            this.f3263g0.f3406f = 0;
        }
        p1();
        this.f3274m.Z0(this.f3252b, this.f3263g0, i6, i7);
        r1(false);
        this.f3263g0.f3408h = false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i6, Rect rect) {
        if (t0()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i6, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof x)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        x xVar = (x) parcelable;
        this.f3254c = xVar;
        super.onRestoreInstanceState(xVar.a());
        o oVar = this.f3274m;
        if (oVar == null || (parcelable2 = this.f3254c.f3385c) == null) {
            return;
        }
        oVar.c1(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        x xVar = new x(super.onSaveInstanceState());
        x xVar2 = this.f3254c;
        if (xVar2 != null) {
            xVar.b(xVar2);
        } else {
            o oVar = this.f3274m;
            xVar.f3385c = oVar != null ? oVar.d1() : null;
        }
        return xVar;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i6, int i7, int i8, int i9) {
        super.onSizeChanged(i6, i7, i8, i9);
        if (i6 == i8 && i7 == i9) {
            return;
        }
        r0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    boolean p(c0 c0Var) {
        l lVar = this.L;
        return lVar == null || lVar.g(c0Var, c0Var.o());
    }

    void p1() {
        int i6 = this.f3290u + 1;
        this.f3290u = i6;
        if (i6 != 1 || this.f3294w) {
            return;
        }
        this.f3292v = false;
    }

    void q0(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(g0.b.f6641a), resources.getDimensionPixelSize(g0.b.f6643c), resources.getDimensionPixelOffset(g0.b.f6642b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + P());
        }
    }

    public boolean q1(int i6, int i7) {
        return getScrollingChildHelper().p(i6, i7);
    }

    void r0() {
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    void r1(boolean z5) {
        if (this.f3290u < 1) {
            this.f3290u = 1;
        }
        if (!z5 && !this.f3294w) {
            this.f3292v = false;
        }
        if (this.f3290u == 1) {
            if (z5 && this.f3292v && !this.f3294w && this.f3274m != null && this.f3272l != null) {
                B();
            }
            if (!this.f3294w) {
                this.f3292v = false;
            }
        }
        this.f3290u--;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z5) {
        c0 f02 = f0(view);
        if (f02 != null) {
            if (f02.x()) {
                f02.f();
            } else if (!f02.J()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + f02 + P());
            }
        }
        view.clearAnimation();
        z(view);
        super.removeDetachedView(view, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f3274m.b1(this, this.f3263g0, view, view2) && view2 != null) {
            Z0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z5) {
        return this.f3274m.r1(this, view, rect, z5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z5) {
        int size = this.f3278o.size();
        for (int i6 = 0; i6 < size; i6++) {
            ((r) this.f3278o.get(i6)).c(z5);
        }
        super.requestDisallowInterceptTouchEvent(z5);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f3290u != 0 || this.f3294w) {
            this.f3292v = true;
        } else {
            super.requestLayout();
        }
    }

    void s() {
        int j6 = this.f3258e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            c0 f02 = f0(this.f3258e.i(i6));
            if (!f02.J()) {
                f02.c();
            }
        }
        this.f3252b.d();
    }

    boolean s0() {
        AccessibilityManager accessibilityManager = this.A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public void s1(int i6) {
        getScrollingChildHelper().r(i6);
    }

    @Override // android.view.View
    public void scrollBy(int i6, int i7) {
        o oVar = this.f3274m;
        if (oVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f3294w) {
            return;
        }
        boolean k6 = oVar.k();
        boolean l6 = this.f3274m.l();
        if (k6 || l6) {
            if (!k6) {
                i6 = 0;
            }
            if (!l6) {
                i7 = 0;
            }
            e1(i6, i7, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i6, int i7) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (j1(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.k kVar) {
        this.f3277n0 = kVar;
        b1.q0(this, kVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        h1(gVar, false, true);
        O0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z5) {
        if (z5 != this.f3262g) {
            r0();
        }
        this.f3262g = z5;
        super.setClipToPadding(z5);
        if (this.f3288t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.h.f(kVar);
        this.G = kVar;
        r0();
    }

    public void setHasFixedSize(boolean z5) {
        this.f3284r = z5;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.L;
        if (lVar2 != null) {
            lVar2.k();
            this.L.v(null);
        }
        this.L = lVar;
        if (lVar != null) {
            lVar.v(this.f3273l0);
        }
    }

    public void setItemViewCacheSize(int i6) {
        this.f3252b.G(i6);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z5) {
        suppressLayout(z5);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.f3274m) {
            return;
        }
        t1();
        if (this.f3274m != null) {
            l lVar = this.L;
            if (lVar != null) {
                lVar.k();
            }
            this.f3274m.k1(this.f3252b);
            this.f3274m.l1(this.f3252b);
            this.f3252b.c();
            if (this.f3282q) {
                this.f3274m.A(this, this.f3252b);
            }
            this.f3274m.E1(null);
            this.f3274m = null;
        } else {
            this.f3252b.c();
        }
        this.f3258e.o();
        this.f3274m = oVar;
        if (oVar != null) {
            if (oVar.f3343b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f3343b.P());
            }
            oVar.E1(this);
            if (this.f3282q) {
                this.f3274m.z(this);
            }
        }
        this.f3252b.K();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z5) {
        getScrollingChildHelper().m(z5);
    }

    public void setOnFlingListener(q qVar) {
        this.U = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.f3265h0 = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z5) {
        this.f3255c0 = z5;
    }

    public void setRecycledViewPool(t tVar) {
        this.f3252b.E(tVar);
    }

    public void setRecyclerListener(v vVar) {
    }

    void setScrollState(int i6) {
        if (i6 == this.M) {
            return;
        }
        this.M = i6;
        if (i6 != 2) {
            u1();
        }
        H(i6);
    }

    public void setScrollingTouchSlop(int i6) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i6 != 0) {
            if (i6 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.T = scaledTouchSlop;
            } else {
                Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i6 + "; using default value");
            }
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.T = scaledTouchSlop;
    }

    public void setViewCacheExtension(a0 a0Var) {
        this.f3252b.F(a0Var);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i6) {
        return getScrollingChildHelper().o(i6);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().q();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z5) {
        if (z5 != this.f3294w) {
            o("Do not suppressLayout in layout or scroll");
            if (z5) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.f3294w = true;
                this.f3295x = true;
                t1();
                return;
            }
            this.f3294w = false;
            if (this.f3292v && this.f3274m != null && this.f3272l != null) {
                requestLayout();
            }
            this.f3292v = false;
        }
    }

    void t(int i6, int i7) {
        boolean z5;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect == null || edgeEffect.isFinished() || i6 <= 0) {
            z5 = false;
        } else {
            this.H.onRelease();
            z5 = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i6 < 0) {
            this.J.onRelease();
            z5 |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i7 > 0) {
            this.I.onRelease();
            z5 |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i7 < 0) {
            this.K.onRelease();
            z5 |= this.K.isFinished();
        }
        if (z5) {
            b1.h0(this);
        }
    }

    public boolean t0() {
        return this.E > 0;
    }

    public void t1() {
        setScrollState(0);
        u1();
    }

    void u() {
        if (!this.f3288t || this.C) {
            androidx.core.os.t.a("RV FullInvalidate");
            B();
            androidx.core.os.t.b();
            return;
        }
        if (this.f3256d.p()) {
            if (this.f3256d.o(4) && !this.f3256d.o(11)) {
                androidx.core.os.t.a("RV PartialInvalidate");
                p1();
                F0();
                this.f3256d.s();
                if (!this.f3292v) {
                    if (m0()) {
                        B();
                    } else {
                        this.f3256d.i();
                    }
                }
                r1(true);
                G0();
            } else {
                if (!this.f3256d.p()) {
                    return;
                }
                androidx.core.os.t.a("RV FullInvalidate");
                B();
            }
            androidx.core.os.t.b();
        }
    }

    void v0(int i6) {
        if (this.f3274m == null) {
            return;
        }
        setScrollState(2);
        this.f3274m.x1(i6);
        awakenScrollBars();
    }

    void v1(int i6, int i7, Object obj) {
        int i8;
        int j6 = this.f3258e.j();
        int i9 = i6 + i7;
        for (int i10 = 0; i10 < j6; i10++) {
            View i11 = this.f3258e.i(i10);
            c0 f02 = f0(i11);
            if (f02 != null && !f02.J() && (i8 = f02.f3310c) >= i6 && i8 < i9) {
                f02.b(2);
                f02.a(obj);
                ((p) i11.getLayoutParams()).f3368c = true;
            }
        }
        this.f3252b.M(i6, i7);
    }

    void w(int i6, int i7) {
        setMeasuredDimension(o.n(i6, getPaddingLeft() + getPaddingRight(), b1.G(this)), o.n(i7, getPaddingTop() + getPaddingBottom(), b1.F(this)));
    }

    void w0() {
        int j6 = this.f3258e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            ((p) this.f3258e.i(i6).getLayoutParams()).f3368c = true;
        }
        this.f3252b.s();
    }

    void x0() {
        int j6 = this.f3258e.j();
        for (int i6 = 0; i6 < j6; i6++) {
            c0 f02 = f0(this.f3258e.i(i6));
            if (f02 != null && !f02.J()) {
                f02.b(6);
            }
        }
        w0();
        this.f3252b.t();
    }

    void y(View view) {
        int size;
        c0 f02 = f0(view);
        D0(view);
        g gVar = this.f3272l;
        if (gVar != null && f02 != null) {
            gVar.n(f02);
        }
        if (this.B == null || r2.size() - 1 < 0) {
            return;
        }
        f0.a(this.B.get(size));
        throw null;
    }

    public void y0(int i6) {
        int g6 = this.f3258e.g();
        for (int i7 = 0; i7 < g6; i7++) {
            this.f3258e.f(i7).offsetLeftAndRight(i6);
        }
    }

    void z(View view) {
        int size;
        c0 f02 = f0(view);
        E0(view);
        g gVar = this.f3272l;
        if (gVar != null && f02 != null) {
            gVar.o(f02);
        }
        if (this.B == null || r2.size() - 1 < 0) {
            return;
        }
        f0.a(this.B.get(size));
        throw null;
    }

    public void z0(int i6) {
        int g6 = this.f3258e.g();
        for (int i7 = 0; i7 < g6; i7++) {
            this.f3258e.f(i7).offsetTopAndBottom(i6);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        this.f3250a = new w();
        this.f3252b = new u();
        this.f3260f = new androidx.recyclerview.widget.p();
        this.f3264h = new a();
        this.f3266i = new Rect();
        this.f3268j = new Rect();
        this.f3270k = new RectF();
        this.f3276n = new ArrayList();
        this.f3278o = new ArrayList();
        this.f3290u = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = new k();
        this.L = new androidx.recyclerview.widget.c();
        this.M = 0;
        this.N = -1;
        this.f3251a0 = Float.MIN_VALUE;
        this.f3253b0 = Float.MIN_VALUE;
        this.f3255c0 = true;
        this.f3257d0 = new b0();
        this.f3261f0 = A0 ? new e.b() : null;
        this.f3263g0 = new z();
        this.f3269j0 = false;
        this.f3271k0 = false;
        this.f3273l0 = new m();
        this.f3275m0 = false;
        this.f3279o0 = new int[2];
        this.f3283q0 = new int[2];
        this.f3285r0 = new int[2];
        this.f3287s0 = new int[2];
        this.f3289t0 = new ArrayList();
        this.f3291u0 = new b();
        this.f3293v0 = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.T = viewConfiguration.getScaledTouchSlop();
        this.f3251a0 = q2.b(viewConfiguration, context);
        this.f3253b0 = q2.d(viewConfiguration, context);
        this.V = viewConfiguration.getScaledMinimumFlingVelocity();
        this.W = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.L.v(this.f3273l0);
        n0();
        p0();
        o0();
        if (b1.C(this) == 0) {
            b1.A0(this, 1);
        }
        this.A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.k(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.c.f6649f, i6, 0);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            saveAttributeDataForStyleable(context, g0.c.f6649f, attributeSet, obtainStyledAttributes, i6, 0);
        }
        String string = obtainStyledAttributes.getString(g0.c.f6658o);
        if (obtainStyledAttributes.getInt(g0.c.f6652i, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f3262g = obtainStyledAttributes.getBoolean(g0.c.f6651h, true);
        boolean z5 = obtainStyledAttributes.getBoolean(g0.c.f6653j, false);
        this.f3286s = z5;
        if (z5) {
            q0((StateListDrawable) obtainStyledAttributes.getDrawable(g0.c.f6656m), obtainStyledAttributes.getDrawable(g0.c.f6657n), (StateListDrawable) obtainStyledAttributes.getDrawable(g0.c.f6654k), obtainStyledAttributes.getDrawable(g0.c.f6655l));
        }
        obtainStyledAttributes.recycle();
        v(context, string, attributeSet, i6, 0);
        int[] iArr = f3246w0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i6, 0);
        if (i7 >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes2, i6, 0);
        }
        boolean z6 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z6);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.f3274m;
        if (oVar != null) {
            return oVar.F(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + P());
    }
}
