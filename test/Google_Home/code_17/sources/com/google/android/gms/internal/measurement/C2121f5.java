package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.f5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2121f5 extends AbstractC2188m4 implements InterfaceC2161j5, S5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C2121f5 f16637d = new C2121f5(new int[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private int[] f16638b;

    /* renamed from: c, reason: collision with root package name */
    private int f16639c;

    private C2121f5(int[] iArr, int i8, boolean z8) {
        super(z8);
        this.f16638b = iArr;
        this.f16639c = i8;
    }

    public static C2121f5 e() {
        return f16637d;
    }

    private final String j(int i8) {
        return "Index:" + i8 + ", Size:" + this.f16639c;
    }

    private final void k(int i8) {
        if (i8 >= 0 && i8 < this.f16639c) {
        } else {
            throw new IndexOutOfBoundsException(j(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        int intValue = ((Integer) obj).intValue();
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f16639c)) {
            int[] iArr = this.f16638b;
            if (i9 < iArr.length) {
                System.arraycopy(iArr, i8, iArr, i8 + 1, i9 - i8);
            } else {
                int[] iArr2 = new int[((i9 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i8);
                System.arraycopy(this.f16638b, i8, iArr2, i8 + 1, this.f16639c - i8);
                this.f16638b = iArr2;
            }
            this.f16638b[i8] = intValue;
            this.f16639c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(j(i8));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        AbstractC2111e5.e(collection);
        if (!(collection instanceof C2121f5)) {
            return super.addAll(collection);
        }
        C2121f5 c2121f5 = (C2121f5) collection;
        int i8 = c2121f5.f16639c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f16639c;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            int[] iArr = this.f16638b;
            if (i10 > iArr.length) {
                this.f16638b = Arrays.copyOf(iArr, i10);
            }
            System.arraycopy(c2121f5.f16638b, 0, this.f16638b, this.f16639c, c2121f5.f16639c);
            this.f16639c = i10;
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
        k(i8);
        return this.f16638b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2121f5)) {
            return super.equals(obj);
        }
        C2121f5 c2121f5 = (C2121f5) obj;
        if (this.f16639c != c2121f5.f16639c) {
            return false;
        }
        int[] iArr = c2121f5.f16638b;
        for (int i8 = 0; i8 < this.f16639c; i8++) {
            if (this.f16638b[i8] != iArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i8) {
        c();
        int i9 = this.f16639c;
        int[] iArr = this.f16638b;
        if (i9 == iArr.length) {
            int[] iArr2 = new int[((i9 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i9);
            this.f16638b = iArr2;
        }
        int[] iArr3 = this.f16638b;
        int i10 = this.f16639c;
        this.f16639c = i10 + 1;
        iArr3[i10] = i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Integer.valueOf(d(i8));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2180l5
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2161j5 a(int i8) {
        if (i8 >= this.f16639c) {
            return new C2121f5(Arrays.copyOf(this.f16638b, i8), this.f16639c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f16639c; i9++) {
            i8 = (i8 * 31) + this.f16638b[i9];
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f16638b[i8] == intValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        c();
        k(i8);
        int[] iArr = this.f16638b;
        int i9 = iArr[i8];
        if (i8 < this.f16639c - 1) {
            System.arraycopy(iArr, i8 + 1, iArr, i8, (r2 - i8) - 1);
        }
        this.f16639c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        c();
        if (i9 >= i8) {
            int[] iArr = this.f16638b;
            System.arraycopy(iArr, i9, iArr, i8, this.f16639c - i9);
            this.f16639c -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        int intValue = ((Integer) obj).intValue();
        c();
        k(i8);
        int[] iArr = this.f16638b;
        int i9 = iArr[i8];
        iArr[i8] = intValue;
        return Integer.valueOf(i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16639c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
