package M5;

import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class E implements Iterator, Y5.a {
    public abstract double b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Double.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
