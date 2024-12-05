package com.google.android.gms.measurement.internal;

import R.AbstractC1319p;
import com.google.android.gms.internal.measurement.C2022j1;
import com.google.android.gms.internal.measurement.C2078q1;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class J4 {

    /* renamed from: a, reason: collision with root package name */
    final String f16186a;

    /* renamed from: b, reason: collision with root package name */
    final int f16187b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f16188c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f16189d;

    /* renamed from: e, reason: collision with root package name */
    Long f16190e;

    /* renamed from: f, reason: collision with root package name */
    Long f16191f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public J4(String str, int i8) {
        this.f16186a = str;
        this.f16187b = i8;
    }

    private static Boolean d(String str, int i8, boolean z8, String str2, List list, String str3, C2267u1 c2267u1) {
        int i9;
        if (i8 == 7) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z8 && i8 != 2) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (i8 - 1) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (true != z8) {
                    i9 = 66;
                } else {
                    i9 = 0;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i9).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c2267u1 != null) {
                        c2267u1.w().b("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                if (list == null) {
                    return null;
                }
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    static Boolean e(BigDecimal bigDecimal, C2022j1 c2022j1, double d8) {
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        BigDecimal bigDecimal4;
        AbstractC1319p.l(c2022j1);
        if (c2022j1.H()) {
            boolean z8 = true;
            if (c2022j1.O() != 1) {
                if (c2022j1.O() == 5) {
                    if (!c2022j1.N() || !c2022j1.M()) {
                        return null;
                    }
                } else if (!c2022j1.J()) {
                    return null;
                }
                int O8 = c2022j1.O();
                if (c2022j1.O() == 5) {
                    if (t4.P(c2022j1.F()) && t4.P(c2022j1.E())) {
                        try {
                            BigDecimal bigDecimal5 = new BigDecimal(c2022j1.F());
                            bigDecimal4 = new BigDecimal(c2022j1.E());
                            bigDecimal3 = bigDecimal5;
                            bigDecimal2 = null;
                        } catch (NumberFormatException unused) {
                        }
                    }
                    return null;
                }
                if (!t4.P(c2022j1.D())) {
                    return null;
                }
                try {
                    bigDecimal2 = new BigDecimal(c2022j1.D());
                    bigDecimal3 = null;
                    bigDecimal4 = null;
                } catch (NumberFormatException unused2) {
                }
                if (O8 == 5) {
                    if (bigDecimal3 == null) {
                        return null;
                    }
                } else if (bigDecimal2 == null) {
                    return null;
                }
                int i8 = O8 - 1;
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 != 4 || bigDecimal3 == null) {
                                return null;
                            }
                            if (bigDecimal.compareTo(bigDecimal3) < 0 || bigDecimal.compareTo(bigDecimal4) > 0) {
                                z8 = false;
                            }
                            return Boolean.valueOf(z8);
                        }
                        if (bigDecimal2 == null) {
                            return null;
                        }
                        if (d8 != 0.0d) {
                            if (bigDecimal.compareTo(bigDecimal2.subtract(new BigDecimal(d8).multiply(new BigDecimal(2)))) <= 0 || bigDecimal.compareTo(bigDecimal2.add(new BigDecimal(d8).multiply(new BigDecimal(2)))) >= 0) {
                                z8 = false;
                            }
                            return Boolean.valueOf(z8);
                        }
                        if (bigDecimal.compareTo(bigDecimal2) != 0) {
                            z8 = false;
                        }
                        return Boolean.valueOf(z8);
                    }
                    if (bigDecimal2 == null) {
                        return null;
                    }
                    if (bigDecimal.compareTo(bigDecimal2) <= 0) {
                        z8 = false;
                    }
                    return Boolean.valueOf(z8);
                }
                if (bigDecimal2 == null) {
                    return null;
                }
                if (bigDecimal.compareTo(bigDecimal2) >= 0) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean f(String str, C2078q1 c2078q1, C2267u1 c2267u1) {
        String E8;
        List list;
        String str2;
        AbstractC1319p.l(c2078q1);
        if (str == null || !c2078q1.K() || c2078q1.M() == 1) {
            return null;
        }
        if (c2078q1.M() == 7) {
            if (c2078q1.B() == 0) {
                return null;
            }
        } else if (!c2078q1.J()) {
            return null;
        }
        int M8 = c2078q1.M();
        boolean G8 = c2078q1.G();
        if (!G8 && M8 != 2 && M8 != 7) {
            E8 = c2078q1.E().toUpperCase(Locale.ENGLISH);
        } else {
            E8 = c2078q1.E();
        }
        String str3 = E8;
        if (c2078q1.B() == 0) {
            list = null;
        } else {
            List F8 = c2078q1.F();
            if (!G8) {
                ArrayList arrayList = new ArrayList(F8.size());
                Iterator it = F8.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                F8 = DesugarCollections.unmodifiableList(arrayList);
            }
            list = F8;
        }
        if (M8 == 2) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return d(str, M8, G8, str3, list, str2, c2267u1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(double d8, C2022j1 c2022j1) {
        try {
            return e(new BigDecimal(d8), c2022j1, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean h(long j8, C2022j1 c2022j1) {
        try {
            return e(new BigDecimal(j8), c2022j1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean i(String str, C2022j1 c2022j1) {
        if (!t4.P(str)) {
            return null;
        }
        try {
            return e(new BigDecimal(str), c2022j1, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean j(Boolean bool, boolean z8) {
        boolean z9;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        return Boolean.valueOf(z9);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean b();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean c();
}
