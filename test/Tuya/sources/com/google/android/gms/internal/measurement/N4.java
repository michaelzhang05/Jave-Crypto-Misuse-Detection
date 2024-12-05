package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
final class N4 extends I3 implements RandomAccess, InterfaceC2152z4, InterfaceC1992f5 {

    /* renamed from: d, reason: collision with root package name */
    private static final N4 f15403d = new N4(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f15404b;

    /* renamed from: c, reason: collision with root package name */
    private int f15405c;

    private N4(long[] jArr, int i8, boolean z8) {
        super(z8);
        this.f15404b = jArr;
        this.f15405c = i8;
    }

    public static N4 d() {
        return f15403d;
    }

    private final String h(int i8) {
        return "Index:" + i8 + ", Size:" + this.f15405c;
    }

    private final void i(int i8) {
        if (i8 >= 0 && i8 < this.f15405c) {
        } else {
            throw new IndexOutOfBoundsException(h(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        a();
        if (i8 >= 0 && i8 <= (i9 = this.f15405c)) {
            long[] jArr = this.f15404b;
            if (i9 < jArr.length) {
                System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
            } else {
                long[] jArr2 = new long[((i9 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i8);
                System.arraycopy(this.f15404b, i8, jArr2, i8 + 1, this.f15405c - i8);
                this.f15404b = jArr2;
            }
            this.f15404b[i8] = longValue;
            this.f15405c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(h(i8));
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        byte[] bArr = B4.f15272d;
        collection.getClass();
        if (!(collection instanceof N4)) {
            return super.addAll(collection);
        }
        N4 n42 = (N4) collection;
        int i8 = n42.f15405c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f15405c;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            long[] jArr = this.f15404b;
            if (i10 > jArr.length) {
                this.f15404b = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(n42.f15404b, 0, this.f15404b, this.f15405c, n42.f15405c);
            this.f15405c = i10;
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

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N4)) {
            return super.equals(obj);
        }
        N4 n42 = (N4) obj;
        if (this.f15405c != n42.f15405c) {
            return false;
        }
        long[] jArr = n42.f15404b;
        for (int i8 = 0; i8 < this.f15405c; i8++) {
            if (this.f15404b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j8) {
        a();
        int i8 = this.f15405c;
        long[] jArr = this.f15404b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f15404b = jArr2;
        }
        long[] jArr3 = this.f15404b;
        int i9 = this.f15405c;
        this.f15405c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        i(i8);
        return Long.valueOf(this.f15404b[i8]);
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f15405c; i9++) {
            long j8 = this.f15404b[i9];
            byte[] bArr = B4.f15272d;
            i8 = (i8 * 31) + ((int) (j8 ^ (j8 >>> 32)));
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i8 = this.f15405c;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f15404b[i9] == longValue) {
                return i9;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2152z4
    public final long j(int i8) {
        i(i8);
        return this.f15404b[i8];
    }

    @Override // com.google.android.gms.internal.measurement.A4
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2152z4 k(int i8) {
        if (i8 >= this.f15405c) {
            return new N4(Arrays.copyOf(this.f15404b, i8), this.f15405c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i8) {
        a();
        i(i8);
        long[] jArr = this.f15404b;
        long j8 = jArr[i8];
        if (i8 < this.f15405c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f15405c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        a();
        if (i9 >= i8) {
            long[] jArr = this.f15404b;
            System.arraycopy(jArr, i9, jArr, i8, this.f15405c - i9);
            this.f15405c -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        i(i8);
        long[] jArr = this.f15404b;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15405c;
    }

    @Override // com.google.android.gms.internal.measurement.I3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
