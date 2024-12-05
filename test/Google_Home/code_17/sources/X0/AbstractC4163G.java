package x0;

import java.util.Comparator;
import w0.InterfaceC4120c;

/* renamed from: x0.G, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4163G implements Comparator {
    public static AbstractC4163G a(Comparator comparator) {
        if (comparator instanceof AbstractC4163G) {
            return (AbstractC4163G) comparator;
        }
        return new C4176k(comparator);
    }

    public static AbstractC4163G c() {
        return C4160D.f40565a;
    }

    public AbstractC4180o b(Iterable iterable) {
        return AbstractC4180o.A(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC4163G d() {
        return e(z.b());
    }

    public AbstractC4163G e(InterfaceC4120c interfaceC4120c) {
        return new C4171f(interfaceC4120c, this);
    }
}
