package h3;

import h3.i;
import java.security.GeneralSecurityException;
import o3.b;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final v3.a f6885a;

    /* renamed from: b, reason: collision with root package name */
    private static final o3.k f6886b;

    /* renamed from: c, reason: collision with root package name */
    private static final o3.j f6887c;

    /* renamed from: d, reason: collision with root package name */
    private static final o3.c f6888d;

    /* renamed from: e, reason: collision with root package name */
    private static final o3.b f6889e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6890a;

        static {
            int[] iArr = new int[t3.i0.values().length];
            f6890a = iArr;
            try {
                iArr[t3.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6890a[t3.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6890a[t3.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6890a[t3.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        v3.a e6 = o3.t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        f6885a = e6;
        f6886b = o3.k.a(new j(), i.class, o3.p.class);
        f6887c = o3.j.a(new k(), e6, o3.p.class);
        f6888d = o3.c.a(new l(), g.class, o3.o.class);
        f6889e = o3.b.a(new b.InterfaceC0126b() { // from class: h3.m
            @Override // o3.b.InterfaceC0126b
            public final g3.g a(o3.q qVar, g3.y yVar) {
                g b6;
                b6 = n.b((o3.o) qVar, yVar);
                return b6;
            }
        }, e6, o3.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g b(o3.o oVar, g3.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
        }
        try {
            t3.i c02 = t3.i.c0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (c02.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return g.a().e(i.a().c(c02.Y().size()).b(c02.Z().X()).d(16).e(e(oVar.e())).a()).d(v3.b.a(c02.Y().x(), g3.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.a0 unused) {
            throw new GeneralSecurityException("Parsing AesEaxcKey failed");
        }
    }

    public static void c() {
        d(o3.i.a());
    }

    public static void d(o3.i iVar) {
        iVar.h(f6886b);
        iVar.g(f6887c);
        iVar.f(f6888d);
        iVar.e(f6889e);
    }

    private static i.c e(t3.i0 i0Var) {
        int i6 = a.f6890a[i0Var.ordinal()];
        if (i6 == 1) {
            return i.c.f6870b;
        }
        if (i6 == 2 || i6 == 3) {
            return i.c.f6871c;
        }
        if (i6 == 4) {
            return i.c.f6872d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.b());
    }
}
