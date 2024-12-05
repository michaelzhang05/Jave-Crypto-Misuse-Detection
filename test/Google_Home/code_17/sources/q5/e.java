package Q5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private final d f9469a;

    public e(d backing) {
        AbstractC3255y.i(backing, "backing");
        this.f9469a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9469a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        return this.f9469a.q(elements);
    }

    @Override // Q5.a
    public boolean containsEntry(Map.Entry element) {
        AbstractC3255y.i(element, "element");
        return this.f9469a.r(element);
    }

    @Override // P5.AbstractC1367h
    public int getSize() {
        return this.f9469a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9469a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f9469a.v();
    }

    @Override // Q5.a
    public boolean remove(Map.Entry element) {
        AbstractC3255y.i(element, "element");
        return this.f9469a.N(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9469a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9469a.n();
        return super.retainAll(elements);
    }

    @Override // P5.AbstractC1367h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry element) {
        AbstractC3255y.i(element, "element");
        throw new UnsupportedOperationException();
    }
}
