package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n extends BaseAdapter {

    /* renamed from: e, reason: collision with root package name */
    static final int f5002e = w.k().getMaximum(4);

    /* renamed from: f, reason: collision with root package name */
    private static final int f5003f = (w.k().getMaximum(5) + w.k().getMaximum(7)) - 1;

    /* renamed from: a, reason: collision with root package name */
    final m f5004a;

    /* renamed from: b, reason: collision with root package name */
    private Collection f5005b;

    /* renamed from: c, reason: collision with root package name */
    c f5006c;

    /* renamed from: d, reason: collision with root package name */
    final a f5007d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(m mVar, d dVar, a aVar, h hVar) {
        this.f5004a = mVar;
        this.f5007d = aVar;
        this.f5005b = dVar.q();
    }

    private String c(Context context, long j6) {
        return f.a(context, j6, j(j6), i(j6), g(j6));
    }

    private void f(Context context) {
        if (this.f5006c == null) {
            this.f5006c = new c(context);
        }
    }

    private boolean h(long j6) {
        throw null;
    }

    private boolean j(long j6) {
        return w.i().getTimeInMillis() == j6;
    }

    private void m(TextView textView, long j6, int i6) {
        b bVar;
        if (textView == null) {
            return;
        }
        textView.setContentDescription(c(textView.getContext(), j6));
        if (this.f5007d.f().g(j6)) {
            textView.setEnabled(true);
            boolean h6 = h(j6);
            textView.setSelected(h6);
            bVar = h6 ? this.f5006c.f4931b : j(j6) ? this.f5006c.f4932c : this.f5006c.f4930a;
        } else {
            textView.setEnabled(false);
            bVar = this.f5006c.f4936g;
        }
        bVar.b(textView);
    }

    private void n(MaterialCalendarGridView materialCalendarGridView, long j6) {
        if (m.c(j6).equals(this.f5004a)) {
            int h6 = this.f5004a.h(j6);
            m((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(h6) - materialCalendarGridView.getFirstVisiblePosition()), j6, h6);
        }
    }

    int a(int i6) {
        return b() + (i6 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f5004a.e(this.f5007d.i());
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i6) {
        if (i6 < b() || i6 > k()) {
            return null;
        }
        return Long.valueOf(this.f5004a.f(l(i6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0064  */
    @Override // android.widget.Adapter
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.f(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = m2.g.f7653l
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L54
            com.google.android.material.datepicker.m r8 = r5.f5004a
            int r2 = r8.f4999e
            if (r7 < r2) goto L2d
            goto L54
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L5d
        L54:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
            r7 = -1
        L5d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L64
            return r0
        L64:
            long r1 = r6.longValue()
            r5.m(r0, r1, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.n.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j6) {
        throw null;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f5003f;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return i6 / this.f5004a.f4998d;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(long j6) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int k() {
        return (b() + this.f5004a.f4999e) - 1;
    }

    int l(int i6) {
        return (i6 - b()) + 1;
    }

    public void o(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f5005b.iterator();
        while (it.hasNext()) {
            n(materialCalendarGridView, ((Long) it.next()).longValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean p(int i6) {
        return i6 >= b() && i6 <= k();
    }
}
