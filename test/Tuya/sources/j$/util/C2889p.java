package j$.util;

import java.util.Comparator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2889p extends C2887n implements java.util.List, List {
    private static final long serialVersionUID = -283967356065247728L;

    /* renamed from: b, reason: collision with root package name */
    final java.util.List f32251b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2889p(java.util.List list) {
        super(list);
        this.f32251b = list;
    }

    private Object readResolve() {
        java.util.List list = this.f32251b;
        return list instanceof RandomAccess ? new C2889p(list) : this;
    }

    @Override // java.util.List
    public final void add(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i8, java.util.Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        return obj == this || this.f32251b.equals(obj);
    }

    @Override // java.util.List
    public final Object get(int i8) {
        return this.f32251b.get(i8);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        return this.f32251b.hashCode();
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return this.f32251b.indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return this.f32251b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new C2888o(this, 0);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i8) {
        return new C2888o(this, i8);
    }

    @Override // java.util.List
    public final Object remove(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i8, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public java.util.List subList(int i8, int i9) {
        return new C2889p(this.f32251b.subList(i8, i9));
    }
}
