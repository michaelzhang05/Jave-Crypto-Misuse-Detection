package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import b3.C1859D;
import com.stripe.android.view.N0;
import j2.AbstractC3053E;
import java.util.Currency;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class L0 extends RelativeLayout {

    /* renamed from: a, reason: collision with root package name */
    private final N0 f27409a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27410b;

    /* renamed from: c, reason: collision with root package name */
    private final int f27411c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27412d;

    /* renamed from: e, reason: collision with root package name */
    private final G2.t f27413e;

    public /* synthetic */ L0(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // android.view.View
    public void setSelected(boolean z8) {
        if (z8) {
            this.f27413e.f3177c.setTextColor(this.f27410b);
            this.f27413e.f3176b.setTextColor(this.f27410b);
            this.f27413e.f3178d.setTextColor(this.f27410b);
            this.f27413e.f3179e.setVisibility(0);
            return;
        }
        this.f27413e.f3177c.setTextColor(this.f27412d);
        this.f27413e.f3176b.setTextColor(this.f27411c);
        this.f27413e.f3178d.setTextColor(this.f27412d);
        this.f27413e.f3179e.setVisibility(4);
    }

    public final void setShippingMethod(C1859D shippingMethod) {
        AbstractC3159y.i(shippingMethod, "shippingMethod");
        this.f27413e.f3177c.setText(shippingMethod.f());
        this.f27413e.f3176b.setText(shippingMethod.e());
        TextView textView = this.f27413e.f3178d;
        long b8 = shippingMethod.b();
        Currency c8 = shippingMethod.c();
        String string = getContext().getString(AbstractC3053E.f32835D0);
        AbstractC3159y.h(string, "getString(...)");
        textView.setText(E0.b(b8, c8, string));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        N0 n02 = new N0(context);
        this.f27409a = n02;
        G2.t b8 = G2.t.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        this.f27413e = b8;
        int a8 = n02.a();
        int d8 = n02.d();
        int e8 = n02.e();
        N0.a aVar = N0.f27436g;
        this.f27410b = aVar.b(a8) ? ContextCompat.getColor(context, j2.x.f33098a) : a8;
        this.f27412d = aVar.b(d8) ? ContextCompat.getColor(context, j2.x.f33100c) : d8;
        this.f27411c = aVar.b(e8) ? ContextCompat.getColor(context, j2.x.f33101d) : e8;
    }
}
