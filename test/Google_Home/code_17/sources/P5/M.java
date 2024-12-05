package P5;

import b6.InterfaceC1985a;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class M implements Iterator, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f8841a;

    /* renamed from: b, reason: collision with root package name */
    private int f8842b;

    public M(Iterator iterator) {
        AbstractC3255y.i(iterator, "iterator");
        this.f8841a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final K next() {
        int i8 = this.f8842b;
        this.f8842b = i8 + 1;
        if (i8 < 0) {
            AbstractC1378t.w();
        }
        return new K(i8, this.f8841a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8841a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
