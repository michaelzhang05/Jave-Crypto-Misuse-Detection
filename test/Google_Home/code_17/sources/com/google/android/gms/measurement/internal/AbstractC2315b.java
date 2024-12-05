package com.google.android.gms.measurement.internal;

import Q.AbstractC1400p;
import com.google.android.gms.internal.measurement.L1;
import j$.util.DesugarCollections;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2315b {

    /* renamed from: a, reason: collision with root package name */
    String f17461a;

    /* renamed from: b, reason: collision with root package name */
    int f17462b;

    /* renamed from: c, reason: collision with root package name */
    Boolean f17463c;

    /* renamed from: d, reason: collision with root package name */
    Boolean f17464d;

    /* renamed from: e, reason: collision with root package name */
    Long f17465e;

    /* renamed from: f, reason: collision with root package name */
    Long f17466f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2315b(String str, int i8) {
        this.f17461a = str;
        this.f17462b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean b(double d8, com.google.android.gms.internal.measurement.J1 j12) {
        try {
            return h(new BigDecimal(d8), j12, Math.ulp(d8));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean c(long j8, com.google.android.gms.internal.measurement.J1 j12) {
        try {
            return h(new BigDecimal(j8), j12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean d(Boolean bool, boolean z8) {
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
    public static Boolean e(String str, com.google.android.gms.internal.measurement.J1 j12) {
        if (!W5.h0(str)) {
            return null;
        }
        try {
            return h(new BigDecimal(str), j12, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static Boolean f(String str, L1.b bVar, boolean z8, String str2, List list, String str3, C2367i2 c2367i2) {
        int i8;
        if (str == null) {
            return null;
        }
        if (bVar == L1.b.IN_LIST) {
            if (list == null || list.isEmpty()) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z8 && bVar != L1.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (f6.f17576a[bVar.ordinal()]) {
            case 1:
                if (str3 == null) {
                    return null;
                }
                if (z8) {
                    i8 = 0;
                } else {
                    i8 = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i8).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (c2367i2 != null) {
                        c2367i2.L().b("Invalid regular expression in REGEXP audience filter. expression", str3);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Boolean g(String str, com.google.android.gms.internal.measurement.L1 l12, C2367i2 c2367i2) {
        String J8;
        List list;
        String str2;
        AbstractC1400p.l(l12);
        if (str == null || !l12.O() || l12.G() == L1.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        L1.b G8 = l12.G();
        L1.b bVar = L1.b.IN_LIST;
        if (G8 == bVar) {
            if (l12.j() == 0) {
                return null;
            }
        } else if (!l12.N()) {
            return null;
        }
        L1.b G9 = l12.G();
        boolean L8 = l12.L();
        if (!L8 && G9 != L1.b.REGEXP && G9 != bVar) {
            J8 = l12.J().toUpperCase(Locale.ENGLISH);
        } else {
            J8 = l12.J();
        }
        String str3 = J8;
        if (l12.j() == 0) {
            list = null;
        } else {
            List K8 = l12.K();
            if (!L8) {
                ArrayList arrayList = new ArrayList(K8.size());
                Iterator it = K8.iterator();
                while (it.hasNext()) {
                    arrayList.add(((String) it.next()).toUpperCase(Locale.ENGLISH));
                }
                K8 = DesugarCollections.unmodifiableList(arrayList);
            }
            list = K8;
        }
        if (G9 == L1.b.REGEXP) {
            str2 = str3;
        } else {
            str2 = null;
        }
        return f(str, G9, L8, str3, list, str2, c2367i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0080, code lost:
    
        if (r3 != null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.Boolean h(java.math.BigDecimal r8, com.google.android.gms.internal.measurement.J1 r9, double r10) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AbstractC2315b.h(java.math.BigDecimal, com.google.android.gms.internal.measurement.J1, double):java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean i();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract boolean j();
}
