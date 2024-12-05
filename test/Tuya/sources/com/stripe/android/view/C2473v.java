package com.stripe.android.view;

import M5.AbstractC1246t;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import b3.EnumC1870e;
import j2.AbstractC3049A;
import j2.AbstractC3051C;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2473v extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final List f27973a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1870e f27974b;

    /* renamed from: c, reason: collision with root package name */
    private final LayoutInflater f27975c;

    /* renamed from: d, reason: collision with root package name */
    private final N0 f27976d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2473v(Context context, List brands, EnumC1870e enumC1870e) {
        super(context, 0, brands);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(brands, "brands");
        this.f27973a = brands;
        this.f27974b = enumC1870e;
        this.f27975c = LayoutInflater.from(context);
        this.f27976d = new N0(context);
    }

    private final void b(View view, int i8) {
        boolean z8 = true;
        EnumC1870e enumC1870e = (EnumC1870e) AbstractC1246t.p0(this.f27973a, i8 - 1);
        if (enumC1870e != null) {
            if (enumC1870e != this.f27974b) {
                z8 = false;
            }
            ImageView imageView = (ImageView) view.findViewById(AbstractC3049A.f32773f);
            if (imageView != null) {
                imageView.setBackgroundResource(enumC1870e.l());
            }
            ImageView imageView2 = (ImageView) view.findViewById(AbstractC3049A.f32771e);
            if (z8) {
                imageView2.setVisibility(0);
                imageView2.setColorFilter(this.f27976d.c());
            } else {
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) view.findViewById(AbstractC3049A.f32775g);
            if (textView != null) {
                AbstractC3159y.f(textView);
                textView.setText(enumC1870e.h());
                if (z8) {
                    textView.setTextColor(this.f27976d.c());
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    textView.setTypeface(Typeface.DEFAULT);
                }
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC1870e getItem(int i8) {
        if (i8 == 0) {
            return null;
        }
        return (EnumC1870e) super.getItem(i8 - 1);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        if (this.f27973a.isEmpty()) {
            return 0;
        }
        return this.f27973a.size() + 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup parent) {
        View inflate;
        AbstractC3159y.i(parent, "parent");
        if (i8 == 0) {
            inflate = this.f27975c.inflate(AbstractC3051C.f32821t, parent, false);
        } else {
            inflate = this.f27975c.inflate(AbstractC3051C.f32810i, parent, false);
        }
        if (i8 > 0) {
            AbstractC3159y.f(inflate);
            b(inflate, i8);
        }
        AbstractC3159y.f(inflate);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i8) {
        return i8 != 0;
    }
}
