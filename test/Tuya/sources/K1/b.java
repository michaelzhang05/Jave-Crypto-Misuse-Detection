package K1;

import j$.util.DesugarCollections;
import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
abstract class b extends e {

    /* renamed from: h, reason: collision with root package name */
    private final URI f5720h;

    /* renamed from: i, reason: collision with root package name */
    private final R1.d f5721i;

    /* renamed from: j, reason: collision with root package name */
    private final URI f5722j;

    /* renamed from: k, reason: collision with root package name */
    private final Z1.c f5723k;

    /* renamed from: l, reason: collision with root package name */
    private final Z1.c f5724l;

    /* renamed from: m, reason: collision with root package name */
    private final List f5725m;

    /* renamed from: n, reason: collision with root package name */
    private final String f5726n;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar, h hVar, String str, Set set, URI uri, R1.d dVar, URI uri2, Z1.c cVar, Z1.c cVar2, List list, String str2, Map map, Z1.c cVar3) {
        super(aVar, hVar, str, set, map, cVar3);
        this.f5720h = uri;
        this.f5721i = dVar;
        this.f5722j = uri2;
        this.f5723k = cVar;
        this.f5724l = cVar2;
        if (list != null) {
            this.f5725m = DesugarCollections.unmodifiableList(new ArrayList(list));
        } else {
            this.f5725m = null;
        }
        this.f5726n = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static R1.d r(Map map) {
        if (map == null) {
            return null;
        }
        R1.d m8 = R1.d.m(map);
        if (!m8.l()) {
            return m8;
        }
        throw new ParseException("Non-public key in jwk header parameter", 0);
    }

    @Override // K1.e
    public Map j() {
        Map j8 = super.j();
        URI uri = this.f5720h;
        if (uri != null) {
            j8.put("jku", uri.toString());
        }
        R1.d dVar = this.f5721i;
        if (dVar != null) {
            j8.put("jwk", dVar.n());
        }
        URI uri2 = this.f5722j;
        if (uri2 != null) {
            j8.put("x5u", uri2.toString());
        }
        Z1.c cVar = this.f5723k;
        if (cVar != null) {
            j8.put("x5t", cVar.toString());
        }
        Z1.c cVar2 = this.f5724l;
        if (cVar2 != null) {
            j8.put("x5t#S256", cVar2.toString());
        }
        List list = this.f5725m;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f5725m.size());
            Iterator it = this.f5725m.iterator();
            while (it.hasNext()) {
                arrayList.add(((Z1.a) it.next()).toString());
            }
            j8.put("x5c", arrayList);
        }
        String str = this.f5726n;
        if (str != null) {
            j8.put("kid", str);
        }
        return j8;
    }

    public R1.d k() {
        return this.f5721i;
    }

    public URI l() {
        return this.f5720h;
    }

    public String m() {
        return this.f5726n;
    }

    public List n() {
        return this.f5725m;
    }

    public Z1.c o() {
        return this.f5724l;
    }

    public Z1.c p() {
        return this.f5723k;
    }

    public URI q() {
        return this.f5722j;
    }
}
