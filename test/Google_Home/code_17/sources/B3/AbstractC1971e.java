package b3;

import O5.p;
import b3.InterfaceC1973g;
import com.stripe.android.model.j;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: b3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1971e {
    public static final InterfaceC1973g a(j jVar) {
        j.c.a.InterfaceC0504c interfaceC0504c;
        j.c.C0508c b8;
        j.c.a b9;
        AbstractC3255y.i(jVar, "<this>");
        j.c a8 = jVar.a();
        if (a8 != null && (b8 = a8.b()) != null && (b9 = b8.b()) != null) {
            interfaceC0504c = b9.a();
        } else {
            interfaceC0504c = null;
        }
        if (interfaceC0504c instanceof j.c.a.InterfaceC0504c.b) {
            j.c.a.InterfaceC0504c.b bVar = (j.c.a.InterfaceC0504c.b) interfaceC0504c;
            if (bVar.g()) {
                return InterfaceC1973g.b.f15341a;
            }
            return new InterfaceC1973g.a(bVar.a());
        }
        if ((interfaceC0504c instanceof j.c.a.InterfaceC0504c.C0505a) || interfaceC0504c == null) {
            return InterfaceC1973g.c.f15342a;
        }
        throw new p();
    }
}
