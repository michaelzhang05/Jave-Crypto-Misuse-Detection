package R1;

import j$.util.Objects;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class k extends d {

    /* renamed from: l, reason: collision with root package name */
    private final Z1.c f8700l;

    public k(Z1.c cVar, h hVar, Set set, K1.a aVar, String str, URI uri, Z1.c cVar2, Z1.c cVar3, List list, KeyStore keyStore) {
        super(g.f8686e, hVar, set, aVar, str, uri, cVar2, cVar3, list, keyStore);
        if (cVar != null) {
            this.f8700l = cVar;
            return;
        }
        throw new IllegalArgumentException("The key value must not be null");
    }

    public static k p(Map map) {
        g gVar = g.f8686e;
        if (gVar.equals(e.d(map))) {
            try {
                return new k(Z1.k.a(map, "k"), e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e8) {
                throw new ParseException(e8.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // R1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f8700l, ((k) obj).f8700l);
    }

    @Override // R1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f8700l);
    }

    @Override // R1.d
    public boolean l() {
        return true;
    }

    @Override // R1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("k", this.f8700l.toString());
        return n8;
    }
}
