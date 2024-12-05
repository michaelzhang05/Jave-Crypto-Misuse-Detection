package M6;

import I6.s;
import I6.x;
import I6.z;
import S6.AbstractC1424l;
import S6.C1417e;
import S6.InterfaceC1418f;
import S6.L;
import S6.X;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.ProtocolException;

/* loaded from: classes5.dex */
public final class b implements s {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f7212a;

    /* loaded from: classes5.dex */
    static final class a extends AbstractC1424l {

        /* renamed from: b, reason: collision with root package name */
        long f7213b;

        a(X x8) {
            super(x8);
        }

        @Override // S6.AbstractC1424l, S6.X
        public void h(C1417e c1417e, long j8) {
            super.h(c1417e, j8);
            this.f7213b += j8;
        }
    }

    public b(boolean z8) {
        this.f7212a = z8;
    }

    @Override // I6.s
    public z a(s.a aVar) {
        z c8;
        g gVar = (g) aVar;
        c e8 = gVar.e();
        L6.g g8 = gVar.g();
        L6.c cVar = (L6.c) gVar.c();
        x request = gVar.request();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.d().o(gVar.b());
        e8.a(request);
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
                InterfaceC1418f c9 = L.c(aVar3);
                request.a().e(c9);
                c9.close();
                gVar.d().l(gVar.b(), aVar3.f7213b);
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
        int g9 = c10.g();
        if (g9 == 100) {
            c10 = e8.readResponseHeaders(false).o(request).h(g8.c().j()).p(currentTimeMillis).n(System.currentTimeMillis()).c();
            g9 = c10.g();
        }
        gVar.d().r(gVar.b(), c10);
        if (this.f7212a && g9 == 101) {
            c8 = c10.x().b(J6.c.f4941c).c();
        } else {
            c8 = c10.x().b(e8.c(c10)).c();
        }
        if (CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.E().c("Connection")) || CampaignEx.JSON_NATIVE_VIDEO_CLOSE.equalsIgnoreCase(c8.m("Connection"))) {
            g8.i();
        }
        if ((g9 != 204 && g9 != 205) || c8.a().a() <= 0) {
            return c8;
        }
        throw new ProtocolException("HTTP " + g9 + " had non-zero Content-Length: " + c8.a().a());
    }
}
