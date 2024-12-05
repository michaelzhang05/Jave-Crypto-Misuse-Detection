package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.stripe.android.view.N0;
import e3.C2780D;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* loaded from: classes4.dex */
public final class L0 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f28464a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28465b;

    /* renamed from: c, reason: collision with root package name */
    private final int f28466c;

    /* renamed from: d, reason: collision with root package name */
    private final int f28467d;

    /* renamed from: e, reason: collision with root package name */
    private final J2.t f28468e;

    public /* synthetic */ L0(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        if (z8) {
            this.f28468e.f4896c.setTextColor(this.f28465b);
            this.f28468e.f4895b.setTextColor(this.f28465b);
            this.f28468e.f4897d.setTextColor(this.f28465b);
            this.f28468e.f4898e.setVisibility(0);
            return;
        }
        this.f28468e.f4896c.setTextColor(this.f28467d);
        this.f28468e.f4895b.setTextColor(this.f28466c);
        this.f28468e.f4897d.setTextColor(this.f28467d);
        this.f28468e.f4898e.setVisibility(4);
    }

    public final void setShippingMethod(C2780D shippingMethod) {
        AbstractC3255y.i(shippingMethod, "shippingMethod");
        this.f28468e.f4896c.setText(shippingMethod.h());
        this.f28468e.f4895b.setText(shippingMethod.g());
        TextView textView = this.f28468e.f4897d;
        long a8 = shippingMethod.a();
        Currency b8 = shippingMethod.b();
        String string = getContext().getString(AbstractC3407E.f34811D0);
        AbstractC3255y.h(string, "getString(...)");
        textView.setText(E0.b(a8, b8, string));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        N0 n02 = new N0(context);
        this.f28464a = n02;
        J2.t b8 = J2.t.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        this.f28468e = b8;
        int a8 = n02.a();
        int d8 = n02.d();
        int e8 = n02.e();
        N0.a aVar = N0.f28491g;
        this.f28465b = aVar.b(a8) ? ContextCompat.getColor(context, m2.x.f35074a) : a8;
        this.f28467d = aVar.b(d8) ? ContextCompat.getColor(context, m2.x.f35076c) : d8;
        this.f28466c = aVar.b(e8) ? ContextCompat.getColor(context, m2.x.f35077d) : e8;
    }
}
