package F6;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f2905j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f2906k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f2907l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f2908m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    private final String f2909a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2910b;

    /* renamed from: c, reason: collision with root package name */
    private final long f2911c;

    /* renamed from: d, reason: collision with root package name */
    private final String f2912d;

    /* renamed from: e, reason: collision with root package name */
    private final String f2913e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f2914f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f2915g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f2916h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f2917i;

    private k(String str, String str2, long j8, String str3, String str4, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f2909a = str;
        this.f2910b = str2;
        this.f2911c = j8;
        this.f2912d = str3;
        this.f2913e = str4;
        this.f2914f = z8;
        this.f2915g = z9;
        this.f2917i = z10;
        this.f2916h = z11;
    }

    private static int a(String str, int i8, int i9, boolean z8) {
        boolean z9;
        while (i8 < i9) {
            char charAt = str.charAt(i8);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && charAt != ':')))) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9 == (!z8)) {
                return i8;
            }
            i8++;
        }
        return i9;
    }

    private static boolean b(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        if (str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !G6.c.D(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static F6.k d(long r23, F6.r r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.k.d(long, F6.r, java.lang.String):F6.k");
    }

    public static k e(r rVar, String str) {
        return d(System.currentTimeMillis(), rVar, str);
    }

    public static List f(r rVar, q qVar) {
        List g8 = qVar.g("Set-Cookie");
        int size = g8.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            k e8 = e(rVar, (String) g8.get(i8));
            if (e8 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(e8);
            }
        }
        if (arrayList != null) {
            return DesugarCollections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static String g(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String b8 = G6.c.b(str);
            if (b8 != null) {
                return b8;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long h(String str, int i8, int i9) {
        int a8 = a(str, i8, i9, false);
        Matcher matcher = f2908m.matcher(str);
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        while (a8 < i9) {
            int a9 = a(str, a8 + 1, i9, true);
            matcher.region(a8, a9);
            if (i11 == -1 && matcher.usePattern(f2908m).matches()) {
                i11 = Integer.parseInt(matcher.group(1));
                i14 = Integer.parseInt(matcher.group(2));
                i15 = Integer.parseInt(matcher.group(3));
            } else if (i12 == -1 && matcher.usePattern(f2907l).matches()) {
                i12 = Integer.parseInt(matcher.group(1));
            } else {
                if (i13 == -1) {
                    Pattern pattern = f2906k;
                    if (matcher.usePattern(pattern).matches()) {
                        i13 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i10 == -1 && matcher.usePattern(f2905j).matches()) {
                    i10 = Integer.parseInt(matcher.group(1));
                }
            }
            a8 = a(str, a9 + 1, i9, false);
        }
        if (i10 >= 70 && i10 <= 99) {
            i10 += 1900;
        }
        if (i10 >= 0 && i10 <= 69) {
            i10 += 2000;
        }
        if (i10 >= 1601) {
            if (i13 != -1) {
                if (i12 >= 1 && i12 <= 31) {
                    if (i11 >= 0 && i11 <= 23) {
                        if (i14 >= 0 && i14 <= 59) {
                            if (i15 >= 0 && i15 <= 59) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(G6.c.f3235p);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i10);
                                gregorianCalendar.set(2, i13 - 1);
                                gregorianCalendar.set(5, i12);
                                gregorianCalendar.set(11, i11);
                                gregorianCalendar.set(12, i14);
                                gregorianCalendar.set(13, i15);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException();
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    private static long i(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e8) {
            if (str.matches("-?\\d+")) {
                if (str.startsWith("-")) {
                    return Long.MIN_VALUE;
                }
                return Long.MAX_VALUE;
            }
            throw e8;
        }
    }

    public String c() {
        return this.f2909a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (!kVar.f2909a.equals(this.f2909a) || !kVar.f2910b.equals(this.f2910b) || !kVar.f2912d.equals(this.f2912d) || !kVar.f2913e.equals(this.f2913e) || kVar.f2911c != this.f2911c || kVar.f2914f != this.f2914f || kVar.f2915g != this.f2915g || kVar.f2916h != this.f2916h || kVar.f2917i != this.f2917i) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = (((((((527 + this.f2909a.hashCode()) * 31) + this.f2910b.hashCode()) * 31) + this.f2912d.hashCode()) * 31) + this.f2913e.hashCode()) * 31;
        long j8 = this.f2911c;
        return ((((((((hashCode + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (!this.f2914f ? 1 : 0)) * 31) + (!this.f2915g ? 1 : 0)) * 31) + (!this.f2916h ? 1 : 0)) * 31) + (!this.f2917i ? 1 : 0);
    }

    String j(boolean z8) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2909a);
        sb.append('=');
        sb.append(this.f2910b);
        if (this.f2916h) {
            if (this.f2911c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(J6.d.a(new Date(this.f2911c)));
            }
        }
        if (!this.f2917i) {
            sb.append("; domain=");
            if (z8) {
                sb.append(".");
            }
            sb.append(this.f2912d);
        }
        sb.append("; path=");
        sb.append(this.f2913e);
        if (this.f2914f) {
            sb.append("; secure");
        }
        if (this.f2915g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public String k() {
        return this.f2910b;
    }

    public String toString() {
        return j(false);
    }
}
