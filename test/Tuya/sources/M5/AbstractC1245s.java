package M5;

import java.util.Iterator;

/* renamed from: M5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1245s implements Iterator, Y5.a {
    public abstract char b();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(b());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
