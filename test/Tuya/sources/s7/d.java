package s7;

import R6.C1330a0;
import d7.AbstractC2565b;
import java.io.IOException;
import k7.C3134b;
import k7.h;
import k7.i;
import k7.j;
import k7.l;
import k7.n;
import l7.C3368a;
import l7.C3371d;
import l7.C3376i;
import m7.C3443c;
import o7.C3588b;
import r7.C3698c;
import t7.t;
import t7.z;

/* loaded from: classes5.dex */
public abstract class d {
    public static X6.b a(AbstractC2565b abstractC2565b) {
        if (abstractC2565b instanceof C3588b) {
            C3588b c3588b = (C3588b) abstractC2565b;
            return new X6.b(e.d(c3588b.b()), c3588b.a());
        }
        if (abstractC2565b instanceof C3698c) {
            C3698c c3698c = (C3698c) abstractC2565b;
            return new X6.b(new X6.a(k7.e.f33695r, new h(e.f(c3698c.a()))), c3698c.b());
        }
        if (abstractC2565b instanceof n7.b) {
            return new X6.b(new X6.a(k7.e.f33699v), ((n7.b) abstractC2565b).a());
        }
        if (abstractC2565b instanceof C3376i) {
            return new X6.b(new X6.a(W6.a.f12034I0), new C1330a0(C3368a.f().i(1).c((C3376i) abstractC2565b).b()));
        }
        if (abstractC2565b instanceof C3371d) {
            C3371d c3371d = (C3371d) abstractC2565b;
            return new X6.b(new X6.a(W6.a.f12034I0), new C1330a0(C3368a.f().i(c3371d.b()).c(c3371d.c()).b()));
        }
        if (abstractC2565b instanceof z) {
            z zVar = (z) abstractC2565b;
            byte[] c8 = zVar.c();
            byte[] d8 = zVar.d();
            byte[] encoded = zVar.getEncoded();
            if (encoded.length > c8.length + d8.length) {
                return new X6.b(new X6.a(T6.a.f11047a), new C1330a0(encoded));
            }
            return new X6.b(new X6.a(k7.e.f33700w, new i(zVar.b().b(), e.h(zVar.a()))), new n(c8, d8));
        }
        if (abstractC2565b instanceof t) {
            t tVar = (t) abstractC2565b;
            byte[] c9 = tVar.c();
            byte[] d9 = tVar.d();
            byte[] encoded2 = tVar.getEncoded();
            if (encoded2.length > c9.length + d9.length) {
                return new X6.b(new X6.a(T6.a.f11048b), new C1330a0(encoded2));
            }
            return new X6.b(new X6.a(k7.e.f33658F, new j(tVar.b().a(), tVar.b().b(), e.h(tVar.a()))), new l(tVar.c(), tVar.d()));
        }
        if (abstractC2565b instanceof C3443c) {
            C3443c c3443c = (C3443c) abstractC2565b;
            return new X6.b(new X6.a(k7.e.f33691n), new C3134b(c3443c.c(), c3443c.d(), c3443c.b(), e.a(c3443c.a())));
        }
        throw new IOException("key parameters not recognized");
    }
}
