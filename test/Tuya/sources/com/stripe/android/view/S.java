package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import v2.C3825a;

/* loaded from: classes4.dex */
public final class S implements AutoCompleteTextView.Validator {

    /* renamed from: a, reason: collision with root package name */
    private final Q f27576a;

    /* renamed from: b, reason: collision with root package name */
    private final Function1 f27577b;

    public S(Q countryAdapter, Function1 onCountrySelected) {
        AbstractC3159y.i(countryAdapter, "countryAdapter");
        AbstractC3159y.i(onCountrySelected, "onCountrySelected");
        this.f27576a = countryAdapter;
        this.f27577b = onCountrySelected;
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
        Iterator it = this.f27576a.e().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((C3825a) obj).e(), String.valueOf(charSequence))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f27577b.invoke(obj);
        if (((C3825a) obj) != null) {
            return true;
        }
        return false;
    }
}
