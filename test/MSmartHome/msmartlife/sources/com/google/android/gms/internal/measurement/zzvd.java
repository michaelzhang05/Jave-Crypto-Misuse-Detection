package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class zzvd extends e0<String> implements zzve, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final zzvd f16151g;

    /* renamed from: h, reason: collision with root package name */
    private static final zzve f16152h;

    /* renamed from: i, reason: collision with root package name */
    private final List<Object> f16153i;

    static {
        zzvd zzvdVar = new zzvd();
        f16151g = zzvdVar;
        zzvdVar.B();
        f16152h = zzvdVar;
    }

    public zzvd() {
        this(10);
    }

    private static String b(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            return ((zzte) obj).N();
        }
        return zzuq.i((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.e0, com.google.android.gms.internal.measurement.zzuu
    public final /* bridge */ /* synthetic */ boolean H() {
        return super.H();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        a();
        this.f16153i.add(i2, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f16153i.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final Object g(int i2) {
        return this.f16153i.get(i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f16153i.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            zzte zzteVar = (zzte) obj;
            String N = zzteVar.N();
            if (zzteVar.O()) {
                this.f16153i.set(i2, N);
            }
            return N;
        }
        byte[] bArr = (byte[]) obj;
        String i3 = zzuq.i(bArr);
        if (zzuq.h(bArr)) {
            this.f16153i.set(i2, i3);
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final zzve h() {
        return H() ? new zzxg(this) : this;
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.zzuu
    public final /* synthetic */ zzuu i(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f16153i);
            return new zzvd((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.zzve
    public final List<?> m() {
        return Collections.unmodifiableList(this.f16153i);
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        a();
        return b(this.f16153i.set(i2, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16153i.size();
    }

    public zzvd(int i2) {
        this((ArrayList<Object>) new ArrayList(i2));
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection<? extends String> collection) {
        a();
        if (collection instanceof zzve) {
            collection = ((zzve) collection).m();
        }
        boolean addAll = this.f16153i.addAll(i2, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        Object remove = this.f16153i.remove(i2);
        ((AbstractList) this).modCount++;
        return b(remove);
    }

    private zzvd(ArrayList<Object> arrayList) {
        this.f16153i = arrayList;
    }
}
