package com.google.android.gms.measurement.internal;

import com.google.android.gms.measurement.internal.C2472x3;
import java.util.EnumMap;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2371j {

    /* renamed from: a, reason: collision with root package name */
    private final EnumMap f17653a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2371j() {
        this.f17653a = new EnumMap(C2472x3.a.class);
    }

    public static C2371j a(String str) {
        EnumMap enumMap = new EnumMap(C2472x3.a.class);
        if (str.length() >= C2472x3.a.values().length) {
            int i8 = 0;
            if (str.charAt(0) == '1') {
                C2472x3.a[] values = C2472x3.a.values();
                int length = values.length;
                int i9 = 1;
                while (i8 < length) {
                    enumMap.put((EnumMap) values[i8], (C2472x3.a) EnumC2385l.b(str.charAt(i9)));
                    i8++;
                    i9++;
                }
                return new C2371j(enumMap);
            }
        }
        return new C2371j();
    }

    public final EnumC2385l b(C2472x3.a aVar) {
        EnumC2385l enumC2385l = (EnumC2385l) this.f17653a.get(aVar);
        if (enumC2385l == null) {
            return EnumC2385l.UNSET;
        }
        return enumC2385l;
    }

    public final void c(C2472x3.a aVar, int i8) {
        EnumC2385l enumC2385l = EnumC2385l.UNSET;
        if (i8 != -30) {
            if (i8 != -20) {
                if (i8 != -10) {
                    if (i8 != 0) {
                        if (i8 == 30) {
                            enumC2385l = EnumC2385l.INITIALIZATION;
                        }
                    }
                } else {
                    enumC2385l = EnumC2385l.MANIFEST;
                }
            }
            enumC2385l = EnumC2385l.API;
        } else {
            enumC2385l = EnumC2385l.TCF;
        }
        this.f17653a.put((EnumMap) aVar, (C2472x3.a) enumC2385l);
    }

    public final void d(C2472x3.a aVar, EnumC2385l enumC2385l) {
        this.f17653a.put((EnumMap) aVar, (C2472x3.a) enumC2385l);
    }

    public final String toString() {
        char c8;
        StringBuilder sb = new StringBuilder("1");
        for (C2472x3.a aVar : C2472x3.a.values()) {
            EnumC2385l enumC2385l = (EnumC2385l) this.f17653a.get(aVar);
            if (enumC2385l == null) {
                enumC2385l = EnumC2385l.UNSET;
            }
            c8 = enumC2385l.f17690a;
            sb.append(c8);
        }
        return sb.toString();
    }

    private C2371j(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(C2472x3.a.class);
        this.f17653a = enumMap2;
        enumMap2.putAll(enumMap);
    }
}
