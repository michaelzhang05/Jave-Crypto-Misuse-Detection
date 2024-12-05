package androidx.core.os;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    private static final i f2161b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    private final n f2162a;

    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final Locale[] f2163a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }

        private static boolean b(Locale locale) {
            for (Locale locale2 : f2163a) {
                if (locale2.equals(locale)) {
                    return true;
                }
            }
            return false;
        }

        static boolean c(Locale locale, Locale locale2) {
            if (locale.equals(locale2)) {
                return true;
            }
            if (!locale.getLanguage().equals(locale2.getLanguage()) || b(locale) || b(locale2)) {
                return false;
            }
            String a6 = androidx.core.text.b.a(locale);
            if (!a6.isEmpty()) {
                return a6.equals(androidx.core.text.b.a(locale2));
            }
            String country = locale.getCountry();
            return country.isEmpty() || country.equals(locale2.getCountry());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {
        static LocaleList a(Locale... localeArr) {
            l.a();
            return k.a(localeArr);
        }

        static LocaleList b() {
            LocaleList adjustedDefault;
            adjustedDefault = LocaleList.getAdjustedDefault();
            return adjustedDefault;
        }

        static LocaleList c() {
            LocaleList localeList;
            localeList = LocaleList.getDefault();
            return localeList;
        }
    }

    private i(n nVar) {
        this.f2162a = nVar;
    }

    public static i a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? i(b.a(localeArr)) : new i(new m(localeArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] split = str.split("-", -1);
            if (split.length > 2) {
                return new Locale(split[0], split[1], split[2]);
            }
            if (split.length > 1) {
                return new Locale(split[0], split[1]);
            }
            if (split.length == 1) {
                return new Locale(split[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] split2 = str.split("_", -1);
            if (split2.length > 2) {
                return new Locale(split2[0], split2[1], split2[2]);
            }
            if (split2.length > 1) {
                return new Locale(split2[0], split2[1]);
            }
            if (split2.length == 1) {
                return new Locale(split2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static i c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i6 = 0; i6 < length; i6++) {
            localeArr[i6] = a.a(split[i6]);
        }
        return a(localeArr);
    }

    public static i e() {
        return f2161b;
    }

    public static i i(LocaleList localeList) {
        return new i(new s(localeList));
    }

    public Locale d(int i6) {
        return this.f2162a.get(i6);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f2162a.equals(((i) obj).f2162a);
    }

    public boolean f() {
        return this.f2162a.isEmpty();
    }

    public int g() {
        return this.f2162a.size();
    }

    public String h() {
        return this.f2162a.b();
    }

    public int hashCode() {
        return this.f2162a.hashCode();
    }

    public String toString() {
        return this.f2162a.toString();
    }
}
