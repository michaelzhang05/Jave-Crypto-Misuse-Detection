package v7;

import H7.f;
import U6.AbstractC1464w;
import U6.C1439a0;
import a7.C1677a;
import g7.AbstractC2889b;
import java.io.IOException;
import n7.C3488a;
import n7.h;
import n7.i;
import n7.j;
import n7.k;
import n7.m;
import o7.C3717a;
import o7.C3719c;
import o7.C3724h;
import p7.C3785b;
import q7.C3883a;
import r7.C3977a;
import u7.C4070b;
import w7.A;
import w7.C4151a;
import w7.s;
import w7.y;

/* loaded from: classes5.dex */
public abstract class b {
    public static Z6.b a(AbstractC2889b abstractC2889b, AbstractC1464w abstractC1464w) {
        if (abstractC2889b instanceof C3977a) {
            C3977a c3977a = (C3977a) abstractC2889b;
            return new Z6.b(e.d(c3977a.b()), new C1439a0(c3977a.a()), abstractC1464w);
        }
        if (abstractC2889b instanceof C4070b) {
            C4070b c4070b = (C4070b) abstractC2889b;
            return new Z6.b(new C1677a(n7.e.f35687r, new h(e.f(c4070b.a()))), new C1439a0(c4070b.b()));
        }
        if (abstractC2889b instanceof C3883a) {
            C1677a c1677a = new C1677a(n7.e.f35691v);
            short[] a8 = ((C3883a) abstractC2889b).a();
            byte[] bArr = new byte[a8.length * 2];
            for (int i8 = 0; i8 != a8.length; i8++) {
                f.n(a8[i8], bArr, i8 * 2);
            }
            return new Z6.b(c1677a, new C1439a0(bArr));
        }
        if (abstractC2889b instanceof C3724h) {
            C3724h c3724h = (C3724h) abstractC2889b;
            byte[] b8 = C3717a.f().i(1).c(c3724h).b();
            return new Z6.b(new C1677a(Z6.a.f13672I0), new C1439a0(b8), abstractC1464w, C3717a.f().i(1).c(c3724h.i()).b());
        }
        if (abstractC2889b instanceof C3719c) {
            C3719c c3719c = (C3719c) abstractC2889b;
            byte[] b9 = C3717a.f().i(c3719c.c()).c(c3719c).b();
            return new Z6.b(new C1677a(Z6.a.f13672I0), new C1439a0(b9), abstractC1464w, C3717a.f().i(c3719c.c()).c(c3719c.d().c()).b());
        }
        if (abstractC2889b instanceof y) {
            y yVar = (y) abstractC2889b;
            return new Z6.b(new C1677a(n7.e.f35692w, new i(yVar.b().b(), e.h(yVar.a()))), b(yVar), abstractC1464w);
        }
        if (abstractC2889b instanceof s) {
            s sVar = (s) abstractC2889b;
            return new Z6.b(new C1677a(n7.e.f35650F, new j(sVar.b().a(), sVar.b().b(), e.h(sVar.a()))), c(sVar), abstractC1464w);
        }
        if (abstractC2889b instanceof C3785b) {
            C3785b c3785b = (C3785b) abstractC2889b;
            return new Z6.b(new C1677a(n7.e.f35683n), new C3488a(c3785b.f(), c3785b.e(), c3785b.b(), c3785b.c(), c3785b.g(), e.a(c3785b.a())));
        }
        throw new IOException("key parameters not recognized");
    }

    private static m b(y yVar) {
        byte[] encoded = yVar.getEncoded();
        int h8 = yVar.b().h();
        int b8 = yVar.b().b();
        int a8 = (int) A.a(encoded, 0, 4);
        if (A.l(b8, a8)) {
            byte[] g8 = A.g(encoded, 4, h8);
            int i8 = 4 + h8;
            byte[] g9 = A.g(encoded, i8, h8);
            int i9 = i8 + h8;
            byte[] g10 = A.g(encoded, i9, h8);
            int i10 = i9 + h8;
            byte[] g11 = A.g(encoded, i10, h8);
            int i11 = i10 + h8;
            byte[] g12 = A.g(encoded, i11, encoded.length - i11);
            try {
                C4151a c4151a = (C4151a) A.f(g12, C4151a.class);
                if (c4151a.c() != (1 << b8) - 1) {
                    return new m(a8, g8, g9, g10, g11, g12, c4151a.c());
                }
                return new m(a8, g8, g9, g10, g11, g12);
            } catch (ClassNotFoundException e8) {
                throw new IOException("cannot parse BDS: " + e8.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }

    private static k c(s sVar) {
        byte[] encoded = sVar.getEncoded();
        int f8 = sVar.b().f();
        int a8 = sVar.b().a();
        int i8 = (a8 + 7) / 8;
        long a9 = (int) A.a(encoded, 0, i8);
        if (A.l(a8, a9)) {
            byte[] g8 = A.g(encoded, i8, f8);
            int i9 = i8 + f8;
            byte[] g9 = A.g(encoded, i9, f8);
            int i10 = i9 + f8;
            byte[] g10 = A.g(encoded, i10, f8);
            int i11 = i10 + f8;
            byte[] g11 = A.g(encoded, i11, f8);
            int i12 = i11 + f8;
            byte[] g12 = A.g(encoded, i12, encoded.length - i12);
            try {
                w7.b bVar = (w7.b) A.f(g12, w7.b.class);
                if (bVar.b() != (1 << a8) - 1) {
                    return new k(a9, g8, g9, g10, g11, g12, bVar.b());
                }
                return new k(a9, g8, g9, g10, g11, g12);
            } catch (ClassNotFoundException e8) {
                throw new IOException("cannot parse BDSStateMap: " + e8.getMessage());
            }
        }
        throw new IllegalArgumentException("index out of bounds");
    }
}
