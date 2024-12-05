package Y2;

import L5.p;
import Y2.g;
import com.stripe.android.model.j;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class e {
    public static final g a(j jVar) {
        j.c.a.InterfaceC0508c interfaceC0508c;
        j.c.C0512c c8;
        j.c.a c9;
        AbstractC3159y.i(jVar, "<this>");
        j.c b8 = jVar.b();
        if (b8 != null && (c8 = b8.c()) != null && (c9 = c8.c()) != null) {
            interfaceC0508c = c9.b();
        } else {
            interfaceC0508c = null;
        }
        if (interfaceC0508c instanceof j.c.a.InterfaceC0508c.b) {
            j.c.a.InterfaceC0508c.b bVar = (j.c.a.InterfaceC0508c.b) interfaceC0508c;
            if (bVar.e()) {
                return g.b.f13056a;
            }
            return new g.a(bVar.b());
        }
        if ((interfaceC0508c instanceof j.c.a.InterfaceC0508c.C0509a) || interfaceC0508c == null) {
            return g.c.f13057a;
        }
        throw new p();
    }
}
