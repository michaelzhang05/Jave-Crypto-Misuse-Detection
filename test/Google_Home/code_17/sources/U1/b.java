package U1;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.math.BigInteger;
import java.net.URI;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class b extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final Set f10265q = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(U1.a.f10253d, U1.a.f10254e, U1.a.f10256g, U1.a.f10257h)));

    /* renamed from: l, reason: collision with root package name */
    private final U1.a f10266l;

    /* renamed from: m, reason: collision with root package name */
    private final c2.c f10267m;

    /* renamed from: n, reason: collision with root package name */
    private final c2.c f10268n;

    /* renamed from: o, reason: collision with root package name */
    private final c2.c f10269o;

    /* renamed from: p, reason: collision with root package name */
    private final PrivateKey f10270p;

    public b(U1.a aVar, c2.c cVar, c2.c cVar2, h hVar, Set set, N1.a aVar2, String str, URI uri, c2.c cVar3, c2.c cVar4, List list, KeyStore keyStore) {
        super(g.f10310c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f10266l = aVar;
            if (cVar != null) {
                this.f10267m = cVar;
                if (cVar2 != null) {
                    this.f10268n = cVar2;
                    s(aVar, cVar, cVar2);
                    r(f());
                    this.f10269o = null;
                    this.f10270p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static c2.c q(int i8, BigInteger bigInteger) {
        byte[] a8 = c2.d.a(bigInteger);
        int i9 = (i8 + 7) / 8;
        if (a8.length >= i9) {
            return c2.c.e(a8);
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(a8, 0, bArr, i9 - a8.length, a8.length);
        return c2.c.e(bArr);
    }

    private void r(List list) {
        if (list == null || w((X509Certificate) list.get(0))) {
        } else {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void s(U1.a aVar, c2.c cVar, c2.c cVar2) {
        if (f10265q.contains(aVar)) {
            if (S1.b.a(cVar.b(), cVar2.b(), aVar.f())) {
                return;
            }
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
    }

    public static b x(String str) {
        return y(c2.k.m(str));
    }

    public static b y(Map map) {
        if (g.f10310c.equals(e.d(map))) {
            try {
                U1.a e8 = U1.a.e(c2.k.h(map, "crv"));
                c2.c a8 = c2.k.a(map, "x");
                c2.c a9 = c2.k.a(map, "y");
                c2.c a10 = c2.k.a(map, "d");
                try {
                    if (a10 == null) {
                        return new b(e8, a8, a9, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new b(e8, a8, a9, a10, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), (KeyStore) null);
                } catch (IllegalArgumentException e9) {
                    throw new ParseException(e9.getMessage(), 0);
                }
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type \"kty\" must be EC", 0);
    }

    public ECPublicKey A(Provider provider) {
        KeyFactory keyFactory;
        ECParameterSpec f8 = this.f10266l.f();
        if (f8 != null) {
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(this.f10267m.b(), this.f10268n.b()), f8);
            try {
                if (provider == null) {
                    keyFactory = KeyFactory.getInstance("EC");
                } else {
                    keyFactory = KeyFactory.getInstance("EC", provider);
                }
                return (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
            } catch (NoSuchAlgorithmException e8) {
                e = e8;
                throw new N1.f(e.getMessage(), e);
            } catch (InvalidKeySpecException e9) {
                e = e9;
                throw new N1.f(e.getMessage(), e);
            }
        }
        throw new N1.f("Couldn't get EC parameter spec for curve " + this.f10266l);
    }

    public b B() {
        return new b(t(), u(), v(), e(), c(), a(), b(), j(), i(), h(), g(), d());
    }

    @Override // U1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f10266l, bVar.f10266l) && Objects.equals(this.f10267m, bVar.f10267m) && Objects.equals(this.f10268n, bVar.f10268n) && Objects.equals(this.f10269o, bVar.f10269o) && Objects.equals(this.f10270p, bVar.f10270p)) {
            return true;
        }
        return false;
    }

    @Override // U1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10266l, this.f10267m, this.f10268n, this.f10269o, this.f10270p);
    }

    @Override // U1.d
    public boolean k() {
        if (this.f10269o == null && this.f10270p == null) {
            return false;
        }
        return true;
    }

    @Override // U1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("crv", this.f10266l.toString());
        n8.put("x", this.f10267m.toString());
        n8.put("y", this.f10268n.toString());
        c2.c cVar = this.f10269o;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        return n8;
    }

    public U1.a t() {
        return this.f10266l;
    }

    public c2.c u() {
        return this.f10267m;
    }

    public c2.c v() {
        return this.f10268n;
    }

    public boolean w(X509Certificate x509Certificate) {
        try {
            ECPublicKey eCPublicKey = (ECPublicKey) ((X509Certificate) f().get(0)).getPublicKey();
            if (!u().b().equals(eCPublicKey.getW().getAffineX())) {
                return false;
            }
            return v().b().equals(eCPublicKey.getW().getAffineY());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public ECPublicKey z() {
        return A(null);
    }

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final U1.a f10271a;

        /* renamed from: b, reason: collision with root package name */
        private final c2.c f10272b;

        /* renamed from: c, reason: collision with root package name */
        private final c2.c f10273c;

        /* renamed from: d, reason: collision with root package name */
        private c2.c f10274d;

        /* renamed from: e, reason: collision with root package name */
        private PrivateKey f10275e;

        /* renamed from: f, reason: collision with root package name */
        private h f10276f;

        /* renamed from: g, reason: collision with root package name */
        private Set f10277g;

        /* renamed from: h, reason: collision with root package name */
        private N1.a f10278h;

        /* renamed from: i, reason: collision with root package name */
        private String f10279i;

        /* renamed from: j, reason: collision with root package name */
        private URI f10280j;

        /* renamed from: k, reason: collision with root package name */
        private c2.c f10281k;

        /* renamed from: l, reason: collision with root package name */
        private c2.c f10282l;

        /* renamed from: m, reason: collision with root package name */
        private List f10283m;

        /* renamed from: n, reason: collision with root package name */
        private KeyStore f10284n;

        public a(U1.a aVar, c2.c cVar, c2.c cVar2) {
            if (aVar != null) {
                this.f10271a = aVar;
                if (cVar != null) {
                    this.f10272b = cVar;
                    if (cVar2 != null) {
                        this.f10273c = cVar2;
                        return;
                    }
                    throw new IllegalArgumentException("The 'y' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'x' coordinate must not be null");
            }
            throw new IllegalArgumentException("The curve must not be null");
        }

        public b a() {
            try {
                if (this.f10274d == null && this.f10275e == null) {
                    return new b(this.f10271a, this.f10272b, this.f10273c, this.f10276f, this.f10277g, this.f10278h, this.f10279i, this.f10280j, this.f10281k, this.f10282l, this.f10283m, this.f10284n);
                }
                if (this.f10275e != null) {
                    return new b(this.f10271a, this.f10272b, this.f10273c, this.f10275e, this.f10276f, this.f10277g, this.f10278h, this.f10279i, this.f10280j, this.f10281k, this.f10282l, this.f10283m, this.f10284n);
                }
                return new b(this.f10271a, this.f10272b, this.f10273c, this.f10274d, this.f10276f, this.f10277g, this.f10278h, this.f10279i, this.f10280j, this.f10281k, this.f10282l, this.f10283m, this.f10284n);
            } catch (IllegalArgumentException e8) {
                throw new IllegalStateException(e8.getMessage(), e8);
            }
        }

        public a b(String str) {
            this.f10279i = str;
            return this;
        }

        public a c(h hVar) {
            this.f10276f = hVar;
            return this;
        }

        public a(U1.a aVar, ECPublicKey eCPublicKey) {
            this(aVar, b.q(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), b.q(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public b(U1.a aVar, c2.c cVar, c2.c cVar2, c2.c cVar3, h hVar, Set set, N1.a aVar2, String str, URI uri, c2.c cVar4, c2.c cVar5, List list, KeyStore keyStore) {
        super(g.f10310c, hVar, set, aVar2, str, uri, cVar4, cVar5, list, keyStore);
        if (aVar != null) {
            this.f10266l = aVar;
            if (cVar != null) {
                this.f10267m = cVar;
                if (cVar2 != null) {
                    this.f10268n = cVar2;
                    s(aVar, cVar, cVar2);
                    r(f());
                    if (cVar3 != null) {
                        this.f10269o = cVar3;
                        this.f10270p = null;
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' coordinate must not be null");
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public b(U1.a aVar, c2.c cVar, c2.c cVar2, PrivateKey privateKey, h hVar, Set set, N1.a aVar2, String str, URI uri, c2.c cVar3, c2.c cVar4, List list, KeyStore keyStore) {
        super(g.f10310c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f10266l = aVar;
            if (cVar != null) {
                this.f10267m = cVar;
                if (cVar2 != null) {
                    this.f10268n = cVar2;
                    s(aVar, cVar, cVar2);
                    r(f());
                    this.f10269o = null;
                    this.f10270p = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
