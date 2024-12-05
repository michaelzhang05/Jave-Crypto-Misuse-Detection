package q4;

import L5.I;
import L5.s;
import L5.t;
import L5.x;
import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: q4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3659a {

    /* renamed from: a, reason: collision with root package name */
    public static final C3659a f37491a = new C3659a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f37492b = Q.e(x.a(a0.i("UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"), 2));

    /* renamed from: c, reason: collision with root package name */
    public static final int f37493c = 8;

    private C3659a() {
    }

    public final String a(long j8, String amountCurrencyCode, Locale targetLocale) {
        AbstractC3159y.i(amountCurrencyCode, "amountCurrencyCode");
        AbstractC3159y.i(targetLocale, "targetLocale");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        Currency currency = Currency.getInstance(upperCase);
        AbstractC3159y.h(currency, "getInstance(...)");
        return b(j8, currency, targetLocale);
    }

    public final String b(long j8, Currency amountCurrency, Locale targetLocale) {
        AbstractC3159y.i(amountCurrency, "amountCurrency");
        AbstractC3159y.i(targetLocale, "targetLocale");
        int c8 = c(amountCurrency);
        double pow = j8 / Math.pow(10.0d, c8);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
        try {
            s.a aVar = s.f6511b;
            AbstractC3159y.g(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(amountCurrency);
            decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(c8);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            s.b(I.f6487a);
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            s.b(t.a(th));
        }
        String format = currencyInstance.format(pow);
        AbstractC3159y.h(format, "format(...)");
        return format;
    }

    public final int c(Currency currency) {
        AbstractC3159y.i(currency, "currency");
        Map map = f37492b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Set set = (Set) entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            AbstractC3159y.h(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            if (set.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) AbstractC1246t.o0(arrayList);
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }
}
