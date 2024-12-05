package W1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends ArrayList implements List, c, f {
    public static String d(List list, g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            k(list, sb, gVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void k(Iterable iterable, Appendable appendable, g gVar) {
        if (iterable == null) {
            appendable.append("null");
        } else {
            Z1.d.f13613g.a(iterable, appendable, gVar);
        }
    }

    @Override // W1.e
    public void c(Appendable appendable) {
        k(this, appendable, i.f11359a);
    }

    @Override // W1.c
    public String e(g gVar) {
        return d(this, gVar);
    }

    @Override // W1.f
    public void f(Appendable appendable, g gVar) {
        k(this, appendable, gVar);
    }

    @Override // W1.b
    public String j() {
        return d(this, i.f11359a);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return j();
    }
}
