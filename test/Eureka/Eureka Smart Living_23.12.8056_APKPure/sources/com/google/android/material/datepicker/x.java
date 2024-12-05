package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* loaded from: classes.dex */
class x extends RecyclerView.g {

    /* renamed from: c, reason: collision with root package name */
    private final j f5021c;

    /* loaded from: classes.dex */
    public static class a extends RecyclerView.c0 {

        /* renamed from: t, reason: collision with root package name */
        final TextView f5022t;

        a(TextView textView) {
            super(textView);
            this.f5022t = textView;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x(j jVar) {
        this.f5021c = jVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int c() {
        return this.f5021c.P1().m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int t(int i6) {
        return i6 - this.f5021c.P1().l().f4997c;
    }

    int u(int i6) {
        return this.f5021c.P1().l().f4997c + i6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void i(a aVar, int i6) {
        int u5 = u(i6);
        aVar.f5022t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(u5)));
        TextView textView = aVar.f5022t;
        textView.setContentDescription(f.e(textView.getContext(), u5));
        c Q1 = this.f5021c.Q1();
        if (w.i().get(1) == u5) {
            b bVar = Q1.f4935f;
        } else {
            b bVar2 = Q1.f4933d;
        }
        this.f5021c.S1();
        throw null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public a k(ViewGroup viewGroup, int i6) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(m2.g.f7658q, viewGroup, false));
    }
}
