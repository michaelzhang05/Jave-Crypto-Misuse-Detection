package J0;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class C implements List, RandomAccess {

    /* renamed from: a, reason: collision with root package name */
    private final List f4337a;

    private C(List list) {
        this.f4337a = DesugarCollections.unmodifiableList(list);
    }

    public static C a(List list) {
        return new C(list);
    }

    public static C d(Object... objArr) {
        return new C(Arrays.asList(objArr));
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        return this.f4337a.add(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        return this.f4337a.addAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.f4337a.clear();
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f4337a.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f4337a.containsAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return this.f4337a.equals(obj);
    }

    @Override // java.util.List
    public Object get(int i8) {
        return this.f4337a.get(i8);
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return this.f4337a.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f4337a.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f4337a.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f4337a.iterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f4337a.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f4337a.listIterator();
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        return this.f4337a.remove(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        return this.f4337a.removeAll(collection);
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return this.f4337a.retainAll(collection);
    }

    @Override // java.util.List
    public Object set(int i8, Object obj) {
        return this.f4337a.set(i8, obj);
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f4337a.size();
    }

    @Override // java.util.List
    public List subList(int i8, int i9) {
        return this.f4337a.subList(i8, i9);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f4337a.toArray();
    }

    @Override // java.util.List
    public void add(int i8, Object obj) {
        this.f4337a.add(i8, obj);
    }

    @Override // java.util.List
    public boolean addAll(int i8, Collection collection) {
        return this.f4337a.addAll(i8, collection);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i8) {
        return this.f4337a.listIterator(i8);
    }

    @Override // java.util.List
    public Object remove(int i8) {
        return this.f4337a.remove(i8);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f4337a.toArray(objArr);
    }
}
