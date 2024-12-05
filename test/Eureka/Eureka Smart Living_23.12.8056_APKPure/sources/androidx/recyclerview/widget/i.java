package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    protected final RecyclerView.o f3590a;

    /* renamed from: b, reason: collision with root package name */
    private int f3591b;

    /* renamed from: c, reason: collision with root package name */
    final Rect f3592c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends i {
        a(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3590a.T(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3590a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3590a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3590a.Q(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).leftMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3590a.o0();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3590a.o0() - this.f3590a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3590a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3590a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3590a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3590a.e0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3590a.o0() - this.f3590a.e0()) - this.f3590a.f0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3590a.n0(view, true, this.f3592c);
            return this.f3592c.right;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3590a.n0(view, true, this.f3592c);
            return this.f3592c.left;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i6) {
            this.f3590a.C0(i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends i {
        b(RecyclerView.o oVar) {
            super(oVar, null);
        }

        @Override // androidx.recyclerview.widget.i
        public int d(View view) {
            return this.f3590a.O(view) + ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int e(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3590a.R(view) + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int f(View view) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return this.f3590a.S(view) + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int g(View view) {
            return this.f3590a.U(view) - ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) view.getLayoutParams())).topMargin;
        }

        @Override // androidx.recyclerview.widget.i
        public int h() {
            return this.f3590a.W();
        }

        @Override // androidx.recyclerview.widget.i
        public int i() {
            return this.f3590a.W() - this.f3590a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int j() {
            return this.f3590a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int k() {
            return this.f3590a.X();
        }

        @Override // androidx.recyclerview.widget.i
        public int l() {
            return this.f3590a.p0();
        }

        @Override // androidx.recyclerview.widget.i
        public int m() {
            return this.f3590a.g0();
        }

        @Override // androidx.recyclerview.widget.i
        public int n() {
            return (this.f3590a.W() - this.f3590a.g0()) - this.f3590a.d0();
        }

        @Override // androidx.recyclerview.widget.i
        public int p(View view) {
            this.f3590a.n0(view, true, this.f3592c);
            return this.f3592c.bottom;
        }

        @Override // androidx.recyclerview.widget.i
        public int q(View view) {
            this.f3590a.n0(view, true, this.f3592c);
            return this.f3592c.top;
        }

        @Override // androidx.recyclerview.widget.i
        public void r(int i6) {
            this.f3590a.D0(i6);
        }
    }

    private i(RecyclerView.o oVar) {
        this.f3591b = Integer.MIN_VALUE;
        this.f3592c = new Rect();
        this.f3590a = oVar;
    }

    public static i a(RecyclerView.o oVar) {
        return new a(oVar);
    }

    public static i b(RecyclerView.o oVar, int i6) {
        if (i6 == 0) {
            return a(oVar);
        }
        if (i6 == 1) {
            return c(oVar);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public static i c(RecyclerView.o oVar) {
        return new b(oVar);
    }

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public int o() {
        if (Integer.MIN_VALUE == this.f3591b) {
            return 0;
        }
        return n() - this.f3591b;
    }

    public abstract int p(View view);

    public abstract int q(View view);

    public abstract void r(int i6);

    public void s() {
        this.f3591b = n();
    }

    /* synthetic */ i(RecyclerView.o oVar, a aVar) {
        this(oVar);
    }
}
