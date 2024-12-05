package R1;

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
    public static final Set f8639q = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(R1.a.f8627d, R1.a.f8628e, R1.a.f8630g, R1.a.f8631h)));

    /* renamed from: l, reason: collision with root package name */
    private final R1.a f8640l;

    /* renamed from: m, reason: collision with root package name */
    private final Z1.c f8641m;

    /* renamed from: n, reason: collision with root package name */
    private final Z1.c f8642n;

    /* renamed from: o, reason: collision with root package name */
    private final Z1.c f8643o;

    /* renamed from: p, reason: collision with root package name */
    private final PrivateKey f8644p;

    public b(R1.a aVar, Z1.c cVar, Z1.c cVar2, h hVar, Set set, K1.a aVar2, String str, URI uri, Z1.c cVar3, Z1.c cVar4, List list, KeyStore keyStore) {
        super(g.f8684c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f8640l = aVar;
            if (cVar != null) {
                this.f8641m = cVar;
                if (cVar2 != null) {
                    this.f8642n = cVar2;
                    r(aVar, cVar, cVar2);
                    q(f());
                    this.f8643o = null;
                    this.f8644p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static Z1.c p(int i8, BigInteger bigInteger) {
        byte[] a8 = Z1.d.a(bigInteger);
        int i9 = (i8 + 7) / 8;
        if (a8.length >= i9) {
            return Z1.c.e(a8);
        }
        byte[] bArr = new byte[i9];
        System.arraycopy(a8, 0, bArr, i9 - a8.length, a8.length);
        return Z1.c.e(bArr);
    }

    private void q(List list) {
        if (list == null || w((X509Certificate) list.get(0))) {
        } else {
            throw new IllegalArgumentException("The public subject key info of the first X.509 certificate in the chain must match the JWK type and public parameters");
        }
    }

    private static void r(R1.a aVar, Z1.c cVar, Z1.c cVar2) {
        if (f8639q.contains(aVar)) {
            if (P1.b.a(cVar.b(), cVar2.b(), aVar.f())) {
                return;
            }
            throw new IllegalArgumentException("Invalid EC JWK: The 'x' and 'y' public coordinates are not on the " + aVar + " curve");
        }
        throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
    }

    public static b x(String str) {
        return y(Z1.k.m(str));
    }

    public static b y(Map map) {
        if (g.f8684c.equals(e.d(map))) {
            try {
                R1.a e8 = R1.a.e(Z1.k.h(map, "crv"));
                Z1.c a8 = Z1.k.a(map, "x");
                Z1.c a9 = Z1.k.a(map, "y");
                Z1.c a10 = Z1.k.a(map, "d");
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

    public ECPublicKey A() {
        return B(null);
    }

    public ECPublicKey B(Provider provider) {
        KeyFactory keyFactory;
        ECParameterSpec f8 = this.f8640l.f();
        if (f8 != null) {
            ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(new ECPoint(this.f8641m.b(), this.f8642n.b()), f8);
            try {
                if (provider == null) {
                    keyFactory = KeyFactory.getInstance("EC");
                } else {
                    keyFactory = KeyFactory.getInstance("EC", provider);
                }
                return (ECPublicKey) keyFactory.generatePublic(eCPublicKeySpec);
            } catch (NoSuchAlgorithmException e8) {
                e = e8;
                throw new K1.f(e.getMessage(), e);
            } catch (InvalidKeySpecException e9) {
                e = e9;
                throw new K1.f(e.getMessage(), e);
            }
        }
        throw new K1.f("Couldn't get EC parameter spec for curve " + this.f8640l);
    }

    public b C() {
        return new b(t(), u(), v(), e(), c(), a(), b(), k(), j(), h(), g(), d());
    }

    @Override // R1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b) || !super.equals(obj)) {
            return false;
        }
        b bVar = (b) obj;
        if (Objects.equals(this.f8640l, bVar.f8640l) && Objects.equals(this.f8641m, bVar.f8641m) && Objects.equals(this.f8642n, bVar.f8642n) && Objects.equals(this.f8643o, bVar.f8643o) && Objects.equals(this.f8644p, bVar.f8644p)) {
            return true;
        }
        return false;
    }

    @Override // R1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f8640l, this.f8641m, this.f8642n, this.f8643o, this.f8644p);
    }

    @Override // R1.d
    public boolean l() {
        if (this.f8643o == null && this.f8644p == null) {
            return false;
        }
        return true;
    }

    @Override // R1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("crv", this.f8640l.toString());
        n8.put("x", this.f8641m.toString());
        n8.put("y", this.f8642n.toString());
        Z1.c cVar = this.f8643o;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        return n8;
    }

    public R1.a t() {
        return this.f8640l;
    }

    public Z1.c u() {
        return this.f8641m;
    }

    public Z1.c v() {
        return this.f8642n;
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

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final R1.a f8645a;

        /* renamed from: b, reason: collision with root package name */
        private final Z1.c f8646b;

        /* renamed from: c, reason: collision with root package name */
        private final Z1.c f8647c;

        /* renamed from: d, reason: collision with root package name */
        private Z1.c f8648d;

        /* renamed from: e, reason: collision with root package name */
        private PrivateKey f8649e;

        /* renamed from: f, reason: collision with root package name */
        private h f8650f;

        /* renamed from: g, reason: collision with root package name */
        private Set f8651g;

        /* renamed from: h, reason: collision with root package name */
        private K1.a f8652h;

        /* renamed from: i, reason: collision with root package name */
        private String f8653i;

        /* renamed from: j, reason: collision with root package name */
        private URI f8654j;

        /* renamed from: k, reason: collision with root package name */
        private Z1.c f8655k;

        /* renamed from: l, reason: collision with root package name */
        private Z1.c f8656l;

        /* renamed from: m, reason: collision with root package name */
        private List f8657m;

        /* renamed from: n, reason: collision with root package name */
        private KeyStore f8658n;

        public a(R1.a aVar, Z1.c cVar, Z1.c cVar2) {
            if (aVar != null) {
                this.f8645a = aVar;
                if (cVar != null) {
                    this.f8646b = cVar;
                    if (cVar2 != null) {
                        this.f8647c = cVar2;
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
                if (this.f8648d == null && this.f8649e == null) {
                    return new b(this.f8645a, this.f8646b, this.f8647c, this.f8650f, this.f8651g, this.f8652h, this.f8653i, this.f8654j, this.f8655k, this.f8656l, this.f8657m, this.f8658n);
                }
                if (this.f8649e != null) {
                    return new b(this.f8645a, this.f8646b, this.f8647c, this.f8649e, this.f8650f, this.f8651g, this.f8652h, this.f8653i, this.f8654j, this.f8655k, this.f8656l, this.f8657m, this.f8658n);
                }
                return new b(this.f8645a, this.f8646b, this.f8647c, this.f8648d, this.f8650f, this.f8651g, this.f8652h, this.f8653i, this.f8654j, this.f8655k, this.f8656l, this.f8657m, this.f8658n);
            } catch (IllegalArgumentException e8) {
                throw new IllegalStateException(e8.getMessage(), e8);
            }
        }

        public a b(String str) {
            this.f8653i = str;
            return this;
        }

        public a c(h hVar) {
            this.f8650f = hVar;
            return this;
        }

        public a(R1.a aVar, ECPublicKey eCPublicKey) {
            this(aVar, b.p(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineX()), b.p(eCPublicKey.getParams().getCurve().getField().getFieldSize(), eCPublicKey.getW().getAffineY()));
        }
    }

    public b(R1.a aVar, Z1.c cVar, Z1.c cVar2, Z1.c cVar3, h hVar, Set set, K1.a aVar2, String str, URI uri, Z1.c cVar4, Z1.c cVar5, List list, KeyStore keyStore) {
        super(g.f8684c, hVar, set, aVar2, str, uri, cVar4, cVar5, list, keyStore);
        if (aVar != null) {
            this.f8640l = aVar;
            if (cVar != null) {
                this.f8641m = cVar;
                if (cVar2 != null) {
                    this.f8642n = cVar2;
                    r(aVar, cVar, cVar2);
                    q(f());
                    if (cVar3 != null) {
                        this.f8643o = cVar3;
                        this.f8644p = null;
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

    public b(R1.a aVar, Z1.c cVar, Z1.c cVar2, PrivateKey privateKey, h hVar, Set set, K1.a aVar2, String str, URI uri, Z1.c cVar3, Z1.c cVar4, List list, KeyStore keyStore) {
        super(g.f8684c, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            this.f8640l = aVar;
            if (cVar != null) {
                this.f8641m = cVar;
                if (cVar2 != null) {
                    this.f8642n = cVar2;
                    r(aVar, cVar, cVar2);
                    q(f());
                    this.f8643o = null;
                    this.f8644p = privateKey;
                    return;
                }
                throw new IllegalArgumentException("The 'y' coordinate must not be null");
            }
            throw new IllegalArgumentException("The 'x' coordinate must not be null");
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
