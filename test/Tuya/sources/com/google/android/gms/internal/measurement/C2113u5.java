package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.u5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2113u5 extends AbstractList implements RandomAccess, G4 {

    /* renamed from: a, reason: collision with root package name */
    private final G4 f15914a;

    public C2113u5(G4 g42) {
        this.f15914a = g42;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final void T(X3 x32) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final G4 e() {
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final List f() {
        return this.f15914a.f();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i8) {
        return ((F4) this.f15914a).get(i8);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C2105t5(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i8) {
        return new C2097s5(this, i8);
    }

    @Override // com.google.android.gms.internal.measurement.G4
    public final Object o(int i8) {
        return this.f15914a.o(i8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15914a.size();
    }
}
