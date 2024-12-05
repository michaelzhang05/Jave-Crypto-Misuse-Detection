package U1;

import c2.n;
import java.net.URI;
import java.text.ParseException;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static N1.a a(Map map) {
        return N1.a.b(c2.k.h(map, "alg"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(Map map) {
        return c2.k.h(map, "kid");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Set c(Map map) {
        return f.b(c2.k.j(map, "key_ops"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g d(Map map) {
        try {
            return g.b(c2.k.h(map, "kty"));
        } catch (IllegalArgumentException e8) {
            throw new ParseException(e8.getMessage(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h e(Map map) {
        return h.b(c2.k.h(map, "use"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List f(Map map) {
        List b8 = n.b(c2.k.e(map, "x5c"));
        if (b8 != null && b8.isEmpty()) {
            return null;
        }
        return b8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.c g(Map map) {
        return c2.k.a(map, "x5t#S256");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c2.c h(Map map) {
        return c2.k.a(map, "x5t");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static URI i(Map map) {
        return c2.k.k(map, "x5u");
    }
}
