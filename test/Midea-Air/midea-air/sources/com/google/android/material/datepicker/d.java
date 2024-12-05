package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: DaysOfWeekAdapter.java */
/* loaded from: classes2.dex */
class d extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    private static final int f16560f;

    /* renamed from: g, reason: collision with root package name */
    private final Calendar f16561g;

    /* renamed from: h, reason: collision with root package name */
    private final int f16562h;

    /* renamed from: i, reason: collision with root package name */
    private final int f16563i;

    static {
        f16560f = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public d() {
        Calendar l = m.l();
        this.f16561g = l;
        this.f16562h = l.getMaximum(7);
        this.f16563i = l.getFirstDayOfWeek();
    }

    private int b(int i2) {
        int i3 = i2 + this.f16563i;
        int i4 = this.f16562h;
        return i3 > i4 ? i3 - i4 : i3;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i2) {
        if (i2 >= this.f16562h) {
            return null;
        }
        return Integer.valueOf(b(i2));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f16562h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i2, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(e.e.b.b.h.f17473i, viewGroup, false);
        }
        this.f16561g.set(7, b(i2));
        textView.setText(this.f16561g.getDisplayName(7, f16560f, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(e.e.b.b.j.l), this.f16561g.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
