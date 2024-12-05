package b3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: b3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1969c {
    public static final boolean a(InterfaceC1968b interfaceC1968b, C1970d metadata) {
        AbstractC3255y.i(interfaceC1968b, "<this>");
        AbstractC3255y.i(metadata, "metadata");
        if (!metadata.W().e().contains(interfaceC1968b.getType().f25605a)) {
            return false;
        }
        Set a8 = interfaceC1968b.a(metadata.Y());
        if (!(a8 instanceof Collection) || !a8.isEmpty()) {
            Iterator it = a8.iterator();
            while (it.hasNext()) {
                if (!((EnumC1967a) it.next()).b(metadata)) {
                    return false;
                }
            }
        }
        return true;
    }
}
