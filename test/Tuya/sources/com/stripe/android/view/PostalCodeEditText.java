package com.stripe.android.view;

import a6.AbstractC1577b;
import a6.C1576a;
import a6.InterfaceC1580e;
import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.text.method.TextKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.appcompat.R;
import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.material.textfield.TextInputLayout;
import j2.AbstractC3053E;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.AbstractC3685e;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PostalCodeEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC1580e f27560p;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ e6.i[] f27557r = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};

    /* renamed from: q, reason: collision with root package name */
    private static final a f27556q = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f27558s = 8;

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f27559t = Pattern.compile("^[0-9]{5}$");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f27561a = new b("Global", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f27562b = new b("US", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f27563c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f27564d;

        static {
            b[] a8 = a();
            f27563c = a8;
            f27564d = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f27561a, f27562b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f27563c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27565a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f27561a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f27562b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27565a = iArr;
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements TextWatcher {
        public d() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PostalCodeEditText.this.setShouldShowError(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC1577b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostalCodeEditText f27567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, PostalCodeEditText postalCodeEditText) {
            super(obj);
            this.f27567b = postalCodeEditText;
        }

        @Override // a6.AbstractC1577b
        protected void a(e6.i property, Object obj, Object obj2) {
            AbstractC3159y.i(property, "property");
            int i8 = c.f27565a[((b) obj2).ordinal()];
            if (i8 == 1) {
                this.f27567b.n();
            } else if (i8 == 2) {
                this.f27567b.o();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    private final TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        q(AbstractC3685e.f37580g);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
        setFilters(new InputFilter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        q(AbstractC3685e.f37583j);
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(5)});
        setKeyListener(DigitsKeyListener.getInstance(false, true));
        j();
    }

    private final void q(int i8) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            if (textInputLayout.isHintEnabled()) {
                textInputLayout.setHint(getResources().getString(i8));
            } else {
                setHint(i8);
            }
        }
    }

    public final b getConfig$payments_core_release() {
        return (b) this.f27560p.getValue(this, f27557r[0]);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() == b.f27562b) {
            String fieldText$payments_core_release = getFieldText$payments_core_release();
            if (!f27559t.matcher(getFieldText$payments_core_release()).matches()) {
                return null;
            }
            return fieldText$payments_core_release;
        }
        return getFieldText$payments_core_release();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        n();
    }

    public final boolean p() {
        if ((getConfig$payments_core_release() == b.f27562b && f27559t.matcher(getFieldText$payments_core_release()).matches()) || (getConfig$payments_core_release() == b.f27561a && getFieldText$payments_core_release().length() > 0)) {
            return true;
        }
        return false;
    }

    public final void setConfig$payments_core_release(b bVar) {
        AbstractC3159y.i(bVar, "<set-?>");
        this.f27560p.setValue(this, f27557r[0], bVar);
    }

    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
        C1576a c1576a = C1576a.f13563a;
        this.f27560p = new e(b.f27561a, this);
        setErrorMessage(getResources().getString(AbstractC3053E.f32917y0));
        setMaxLines(1);
        addTextChangedListener(new d());
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
        }
    }
}
