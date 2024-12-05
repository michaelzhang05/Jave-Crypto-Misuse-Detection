package U1;

import j$.util.DesugarCollections;
import j$.util.Objects;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public class j extends d {

    /* renamed from: q, reason: collision with root package name */
    public static final Set f10320q = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(a.f10258i, a.f10259j, a.f10260k, a.f10261l)));

    /* renamed from: l, reason: collision with root package name */
    private final a f10321l;

    /* renamed from: m, reason: collision with root package name */
    private final c2.c f10322m;

    /* renamed from: n, reason: collision with root package name */
    private final byte[] f10323n;

    /* renamed from: o, reason: collision with root package name */
    private final c2.c f10324o;

    /* renamed from: p, reason: collision with root package name */
    private final byte[] f10325p;

    public j(a aVar, c2.c cVar, h hVar, Set set, N1.a aVar2, String str, URI uri, c2.c cVar2, c2.c cVar3, List list, KeyStore keyStore) {
        super(g.f10313f, hVar, set, aVar2, str, uri, cVar2, cVar3, list, keyStore);
        if (aVar != null) {
            if (f10320q.contains(aVar)) {
                this.f10321l = aVar;
                if (cVar != null) {
                    this.f10322m = cVar;
                    this.f10323n = cVar.a();
                    this.f10324o = null;
                    this.f10325p = null;
                    return;
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }

    public static j q(Map map) {
        g gVar = g.f10313f;
        if (gVar.equals(e.d(map))) {
            try {
                a e8 = a.e(c2.k.h(map, "crv"));
                c2.c a8 = c2.k.a(map, "x");
                c2.c a9 = c2.k.a(map, "d");
                try {
                    if (a9 == null) {
                        return new j(e8, a8, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                    }
                    return new j(e8, a8, a9, e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
                } catch (IllegalArgumentException e9) {
                    throw new ParseException(e9.getMessage(), 0);
                }
            } catch (IllegalArgumentException e10) {
                throw new ParseException(e10.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // U1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j) || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        if (Objects.equals(this.f10321l, jVar.f10321l) && Objects.equals(this.f10322m, jVar.f10322m) && Arrays.equals(this.f10323n, jVar.f10323n) && Objects.equals(this.f10324o, jVar.f10324o) && Arrays.equals(this.f10325p, jVar.f10325p)) {
            return true;
        }
        return false;
    }

    @Override // U1.d
    public int hashCode() {
        return (((Objects.hash(Integer.valueOf(super.hashCode()), this.f10321l, this.f10322m, this.f10324o) * 31) + Arrays.hashCode(this.f10323n)) * 31) + Arrays.hashCode(this.f10325p);
    }

    @Override // U1.d
    public boolean k() {
        if (this.f10324o != null) {
            return true;
        }
        return false;
    }

    @Override // U1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("crv", this.f10321l.toString());
        n8.put("x", this.f10322m.toString());
        c2.c cVar = this.f10324o;
        if (cVar != null) {
            n8.put("d", cVar.toString());
        }
        return n8;
    }

    public j(a aVar, c2.c cVar, c2.c cVar2, h hVar, Set set, N1.a aVar2, String str, URI uri, c2.c cVar3, c2.c cVar4, List list, KeyStore keyStore) {
        super(g.f10313f, hVar, set, aVar2, str, uri, cVar3, cVar4, list, keyStore);
        if (aVar != null) {
            if (f10320q.contains(aVar)) {
                this.f10321l = aVar;
                if (cVar != null) {
                    this.f10322m = cVar;
                    this.f10323n = cVar.a();
                    if (cVar2 != null) {
                        this.f10324o = cVar2;
                        this.f10325p = cVar2.a();
                        return;
                    }
                    throw new IllegalArgumentException("The 'd' parameter must not be null");
                }
                throw new IllegalArgumentException("The 'x' parameter must not be null");
            }
            throw new IllegalArgumentException("Unknown / unsupported curve: " + aVar);
        }
        throw new IllegalArgumentException("The curve must not be null");
    }
}
