package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.view.u;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

/* compiled from: MaterialCalendar.java */
/* loaded from: classes2.dex */
public final class e<S> extends com.google.android.material.datepicker.j<S> {

    /* renamed from: g, reason: collision with root package name */
    static final Object f16564g = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: h, reason: collision with root package name */
    static final Object f16565h = "NAVIGATION_PREV_TAG";

    /* renamed from: i, reason: collision with root package name */
    static final Object f16566i = "NAVIGATION_NEXT_TAG";

    /* renamed from: j, reason: collision with root package name */
    static final Object f16567j = "SELECTOR_TOGGLE_TAG";

    /* renamed from: k, reason: collision with root package name */
    private int f16568k;
    private DateSelector<S> l;
    private CalendarConstraints m;
    private Month n;
    private k o;
    private com.google.android.material.datepicker.b p;
    private RecyclerView q;
    private RecyclerView r;
    private View s;
    private View t;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f16569f;

        a(int i2) {
            this.f16569f = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.r.smoothScrollToPosition(this.f16569f);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            super.g(view, cVar);
            cVar.a0(null);
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class c extends com.google.android.material.datepicker.k {
        final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.a = i3;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void calculateExtraLayoutSpace(RecyclerView.z zVar, int[] iArr) {
            if (this.a == 0) {
                iArr[0] = e.this.r.getWidth();
                iArr[1] = e.this.r.getWidth();
            } else {
                iArr[0] = e.this.r.getHeight();
                iArr[1] = e.this.r.getHeight();
            }
        }
    }

    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    class d implements l {
        d() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.datepicker.e.l
        public void a(long j2) {
            if (e.this.m.b().T(j2)) {
                e.this.l.k0(j2);
                Iterator<com.google.android.material.datepicker.i<S>> it = e.this.f16600f.iterator();
                while (it.hasNext()) {
                    it.next().a(e.this.l.g0());
                }
                e.this.r.getAdapter().notifyDataSetChanged();
                if (e.this.q != null) {
                    e.this.q.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* renamed from: com.google.android.material.datepicker.e$e, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0191e extends RecyclerView.n {
        private final Calendar a = m.l();

        /* renamed from: b, reason: collision with root package name */
        private final Calendar f16573b = m.l();

        C0191e() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.n
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.z zVar) {
            int width;
            if ((recyclerView.getAdapter() instanceof n) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                n nVar = (n) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (c.h.j.f<Long, Long> fVar : e.this.l.o()) {
                    Long l = fVar.a;
                    if (l != null && fVar.f2746b != null) {
                        this.a.setTimeInMillis(l.longValue());
                        this.f16573b.setTimeInMillis(fVar.f2746b.longValue());
                        int i2 = nVar.i(this.a.get(1));
                        int i3 = nVar.i(this.f16573b.get(1));
                        View findViewByPosition = gridLayoutManager.findViewByPosition(i2);
                        View findViewByPosition2 = gridLayoutManager.findViewByPosition(i3);
                        int spanCount = i2 / gridLayoutManager.getSpanCount();
                        int spanCount2 = i3 / gridLayoutManager.getSpanCount();
                        int i4 = spanCount;
                        while (i4 <= spanCount2) {
                            View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i4);
                            if (findViewByPosition3 != null) {
                                int top = findViewByPosition3.getTop() + e.this.p.f16555d.c();
                                int bottom = findViewByPosition3.getBottom() - e.this.p.f16555d.b();
                                int left = i4 == spanCount ? findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2) : 0;
                                if (i4 == spanCount2) {
                                    width = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(left, top, width, bottom, e.this.p.f16559h);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class f extends androidx.core.view.a {
        f() {
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.d0.c cVar) {
            String string;
            super.g(view, cVar);
            if (e.this.t.getVisibility() == 0) {
                string = e.this.getString(e.e.b.b.j.o);
            } else {
                string = e.this.getString(e.e.b.b.j.n);
            }
            cVar.j0(string);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class g extends RecyclerView.t {
        final /* synthetic */ com.google.android.material.datepicker.h a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MaterialButton f16576b;

        g(com.google.android.material.datepicker.h hVar, MaterialButton materialButton) {
            this.a = hVar;
            this.f16576b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
            if (i2 == 0) {
                CharSequence text = this.f16576b.getText();
                if (Build.VERSION.SDK_INT >= 16) {
                    recyclerView.announceForAccessibility(text);
                } else {
                    recyclerView.sendAccessibilityEvent(RecyclerView.l.FLAG_MOVED);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
            int findLastVisibleItemPosition;
            if (i2 < 0) {
                findLastVisibleItemPosition = e.this.r().findFirstVisibleItemPosition();
            } else {
                findLastVisibleItemPosition = e.this.r().findLastVisibleItemPosition();
            }
            e.this.n = this.a.h(findLastVisibleItemPosition);
            this.f16576b.setText(this.a.i(findLastVisibleItemPosition));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class h implements View.OnClickListener {
        h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            e.this.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class i implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.h f16579f;

        i(com.google.android.material.datepicker.h hVar) {
            this.f16579f = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findFirstVisibleItemPosition = e.this.r().findFirstVisibleItemPosition() + 1;
            if (findFirstVisibleItemPosition < e.this.r.getAdapter().getItemCount()) {
                e.this.t(this.f16579f.h(findFirstVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public class j implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.google.android.material.datepicker.h f16581f;

        j(com.google.android.material.datepicker.h hVar) {
            this.f16581f = hVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int findLastVisibleItemPosition = e.this.r().findLastVisibleItemPosition() - 1;
            if (findLastVisibleItemPosition >= 0) {
                e.this.t(this.f16581f.h(findLastVisibleItemPosition));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public enum k {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MaterialCalendar.java */
    /* loaded from: classes2.dex */
    public interface l {
        void a(long j2);
    }

    private void k(View view, com.google.android.material.datepicker.h hVar) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(e.e.b.b.f.f17463j);
        materialButton.setTag(f16567j);
        u.i0(materialButton, new f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(e.e.b.b.f.l);
        materialButton2.setTag(f16565h);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(e.e.b.b.f.f17464k);
        materialButton3.setTag(f16566i);
        this.s = view.findViewById(e.e.b.b.f.q);
        this.t = view.findViewById(e.e.b.b.f.n);
        u(k.DAY);
        materialButton.setText(this.n.x());
        this.r.addOnScrollListener(new g(hVar, materialButton));
        materialButton.setOnClickListener(new h());
        materialButton3.setOnClickListener(new i(hVar));
        materialButton2.setOnClickListener(new j(hVar));
    }

    private RecyclerView.n l() {
        return new C0191e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(Context context) {
        return context.getResources().getDimensionPixelSize(e.e.b.b.d.w);
    }

    private void s(int i2) {
        this.r.post(new a(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarConstraints m() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.android.material.datepicker.b n() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month o() {
        return this.n;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f16568k = bundle.getInt("THEME_RES_ID_KEY");
        this.l = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.m = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.n = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i2;
        int i3;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f16568k);
        this.p = new com.google.android.material.datepicker.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month f2 = this.m.f();
        if (com.google.android.material.datepicker.f.d(contextThemeWrapper)) {
            i2 = e.e.b.b.h.l;
            i3 = 1;
        } else {
            i2 = e.e.b.b.h.f17474j;
            i3 = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(e.e.b.b.f.o);
        u.i0(gridView, new b());
        gridView.setAdapter((ListAdapter) new com.google.android.material.datepicker.d());
        gridView.setNumColumns(f2.f16546j);
        gridView.setEnabled(false);
        this.r = (RecyclerView) inflate.findViewById(e.e.b.b.f.p);
        this.r.setLayoutManager(new c(getContext(), i3, false, i3));
        this.r.setTag(f16564g);
        com.google.android.material.datepicker.h hVar = new com.google.android.material.datepicker.h(contextThemeWrapper, this.l, this.m, new d());
        this.r.setAdapter(hVar);
        int integer = contextThemeWrapper.getResources().getInteger(e.e.b.b.g.f17465b);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(e.e.b.b.f.q);
        this.q = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.q.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.q.setAdapter(new n(this));
            this.q.addItemDecoration(l());
        }
        if (inflate.findViewById(e.e.b.b.f.f17463j) != null) {
            k(inflate, hVar);
        }
        if (!com.google.android.material.datepicker.f.d(contextThemeWrapper)) {
            new androidx.recyclerview.widget.k().attachToRecyclerView(this.r);
        }
        this.r.scrollToPosition(hVar.j(this.n));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f16568k);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.l);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.m);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.n);
    }

    public DateSelector<S> p() {
        return this.l;
    }

    LinearLayoutManager r() {
        return (LinearLayoutManager) this.r.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void t(Month month) {
        com.google.android.material.datepicker.h hVar = (com.google.android.material.datepicker.h) this.r.getAdapter();
        int j2 = hVar.j(month);
        int j3 = j2 - hVar.j(this.n);
        boolean z = Math.abs(j3) > 3;
        boolean z2 = j3 > 0;
        this.n = month;
        if (z && z2) {
            this.r.scrollToPosition(j2 - 3);
            s(j2);
        } else if (z) {
            this.r.scrollToPosition(j2 + 3);
            s(j2);
        } else {
            s(j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void u(k kVar) {
        this.o = kVar;
        if (kVar == k.YEAR) {
            this.q.getLayoutManager().scrollToPosition(((n) this.q.getAdapter()).i(this.n.f16545i));
            this.s.setVisibility(0);
            this.t.setVisibility(8);
        } else if (kVar == k.DAY) {
            this.s.setVisibility(8);
            this.t.setVisibility(0);
            t(this.n);
        }
    }

    void v() {
        k kVar = this.o;
        k kVar2 = k.YEAR;
        if (kVar == kVar2) {
            u(k.DAY);
        } else if (kVar == k.DAY) {
            u(kVar2);
        }
    }
}
