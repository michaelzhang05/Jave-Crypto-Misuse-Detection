package N1;

import c2.C2012a;
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
    private final URI f7499h;

    /* renamed from: i, reason: collision with root package name */
    private final U1.d f7500i;

    /* renamed from: j, reason: collision with root package name */
    private final URI f7501j;

    /* renamed from: k, reason: collision with root package name */
    private final c2.c f7502k;

    /* renamed from: l, reason: collision with root package name */
    private final c2.c f7503l;

    /* renamed from: m, reason: collision with root package name */
    private final List f7504m;

    /* renamed from: n, reason: collision with root package name */
    private final String f7505n;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar, h hVar, String str, Set set, URI uri, U1.d dVar, URI uri2, c2.c cVar, c2.c cVar2, List list, String str2, Map map, c2.c cVar3) {
        super(aVar, hVar, str, set, map, cVar3);
        this.f7499h = uri;
        this.f7500i = dVar;
        this.f7501j = uri2;
        this.f7502k = cVar;
        this.f7503l = cVar2;
        if (list != null) {
            this.f7504m = DesugarCollections.unmodifiableList(new ArrayList(list));
        } else {
            this.f7504m = null;
        }
        this.f7505n = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static U1.d s(Map map) {
        if (map == null) {
            return null;
        }
        U1.d m8 = U1.d.m(map);
        if (!m8.k()) {
            return m8;
        }
        throw new ParseException("Non-public key in jwk header parameter", 0);
    }

    @Override // N1.e
    public Map i() {
        Map i8 = super.i();
        URI uri = this.f7499h;
        if (uri != null) {
            i8.put("jku", uri.toString());
        }
        U1.d dVar = this.f7500i;
        if (dVar != null) {
            i8.put("jwk", dVar.n());
        }
        URI uri2 = this.f7501j;
        if (uri2 != null) {
            i8.put("x5u", uri2.toString());
        }
        c2.c cVar = this.f7502k;
        if (cVar != null) {
            i8.put("x5t", cVar.toString());
        }
        c2.c cVar2 = this.f7503l;
        if (cVar2 != null) {
            i8.put("x5t#S256", cVar2.toString());
        }
        List list = this.f7504m;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f7504m.size());
            Iterator it = this.f7504m.iterator();
            while (it.hasNext()) {
                arrayList.add(((C2012a) it.next()).toString());
            }
            i8.put("x5c", arrayList);
        }
        String str = this.f7505n;
        if (str != null) {
            i8.put("kid", str);
        }
        return i8;
    }

    public U1.d j() {
        return this.f7500i;
    }

    public URI k() {
        return this.f7499h;
    }

    public String m() {
        return this.f7505n;
    }

    public List n() {
        return this.f7504m;
    }

    public c2.c o() {
        return this.f7503l;
    }

    public c2.c q() {
        return this.f7502k;
    }

    public URI r() {
        return this.f7501j;
    }
}
