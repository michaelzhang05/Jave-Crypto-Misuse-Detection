package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes.dex */
class i extends BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    private static final int f4939d;

    /* renamed from: a, reason: collision with root package name */
    private final Calendar f4940a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4941b;

    /* renamed from: c, reason: collision with root package name */
    private final int f4942c;

    static {
        f4939d = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar k6 = w.k();
        this.f4940a = k6;
        this.f4941b = k6.getMaximum(7);
        this.f4942c = k6.getFirstDayOfWeek();
    }

    private int b(int i6) {
        int i7 = i6 + this.f4942c;
        int i8 = this.f4941b;
        return i7 > i8 ? i7 - i8 : i7;
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i6) {
        if (i6 >= this.f4941b) {
            return null;
        }
        return Integer.valueOf(b(i6));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4941b;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i6) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i6, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(m2.g.f7654m, viewGroup, false);
        }
        this.f4940a.set(7, b(i6));
        textView.setText(this.f4940a.getDisplayName(7, f4939d, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(m2.h.f7672l), this.f4940a.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i6) {
        Calendar k6 = w.k();
        this.f4940a = k6;
        this.f4941b = k6.getMaximum(7);
        this.f4942c = i6;
    }
}
