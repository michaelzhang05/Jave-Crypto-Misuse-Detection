package s4;

import g6.n;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: s4.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3758j {
    public static final boolean a(String str) {
        AbstractC3159y.i(str, "<this>");
        R5.a c8 = EnumC3752d.c();
        if ((c8 instanceof Collection) && c8.isEmpty()) {
            return false;
        }
        Iterator<E> it = c8.iterator();
        while (it.hasNext()) {
            List d8 = ((EnumC3752d) it.next()).d();
            if (!(d8 instanceof Collection) || !d8.isEmpty()) {
                Iterator it2 = d8.iterator();
                while (it2.hasNext()) {
                    if (n.q(str, (String) it2.next(), true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
