package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class iw<E> extends yt<E> {

    /* renamed from: g, reason: collision with root package name */
    private static final iw<Object> f11617g;

    /* renamed from: h, reason: collision with root package name */
    private final List<E> f11618h;

    static {
        iw<Object> iwVar = new iw<>(new ArrayList(0));
        f11617g = iwVar;
        iwVar.v();
    }

    private iw(List<E> list) {
        this.f11618h = list;
    }

    public static <E> iw<E> b() {
        return (iw<E>) f11617g;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        a();
        this.f11618h.add(i2, e2);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        return this.f11618h.get(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj l(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f11618h);
            return new iw(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        a();
        E remove = this.f11618h.remove(i2);
        ((AbstractList) this).modCount++;
        return remove;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        a();
        E e3 = this.f11618h.set(i2, e2);
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11618h.size();
    }
}
