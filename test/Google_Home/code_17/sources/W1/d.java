package W1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class d extends HashMap implements c, f {
    public static String a(Map map) {
        return b(map, i.f11359a);
    }

    public static String b(Map map, g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            g(map, sb, gVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void g(Map map, Appendable appendable, g gVar) {
        if (map == null) {
            appendable.append("null");
        } else {
            Z1.d.f13615i.a(map, appendable, gVar);
        }
    }

    @Override // W1.e
    public void c(Appendable appendable) {
        g(this, appendable, i.f11359a);
    }

    @Override // W1.c
    public String e(g gVar) {
        return b(this, gVar);
    }

    @Override // W1.f
    public void f(Appendable appendable, g gVar) {
        g(this, appendable, gVar);
    }

    @Override // W1.b
    public String j() {
        return b(this, i.f11359a);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return b(this, i.f11359a);
    }
}
