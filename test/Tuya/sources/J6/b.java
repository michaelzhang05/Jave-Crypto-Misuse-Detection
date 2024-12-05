package J6;

import F6.s;
import F6.x;
import F6.z;
import P6.AbstractC1286l;
import P6.C1279e;
import P6.InterfaceC1280f;
import P6.L;
import P6.X;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f5506a;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC1286l {

        /* renamed from: b, reason: collision with root package name */
        long f5507b;

        a(X x8) {
            super(x8);
        }

        @Override // P6.AbstractC1286l, P6.X
        public void C(C1279e c1279e, long j8) {
            super.C(c1279e, j8);
            this.f5507b += j8;
        }
    }

    public b(boolean z8) {
        this.f5506a = z8;
    }

    @Override // F6.s
    public z a(s.a aVar) {
        z c8;
        g gVar = (g) aVar;
        c e8 = gVar.e();
        I6.g g8 = gVar.g();
        I6.c cVar = (I6.c) gVar.c();
        x request = gVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.d().o(gVar.b());
        e8.c(request);
        gVar.d().n(gVar.b(), request);
        z.a aVar2 = null;
        if (f.b(request.g()) && request.a() != null) {
            if ("100-continue".equalsIgnoreCase(request.c("Expect"))) {
                e8.flushRequest();
                gVar.d().s(gVar.b());
                aVar2 = e8.readResponseHeaders(true);
            }
            if (aVar2 == null) {
                gVar.d().m(gVar.b());
                a aVar3 = new a(e8.b(request, request.a().a()));
                InterfaceC1280f c9 = L.c(aVar3);
                request.a().e(c9);
                c9.close();
                gVar.d().l(gVar.b(), aVar3.f5507b);
            } else if (!cVar.m()) {
                g8.i();
            }
        }
        e8.finishRequest();
        if (aVar2 == null) {
            gVar.d().s(gVar.b());
            aVar2 = e8.readResponseHeaders(false);
        }
        z c10 = aVar2.o(request).h(g8.c().j()).p(currentTimeMillis).n(System.currentTimeMillis()).c();
        int f8 = c10.f();
        if (f8 == 100) {
            c10 = e8.readResponseHeaders(false).o(request).h(g8.c().j()).p(currentTimeMillis).n(System.currentTimeMillis()).c();
            f8 = c10.f();
        }
        gVar.d().r(gVar.b(), c10);
        if (this.f5506a && f8 == 101) {
            c8 = c10.u().b(G6.c.f3222c).c();
        } else {
            c8 = c10.u().b(e8.a(c10)).c();
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.E().c("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.h("Connection"))) {
            g8.i();
        }
        if ((f8 != 204 && f8 != 205) || c8.a().a() <= 0) {
            return c8;
        }
        throw new ProtocolException("HTTP " + f8 + " had non-zero Content-Length: " + c8.a().a());
    }
}
