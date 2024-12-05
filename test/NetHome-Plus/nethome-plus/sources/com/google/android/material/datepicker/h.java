package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.u;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MonthsPagerAdapter.java */
/* loaded from: classes2.dex */
public class h extends RecyclerView.g<b> {
    private final CalendarConstraints a;

    /* renamed from: b, reason: collision with root package name */
    private final DateSelector<?> f16594b;

    /* renamed from: c, reason: collision with root package name */
    private final e.l f16595c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16596d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f16597f;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f16597f = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            if (this.f16597f.getAdapter().j(i2)) {
                h.this.f16595c.a(this.f16597f.getAdapter().getItem(i2).longValue());
            }
        }
    }

    /* compiled from: MonthsPagerAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.c0 {
        final TextView a;

        /* renamed from: b, reason: collision with root package name */
        final MaterialCalendarGridView f16599b;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(e.e.b.b.f.m);
            this.a = textView;
            u.j0(textView, true);
            this.f16599b = (MaterialCalendarGridView) linearLayout.findViewById(e.e.b.b.f.f17462i);
            if (z) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, e.l lVar) {
        Month f2 = calendarConstraints.f();
        Month c2 = calendarConstraints.c();
        Month e2 = calendarConstraints.e();
        if (f2.compareTo(e2) <= 0) {
            if (e2.compareTo(c2) <= 0) {
                this.f16596d = (g.f16589f * e.q(context)) + (f.d(context) ? e.q(context) : 0);
                this.a = calendarConstraints;
                this.f16594b = dateSelector;
                this.f16595c = lVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.a.d();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long getItemId(int i2) {
        return this.a.f().C(i2).B();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Month h(int i2) {
        return this.a.f().C(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CharSequence i(int i2) {
        return h(i2).x();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j(Month month) {
        return this.a.f().D(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i2) {
        Month C = this.a.f().C(i2);
        bVar.a.setText(C.x());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f16599b.findViewById(e.e.b.b.f.f17462i);
        if (materialCalendarGridView.getAdapter() != null && C.equals(materialCalendarGridView.getAdapter().f16590g)) {
            materialCalendarGridView.getAdapter().notifyDataSetChanged();
        } else {
            g gVar = new g(C, this.f16594b, this.a);
            materialCalendarGridView.setNumColumns(C.f16546j);
            materialCalendarGridView.setAdapter((ListAdapter) gVar);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(e.e.b.b.h.f17475k, viewGroup, false);
        if (f.d(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f16596d));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }
}
