package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.widget.TextView;
import com.stripe.android.model.o;
import com.stripe.android.model.p;
import e3.C2779C;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: com.stripe.android.view.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2638f extends AbstractC2648k {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC2666u f28731a;

    /* renamed from: b, reason: collision with root package name */
    private final CardMultilineWidget f28732b;

    /* renamed from: c, reason: collision with root package name */
    private final ShippingInfoWidget f28733c;

    /* renamed from: com.stripe.android.view.f$a */
    /* loaded from: classes4.dex */
    public static final class a implements TextView.OnEditorActionListener {

        /* renamed from: a, reason: collision with root package name */
        private final AddPaymentMethodActivity f28734a;

        /* renamed from: b, reason: collision with root package name */
        private final C2638f f28735b;

        /* renamed from: c, reason: collision with root package name */
        private final C2643h0 f28736c;

        public a(AddPaymentMethodActivity activity, C2638f addPaymentMethodCardView, C2643h0 keyboardController) {
            AbstractC3255y.i(activity, "activity");
            AbstractC3255y.i(addPaymentMethodCardView, "addPaymentMethodCardView");
            AbstractC3255y.i(keyboardController, "keyboardController");
            this.f28734a = activity;
            this.f28735b = addPaymentMethodCardView;
            this.f28736c = keyboardController;
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i8, KeyEvent keyEvent) {
            if (i8 == 6) {
                if (this.f28735b.getCreateParams() != null) {
                    this.f28736c.a();
                }
                this.f28734a.t();
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.stripe.android.view.f$b */
    /* loaded from: classes4.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28737a;

        static {
            int[] iArr = new int[EnumC2666u.values().length];
            try {
                iArr[EnumC2666u.f29025c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2666u.f29023a.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2666u.f29024b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f28737a = iArr;
        }
    }

    public /* synthetic */ C2638f(Context context, AttributeSet attributeSet, int i8, EnumC2666u enumC2666u, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8, (i9 & 8) != 0 ? EnumC2666u.f29024b : enumC2666u);
    }

    private final void a(AddPaymentMethodActivity addPaymentMethodActivity) {
        a aVar = new a(addPaymentMethodActivity, this, new C2643h0(addPaymentMethodActivity));
        this.f28732b.getCardNumberEditText().setOnEditorActionListener(aVar);
        this.f28732b.getExpiryDateEditText().setOnEditorActionListener(aVar);
        this.f28732b.getCvcEditText().setOnEditorActionListener(aVar);
        this.f28732b.getPostalCodeEditText$payments_core_release().setOnEditorActionListener(aVar);
    }

    private final o.e getBillingDetails() {
        C2779C shippingInformation;
        if (this.f28731a != EnumC2666u.f29025c || (shippingInformation = this.f28733c.getShippingInformation()) == null) {
            return null;
        }
        return o.e.f25501e.a(shippingInformation);
    }

    @Override // com.stripe.android.view.AbstractC2648k
    public com.stripe.android.model.p getCreateParams() {
        int i8 = b.f28737a[this.f28731a.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    return this.f28732b.getPaymentMethodCreateParams();
                }
                throw new O5.p();
            }
            return this.f28732b.getPaymentMethodCreateParams();
        }
        p.c paymentMethodCard = this.f28732b.getPaymentMethodCard();
        o.e billingDetails = getBillingDetails();
        if (paymentMethodCard != null && billingDetails != null) {
            return p.e.e(com.stripe.android.model.p.f25636u, paymentMethodCard, billingDetails, null, null, 12, null);
        }
        return null;
    }

    public final void setCardInputListener(A a8) {
        this.f28732b.setCardInputListener(a8);
    }

    @Override // com.stripe.android.view.AbstractC2648k
    public void setCommunicatingProgress(boolean z8) {
        this.f28732b.setEnabled(!z8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2638f(Context context, AttributeSet attributeSet, int i8, EnumC2666u billingAddressFields) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(billingAddressFields, "billingAddressFields");
        this.f28731a = billingAddressFields;
        J2.d c8 = J2.d.c(LayoutInflater.from(context), this, true);
        AbstractC3255y.h(c8, "inflate(...)");
        CardMultilineWidget cardMultilineWidget = c8.f4826d;
        AbstractC3255y.h(cardMultilineWidget, "cardMultilineWidget");
        this.f28732b = cardMultilineWidget;
        cardMultilineWidget.setShouldShowPostalCode(billingAddressFields == EnumC2666u.f29024b);
        ShippingInfoWidget billingAddressWidget = c8.f4825c;
        AbstractC3255y.h(billingAddressWidget, "billingAddressWidget");
        this.f28733c = billingAddressWidget;
        if (billingAddressFields == EnumC2666u.f29025c) {
            billingAddressWidget.setVisibility(0);
        }
        AddPaymentMethodActivity addPaymentMethodActivity = context instanceof AddPaymentMethodActivity ? (AddPaymentMethodActivity) context : null;
        if (addPaymentMethodActivity != null) {
            a(addPaymentMethodActivity);
        }
    }
}
