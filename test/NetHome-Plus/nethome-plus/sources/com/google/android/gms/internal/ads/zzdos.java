package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzdos extends yt<String> implements zzdot, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final zzdos f14869g;

    /* renamed from: h, reason: collision with root package name */
    private static final zzdot f14870h;

    /* renamed from: i, reason: collision with root package name */
    private final List<Object> f14871i;

    static {
        zzdos zzdosVar = new zzdos();
        f14869g = zzdosVar;
        zzdosVar.v();
        f14870h = zzdosVar;
    }

    public zzdos() {
        this(10);
    }

    private static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdmr) {
            return ((zzdmr) obj).z();
        }
        return zzdod.f((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final Object I(int i2) {
        return this.f14871i.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f14871i.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final List<?> c() {
        return Collections.unmodifiableList(this.f14871i);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f14871i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f14871i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzdmr) {
            zzdmr zzdmrVar = (zzdmr) obj;
            String z = zzdmrVar.z();
            if (zzdmrVar.D()) {
                this.f14871i.set(i2, z);
            }
            return z;
        }
        byte[] bArr = (byte[]) obj;
        String f2 = zzdod.f(bArr);
        if (zzdod.e(bArr)) {
            this.f14871i.set(i2, f2);
        }
        return f2;
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final zzdot j() {
        return s() ? new zzdqw(this) : this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj l(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f14871i);
            return new zzdos((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.ads.yt, com.google.android.gms.internal.ads.zzdoj
    public final /* bridge */ /* synthetic */ boolean s() {
        return super.s();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        a();
        return b(this.f14871i.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f14871i.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdot
    public final void u(zzdmr zzdmrVar) {
        a();
        this.f14871i.add(zzdmrVar);
        ((AbstractList) this).modCount++;
    }

    public zzdos(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof zzdot) {
            collection = ((zzdot) collection).c();
        }
        boolean addAll = this.f14871i.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        Object remove = this.f14871i.remove(i2);
        ((AbstractList) this).modCount++;
        return b(remove);
    }

    private zzdos(ArrayList<Object> arrayList) {
        this.f14871i = arrayList;
    }
}
