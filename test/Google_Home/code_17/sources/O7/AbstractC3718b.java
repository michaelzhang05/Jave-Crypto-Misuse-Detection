package o7;

import U6.C1456n;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o7.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3718b {

    /* renamed from: a, reason: collision with root package name */
    private static Map f36821a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map f36822b = new HashMap();

    static {
        Map map = f36821a;
        C1456n c1456n = X6.a.f13454c;
        map.put("SHA-256", c1456n);
        Map map2 = f36821a;
        C1456n c1456n2 = X6.a.f13458e;
        map2.put("SHA-512", c1456n2);
        Map map3 = f36821a;
        C1456n c1456n3 = X6.a.f13474m;
        map3.put("SHAKE128", c1456n3);
        Map map4 = f36821a;
        C1456n c1456n4 = X6.a.f13476n;
        map4.put("SHAKE256", c1456n4);
        f36822b.put(c1456n, "SHA-256");
        f36822b.put(c1456n2, "SHA-512");
        f36822b.put(c1456n3, "SHAKE128");
        f36822b.put(c1456n4, "SHAKE256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b7.e a(C1456n c1456n) {
        if (c1456n.o(X6.a.f13454c)) {
            return new c7.g();
        }
        if (c1456n.o(X6.a.f13458e)) {
            return new c7.j();
        }
        if (c1456n.o(X6.a.f13474m)) {
            return new c7.k(128);
        }
        if (c1456n.o(X6.a.f13476n)) {
            return new c7.k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1456n);
    }
}
