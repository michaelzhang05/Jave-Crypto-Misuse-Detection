package com.stripe.android.view;

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
import d6.AbstractC2757b;
import d6.C2756a;
import d6.InterfaceC2760e;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;
import u2.AbstractC4058e;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class PostalCodeEditText extends StripeEditText {

    /* renamed from: p, reason: collision with root package name */
    private final InterfaceC2760e f28615p;

    /* renamed from: r, reason: collision with root package name */
    static final /* synthetic */ h6.i[] f28612r = {kotlin.jvm.internal.U.e(new kotlin.jvm.internal.E(PostalCodeEditText.class, "config", "getConfig$payments_core_release()Lcom/stripe/android/view/PostalCodeEditText$Config;", 0))};

    /* renamed from: q, reason: collision with root package name */
    private static final a f28611q = new a(null);

    /* renamed from: s, reason: collision with root package name */
    public static final int f28613s = 8;

    /* renamed from: t, reason: collision with root package name */
    private static final Pattern f28614t = Pattern.compile("^[0-9]{5}$");

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f28616a = new b("Global", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f28617b = new b("US", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ b[] f28618c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ U5.a f28619d;

        static {
            b[] a8 = a();
            f28618c = a8;
            f28619d = U5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f28616a, f28617b};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f28618c.clone();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28620a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f28616a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f28617b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f28620a = iArr;
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
    public static final class e extends AbstractC2757b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ PostalCodeEditText f28622b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, PostalCodeEditText postalCodeEditText) {
            super(obj);
            this.f28622b = postalCodeEditText;
        }

        @Override // d6.AbstractC2757b
        protected void a(h6.i property, Object obj, Object obj2) {
            AbstractC3255y.i(property, "property");
            int i8 = c.f28620a[((b) obj2).ordinal()];
            if (i8 == 1) {
                this.f28622b.n();
            } else if (i8 == 2) {
                this.f28622b.o();
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
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
        q(AbstractC4058e.f39960g);
        setKeyListener(TextKeyListener.getInstance());
        setInputType(112);
        setFilters(new InputFilter[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        q(AbstractC4058e.f39963j);
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
        return (b) this.f28615p.getValue(this, f28612r[0]);
    }

    public final String getPostalCode$payments_core_release() {
        if (getConfig$payments_core_release() == b.f28617b) {
            String fieldText$payments_core_release = getFieldText$payments_core_release();
            if (!f28614t.matcher(getFieldText$payments_core_release()).matches()) {
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
        if ((getConfig$payments_core_release() == b.f28617b && f28614t.matcher(getFieldText$payments_core_release()).matches()) || (getConfig$payments_core_release() == b.f28616a && getFieldText$payments_core_release().length() > 0)) {
            return true;
        }
        return false;
    }

    public final void setConfig$payments_core_release(b bVar) {
        AbstractC3255y.i(bVar, "<set-?>");
        this.f28615p.setValue(this, f28612r[0], bVar);
    }

    public /* synthetic */ PostalCodeEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostalCodeEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        C2756a c2756a = C2756a.f31226a;
        this.f28615p = new e(b.f28616a, this);
        setErrorMessage(getResources().getString(AbstractC3407E.f34893y0));
        setMaxLines(1);
        addTextChangedListener(new d());
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{HintConstants.AUTOFILL_HINT_POSTAL_CODE});
        }
    }
}
