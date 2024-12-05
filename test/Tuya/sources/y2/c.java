package Y2;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class c {
    public static final boolean a(b bVar, d metadata) {
        AbstractC3159y.i(bVar, "<this>");
        AbstractC3159y.i(metadata, "metadata");
        if (!metadata.V().g().contains(bVar.getType().f24550a)) {
            return false;
        }
        Set a8 = bVar.a(metadata.Y());
        if (!(a8 instanceof Collection) || !a8.isEmpty()) {
            Iterator it = a8.iterator();
            while (it.hasNext()) {
                if (!((a) it.next()).b(metadata)) {
                    return false;
                }
            }
        }
        return true;
    }
}
