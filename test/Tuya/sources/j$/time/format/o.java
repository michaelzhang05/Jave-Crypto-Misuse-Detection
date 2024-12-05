package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC2863b;
import j$.time.temporal.w;

/* loaded from: classes2.dex */
final class o implements j$.time.temporal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2863b f31965a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j$.time.temporal.o f31966b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f31967c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ZoneId f31968d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(InterfaceC2863b interfaceC2863b, j$.time.temporal.o oVar, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f31965a = interfaceC2863b;
        this.f31966b = oVar;
        this.f31967c = mVar;
        this.f31968d = zoneId;
    }

    @Override // j$.time.temporal.o
    public final boolean f(j$.time.temporal.r rVar) {
        InterfaceC2863b interfaceC2863b = this.f31965a;
        return (interfaceC2863b == null || !rVar.v()) ? this.f31966b.f(rVar) : interfaceC2863b.f(rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.a(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final w m(j$.time.temporal.r rVar) {
        InterfaceC2863b interfaceC2863b = this.f31965a;
        return (interfaceC2863b == null || !rVar.v()) ? this.f31966b.m(rVar) : interfaceC2863b.m(rVar);
    }

    @Override // j$.time.temporal.o
    public final long r(j$.time.temporal.r rVar) {
        InterfaceC2863b interfaceC2863b = this.f31965a;
        return (interfaceC2863b == null || !rVar.v()) ? this.f31966b.r(rVar) : interfaceC2863b.r(rVar);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f31967c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.f31968d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f31966b + str + str2;
    }

    @Override // j$.time.temporal.o
    public final Object u(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.e() ? this.f31967c : tVar == j$.time.temporal.n.k() ? this.f31968d : tVar == j$.time.temporal.n.i() ? this.f31966b.u(tVar) : tVar.a(this);
    }
}
