package h3;

import h3.v;
import java.security.GeneralSecurityException;
import o3.b;

/* loaded from: classes.dex */
abstract class x {

    /* renamed from: a, reason: collision with root package name */
    private static final v3.a f6933a;

    /* renamed from: b, reason: collision with root package name */
    private static final o3.k f6934b;

    /* renamed from: c, reason: collision with root package name */
    private static final o3.j f6935c;

    /* renamed from: d, reason: collision with root package name */
    private static final o3.c f6936d;

    /* renamed from: e, reason: collision with root package name */
    private static final o3.b f6937e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6938a;

        static {
            int[] iArr = new int[t3.i0.values().length];
            f6938a = iArr;
            try {
                iArr[t3.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6938a[t3.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6938a[t3.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6938a[t3.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        v3.a e6 = o3.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f6933a = e6;
        f6934b = o3.k.a(new j(), v.class, o3.p.class);
        f6935c = o3.j.a(new k(), e6, o3.p.class);
        f6936d = o3.c.a(new l(), t.class, o3.o.class);
        f6937e = o3.b.a(new b.InterfaceC0126b() { // from class: h3.w
            @Override // o3.b.InterfaceC0126b
            public final g3.g a(o3.q qVar, g3.y yVar) {
                t b6;
                b6 = x.b((o3.o) qVar, yVar);
                return b6;
            }
        }, e6, o3.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static t b(o3.o oVar, g3.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            t3.n a02 = t3.n.a0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (a02.Y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(a02.X().size()).c(e(oVar.e())).a()).d(v3.b.a(a02.X().x(), g3.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.a0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(o3.i.a());
    }

    public static void d(o3.i iVar) {
        iVar.h(f6934b);
        iVar.g(f6935c);
        iVar.f(f6936d);
        iVar.e(f6937e);
    }

    private static v.c e(t3.i0 i0Var) {
        int i6 = a.f6938a[i0Var.ordinal()];
        if (i6 == 1) {
            return v.c.f6929b;
        }
        if (i6 == 2 || i6 == 3) {
            return v.c.f6930c;
        }
        if (i6 == 4) {
            return v.c.f6931d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.b());
    }
}
