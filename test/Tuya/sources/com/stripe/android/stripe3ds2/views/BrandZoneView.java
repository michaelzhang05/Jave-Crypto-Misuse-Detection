package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class BrandZoneView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f26938a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f26939b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    public final ImageView getIssuerImageView$3ds2sdk_release() {
        return this.f26938a;
    }

    public final ImageView getPaymentSystemImageView$3ds2sdk_release() {
        return this.f26939b;
    }

    public /* synthetic */ BrandZoneView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandZoneView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        Q3.a b8 = Q3.a.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        ImageView issuerImage = b8.f8218b;
        AbstractC3159y.h(issuerImage, "issuerImage");
        this.f26938a = issuerImage;
        ImageView paymentSystemImage = b8.f8219c;
        AbstractC3159y.h(paymentSystemImage, "paymentSystemImage");
        this.f26939b = paymentSystemImage;
    }
}
