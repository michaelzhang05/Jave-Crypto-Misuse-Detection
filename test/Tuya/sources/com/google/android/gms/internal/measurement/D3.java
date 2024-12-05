package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* loaded from: classes3.dex */
final class D3 extends AbstractC2143y3 {

    /* renamed from: c, reason: collision with root package name */
    final transient Object f15294c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public D3(Object obj) {
        obj.getClass();
        this.f15294c = obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3
    final int a(Object[] objArr, int i8) {
        objArr[0] = this.f15294c;
        return 1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2095s3, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f15294c.equals(obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2143y3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f15294c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return new C2151z3(this.f15294c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f15294c.toString() + "]";
    }
}
