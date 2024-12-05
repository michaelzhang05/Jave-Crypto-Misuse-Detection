package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.C2472x3;
import j$.util.Objects;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import l0.EnumC3280o;

/* renamed from: com.google.android.gms.measurement.internal.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2475y {

    /* renamed from: f, reason: collision with root package name */
    private static final C2475y f17911f = new C2475y(null, 100);

    /* renamed from: a, reason: collision with root package name */
    private final int f17912a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17913b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f17914c;

    /* renamed from: d, reason: collision with root package name */
    private final String f17915d;

    /* renamed from: e, reason: collision with root package name */
    private final EnumMap f17916e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2475y(Boolean bool, int i8) {
        this(bool, i8, (Boolean) null, (String) null);
    }

    public static C2475y b(Bundle bundle, int i8) {
        Boolean bool = null;
        if (bundle == null) {
            return new C2475y(null, i8);
        }
        EnumMap enumMap = new EnumMap(C2472x3.a.class);
        for (C2472x3.a aVar : EnumC2479y3.DMA.a()) {
            enumMap.put((EnumMap) aVar, (C2472x3.a) C2472x3.k(bundle.getString(aVar.f17904a)));
        }
        if (bundle.containsKey("is_dma_region")) {
            bool = Boolean.valueOf(bundle.getString("is_dma_region"));
        }
        return new C2475y(enumMap, i8, bool, bundle.getString("cps_display_str"));
    }

    public static C2475y c(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(C2472x3.a.class);
            C2472x3.a[] a8 = EnumC2479y3.DMA.a();
            int length = a8.length;
            int i8 = 1;
            int i9 = 0;
            while (i9 < length) {
                enumMap.put((EnumMap) a8[i9], (C2472x3.a) C2472x3.i(split[i8].charAt(0)));
                i9++;
                i8++;
            }
            return new C2475y(enumMap, parseInt, (Boolean) null, (String) null);
        }
        return f17911f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2475y d(EnumC3280o enumC3280o, int i8) {
        EnumMap enumMap = new EnumMap(C2472x3.a.class);
        enumMap.put((EnumMap) C2472x3.a.AD_USER_DATA, (C2472x3.a) enumC3280o);
        return new C2475y(enumMap, -10, (Boolean) null, (String) null);
    }

    public static Boolean e(Bundle bundle) {
        EnumC3280o k8;
        if (bundle == null || (k8 = C2472x3.k(bundle.getString("ad_personalization"))) == null) {
            return null;
        }
        int i8 = AbstractC2468x.f17890a[k8.ordinal()];
        if (i8 != 3) {
            if (i8 != 4) {
                return null;
            }
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    private final String l() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17912a);
        for (C2472x3.a aVar : EnumC2479y3.DMA.a()) {
            sb.append(":");
            sb.append(C2472x3.a((EnumC3280o) this.f17916e.get(aVar)));
        }
        return sb.toString();
    }

    public final int a() {
        return this.f17912a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2475y)) {
            return false;
        }
        C2475y c2475y = (C2475y) obj;
        if (!this.f17913b.equalsIgnoreCase(c2475y.f17913b) || !Objects.equals(this.f17914c, c2475y.f17914c)) {
            return false;
        }
        return Objects.equals(this.f17915d, c2475y.f17915d);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : this.f17916e.entrySet()) {
            String r8 = C2472x3.r((EnumC3280o) entry.getValue());
            if (r8 != null) {
                bundle.putString(((C2472x3.a) entry.getKey()).f17904a, r8);
            }
        }
        Boolean bool = this.f17914c;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.f17915d;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final EnumC3280o g() {
        EnumC3280o enumC3280o = (EnumC3280o) this.f17916e.get(C2472x3.a.AD_USER_DATA);
        if (enumC3280o == null) {
            return EnumC3280o.UNINITIALIZED;
        }
        return enumC3280o;
    }

    public final Boolean h() {
        return this.f17914c;
    }

    public final int hashCode() {
        int i8;
        int hashCode;
        Boolean bool = this.f17914c;
        if (bool == null) {
            i8 = 3;
        } else if (bool == Boolean.TRUE) {
            i8 = 7;
        } else {
            i8 = 13;
        }
        String str = this.f17915d;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return this.f17913b.hashCode() + (i8 * 29) + (hashCode * 137);
    }

    public final String i() {
        return this.f17915d;
    }

    public final String j() {
        return this.f17913b;
    }

    public final boolean k() {
        Iterator it = this.f17916e.values().iterator();
        while (it.hasNext()) {
            if (((EnumC3280o) it.next()) != EnumC3280o.UNINITIALIZED) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("source=");
        sb.append(C2472x3.g(this.f17912a));
        for (C2472x3.a aVar : EnumC2479y3.DMA.a()) {
            sb.append(",");
            sb.append(aVar.f17904a);
            sb.append("=");
            EnumC3280o enumC3280o = (EnumC3280o) this.f17916e.get(aVar);
            if (enumC3280o == null) {
                sb.append("uninitialized");
            } else {
                int i8 = AbstractC2468x.f17890a[enumC3280o.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                sb.append("granted");
                            }
                        } else {
                            sb.append("denied");
                        }
                    } else {
                        sb.append("eu_consent_policy");
                    }
                } else {
                    sb.append("uninitialized");
                }
            }
        }
        if (this.f17914c != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.f17914c);
        }
        if (this.f17915d != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.f17915d);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2475y(Boolean bool, int i8, Boolean bool2, String str) {
        EnumMap enumMap = new EnumMap(C2472x3.a.class);
        this.f17916e = enumMap;
        enumMap.put((EnumMap) C2472x3.a.AD_USER_DATA, (C2472x3.a) C2472x3.j(bool));
        this.f17912a = i8;
        this.f17913b = l();
        this.f17914c = bool2;
        this.f17915d = str;
    }

    private C2475y(EnumMap enumMap, int i8, Boolean bool, String str) {
        EnumMap enumMap2 = new EnumMap(C2472x3.a.class);
        this.f17916e = enumMap2;
        enumMap2.putAll(enumMap);
        this.f17912a = i8;
        this.f17913b = l();
        this.f17914c = bool;
        this.f17915d = str;
    }
}
