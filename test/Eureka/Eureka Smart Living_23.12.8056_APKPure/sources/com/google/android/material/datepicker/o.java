package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.b1;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;

/* loaded from: classes.dex */
class o extends RecyclerView.g {

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.material.datepicker.a f5008c;

    /* renamed from: d, reason: collision with root package name */
    private final j.m f5009d;

    /* renamed from: e, reason: collision with root package name */
    private final int f5010e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f5011a;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f5011a = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i6, long j6) {
            if (this.f5011a.getAdapter().p(i6)) {
                o.this.f5009d.a(this.f5011a.getAdapter().getItem(i6).longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.c0 {

        /* renamed from: t, reason: collision with root package name */
        final TextView f5013t;

        /* renamed from: u, reason: collision with root package name */
        final MaterialCalendarGridView f5014u;

        b(LinearLayout linearLayout, boolean z5) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(m2.e.f7637w);
            this.f5013t = textView;
            b1.r0(textView, true);
            this.f5014u = (MaterialCalendarGridView) linearLayout.findViewById(m2.e.f7633s);
            if (z5) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context, d dVar, com.google.android.material.datepicker.a aVar, h hVar, j.m mVar) {
        m l6 = aVar.l();
        m h6 = aVar.h();
        m k6 = aVar.k();
        if (l6.compareTo(k6) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (k6.compareTo(h6) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f5010e = (n.f5002e * j.T1(context)) + (k.h2(context) ? j.T1(context) : 0);
        this.f5008c = aVar;
        this.f5009d = mVar;
        r(true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f5008c.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long d(int i6) {
        return this.f5008c.l().k(i6).j();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m u(int i6) {
        return this.f5008c.l().k(i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence v(int i6) {
        return u(i6).i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int w(m mVar) {
        return this.f5008c.l().l(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void i(b bVar, int i6) {
        m k6 = this.f5008c.l().k(i6);
        bVar.f5013t.setText(k6.i());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f5014u.findViewById(m2.e.f7633s);
        if (materialCalendarGridView.getAdapter() == null || !k6.equals(materialCalendarGridView.getAdapter().f5004a)) {
            n nVar = new n(k6, null, this.f5008c, null);
            materialCalendarGridView.setNumColumns(k6.f4998d);
            materialCalendarGridView.setAdapter((ListAdapter) nVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().o(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public b k(ViewGroup viewGroup, int i6) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(m2.g.f7656o, viewGroup, false);
        if (!k.h2(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f5010e));
        return new b(linearLayout, true);
    }
}
