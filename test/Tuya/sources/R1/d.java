package R1;

import Z1.n;
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
    private final g f8663a;

    /* renamed from: b, reason: collision with root package name */
    private final h f8664b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f8665c;

    /* renamed from: d, reason: collision with root package name */
    private final K1.a f8666d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8667e;

    /* renamed from: f, reason: collision with root package name */
    private final URI f8668f;

    /* renamed from: g, reason: collision with root package name */
    private final Z1.c f8669g;

    /* renamed from: h, reason: collision with root package name */
    private final Z1.c f8670h;

    /* renamed from: i, reason: collision with root package name */
    private final List f8671i;

    /* renamed from: j, reason: collision with root package name */
    private final List f8672j;

    /* renamed from: k, reason: collision with root package name */
    private final KeyStore f8673k;

    /* JADX INFO: Access modifiers changed from: protected */
    public d(g gVar, h hVar, Set set, K1.a aVar, String str, URI uri, Z1.c cVar, Z1.c cVar2, List list, KeyStore keyStore) {
        if (gVar != null) {
            this.f8663a = gVar;
            if (i.a(hVar, set)) {
                this.f8664b = hVar;
                this.f8665c = set;
                this.f8666d = aVar;
                this.f8667e = str;
                this.f8668f = uri;
                this.f8669g = cVar;
                this.f8670h = cVar2;
                if (list != null && list.isEmpty()) {
                    throw new IllegalArgumentException("The X.509 certificate chain \"x5c\" must not be empty");
                }
                this.f8671i = list;
                try {
                    this.f8672j = n.a(list);
                    this.f8673k = keyStore;
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
        String h8 = Z1.k.h(map, "kty");
        if (h8 != null) {
            g b8 = g.b(h8);
            if (b8 == g.f8684c) {
                return b.y(map);
            }
            if (b8 == g.f8685d) {
                return l.q(map);
            }
            if (b8 == g.f8686e) {
                return k.p(map);
            }
            if (b8 == g.f8687f) {
                return j.p(map);
            }
            throw new ParseException("Unsupported key type \"kty\" parameter: " + b8, 0);
        }
        throw new ParseException("Missing key type \"kty\" parameter", 0);
    }

    public K1.a a() {
        return this.f8666d;
    }

    public String b() {
        return this.f8667e;
    }

    public Set c() {
        return this.f8665c;
    }

    public KeyStore d() {
        return this.f8673k;
    }

    public h e() {
        return this.f8664b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (Objects.equals(this.f8663a, dVar.f8663a) && Objects.equals(this.f8664b, dVar.f8664b) && Objects.equals(this.f8665c, dVar.f8665c) && Objects.equals(this.f8666d, dVar.f8666d) && Objects.equals(this.f8667e, dVar.f8667e) && Objects.equals(this.f8668f, dVar.f8668f) && Objects.equals(this.f8669g, dVar.f8669g) && Objects.equals(this.f8670h, dVar.f8670h) && Objects.equals(this.f8671i, dVar.f8671i) && Objects.equals(this.f8673k, dVar.f8673k)) {
            return true;
        }
        return false;
    }

    public List f() {
        List list = this.f8672j;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public List g() {
        List list = this.f8671i;
        if (list == null) {
            return null;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public Z1.c h() {
        return this.f8670h;
    }

    public int hashCode() {
        return Objects.hash(this.f8663a, this.f8664b, this.f8665c, this.f8666d, this.f8667e, this.f8668f, this.f8669g, this.f8670h, this.f8671i, this.f8673k);
    }

    public Z1.c j() {
        return this.f8669g;
    }

    public URI k() {
        return this.f8668f;
    }

    public abstract boolean l();

    public Map n() {
        Map l8 = Z1.k.l();
        l8.put("kty", this.f8663a.a());
        h hVar = this.f8664b;
        if (hVar != null) {
            l8.put("use", hVar.a());
        }
        if (this.f8665c != null) {
            List a8 = Z1.j.a();
            Iterator it = this.f8665c.iterator();
            while (it.hasNext()) {
                a8.add(((f) it.next()).a());
            }
            l8.put("key_ops", a8);
        }
        K1.a aVar = this.f8666d;
        if (aVar != null) {
            l8.put("alg", aVar.a());
        }
        String str = this.f8667e;
        if (str != null) {
            l8.put("kid", str);
        }
        URI uri = this.f8668f;
        if (uri != null) {
            l8.put("x5u", uri.toString());
        }
        Z1.c cVar = this.f8669g;
        if (cVar != null) {
            l8.put("x5t", cVar.toString());
        }
        Z1.c cVar2 = this.f8670h;
        if (cVar2 != null) {
            l8.put("x5t#S256", cVar2.toString());
        }
        if (this.f8671i != null) {
            List a9 = Z1.j.a();
            Iterator it2 = this.f8671i.iterator();
            while (it2.hasNext()) {
                a9.add(((Z1.a) it2.next()).toString());
            }
            l8.put("x5c", a9);
        }
        return l8;
    }

    public String o() {
        return Z1.k.o(n());
    }

    public String toString() {
        return Z1.k.o(n());
    }
}
