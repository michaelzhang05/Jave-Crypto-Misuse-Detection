package io.sentry;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: SynchronizedCollection.java */
/* loaded from: classes2.dex */
class l5<E> implements Collection<E>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    private final Collection<E> f19018f;

    /* renamed from: g, reason: collision with root package name */
    final Object f19019g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l5(Collection<E> collection) {
        if (collection != null) {
            this.f19018f = collection;
            this.f19019g = this;
            return;
        }
        throw new NullPointerException("Collection must not be null.");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Collection<E> a() {
        return this.f19018f;
    }

    @Override // java.util.Collection
    public boolean add(E e2) {
        boolean add;
        synchronized (this.f19019g) {
            add = a().add(e2);
        }
        return add;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        boolean addAll;
        synchronized (this.f19019g) {
            addAll = a().addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public void clear() {
        synchronized (this.f19019g) {
            a().clear();
        }
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f19019g) {
            contains = a().contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        boolean containsAll;
        synchronized (this.f19019g) {
            containsAll = a().containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f19019g) {
            isEmpty = a().isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return a().iterator();
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f19019g) {
            remove = a().remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        boolean removeAll;
        synchronized (this.f19019g) {
            removeAll = a().removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        boolean retainAll;
        synchronized (this.f19019g) {
            retainAll = a().retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public int size() {
        int size;
        synchronized (this.f19019g) {
            size = a().size();
        }
        return size;
    }

    public String toString() {
        String obj;
        synchronized (this.f19019g) {
            obj = a().toString();
        }
        return obj;
    }
}
