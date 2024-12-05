package T1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a extends ArrayList implements List, c, f {
    public static String d(List list, g gVar) {
        StringBuilder sb = new StringBuilder();
        try {
            m(list, sb, gVar);
        } catch (IOException unused) {
        }
        return sb.toString();
    }

    public static void m(Iterable iterable, Appendable appendable, g gVar) {
        if (iterable == null) {
            appendable.append("null");
        } else {
            W1.d.f11975g.a(iterable, appendable, gVar);
        }
    }

    @Override // T1.f
    public void a(Appendable appendable, g gVar) {
        m(this, appendable, gVar);
    }

    @Override // T1.e
    public void g(Appendable appendable) {
        m(this, appendable, i.f9702a);
    }

    @Override // T1.b
    public String h() {
        return d(this, i.f9702a);
    }

    @Override // T1.c
    public String l(g gVar) {
        return d(this, gVar);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return h();
    }
}
