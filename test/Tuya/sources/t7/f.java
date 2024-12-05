package t7;

import R6.C1347n;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static Map f38287a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static Map f38288b = new HashMap();

    static {
        Map map = f38287a;
        C1347n c1347n = U6.a.f11784c;
        map.put("SHA-256", c1347n);
        Map map2 = f38287a;
        C1347n c1347n2 = U6.a.f11788e;
        map2.put("SHA-512", c1347n2);
        Map map3 = f38287a;
        C1347n c1347n3 = U6.a.f11804m;
        map3.put("SHAKE128", c1347n3);
        Map map4 = f38287a;
        C1347n c1347n4 = U6.a.f11806n;
        map4.put("SHAKE256", c1347n4);
        f38288b.put(c1347n, "SHA-256");
        f38288b.put(c1347n2, "SHA-512");
        f38288b.put(c1347n3, "SHAKE128");
        f38288b.put(c1347n4, "SHAKE256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Y6.e a(C1347n c1347n) {
        if (c1347n.r(U6.a.f11784c)) {
            return new Z6.g();
        }
        if (c1347n.r(U6.a.f11788e)) {
            return new Z6.j();
        }
        if (c1347n.r(U6.a.f11804m)) {
            return new Z6.k(128);
        }
        if (c1347n.r(U6.a.f11806n)) {
            return new Z6.k(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1347n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(C1347n c1347n) {
        String str = (String) f38288b.get(c1347n);
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("unrecognized digest oid: " + c1347n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C1347n c(String str) {
        C1347n c1347n = (C1347n) f38287a.get(str);
        if (c1347n != null) {
            return c1347n;
        }
        throw new IllegalArgumentException("unrecognized digest name: " + str);
    }
}
