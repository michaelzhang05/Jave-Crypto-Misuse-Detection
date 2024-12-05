package N1;

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
    private static final Map f7518g = DesugarCollections.unmodifiableMap(new HashMap());

    /* renamed from: a, reason: collision with root package name */
    private final a f7519a;

    /* renamed from: b, reason: collision with root package name */
    private final h f7520b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7521c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f7522d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f7523e;

    /* renamed from: f, reason: collision with root package name */
    private final c2.c f7524f;

    /* JADX INFO: Access modifiers changed from: protected */
    public e(a aVar, h hVar, String str, Set set, Map map, c2.c cVar) {
        if (aVar != null) {
            this.f7519a = aVar;
            this.f7520b = hVar;
            this.f7521c = str;
            if (set != null) {
                this.f7522d = DesugarCollections.unmodifiableSet(new HashSet(set));
            } else {
                this.f7522d = null;
            }
            if (map != null) {
                this.f7523e = DesugarCollections.unmodifiableMap(new HashMap(map));
            } else {
                this.f7523e = f7518g;
            }
            this.f7524f = cVar;
            return;
        }
        throw new IllegalArgumentException("The algorithm \"alg\" header parameter must not be null");
    }

    public static a g(Map map) {
        String h8 = c2.k.h(map, "alg");
        if (h8 != null) {
            a aVar = a.f7496c;
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
        return this.f7519a;
    }

    public String b() {
        return this.f7521c;
    }

    public Set c() {
        return this.f7522d;
    }

    public Object d(String str) {
        return this.f7523e.get(str);
    }

    public Map e() {
        return this.f7523e;
    }

    public h f() {
        return this.f7520b;
    }

    public c2.c h() {
        c2.c cVar = this.f7524f;
        if (cVar == null) {
            return c2.c.d(toString());
        }
        return cVar;
    }

    public Map i() {
        Map l8 = c2.k.l();
        l8.putAll(this.f7523e);
        l8.put("alg", this.f7519a.toString());
        h hVar = this.f7520b;
        if (hVar != null) {
            l8.put("typ", hVar.toString());
        }
        String str = this.f7521c;
        if (str != null) {
            l8.put("cty", str);
        }
        Set set = this.f7522d;
        if (set != null && !set.isEmpty()) {
            l8.put("crit", new ArrayList(this.f7522d));
        }
        return l8;
    }

    public String toString() {
        return c2.k.o(i());
    }
}
