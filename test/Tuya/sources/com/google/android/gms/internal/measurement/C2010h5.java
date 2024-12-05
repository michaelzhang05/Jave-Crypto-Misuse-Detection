package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.h5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2010h5 extends I3 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C2010h5 f15725d = new C2010h5(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f15726b;

    /* renamed from: c, reason: collision with root package name */
    private int f15727c;

    private C2010h5(Object[] objArr, int i8, boolean z8) {
        super(z8);
        this.f15726b = objArr;
        this.f15727c = i8;
    }

    public static C2010h5 d() {
        return f15725d;
    }

    private final String g(int i8) {
        return "Index:" + i8 + ", Size:" + this.f15727c;
    }

    private final void h(int i8) {
        if (i8 >= 0 && i8 < this.f15727c) {
        } else {
            throw new IndexOutOfBoundsException(g(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        a();
        if (i8 >= 0 && i8 <= (i9 = this.f15727c)) {
            Object[] objArr = this.f15726b;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i8, objArr, i8 + 1, i9 - i8);
            } else {
                Object[] objArr2 = new Object[((i9 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i8);
                System.arraycopy(this.f15726b, i8, objArr2, i8 + 1, this.f15727c - i8);
                this.f15726b = objArr2;
            }
            this.f15726b[i8] = obj;
            this.f15727c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(g(i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        h(i8);
        return this.f15726b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final /* bridge */ /* synthetic */ A4 k(int i8) {
        if (i8 >= this.f15727c) {
            return new C2010h5(Arrays.copyOf(this.f15726b, i8), this.f15727c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        a();
        h(i8);
        Object[] objArr = this.f15726b;
        Object obj = objArr[i8];
        if (i8 < this.f15727c - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f15727c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        a();
        h(i8);
        Object[] objArr = this.f15726b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15727c;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i8 = this.f15727c;
        Object[] objArr = this.f15726b;
        if (i8 == objArr.length) {
            this.f15726b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f15726b;
        int i9 = this.f15727c;
        this.f15727c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
