package N5;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class e extends a {

    /* renamed from: a, reason: collision with root package name */
    private final d f7509a;

    public e(d backing) {
        AbstractC3159y.i(backing, "backing");
        this.f7509a = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f7509a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        return this.f7509a.p(elements);
    }

    @Override // N5.a
    public boolean containsEntry(Map.Entry element) {
        AbstractC3159y.i(element, "element");
        return this.f7509a.q(element);
    }

    @Override // M5.AbstractC1235h
    public int getSize() {
        return this.f7509a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f7509a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f7509a.v();
    }

    @Override // N5.a
    public boolean remove(Map.Entry element) {
        AbstractC3159y.i(element, "element");
        return this.f7509a.N(element);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        this.f7509a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
        this.f7509a.n();
        return super.retainAll(elements);
    }

    @Override // M5.AbstractC1235h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Map.Entry element) {
        AbstractC3159y.i(element, "element");
        throw new UnsupportedOperationException();
    }
}
