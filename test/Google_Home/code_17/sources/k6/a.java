package K6;

import I6.q;
import I6.s;
import I6.v;
import I6.x;
import I6.z;
import K6.c;
import M6.h;
import S6.C1417e;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import S6.L;
import S6.X;
import S6.Z;
import S6.a0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    final f f5131a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: K6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0079a implements Z {

        /* renamed from: a, reason: collision with root package name */
        boolean f5132a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1419g f5133b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f5134c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1418f f5135d;

        C0079a(InterfaceC1419g interfaceC1419g, b bVar, InterfaceC1418f interfaceC1418f) {
            this.f5133b = interfaceC1419g;
            this.f5134c = bVar;
            this.f5135d = interfaceC1418f;
        }

        @Override // S6.Z
        public long C(C1417e c1417e, long j8) {
            try {
                long C8 = this.f5133b.C(c1417e, j8);
                if (C8 == -1) {
                    if (!this.f5132a) {
                        this.f5132a = true;
                        this.f5135d.close();
                    }
                    return -1L;
                }
                c1417e.l(this.f5135d.buffer(), c1417e.E() - C8, C8);
                this.f5135d.emitCompleteSegments();
                return C8;
            } catch (IOException e8) {
                if (!this.f5132a) {
                    this.f5132a = true;
                    this.f5134c.abort();
                }
                throw e8;
            }
        }

        @Override // S6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f5132a && !J6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                this.f5132a = true;
                this.f5134c.abort();
            }
            this.f5133b.close();
        }

        @Override // S6.Z
        public a0 timeout() {
            return this.f5133b.timeout();
        }
    }

    public a(f fVar) {
        this.f5131a = fVar;
    }

    private z b(b bVar, z zVar) {
        if (bVar == null) {
            return zVar;
        }
        X body = bVar.body();
        if (body == null) {
            return zVar;
        }
        C0079a c0079a = new C0079a(zVar.a().g(), bVar, L.c(body));
        return zVar.x().b(new h(zVar.m("Content-Type"), zVar.a().a(), L.d(c0079a))).c();
    }

    private static q c(q qVar, q qVar2) {
        q.a aVar = new q.a();
        int e8 = qVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String c8 = qVar.c(i8);
            String f8 = qVar.f(i8);
            if ((!"Warning".equalsIgnoreCase(c8) || !f8.startsWith("1")) && (d(c8) || !e(c8) || qVar2.a(c8) == null)) {
                J6.a.f4937a.b(aVar, c8, f8);
            }
        }
        int e9 = qVar2.e();
        for (int i9 = 0; i9 < e9; i9++) {
            String c9 = qVar2.c(i9);
            if (!d(c9) && e(c9)) {
                J6.a.f4937a.b(aVar, c9, qVar2.f(i9));
            }
        }
        return aVar.d();
    }

    static boolean d(String str) {
        if (!"Content-Length".equalsIgnoreCase(str) && !"Content-Encoding".equalsIgnoreCase(str) && !"Content-Type".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    static boolean e(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    private static z f(z zVar) {
        if (zVar != null && zVar.a() != null) {
            return zVar.x().b(null).c();
        }
        return zVar;
    }

    @Override // I6.s
    public z a(s.a aVar) {
        z zVar;
        f fVar = this.f5131a;
        if (fVar != null) {
            zVar = fVar.b(aVar.request());
        } else {
            zVar = null;
        }
        c c8 = new c.a(System.currentTimeMillis(), aVar.request(), zVar).c();
        x xVar = c8.f5137a;
        z zVar2 = c8.f5138b;
        f fVar2 = this.f5131a;
        if (fVar2 != null) {
            fVar2.a(c8);
        }
        if (zVar != null && zVar2 == null) {
            J6.c.d(zVar.a());
        }
        if (xVar == null && zVar2 == null) {
            return new z.a().o(aVar.request()).m(v.HTTP_1_1).g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).j("Unsatisfiable Request (only-if-cached)").b(J6.c.f4941c).p(-1L).n(System.currentTimeMillis()).c();
        }
        if (xVar == null) {
            return zVar2.x().d(f(zVar2)).c();
        }
        try {
            z a8 = aVar.a(xVar);
            if (a8 == null && zVar != null) {
            }
            if (zVar2 != null) {
                if (a8.g() == 304) {
                    z c9 = zVar2.x().i(c(zVar2.o(), a8.o())).p(a8.F()).n(a8.D()).d(f(zVar2)).k(f(a8)).c();
                    a8.a().close();
                    this.f5131a.trackConditionalCacheHit();
                    this.f5131a.c(zVar2, c9);
                    return c9;
                }
                J6.c.d(zVar2.a());
            }
            z c10 = a8.x().d(f(zVar2)).k(f(a8)).c();
            if (this.f5131a != null) {
                if (M6.e.c(c10) && c.a(c10, xVar)) {
                    return b(this.f5131a.d(c10), c10);
                }
                if (M6.f.a(xVar.g())) {
                    try {
                        this.f5131a.e(xVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c10;
        } finally {
            if (zVar != null) {
                J6.c.d(zVar.a());
            }
        }
    }
}
