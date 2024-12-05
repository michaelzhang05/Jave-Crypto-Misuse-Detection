package p3;

import com.google.crypto.tink.shaded.protobuf.a0;
import g3.y;
import java.security.GeneralSecurityException;
import o3.b;
import o3.t;
import p3.d;
import t3.i0;

/* loaded from: classes.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final v3.a f8829a;

    /* renamed from: b, reason: collision with root package name */
    private static final o3.k f8830b;

    /* renamed from: c, reason: collision with root package name */
    private static final o3.j f8831c;

    /* renamed from: d, reason: collision with root package name */
    private static final o3.c f8832d;

    /* renamed from: e, reason: collision with root package name */
    private static final o3.b f8833e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8834a;

        static {
            int[] iArr = new int[i0.values().length];
            f8834a = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8834a[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8834a[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8834a[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        v3.a e6 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f8829a = e6;
        f8830b = o3.k.a(new h3.j(), d.class, o3.p.class);
        f8831c = o3.j.a(new h3.k(), e6, o3.p.class);
        f8832d = o3.c.a(new h3.l(), p3.a.class, o3.o.class);
        f8833e = o3.b.a(new b.InterfaceC0126b() { // from class: p3.e
            @Override // o3.b.InterfaceC0126b
            public final g3.g a(o3.q qVar, y yVar) {
                a b6;
                b6 = f.b((o3.o) qVar, yVar);
                return b6;
            }
        }, e6, o3.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static p3.a b(o3.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            t3.a c02 = t3.a.c0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (c02.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return p3.a.c().e(d.a().b(c02.Y().size()).c(c02.Z().X()).d(e(oVar.e())).a()).c(v3.b.a(c02.Y().x(), y.b(yVar))).d(oVar.c()).a();
        } catch (a0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(o3.i.a());
    }

    public static void d(o3.i iVar) {
        iVar.h(f8830b);
        iVar.g(f8831c);
        iVar.f(f8832d);
        iVar.e(f8833e);
    }

    private static d.c e(i0 i0Var) {
        int i6 = a.f8834a[i0Var.ordinal()];
        if (i6 == 1) {
            return d.c.f8824b;
        }
        if (i6 == 2) {
            return d.c.f8825c;
        }
        if (i6 == 3) {
            return d.c.f8826d;
        }
        if (i6 == 4) {
            return d.c.f8827e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.b());
    }
}
