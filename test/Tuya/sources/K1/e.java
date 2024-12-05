package K1;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class e implements Serializable {

    /* renamed from: g, reason: collision with root package name */
    private static final Map f5739g = DesugarCollections.unmodifiableMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final a f5740a;

    /* renamed from: b, reason: collision with root package name */
    private final h f5741b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5742c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f5743d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f5744e;

    /* renamed from: f, reason: collision with root package name */
    private final Z1.c f5745f;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(a aVar, h hVar, String str, Set set, Map map, Z1.c cVar) {
        if (aVar != null) {
            this.f5740a = aVar;
            this.f5741b = hVar;
            this.f5742c = str;
            if (set != null) {
                this.f5743d = DesugarCollections.unmodifiableSet(new HashSet(set));
            } else {
                this.f5743d = null;
            }
            if (map != null) {
                this.f5744e = DesugarCollections.unmodifiableMap(new HashMap(map));
            } else {
                this.f5744e = f5739g;
            }
            this.f5745f = cVar;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    public static a g(Map map) {
        String h8 = Z1.k.h(map, "alg");
        if (h8 != null) {
            a aVar = a.f5717c;
            if (h8.equals(aVar.a())) {
                return aVar;
            }
            if (map.containsKey("enc")) {
                return i.c(h8);
            }
            return p.c(h8);
        }
        throw new ParseException("Missing \"alg\" in header JSON object", 0);
    }

    public a a() {
        return this.f5740a;
    }

    public String b() {
        return this.f5742c;
    }

    public Set c() {
        return this.f5743d;
    }

    public Object d(String str) {
        return this.f5744e.get(str);
    }

    public Map e() {
        return this.f5744e;
    }

    public h f() {
        return this.f5741b;
    }

    public Z1.c h() {
        Z1.c cVar = this.f5745f;
        if (cVar == null) {
            return Z1.c.d(toString());
        }
        return cVar;
    }

    public Map j() {
        Map l8 = Z1.k.l();
        l8.putAll(this.f5744e);
        l8.put("alg", this.f5740a.toString());
        h hVar = this.f5741b;
        if (hVar != null) {
            l8.put("typ", hVar.toString());
        }
        String str = this.f5742c;
        if (str != null) {
            l8.put("cty", str);
        }
        Set set = this.f5743d;
        if (set != null && !set.isEmpty()) {
            l8.put("crit", new ArrayList(this.f5743d));
        }
        return l8;
    }

    public String toString() {
        return Z1.k.o(j());
    }
}
