package com.stripe.android.view;

import P5.AbstractC1378t;
import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import e3.EnumC2791e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3403A;
import m2.AbstractC3405C;

/* renamed from: com.stripe.android.view.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2667v extends ArrayAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final List f29028a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC2791e f29029b;

    /* renamed from: c, reason: collision with root package name */
    private final LayoutInflater f29030c;

    /* renamed from: d, reason: collision with root package name */
    private final N0 f29031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2667v(Context context, List brands, EnumC2791e enumC2791e) {
        super(context, 0, brands);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(brands, "brands");
        this.f29028a = brands;
        this.f29029b = enumC2791e;
        this.f29030c = LayoutInflater.from(context);
        this.f29031d = new N0(context);
    }

    private final void b(View view, int i8) {
        boolean z8 = true;
        EnumC2791e enumC2791e = (EnumC2791e) AbstractC1378t.p0(this.f29028a, i8 - 1);
        if (enumC2791e != null) {
            if (enumC2791e != this.f29029b) {
                z8 = false;
            }
            ImageView imageView = (ImageView) view.findViewById(AbstractC3403A.f34749f);
            if (imageView != null) {
                imageView.setBackgroundResource(enumC2791e.k());
            }
            ImageView imageView2 = (ImageView) view.findViewById(AbstractC3403A.f34747e);
            if (z8) {
                imageView2.setVisibility(0);
                imageView2.setColorFilter(this.f29031d.c());
            } else {
                imageView2.setVisibility(8);
            }
            TextView textView = (TextView) view.findViewById(AbstractC3403A.f34751g);
            if (textView != null) {
                AbstractC3255y.f(textView);
                textView.setText(enumC2791e.h());
                if (z8) {
                    textView.setTextColor(this.f29031d.c());
                    textView.setTypeface(Typeface.DEFAULT_BOLD);
                } else {
                    textView.setTypeface(Typeface.DEFAULT);
                }
            }
        }
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC2791e getItem(int i8) {
        if (i8 == 0) {
            return null;
        }
        return (EnumC2791e) super.getItem(i8 - 1);
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public int getCount() {
        if (this.f29028a.isEmpty()) {
            return 0;
        }
        return this.f29028a.size() + 1;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public View getView(int i8, View view, ViewGroup parent) {
        View inflate;
        AbstractC3255y.i(parent, "parent");
        if (i8 == 0) {
            inflate = this.f29030c.inflate(AbstractC3405C.f34797t, parent, false);
        } else {
            inflate = this.f29030c.inflate(AbstractC3405C.f34786i, parent, false);
        }
        if (i8 > 0) {
            AbstractC3255y.f(inflate);
            b(inflate, i8);
        }
        AbstractC3255y.f(inflate);
        return inflate;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i8) {
        return i8 != 0;
    }
}
