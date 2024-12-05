package h3;

import h3.q;
import java.security.GeneralSecurityException;
import o3.b;

/* loaded from: classes.dex */
abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final v3.a f6911a;

    /* renamed from: b, reason: collision with root package name */
    private static final o3.k f6912b;

    /* renamed from: c, reason: collision with root package name */
    private static final o3.j f6913c;

    /* renamed from: d, reason: collision with root package name */
    private static final o3.c f6914d;

    /* renamed from: e, reason: collision with root package name */
    private static final o3.b f6915e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6916a;

        static {
            int[] iArr = new int[t3.i0.values().length];
            f6916a = iArr;
            try {
                iArr[t3.i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6916a[t3.i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6916a[t3.i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6916a[t3.i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        v3.a e6 = o3.t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f6911a = e6;
        f6912b = o3.k.a(new j(), q.class, o3.p.class);
        f6913c = o3.j.a(new k(), e6, o3.p.class);
        f6914d = o3.c.a(new l(), o.class, o3.o.class);
        f6915e = o3.b.a(new b.InterfaceC0126b() { // from class: h3.r
            @Override // o3.b.InterfaceC0126b
            public final g3.g a(o3.q qVar, g3.y yVar) {
                o b6;
                b6 = s.b((o3.o) qVar, yVar);
                return b6;
            }
        }, e6, o3.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o b(o3.o oVar, g3.y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            t3.l a02 = t3.l.a0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (a02.Y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(a02.X().size()).b(12).d(16).e(e(oVar.e())).a()).d(v3.b.a(a02.X().x(), g3.y.b(yVar))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.a0 unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(o3.i.a());
    }

    public static void d(o3.i iVar) {
        iVar.h(f6912b);
        iVar.g(f6913c);
        iVar.f(f6914d);
        iVar.e(f6915e);
    }

    private static q.c e(t3.i0 i0Var) {
        int i6 = a.f6916a[i0Var.ordinal()];
        if (i6 == 1) {
            return q.c.f6907b;
        }
        if (i6 == 2 || i6 == 3) {
            return q.c.f6908c;
        }
        if (i6 == 4) {
            return q.c.f6909d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.b());
    }
}
