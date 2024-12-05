package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class hv extends yt<Integer> implements zzdoh, gw, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final hv f11542g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f11543h;

    /* renamed from: i, reason: collision with root package name */
    private int f11544i;

    static {
        hv hvVar = new hv(new int[0], 0);
        f11542g = hvVar;
        hvVar.v();
    }

    hv() {
        this(new int[10], 0);
    }

    private final void f(int i2, int i3) {
        int i4;
        a();
        if (i2 >= 0 && i2 <= (i4 = this.f11544i)) {
            int[] iArr = this.f11543h;
            if (i4 < iArr.length) {
                System.arraycopy(iArr, i2, iArr, i2 + 1, i4 - i2);
            } else {
                int[] iArr2 = new int[((i4 * 3) / 2) + 1];
                System.arraycopy(iArr, 0, iArr2, 0, i2);
                System.arraycopy(this.f11543h, i2, iArr2, i2 + 1, this.f11544i - i2);
                this.f11543h = iArr2;
            }
            this.f11543h[i2] = i3;
            this.f11544i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(x(i2));
    }

    public static hv o() {
        return f11542g;
    }

    private final void w(int i2) {
        if (i2 < 0 || i2 >= this.f11544i) {
            throw new IndexOutOfBoundsException(x(i2));
        }
    }

    private final String x(int i2) {
        int i3 = this.f11544i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzdoh
    public final void F(int i2) {
        f(this.f11544i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        f(i2, ((Integer) obj).intValue());
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        zzdod.a(collection);
        if (!(collection instanceof hv)) {
            return super.addAll(collection);
        }
        hv hvVar = (hv) collection;
        int i2 = hvVar.f11544i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f11544i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            int[] iArr = this.f11543h;
            if (i4 > iArr.length) {
                this.f11543h = Arrays.copyOf(iArr, i4);
            }
            System.arraycopy(hvVar.f11543h, 0, this.f11543h, this.f11544i, hvVar.f11544i);
            this.f11544i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final int b(int i2) {
        w(i2);
        return this.f11543h[i2];
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hv)) {
            return super.equals(obj);
        }
        hv hvVar = (hv) obj;
        if (this.f11544i != hvVar.f11544i) {
            return false;
        }
        int[] iArr = hvVar.f11543h;
        for (int i2 = 0; i2 < this.f11544i; i2++) {
            if (this.f11543h[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(b(i2));
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f11544i; i3++) {
            i2 = (i2 * 31) + this.f11543h[i3];
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final zzdoh l(int i2) {
        if (i2 >= this.f11544i) {
            return new hv(Arrays.copyOf(this.f11543h, i2), this.f11544i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f11544i; i2++) {
            if (obj.equals(Integer.valueOf(this.f11543h[i2]))) {
                int[] iArr = this.f11543h;
                System.arraycopy(iArr, i2 + 1, iArr, i2, (this.f11544i - i2) - 1);
                this.f11544i--;
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
            int[] iArr = this.f11543h;
            System.arraycopy(iArr, i3, iArr, i2, this.f11544i - i3);
            this.f11544i -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        w(i2);
        int[] iArr = this.f11543h;
        int i3 = iArr[i2];
        iArr[i2] = intValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11544i;
    }

    private hv(int[] iArr, int i2) {
        this.f11543h = iArr;
        this.f11544i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        w(i2);
        int[] iArr = this.f11543h;
        int i3 = iArr[i2];
        if (i2 < this.f11544i - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f11544i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }
}
