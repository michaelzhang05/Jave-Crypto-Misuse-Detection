package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.appcompat.app.f0;
import androidx.core.view.accessibility.g0;
import androidx.core.view.b1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes.dex */
public final class j<S> extends q {

    /* renamed from: o0, reason: collision with root package name */
    static final Object f4943o0 = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: p0, reason: collision with root package name */
    static final Object f4944p0 = "NAVIGATION_PREV_TAG";

    /* renamed from: q0, reason: collision with root package name */
    static final Object f4945q0 = "NAVIGATION_NEXT_TAG";

    /* renamed from: r0, reason: collision with root package name */
    static final Object f4946r0 = "SELECTOR_TOGGLE_TAG";

    /* renamed from: d0, reason: collision with root package name */
    private int f4947d0;

    /* renamed from: e0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f4948e0;

    /* renamed from: f0, reason: collision with root package name */
    private com.google.android.material.datepicker.m f4949f0;

    /* renamed from: g0, reason: collision with root package name */
    private l f4950g0;

    /* renamed from: h0, reason: collision with root package name */
    private com.google.android.material.datepicker.c f4951h0;

    /* renamed from: i0, reason: collision with root package name */
    private RecyclerView f4952i0;

    /* renamed from: j0, reason: collision with root package name */
    private RecyclerView f4953j0;

    /* renamed from: k0, reason: collision with root package name */
    private View f4954k0;

    /* renamed from: l0, reason: collision with root package name */
    private View f4955l0;

    /* renamed from: m0, reason: collision with root package name */
    private View f4956m0;

    /* renamed from: n0, reason: collision with root package name */
    private View f4957n0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f4958a;

        a(o oVar) {
            this.f4958a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int c22 = j.this.V1().c2() - 1;
            if (c22 >= 0) {
                j.this.Y1(this.f4958a.u(c22));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f4960a;

        b(int i6) {
            this.f4960a = i6;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.f4953j0.o1(this.f4960a);
        }
    }

    /* loaded from: classes.dex */
    class c extends androidx.core.view.a {
        c() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            g0Var.Z(null);
        }
    }

    /* loaded from: classes.dex */
    class d extends r {
        final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, int i6, boolean z5, int i7) {
            super(context, i6, z5);
            this.I = i7;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void M1(RecyclerView.z zVar, int[] iArr) {
            if (this.I == 0) {
                iArr[0] = j.this.f4953j0.getWidth();
                iArr[1] = j.this.f4953j0.getWidth();
            } else {
                iArr[0] = j.this.f4953j0.getHeight();
                iArr[1] = j.this.f4953j0.getHeight();
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements m {
        e() {
        }

        @Override // com.google.android.material.datepicker.j.m
        public void a(long j6) {
            if (j.this.f4948e0.f().g(j6)) {
                j.K1(j.this);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            super.g(view, g0Var);
            g0Var.q0(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g extends RecyclerView.n {

        /* renamed from: a, reason: collision with root package name */
        private final Calendar f4965a = w.k();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f4966b = w.k();

        g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            if ((recyclerView.getAdapter() instanceof x) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                j.K1(j.this);
                throw null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h extends androidx.core.view.a {
        h() {
        }

        @Override // androidx.core.view.a
        public void g(View view, g0 g0Var) {
            j jVar;
            int i6;
            super.g(view, g0Var);
            if (j.this.f4957n0.getVisibility() == 0) {
                jVar = j.this;
                i6 = m2.h.f7681u;
            } else {
                jVar = j.this;
                i6 = m2.h.f7679s;
            }
            g0Var.i0(jVar.U(i6));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i extends RecyclerView.s {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f4969a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f4970b;

        i(o oVar, MaterialButton materialButton) {
            this.f4969a = oVar;
            this.f4970b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void a(RecyclerView recyclerView, int i6) {
            if (i6 == 0) {
                recyclerView.announceForAccessibility(this.f4970b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public void b(RecyclerView recyclerView, int i6, int i7) {
            LinearLayoutManager V1 = j.this.V1();
            int Z1 = i6 < 0 ? V1.Z1() : V1.c2();
            j.this.f4949f0 = this.f4969a.u(Z1);
            this.f4970b.setText(this.f4969a.v(Z1));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.datepicker.j$j, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ViewOnClickListenerC0085j implements View.OnClickListener {
        ViewOnClickListenerC0085j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j.this.b2();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ o f4973a;

        k(o oVar) {
            this.f4973a = oVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int Z1 = j.this.V1().Z1() + 1;
            if (Z1 < j.this.f4953j0.getAdapter().c()) {
                j.this.Y1(this.f4973a.u(Z1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum l {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface m {
        void a(long j6);
    }

    static /* synthetic */ com.google.android.material.datepicker.d K1(j jVar) {
        jVar.getClass();
        return null;
    }

    private void N1(View view, o oVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(m2.e.f7634t);
        materialButton.setTag(f4946r0);
        b1.q0(materialButton, new h());
        View findViewById = view.findViewById(m2.e.f7636v);
        this.f4954k0 = findViewById;
        findViewById.setTag(f4944p0);
        View findViewById2 = view.findViewById(m2.e.f7635u);
        this.f4955l0 = findViewById2;
        findViewById2.setTag(f4945q0);
        this.f4956m0 = view.findViewById(m2.e.C);
        this.f4957n0 = view.findViewById(m2.e.f7638x);
        Z1(l.DAY);
        materialButton.setText(this.f4949f0.i());
        this.f4953j0.k(new i(oVar, materialButton));
        materialButton.setOnClickListener(new ViewOnClickListenerC0085j());
        this.f4955l0.setOnClickListener(new k(oVar));
        this.f4954k0.setOnClickListener(new a(oVar));
    }

    private RecyclerView.n O1() {
        return new g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int T1(Context context) {
        return context.getResources().getDimensionPixelSize(m2.c.f7603y);
    }

    private static int U1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(m2.c.F) + resources.getDimensionPixelOffset(m2.c.G) + resources.getDimensionPixelOffset(m2.c.E);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(m2.c.A);
        int i6 = n.f5002e;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(m2.c.f7603y) * i6) + ((i6 - 1) * resources.getDimensionPixelOffset(m2.c.D)) + resources.getDimensionPixelOffset(m2.c.f7601w);
    }

    public static j W1(com.google.android.material.datepicker.d dVar, int i6, com.google.android.material.datepicker.a aVar, com.google.android.material.datepicker.h hVar) {
        j jVar = new j();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i6);
        bundle.putParcelable("GRID_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", hVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", aVar.k());
        jVar.y1(bundle);
        return jVar;
    }

    private void X1(int i6) {
        this.f4953j0.post(new b(i6));
    }

    private void a2() {
        b1.q0(this.f4953j0, new f());
    }

    @Override // com.google.android.material.datepicker.q
    public boolean G1(p pVar) {
        return super.G1(pVar);
    }

    @Override // androidx.fragment.app.Fragment
    public void L0(Bundle bundle) {
        super.L0(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f4947d0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f4948e0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f4949f0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.a P1() {
        return this.f4948e0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.c Q1() {
        return this.f4951h0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.m R1() {
        return this.f4949f0;
    }

    public com.google.android.material.datepicker.d S1() {
        return null;
    }

    LinearLayoutManager V1() {
        return (LinearLayoutManager) this.f4953j0.getLayoutManager();
    }

    void Y1(com.google.android.material.datepicker.m mVar) {
        RecyclerView recyclerView;
        int i6;
        o oVar = (o) this.f4953j0.getAdapter();
        int w5 = oVar.w(mVar);
        int w6 = w5 - oVar.w(this.f4949f0);
        boolean z5 = Math.abs(w6) > 3;
        boolean z6 = w6 > 0;
        this.f4949f0 = mVar;
        if (!z5 || !z6) {
            if (z5) {
                recyclerView = this.f4953j0;
                i6 = w5 + 3;
            }
            X1(w5);
        }
        recyclerView = this.f4953j0;
        i6 = w5 - 3;
        recyclerView.g1(i6);
        X1(w5);
    }

    void Z1(l lVar) {
        this.f4950g0 = lVar;
        if (lVar == l.YEAR) {
            this.f4952i0.getLayoutManager().x1(((x) this.f4952i0.getAdapter()).t(this.f4949f0.f4997c));
            this.f4956m0.setVisibility(0);
            this.f4957n0.setVisibility(8);
            this.f4954k0.setVisibility(8);
            this.f4955l0.setVisibility(8);
            return;
        }
        if (lVar == l.DAY) {
            this.f4956m0.setVisibility(8);
            this.f4957n0.setVisibility(0);
            this.f4954k0.setVisibility(0);
            this.f4955l0.setVisibility(0);
            Y1(this.f4949f0);
        }
    }

    void b2() {
        l lVar = this.f4950g0;
        l lVar2 = l.YEAR;
        if (lVar == lVar2) {
            Z1(l.DAY);
        } else if (lVar == l.DAY) {
            Z1(lVar2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void p0(Bundle bundle) {
        super.p0(bundle);
        if (bundle == null) {
            bundle = s();
        }
        this.f4947d0 = bundle.getInt("THEME_RES_ID_KEY");
        f0.a(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.f4948e0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        f0.a(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.f4949f0 = (com.google.android.material.datepicker.m) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View t0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i6;
        int i7;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(u(), this.f4947d0);
        this.f4951h0 = new com.google.android.material.datepicker.c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        com.google.android.material.datepicker.m l6 = this.f4948e0.l();
        if (com.google.android.material.datepicker.k.h2(contextThemeWrapper)) {
            i6 = m2.g.f7657p;
            i7 = 1;
        } else {
            i6 = m2.g.f7655n;
            i7 = 0;
        }
        View inflate = cloneInContext.inflate(i6, viewGroup, false);
        inflate.setMinimumHeight(U1(s1()));
        GridView gridView = (GridView) inflate.findViewById(m2.e.f7639y);
        b1.q0(gridView, new c());
        int i8 = this.f4948e0.i();
        gridView.setAdapter((ListAdapter) (i8 > 0 ? new com.google.android.material.datepicker.i(i8) : new com.google.android.material.datepicker.i()));
        gridView.setNumColumns(l6.f4998d);
        gridView.setEnabled(false);
        this.f4953j0 = (RecyclerView) inflate.findViewById(m2.e.B);
        this.f4953j0.setLayoutManager(new d(u(), i7, false, i7));
        this.f4953j0.setTag(f4943o0);
        o oVar = new o(contextThemeWrapper, null, this.f4948e0, null, new e());
        this.f4953j0.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(m2.f.f7641a);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(m2.e.C);
        this.f4952i0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f4952i0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f4952i0.setAdapter(new x(this));
            this.f4952i0.h(O1());
        }
        if (inflate.findViewById(m2.e.f7634t) != null) {
            N1(inflate, oVar);
        }
        if (!com.google.android.material.datepicker.k.h2(contextThemeWrapper)) {
            new androidx.recyclerview.widget.j().b(this.f4953j0);
        }
        this.f4953j0.g1(oVar.w(this.f4949f0));
        a2();
        return inflate;
    }
}
