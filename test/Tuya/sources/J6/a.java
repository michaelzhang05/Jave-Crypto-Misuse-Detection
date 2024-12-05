package J6;

import F6.l;
import F6.s;
import F6.x;
import F6.y;
import F6.z;
import P6.C1289o;
import P6.L;
import com.mbridge.msdk.foundation.download.Command;
import java.util.List;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    private final l f5505a;

    public a(l lVar) {
        this.f5505a = lVar;
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                sb.append("; ");
            }
            F6.k kVar = (F6.k) list.get(i8);
            sb.append(kVar.c());
            sb.append('=');
            sb.append(kVar.k());
        }
        return sb.toString();
    }

    @Override // F6.s
    public z a(s.a aVar) {
        x request = aVar.request();
        x.a h8 = request.h();
        y a8 = request.a();
        if (a8 != null) {
            a8.b();
            long a9 = a8.a();
            if (a9 != -1) {
                h8.c("Content-Length", Long.toString(a9));
                h8.f("Transfer-Encoding");
            } else {
                h8.c("Transfer-Encoding", "chunked");
                h8.f("Content-Length");
            }
        }
        boolean z8 = false;
        if (request.c("Host") == null) {
            h8.c("Host", G6.c.p(request.i(), false));
        }
        if (request.c("Connection") == null) {
            h8.c("Connection", "Keep-Alive");
        }
        if (request.c("Accept-Encoding") == null && request.c(Command.HTTP_HEADER_RANGE) == null) {
            h8.c("Accept-Encoding", "gzip");
            z8 = true;
        }
        List a10 = this.f5505a.a(request.i());
        if (!a10.isEmpty()) {
            h8.c("Cookie", b(a10));
        }
        if (request.c(Command.HTTP_HEADER_USER_AGENT) == null) {
            h8.c(Command.HTTP_HEADER_USER_AGENT, G6.d.a());
        }
        z a11 = aVar.a(h8.a());
        e.g(this.f5505a, request.i(), a11.m());
        z.a o8 = a11.u().o(request);
        if (z8 && "gzip".equalsIgnoreCase(a11.h("Content-Encoding")) && e.c(a11)) {
            C1289o c1289o = new C1289o(a11.a().f());
            o8.i(a11.m().d().g("Content-Encoding").g("Content-Length").d());
            o8.b(new h(a11.h("Content-Type"), -1L, L.d(c1289o)));
        }
        return o8.c();
    }
}
