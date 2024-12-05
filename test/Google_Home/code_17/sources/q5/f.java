package Q5;

import P5.AbstractC1367h;
import b6.InterfaceC1989e;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class f extends AbstractC1367h implements Set, InterfaceC1989e {

    /* renamed from: a, reason: collision with root package name */
    private final d f9470a;

    public f(d backing) {
        AbstractC3255y.i(backing, "backing");
        this.f9470a = backing;
    }

    @Override // P5.AbstractC1367h, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f9470a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f9470a.containsKey(obj);
    }

    @Override // P5.AbstractC1367h
    public int getSize() {
        return this.f9470a.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f9470a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f9470a.F();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (this.f9470a.P(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9470a.n();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        this.f9470a.n();
        return super.retainAll(elements);
    }
}
