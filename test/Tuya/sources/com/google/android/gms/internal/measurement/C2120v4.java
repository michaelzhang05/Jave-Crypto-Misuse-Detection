package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.v4, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C2120v4 extends I3 implements RandomAccess, InterfaceC2144y4, InterfaceC1992f5 {

    /* renamed from: d, reason: collision with root package name */
    private static final C2120v4 f15937d = new C2120v4(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f15938b;

    /* renamed from: c, reason: collision with root package name */
    private int f15939c;

    private C2120v4(int[] iArr, int i8, boolean z8) {
        super(z8);
        this.f15938b = iArr;
        this.f15939c = i8;
    }

    public static C2120v4 g() {
        return f15937d;
    }

    private final String i(int i8) {
        return "Index:" + i8 + ", Size:" + this.f15939c;
    }

    private final void l(int i8) {
        if (i8 >= 0 && i8 < this.f15939c) {
        } else {
            throw new IndexOutOfBoundsException(i(i8));
        }
    }

    @Override // com.google.android.gms.internal.measurement.A4
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2144y4 k(int i8) {
        if (i8 >= this.f15939c) {
            return new C2120v4(Arrays.copyOf(this.f15938b, i8), this.f15939c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i8 >= 0 && i8 <= (i9 = this.f15939c)) {
            int[] iArr = this.f15938b;
            if (i9 < iArr.length) {
                System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
            } else {
                int[] iArr2 = new int[((i9 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i8);
                System.arraycopy(this.f15938b, i8, iArr2, i8 + 1, this.f15939c - i8);
                this.f15938b = iArr2;
            }
            this.f15938b[i8] = intValue;
            this.f15939c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i8));
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = B4.f15272d;
        collection.getClass();
        if (!(collection instanceof C2120v4)) {
            return super.addAll(collection);
        }
        C2120v4 c2120v4 = (C2120v4) collection;
        int i8 = c2120v4.f15939c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f15939c;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            int[] iArr = this.f15938b;
            if (i10 > iArr.length) {
                this.f15938b = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(c2120v4.f15938b, 0, this.f15938b, this.f15939c, c2120v4.f15939c);
            this.f15939c = i10;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    public final int d(int i8) {
        l(i8);
        return this.f15938b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2120v4)) {
            return super.equals(obj);
        }
        C2120v4 c2120v4 = (C2120v4) obj;
        if (this.f15939c != c2120v4.f15939c) {
            return false;
        }
        int[] iArr = c2120v4.f15938b;
        for (int i8 = 0; i8 < this.f15939c; i8++) {
            if (this.f15938b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        l(i8);
        return Integer.valueOf(this.f15938b[i8]);
    }

    public final void h(int i8) {
        a();
        int i9 = this.f15939c;
        int[] iArr = this.f15938b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f15938b = iArr2;
        }
        int[] iArr3 = this.f15938b;
        int i10 = this.f15939c;
        this.f15939c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f15939c; i9++) {
            i8 = (i8 * 31) + this.f15938b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i8 = this.f15939c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f15938b[i9] == intValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        l(i8);
        int[] iArr = this.f15938b;
        int i9 = iArr[i8];
        if (i8 < this.f15939c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f15939c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 >= i8) {
            int[] iArr = this.f15938b;
            System.arraycopy(iArr, i9, iArr, i8, this.f15939c - i9);
            this.f15939c -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        l(i8);
        int[] iArr = this.f15938b;
        int i9 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15939c;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
