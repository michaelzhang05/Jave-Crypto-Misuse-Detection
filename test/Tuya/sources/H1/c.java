package h1;

import B0.C1062c;
import B0.InterfaceC1064e;
import B0.r;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public class c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f31351a;

    /* renamed from: b, reason: collision with root package name */
    private final d f31352b;

    c(Set set, d dVar) {
        this.f31351a = e(set);
        this.f31352b = dVar;
    }

    public static C1062c c() {
        return C1062c.e(i.class).b(r.n(f.class)).f(new B0.h() { // from class: h1.b
            @Override // B0.h
            public final Object a(InterfaceC1064e interfaceC1064e) {
                i d8;
                d8 = c.d(interfaceC1064e);
                return d8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(InterfaceC1064e interfaceC1064e) {
        return new c(interfaceC1064e.g(f.class), d.a());
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

    @Override // h1.i
    public String a() {
        if (this.f31352b.b().isEmpty()) {
            return this.f31351a;
        }
        return this.f31351a + ' ' + e(this.f31352b.b());
    }
}
