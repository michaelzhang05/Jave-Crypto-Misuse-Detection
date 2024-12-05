package R1;

import Z1.n;
import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static K1.a a(Map map) {
        return K1.a.b(Z1.k.h(map, "alg"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Map map) {
        return Z1.k.h(map, "kid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set c(Map map) {
        return f.b(Z1.k.j(map, "key_ops"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g d(Map map) {
        try {
            return g.b(Z1.k.h(map, "kty"));
        } catch (IllegalArgumentException e8) {
            throw new ParseException(e8.getMessage(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h e(Map map) {
        return h.b(Z1.k.h(map, "use"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List f(Map map) {
        List b8 = n.b(Z1.k.e(map, "x5c"));
        if (b8 != null && b8.isEmpty()) {
            return null;
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z1.c g(Map map) {
        return Z1.k.a(map, "x5t#S256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z1.c h(Map map) {
        return Z1.k.a(map, "x5t");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static URI i(Map map) {
        return Z1.k.k(map, "x5u");
    }
}
