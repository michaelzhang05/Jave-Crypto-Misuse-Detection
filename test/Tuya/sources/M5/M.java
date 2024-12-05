package M5;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class M implements Iterator, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterator f7017a;

    /* renamed from: b, reason: collision with root package name */
    private int f7018b;

    public M(Iterator iterator) {
        AbstractC3159y.i(iterator, "iterator");
        this.f7017a = iterator;
    }

    @Override // java.util.Iterator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final K next() {
        int i8 = this.f7018b;
        this.f7018b = i8 + 1;
        if (i8 < 0) {
            AbstractC1246t.w();
        }
        return new K(i8, this.f7017a.next());
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7017a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
