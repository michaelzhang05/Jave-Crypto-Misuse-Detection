package x0;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: x0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
abstract class AbstractC4169d implements InterfaceC4157A {
    @Override // x0.InterfaceC4157A
    public abstract Map a();

    public boolean b(Object obj) {
        Iterator it = a().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        return AbstractC4158B.a(this, obj);
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }
}
