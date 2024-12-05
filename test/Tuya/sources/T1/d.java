package T1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public class d extends HashMap implements c, f {
    public static String b(Map map) {
        return c(map, i.f9702a);
    }

    public static String c(Map map, g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            e(map, sb, gVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void e(Map map, Appendable appendable, g gVar) {
        if (map == null) {
            appendable.append("null");
        } else {
            W1.d.f11977i.a(map, appendable, gVar);
        }
    }

    @Override // T1.f
    public void a(Appendable appendable, g gVar) {
        e(this, appendable, gVar);
    }

    @Override // T1.e
    public void g(Appendable appendable) {
        e(this, appendable, i.f9702a);
    }

    @Override // T1.b
    public String h() {
        return c(this, i.f9702a);
    }

    @Override // T1.c
    public String l(g gVar) {
        return c(this, gVar);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return c(this, i.f9702a);
    }
}
