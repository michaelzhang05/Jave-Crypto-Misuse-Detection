package v7;

import U6.C1439a0;
import a7.C1677a;
import a7.C1678b;
import g7.AbstractC2889b;
import java.io.IOException;
import n7.C3489b;
import n7.h;
import n7.i;
import n7.j;
import n7.l;
import n7.n;
import o7.C3717a;
import o7.C3720d;
import o7.C3725i;
import p7.C3786c;
import r7.C3978b;
import u7.C4071c;
import w7.t;
import w7.z;

/* loaded from: classes5.dex */
public abstract class d {
    public static C1678b a(AbstractC2889b abstractC2889b) {
        if (abstractC2889b instanceof C3978b) {
            C3978b c3978b = (C3978b) abstractC2889b;
            return new C1678b(e.d(c3978b.b()), c3978b.a());
        }
        if (abstractC2889b instanceof C4071c) {
            C4071c c4071c = (C4071c) abstractC2889b;
            return new C1678b(new C1677a(n7.e.f35687r, new h(e.f(c4071c.a()))), c4071c.b());
        }
        if (abstractC2889b instanceof q7.b) {
            return new C1678b(new C1677a(n7.e.f35691v), ((q7.b) abstractC2889b).a());
        }
        if (abstractC2889b instanceof C3725i) {
            return new C1678b(new C1677a(Z6.a.f13672I0), new C1439a0(C3717a.f().i(1).c((C3725i) abstractC2889b).b()));
        }
        if (abstractC2889b instanceof C3720d) {
            C3720d c3720d = (C3720d) abstractC2889b;
            return new C1678b(new C1677a(Z6.a.f13672I0), new C1439a0(C3717a.f().i(c3720d.b()).c(c3720d.c()).b()));
        }
        if (abstractC2889b instanceof z) {
            z zVar = (z) abstractC2889b;
            byte[] c8 = zVar.c();
            byte[] d8 = zVar.d();
            byte[] encoded = zVar.getEncoded();
            if (encoded.length > c8.length + d8.length) {
                return new C1678b(new C1677a(W6.a.f12704a), new C1439a0(encoded));
            }
            return new C1678b(new C1677a(n7.e.f35692w, new i(zVar.b().b(), e.h(zVar.a()))), new n(c8, d8));
        }
        if (abstractC2889b instanceof t) {
            t tVar = (t) abstractC2889b;
            byte[] c9 = tVar.c();
            byte[] d9 = tVar.d();
            byte[] encoded2 = tVar.getEncoded();
            if (encoded2.length > c9.length + d9.length) {
                return new C1678b(new C1677a(W6.a.f12705b), new C1439a0(encoded2));
            }
            return new C1678b(new C1677a(n7.e.f35650F, new j(tVar.b().a(), tVar.b().b(), e.h(tVar.a()))), new l(tVar.c(), tVar.d()));
        }
        if (abstractC2889b instanceof C3786c) {
            C3786c c3786c = (C3786c) abstractC2889b;
            return new C1678b(new C1677a(n7.e.f35683n), new C3489b(c3786c.c(), c3786c.d(), c3786c.b(), e.a(c3786c.a())));
        }
        throw new IOException("key parameters not recognized");
    }
}
