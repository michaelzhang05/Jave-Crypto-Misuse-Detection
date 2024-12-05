package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import e3.C2780D;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SelectShippingMethodWidget extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final K0 f28640a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    public final C2780D getSelectedShippingMethod() {
        return this.f28640a.b();
    }

    public final void setSelectedShippingMethod(C2780D shippingMethod) {
        AbstractC3255y.i(shippingMethod, "shippingMethod");
        this.f28640a.g(shippingMethod);
    }

    public final void setShippingMethodSelectedCallback(Function1 callback) {
        AbstractC3255y.i(callback, "callback");
        this.f28640a.f(callback);
    }

    public final void setShippingMethods(List<C2780D> shippingMethods) {
        AbstractC3255y.i(shippingMethods, "shippingMethods");
        this.f28640a.i(shippingMethods);
    }

    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        K0 k02 = new K0();
        this.f28640a = k02;
        J2.u b8 = J2.u.b(LayoutInflater.from(context), this);
        AbstractC3255y.h(b8, "inflate(...)");
        RecyclerView recyclerView = b8.f4900b;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(k02);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}
