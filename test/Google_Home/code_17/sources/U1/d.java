package U1;

import c2.C2012a;
import c2.n;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.net.URI;
import java.security.KeyStore;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final g f10289a;

    /* renamed from: b, reason: collision with root package name */
    private final h f10290b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f10291c;

    /* renamed from: d, reason: collision with root package name */
    private final N1.a f10292d;

    /* renamed from: e, reason: collision with root package name */
    private final String f10293e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f10294f;

    /* renamed from: g, reason: collision with root package name */
    private final c2.c f10295g;

    /* renamed from: h, reason: collision with root package name */
    private final c2.c f10296h;

    /* renamed from: i, reason: collision with root package name */
    private final List f10297i;

    /* renamed from: j, reason: collision with root package name */
    private final List f10298j;

    /* renamed from: k, reason: collision with root package name */
    private final KeyStore f10299k;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(g gVar, h hVar, Set set, N1.a aVar, String str, URI uri, c2.c cVar, c2.c cVar2, List list, KeyStore keyStore) {
        if (gVar != null) {
            this.f10289a = gVar;
            if (i.a(hVar, set)) {
                this.f10290b = hVar;
                this.f10291c = set;
                this.f10292d = aVar;
                this.f10293e = str;
                this.f10294f = uri;
                this.f10295g = cVar;
                this.f10296h = cVar2;
                if (list != null && list.isEmpty()) {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
                this.f10297i = list;
                try {
                    this.f10298j = n.a(list);
                    this.f10299k = keyStore;
                    return;
                } catch (ParseException e8) {
                    throw new IllegalArgumentException("Invalid X.509 certificate chain \"x5c\": " + e8.getMessage(), e8);
                }
            }
            throw new IllegalArgumentException("The key use \"use\" and key options \"key_ops\" parameters are not consistent, see RFC 7517, section 4.3");
        }
        throw new IllegalArgumentException("The key type \"kty\" parameter must not be null");
    }

    public static d m(Map map) {
        String h8 = c2.k.h(map, "kty");
        if (h8 != null) {
            g b8 = g.b(h8);
            if (b8 == g.f10310c) {
                return b.y(map);
            }
            if (b8 == g.f10311d) {
                return l.r(map);
            }
            if (b8 == g.f10312e) {
                return k.q(map);
            }
            if (b8 == g.f10313f) {
                return j.q(map);
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + b8, 0);
        }
        throw new ParseException("Missing key type \"kty\" parameter", 0);
    }

    public N1.a a() {
        return this.f10292d;
    }

    public String b() {
        return this.f10293e;
    }

    public Set c() {
        return this.f10291c;
    }

    public KeyStore d() {
        return this.f10299k;
    }

    public h e() {
        return this.f10290b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Objects.equals(this.f10289a, dVar.f10289a) && Objects.equals(this.f10290b, dVar.f10290b) && Objects.equals(this.f10291c, dVar.f10291c) && Objects.equals(this.f10292d, dVar.f10292d) && Objects.equals(this.f10293e, dVar.f10293e) && Objects.equals(this.f10294f, dVar.f10294f) && Objects.equals(this.f10295g, dVar.f10295g) && Objects.equals(this.f10296h, dVar.f10296h) && Objects.equals(this.f10297i, dVar.f10297i) && Objects.equals(this.f10299k, dVar.f10299k)) {
            return true;
        }
        return false;
    }

    public List f() {
        List list = this.f10298j;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public List g() {
        List list = this.f10297i;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public c2.c h() {
        return this.f10296h;
    }

    public int hashCode() {
        return Objects.hash(this.f10289a, this.f10290b, this.f10291c, this.f10292d, this.f10293e, this.f10294f, this.f10295g, this.f10296h, this.f10297i, this.f10299k);
    }

    public c2.c i() {
        return this.f10295g;
    }

    public URI j() {
        return this.f10294f;
    }

    public abstract boolean k();

    public Map n() {
        Map l8 = c2.k.l();
        l8.put("kty", this.f10289a.a());
        h hVar = this.f10290b;
        if (hVar != null) {
            l8.put("use", hVar.a());
        }
        if (this.f10291c != null) {
            List a8 = c2.j.a();
            Iterator it = this.f10291c.iterator();
            while (it.hasNext()) {
                a8.add(((f) it.next()).a());
            }
            l8.put("key_ops", a8);
        }
        N1.a aVar = this.f10292d;
        if (aVar != null) {
            l8.put("alg", aVar.a());
        }
        String str = this.f10293e;
        if (str != null) {
            l8.put("kid", str);
        }
        URI uri = this.f10294f;
        if (uri != null) {
            l8.put("x5u", uri.toString());
        }
        c2.c cVar = this.f10295g;
        if (cVar != null) {
            l8.put("x5t", cVar.toString());
        }
        c2.c cVar2 = this.f10296h;
        if (cVar2 != null) {
            l8.put("x5t#S256", cVar2.toString());
        }
        if (this.f10297i != null) {
            List a9 = c2.j.a();
            Iterator it2 = this.f10297i.iterator();
            while (it2.hasNext()) {
                a9.add(((C2012a) it2.next()).toString());
            }
            l8.put("x5c", a9);
        }
        return l8;
    }

    public String o() {
        return c2.k.o(n());
    }

    public String toString() {
        return c2.k.o(n());
    }
}
