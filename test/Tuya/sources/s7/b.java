package s7;

import E7.f;
import R6.AbstractC1355w;
import R6.C1330a0;
import d7.AbstractC2565b;
import java.io.IOException;
import k7.C3133a;
import k7.h;
import k7.i;
import k7.j;
import k7.k;
import k7.m;
import l7.C3368a;
import l7.C3370c;
import l7.C3375h;
import m7.C3442b;
import n7.C3504a;
import o7.C3587a;
import r7.C3697b;
import t7.A;
import t7.C3797a;
import t7.s;
import t7.y;

/* loaded from: classes5.dex */
public abstract class b {
    public static W6.b a(AbstractC2565b abstractC2565b, AbstractC1355w abstractC1355w) {
        if (abstractC2565b instanceof C3587a) {
            C3587a c3587a = (C3587a) abstractC2565b;
            return new W6.b(e.d(c3587a.b()), new C1330a0(c3587a.a()), abstractC1355w);
        }
        if (abstractC2565b instanceof C3697b) {
            C3697b c3697b = (C3697b) abstractC2565b;
            return new W6.b(new X6.a(k7.e.f33695r, new h(e.f(c3697b.a()))), new C1330a0(c3697b.b()));
        }
        if (abstractC2565b instanceof C3504a) {
            X6.a aVar = new X6.a(k7.e.f33699v);
            short[] a8 = ((C3504a) abstractC2565b).a();
            byte[] bArr = new byte[a8.length * 2];
            for (int i8 = 0; i8 != a8.length; i8++) {
                f.n(a8[i8], bArr, i8 * 2);
            }
            return new W6.b(aVar, new C1330a0(bArr));
        }
        if (abstractC2565b instanceof C3375h) {
            C3375h c3375h = (C3375h) abstractC2565b;
            byte[] b8 = C3368a.f().i(1).c(c3375h).b();
            return new W6.b(new X6.a(W6.a.f12034I0), new C1330a0(b8), abstractC1355w, C3368a.f().i(1).c(c3375h.i()).b());
        }
        if (abstractC2565b instanceof C3370c) {
            C3370c c3370c = (C3370c) abstractC2565b;
            byte[] b9 = C3368a.f().i(c3370c.c()).c(c3370c).b();
            return new W6.b(new X6.a(W6.a.f12034I0), new C1330a0(b9), abstractC1355w, C3368a.f().i(c3370c.c()).c(c3370c.d().c()).b());
        }
        if (abstractC2565b instanceof y) {
            y yVar = (y) abstractC2565b;
            return new W6.b(new X6.a(k7.e.f33700w, new i(yVar.b().b(), e.h(yVar.a()))), b(yVar), abstractC1355w);
        }
        if (abstractC2565b instanceof s) {
            s sVar = (s) abstractC2565b;
            return new W6.b(new X6.a(k7.e.f33658F, new j(sVar.b().a(), sVar.b().b(), e.h(sVar.a()))), c(sVar), abstractC1355w);
        }
        if (abstractC2565b instanceof C3442b) {
            C3442b c3442b = (C3442b) abstractC2565b;
            return new W6.b(new X6.a(k7.e.f33691n), new C3133a(c3442b.f(), c3442b.e(), c3442b.b(), c3442b.c(), c3442b.g(), e.a(c3442b.a())));
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
                C3797a c3797a = (C3797a) A.f(g12, C3797a.class);
                if (c3797a.c() != (1 << b8) - 1) {
                    return new m(a8, g8, g9, g10, g11, g12, c3797a.c());
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
                t7.b bVar = (t7.b) A.f(g12, t7.b.class);
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
