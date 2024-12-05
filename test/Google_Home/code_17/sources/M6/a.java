package M6;

import I6.l;
import I6.s;
import I6.x;
import I6.y;
import I6.z;
import S6.C1427o;
import S6.L;
import com.mbridge.msdk.foundation.download.Command;
import java.util.List;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    private final l f7211a;

    public a(l lVar) {
        this.f7211a = lVar;
    }

    private String b(List list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (i8 > 0) {
                sb.append("; ");
            }
            I6.k kVar = (I6.k) list.get(i8);
            sb.append(kVar.c());
            sb.append('=');
            sb.append(kVar.k());
        }
        return sb.toString();
    }

    @Override // I6.s
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
            h8.c("Host", J6.c.p(request.i(), false));
        }
        if (request.c("Connection") == null) {
            h8.c("Connection", "Keep-Alive");
        }
        if (request.c("Accept-Encoding") == null && request.c(Command.HTTP_HEADER_RANGE) == null) {
            h8.c("Accept-Encoding", "gzip");
            z8 = true;
        }
        List a10 = this.f7211a.a(request.i());
        if (!a10.isEmpty()) {
            h8.c("Cookie", b(a10));
        }
        if (request.c(Command.HTTP_HEADER_USER_AGENT) == null) {
            h8.c(Command.HTTP_HEADER_USER_AGENT, J6.d.a());
        }
        z a11 = aVar.a(h8.a());
        e.g(this.f7211a, request.i(), a11.o());
        z.a o8 = a11.x().o(request);
        if (z8 && "gzip".equalsIgnoreCase(a11.m("Content-Encoding")) && e.c(a11)) {
            C1427o c1427o = new C1427o(a11.a().g());
            o8.i(a11.o().d().g("Content-Encoding").g("Content-Length").d());
            o8.b(new h(a11.m("Content-Type"), -1L, L.d(c1427o)));
        }
        return o8.c();
    }
}
