package t4;

import O5.I;
import O5.s;
import O5.t;
import O5.x;
import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
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
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: t4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4038a {

    /* renamed from: a, reason: collision with root package name */
    public static final C4038a f39813a = new C4038a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f39814b = Q.e(x.a(a0.i("UGX", "AFN", "ALL", "AMD", "COP", "IDR", "ISK", "PKR", "LBP", "MMK", "LAK", "RSD"), 2));

    /* renamed from: c, reason: collision with root package name */
    public static final int f39815c = 8;

    private C4038a() {
    }

    public final String a(long j8, String amountCurrencyCode, Locale targetLocale) {
        AbstractC3255y.i(amountCurrencyCode, "amountCurrencyCode");
        AbstractC3255y.i(targetLocale, "targetLocale");
        String upperCase = amountCurrencyCode.toUpperCase(Locale.ROOT);
        AbstractC3255y.h(upperCase, "toUpperCase(...)");
        Currency currency = Currency.getInstance(upperCase);
        AbstractC3255y.h(currency, "getInstance(...)");
        return b(j8, currency, targetLocale);
    }

    public final String b(long j8, Currency amountCurrency, Locale targetLocale) {
        AbstractC3255y.i(amountCurrency, "amountCurrency");
        AbstractC3255y.i(targetLocale, "targetLocale");
        int c8 = c(amountCurrency);
        double pow = j8 / Math.pow(10.0d, c8);
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(targetLocale);
        try {
            s.a aVar = s.f8302b;
            AbstractC3255y.g(currencyInstance, "null cannot be cast to non-null type java.text.DecimalFormat");
            DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) currencyInstance).getDecimalFormatSymbols();
            decimalFormatSymbols.setCurrency(amountCurrency);
            decimalFormatSymbols.setCurrencySymbol(amountCurrency.getSymbol(targetLocale));
            ((DecimalFormat) currencyInstance).setMinimumFractionDigits(c8);
            ((DecimalFormat) currencyInstance).setDecimalFormatSymbols(decimalFormatSymbols);
            s.b(I.f8278a);
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            s.b(t.a(th));
        }
        String format = currencyInstance.format(pow);
        AbstractC3255y.h(format, "format(...)");
        return format;
    }

    public final int c(Currency currency) {
        AbstractC3255y.i(currency, "currency");
        Map map = f39814b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Set set = (Set) entry.getKey();
            String currencyCode = currency.getCurrencyCode();
            AbstractC3255y.h(currencyCode, "getCurrencyCode(...)");
            String upperCase = currencyCode.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            if (set.contains(upperCase)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Number) ((Map.Entry) it.next()).getValue()).intValue()));
        }
        Integer num = (Integer) AbstractC1378t.o0(arrayList);
        if (num != null) {
            return num.intValue();
        }
        return currency.getDefaultFractionDigits();
    }
}
