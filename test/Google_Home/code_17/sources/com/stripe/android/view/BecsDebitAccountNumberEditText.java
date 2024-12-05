package com.stripe.android.view;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class BecsDebitAccountNumberEditText extends StripeEditText {

    /* renamed from: q, reason: collision with root package name */
    public static final a f28202q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f28203r = 8;

    /* renamed from: p, reason: collision with root package name */
    private int f28204p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements TextWatcher {
        public b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            BecsDebitAccountNumberEditText.this.setShouldShowError(false);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3255y.i(context, "context");
    }

    public final String getAccountNumber() {
        String str;
        if (j6.n.u(getFieldText$payments_core_release())) {
            str = getResources().getString(AbstractC3407E.f34833P);
        } else if (getFieldText$payments_core_release().length() < this.f28204p) {
            str = getResources().getString(AbstractC3407E.f34832O);
        } else {
            str = null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage$payments_core_release() != null) {
            return null;
        }
        return fieldText$payments_core_release;
    }

    public final int getMinLength() {
        return this.f28204p;
    }

    public final void setMinLength(int i8) {
        this.f28204p = i8;
    }

    public /* synthetic */ BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3255y.i(context, "context");
        this.f28204p = 5;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(9)});
        setInputType(2);
        addTextChangedListener(new b());
    }
}
