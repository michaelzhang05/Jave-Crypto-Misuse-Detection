package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;

/* compiled from: MonthAdapter.java */
/* loaded from: classes2.dex */
class g extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    static final int f16589f = m.l().getMaximum(4);

    /* renamed from: g, reason: collision with root package name */
    final Month f16590g;

    /* renamed from: h, reason: collision with root package name */
    final DateSelector<?> f16591h;

    /* renamed from: i, reason: collision with root package name */
    b f16592i;

    /* renamed from: j, reason: collision with root package name */
    final CalendarConstraints f16593j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f16590g = month;
        this.f16591h = dateSelector;
        this.f16593j = calendarConstraints;
    }

    private void e(Context context) {
        if (this.f16592i == null) {
            this.f16592i = new b(context);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(int i2) {
        return b() + (i2 - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b() {
        return this.f16590g.n();
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i2) {
        if (i2 < this.f16590g.n() || i2 > h()) {
            return null;
        }
        return Long.valueOf(this.f16590g.r(i(i2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = e.e.b.b.h.f17472h
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L61
            com.google.android.material.datepicker.Month r2 = r5.f16590g
            int r3 = r2.f16547k
            if (r7 < r3) goto L2e
            goto L61
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.Month r2 = r5.f16590g
            long r2 = r2.r(r7)
            com.google.android.material.datepicker.Month r7 = r5.f16590g
            int r7 = r7.f16545i
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.i()
            int r4 = r4.f16545i
            if (r7 != r4) goto L53
            java.lang.String r7 = com.google.android.material.datepicker.c.a(r2)
            r0.setContentDescription(r7)
            goto L5a
        L53:
            java.lang.String r7 = com.google.android.material.datepicker.c.c(r2)
            r0.setContentDescription(r7)
        L5a:
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L69
        L61:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L69:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L70
            return r0
        L70:
            com.google.android.material.datepicker.CalendarConstraints r7 = r5.f16593j
            com.google.android.material.datepicker.CalendarConstraints$DateValidator r7 = r7.b()
            long r2 = r6.longValue()
            boolean r7 = r7.T(r2)
            if (r7 == 0) goto Ld5
            r0.setEnabled(r8)
            com.google.android.material.datepicker.DateSelector<?> r7 = r5.f16591h
            java.util.Collection r7 = r7.c0()
            java.util.Iterator r7 = r7.iterator()
        L8d:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb5
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.m.a(r3)
            long r1 = com.google.android.material.datepicker.m.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8d
            com.google.android.material.datepicker.b r6 = r5.f16592i
            com.google.android.material.datepicker.a r6 = r6.f16553b
            r6.d(r0)
            return r0
        Lb5:
            java.util.Calendar r7 = com.google.android.material.datepicker.m.j()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lcd
            com.google.android.material.datepicker.b r6 = r5.f16592i
            com.google.android.material.datepicker.a r6 = r6.f16554c
            r6.d(r0)
            return r0
        Lcd:
            com.google.android.material.datepicker.b r6 = r5.f16592i
            com.google.android.material.datepicker.a r6 = r6.a
            r6.d(r0)
            return r0
        Ld5:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.b r6 = r5.f16592i
            com.google.android.material.datepicker.a r6 = r6.f16558g
            r6.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.g.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean f(int i2) {
        return i2 % this.f16590g.f16546j == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i2) {
        return (i2 + 1) % this.f16590g.f16546j == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16590g.f16547k + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2 / this.f16590g.f16546j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int h() {
        return (this.f16590g.n() + this.f16590g.f16547k) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i(int i2) {
        return (i2 - this.f16590g.n()) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j(int i2) {
        return i2 >= b() && i2 <= h();
    }
}
