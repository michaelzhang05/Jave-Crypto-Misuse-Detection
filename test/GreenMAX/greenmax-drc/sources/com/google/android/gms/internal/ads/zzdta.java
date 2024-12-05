package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class zzdta<E> extends AbstractList<E> {

    /* renamed from: f, reason: collision with root package name */
    private static final zzdtc f14978f = zzdtc.b(zzdta.class);

    /* renamed from: g, reason: collision with root package name */
    List<E> f14979g;

    /* renamed from: h, reason: collision with root package name */
    Iterator<E> f14980h;

    public zzdta(List<E> list, Iterator<E> it) {
        this.f14979g = list;
        this.f14980h = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i2) {
        if (this.f14979g.size() > i2) {
            return this.f14979g.get(i2);
        }
        if (this.f14980h.hasNext()) {
            this.f14979g.add(this.f14980h.next());
            return get(i2);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return new jy(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        zzdtc zzdtcVar = f14978f;
        zzdtcVar.a("potentially expensive size() call");
        zzdtcVar.a("blowup running");
        while (this.f14980h.hasNext()) {
            this.f14979g.add(this.f14980h.next());
        }
        return this.f14979g.size();
    }
}
