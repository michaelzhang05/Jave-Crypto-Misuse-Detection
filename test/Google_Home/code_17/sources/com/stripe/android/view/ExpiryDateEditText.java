package com.stripe.android.view;

import O5.s;
import P5.AbstractC1378t;
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
import com.mbridge.msdk.MBridgeConstans;
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import e3.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3404B;
import m2.AbstractC3407E;
import m4.AbstractC3435g;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ExpiryDateEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private /* synthetic */ Function0 f28431p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28432q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC2760e f28433r;

    /* renamed from: s, reason: collision with root package name */
    private final int f28434s;

    /* renamed from: t, reason: collision with root package name */
    private String f28435t;

    /* renamed from: v, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28429v = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0))};

    /* renamed from: u, reason: collision with root package name */
    private static final a f28428u = new a(null);

    /* renamed from: w, reason: collision with root package name */
    public static final int f28430w = 8;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28436a = new b();

        b() {
            super(0);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5561invoke() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5561invoke();
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends Q0 {

        /* renamed from: a, reason: collision with root package name */
        private int f28437a;

        /* renamed from: b, reason: collision with root package name */
        private int f28438b;

        /* renamed from: c, reason: collision with root package name */
        private w.a f28439c = w.a.f31591f.b();

        /* renamed from: d, reason: collision with root package name */
        private Integer f28440d;

        /* renamed from: e, reason: collision with root package name */
        private String f28441e;

        c() {
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            boolean z8;
            int i8;
            String str = this.f28441e;
            boolean z9 = false;
            if (str != null) {
                ExpiryDateEditText.this.setTextSilent$payments_core_release(str);
                Integer num = this.f28440d;
                if (num != null) {
                    ExpiryDateEditText expiryDateEditText = ExpiryDateEditText.this;
                    expiryDateEditText.setSelection(g6.m.k(num.intValue(), 0, expiryDateEditText.getFieldText$payments_core_release().length()));
                }
            }
            String b8 = this.f28439c.b();
            String c8 = this.f28439c.c();
            if (b8.length() == 2 && !this.f28439c.e()) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (b8.length() != 2 || c8.length() != 2) {
                ExpiryDateEditText.this.f28432q = false;
            } else {
                boolean s8 = ExpiryDateEditText.this.s();
                ExpiryDateEditText expiryDateEditText2 = ExpiryDateEditText.this;
                expiryDateEditText2.f28432q = expiryDateEditText2.t(b8, c8);
                boolean z10 = !ExpiryDateEditText.this.s();
                if (!s8 && ExpiryDateEditText.this.s()) {
                    ExpiryDateEditText.this.getCompletionCallback$payments_core_release().invoke();
                }
                z8 = z10;
            }
            ExpiryDateEditText expiryDateEditText3 = ExpiryDateEditText.this;
            Resources resources = expiryDateEditText3.getResources();
            if (this.f28439c.f()) {
                i8 = AbstractC3435g.f35160F;
            } else if (!this.f28439c.e()) {
                i8 = AbstractC3435g.f35162H;
            } else {
                i8 = AbstractC3435g.f35163I;
            }
            expiryDateEditText3.setErrorMessage(resources.getString(i8));
            ExpiryDateEditText expiryDateEditText4 = ExpiryDateEditText.this;
            if (z8 && (this.f28439c.f() || this.f28439c.d())) {
                z9 = true;
            }
            expiryDateEditText4.setShouldShowError(z9);
            this.f28441e = null;
            this.f28440d = null;
        }

        @Override // com.stripe.android.view.Q0, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            this.f28437a = i8;
            this.f28438b = i10;
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
            AbstractC3255y.h(sb2, "toString(...)");
            if (sb2.length() == 1 && this.f28437a == 0 && this.f28438b == 1) {
                char charAt2 = sb2.charAt(0);
                if (charAt2 != '0' && charAt2 != '1') {
                    sb2 = MBridgeConstans.ENDCARD_URL_TYPE_PL + sb2;
                    this.f28438b++;
                }
            } else if (sb2.length() == 2 && this.f28437a == 2 && this.f28438b == 0) {
                sb2 = sb2.substring(0, 1);
                AbstractC3255y.h(sb2, "substring(...)");
            }
            w.a a8 = w.a.f31591f.a(sb2);
            this.f28439c = a8;
            boolean z8 = !a8.e();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a8.b());
            if ((a8.b().length() == 2 && this.f28438b > 0 && !z8) || sb2.length() > 2) {
                sb3.append(ExpiryDateEditText.this.f28435t);
            }
            sb3.append(a8.c());
            String sb4 = sb3.toString();
            AbstractC3255y.h(sb4, "toString(...)");
            this.f28440d = Integer.valueOf(ExpiryDateEditText.this.u(sb4.length(), this.f28437a, this.f28438b, ExpiryDateEditText.this.f28434s + ExpiryDateEditText.this.f28435t.length()));
            this.f28441e = sb4;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ExpiryDateEditText f28443b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, ExpiryDateEditText expiryDateEditText) {
            super(obj);
            this.f28443b = expiryDateEditText;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            boolean booleanValue = ((Boolean) obj2).booleanValue();
            ((Boolean) obj).booleanValue();
            this.f28443b.v(booleanValue);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    private final void i() {
        addTextChangedListener(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ExpiryDateEditText this$0, View view, boolean z8) {
        Editable text;
        AbstractC3255y.i(this$0, "this$0");
        if (!z8 && (text = this$0.getText()) != null && text.length() != 0 && !this$0.f28432q) {
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
                s.a aVar = O5.s.f8302b;
                b8 = O5.s.b(Integer.valueOf(Integer.parseInt(str)));
            } catch (Throwable th) {
                s.a aVar2 = O5.s.f8302b;
                b8 = O5.s.b(O5.t.a(th));
            }
            if (O5.s.g(b8)) {
                b8 = obj2;
            }
            intValue = ((Number) b8).intValue();
        }
        if (str2.length() == 2) {
            try {
                s.a aVar3 = O5.s.f8302b;
                obj = O5.s.b(Integer.valueOf(X.f28694a.a(Integer.parseInt(str2))));
            } catch (Throwable th2) {
                s.a aVar4 = O5.s.f8302b;
                obj = O5.s.b(O5.t.a(th2));
            }
            if (!O5.s.g(obj)) {
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
        this.f28435t = str;
        setFilters((InputFilter[]) AbstractC1378t.e(new InputFilter.LengthFilter(this.f28434s + this.f28435t.length())).toArray(new InputFilter.LengthFilter[0]));
    }

    static /* synthetic */ void w(ExpiryDateEditText expiryDateEditText, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        expiryDateEditText.v(z8);
    }

    @Override // com.stripe.android.view.StripeEditText
    protected String getAccessibilityText() {
        String string = getResources().getString(AbstractC3407E.f34852e, getText());
        AbstractC3255y.h(string, "getString(...)");
        return string;
    }

    public final Function0 getCompletionCallback$payments_core_release() {
        return this.f28431p;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.f28433r.getValue(this, f28429v[0])).booleanValue();
    }

    public final w.b getValidatedDate() {
        boolean z8 = this.f28432q;
        if (z8) {
            return w.a.f31591f.a(getFieldText$payments_core_release()).g();
        }
        if (!z8) {
            return null;
        }
        throw new O5.p();
    }

    public final boolean s() {
        return this.f28432q;
    }

    public final void setCompletionCallback$payments_core_release(Function0 function0) {
        AbstractC3255y.i(function0, "<set-?>");
        this.f28431p = function0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void setIncludeSeparatorGaps(boolean z8) {
        setIncludeSeparatorGaps$payments_core_release(z8);
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z8) {
        this.f28433r.setValue(this, f28429v[0], Boolean.valueOf(z8));
    }

    public final int u(int i8, int i9, int i10, int i11) {
        int i12;
        boolean z8;
        int i13 = 0;
        if (i9 <= 2 && i9 + i10 >= 2) {
            i12 = this.f28435t.length();
        } else {
            i12 = 0;
        }
        if (i10 == 0 && i9 == this.f28435t.length() + 2) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i14 = i9 + i10 + i12;
        if (z8 && i14 > 0) {
            i13 = this.f28435t.length();
        }
        return Math.min(i11, Math.min(i14 - i13, i8));
    }

    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28431p = b.f28436a;
        C2756a c2756a = C2756a.f31226a;
        this.f28433r = new d(Boolean.FALSE, this);
        this.f28434s = context.getResources().getInteger(AbstractC3404B.f34776a);
        this.f28435t = "/";
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
