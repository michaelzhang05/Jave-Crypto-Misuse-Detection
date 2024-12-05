package h3;

import h3.i0;
import java.security.GeneralSecurityException;
import o3.b;

/* loaded from: classes.dex */
abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    private static final v3.a f6879a;

    /* renamed from: b, reason: collision with root package name */
    private static final o3.k f6880b;

    /* renamed from: c, reason: collision with root package name */
    private static final o3.j f6881c;

    /* renamed from: d, reason: collision with root package name */
    private static final o3.c f6882d;

    /* renamed from: e, reason: collision with root package name */
    private static final o3.b f6883e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6884a;

        static {
            int[] iArr = new int[t3.i0.values().length];
            f6884a = iArr;
            try {
                iArr[t3.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6884a[t3.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6884a[t3.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6884a[t3.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        v3.a e6 = o3.t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f6879a = e6;
        f6880b = o3.k.a(new j(), i0.class, o3.p.class);
        f6881c = o3.j.a(new k(), e6, o3.p.class);
        f6882d = o3.c.a(new l(), g0.class, o3.o.class);
        f6883e = o3.b.a(new b.InterfaceC0126b() { // from class: h3.j0
            @Override // o3.b.InterfaceC0126b
            public final g3.g a(o3.q qVar, g3.y yVar) {
                g0 b6;
                b6 = k0.b((o3.o) qVar, yVar);
                return b6;
            }
        }, e6, o3.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g0 b(o3.o oVar, g3.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            t3.k0 a02 = t3.k0.a0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (a02.Y() == 0) {
                return g0.a(e(oVar.e()), v3.b.a(a02.X().x(), g3.y.b(yVar)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.a0 unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(o3.i.a());
    }

    public static void d(o3.i iVar) {
        iVar.h(f6880b);
        iVar.g(f6881c);
        iVar.f(f6882d);
        iVar.e(f6883e);
    }

    private static i0.a e(t3.i0 i0Var) {
        int i6 = a.f6884a[i0Var.ordinal()];
        if (i6 == 1) {
            return i0.a.f6875b;
        }
        if (i6 == 2 || i6 == 3) {
            return i0.a.f6876c;
        }
        if (i6 == 4) {
            return i0.a.f6877d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.b());
    }
}
