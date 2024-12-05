package androidx.core.os;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
final class m implements n {

    /* renamed from: c, reason: collision with root package name */
    private static final Locale[] f2164c = new Locale[0];

    /* renamed from: d, reason: collision with root package name */
    private static final Locale f2165d = new Locale("en", "XA");

    /* renamed from: e, reason: collision with root package name */
    private static final Locale f2166e = new Locale("ar", "XB");

    /* renamed from: f, reason: collision with root package name */
    private static final Locale f2167f = i.b("en-Latn");

    /* renamed from: a, reason: collision with root package name */
    private final Locale[] f2168a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2169b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Locale... localeArr) {
        String sb;
        if (localeArr.length == 0) {
            this.f2168a = f2164c;
            sb = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb2 = new StringBuilder();
            for (int i6 = 0; i6 < localeArr.length; i6++) {
                Locale locale = localeArr[i6];
                if (locale == null) {
                    throw new NullPointerException("list[" + i6 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb2, locale2);
                    if (i6 < localeArr.length - 1) {
                        sb2.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f2168a = (Locale[]) arrayList.toArray(new Locale[0]);
            sb = sb2.toString();
        }
        this.f2169b = sb;
    }

    static void c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // androidx.core.os.n
    public Object a() {
        return null;
    }

    @Override // androidx.core.os.n
    public String b() {
        return this.f2169b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        Locale[] localeArr = ((m) obj).f2168a;
        if (this.f2168a.length != localeArr.length) {
            return false;
        }
        int i6 = 0;
        while (true) {
            Locale[] localeArr2 = this.f2168a;
            if (i6 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i6].equals(localeArr[i6])) {
                return false;
            }
            i6++;
        }
    }

    @Override // androidx.core.os.n
    public Locale get(int i6) {
        if (i6 >= 0) {
            Locale[] localeArr = this.f2168a;
            if (i6 < localeArr.length) {
                return localeArr[i6];
            }
        }
        return null;
    }

    public int hashCode() {
        int i6 = 1;
        for (Locale locale : this.f2168a) {
            i6 = (i6 * 31) + locale.hashCode();
        }
        return i6;
    }

    @Override // androidx.core.os.n
    public boolean isEmpty() {
        return this.f2168a.length == 0;
    }

    @Override // androidx.core.os.n
    public int size() {
        return this.f2168a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i6 = 0;
        while (true) {
            Locale[] localeArr = this.f2168a;
            if (i6 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i6]);
            if (i6 < this.f2168a.length - 1) {
                sb.append(',');
            }
            i6++;
        }
    }
}
