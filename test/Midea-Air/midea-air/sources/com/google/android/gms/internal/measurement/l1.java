package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class l1 extends e0<Long> implements zzuu<Long>, b2, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final l1 f15988g;

    /* renamed from: h, reason: collision with root package name */
    private long[] f15989h;

    /* renamed from: i, reason: collision with root package name */
    private int f15990i;

    static {
        l1 l1Var = new l1();
        f15988g = l1Var;
        l1Var.B();
    }

    l1() {
        this(new long[10], 0);
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f15990i) {
            throw new IndexOutOfBoundsException(o(i2));
        }
    }

    private final String o(int i2) {
        int i3 = this.f15990i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void w(int i2, long j2) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f15990i)) {
            long[] jArr = this.f15989h;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[((i3 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.f15989h, i2, jArr2, i2 + 1, this.f15990i - i2);
                this.f15989h = jArr2;
            }
            this.f15989h[i2] = j2;
            this.f15990i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        w(i2, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        zzuq.a(collection);
        if (!(collection instanceof l1)) {
            return super.addAll(collection);
        }
        l1 l1Var = (l1) collection;
        int i2 = l1Var.f15990i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f15990i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f15989h;
            if (i4 > jArr.length) {
                this.f15989h = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(l1Var.f15989h, 0, this.f15989h, this.f15990i, l1Var.f15990i);
            this.f15990i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i2) {
        f(i2);
        return this.f15989h[i2];
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return super.equals(obj);
        }
        l1 l1Var = (l1) obj;
        if (this.f15990i != l1Var.f15990i) {
            return false;
        }
        long[] jArr = l1Var.f15989h;
        for (int i2 = 0; i2 < this.f15990i; i2++) {
            if (this.f15989h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(b(i2));
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f15990i; i3++) {
            i2 = (i2 * 31) + zzuq.f(this.f15989h[i3]);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzuu
    public final /* synthetic */ zzuu<Long> i(int i2) {
        if (i2 >= this.f15990i) {
            return new l1(Arrays.copyOf(this.f15989h, i2), this.f15990i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.e0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f15990i; i2++) {
            if (obj.equals(Long.valueOf(this.f15989h[i2]))) {
                long[] jArr = this.f15989h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f15990i - i2) - 1);
                this.f15990i--;
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
            long[] jArr = this.f15989h;
            System.arraycopy(jArr, i3, jArr, i2, this.f15990i - i3);
            this.f15990i -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i2);
        long[] jArr = this.f15989h;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f15990i;
    }

    private l1(long[] jArr, int i2) {
        this.f15989h = jArr;
        this.f15990i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        long[] jArr = this.f15989h;
        long j2 = jArr[i2];
        if (i2 < this.f15990i - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f15990i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }
}
