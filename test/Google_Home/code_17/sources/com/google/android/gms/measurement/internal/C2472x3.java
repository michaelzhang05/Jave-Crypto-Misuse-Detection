package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import l0.EnumC3280o;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2472x3 {

    /* renamed from: c, reason: collision with root package name */
    public static final C2472x3 f17896c = new C2472x3(null, null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f17897a;

    /* renamed from: b, reason: collision with root package name */
    private final int f17898b;

    /* renamed from: com.google.android.gms.measurement.internal.x3$a */
    /* loaded from: classes3.dex */
    public enum a {
        AD_STORAGE("ad_storage"),
        ANALYTICS_STORAGE("analytics_storage"),
        AD_USER_DATA("ad_user_data"),
        AD_PERSONALIZATION("ad_personalization");


        /* renamed from: a, reason: collision with root package name */
        public final String f17904a;

        a(String str) {
            this.f17904a = str;
        }
    }

    private C2472x3(EnumMap enumMap, int i8) {
        EnumMap enumMap2 = new EnumMap(a.class);
        this.f17897a = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17898b = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static char a(EnumC3280o enumC3280o) {
        if (enumC3280o != null) {
            int ordinal = enumC3280o.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return '1';
                    }
                    return '-';
                }
                return '0';
            }
            return '+';
        }
        return '-';
    }

    public static C2472x3 c(Bundle bundle, int i8) {
        a[] aVarArr;
        if (bundle == null) {
            return new C2472x3(null, null, i8);
        }
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC2479y3.STORAGE.f17925a;
        for (a aVar : aVarArr) {
            enumMap.put((EnumMap) aVar, (a) k(bundle.getString(aVar.f17904a)));
        }
        return new C2472x3(enumMap, i8);
    }

    public static C2472x3 e(String str, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        if (str == null) {
            str = "";
        }
        a[] a8 = EnumC2479y3.STORAGE.a();
        for (int i9 = 0; i9 < a8.length; i9++) {
            a aVar = a8[i9];
            int i10 = i9 + 2;
            if (i10 < str.length()) {
                enumMap.put((EnumMap) aVar, (a) i(str.charAt(i10)));
            } else {
                enumMap.put((EnumMap) aVar, (a) EnumC3280o.UNINITIALIZED);
            }
        }
        return new C2472x3(enumMap, i8);
    }

    public static C2472x3 f(EnumC3280o enumC3280o, EnumC3280o enumC3280o2, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        enumMap.put((EnumMap) a.AD_STORAGE, (a) enumC3280o);
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) enumC3280o2);
        return new C2472x3(enumMap, -10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(int i8) {
        if (i8 != -30) {
            if (i8 != -20) {
                if (i8 != -10) {
                    if (i8 != 0) {
                        if (i8 != 30) {
                            if (i8 != 90) {
                                if (i8 != 100) {
                                    return "OTHER";
                                }
                                return "UNKNOWN";
                            }
                            return "REMOTE_CONFIG";
                        }
                        return "1P_INIT";
                    }
                    return "1P_API";
                }
                return "MANIFEST";
            }
            return "API";
        }
        return "TCF";
    }

    public static String h(Bundle bundle) {
        a[] aVarArr;
        String string;
        aVarArr = EnumC2479y3.STORAGE.f17925a;
        int length = aVarArr.length;
        int i8 = 0;
        while (true) {
            Boolean bool = null;
            if (i8 >= length) {
                return null;
            }
            a aVar = aVarArr[i8];
            if (bundle.containsKey(aVar.f17904a) && (string = bundle.getString(aVar.f17904a)) != null) {
                if (string.equals("granted")) {
                    bool = Boolean.TRUE;
                } else if (string.equals("denied")) {
                    bool = Boolean.FALSE;
                }
                if (bool == null) {
                    return string;
                }
            }
            i8++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnumC3280o i(char c8) {
        if (c8 != '+') {
            if (c8 != '0') {
                if (c8 != '1') {
                    return EnumC3280o.UNINITIALIZED;
                }
                return EnumC3280o.GRANTED;
            }
            return EnumC3280o.DENIED;
        }
        return EnumC3280o.POLICY;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnumC3280o j(Boolean bool) {
        if (bool == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        if (bool.booleanValue()) {
            return EnumC3280o.GRANTED;
        }
        return EnumC3280o.DENIED;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static EnumC3280o k(String str) {
        if (str == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        if (str.equals("granted")) {
            return EnumC3280o.GRANTED;
        }
        if (str.equals("denied")) {
            return EnumC3280o.DENIED;
        }
        return EnumC3280o.UNINITIALIZED;
    }

    public static boolean l(int i8, int i9) {
        if (i8 == -20 && i9 == -30) {
            return true;
        }
        return (i8 == -30 && i9 == -20) || i8 == i9 || i8 < i9;
    }

    public static C2472x3 q(String str) {
        return e(str, 100);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String r(EnumC3280o enumC3280o) {
        int ordinal = enumC3280o.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                return null;
            }
            return "granted";
        }
        return "denied";
    }

    public final boolean A() {
        return m(a.AD_STORAGE);
    }

    public final boolean B() {
        return m(a.ANALYTICS_STORAGE);
    }

    public final boolean C() {
        Iterator it = this.f17897a.values().iterator();
        while (it.hasNext()) {
            if (((EnumC3280o) it.next()) != EnumC3280o.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final int b() {
        return this.f17898b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.measurement.internal.C2472x3 d(com.google.android.gms.measurement.internal.C2472x3 r9) {
        /*
            r8 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<com.google.android.gms.measurement.internal.x3$a> r1 = com.google.android.gms.measurement.internal.C2472x3.a.class
            r0.<init>(r1)
            com.google.android.gms.measurement.internal.y3 r1 = com.google.android.gms.measurement.internal.EnumC2479y3.STORAGE
            com.google.android.gms.measurement.internal.x3$a[] r1 = com.google.android.gms.measurement.internal.EnumC2479y3.b(r1)
            int r2 = r1.length
            r3 = 0
        Lf:
            if (r3 >= r2) goto L4d
            r4 = r1[r3]
            java.util.EnumMap r5 = r8.f17897a
            java.lang.Object r5 = r5.get(r4)
            l0.o r5 = (l0.EnumC3280o) r5
            java.util.EnumMap r6 = r9.f17897a
            java.lang.Object r6 = r6.get(r4)
            l0.o r6 = (l0.EnumC3280o) r6
            if (r5 != 0) goto L26
            goto L35
        L26:
            if (r6 != 0) goto L29
            goto L45
        L29:
            l0.o r7 = l0.EnumC3280o.UNINITIALIZED
            if (r5 != r7) goto L2e
            goto L35
        L2e:
            if (r6 != r7) goto L31
            goto L45
        L31:
            l0.o r7 = l0.EnumC3280o.POLICY
            if (r5 != r7) goto L37
        L35:
            r5 = r6
            goto L45
        L37:
            if (r6 != r7) goto L3a
            goto L45
        L3a:
            l0.o r7 = l0.EnumC3280o.DENIED
            if (r5 == r7) goto L44
            if (r6 != r7) goto L41
            goto L44
        L41:
            l0.o r5 = l0.EnumC3280o.GRANTED
            goto L45
        L44:
            r5 = r7
        L45:
            if (r5 == 0) goto L4a
            r0.put(r4, r5)
        L4a:
            int r3 = r3 + 1
            goto Lf
        L4d:
            com.google.android.gms.measurement.internal.x3 r9 = new com.google.android.gms.measurement.internal.x3
            r1 = 100
            r9.<init>(r0, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2472x3.d(com.google.android.gms.measurement.internal.x3):com.google.android.gms.measurement.internal.x3");
    }

    public final boolean equals(Object obj) {
        a[] aVarArr;
        if (!(obj instanceof C2472x3)) {
            return false;
        }
        C2472x3 c2472x3 = (C2472x3) obj;
        aVarArr = EnumC2479y3.STORAGE.f17925a;
        for (a aVar : aVarArr) {
            if (this.f17897a.get(aVar) != c2472x3.f17897a.get(aVar)) {
                return false;
            }
        }
        if (this.f17898b != c2472x3.f17898b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i8 = this.f17898b * 17;
        Iterator it = this.f17897a.values().iterator();
        while (it.hasNext()) {
            i8 = (i8 * 31) + ((EnumC3280o) it.next()).hashCode();
        }
        return i8;
    }

    public final boolean m(a aVar) {
        if (((EnumC3280o) this.f17897a.get(aVar)) == EnumC3280o.DENIED) {
            return false;
        }
        return true;
    }

    public final boolean n(C2472x3 c2472x3, a... aVarArr) {
        for (a aVar : aVarArr) {
            if (!c2472x3.m(aVar) && m(aVar)) {
                return true;
            }
        }
        return false;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f17897a.entrySet()) {
            String r8 = r((EnumC3280o) entry.getValue());
            if (r8 != null) {
                bundle.putString(((a) entry.getKey()).f17904a, r8);
            }
        }
        return bundle;
    }

    public final C2472x3 p(C2472x3 c2472x3) {
        a[] aVarArr;
        EnumMap enumMap = new EnumMap(a.class);
        aVarArr = EnumC2479y3.STORAGE.f17925a;
        for (a aVar : aVarArr) {
            EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(aVar);
            if (enumC3280o == EnumC3280o.UNINITIALIZED) {
                enumC3280o = (EnumC3280o) c2472x3.f17897a.get(aVar);
            }
            if (enumC3280o != null) {
                enumMap.put((EnumMap) aVar, (a) enumC3280o);
            }
        }
        return new C2472x3(enumMap, this.f17898b);
    }

    public final boolean s(C2472x3 c2472x3, a... aVarArr) {
        for (a aVar : aVarArr) {
            EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(aVar);
            EnumC3280o enumC3280o2 = (EnumC3280o) c2472x3.f17897a.get(aVar);
            EnumC3280o enumC3280o3 = EnumC3280o.DENIED;
            if (enumC3280o == enumC3280o3 && enumC3280o2 != enumC3280o3) {
                return true;
            }
        }
        return false;
    }

    public final EnumC3280o t() {
        EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(a.AD_STORAGE);
        if (enumC3280o == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        return enumC3280o;
    }

    public final String toString() {
        a[] aVarArr;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(g(this.f17898b));
        aVarArr = EnumC2479y3.STORAGE.f17925a;
        for (a aVar : aVarArr) {
            sb.append(",");
            sb.append(aVar.f17904a);
            sb.append("=");
            EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(aVar);
            if (enumC3280o == null) {
                enumC3280o = EnumC3280o.UNINITIALIZED;
            }
            sb.append(enumC3280o);
        }
        return sb.toString();
    }

    public final boolean u(C2472x3 c2472x3) {
        return s(c2472x3, (a[]) this.f17897a.keySet().toArray(new a[0]));
    }

    public final EnumC3280o v() {
        EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(a.ANALYTICS_STORAGE);
        if (enumC3280o == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        return enumC3280o;
    }

    public final Boolean w() {
        EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(a.AD_STORAGE);
        if (enumC3280o != null) {
            int ordinal = enumC3280o.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final Boolean x() {
        EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(a.ANALYTICS_STORAGE);
        if (enumC3280o != null) {
            int ordinal = enumC3280o.ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        return null;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
        return null;
    }

    public final String y() {
        int ordinal;
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : EnumC2479y3.STORAGE.a()) {
            EnumC3280o enumC3280o = (EnumC3280o) this.f17897a.get(aVar);
            char c8 = '-';
            if (enumC3280o != null && (ordinal = enumC3280o.ordinal()) != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                        }
                    } else {
                        c8 = '0';
                    }
                }
                c8 = '1';
            }
            sb.append(c8);
        }
        return sb.toString();
    }

    public final String z() {
        StringBuilder sb = new StringBuilder("G1");
        for (a aVar : EnumC2479y3.STORAGE.a()) {
            sb.append(a((EnumC3280o) this.f17897a.get(aVar)));
        }
        return sb.toString();
    }

    public C2472x3(Boolean bool, Boolean bool2, int i8) {
        EnumMap enumMap = new EnumMap(a.class);
        this.f17897a = enumMap;
        enumMap.put((EnumMap) a.AD_STORAGE, (a) j(bool));
        enumMap.put((EnumMap) a.ANALYTICS_STORAGE, (a) j(bool2));
        this.f17898b = i8;
    }
}
