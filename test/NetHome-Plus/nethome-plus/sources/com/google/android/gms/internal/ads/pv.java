package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class pv extends yt<Long> implements zzdoj<Long>, gw, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final pv f12008g;

    /* renamed from: h, reason: collision with root package name */
    private long[] f12009h;

    /* renamed from: i, reason: collision with root package name */
    private int f12010i;

    static {
        pv pvVar = new pv(new long[0], 0);
        f12008g = pvVar;
        pvVar.v();
    }

    pv() {
        this(new long[10], 0);
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f12010i) {
            throw new IndexOutOfBoundsException(o(i2));
        }
    }

    private final String o(int i2) {
        int i3 = this.f12010i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void x(int i2, long j2) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f12010i)) {
            long[] jArr = this.f12009h;
            if (i3 < jArr.length) {
                System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
            } else {
                long[] jArr2 = new long[((i3 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i2);
                System.arraycopy(this.f12009h, i2, jArr2, i2 + 1, this.f12010i - i2);
                this.f12009h = jArr2;
            }
            this.f12009h[i2] = j2;
            this.f12010i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        x(i2, ((Long) obj).longValue());
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        zzdod.a(collection);
        if (!(collection instanceof pv)) {
            return super.addAll(collection);
        }
        pv pvVar = (pv) collection;
        int i2 = pvVar.f12010i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f12010i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            long[] jArr = this.f12009h;
            if (i4 > jArr.length) {
                this.f12009h = Arrays.copyOf(jArr, i4);
            }
            System.arraycopy(pvVar.f12009h, 0, this.f12009h, this.f12010i, pvVar.f12010i);
            this.f12010i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final long b(int i2) {
        f(i2);
        return this.f12009h[i2];
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pv)) {
            return super.equals(obj);
        }
        pv pvVar = (pv) obj;
        if (this.f12010i != pvVar.f12010i) {
            return false;
        }
        long[] jArr = pvVar.f12009h;
        for (int i2 = 0; i2 < this.f12010i; i2++) {
            if (this.f12009h[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(b(i2));
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f12010i; i3++) {
            i2 = (i2 * 31) + zzdod.i(this.f12009h[i3]);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj<Long> l(int i2) {
        if (i2 >= this.f12010i) {
            return new pv(Arrays.copyOf(this.f12009h, i2), this.f12010i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f12010i; i2++) {
            if (obj.equals(Long.valueOf(this.f12009h[i2]))) {
                long[] jArr = this.f12009h;
                System.arraycopy(jArr, i2 + 1, jArr, i2, (this.f12010i - i2) - 1);
                this.f12010i--;
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
            long[] jArr = this.f12009h;
            System.arraycopy(jArr, i3, jArr, i2, this.f12010i - i3);
            this.f12010i -= i3 - i2;
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
        long[] jArr = this.f12009h;
        long j2 = jArr[i2];
        jArr[i2] = longValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12010i;
    }

    public final void w(long j2) {
        x(this.f12010i, j2);
    }

    private pv(long[] jArr, int i2) {
        this.f12009h = jArr;
        this.f12010i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        long[] jArr = this.f12009h;
        long j2 = jArr[i2];
        if (i2 < this.f12010i - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f12010i--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }
}
