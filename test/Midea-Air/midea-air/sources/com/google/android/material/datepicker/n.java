package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: YearGridAdapter.java */
/* loaded from: classes2.dex */
public class n extends RecyclerView.g<b> {
    private final e<?> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f16603f;

        a(int i2) {
            this.f16603f = i2;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            n.this.a.t(n.this.a.m().a(Month.f(this.f16603f, n.this.a.o().f16544h)));
            n.this.a.u(e.k.DAY);
        }
    }

    /* compiled from: YearGridAdapter.java */
    /* loaded from: classes2.dex */
    public static class b extends RecyclerView.c0 {
        final TextView a;

        b(TextView textView) {
            super(textView);
            this.a = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(e<?> eVar) {
        this.a = eVar;
    }

    private View.OnClickListener h(int i2) {
        return new a(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.a.m().g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i(int i2) {
        return i2 - this.a.m().f().f16545i;
    }

    int j(int i2) {
        return this.a.m().f().f16545i + i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(b bVar, int i2) {
        int j2 = j(i2);
        String string = bVar.a.getContext().getString(e.e.b.b.j.m);
        bVar.a.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(j2)));
        bVar.a.setContentDescription(String.format(string, Integer.valueOf(j2)));
        com.google.android.material.datepicker.b n = this.a.n();
        Calendar j3 = m.j();
        com.google.android.material.datepicker.a aVar = j3.get(1) == j2 ? n.f16557f : n.f16555d;
        Iterator<Long> it = this.a.p().c0().iterator();
        while (it.hasNext()) {
            j3.setTimeInMillis(it.next().longValue());
            if (j3.get(1) == j2) {
                aVar = n.f16556e;
            }
        }
        aVar.d(bVar.a);
        bVar.a.setOnClickListener(h(j2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(ViewGroup viewGroup, int i2) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(e.e.b.b.h.m, viewGroup, false));
    }
}
