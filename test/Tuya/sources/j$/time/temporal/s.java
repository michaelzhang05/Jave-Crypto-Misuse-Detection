package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* loaded from: classes2.dex */
final class s implements t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32039a;

    public /* synthetic */ s(int i8) {
        this.f32039a = i8;
    }

    @Override // j$.time.temporal.t
    public final Object a(o oVar) {
        switch (this.f32039a) {
            case 0:
                return (ZoneId) oVar.u(n.f32030a);
            case 1:
                return (j$.time.chrono.m) oVar.u(n.f32031b);
            case 2:
                return (u) oVar.u(n.f32032c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (oVar.f(aVar)) {
                    return ZoneOffset.M(oVar.j(aVar));
                }
                return null;
            case 4:
                ZoneId zoneId = (ZoneId) oVar.u(n.f32030a);
                return zoneId != null ? zoneId : (ZoneId) oVar.u(n.f32033d);
            case 5:
                a aVar2 = a.EPOCH_DAY;
                if (oVar.f(aVar2)) {
                    return j$.time.h.R(oVar.r(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (oVar.f(aVar3)) {
                    return j$.time.k.M(oVar.r(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f32039a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case 4:
                return "Zone";
            case 5:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
