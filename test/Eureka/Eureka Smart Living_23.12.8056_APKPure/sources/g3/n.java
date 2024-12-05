package g3;

import com.google.crypto.tink.shaded.protobuf.a0;
import g3.v;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t3.c0;
import t3.d0;
import t3.i0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final c0 f6727a;

    /* renamed from: b, reason: collision with root package name */
    private final List f6728b;

    /* renamed from: c, reason: collision with root package name */
    private final r3.a f6729c = r3.a.f9112b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6730a;

        static {
            int[] iArr = new int[t3.z.values().length];
            f6730a = iArr;
            try {
                iArr[t3.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6730a[t3.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6730a[t3.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final g f6731a;

        /* renamed from: b, reason: collision with root package name */
        private final k f6732b;

        /* renamed from: c, reason: collision with root package name */
        private final int f6733c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f6734d;

        private b(g gVar, k kVar, int i6, boolean z5) {
            this.f6731a = gVar;
            this.f6732b = kVar;
            this.f6733c = i6;
            this.f6734d = z5;
        }

        public g a() {
            return this.f6731a;
        }

        /* synthetic */ b(g gVar, k kVar, int i6, boolean z5, a aVar) {
            this(gVar, kVar, i6, z5);
        }
    }

    private n(c0 c0Var, List list) {
        this.f6727a = c0Var;
        this.f6728b = list;
    }

    private static void a(t3.t tVar) {
        if (tVar == null || tVar.X().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static void b(c0 c0Var) {
        if (c0Var == null || c0Var.a0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t3.t tVar, g3.a aVar, byte[] bArr) {
        try {
            c0 f02 = c0.f0(aVar.b(tVar.X().x(), bArr), com.google.crypto.tink.shaded.protobuf.p.b());
            b(f02);
            return f02;
        } catch (a0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t3.t d(c0 c0Var, g3.a aVar, byte[] bArr) {
        byte[] a6 = aVar.a(c0Var.a(), bArr);
        try {
            if (c0.f0(aVar.b(a6, bArr), com.google.crypto.tink.shaded.protobuf.p.b()).equals(c0Var)) {
                return (t3.t) t3.t.Y().r(com.google.crypto.tink.shaded.protobuf.h.l(a6)).s(z.b(c0Var)).i();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (a0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final n e(c0 c0Var) {
        b(c0Var);
        return new n(c0Var, f(c0Var));
    }

    private static List f(c0 c0Var) {
        ArrayList arrayList = new ArrayList(c0Var.a0());
        for (c0.c cVar : c0Var.b0()) {
            int a02 = cVar.a0();
            try {
                arrayList.add(new b(o3.i.a().d(q(cVar), f.a()), m(cVar.c0()), a02, a02 == c0Var.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private Object g(g gVar, Class cls) {
        try {
            return x.c(gVar, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    private static Object j(c0.c cVar, Class cls) {
        try {
            return x.g(cVar.Z(), cls);
        } catch (GeneralSecurityException e6) {
            if (e6.getMessage().contains("No key manager found for key type ") || e6.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e6;
        }
    }

    private Object l(Class cls, Class cls2) {
        z.d(this.f6727a);
        v.b j6 = v.j(cls2);
        j6.e(this.f6729c);
        for (int i6 = 0; i6 < p(); i6++) {
            c0.c Z = this.f6727a.Z(i6);
            if (Z.c0().equals(t3.z.ENABLED)) {
                Object j7 = j(Z, cls2);
                Object g6 = this.f6728b.get(i6) != null ? g(((b) this.f6728b.get(i6)).a(), cls2) : null;
                if (Z.a0() == this.f6727a.c0()) {
                    j6.b(g6, j7, Z);
                } else {
                    j6.a(g6, j7, Z);
                }
            }
        }
        return x.o(j6.d(), cls);
    }

    private static k m(t3.z zVar) {
        int i6 = a.f6730a[zVar.ordinal()];
        if (i6 == 1) {
            return k.f6715b;
        }
        if (i6 == 2) {
            return k.f6716c;
        }
        if (i6 == 3) {
            return k.f6717d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final n n(p pVar, g3.a aVar) {
        return o(pVar, aVar, new byte[0]);
    }

    public static final n o(p pVar, g3.a aVar, byte[] bArr) {
        t3.t a6 = pVar.a();
        a(a6);
        return e(c(a6, aVar, bArr));
    }

    private static o3.o q(c0.c cVar) {
        try {
            return o3.o.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), cVar.b0() == i0.RAW ? null : Integer.valueOf(cVar.a0()));
        } catch (GeneralSecurityException e6) {
            throw new o3.s("Creating a protokey serialization failed", e6);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 h() {
        return this.f6727a;
    }

    public d0 i() {
        return z.b(this.f6727a);
    }

    public Object k(Class cls) {
        Class d6 = x.d(cls);
        if (d6 != null) {
            return l(cls, d6);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public int p() {
        return this.f6727a.a0();
    }

    public void r(q qVar, g3.a aVar) {
        s(qVar, aVar, new byte[0]);
    }

    public void s(q qVar, g3.a aVar, byte[] bArr) {
        qVar.a(d(this.f6727a, aVar, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
