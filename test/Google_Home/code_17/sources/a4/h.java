package a4;

import N1.q;
import P5.AbstractC1378t;
import c2.C2012a;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.Y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class h implements o {

    /* renamed from: d, reason: collision with root package name */
    public static final a f13891d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final boolean f13892a;

    /* renamed from: b, reason: collision with root package name */
    private final List f13893b;

    /* renamed from: c, reason: collision with root package name */
    private final X3.c f13894c;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(List list, List list2) {
            List a8 = c2.n.a(list);
            KeyStore b8 = b(list2);
            X509CertSelector x509CertSelector = new X509CertSelector();
            x509CertSelector.setCertificate((X509Certificate) a8.get(0));
            PKIXBuilderParameters pKIXBuilderParameters = new PKIXBuilderParameters(b8, x509CertSelector);
            pKIXBuilderParameters.setRevocationEnabled(false);
            pKIXBuilderParameters.addCertStore(CertStore.getInstance("Collection", new CollectionCertStoreParameters(a8)));
            CertPathBuilder.getInstance("PKIX").build(pKIXBuilderParameters);
        }

        public final KeyStore b(List rootCerts) {
            AbstractC3255y.i(rootCerts, "rootCerts");
            KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            keyStore.load(null, null);
            int i8 = 0;
            for (Object obj : rootCerts) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1378t.w();
                }
                Y y8 = Y.f34167a;
                String format = String.format(Locale.ROOT, "ca_%d", Arrays.copyOf(new Object[]{Integer.valueOf(i8)}, 1));
                AbstractC3255y.h(format, "format(locale, format, *args)");
                keyStore.setCertificateEntry(format, (Certificate) rootCerts.get(i8));
                i8 = i9;
            }
            AbstractC3255y.f(keyStore);
            return keyStore;
        }

        public final N1.q c(N1.q jwsHeader) {
            AbstractC3255y.i(jwsHeader, "jwsHeader");
            N1.q b8 = new q.a(jwsHeader).f(null).b();
            AbstractC3255y.h(b8, "build(...)");
            return b8;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public h(boolean z8, List rootCerts, X3.c errorReporter) {
        AbstractC3255y.i(rootCerts, "rootCerts");
        AbstractC3255y.i(errorReporter, "errorReporter");
        this.f13892a = z8;
        this.f13893b = rootCerts;
        this.f13894c = errorReporter;
    }

    private final PublicKey b(N1.q qVar) {
        List n8 = qVar.n();
        AbstractC3255y.h(n8, "getX509CertChain(...)");
        PublicKey publicKey = c2.o.b(((C2012a) AbstractC1378t.m0(n8)).a()).getPublicKey();
        AbstractC3255y.h(publicKey, "getPublicKey(...)");
        return publicKey;
    }

    private final N1.s c(N1.q qVar) {
        Q1.a aVar = new Q1.a();
        aVar.d().c(P1.a.a());
        N1.s g8 = aVar.g(qVar, b(qVar));
        AbstractC3255y.h(g8, "createJWSVerifier(...)");
        return g8;
    }

    private final boolean e(N1.r rVar, List list) {
        if (rVar.h().j() != null) {
            this.f13894c.l(new IllegalArgumentException("Encountered a JWK in " + rVar.h()));
        }
        a aVar = f13891d;
        N1.q h8 = rVar.h();
        AbstractC3255y.h(h8, "getHeader(...)");
        N1.q c8 = aVar.c(h8);
        if (!d(c8.n(), list)) {
            return false;
        }
        return rVar.o(c(c8));
    }

    @Override // a4.o
    public JSONObject a(String jws) {
        AbstractC3255y.i(jws, "jws");
        N1.r k8 = N1.r.k(jws);
        if (this.f13892a) {
            AbstractC3255y.f(k8);
            if (!e(k8, this.f13893b)) {
                throw new IllegalStateException("Could not validate JWS");
            }
        }
        return new JSONObject(k8.b().toString());
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
            kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
            O5.s$a r0 = O5.s.f8302b     // Catch: java.lang.Throwable -> L16
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
            a4.h$a r0 = a4.h.f13891d     // Catch: java.lang.Throwable -> L16
            a4.h.a.a(r0, r3, r4)     // Catch: java.lang.Throwable -> L16
            O5.I r3 = O5.I.f8278a     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = O5.s.b(r3)     // Catch: java.lang.Throwable -> L16
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
            O5.s$a r4 = O5.s.f8302b
            java.lang.Object r3 = O5.t.a(r3)
            java.lang.Object r3 = O5.s.b(r3)
        L54:
            java.lang.Throwable r4 = O5.s.e(r3)
            if (r4 == 0) goto L5f
            X3.c r0 = r2.f13894c
            r0.l(r4)
        L5f:
            boolean r3 = O5.s.h(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.h.d(java.util.List, java.util.List):boolean");
    }
}
