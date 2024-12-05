package com.google.android.gms.internal.measurement;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class F4 extends I3 implements RandomAccess, G4 {

    /* renamed from: c, reason: collision with root package name */
    private static final F4 f15326c;

    /* renamed from: d, reason: collision with root package name */
    public static final G4 f15327d;

    /* renamed from: b, reason: collision with root package name */
    private final List f15328b;

    static {
        F4 f42 = new F4(false);
        f15326c = f42;
        f15327d = f42;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(int i8) {
        super(true);
        ArrayList arrayList = new ArrayList(i8);
        this.f15328b = arrayList;
    }

    private static String g(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof X3) {
            return ((X3) obj).v(B4.f15270b);
        }
        return B4.d((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final void T(X3 x32) {
        a();
        this.f15328b.add(x32);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i8, Object obj) {
        a();
        this.f15328b.add(i8, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.List
    public final boolean addAll(int i8, Collection collection) {
        a();
        if (collection instanceof G4) {
            collection = ((G4) collection).f();
        }
        boolean addAll = this.f15328b.addAll(i8, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f15328b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final String get(int i8) {
        Object obj = this.f15328b.get(i8);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof X3) {
            X3 x32 = (X3) obj;
            String v8 = x32.v(B4.f15270b);
            if (x32.q()) {
                this.f15328b.set(i8, v8);
            }
            return v8;
        }
        byte[] bArr = (byte[]) obj;
        String d8 = B4.d(bArr);
        if (E5.d(bArr)) {
            this.f15328b.set(i8, d8);
        }
        return d8;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final G4 e() {
        if (c()) {
            return new C2113u5(this);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final List f() {
        return DesugarCollections.unmodifiableList(this.f15328b);
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final /* bridge */ /* synthetic */ A4 k(int i8) {
        if (i8 >= size()) {
            ArrayList arrayList = new ArrayList(i8);
            arrayList.addAll(this.f15328b);
            return new F4(arrayList);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final Object o(int i8) {
        return this.f15328b.get(i8);
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        Object remove = this.f15328b.remove(i8);
        ((AbstractList) this).modCount++;
        return g(remove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        a();
        return g(this.f15328b.set(i8, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15328b.size();
    }

    private F4(ArrayList arrayList) {
        super(true);
        this.f15328b = arrayList;
    }

    private F4(boolean z8) {
        super(false);
        this.f15328b = Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
