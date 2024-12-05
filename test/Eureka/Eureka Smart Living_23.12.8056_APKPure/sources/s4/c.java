package s4;

import java.util.Iterator;
import java.util.Set;
import z3.r;

/* loaded from: classes.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f9252a;

    /* renamed from: b, reason: collision with root package name */
    private final d f9253b;

    c(Set set, d dVar) {
        this.f9252a = e(set);
        this.f9253b = dVar;
    }

    public static z3.c c() {
        return z3.c.c(i.class).b(r.l(f.class)).e(new z3.h() { // from class: s4.b
            @Override // z3.h
            public final Object a(z3.e eVar) {
                i d6;
                d6 = c.d(eVar);
                return d6;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(z3.e eVar) {
        return new c(eVar.c(f.class), d.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            sb.append(fVar.b());
            sb.append('/');
            sb.append(fVar.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // s4.i
    public String a() {
        if (this.f9253b.b().isEmpty()) {
            return this.f9252a;
        }
        return this.f9252a + ' ' + e(this.f9253b.b());
    }
}
