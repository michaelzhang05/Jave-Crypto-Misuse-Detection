package com.stripe.android.view;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class E0 {

    /* renamed from: a, reason: collision with root package name */
    public static final E0 f27372a = new E0();

    private E0() {
    }

    public static final String b(long j8, Currency currency, String free) {
        AbstractC3159y.i(currency, "currency");
        AbstractC3159y.i(free, "free");
        if (j8 == 0) {
            return free;
        }
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        AbstractC3159y.g(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
        DecimalFormat decimalFormat = (DecimalFormat) currencyInstance;
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return f27372a.a(j8, currency);
    }

    public final /* synthetic */ String a(double d8, Currency currency) {
        AbstractC3159y.i(currency, "currency");
        double pow = d8 / Math.pow(10.0d, currency.getDefaultFractionDigits());
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();
        try {
            AbstractC3159y.g(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrencySymbol(currency.getSymbol(Locale.getDefault()));
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            String format = currencyInstance.format(pow);
            AbstractC3159y.f(format);
            return format;
        } catch (ClassCastException unused) {
            String format2 = currencyInstance.format(pow);
            AbstractC3159y.f(format2);
            return format2;
        }
    }
}
