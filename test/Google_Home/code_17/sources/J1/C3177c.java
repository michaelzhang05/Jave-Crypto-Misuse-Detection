package j1;

import D0.C1053c;
import D0.InterfaceC1055e;
import D0.r;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C3177c implements i {

    /* renamed from: a, reason: collision with root package name */
    private final String f33897a;

    /* renamed from: b, reason: collision with root package name */
    private final C3178d f33898b;

    C3177c(Set set, C3178d c3178d) {
        this.f33897a = e(set);
        this.f33898b = c3178d;
    }

    public static C1053c c() {
        return C1053c.e(i.class).b(r.o(AbstractC3180f.class)).f(new D0.h() { // from class: j1.b
            @Override // D0.h
            public final Object a(InterfaceC1055e interfaceC1055e) {
                i d8;
                d8 = C3177c.d(interfaceC1055e);
                return d8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ i d(InterfaceC1055e interfaceC1055e) {
        return new C3177c(interfaceC1055e.e(AbstractC3180f.class), C3178d.a());
    }

    private static String e(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AbstractC3180f abstractC3180f = (AbstractC3180f) it.next();
            sb.append(abstractC3180f.b());
            sb.append('/');
            sb.append(abstractC3180f.c());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    @Override // j1.i
    public String a() {
        if (this.f33898b.b().isEmpty()) {
            return this.f33897a;
        }
        return this.f33897a + ' ' + e(this.f33898b.b());
    }
}
