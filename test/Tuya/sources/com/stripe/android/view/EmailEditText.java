package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Patterns;
import androidx.appcompat.R;
import androidx.compose.runtime.internal.StabilityInferred;
import j2.AbstractC3053E;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class EmailEditText extends StripeEditText {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        AbstractC3159y.i(context, "context");
    }

    public final String getEmail() {
        String str;
        if (g6.n.u(getFieldText$payments_core_release())) {
            str = getResources().getString(AbstractC3053E.f32862U);
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getFieldText$payments_core_release()).matches()) {
            str = getResources().getString(AbstractC3053E.f32861T);
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

    public /* synthetic */ EmailEditText(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? R.attr.editTextStyle : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        AbstractC3159y.i(context, "context");
    }
}
