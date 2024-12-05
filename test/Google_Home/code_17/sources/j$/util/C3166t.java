package j$.util;

import j$.util.Collection;
import j$.util.stream.AbstractC3163z0;
import j$.util.stream.Stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: j$.util.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3166t extends C3169w {
    private static final long serialVersionUID = 7854390611657943733L;

    @Override // j$.util.C3037n, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        return this.f33443a.contains(new r((Map.Entry) obj));
    }

    @Override // j$.util.C3037n, java.util.Collection
    public final boolean containsAll(java.util.Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.C3169w, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set)) {
            return false;
        }
        java.util.Set set = (java.util.Set) obj;
        if (set.size() != this.f33443a.size()) {
            return false;
        }
        return containsAll(set);
    }

    @Override // j$.util.C3037n, java.lang.Iterable, j$.util.Collection
    public final void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        Collection.EL.a(this.f33443a, new C3040q(consumer));
    }

    @Override // j$.util.C3037n, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C3036m(this);
    }

    @Override // j$.util.C3037n, java.util.Collection, j$.util.Collection
    public final Stream parallelStream() {
        return AbstractC3163z0.g0(spliterator(), true);
    }

    @Override // j$.util.C3037n, java.util.Collection, java.lang.Iterable, j$.util.Collection, j$.util.List
    public final Spliterator spliterator() {
        return new C3041s(Collection.EL.c(this.f33443a));
    }

    @Override // j$.util.C3037n, java.util.Collection, j$.util.Collection
    public final Stream stream() {
        return AbstractC3163z0.g0(spliterator(), false);
    }

    @Override // j$.util.C3037n, java.util.Collection
    public final Object[] toArray() {
        Object[] array = this.f33443a.toArray();
        for (int i8 = 0; i8 < array.length; i8++) {
            array[i8] = new r((Map.Entry) array[i8]);
        }
        return array;
    }

    @Override // j$.util.C3037n, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        Object[] array = this.f33443a.toArray(objArr.length == 0 ? objArr : Arrays.copyOf(objArr, 0));
        for (int i8 = 0; i8 < array.length; i8++) {
            array[i8] = new r((Map.Entry) array[i8]);
        }
        if (array.length > objArr.length) {
            return array;
        }
        System.arraycopy(array, 0, objArr, 0, array.length);
        if (objArr.length > array.length) {
            objArr[array.length] = null;
        }
        return objArr;
    }
}
