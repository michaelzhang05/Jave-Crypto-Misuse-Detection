package j$.time.format;

import j$.time.ZoneId;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class l implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33147a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f33148b;

    public /* synthetic */ l(int i8, Object obj) {
        this.f33147a = i8;
        this.f33148b = obj;
    }

    @Override // j$.time.format.f
    public final boolean j(p pVar, StringBuilder sb) {
        switch (this.f33147a) {
            case 0:
                sb.append((String) this.f33148b);
                return true;
            default:
                ZoneId zoneId = (ZoneId) pVar.f((a) ((j$.time.temporal.t) this.f33148b));
                if (zoneId == null) {
                    return false;
                }
                sb.append(zoneId.i());
                return true;
        }
    }

    public final String toString() {
        switch (this.f33147a) {
            case 0:
                return "'" + ((String) this.f33148b).replace("'", "''") + "'";
            default:
                return "ZoneRegionId()";
        }
    }
}
