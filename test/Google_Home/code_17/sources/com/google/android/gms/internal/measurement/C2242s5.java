package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2242s5 extends AbstractC2188m4 implements InterfaceC2151i5, S5, RandomAccess {

    /* renamed from: d, reason: collision with root package name */
    private static final C2242s5 f16821d = new C2242s5(new long[0], 0, false);

    /* renamed from: b, reason: collision with root package name */
    private long[] f16822b;

    /* renamed from: c, reason: collision with root package name */
    private int f16823c;

    private C2242s5(long[] jArr, int i8, boolean z8) {
        super(z8);
        this.f16822b = jArr;
        this.f16823c = i8;
    }

    public static C2242s5 e() {
        return f16821d;
    }

    private final String f(int i8) {
        return "Index:" + i8 + ", Size:" + this.f16823c;
    }

    private final void j(int i8) {
        if (i8 >= 0 && i8 < this.f16823c) {
        } else {
            throw new IndexOutOfBoundsException(f(i8));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i8, Object obj) {
        int i9;
        long longValue = ((Long) obj).longValue();
        c();
        if (i8 >= 0 && i8 <= (i9 = this.f16823c)) {
            long[] jArr = this.f16822b;
            if (i9 < jArr.length) {
                System.arraycopy(jArr, i8, jArr, i8 + 1, i9 - i8);
            } else {
                long[] jArr2 = new long[((i9 * 3) / 2) + 1];
                System.arraycopy(jArr, 0, jArr2, 0, i8);
                System.arraycopy(this.f16822b, i8, jArr2, i8 + 1, this.f16823c - i8);
                this.f16822b = jArr2;
            }
            this.f16822b[i8] = longValue;
            this.f16823c++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(f(i8));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        AbstractC2111e5.e(collection);
        if (!(collection instanceof C2242s5)) {
            return super.addAll(collection);
        }
        C2242s5 c2242s5 = (C2242s5) collection;
        int i8 = c2242s5.f16823c;
        if (i8 == 0) {
            return false;
        }
        int i9 = this.f16823c;
        if (Integer.MAX_VALUE - i9 >= i8) {
            int i10 = i9 + i8;
            long[] jArr = this.f16822b;
            if (i10 > jArr.length) {
                this.f16822b = Arrays.copyOf(jArr, i10);
            }
            System.arraycopy(c2242s5.f16822b, 0, this.f16822b, this.f16823c, c2242s5.f16823c);
            this.f16823c = i10;
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

    public final void d(long j8) {
        c();
        int i8 = this.f16823c;
        long[] jArr = this.f16822b;
        if (i8 == jArr.length) {
            long[] jArr2 = new long[((i8 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i8);
            this.f16822b = jArr2;
        }
        long[] jArr3 = this.f16822b;
        int i9 = this.f16823c;
        this.f16823c = i9 + 1;
        jArr3[i9] = j8;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2242s5)) {
            return super.equals(obj);
        }
        C2242s5 c2242s5 = (C2242s5) obj;
        if (this.f16823c != c2242s5.f16823c) {
            return false;
        }
        long[] jArr = c2242s5.f16822b;
        for (int i8 = 0; i8 < this.f16823c; i8++) {
            if (this.f16822b[i8] != jArr[i8]) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2151i5
    public final long g(int i8) {
        j(i8);
        return this.f16822b[i8];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i8) {
        return Long.valueOf(g(i8));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2180l5
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final InterfaceC2151i5 a(int i8) {
        if (i8 >= this.f16823c) {
            return new C2242s5(Arrays.copyOf(this.f16822b, i8), this.f16823c, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i8 = 1;
        for (int i9 = 0; i9 < this.f16823c; i9++) {
            i8 = (i8 * 31) + AbstractC2111e5.b(this.f16822b[i9]);
        }
        return i8;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i8 = 0; i8 < size; i8++) {
            if (this.f16822b[i8] == longValue) {
                return i8;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2188m4, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i8) {
        c();
        j(i8);
        long[] jArr = this.f16822b;
        long j8 = jArr[i8];
        if (i8 < this.f16823c - 1) {
            System.arraycopy(jArr, i8 + 1, jArr, i8, (r3 - i8) - 1);
        }
        this.f16823c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i8, int i9) {
        c();
        if (i9 >= i8) {
            long[] jArr = this.f16822b;
            System.arraycopy(jArr, i9, jArr, i8, this.f16823c - i9);
            this.f16823c -= i9 - i8;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i8, Object obj) {
        long longValue = ((Long) obj).longValue();
        c();
        j(i8);
        long[] jArr = this.f16822b;
        long j8 = jArr[i8];
        jArr[i8] = longValue;
        return Long.valueOf(j8);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f16823c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
