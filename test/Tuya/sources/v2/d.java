package v2;

import M5.AbstractC1246t;
import M5.a0;
import g6.j;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    private static volatile Locale f38787d;

    /* renamed from: a, reason: collision with root package name */
    public static final d f38784a = new d();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f38785b = a0.i("AD", "AE", "AF", "AG", "AI", "AL", "AM", "AO", "AQ", "AR", "AT", "AU", "AW", "AX", "AZ", "BA", "BB", "BD", "BE", "BF", "BG", "BH", "BI", "BJ", "BL", "BM", "BN", "BO", "BQ", "BR", "BS", "BT", "BV", "BW", "BY", "BZ", "CA", "CD", "CF", "CG", "CH", "CI", "CK", "CL", "CM", "CN", "CO", "CR", "CV", "CW", "CY", "CZ", "DE", "DJ", "DK", "DM", "DO", "DZ", "EC", "EE", "EG", "EH", "ER", "ES", "ET", "FI", "FJ", "FK", "FO", "FR", "GA", "GB", "GD", "GE", "GF", "GG", "GH", "GI", "GL", "GM", "GN", "GP", "GQ", "GR", "GS", "GT", "GU", "GW", "GY", "HK", "HN", "HR", "HT", "HU", "ID", "IE", "IL", "IM", "IN", "IO", "IQ", "IS", "IT", "JE", "JM", "JO", "JP", "KE", "KG", "KH", "KI", "KM", "KN", "KR", "KW", "KY", "KZ", "LA", "LB", "LC", "LI", "LK", "LR", "LS", "LT", "LU", "LV", "LY", "MA", "MC", "MD", "ME", "MF", "MG", "MK", "ML", "MM", "MN", "MO", "MQ", "MR", "MS", "MT", "MU", "MV", "MW", "MX", "MY", "MZ", "NA", "NC", "NE", "NG", "NI", "NL", "NO", "NP", "NR", "NU", "NZ", "OM", "PA", "PE", "PF", "PG", "PH", "PK", "PL", "PM", "PN", "PR", "PS", "PT", "PY", "QA", "RE", "RO", "RS", "RU", "RW", "SA", "SB", "SC", "SE", "SG", "SH", "SI", "SJ", "SK", "SL", "SM", "SN", "SO", "SR", "SS", "ST", "SV", "SX", "SZ", "TA", "TC", "TD", "TF", "TG", "TH", "TJ", "TK", "TL", "TM", "TN", "TO", "TR", "TT", "TV", "TW", "TZ", "UA", "UG", "US", "UY", "UZ", "VA", "VC", "VE", "VG", "VN", "VU", "WF", "WS", "XK", "YE", "YT", "ZA", "ZM", "ZW");

    /* renamed from: c, reason: collision with root package name */
    private static final Set f38786c = a0.i("US", "GB", "CA");

    /* renamed from: e, reason: collision with root package name */
    private static volatile List f38788e = AbstractC1246t.m();

    /* loaded from: classes4.dex */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            d dVar = d.f38784a;
            return O5.a.a(dVar.c(((C3825a) obj).e()), dVar.c(((C3825a) obj2).e()));
        }
    }

    private d() {
    }

    private final List g(Locale locale) {
        Object obj;
        if (AbstractC3159y.d(locale, f38787d)) {
            return f38788e;
        }
        f38787d = locale;
        List i8 = i(locale);
        Iterator it = i8.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((C3825a) obj).c(), c.a(locale))) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        List q8 = AbstractC1246t.q(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : i8) {
            if (!AbstractC3159y.d(((C3825a) obj2).c(), c.a(locale))) {
                arrayList.add(obj2);
            }
        }
        f38788e = AbstractC1246t.G0(q8, AbstractC1246t.P0(arrayList, new a()));
        return f38788e;
    }

    private final List i(Locale locale) {
        Set<String> set = f38785b;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(set, 10));
        for (String str : set) {
            C3826b a8 = C3826b.Companion.a(str);
            String displayCountry = new Locale("", str).getDisplayCountry(locale);
            AbstractC3159y.h(displayCountry, "getDisplayCountry(...)");
            arrayList.add(new C3825a(a8, displayCountry));
        }
        return arrayList;
    }

    public final /* synthetic */ boolean a(String countryCode) {
        AbstractC3159y.i(countryCode, "countryCode");
        Set set = f38786c;
        String upperCase = countryCode.toUpperCase(Locale.ROOT);
        AbstractC3159y.h(upperCase, "toUpperCase(...)");
        return set.contains(upperCase);
    }

    public final /* synthetic */ boolean b(C3826b countryCode) {
        AbstractC3159y.i(countryCode, "countryCode");
        return f38786c.contains(countryCode.c());
    }

    public final String c(String name) {
        AbstractC3159y.i(name, "name");
        String lowerCase = name.toLowerCase(Locale.ROOT);
        AbstractC3159y.h(lowerCase, "toLowerCase(...)");
        String normalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFD);
        AbstractC3159y.h(normalize, "normalize(...)");
        return new j("[^\\p{ASCII}]").f(new j("[^A-Za-z ]").f(new j("\\p{Mn}+").f(normalize, ""), ""), "");
    }

    public final /* synthetic */ C3825a d(C3826b c3826b, Locale currentLocale) {
        Object obj;
        AbstractC3159y.i(currentLocale, "currentLocale");
        Iterator it = g(currentLocale).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((C3825a) obj).c(), c3826b)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (C3825a) obj;
    }

    public final /* synthetic */ C3826b e(String countryName, Locale currentLocale) {
        Object obj;
        AbstractC3159y.i(countryName, "countryName");
        AbstractC3159y.i(currentLocale, "currentLocale");
        Iterator it = g(currentLocale).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((C3825a) obj).e(), countryName)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C3825a c3825a = (C3825a) obj;
        if (c3825a == null) {
            return null;
        }
        return c3825a.c();
    }

    public final /* synthetic */ List f(Locale currentLocale) {
        AbstractC3159y.i(currentLocale, "currentLocale");
        return g(currentLocale);
    }

    public final Set h() {
        return f38785b;
    }
}
