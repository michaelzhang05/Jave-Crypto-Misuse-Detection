package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class V5 extends r {

    /* renamed from: b, reason: collision with root package name */
    private final C2095d f16424b;

    public V5(C2095d c2095d) {
        this.f16424b = c2095d;
    }

    @Override // com.google.android.gms.internal.measurement.r, com.google.android.gms.internal.measurement.InterfaceC2236s
    public final InterfaceC2236s C(String str, V2 v22, List list) {
        str.hashCode();
        char c8 = 65535;
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    c8 = 0;
                    break;
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    c8 = 1;
                    break;
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    c8 = 2;
                    break;
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    c8 = 3;
                    break;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    c8 = 4;
                    break;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    c8 = 5;
                    break;
                }
                break;
        }
        switch (c8) {
            case 0:
                AbstractC2128g2.g("getEventName", 0, list);
                return new C2254u(this.f16424b.d().e());
            case 1:
                AbstractC2128g2.g("getTimestamp", 0, list);
                return new C2165k(Double.valueOf(this.f16424b.d().a()));
            case 2:
                AbstractC2128g2.g("getParamValue", 1, list);
                return AbstractC2070a4.b(this.f16424b.d().b(v22.b((InterfaceC2236s) list.get(0)).A()));
            case 3:
                AbstractC2128g2.g("getParams", 0, list);
                Map g8 = this.f16424b.d().g();
                r rVar = new r();
                for (String str2 : g8.keySet()) {
                    rVar.j(str2, AbstractC2070a4.b(g8.get(str2)));
                }
                return rVar;
            case 4:
                AbstractC2128g2.g("setParamValue", 2, list);
                String A8 = v22.b((InterfaceC2236s) list.get(0)).A();
                InterfaceC2236s b8 = v22.b((InterfaceC2236s) list.get(1));
                this.f16424b.d().d(A8, AbstractC2128g2.d(b8));
                return b8;
            case 5:
                AbstractC2128g2.g("setEventName", 1, list);
                InterfaceC2236s b9 = v22.b((InterfaceC2236s) list.get(0));
                if (!InterfaceC2236s.f16802b0.equals(b9) && !InterfaceC2236s.f16803c0.equals(b9)) {
                    this.f16424b.d().f(b9.A());
                    return new C2254u(b9.A());
                }
                throw new IllegalArgumentException("Illegal event name");
            default:
                return super.C(str, v22, list);
        }
    }
}
