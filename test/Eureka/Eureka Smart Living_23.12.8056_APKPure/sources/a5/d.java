package a5;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements Collection {

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f70a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f71b;

    public d(Object[] objArr, boolean z5) {
        f5.h.e(objArr, "values");
        this.f70a = objArr;
        this.f71b = z5;
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
        return j.f(this.f70a, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        f5.h.e(collection, "elements");
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

    public int h() {
        return this.f70a.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f70a.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return f5.b.a(this.f70a);
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
        return h();
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return m.a(this.f70a, this.f71b);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        f5.h.e(objArr, "array");
        return f5.e.b(this, objArr);
    }
}
