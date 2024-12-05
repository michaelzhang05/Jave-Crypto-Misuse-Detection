package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.t4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2104t4 extends C2060o {

    /* renamed from: b, reason: collision with root package name */
    private final C1959c f15902b;

    public C2104t4(C1959c c1959c) {
        this.f15902b = c1959c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.measurement.C2060o, com.google.android.gms.internal.measurement.r
    public final r m(String str, T1 t12, List list) {
        char c8;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c8 = 0;
                    break;
                }
                c8 = 65535;
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c8 = 3;
                    break;
                }
                c8 = 65535;
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c8 = 1;
                    break;
                }
                c8 = 65535;
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c8 = 2;
                    break;
                }
                c8 = 65535;
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c8 = 5;
                    break;
                }
                c8 = 65535;
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c8 = 4;
                    break;
                }
                c8 = 65535;
                break;
            default:
                c8 = 65535;
                break;
        }
        if (c8 != 0) {
            if (c8 != 1) {
                if (c8 != 2) {
                    if (c8 != 3) {
                        if (c8 != 4) {
                            if (c8 != 5) {
                                return super.m(str, t12, list);
                            }
                            AbstractC2110u2.h("setParamValue", 2, list);
                            String g8 = t12.b((r) list.get(0)).g();
                            r b8 = t12.b((r) list.get(1));
                            this.f15902b.b().g(g8, AbstractC2110u2.f(b8));
                            return b8;
                        }
                        AbstractC2110u2.h("setEventName", 1, list);
                        r b9 = t12.b((r) list.get(0));
                        if (!r.f15866c0.equals(b9) && !r.f15867d0.equals(b9)) {
                            this.f15902b.b().f(b9.g());
                            return new C2115v(b9.g());
                        }
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    AbstractC2110u2.h("getTimestamp", 0, list);
                    return new C2020j(Double.valueOf(this.f15902b.b().a()));
                }
                AbstractC2110u2.h("getParams", 0, list);
                Map e8 = this.f15902b.b().e();
                C2060o c2060o = new C2060o();
                for (String str2 : e8.keySet()) {
                    c2060o.l(str2, V2.b(e8.get(str2)));
                }
                return c2060o;
            }
            AbstractC2110u2.h("getParamValue", 1, list);
            return V2.b(this.f15902b.b().c(t12.b((r) list.get(0)).g()));
        }
        AbstractC2110u2.h("getEventName", 0, list);
        return new C2115v(this.f15902b.b().d());
    }
}
