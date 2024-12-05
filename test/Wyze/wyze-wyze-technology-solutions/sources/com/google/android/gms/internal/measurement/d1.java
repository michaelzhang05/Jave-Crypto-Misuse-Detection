package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class d1 extends e0<Integer> implements zzuu<Integer>, b2, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final d1 f15943g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f15944h;

    /* renamed from: i, reason: collision with root package name */
    private int f15945i;

    static {
        d1 d1Var = new d1();
        f15943g = d1Var;
        d1Var.B();
    }

    d1() {
        this(new int[10], 0);
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f15945i) {
            throw new IndexOutOfBoundsException(o(i2));
        }
    }

    private final String o(int i2) {
        int i3 = this.f15945i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void w(int i2, int i3) {
        int i4;
        a();
        if (i2 >= 0 && i2 <= (i4 = this.f15945i)) {
            int[] iArr = this.f15944h;
            if (i4 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
            } else {
                int[] iArr2 = new int[((i4 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.f15944h, i2, iArr2, i2 + 1, this.f15945i - i2);
                this.f15944h = iArr2;
            }
            this.f15944h[i2] = i3;
            this.f15945i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        w(i2, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        zzuq.a(collection);
        if (!(collection instanceof d1)) {
            return super.addAll(collection);
        }
        d1 d1Var = (d1) collection;
        int i2 = d1Var.f15945i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f15945i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f15944h;
            if (i4 > iArr.length) {
                this.f15944h = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(d1Var.f15944h, 0, this.f15944h, this.f15945i, d1Var.f15945i);
            this.f15945i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int b(int i2) {
        f(i2);
        return this.f15944h[i2];
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return super.equals(obj);
        }
        d1 d1Var = (d1) obj;
        if (this.f15945i != d1Var.f15945i) {
            return false;
        }
        int[] iArr = d1Var.f15944h;
        for (int i2 = 0; i2 < this.f15945i; i2++) {
            if (this.f15944h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(b(i2));
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f15945i; i3++) {
            i2 = (i2 * 31) + this.f15944h[i3];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzuu
    public final /* synthetic */ zzuu<Integer> i(int i2) {
        if (i2 >= this.f15945i) {
            return new d1(Arrays.copyOf(this.f15944h, i2), this.f15945i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f15945i; i2++) {
            if (obj.equals(Integer.valueOf(this.f15944h[i2]))) {
                int[] iArr = this.f15944h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f15945i - i2) - 1);
                this.f15945i--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 >= i2) {
            int[] iArr = this.f15944h;
            System.arraycopy(iArr, i3, iArr, i2, this.f15945i - i3);
            this.f15945i -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i2);
        int[] iArr = this.f15944h;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15945i;
    }

    private d1(int[] iArr, int i2) {
        this.f15944h = iArr;
        this.f15945i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        int[] iArr = this.f15944h;
        int i3 = iArr[i2];
        if (i2 < this.f15945i - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f15945i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }
}
