package j$.util;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3032i extends C3031h implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* renamed from: c, reason: collision with root package name */
    final java.util.List f33418c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3032i(java.util.List list) {
        super(list);
        this.f33418c = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3032i(java.util.List list, Object obj) {
        super(list, obj);
        this.f33418c = list;
    }

    private Object readResolve() {
        java.util.List list = this.f33418c;
        return list instanceof RandomAccess ? new C3032i(list) : this;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        synchronized (this.f33414b) {
            this.f33418c.add(i8, obj);
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i8, java.util.Collection collection) {
        boolean addAll;
        synchronized (this.f33414b) {
            addAll = this.f33418c.addAll(i8, collection);
        }
        return addAll;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f33414b) {
            equals = this.f33418c.equals(obj);
        }
        return equals;
    }

    @Override // java.util.List
    public final Object get(int i8) {
        Object obj;
        synchronized (this.f33414b) {
            obj = this.f33418c.get(i8);
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int hashCode;
        synchronized (this.f33414b) {
            hashCode = this.f33418c.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int indexOf;
        synchronized (this.f33414b) {
            indexOf = this.f33418c.indexOf(obj);
        }
        return indexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int lastIndexOf;
        synchronized (this.f33414b) {
            lastIndexOf = this.f33418c.lastIndexOf(obj);
        }
        return lastIndexOf;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f33418c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        return this.f33418c.listIterator(i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        Object remove;
        synchronized (this.f33414b) {
            remove = this.f33418c.remove(i8);
        }
        return remove;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f33414b) {
            java.util.List list = this.f33418c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                Objects.requireNonNull(unaryOperator);
                ListIterator listIterator = list.listIterator();
                while (listIterator.hasNext()) {
                    listIterator.set(unaryOperator.apply(listIterator.next()));
                }
            }
        }
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        Object obj2;
        synchronized (this.f33414b) {
            obj2 = this.f33418c.set(i8, obj);
        }
        return obj2;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        synchronized (this.f33414b) {
            AbstractC3027d.u(this.f33418c, comparator);
        }
    }

    @Override // java.util.List
    public java.util.List subList(int i8, int i9) {
        C3032i c3032i;
        synchronized (this.f33414b) {
            c3032i = new C3032i(this.f33418c.subList(i8, i9), this.f33414b);
        }
        return c3032i;
    }
}
