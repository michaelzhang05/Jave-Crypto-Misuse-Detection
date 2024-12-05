package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import b3.C1858C;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: com.stripe.android.view.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2444f extends AbstractC2454k {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2472u f27676a;

    /* renamed from: b, reason: collision with root package name */
    private final CardMultilineWidget f27677b;

    /* renamed from: c, reason: collision with root package name */
    private final ShippingInfoWidget f27678c;

    /* renamed from: com.stripe.android.view.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements TextView.OnEditorActionListener {

        /* renamed from: a, reason: collision with root package name */
        private final AddPaymentMethodActivity f27679a;

        /* renamed from: b, reason: collision with root package name */
        private final C2444f f27680b;

        /* renamed from: c, reason: collision with root package name */
        private final C2449h0 f27681c;

        public a(AddPaymentMethodActivity activity, C2444f addPaymentMethodCardView, C2449h0 keyboardController) {
            AbstractC3159y.i(activity, "activity");
            AbstractC3159y.i(addPaymentMethodCardView, "addPaymentMethodCardView");
            AbstractC3159y.i(keyboardController, "keyboardController");
            this.f27679a = activity;
            this.f27680b = addPaymentMethodCardView;
            this.f27681c = keyboardController;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 == 6) {
                if (this.f27680b.getCreateParams() != null) {
                    this.f27681c.a();
                }
                this.f27679a.t();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.stripe.android.view.f$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27682a;

        static {
            int[] iArr = new int[EnumC2472u.values().length];
            try {
                iArr[EnumC2472u.f27970c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2472u.f27968a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2472u.f27969b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27682a = iArr;
        }
    }

    public /* synthetic */ C2444f(Context context, AttributeSet attributeSet, int i8, EnumC2472u enumC2472u, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? EnumC2472u.f27969b : enumC2472u);
    }

    private final void a(AddPaymentMethodActivity addPaymentMethodActivity) {
        a aVar = new a(addPaymentMethodActivity, this, new C2449h0(addPaymentMethodActivity));
        this.f27677b.getCardNumberEditText().setOnEditorActionListener(aVar);
        this.f27677b.getExpiryDateEditText().setOnEditorActionListener(aVar);
        this.f27677b.getCvcEditText().setOnEditorActionListener(aVar);
        this.f27677b.getPostalCodeEditText$payments_core_release().setOnEditorActionListener(aVar);
    }

    private final o.e getBillingDetails() {
        C1858C shippingInformation;
        if (this.f27676a != EnumC2472u.f27970c || (shippingInformation = this.f27678c.getShippingInformation()) == null) {
            return null;
        }
        return o.e.f24446e.a(shippingInformation);
    }

    @Override // com.stripe.android.view.AbstractC2454k
    public com.stripe.android.model.p getCreateParams() {
        int i8 = b.f27682a[this.f27676a.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return this.f27677b.getPaymentMethodCreateParams();
                }
                throw new L5.p();
            }
            return this.f27677b.getPaymentMethodCreateParams();
        }
        p.c paymentMethodCard = this.f27677b.getPaymentMethodCard();
        o.e billingDetails = getBillingDetails();
        if (paymentMethodCard != null && billingDetails != null) {
            return p.e.e(com.stripe.android.model.p.f24581u, paymentMethodCard, billingDetails, null, null, 12, null);
        }
        return null;
    }

    public final void setCardInputListener(A a8) {
        this.f27677b.setCardInputListener(a8);
    }

    @Override // com.stripe.android.view.AbstractC2454k
    public void setCommunicatingProgress(boolean z8) {
        this.f27677b.setEnabled(!z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2444f(Context context, AttributeSet attributeSet, int i8, EnumC2472u billingAddressFields) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(billingAddressFields, "billingAddressFields");
        this.f27676a = billingAddressFields;
        G2.d c8 = G2.d.c(LayoutInflater.from(context), this, true);
        AbstractC3159y.h(c8, "inflate(...)");
        CardMultilineWidget cardMultilineWidget = c8.f3107d;
        AbstractC3159y.h(cardMultilineWidget, "cardMultilineWidget");
        this.f27677b = cardMultilineWidget;
        cardMultilineWidget.setShouldShowPostalCode(billingAddressFields == EnumC2472u.f27969b);
        ShippingInfoWidget billingAddressWidget = c8.f3106c;
        AbstractC3159y.h(billingAddressWidget, "billingAddressWidget");
        this.f27678c = billingAddressWidget;
        if (billingAddressFields == EnumC2472u.f27970c) {
            billingAddressWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = context instanceof AddPaymentMethodActivity ? (AddPaymentMethodActivity) context : null;
        if (addPaymentMethodActivity != null) {
            a(addPaymentMethodActivity);
        }
    }
}
