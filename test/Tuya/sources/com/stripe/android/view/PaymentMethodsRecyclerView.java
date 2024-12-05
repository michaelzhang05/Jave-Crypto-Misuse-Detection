package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PaymentMethodsRecyclerView extends RecyclerView {

    /* renamed from: a, reason: collision with root package name */
    private Function1 f27552a;

    /* renamed from: b, reason: collision with root package name */
    private com.stripe.android.model.o f27553b;

    /* loaded from: classes4.dex */
    public static final class a extends DefaultItemAnimator {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
        public void onAnimationFinished(RecyclerView.ViewHolder viewHolder) {
            AbstractC3159y.i(viewHolder, "viewHolder");
            super.onAnimationFinished(viewHolder);
            com.stripe.android.model.o tappedPaymentMethod$payments_core_release = PaymentMethodsRecyclerView.this.getTappedPaymentMethod$payments_core_release();
            if (tappedPaymentMethod$payments_core_release != null) {
                PaymentMethodsRecyclerView.this.getPaymentMethodSelectedCallback$payments_core_release().invoke(tappedPaymentMethod$payments_core_release);
            }
            PaymentMethodsRecyclerView.this.setTappedPaymentMethod$payments_core_release(null);
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27555a = new b();

        b() {
            super(1);
        }

        public final void a(com.stripe.android.model.o it) {
            AbstractC3159y.i(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.stripe.android.model.o) obj);
            return L5.I.f6487a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    public final /* synthetic */ void a(ItemTouchHelper.SimpleCallback callback) {
        AbstractC3159y.i(callback, "callback");
        new ItemTouchHelper(callback).attachToRecyclerView(this);
    }

    public final Function1 getPaymentMethodSelectedCallback$payments_core_release() {
        return this.f27552a;
    }

    public final com.stripe.android.model.o getTappedPaymentMethod$payments_core_release() {
        return this.f27553b;
    }

    public final void setPaymentMethodSelectedCallback$payments_core_release(Function1 function1) {
        AbstractC3159y.i(function1, "<set-?>");
        this.f27552a = function1;
    }

    public final void setTappedPaymentMethod$payments_core_release(com.stripe.android.model.o oVar) {
        this.f27553b = oVar;
    }

    public /* synthetic */ PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRecyclerView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27552a = b.f27555a;
        setHasFixedSize(false);
        setLayoutManager(new LinearLayoutManager(context));
        setItemAnimator(new a());
    }
}
