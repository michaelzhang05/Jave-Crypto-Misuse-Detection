package M5;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3141f;
import kotlin.jvm.internal.AbstractC3150o;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: M5.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1237j implements Collection, Y5.a {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f7059a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f7060b;

    public C1237j(Object[] values, boolean z8) {
        AbstractC3159y.i(values, "values");
        this.f7059a = values;
        this.f7060b = z8;
    }

    public int a() {
        return this.f7059a.length;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return AbstractC1239l.W(this.f7059a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        AbstractC3159y.i(elements, "elements");
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
        if (this.f7059a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC3141f.a(this.f7059a);
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
        return a();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        AbstractC3159y.i(array, "array");
        return AbstractC3150o.b(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return AbstractC1247u.b(this.f7059a, this.f7060b);
    }
}
