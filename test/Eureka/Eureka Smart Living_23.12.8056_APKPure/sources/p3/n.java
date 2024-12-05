package p3;

import com.google.crypto.tink.shaded.protobuf.a0;
import g3.y;
import java.security.GeneralSecurityException;
import o3.b;
import o3.t;
import p3.l;
import t3.i0;
import t3.u;
import t3.v;

/* loaded from: classes.dex */
abstract class n {

    /* renamed from: a, reason: collision with root package name */
    private static final v3.a f8866a;

    /* renamed from: b, reason: collision with root package name */
    private static final o3.k f8867b;

    /* renamed from: c, reason: collision with root package name */
    private static final o3.j f8868c;

    /* renamed from: d, reason: collision with root package name */
    private static final o3.c f8869d;

    /* renamed from: e, reason: collision with root package name */
    private static final o3.b f8870e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8871a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f8872b;

        static {
            int[] iArr = new int[i0.values().length];
            f8872b = iArr;
            try {
                iArr[i0.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8872b[i0.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8872b[i0.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8872b[i0.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f8871a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8871a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8871a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8871a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8871a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        v3.a e6 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f8866a = e6;
        f8867b = o3.k.a(new h3.j(), l.class, o3.p.class);
        f8868c = o3.j.a(new h3.k(), e6, o3.p.class);
        f8869d = o3.c.a(new h3.l(), i.class, o3.o.class);
        f8870e = o3.b.a(new b.InterfaceC0126b() { // from class: p3.m
            @Override // o3.b.InterfaceC0126b
            public final g3.g a(o3.q qVar, y yVar) {
                i b6;
                b6 = n.b((o3.o) qVar, yVar);
                return b6;
            }
        }, e6, o3.o.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i b(o3.o oVar, y yVar) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v d02 = v.d0(oVar.g(), com.google.crypto.tink.shaded.protobuf.p.b());
            if (d02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(d02.Z().size()).d(d02.a0().Z()).b(e(d02.a0().Y())).e(f(oVar.e())).a()).d(v3.b.a(d02.Z().x(), y.b(yVar))).c(oVar.c()).a();
        } catch (a0 | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(o3.i.a());
    }

    public static void d(o3.i iVar) {
        iVar.h(f8867b);
        iVar.g(f8868c);
        iVar.f(f8869d);
        iVar.e(f8870e);
    }

    private static l.c e(u uVar) {
        int i6 = a.f8871a[uVar.ordinal()];
        if (i6 == 1) {
            return l.c.f8855b;
        }
        if (i6 == 2) {
            return l.c.f8856c;
        }
        if (i6 == 3) {
            return l.c.f8857d;
        }
        if (i6 == 4) {
            return l.c.f8858e;
        }
        if (i6 == 5) {
            return l.c.f8859f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.b());
    }

    private static l.d f(i0 i0Var) {
        int i6 = a.f8872b[i0Var.ordinal()];
        if (i6 == 1) {
            return l.d.f8861b;
        }
        if (i6 == 2) {
            return l.d.f8862c;
        }
        if (i6 == 3) {
            return l.d.f8863d;
        }
        if (i6 == 4) {
            return l.d.f8864e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i0Var.b());
    }
}
