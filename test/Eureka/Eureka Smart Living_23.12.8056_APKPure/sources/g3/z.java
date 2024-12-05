package g3;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import t3.c0;
import t3.d0;
import t3.i0;
import t3.y;

/* loaded from: classes.dex */
abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f6763a = Charset.forName("UTF-8");

    public static d0.c a(c0.c cVar) {
        return (d0.c) d0.c.a0().u(cVar.Z().a0()).t(cVar.c0()).s(cVar.b0()).r(cVar.a0()).i();
    }

    public static d0 b(c0 c0Var) {
        d0.b s5 = d0.a0().s(c0Var.c0());
        Iterator it = c0Var.b0().iterator();
        while (it.hasNext()) {
            s5.r(a((c0.c) it.next()));
        }
        return (d0) s5.i();
    }

    public static void c(c0.c cVar) {
        if (!cVar.d0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.a0())));
        }
        if (cVar.b0() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.a0())));
        }
        if (cVar.c0() == t3.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.a0())));
        }
    }

    public static void d(c0 c0Var) {
        int c02 = c0Var.c0();
        int i6 = 0;
        boolean z5 = false;
        boolean z6 = true;
        for (c0.c cVar : c0Var.b0()) {
            if (cVar.c0() == t3.z.ENABLED) {
                c(cVar);
                if (cVar.a0() == c02) {
                    if (z5) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z5 = true;
                }
                if (cVar.Z().Z() != y.c.ASYMMETRIC_PUBLIC) {
                    z6 = false;
                }
                i6++;
            }
        }
        if (i6 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z5 && !z6) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
