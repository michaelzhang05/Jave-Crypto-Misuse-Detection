package com.stripe.android.view;

import android.R;
import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BecsDebitMandateAcceptanceTextView extends AppCompatTextView {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28217c = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(BecsDebitMandateAcceptanceTextView.class, "companyName", "getCompanyName()Ljava/lang/String;", 0))};

    /* renamed from: d, reason: collision with root package name */
    public static final int f28218d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final C2665t f28219a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2760e f28220b;

    /* loaded from: classes4.dex */
    public static final class a extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ BecsDebitMandateAcceptanceTextView f28221b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView) {
            super(obj);
            this.f28221b = becsDebitMandateAcceptanceTextView;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            CharSequence charSequence;
            AbstractC3255y.i(property, "property");
            String str = (String) obj2;
            BecsDebitMandateAcceptanceTextView becsDebitMandateAcceptanceTextView = this.f28221b;
            if (!(!j6.n.u(str))) {
                str = null;
            }
            if (str == null || (charSequence = this.f28221b.f28219a.a(str)) == null) {
                charSequence = "";
            }
            becsDebitMandateAcceptanceTextView.setText(charSequence);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    public final String getCompanyName() {
        return (String) this.f28220b.getValue(this, f28217c[0]);
    }

    public final void setCompanyName(String str) {
        AbstractC3255y.i(str, "<set-?>");
        this.f28220b.setValue(this, f28217c[0], str);
    }

    public /* synthetic */ BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.textViewStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitMandateAcceptanceTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28219a = new C2665t(context);
        setMovementMethod(LinkMovementMethod.getInstance());
        C2756a c2756a = C2756a.f31226a;
        this.f28220b = new a("", this);
    }
}
