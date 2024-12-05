package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.accessibility.g0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    boolean I;
    int J;
    int[] K;
    View[] L;
    final SparseIntArray M;
    final SparseIntArray N;
    c O;
    final Rect P;
    private boolean Q;

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i6, int i7) {
            return i6 % i7;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i6) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {

        /* renamed from: e, reason: collision with root package name */
        int f3207e;

        /* renamed from: f, reason: collision with root package name */
        int f3208f;

        public b(int i6, int i7) {
            super(i6, i7);
            this.f3207e = -1;
            this.f3208f = 0;
        }

        public int e() {
            return this.f3207e;
        }

        public int f() {
            return this.f3208f;
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f3207e = -1;
            this.f3208f = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f3207e = -1;
            this.f3208f = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f3207e = -1;
            this.f3208f = 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        final SparseIntArray f3209a = new SparseIntArray();

        /* renamed from: b, reason: collision with root package name */
        final SparseIntArray f3210b = new SparseIntArray();

        /* renamed from: c, reason: collision with root package name */
        private boolean f3211c = false;

        /* renamed from: d, reason: collision with root package name */
        private boolean f3212d = false;

        static int a(SparseIntArray sparseIntArray, int i6) {
            int size = sparseIntArray.size() - 1;
            int i7 = 0;
            while (i7 <= size) {
                int i8 = (i7 + size) >>> 1;
                if (sparseIntArray.keyAt(i8) < i6) {
                    i7 = i8 + 1;
                } else {
                    size = i8 - 1;
                }
            }
            int i9 = i7 - 1;
            if (i9 < 0 || i9 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i9);
        }

        int b(int i6, int i7) {
            if (!this.f3212d) {
                return d(i6, i7);
            }
            int i8 = this.f3210b.get(i6, -1);
            if (i8 != -1) {
                return i8;
            }
            int d6 = d(i6, i7);
            this.f3210b.put(i6, d6);
            return d6;
        }

        int c(int i6, int i7) {
            if (!this.f3211c) {
                return e(i6, i7);
            }
            int i8 = this.f3209a.get(i6, -1);
            if (i8 != -1) {
                return i8;
            }
            int e6 = e(i6, i7);
            this.f3209a.put(i6, e6);
            return e6;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f3212d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f3210b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f3210b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i6, int i7);

        public abstract int f(int i6);

        public void g() {
            this.f3210b.clear();
        }

        public void h() {
            this.f3209a.clear();
        }
    }

    public GridLayoutManager(Context context, int i6, int i7, boolean z5) {
        super(context, i7, z5);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        d3(i6);
    }

    private void N2(RecyclerView.u uVar, RecyclerView.z zVar, int i6, boolean z5) {
        int i7;
        int i8;
        int i9;
        int i10 = 0;
        if (z5) {
            i8 = i6;
            i7 = 0;
            i9 = 1;
        } else {
            i7 = i6 - 1;
            i8 = -1;
            i9 = -1;
        }
        while (i7 != i8) {
            View view = this.L[i7];
            b bVar = (b) view.getLayoutParams();
            int Z2 = Z2(uVar, zVar, h0(view));
            bVar.f3208f = Z2;
            bVar.f3207e = i10;
            i10 += Z2;
            i7 += i9;
        }
    }

    private void O2() {
        int J = J();
        for (int i6 = 0; i6 < J; i6++) {
            b bVar = (b) I(i6).getLayoutParams();
            int a6 = bVar.a();
            this.M.put(a6, bVar.f());
            this.N.put(a6, bVar.e());
        }
    }

    private void P2(int i6) {
        this.K = Q2(this.K, this.J, i6);
    }

    static int[] Q2(int[] iArr, int i6, int i7) {
        int i8;
        if (iArr == null || iArr.length != i6 + 1 || iArr[iArr.length - 1] != i7) {
            iArr = new int[i6 + 1];
        }
        int i9 = 0;
        iArr[0] = 0;
        int i10 = i7 / i6;
        int i11 = i7 % i6;
        int i12 = 0;
        for (int i13 = 1; i13 <= i6; i13++) {
            i9 += i11;
            if (i9 <= 0 || i6 - i9 >= i11) {
                i8 = i10;
            } else {
                i8 = i10 + 1;
                i9 -= i6;
            }
            i12 += i8;
            iArr[i13] = i12;
        }
        return iArr;
    }

    private void R2() {
        this.M.clear();
        this.N.clear();
    }

    private int S2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            boolean r22 = r2();
            View Y1 = Y1(!r22, true);
            View X1 = X1(!r22, true);
            if (Y1 != null && X1 != null) {
                int b6 = this.O.b(h0(Y1), this.J);
                int b7 = this.O.b(h0(X1), this.J);
                int max = this.f3218x ? Math.max(0, ((this.O.b(zVar.b() - 1, this.J) + 1) - Math.max(b6, b7)) - 1) : Math.max(0, Math.min(b6, b7));
                if (r22) {
                    return Math.round((max * (Math.abs(this.f3215u.d(X1) - this.f3215u.g(Y1)) / ((this.O.b(h0(X1), this.J) - this.O.b(h0(Y1), this.J)) + 1))) + (this.f3215u.m() - this.f3215u.g(Y1)));
                }
                return max;
            }
        }
        return 0;
    }

    private int T2(RecyclerView.z zVar) {
        if (J() != 0 && zVar.b() != 0) {
            T1();
            View Y1 = Y1(!r2(), true);
            View X1 = X1(!r2(), true);
            if (Y1 != null && X1 != null) {
                if (!r2()) {
                    return this.O.b(zVar.b() - 1, this.J) + 1;
                }
                int d6 = this.f3215u.d(X1) - this.f3215u.g(Y1);
                int b6 = this.O.b(h0(Y1), this.J);
                return (int) ((d6 / ((this.O.b(h0(X1), this.J) - b6) + 1)) * (this.O.b(zVar.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void U2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i6) {
        boolean z5 = i6 == 1;
        int Y2 = Y2(uVar, zVar, aVar.f3222b);
        if (z5) {
            while (Y2 > 0) {
                int i7 = aVar.f3222b;
                if (i7 <= 0) {
                    return;
                }
                int i8 = i7 - 1;
                aVar.f3222b = i8;
                Y2 = Y2(uVar, zVar, i8);
            }
            return;
        }
        int b6 = zVar.b() - 1;
        int i9 = aVar.f3222b;
        while (i9 < b6) {
            int i10 = i9 + 1;
            int Y22 = Y2(uVar, zVar, i10);
            if (Y22 <= Y2) {
                break;
            }
            i9 = i10;
            Y2 = Y22;
        }
        aVar.f3222b = i9;
    }

    private void V2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int X2(RecyclerView.u uVar, RecyclerView.z zVar, int i6) {
        if (!zVar.e()) {
            return this.O.b(i6, this.J);
        }
        int f6 = uVar.f(i6);
        if (f6 != -1) {
            return this.O.b(f6, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i6);
        return 0;
    }

    private int Y2(RecyclerView.u uVar, RecyclerView.z zVar, int i6) {
        if (!zVar.e()) {
            return this.O.c(i6, this.J);
        }
        int i7 = this.N.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        int f6 = uVar.f(i6);
        if (f6 != -1) {
            return this.O.c(f6, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 0;
    }

    private int Z2(RecyclerView.u uVar, RecyclerView.z zVar, int i6) {
        if (!zVar.e()) {
            return this.O.f(i6);
        }
        int i7 = this.M.get(i6, -1);
        if (i7 != -1) {
            return i7;
        }
        int f6 = uVar.f(i6);
        if (f6 != -1) {
            return this.O.f(f6);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i6);
        return 1;
    }

    private void a3(float f6, int i6) {
        P2(Math.max(Math.round(f6 * this.J), i6));
    }

    private void b3(View view, int i6, boolean z5) {
        int i7;
        int i8;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f3367b;
        int i9 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i10 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int W2 = W2(bVar.f3207e, bVar.f3208f);
        if (this.f3213s == 1) {
            i8 = RecyclerView.o.K(W2, i6, i10, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i7 = RecyclerView.o.K(this.f3215u.n(), X(), i9, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int K = RecyclerView.o.K(W2, i6, i9, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int K2 = RecyclerView.o.K(this.f3215u.n(), p0(), i10, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i7 = K;
            i8 = K2;
        }
        c3(view, i8, i7, z5);
    }

    private void c3(View view, int i6, int i7, boolean z5) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z5 ? H1(view, i6, i7, pVar) : F1(view, i6, i7, pVar)) {
            view.measure(i6, i7);
        }
    }

    private void e3() {
        int W;
        int g02;
        if (p2() == 1) {
            W = o0() - f0();
            g02 = e0();
        } else {
            W = W() - d0();
            g02 = g0();
        }
        P2(W - g02);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i6, int i7) {
        int n6;
        int n7;
        if (this.K == null) {
            super.C1(rect, i6, i7);
        }
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f3213s == 1) {
            n7 = RecyclerView.o.n(i7, rect.height() + g02, b0());
            int[] iArr = this.K;
            n6 = RecyclerView.o.n(i6, iArr[iArr.length - 1] + e02, c0());
        } else {
            n6 = RecyclerView.o.n(i6, rect.width() + e02, c0());
            int[] iArr2 = this.K;
            n7 = RecyclerView.o.n(i7, iArr2[iArr2.length - 1] + g02, b0());
        }
        B1(n6, n7);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f3213s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void E2(boolean z5) {
        if (z5) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.E2(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        if (r13 == (r2 > r15)) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00f6, code lost:
    
        if (r13 == (r2 > r7)) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View J0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.u r26, androidx.recyclerview.widget.RecyclerView.z r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.J0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f3213s == 1) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return X2(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void N1(RecyclerView.z zVar, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i6 = this.J;
        for (int i7 = 0; i7 < this.J && cVar.c(zVar) && i6 > 0; i7++) {
            int i8 = cVar.f3233d;
            cVar2.a(i8, Math.max(0, cVar.f3236g));
            i6 -= this.O.f(i8);
            cVar.f3233d += cVar.f3234e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.u uVar, RecyclerView.z zVar, View view, g0 g0Var) {
        int i6;
        int e6;
        int f6;
        boolean z5;
        boolean z6;
        int i7;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.O0(view, g0Var);
            return;
        }
        b bVar = (b) layoutParams;
        int X2 = X2(uVar, zVar, bVar.a());
        if (this.f3213s == 0) {
            i7 = bVar.e();
            i6 = bVar.f();
            f6 = 1;
            z5 = false;
            z6 = false;
            e6 = X2;
        } else {
            i6 = 1;
            e6 = bVar.e();
            f6 = bVar.f();
            z5 = false;
            z6 = false;
            i7 = X2;
        }
        g0Var.a0(g0.d.a(i7, i6, e6, f6, z5, z6));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i6, int i7) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i6, int i7, int i8) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i6, int i7) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i6, int i7, Object obj) {
        this.O.h();
        this.O.g();
    }

    int W2(int i6, int i7) {
        if (this.f3213s != 1 || !q2()) {
            int[] iArr = this.K;
            return iArr[i7 + i6] - iArr[i6];
        }
        int[] iArr2 = this.K;
        int i8 = this.J;
        return iArr2[i8 - i6] - iArr2[(i8 - i6) - i7];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (zVar.e()) {
            O2();
        }
        super.X0(uVar, zVar);
        R2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.z zVar) {
        super.Y0(zVar);
        this.I = false;
    }

    public void d3(int i6) {
        if (i6 == this.J) {
            return;
        }
        this.I = true;
        if (i6 >= 1) {
            this.J = i6;
            this.O.h();
            t1();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i6);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    View h2(RecyclerView.u uVar, RecyclerView.z zVar, int i6, int i7, int i8) {
        T1();
        int m6 = this.f3215u.m();
        int i9 = this.f3215u.i();
        int i10 = i7 > i6 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i6 != i7) {
            View I = I(i6);
            int h02 = h0(I);
            if (h02 >= 0 && h02 < i8 && Y2(uVar, zVar, h02) == 0) {
                if (((RecyclerView.p) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else {
                    if (this.f3215u.g(I) < i9 && this.f3215u.d(I) >= m6) {
                        return I;
                    }
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i6 += i10;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.u uVar, RecyclerView.z zVar) {
        if (this.f3213s == 0) {
            return this.J;
        }
        if (zVar.b() < 1) {
            return 0;
        }
        return X2(uVar, zVar, zVar.b() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.z zVar) {
        return this.Q ? S2(zVar) : super.r(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.z zVar) {
        return this.Q ? T2(zVar) : super.s(zVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x009f, code lost:
    
        r21.f3227b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
    
        return;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void s2(androidx.recyclerview.widget.RecyclerView.u r18, androidx.recyclerview.widget.RecyclerView.z r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.s2(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$z, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.z zVar) {
        return this.Q ? S2(zVar) : super.u(zVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void u2(RecyclerView.u uVar, RecyclerView.z zVar, LinearLayoutManager.a aVar, int i6) {
        super.u2(uVar, zVar, aVar, i6);
        e3();
        if (zVar.b() > 0 && !zVar.e()) {
            U2(uVar, zVar, aVar, i6);
        }
        V2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.z zVar) {
        return this.Q ? T2(zVar) : super.v(zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        e3();
        V2();
        return super.w1(i6, uVar, zVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i6, RecyclerView.u uVar, RecyclerView.z zVar) {
        e3();
        V2();
        return super.y1(i6, uVar, zVar);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        this.I = false;
        this.J = -1;
        this.M = new SparseIntArray();
        this.N = new SparseIntArray();
        this.O = new a();
        this.P = new Rect();
        d3(RecyclerView.o.i0(context, attributeSet, i6, i7).f3363b);
    }
}
