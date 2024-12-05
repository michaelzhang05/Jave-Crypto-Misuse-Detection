package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class BrandZoneView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f27993a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f27994b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    public final ImageView getIssuerImageView$3ds2sdk_release() {
        return this.f27993a;
    }

    public final ImageView getPaymentSystemImageView$3ds2sdk_release() {
        return this.f27994b;
    }

    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        T3.a b8 = T3.a.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        ImageView issuerImage = b8.f10015b;
        AbstractC3255y.h(issuerImage, "issuerImage");
        this.f27993a = issuerImage;
        ImageView paymentSystemImage = b8.f10016c;
        AbstractC3255y.h(paymentSystemImage, "paymentSystemImage");
        this.f27994b = paymentSystemImage;
    }
}
