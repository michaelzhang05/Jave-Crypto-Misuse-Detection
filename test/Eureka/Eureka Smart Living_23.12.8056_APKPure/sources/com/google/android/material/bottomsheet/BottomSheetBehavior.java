package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.g0;
import androidx.core.view.accessibility.j0;
import androidx.core.view.b1;
import c3.k;
import com.google.android.material.internal.n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import m2.i;
import m2.j;
import y.c;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.b {

    /* renamed from: h0, reason: collision with root package name */
    private static final int f4721h0 = i.f7687d;
    private boolean A;
    private final h B;
    private ValueAnimator C;
    int D;
    int E;
    int F;
    float G;
    int H;
    float I;
    boolean J;
    private boolean K;
    private boolean L;
    int M;
    int N;
    y.c O;
    private boolean P;
    private int Q;
    private boolean R;
    private float S;
    private int T;
    int U;
    int V;
    WeakReference W;
    WeakReference X;
    WeakReference Y;
    private final ArrayList Z;

    /* renamed from: a, reason: collision with root package name */
    private int f4722a;

    /* renamed from: a0, reason: collision with root package name */
    private VelocityTracker f4723a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4724b;

    /* renamed from: b0, reason: collision with root package name */
    int f4725b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f4726c;

    /* renamed from: c0, reason: collision with root package name */
    private int f4727c0;

    /* renamed from: d, reason: collision with root package name */
    private float f4728d;

    /* renamed from: d0, reason: collision with root package name */
    boolean f4729d0;

    /* renamed from: e, reason: collision with root package name */
    private int f4730e;

    /* renamed from: e0, reason: collision with root package name */
    private Map f4731e0;

    /* renamed from: f, reason: collision with root package name */
    private int f4732f;

    /* renamed from: f0, reason: collision with root package name */
    final SparseIntArray f4733f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f4734g;

    /* renamed from: g0, reason: collision with root package name */
    private final c.AbstractC0151c f4735g0;

    /* renamed from: h, reason: collision with root package name */
    private int f4736h;

    /* renamed from: i, reason: collision with root package name */
    private int f4737i;

    /* renamed from: j, reason: collision with root package name */
    private c3.g f4738j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f4739k;

    /* renamed from: l, reason: collision with root package name */
    private int f4740l;

    /* renamed from: m, reason: collision with root package name */
    private int f4741m;

    /* renamed from: n, reason: collision with root package name */
    private int f4742n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f4743o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f4744p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4745q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f4746r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4747s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f4748t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f4749u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f4750v;

    /* renamed from: w, reason: collision with root package name */
    private int f4751w;

    /* renamed from: x, reason: collision with root package name */
    private int f4752x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4753y;

    /* renamed from: z, reason: collision with root package name */
    private k f4754z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4755a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f4756b;

        a(View view, int i6) {
            this.f4755a = view;
            this.f4756b = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.X0(this.f4755a, this.f4756b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f4738j != null) {
                BottomSheetBehavior.this.f4738j.S(floatValue);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements n.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f4759a;

        c(boolean z5) {
            this.f4759a = z5;
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00c3  */
        @Override // com.google.android.material.internal.n.d
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.core.view.c3 a(android.view.View r11, androidx.core.view.c3 r12, com.google.android.material.internal.n.e r13) {
            /*
                r10 = this;
                int r0 = androidx.core.view.c3.m.d()
                androidx.core.graphics.g r0 = r12.f(r0)
                int r1 = androidx.core.view.c3.m.b()
                androidx.core.graphics.g r1 = r12.f(r1)
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r3 = r0.f2111b
                com.google.android.material.bottomsheet.BottomSheetBehavior.P(r2, r3)
                boolean r2 = com.google.android.material.internal.n.e(r11)
                int r3 = r11.getPaddingBottom()
                int r4 = r11.getPaddingLeft()
                int r5 = r11.getPaddingRight()
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r6)
                if (r6 == 0) goto L41
                com.google.android.material.bottomsheet.BottomSheetBehavior r3 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = r12.h()
                com.google.android.material.bottomsheet.BottomSheetBehavior.S(r3, r6)
                int r3 = r13.f5130d
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.R(r6)
                int r3 = r3 + r6
            L41:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.T(r6)
                if (r6 == 0) goto L53
                if (r2 == 0) goto L4e
                int r4 = r13.f5129c
                goto L50
            L4e:
                int r4 = r13.f5127a
            L50:
                int r6 = r0.f2110a
                int r4 = r4 + r6
            L53:
                com.google.android.material.bottomsheet.BottomSheetBehavior r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = com.google.android.material.bottomsheet.BottomSheetBehavior.U(r6)
                if (r6 == 0) goto L66
                if (r2 == 0) goto L60
                int r13 = r13.f5127a
                goto L62
            L60:
                int r13 = r13.f5129c
            L62:
                int r2 = r0.f2112c
                int r5 = r13 + r2
            L66:
                android.view.ViewGroup$LayoutParams r13 = r11.getLayoutParams()
                android.view.ViewGroup$MarginLayoutParams r13 = (android.view.ViewGroup.MarginLayoutParams) r13
                com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.V(r2)
                r6 = 0
                r7 = 1
                if (r2 == 0) goto L80
                int r2 = r13.leftMargin
                int r8 = r0.f2110a
                if (r2 == r8) goto L80
                r13.leftMargin = r8
                r2 = 1
                goto L81
            L80:
                r2 = 0
            L81:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.W(r8)
                if (r8 == 0) goto L92
                int r8 = r13.rightMargin
                int r9 = r0.f2112c
                if (r8 == r9) goto L92
                r13.rightMargin = r9
                r2 = 1
            L92:
                com.google.android.material.bottomsheet.BottomSheetBehavior r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r8 = com.google.android.material.bottomsheet.BottomSheetBehavior.F(r8)
                if (r8 == 0) goto La3
                int r8 = r13.topMargin
                int r0 = r0.f2111b
                if (r8 == r0) goto La3
                r13.topMargin = r0
                goto La4
            La3:
                r7 = r2
            La4:
                if (r7 == 0) goto La9
                r11.setLayoutParams(r13)
            La9:
                int r13 = r11.getPaddingTop()
                r11.setPadding(r4, r13, r5, r3)
                boolean r11 = r10.f4759a
                if (r11 == 0) goto Lbb
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r13 = r1.f2113d
                com.google.android.material.bottomsheet.BottomSheetBehavior.G(r11, r13)
            Lbb:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.Q(r11)
                if (r11 != 0) goto Lc7
                boolean r11 = r10.f4759a
                if (r11 == 0) goto Lcc
            Lc7:
                com.google.android.material.bottomsheet.BottomSheetBehavior r11 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                com.google.android.material.bottomsheet.BottomSheetBehavior.H(r11, r6)
            Lcc:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.c.a(android.view.View, androidx.core.view.c3, com.google.android.material.internal.n$e):androidx.core.view.c3");
        }
    }

    /* loaded from: classes.dex */
    class d extends c.AbstractC0151c {

        /* renamed from: a, reason: collision with root package name */
        private long f4761a;

        d() {
        }

        private boolean n(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.V + bottomSheetBehavior.m0()) / 2;
        }

        @Override // y.c.AbstractC0151c
        public int a(View view, int i6, int i7) {
            return view.getLeft();
        }

        @Override // y.c.AbstractC0151c
        public int b(View view, int i6, int i7) {
            return u.a.b(i6, BottomSheetBehavior.this.m0(), e(view));
        }

        @Override // y.c.AbstractC0151c
        public int e(View view) {
            return BottomSheetBehavior.this.d0() ? BottomSheetBehavior.this.V : BottomSheetBehavior.this.H;
        }

        @Override // y.c.AbstractC0151c
        public void j(int i6) {
            if (i6 == 1 && BottomSheetBehavior.this.L) {
                BottomSheetBehavior.this.Q0(1);
            }
        }

        @Override // y.c.AbstractC0151c
        public void k(View view, int i6, int i7, int i8, int i9) {
            BottomSheetBehavior.this.i0(i7);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
        
            if (r7.f4762b.S0(r3, (r9 * 100.0f) / r10.V) != false) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
        
            if (r9 > r7.f4762b.F) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        
            if (java.lang.Math.abs(r8.getTop() - r7.f4762b.m0()) < java.lang.Math.abs(r8.getTop() - r7.f4762b.F)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d0, code lost:
        
            if (r7.f4762b.V0() == false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
        
            if (java.lang.Math.abs(r9 - r7.f4762b.E) < java.lang.Math.abs(r9 - r7.f4762b.H)) goto L6;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x010e, code lost:
        
            if (r7.f4762b.V0() != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0128, code lost:
        
            if (r7.f4762b.V0() == false) goto L63;
         */
        @Override // y.c.AbstractC0151c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r8, float r9, float r10) {
            /*
                Method dump skipped, instructions count: 309
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.d.l(android.view.View, float, float):void");
        }

        @Override // y.c.AbstractC0151c
        public boolean m(View view, int i6) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i7 = bottomSheetBehavior.M;
            if (i7 == 1 || bottomSheetBehavior.f4729d0) {
                return false;
            }
            if (i7 == 3 && bottomSheetBehavior.f4725b0 == i6) {
                WeakReference weakReference = bottomSheetBehavior.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f4761a = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.W;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements j0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4763a;

        e(int i6) {
            this.f4763a = i6;
        }

        @Override // androidx.core.view.accessibility.j0
        public boolean a(View view, j0.a aVar) {
            BottomSheetBehavior.this.P0(this.f4763a);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class f {
        void a(View view) {
        }

        public abstract void b(View view, float f6);

        public abstract void c(View view, int i6);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static class g extends x.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: c, reason: collision with root package name */
        final int f4765c;

        /* renamed from: d, reason: collision with root package name */
        int f4766d;

        /* renamed from: e, reason: collision with root package name */
        boolean f4767e;

        /* renamed from: f, reason: collision with root package name */
        boolean f4768f;

        /* renamed from: g, reason: collision with root package name */
        boolean f4769g;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i6) {
                return new g[i6];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4765c = parcel.readInt();
            this.f4766d = parcel.readInt();
            this.f4767e = parcel.readInt() == 1;
            this.f4768f = parcel.readInt() == 1;
            this.f4769g = parcel.readInt() == 1;
        }

        @Override // x.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i6) {
            super.writeToParcel(parcel, i6);
            parcel.writeInt(this.f4765c);
            parcel.writeInt(this.f4766d);
            parcel.writeInt(this.f4767e ? 1 : 0);
            parcel.writeInt(this.f4768f ? 1 : 0);
            parcel.writeInt(this.f4769g ? 1 : 0);
        }

        public g(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f4765c = bottomSheetBehavior.M;
            this.f4766d = bottomSheetBehavior.f4732f;
            this.f4767e = bottomSheetBehavior.f4724b;
            this.f4768f = bottomSheetBehavior.J;
            this.f4769g = bottomSheetBehavior.K;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class h {

        /* renamed from: a, reason: collision with root package name */
        private int f4770a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f4771b;

        /* renamed from: c, reason: collision with root package name */
        private final Runnable f4772c;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.f4771b = false;
                y.c cVar = BottomSheetBehavior.this.O;
                if (cVar != null && cVar.k(true)) {
                    h hVar = h.this;
                    hVar.c(hVar.f4770a);
                    return;
                }
                h hVar2 = h.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.M == 2) {
                    bottomSheetBehavior.Q0(hVar2.f4770a);
                }
            }
        }

        private h() {
            this.f4772c = new a();
        }

        void c(int i6) {
            WeakReference weakReference = BottomSheetBehavior.this.W;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f4770a = i6;
            if (this.f4771b) {
                return;
            }
            b1.i0((View) BottomSheetBehavior.this.W.get(), this.f4772c);
            this.f4771b = true;
        }

        /* synthetic */ h(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior() {
        this.f4722a = 0;
        this.f4724b = true;
        this.f4726c = false;
        this.f4740l = -1;
        this.f4741m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.f4733f0 = new SparseIntArray();
        this.f4735g0 = new d();
    }

    private void A0(g gVar) {
        int i6 = this.f4722a;
        if (i6 == 0) {
            return;
        }
        if (i6 == -1 || (i6 & 1) == 1) {
            this.f4732f = gVar.f4766d;
        }
        if (i6 == -1 || (i6 & 2) == 2) {
            this.f4724b = gVar.f4767e;
        }
        if (i6 == -1 || (i6 & 4) == 4) {
            this.J = gVar.f4768f;
        }
        if (i6 == -1 || (i6 & 8) == 8) {
            this.K = gVar.f4769g;
        }
    }

    private void B0(View view, Runnable runnable) {
        if (v0(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private void R0(View view) {
        boolean z5 = (Build.VERSION.SDK_INT < 29 || s0() || this.f4734g) ? false : true;
        if (this.f4744p || this.f4745q || this.f4746r || this.f4748t || this.f4749u || this.f4750v || z5) {
            n.a(view, new c(z5));
        }
    }

    private boolean T0() {
        return this.O != null && (this.L || this.M == 1);
    }

    private int X(View view, int i6, int i7) {
        return b1.c(view, view.getResources().getString(i6), f0(i7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(View view, int i6, boolean z5) {
        int p02 = p0(i6);
        y.c cVar = this.O;
        if (!(cVar != null && (!z5 ? !cVar.H(view, view.getLeft(), p02) : !cVar.F(view.getLeft(), p02)))) {
            Q0(i6);
            return;
        }
        Q0(2);
        a1(i6, true);
        this.B.c(i6);
    }

    private void Y0() {
        WeakReference weakReference = this.W;
        if (weakReference != null) {
            Z0((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.X;
        if (weakReference2 != null) {
            Z0((View) weakReference2.get(), 1);
        }
    }

    private void Z() {
        int b02 = b0();
        if (this.f4724b) {
            this.H = Math.max(this.V - b02, this.E);
        } else {
            this.H = this.V - b02;
        }
    }

    private void Z0(View view, int i6) {
        int i7;
        g0.a aVar;
        if (view == null) {
            return;
        }
        e0(view, i6);
        if (!this.f4724b && this.M != 6) {
            this.f4733f0.put(i6, X(view, m2.h.f7661a, 6));
        }
        if (this.J && u0() && this.M != 5) {
            y0(view, g0.a.f2300y, 5);
        }
        int i8 = this.M;
        if (i8 == 3) {
            i7 = this.f4724b ? 4 : 6;
            aVar = g0.a.f2299x;
        } else {
            if (i8 != 4) {
                if (i8 != 6) {
                    return;
                }
                y0(view, g0.a.f2299x, 4);
                y0(view, g0.a.f2298w, 3);
                return;
            }
            i7 = this.f4724b ? 3 : 6;
            aVar = g0.a.f2298w;
        }
        y0(view, aVar, i7);
    }

    private void a0() {
        this.F = (int) (this.V * (1.0f - this.G));
    }

    private void a1(int i6, boolean z5) {
        boolean r02;
        ValueAnimator valueAnimator;
        if (i6 == 2 || this.A == (r02 = r0()) || this.f4738j == null) {
            return;
        }
        this.A = r02;
        if (!z5 || (valueAnimator = this.C) == null) {
            ValueAnimator valueAnimator2 = this.C;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.C.cancel();
            }
            this.f4738j.S(this.A ? 0.0f : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.C.reverse();
            return;
        }
        float f6 = r02 ? 0.0f : 1.0f;
        this.C.setFloatValues(1.0f - f6, f6);
        this.C.start();
    }

    private int b0() {
        int i6;
        return this.f4734g ? Math.min(Math.max(this.f4736h, this.V - ((this.U * 9) / 16)), this.T) + this.f4751w : (this.f4743o || this.f4744p || (i6 = this.f4742n) <= 0) ? this.f4732f + this.f4751w : Math.max(this.f4732f, i6 + this.f4737i);
    }

    private void b1(boolean z5) {
        Map map;
        int intValue;
        WeakReference weakReference = this.W;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z5) {
                if (this.f4731e0 != null) {
                    return;
                } else {
                    this.f4731e0 = new HashMap(childCount);
                }
            }
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = coordinatorLayout.getChildAt(i6);
                if (childAt != this.W.get()) {
                    if (z5) {
                        this.f4731e0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f4726c) {
                            intValue = 4;
                            b1.A0(childAt, intValue);
                        }
                    } else if (this.f4726c && (map = this.f4731e0) != null && map.containsKey(childAt)) {
                        intValue = ((Integer) this.f4731e0.get(childAt)).intValue();
                        b1.A0(childAt, intValue);
                    }
                }
            }
            if (!z5) {
                this.f4731e0 = null;
            } else if (this.f4726c) {
                ((View) this.W.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private float c0(int i6) {
        float f6;
        float f7;
        int i7 = this.H;
        if (i6 > i7 || i7 == m0()) {
            int i8 = this.H;
            f6 = i8 - i6;
            f7 = this.V - i8;
        } else {
            int i9 = this.H;
            f6 = i9 - i6;
            f7 = i9 - m0();
        }
        return f6 / f7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(boolean z5) {
        View view;
        if (this.W != null) {
            Z();
            if (this.M != 4 || (view = (View) this.W.get()) == null) {
                return;
            }
            if (z5) {
                P0(4);
            } else {
                view.requestLayout();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean d0() {
        return t0() && u0();
    }

    private void e0(View view, int i6) {
        if (view == null) {
            return;
        }
        b1.k0(view, 524288);
        b1.k0(view, 262144);
        b1.k0(view, 1048576);
        int i7 = this.f4733f0.get(i6, -1);
        if (i7 != -1) {
            b1.k0(view, i7);
            this.f4733f0.delete(i6);
        }
    }

    private j0 f0(int i6) {
        return new e(i6);
    }

    private void g0(Context context) {
        if (this.f4754z == null) {
            return;
        }
        c3.g gVar = new c3.g(this.f4754z);
        this.f4738j = gVar;
        gVar.H(context);
        ColorStateList colorStateList = this.f4739k;
        if (colorStateList != null) {
            this.f4738j.R(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f4738j.setTint(typedValue.data);
    }

    private void h0() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.C = ofFloat;
        ofFloat.setDuration(500L);
        this.C.addUpdateListener(new b());
    }

    public static BottomSheetBehavior k0(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.e)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.b e6 = ((CoordinatorLayout.e) layoutParams).e();
        if (e6 instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) e6;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int l0(int i6, int i7, int i8, int i9) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i6, i7, i9);
        if (i8 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i8), 1073741824);
        }
        if (size != 0) {
            i8 = Math.min(size, i8);
        }
        return View.MeasureSpec.makeMeasureSpec(i8, Integer.MIN_VALUE);
    }

    private int p0(int i6) {
        if (i6 == 3) {
            return m0();
        }
        if (i6 == 4) {
            return this.H;
        }
        if (i6 == 5) {
            return this.V;
        }
        if (i6 == 6) {
            return this.F;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i6);
    }

    private float q0() {
        VelocityTracker velocityTracker = this.f4723a0;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f4728d);
        return this.f4723a0.getYVelocity(this.f4725b0);
    }

    private boolean r0() {
        return this.M == 3 && (this.f4753y || m0() == 0);
    }

    private boolean v0(View view) {
        ViewParent parent = view.getParent();
        return parent != null && parent.isLayoutRequested() && b1.T(view);
    }

    private void y0(View view, g0.a aVar, int i6) {
        b1.m0(view, aVar, null, f0(i6));
    }

    private void z0() {
        this.f4725b0 = -1;
        VelocityTracker velocityTracker = this.f4723a0;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4723a0 = null;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean A(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i6, int i7) {
        this.Q = 0;
        this.R = false;
        return (i6 & 2) != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        if (r4.getTop() <= r2.F) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0065, code lost:
    
        if (java.lang.Math.abs(r3 - r2.E) < java.lang.Math.abs(r3 - r2.H)) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        if (V0() != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008b, code lost:
    
        if (java.lang.Math.abs(r3 - r1) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
    
        if (java.lang.Math.abs(r3 - r2.F) < java.lang.Math.abs(r3 - r2.H)) goto L51;
     */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void C(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.View r5, int r6) {
        /*
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.m0()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.Q0(r0)
            return
        Lf:
            boolean r3 = r2.w0()
            if (r3 == 0) goto L24
            java.lang.ref.WeakReference r3 = r2.Y
            if (r3 == 0) goto L23
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto L23
            boolean r3 = r2.R
            if (r3 != 0) goto L24
        L23:
            return
        L24:
            int r3 = r2.Q
            r5 = 6
            if (r3 <= 0) goto L39
            boolean r3 = r2.f4724b
            if (r3 == 0) goto L2f
            goto Laa
        L2f:
            int r3 = r4.getTop()
            int r6 = r2.F
            if (r3 <= r6) goto Laa
            goto La9
        L39:
            boolean r3 = r2.J
            if (r3 == 0) goto L49
            float r3 = r2.q0()
            boolean r3 = r2.U0(r4, r3)
            if (r3 == 0) goto L49
            r0 = 5
            goto Laa
        L49:
            int r3 = r2.Q
            r6 = 4
            if (r3 != 0) goto L8e
            int r3 = r4.getTop()
            boolean r1 = r2.f4724b
            if (r1 == 0) goto L68
            int r5 = r2.E
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L92
            goto Laa
        L68:
            int r1 = r2.F
            if (r3 >= r1) goto L7e
            int r1 = r2.H
            int r1 = r3 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r3 >= r1) goto L77
            goto Laa
        L77:
            boolean r3 = r2.V0()
            if (r3 == 0) goto La9
            goto L92
        L7e:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
            goto La9
        L8e:
            boolean r3 = r2.f4724b
            if (r3 == 0) goto L94
        L92:
            r0 = 4
            goto Laa
        L94:
            int r3 = r4.getTop()
            int r0 = r2.F
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.H
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L92
        La9:
            r0 = 6
        Laa:
            r3 = 0
            r2.X0(r4, r0, r3)
            r2.R = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.C(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public void C0(boolean z5) {
        this.L = z5;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean D(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.M == 1 && actionMasked == 0) {
            return true;
        }
        if (T0()) {
            this.O.z(motionEvent);
        }
        if (actionMasked == 0) {
            z0();
        }
        if (this.f4723a0 == null) {
            this.f4723a0 = VelocityTracker.obtain();
        }
        this.f4723a0.addMovement(motionEvent);
        if (T0() && actionMasked == 2 && !this.P && Math.abs(this.f4727c0 - motionEvent.getY()) > this.O.u()) {
            this.O.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.P;
    }

    public void D0(int i6) {
        if (i6 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.D = i6;
        a1(this.M, true);
    }

    public void E0(boolean z5) {
        if (this.f4724b == z5) {
            return;
        }
        this.f4724b = z5;
        if (this.W != null) {
            Z();
        }
        Q0((this.f4724b && this.M == 6) ? 3 : this.M);
        a1(this.M, true);
        Y0();
    }

    public void F0(boolean z5) {
        this.f4743o = z5;
    }

    public void G0(float f6) {
        if (f6 <= 0.0f || f6 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.G = f6;
        if (this.W != null) {
            a0();
        }
    }

    public void H0(boolean z5) {
        if (this.J != z5) {
            this.J = z5;
            if (!z5 && this.M == 5) {
                P0(4);
            }
            Y0();
        }
    }

    public void I0(int i6) {
        this.f4741m = i6;
    }

    public void J0(int i6) {
        this.f4740l = i6;
    }

    public void K0(int i6) {
        L0(i6, false);
    }

    public final void L0(int i6, boolean z5) {
        boolean z6 = true;
        if (i6 == -1) {
            if (!this.f4734g) {
                this.f4734g = true;
            }
            z6 = false;
        } else {
            if (this.f4734g || this.f4732f != i6) {
                this.f4734g = false;
                this.f4732f = Math.max(0, i6);
            }
            z6 = false;
        }
        if (z6) {
            c1(z5);
        }
    }

    public void M0(int i6) {
        this.f4722a = i6;
    }

    public void N0(int i6) {
        this.f4730e = i6;
    }

    public void O0(boolean z5) {
        this.K = z5;
    }

    public void P0(int i6) {
        if (i6 == 1 || i6 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i6 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.J && i6 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i6);
            return;
        }
        int i7 = (i6 == 6 && this.f4724b && p0(i6) <= this.E) ? 3 : i6;
        WeakReference weakReference = this.W;
        if (weakReference == null || weakReference.get() == null) {
            Q0(i6);
        } else {
            View view = (View) this.W.get();
            B0(view, new a(view, i7));
        }
    }

    void Q0(int i6) {
        View view;
        if (this.M == i6) {
            return;
        }
        this.M = i6;
        if (i6 == 4 || i6 == 3 || i6 == 6 || (this.J && i6 == 5)) {
            this.N = i6;
        }
        WeakReference weakReference = this.W;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (i6 == 3) {
            b1(true);
        } else if (i6 == 6 || i6 == 5 || i6 == 4) {
            b1(false);
        }
        a1(i6, true);
        for (int i7 = 0; i7 < this.Z.size(); i7++) {
            ((f) this.Z.get(i7)).c(view, i6);
        }
        Y0();
    }

    public boolean S0(long j6, float f6) {
        return false;
    }

    boolean U0(View view, float f6) {
        if (this.K) {
            return true;
        }
        if (u0() && view.getTop() >= this.H) {
            return Math.abs((((float) view.getTop()) + (f6 * this.S)) - ((float) this.H)) / ((float) b0()) > 0.5f;
        }
        return false;
    }

    public boolean V0() {
        return false;
    }

    public boolean W0() {
        return true;
    }

    public void Y(f fVar) {
        if (this.Z.contains(fVar)) {
            return;
        }
        this.Z.add(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void g(CoordinatorLayout.e eVar) {
        super.g(eVar);
        this.W = null;
        this.O = null;
    }

    void i0(int i6) {
        View view = (View) this.W.get();
        if (view == null || this.Z.isEmpty()) {
            return;
        }
        float c02 = c0(i6);
        for (int i7 = 0; i7 < this.Z.size(); i7++) {
            ((f) this.Z.get(i7)).b(view, c02);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void j() {
        super.j();
        this.W = null;
        this.O = null;
    }

    View j0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (b1.V(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View j02 = j0(viewGroup.getChildAt(i6));
                if (j02 != null) {
                    return j02;
                }
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean k(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        y.c cVar;
        if (!view.isShown() || !this.L) {
            this.P = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z0();
        }
        if (this.f4723a0 == null) {
            this.f4723a0 = VelocityTracker.obtain();
        }
        this.f4723a0.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x5 = (int) motionEvent.getX();
            this.f4727c0 = (int) motionEvent.getY();
            if (this.M != 2) {
                WeakReference weakReference = this.Y;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && coordinatorLayout.A(view2, x5, this.f4727c0)) {
                    this.f4725b0 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.f4729d0 = true;
                }
            }
            this.P = this.f4725b0 == -1 && !coordinatorLayout.A(view, x5, this.f4727c0);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f4729d0 = false;
            this.f4725b0 = -1;
            if (this.P) {
                this.P = false;
                return false;
            }
        }
        if (!this.P && (cVar = this.O) != null && cVar.G(motionEvent)) {
            return true;
        }
        WeakReference weakReference2 = this.Y;
        View view3 = weakReference2 != null ? (View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.P || this.M == 1 || coordinatorLayout.A(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.O == null || Math.abs(((float) this.f4727c0) - motionEvent.getY()) <= ((float) this.O.u())) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6 A[LOOP:0: B:34:0x00de->B:36:0x00e6, LOOP_END] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, int r7) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.l(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, int):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i6, int i7, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(l0(i6, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i7, this.f4740l, marginLayoutParams.width), l0(i8, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, this.f4741m, marginLayoutParams.height));
        return true;
    }

    public int m0() {
        if (this.f4724b) {
            return this.E;
        }
        return Math.max(this.D, this.f4747s ? 0 : this.f4752x);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c3.g n0() {
        return this.f4738j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f6, float f7) {
        WeakReference weakReference;
        if (w0() && (weakReference = this.Y) != null && view2 == weakReference.get()) {
            return this.M != 3 || super.o(coordinatorLayout, view, view2, f6, f7);
        }
        return false;
    }

    public int o0() {
        return this.M;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void q(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int[] iArr, int i8) {
        int i9;
        if (i8 == 1) {
            return;
        }
        WeakReference weakReference = this.Y;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!w0() || view2 == view3) {
            int top = view.getTop();
            int i10 = top - i7;
            if (i7 > 0) {
                if (i10 < m0()) {
                    int m02 = top - m0();
                    iArr[1] = m02;
                    b1.b0(view, -m02);
                    i9 = 3;
                    Q0(i9);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i7;
                    b1.b0(view, -i7);
                    Q0(1);
                }
            } else if (i7 < 0 && !view2.canScrollVertically(-1)) {
                if (i10 > this.H && !d0()) {
                    int i11 = top - this.H;
                    iArr[1] = i11;
                    b1.b0(view, -i11);
                    i9 = 4;
                    Q0(i9);
                } else {
                    if (!this.L) {
                        return;
                    }
                    iArr[1] = i7;
                    b1.b0(view, -i7);
                    Q0(1);
                }
            }
            i0(view.getTop());
            this.Q = i7;
            this.R = true;
        }
    }

    public boolean s0() {
        return this.f4743o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void t(CoordinatorLayout coordinatorLayout, View view, View view2, int i6, int i7, int i8, int i9, int i10, int[] iArr) {
    }

    public boolean t0() {
        return this.J;
    }

    public boolean u0() {
        return true;
    }

    public boolean w0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void x(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        g gVar = (g) parcelable;
        super.x(coordinatorLayout, view, gVar.a());
        A0(gVar);
        int i6 = gVar.f4765c;
        if (i6 == 1 || i6 == 2) {
            i6 = 4;
        }
        this.M = i6;
        this.N = i6;
    }

    public void x0(f fVar) {
        this.Z.remove(fVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public Parcelable y(CoordinatorLayout coordinatorLayout, View view) {
        return new g(super.y(coordinatorLayout, view), this);
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i6;
        this.f4722a = 0;
        this.f4724b = true;
        this.f4726c = false;
        this.f4740l = -1;
        this.f4741m = -1;
        this.B = new h(this, null);
        this.G = 0.5f;
        this.I = -1.0f;
        this.L = true;
        this.M = 4;
        this.N = 4;
        this.S = 0.1f;
        this.Z = new ArrayList();
        this.f4733f0 = new SparseIntArray();
        this.f4735g0 = new d();
        this.f4737i = context.getResources().getDimensionPixelSize(m2.c.J);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f7855x);
        if (obtainStyledAttributes.hasValue(j.B)) {
            this.f4739k = z2.c.a(context, obtainStyledAttributes, j.B);
        }
        if (obtainStyledAttributes.hasValue(j.T)) {
            this.f4754z = k.e(context, attributeSet, m2.a.f7549c, f4721h0).m();
        }
        g0(context);
        h0();
        this.I = obtainStyledAttributes.getDimension(j.A, -1.0f);
        if (obtainStyledAttributes.hasValue(j.f7861y)) {
            J0(obtainStyledAttributes.getDimensionPixelSize(j.f7861y, -1));
        }
        if (obtainStyledAttributes.hasValue(j.f7867z)) {
            I0(obtainStyledAttributes.getDimensionPixelSize(j.f7867z, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(j.H);
        K0((peekValue == null || (i6 = peekValue.data) != -1) ? obtainStyledAttributes.getDimensionPixelSize(j.H, -1) : i6);
        H0(obtainStyledAttributes.getBoolean(j.G, false));
        F0(obtainStyledAttributes.getBoolean(j.L, false));
        E0(obtainStyledAttributes.getBoolean(j.E, true));
        O0(obtainStyledAttributes.getBoolean(j.K, false));
        C0(obtainStyledAttributes.getBoolean(j.C, true));
        M0(obtainStyledAttributes.getInt(j.I, 0));
        G0(obtainStyledAttributes.getFloat(j.F, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(j.D);
        D0((peekValue2 == null || peekValue2.type != 16) ? obtainStyledAttributes.getDimensionPixelOffset(j.D, 0) : peekValue2.data);
        N0(obtainStyledAttributes.getInt(j.J, 500));
        this.f4744p = obtainStyledAttributes.getBoolean(j.P, false);
        this.f4745q = obtainStyledAttributes.getBoolean(j.Q, false);
        this.f4746r = obtainStyledAttributes.getBoolean(j.R, false);
        this.f4747s = obtainStyledAttributes.getBoolean(j.S, true);
        this.f4748t = obtainStyledAttributes.getBoolean(j.M, false);
        this.f4749u = obtainStyledAttributes.getBoolean(j.N, false);
        this.f4750v = obtainStyledAttributes.getBoolean(j.O, false);
        this.f4753y = obtainStyledAttributes.getBoolean(j.U, true);
        obtainStyledAttributes.recycle();
        this.f4728d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
