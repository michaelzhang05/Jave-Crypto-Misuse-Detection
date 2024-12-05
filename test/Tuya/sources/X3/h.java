package X3;

import K1.q;
import M5.AbstractC1246t;
import java.security.KeyStore;
import java.security.PublicKey;
import java.security.cert.CertPathBuilder;
import java.security.cert.CertStore;
import java.security.cert.Certificate;
import java.security.cert.CollectionCertStoreParameters;
import java.security.cert.PKIXBuilderParameters;
import java.security.cert.X509CertSelector;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final a f12270d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f12271a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12272b;

    /* renamed from: c, reason: collision with root package name */
    private final U3.c f12273c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(List list, List list2) {
            List a8 = Z1.n.a(list);
            KeyStore b8 = b(list2);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate((X509Certificate) a8.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(b8, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(a8)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore b(List rootCerts) {
            AbstractC3159y.i(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i8 = 0;
            for (Object obj : rootCerts) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1246t.w();
                }
                Y y8 = Y.f33766a;
                String format = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3159y.h(format, "format(locale, format, *args)");
                keyStore.setCertificateEntry(format, (Certificate) rootCerts.get(i8));
                i8 = i9;
            }
            AbstractC3159y.f(keyStore);
            return keyStore;
        }

        public final K1.q c(K1.q jwsHeader) {
            AbstractC3159y.i(jwsHeader, "jwsHeader");
            K1.q b8 = new q.a(jwsHeader).f(null).b();
            AbstractC3159y.h(b8, "build(...)");
            return b8;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public h(boolean z8, List rootCerts, U3.c errorReporter) {
        AbstractC3159y.i(rootCerts, "rootCerts");
        AbstractC3159y.i(errorReporter, "errorReporter");
        this.f12271a = z8;
        this.f12272b = rootCerts;
        this.f12273c = errorReporter;
    }

    private final PublicKey b(K1.q qVar) {
        List n8 = qVar.n();
        AbstractC3159y.h(n8, "getX509CertChain(...)");
        PublicKey publicKey = Z1.o.b(((Z1.a) AbstractC1246t.m0(n8)).a()).getPublicKey();
        AbstractC3159y.h(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    private final K1.s c(K1.q qVar) {
        N1.a aVar = new N1.a();
        aVar.e().c(M1.a.a());
        K1.s g8 = aVar.g(qVar, b(qVar));
        AbstractC3159y.h(g8, "createJWSVerifier(...)");
        return g8;
    }

    private final boolean e(K1.r rVar, List list) {
        if (rVar.h().k() != null) {
            this.f12273c.i(new IllegalArgumentException("Encountered a JWK in " + rVar.h()));
        }
        a aVar = f12270d;
        K1.q h8 = rVar.h();
        AbstractC3159y.h(h8, "getHeader(...)");
        K1.q c8 = aVar.c(h8);
        if (!d(c8.n(), list)) {
            return false;
        }
        return rVar.o(c(c8));
    }

    @Override // X3.o
    public JSONObject a(String jws) {
        AbstractC3159y.i(jws, "jws");
        K1.r l8 = K1.r.l(jws);
        if (this.f12271a) {
            AbstractC3159y.f(l8);
            if (!e(l8, this.f12272b)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(l8.b().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0005, B:5:0x000d, B:9:0x0019, B:11:0x001c, B:13:0x0026, B:20:0x0032, B:21:0x003d, B:22:0x003e, B:23:0x0049), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:3:0x0005, B:5:0x000d, B:9:0x0019, B:11:0x001c, B:13:0x0026, B:20:0x0032, B:21:0x003d, B:22:0x003e, B:23:0x0049), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(java.util.List r3, java.util.List r4) {
        /*
            r2 = this;
            java.lang.String r0 = "rootCerts"
            kotlin.jvm.internal.AbstractC3159y.i(r4, r0)
            L5.s$a r0 = L5.s.f6511b     // Catch: java.lang.Throwable -> L16
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L16
            r1 = 1
            if (r0 == 0) goto L18
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L14
            goto L18
        L14:
            r0 = 0
            goto L19
        L16:
            r3 = move-exception
            goto L4a
        L18:
            r0 = 1
        L19:
            r0 = r0 ^ r1
            if (r0 == 0) goto L3e
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L16
            r0 = r0 ^ r1
            if (r0 == 0) goto L32
            X3.h$a r0 = X3.h.f12270d     // Catch: java.lang.Throwable -> L16
            X3.h.a.a(r0, r3, r4)     // Catch: java.lang.Throwable -> L16
            L5.I r3 = L5.I.f6487a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = L5.s.b(r3)     // Catch: java.lang.Throwable -> L16
            goto L54
        L32:
            java.lang.String r3 = "Root certificates are empty"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L16
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L16
            throw r4     // Catch: java.lang.Throwable -> L16
        L3e:
            java.lang.String r3 = "JWSHeader's X.509 certificate chain is null or empty"
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L16
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L16
            r4.<init>(r3)     // Catch: java.lang.Throwable -> L16
            throw r4     // Catch: java.lang.Throwable -> L16
        L4a:
            L5.s$a r4 = L5.s.f6511b
            java.lang.Object r3 = L5.t.a(r3)
            java.lang.Object r3 = L5.s.b(r3)
        L54:
            java.lang.Throwable r4 = L5.s.e(r3)
            if (r4 == 0) goto L5f
            U3.c r0 = r2.f12273c
            r0.i(r4)
        L5f:
            boolean r3 = L5.s.h(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.h.d(java.util.List, java.util.List):boolean");
    }
}
