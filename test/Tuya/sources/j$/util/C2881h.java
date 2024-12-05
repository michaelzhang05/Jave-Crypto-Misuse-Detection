package j$.util;

import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2881h implements java.util.Collection, Serializable, Collection {
    private static final long serialVersionUID = 3053995032091335093L;

    /* renamed from: a, reason: collision with root package name */
    final java.util.Collection f32219a;

    /* renamed from: b, reason: collision with root package name */
    final Object f32220b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2881h(java.util.Collection collection) {
        this.f32219a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f32220b = this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2881h(java.util.Collection collection, Object obj) {
        this.f32219a = (java.util.Collection) Objects.requireNonNull(collection);
        this.f32220b = Objects.requireNonNull(obj);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.f32220b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        boolean add;
        synchronized (this.f32220b) {
            add = this.f32219a.add(obj);
        }
        return add;
    }

    @Override // java.util.Collection
    public final boolean addAll(java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f32220b) {
            addAll = this.f32219a.addAll(collection);
        }
        return addAll;
    }

    @Override // java.util.Collection
    public final void clear() {
        synchronized (this.f32220b) {
            this.f32219a.clear();
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        boolean contains;
        synchronized (this.f32220b) {
            contains = this.f32219a.contains(obj);
        }
        return contains;
    }

    @Override // java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        boolean containsAll;
        synchronized (this.f32220b) {
            containsAll = this.f32219a.containsAll(collection);
        }
        return containsAll;
    }

    @Override // java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        synchronized (this.f32220b) {
            Collection.EL.a(this.f32219a, consumer);
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f32220b) {
            isEmpty = this.f32219a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f32219a.iterator();
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return Collection.EL.b(this.f32219a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(Collection.EL.b(this.f32219a));
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        boolean remove;
        synchronized (this.f32220b) {
            remove = this.f32219a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Collection
    public final boolean removeAll(java.util.Collection collection) {
        boolean removeAll;
        synchronized (this.f32220b) {
            removeAll = this.f32219a.removeAll(collection);
        }
        return removeAll;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final boolean removeIf(Predicate predicate) {
        boolean removeIf;
        synchronized (this.f32220b) {
            java.util.Collection collection = this.f32219a;
            removeIf = collection instanceof Collection ? ((Collection) collection).removeIf(predicate) : Collection.CC.$default$removeIf(collection, predicate);
        }
        return removeIf;
    }

    @Override // java.util.Collection
    public final boolean retainAll(java.util.Collection collection) {
        boolean retainAll;
        synchronized (this.f32220b) {
            retainAll = this.f32219a.retainAll(collection);
        }
        return retainAll;
    }

    @Override // java.util.Collection
    public final int size() {
        int size;
        synchronized (this.f32220b) {
            size = this.f32219a.size();
        }
        return size;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    public final Spliterator spliterator() {
        return Collection.EL.c(this.f32219a);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(Collection.EL.c(this.f32219a));
    }

    @Override // java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return Collection.EL.stream(this.f32219a);
    }

    @Override // java.util.Collection
    public final java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(Collection.EL.stream(this.f32219a));
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] array;
        synchronized (this.f32220b) {
            array = this.f32219a.toArray();
        }
        return array;
    }

    @Override // java.util.Collection, j$.util.Collection
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return Collection.CC.$default$toArray(this, intFunction);
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array;
        synchronized (this.f32220b) {
            array = this.f32219a.toArray(objArr);
        }
        return array;
    }

    public final String toString() {
        String obj;
        synchronized (this.f32220b) {
            obj = this.f32219a.toString();
        }
        return obj;
    }
}
