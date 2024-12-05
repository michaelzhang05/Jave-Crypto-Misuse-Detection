package H6;

import F6.q;
import F6.s;
import F6.v;
import F6.x;
import F6.z;
import H6.c;
import J6.h;
import P6.C1279e;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import P6.L;
import P6.X;
import P6.Z;
import P6.a0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    final f f3528a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C0056a implements Z {

        /* renamed from: a, reason: collision with root package name */
        boolean f3529a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1281g f3530b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ b f3531c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ InterfaceC1280f f3532d;

        C0056a(InterfaceC1281g interfaceC1281g, b bVar, InterfaceC1280f interfaceC1280f) {
            this.f3530b = interfaceC1281g;
            this.f3531c = bVar;
            this.f3532d = interfaceC1280f;
        }

        @Override // P6.Z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f3529a && !G6.c.m(this, 100, TimeUnit.MILLISECONDS)) {
                this.f3529a = true;
                this.f3531c.abort();
            }
            this.f3530b.close();
        }

        @Override // P6.Z
        public a0 timeout() {
            return this.f3530b.timeout();
        }

        @Override // P6.Z
        public long y(C1279e c1279e, long j8) {
            try {
                long y8 = this.f3530b.y(c1279e, j8);
                if (y8 == -1) {
                    if (!this.f3529a) {
                        this.f3529a = true;
                        this.f3532d.close();
                    }
                    return -1L;
                }
                c1279e.g(this.f3532d.buffer(), c1279e.x() - y8, y8);
                this.f3532d.emitCompleteSegments();
                return y8;
            } catch (IOException e8) {
                if (!this.f3529a) {
                    this.f3529a = true;
                    this.f3531c.abort();
                }
                throw e8;
            }
        }
    }

    public a(f fVar) {
        this.f3528a = fVar;
    }

    private z b(b bVar, z zVar) {
        if (bVar == null) {
            return zVar;
        }
        X body = bVar.body();
        if (body == null) {
            return zVar;
        }
        C0056a c0056a = new C0056a(zVar.a().f(), bVar, L.c(body));
        return zVar.u().b(new h(zVar.h("Content-Type"), zVar.a().a(), L.d(c0056a))).c();
    }

    private static q c(q qVar, q qVar2) {
        q.a aVar = new q.a();
        int e8 = qVar.e();
        for (int i8 = 0; i8 < e8; i8++) {
            String c8 = qVar.c(i8);
            String f8 = qVar.f(i8);
            if ((!"Warning".equalsIgnoreCase(c8) || !f8.startsWith("1")) && (d(c8) || !e(c8) || qVar2.a(c8) == null)) {
                G6.a.f3218a.b(aVar, c8, f8);
            }
        }
        int e9 = qVar2.e();
        for (int i9 = 0; i9 < e9; i9++) {
            String c9 = qVar2.c(i9);
            if (!d(c9) && e(c9)) {
                G6.a.f3218a.b(aVar, c9, qVar2.f(i9));
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
            return zVar.u().b(null).c();
        }
        return zVar;
    }

    @Override // F6.s
    public z a(s.a aVar) {
        z zVar;
        f fVar = this.f3528a;
        if (fVar != null) {
            zVar = fVar.e(aVar.request());
        } else {
            zVar = null;
        }
        c c8 = new c.a(System.currentTimeMillis(), aVar.request(), zVar).c();
        x xVar = c8.f3534a;
        z zVar2 = c8.f3535b;
        f fVar2 = this.f3528a;
        if (fVar2 != null) {
            fVar2.b(c8);
        }
        if (zVar != null && zVar2 == null) {
            G6.c.d(zVar.a());
        }
        if (xVar == null && zVar2 == null) {
            return new z.a().o(aVar.request()).m(v.HTTP_1_1).g(TypedValues.PositionType.TYPE_PERCENT_HEIGHT).j("Unsatisfiable Request (only-if-cached)").b(G6.c.f3222c).p(-1L).n(System.currentTimeMillis()).c();
        }
        if (xVar == null) {
            return zVar2.u().d(f(zVar2)).c();
        }
        try {
            z a8 = aVar.a(xVar);
            if (a8 == null && zVar != null) {
            }
            if (zVar2 != null) {
                if (a8.f() == 304) {
                    z c9 = zVar2.u().i(c(zVar2.m(), a8.m())).p(a8.F()).n(a8.A()).d(f(zVar2)).k(f(a8)).c();
                    a8.a().close();
                    this.f3528a.trackConditionalCacheHit();
                    this.f3528a.c(zVar2, c9);
                    return c9;
                }
                G6.c.d(zVar2.a());
            }
            z c10 = a8.u().d(f(zVar2)).k(f(a8)).c();
            if (this.f3528a != null) {
                if (J6.e.c(c10) && c.a(c10, xVar)) {
                    return b(this.f3528a.d(c10), c10);
                }
                if (J6.f.a(xVar.g())) {
                    try {
                        this.f3528a.a(xVar);
                    } catch (IOException unused) {
                    }
                }
            }
            return c10;
        } finally {
            if (zVar != null) {
                G6.c.d(zVar.a());
            }
        }
    }
}
