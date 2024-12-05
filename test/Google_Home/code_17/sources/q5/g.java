package Q5;

import P5.AbstractC1364e;
import b6.InterfaceC1986b;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class g extends AbstractC1364e implements Collection, InterfaceC1986b {

    /* renamed from: a, reason: collision with root package name */
    private final d f9471a;

    public g(d backing) {
        AbstractC3255y.i(backing, "backing");
        this.f9471a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f9471a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f9471a.containsValue(obj);
    }

    @Override // P5.AbstractC1364e
    public int getSize() {
        return this.f9471a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f9471a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f9471a.T();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f9471a.R(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9471a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9471a.n();
        return super.retainAll(elements);
    }
}
