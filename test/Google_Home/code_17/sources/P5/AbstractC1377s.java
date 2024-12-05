package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;

/* renamed from: P5.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1377s implements Iterator, InterfaceC1985a {
    public abstract char a();

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ Object next() {
        return Character.valueOf(a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
