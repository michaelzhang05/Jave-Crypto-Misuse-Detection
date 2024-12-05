package w7;

import U6.C1456n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static Map f40414a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map f40415b = new HashMap();

    static {
        Map map = f40414a;
        C1456n c1456n = X6.a.f13454c;
        map.put("SHA-256", c1456n);
        Map map2 = f40414a;
        C1456n c1456n2 = X6.a.f13458e;
        map2.put("SHA-512", c1456n2);
        Map map3 = f40414a;
        C1456n c1456n3 = X6.a.f13474m;
        map3.put("SHAKE128", c1456n3);
        Map map4 = f40414a;
        C1456n c1456n4 = X6.a.f13476n;
        map4.put("SHAKE256", c1456n4);
        f40415b.put(c1456n, "SHA-256");
        f40415b.put(c1456n2, "SHA-512");
        f40415b.put(c1456n3, "SHAKE128");
        f40415b.put(c1456n4, "SHAKE256");
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(C1456n c1456n) {
        String str = (String) f40415b.get(c1456n);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + c1456n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1456n c(String str) {
        C1456n c1456n = (C1456n) f40414a.get(str);
        if (c1456n != null) {
            return c1456n;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
