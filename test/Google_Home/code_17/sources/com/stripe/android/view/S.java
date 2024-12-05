package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import y2.C4202a;

/* loaded from: classes4.dex */
public final class S implements AutoCompleteTextView.Validator {

    /* renamed from: a, reason: collision with root package name */
    private final Q f28631a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f28632b;

    public S(Q countryAdapter, Function1 onCountrySelected) {
        AbstractC3255y.i(countryAdapter, "countryAdapter");
        AbstractC3255y.i(onCountrySelected, "onCountrySelected");
        this.f28631a = countryAdapter;
        this.f28632b = onCountrySelected;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public CharSequence fixText(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        return charSequence;
    }

    @Override // android.widget.AutoCompleteTextView.Validator
    public boolean isValid(CharSequence charSequence) {
        Object obj;
        Iterator it = this.f28631a.e().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((C4202a) obj).g(), String.valueOf(charSequence))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f28632b.invoke(obj);
        if (((C4202a) obj) != null) {
            return true;
        }
        return false;
    }
}
