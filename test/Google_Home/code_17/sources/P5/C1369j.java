package P5;

import b6.InterfaceC1985a;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3237f;
import kotlin.jvm.internal.AbstractC3246o;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: P5.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1369j implements Collection, InterfaceC1985a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f8883a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f8884b;

    public C1369j(Object[] values, boolean z8) {
        AbstractC3255y.i(values, "values");
        this.f8883a = values;
        this.f8884b = z8;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return this.f8883a.length;
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1371l.W(this.f8883a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3255y.i(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        if (this.f8883a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC3237f.a(this.f8883a);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3255y.i(array, "array");
        return AbstractC3246o.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1379u.b(this.f8883a, this.f8884b);
    }
}
