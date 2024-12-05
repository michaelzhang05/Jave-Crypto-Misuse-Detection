package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b3.C1859D;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class SelectShippingMethodWidget extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final K0 f27585a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    public final C1859D getSelectedShippingMethod() {
        return this.f27585a.b();
    }

    public final void setSelectedShippingMethod(C1859D shippingMethod) {
        AbstractC3159y.i(shippingMethod, "shippingMethod");
        this.f27585a.g(shippingMethod);
    }

    public final void setShippingMethodSelectedCallback(Function1 callback) {
        AbstractC3159y.i(callback, "callback");
        this.f27585a.f(callback);
    }

    public final void setShippingMethods(List<C1859D> shippingMethods) {
        AbstractC3159y.i(shippingMethods, "shippingMethods");
        this.f27585a.i(shippingMethods);
    }

    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        K0 k02 = new K0();
        this.f27585a = k02;
        G2.u b8 = G2.u.b(LayoutInflater.from(context), this);
        AbstractC3159y.h(b8, "inflate(...)");
        RecyclerView recyclerView = b8.f3181b;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(k02);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}
