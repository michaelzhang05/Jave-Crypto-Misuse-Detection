package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public abstract class n extends RecyclerView.q {

    /* renamed from: a, reason: collision with root package name */
    RecyclerView f3601a;

    /* renamed from: b, reason: collision with root package name */
    private Scroller f3602b;

    /* renamed from: c, reason: collision with root package name */
    private final RecyclerView.s f3603c = new a();

    /* loaded from: classes.dex */
    class a extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        boolean f3604a = false;

        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i6) {
            super.a(recyclerView, i6);
            if (i6 == 0 && this.f3604a) {
                this.f3604a = false;
                n.this.k();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i6, int i7) {
            if (i6 == 0 && i7 == 0) {
                return;
            }
            this.f3604a = true;
        }
    }

    private void f() {
        this.f3601a.X0(this.f3603c);
        this.f3601a.setOnFlingListener(null);
    }

    private void i() {
        if (this.f3601a.getOnFlingListener() != null) {
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
        this.f3601a.k(this.f3603c);
        this.f3601a.setOnFlingListener(this);
    }

    private boolean j(RecyclerView.o oVar, int i6, int i7) {
        RecyclerView.y d6;
        int h6;
        if (!(oVar instanceof RecyclerView.y.b) || (d6 = d(oVar)) == null || (h6 = h(oVar, i6, i7)) == -1) {
            return false;
        }
        d6.p(h6);
        oVar.J1(d6);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean a(int i6, int i7) {
        RecyclerView.o layoutManager = this.f3601a.getLayoutManager();
        if (layoutManager == null || this.f3601a.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.f3601a.getMinFlingVelocity();
        return (Math.abs(i7) > minFlingVelocity || Math.abs(i6) > minFlingVelocity) && j(layoutManager, i6, i7);
    }

    public void b(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f3601a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            f();
        }
        this.f3601a = recyclerView;
        if (recyclerView != null) {
            i();
            this.f3602b = new Scroller(this.f3601a.getContext(), new DecelerateInterpolator());
            k();
        }
    }

    public abstract int[] c(RecyclerView.o oVar, View view);

    protected RecyclerView.y d(RecyclerView.o oVar) {
        return e(oVar);
    }

    protected abstract g e(RecyclerView.o oVar);

    public abstract View g(RecyclerView.o oVar);

    public abstract int h(RecyclerView.o oVar, int i6, int i7);

    void k() {
        RecyclerView.o layoutManager;
        View g6;
        RecyclerView recyclerView = this.f3601a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (g6 = g(layoutManager)) == null) {
            return;
        }
        int[] c6 = c(layoutManager, g6);
        int i6 = c6[0];
        if (i6 == 0 && c6[1] == 0) {
            return;
        }
        this.f3601a.k1(i6, c6[1]);
    }
}
