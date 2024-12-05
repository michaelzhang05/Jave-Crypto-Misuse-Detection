package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class E implements Iterator, InterfaceC1985a {
    public abstract double a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
