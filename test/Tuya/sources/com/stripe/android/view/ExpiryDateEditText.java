package com.stripe.android.view;

import L5.s;
import M5.AbstractC1246t;
import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import b3.w;
import com.mbridge.msdk.MBridgeConstans;
import j2.AbstractC3050B;
import j2.AbstractC3053E;
import j4.AbstractC3081g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExpiryDateEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private /* synthetic */ Function0 f27376p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f27377q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC1580e f27378r;

    /* renamed from: s, reason: collision with root package name */
    private final int f27379s;

    /* renamed from: t, reason: collision with root package name */
    private String f27380t;

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27374v = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};

    /* renamed from: u, reason: collision with root package name */
    private static final a f27373u = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f27375w = 8;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27381a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5557invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5557invoke();
            return L5.I.f6487a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private int f27382a;

        /* renamed from: b, reason: collision with root package name */
        private int f27383b;

        /* renamed from: c, reason: collision with root package name */
        private w.a f27384c = w.a.f14585f.b();

        /* renamed from: d, reason: collision with root package name */
        private Integer f27385d;

        /* renamed from: e, reason: collision with root package name */
        private String f27386e;

        c() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z8;
            int i8;
            String str = this.f27386e;
            boolean z9 = false;
            if (str != null) {
                ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                Integer num = this.f27385d;
                if (num != null) {
                    ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                    expiryDateEditText.setSelection(d6.m.k(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
                }
            }
            String b8 = this.f27384c.b();
            String c8 = this.f27384c.c();
            if (b8.length() == 2 && !this.f27384c.e()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (b8.length() != 2 || c8.length() != 2) {
                ExpiryDateEditText.this.f27377q = false;
            } else {
                boolean s8 = ExpiryDateEditText.this.s();
                ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                expiryDateEditText2.f27377q = expiryDateEditText2.t(b8, c8);
                boolean z10 = !ExpiryDateEditText.this.s();
                if (!s8 && ExpiryDateEditText.this.s()) {
                    ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
                z8 = z10;
            }
            ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
            Resources resources = expiryDateEditText3.getResources();
            if (this.f27384c.f()) {
                i8 = AbstractC3081g.f33184F;
            } else if (!this.f27384c.e()) {
                i8 = AbstractC3081g.f33186H;
            } else {
                i8 = AbstractC3081g.f33187I;
            }
            expiryDateEditText3.setErrorMessage(resources.getString(i8));
            ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
            if (z8 && (this.f27384c.f() || this.f27384c.d())) {
                z9 = true;
            }
            expiryDateEditText4.setShouldShowError(z9);
            this.f27386e = null;
            this.f27385d = null;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f27382a = i8;
            this.f27383b = i10;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            String str;
            if (charSequence != null) {
                str = charSequence.toString();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            for (int i11 = 0; i11 < length; i11++) {
                char charAt = str.charAt(i11);
                if (Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            if (sb2.length() == 1 && this.f27382a == 0 && this.f27383b == 1) {
                char charAt2 = sb2.charAt(0);
                if (charAt2 != '0' && charAt2 != '1') {
                    sb2 = MBridgeConstans.ENDCARD_URL_TYPE_PL + sb2;
                    this.f27383b++;
                }
            } else if (sb2.length() == 2 && this.f27382a == 2 && this.f27383b == 0) {
                sb2 = sb2.substring(0, 1);
                AbstractC3159y.h(sb2, "substring(...)");
            }
            w.a a8 = w.a.f14585f.a(sb2);
            this.f27384c = a8;
            boolean z8 = !a8.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a8.b());
            if ((a8.b().length() == 2 && this.f27383b > 0 && !z8) || sb2.length() > 2) {
                sb3.append(ExpiryDateEditText.this.f27380t);
            }
            sb3.append(a8.c());
            String sb4 = sb3.toString();
            AbstractC3159y.h(sb4, "toString(...)");
            this.f27385d = Integer.valueOf(ExpiryDateEditText.this.u(sb4.length(), this.f27382a, this.f27383b, ExpiryDateEditText.this.f27379s + ExpiryDateEditText.this.f27380t.length()));
            this.f27386e = sb4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpiryDateEditText f27388b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ExpiryDateEditText expiryDateEditText) {
            super(obj);
            this.f27388b = expiryDateEditText;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f27388b.v(booleanValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final void i() {
        addTextChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ExpiryDateEditText this$0, View view, boolean z8) {
        Editable text;
        AbstractC3159y.i(this$0, "this$0");
        if (!z8 && (text = this$0.getText()) != null && text.length() != 0 && !this$0.f27377q) {
            this$0.setShouldShowError(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t(String str, String str2) {
        Object b8;
        int intValue;
        Object obj;
        int i8 = -1;
        Object obj2 = -1;
        if (str.length() != 2) {
            intValue = -1;
        } else {
            try {
                s.a aVar = L5.s.f6511b;
                b8 = L5.s.b(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th) {
                s.a aVar2 = L5.s.f6511b;
                b8 = L5.s.b(L5.t.a(th));
            }
            if (L5.s.g(b8)) {
                b8 = obj2;
            }
            intValue = ((Number) b8).intValue();
        }
        if (str2.length() == 2) {
            try {
                s.a aVar3 = L5.s.f6511b;
                obj = L5.s.b(Integer.valueOf(X.f27639a.a(Integer.parseInt(str2))));
            } catch (Throwable th2) {
                s.a aVar4 = L5.s.f6511b;
                obj = L5.s.b(L5.t.a(th2));
            }
            if (!L5.s.g(obj)) {
                obj2 = obj;
            }
            i8 = ((Number) obj2).intValue();
        }
        return X.c(intValue, i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(boolean z8) {
        String str;
        if (z8) {
            str = " / ";
        } else {
            str = "/";
        }
        this.f27380t = str;
        setFilters((InputFilter[]) AbstractC1246t.e(new InputFilter.LengthFilter(this.f27379s + this.f27380t.length())).toArray(new InputFilter.LengthFilter[0]));
    }

    static /* synthetic */ void w(ExpiryDateEditText expiryDateEditText, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        expiryDateEditText.v(z8);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3053E.f32876e, getText());
        AbstractC3159y.h(string, "getString(...)");
        return string;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f27376p;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.f27378r.getValue(this, f27374v[0])).booleanValue();
    }

    public final w.b getValidatedDate() {
        boolean z8 = this.f27377q;
        if (z8) {
            return w.a.f14585f.a(getFieldText$payments_core_release()).g();
        }
        if (!z8) {
            return null;
        }
        throw new L5.p();
    }

    public final boolean s() {
        return this.f27377q;
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3159y.i(function0, "<set-?>");
        this.f27376p = function0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setIncludeSeparatorGaps(boolean z8) {
        setIncludeSeparatorGaps$payments_core_release(z8);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z8) {
        this.f27378r.setValue(this, f27374v[0], Boolean.valueOf(z8));
    }

    public final int u(int i8, int i9, int i10, int i11) {
        int i12;
        boolean z8;
        int i13 = 0;
        if (i9 <= 2 && i9 + i10 >= 2) {
            i12 = this.f27380t.length();
        } else {
            i12 = 0;
        }
        if (i10 == 0 && i9 == this.f27380t.length() + 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i14 = i9 + i10 + i12;
        if (z8 && i14 > 0) {
            i13 = this.f27380t.length();
        }
        return Math.min(i11, Math.min(i14 - i13, i8));
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        this.f27376p = b.f27381a;
        C1576a c1576a = C1576a.f13563a;
        this.f27378r = new d(Boolean.FALSE, this);
        this.f27379s = context.getResources().getInteger(AbstractC3050B.f32800a);
        this.f27380t = "/";
        j();
        w(this, false, 1, null);
        i();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_CREDIT_CARD_EXPIRATION_DATE});
        }
        getInternalFocusChangeListeners().add(new View.OnFocusChangeListener() { // from class: com.stripe.android.view.e0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                ExpiryDateEditText.m(ExpiryDateEditText.this, view, z8);
            }
        });
        setLayoutDirection(0);
    }
}
