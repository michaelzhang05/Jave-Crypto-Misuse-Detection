package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC3013b;
import j$.time.temporal.w;

/* loaded from: classes2.dex */
final class o implements j$.time.temporal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3013b f33159a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.o f33160b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f33161c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f33162d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(InterfaceC3013b interfaceC3013b, j$.time.temporal.o oVar, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f33159a = interfaceC3013b;
        this.f33160b = oVar;
        this.f33161c = mVar;
        this.f33162d = zoneId;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC3013b interfaceC3013b = this.f33159a;
        return (interfaceC3013b == null || !rVar.v()) ? this.f33160b.f(rVar) : interfaceC3013b.f(rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final w m(j$.time.temporal.r rVar) {
        InterfaceC3013b interfaceC3013b = this.f33159a;
        return (interfaceC3013b == null || !rVar.v()) ? this.f33160b.m(rVar) : interfaceC3013b.m(rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        InterfaceC3013b interfaceC3013b = this.f33159a;
        return (interfaceC3013b == null || !rVar.v()) ? this.f33160b.r(rVar) : interfaceC3013b.r(rVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f33161c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f33162d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f33160b + str + str2;
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? this.f33161c : tVar == j$.time.temporal.n.k() ? this.f33162d : tVar == j$.time.temporal.n.i() ? this.f33160b.u(tVar) : tVar.a(this);
    }
}
