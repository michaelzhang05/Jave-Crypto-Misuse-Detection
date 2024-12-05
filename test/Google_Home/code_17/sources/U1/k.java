package U1;

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
    private final c2.c f10326l;

    public k(c2.c cVar, h hVar, Set set, N1.a aVar, String str, URI uri, c2.c cVar2, c2.c cVar3, List list, KeyStore keyStore) {
        super(g.f10312e, hVar, set, aVar, str, uri, cVar2, cVar3, list, keyStore);
        if (cVar != null) {
            this.f10326l = cVar;
            return;
        }
        throw new IllegalArgumentException("The key value must not be null");
    }

    public static k q(Map map) {
        g gVar = g.f10312e;
        if (gVar.equals(e.d(map))) {
            try {
                return new k(c2.k.a(map, "k"), e.e(map), e.c(map), e.a(map), e.b(map), e.i(map), e.h(map), e.g(map), e.f(map), null);
            } catch (IllegalArgumentException e8) {
                throw new ParseException(e8.getMessage(), 0);
            }
        }
        throw new ParseException("The key type kty must be " + gVar.a(), 0);
    }

    @Override // U1.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k) || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f10326l, ((k) obj).f10326l);
    }

    @Override // U1.d
    public int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), this.f10326l);
    }

    @Override // U1.d
    public boolean k() {
        return true;
    }

    @Override // U1.d
    public Map n() {
        Map n8 = super.n();
        n8.put("k", this.f10326l.toString());
        return n8;
    }
}
