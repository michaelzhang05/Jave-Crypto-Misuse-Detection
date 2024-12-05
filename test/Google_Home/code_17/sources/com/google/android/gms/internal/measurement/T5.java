package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class T5 extends AbstractC2188m4 implements RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final T5 f16285d = new T5(new Object[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private Object[] f16286b;

    /* renamed from: c, reason: collision with root package name */
    private int f16287c;

    private T5(Object[] objArr, int i8, boolean z8) {
        super(z8);
        this.f16286b = objArr;
        this.f16287c = i8;
    }

    private final String d(int i8) {
        return "Index:" + i8 + ", Size:" + this.f16287c;
    }

    private final void e(int i8) {
        if (i8 >= 0 && i8 < this.f16287c) {
        } else {
            throw new IndexOutOfBoundsException(d(i8));
        }
    }

    public static T5 f() {
        return f16285d;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2180l5
    public final /* synthetic */ InterfaceC2180l5 a(int i8) {
        if (i8 >= this.f16287c) {
            return new T5(Arrays.copyOf(this.f16286b, i8), this.f16287c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i8, Object obj) {
        int i9;
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f16287c)) {
            Object[] objArr = this.f16286b;
            if (i9 < objArr.length) {
                System.arraycopy(objArr, i8, objArr, i8 + 1, i9 - i8);
            } else {
                Object[] objArr2 = new Object[((i9 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i8);
                System.arraycopy(this.f16286b, i8, objArr2, i8 + 1, this.f16287c - i8);
                this.f16286b = objArr2;
            }
            this.f16286b[i8] = obj;
            this.f16287c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(d(i8));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i8) {
        e(i8);
        return this.f16286b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.List
    public final Object remove(int i8) {
        c();
        e(i8);
        Object[] objArr = this.f16286b;
        Object obj = objArr[i8];
        if (i8 < this.f16287c - 1) {
            System.arraycopy(objArr, i8 + 1, objArr, i8, (r2 - i8) - 1);
        }
        this.f16287c--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i8, Object obj) {
        c();
        e(i8);
        Object[] objArr = this.f16286b;
        Object obj2 = objArr[i8];
        objArr[i8] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16287c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c();
        int i8 = this.f16287c;
        Object[] objArr = this.f16286b;
        if (i8 == objArr.length) {
            this.f16286b = Arrays.copyOf(objArr, ((i8 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f16286b;
        int i9 = this.f16287c;
        this.f16287c = i9 + 1;
        objArr2[i9] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
