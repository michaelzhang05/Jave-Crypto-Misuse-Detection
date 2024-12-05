package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class J implements Iterator, InterfaceC1985a {
    public abstract float a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Float.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
