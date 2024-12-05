package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class cu extends yt<Boolean> implements zzdoj<Boolean>, gw, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final cu f11254g;

    /* renamed from: h, reason: collision with root package name */
    private boolean[] f11255h;

    /* renamed from: i, reason: collision with root package name */
    private int f11256i;

    static {
        cu cuVar = new cu(new boolean[0], 0);
        f11254g = cuVar;
        cuVar.v();
    }

    cu() {
        this(new boolean[10], 0);
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f11256i) {
            throw new IndexOutOfBoundsException(o(i2));
        }
    }

    private final String o(int i2) {
        int i3 = this.f11256i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void w(int i2, boolean z) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f11256i)) {
            boolean[] zArr = this.f11255h;
            if (i3 < zArr.length) {
                System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
            } else {
                boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
                System.arraycopy(zArr, 0, zArr2, 0, i2);
                System.arraycopy(this.f11255h, i2, zArr2, i2 + 1, this.f11256i - i2);
                this.f11255h = zArr2;
            }
            this.f11255h[i2] = z;
            this.f11256i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i2));
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        w(i2, ((Boolean) obj).booleanValue());
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        zzdod.a(collection);
        if (!(collection instanceof cu)) {
            return super.addAll(collection);
        }
        cu cuVar = (cu) collection;
        int i2 = cuVar.f11256i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f11256i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            boolean[] zArr = this.f11255h;
            if (i4 > zArr.length) {
                this.f11255h = Arrays.copyOf(zArr, i4);
            }
            System.arraycopy(cuVar.f11255h, 0, this.f11255h, this.f11256i, cuVar.f11256i);
            this.f11256i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(boolean z) {
        w(this.f11256i, z);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu)) {
            return super.equals(obj);
        }
        cu cuVar = (cu) obj;
        if (this.f11256i != cuVar.f11256i) {
            return false;
        }
        boolean[] zArr = cuVar.f11255h;
        for (int i2 = 0; i2 < this.f11256i; i2++) {
            if (this.f11255h[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        f(i2);
        return Boolean.valueOf(this.f11255h[i2]);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f11256i; i3++) {
            i2 = (i2 * 31) + zzdod.h(this.f11255h[i3]);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj<Boolean> l(int i2) {
        if (i2 >= this.f11256i) {
            return new cu(Arrays.copyOf(this.f11255h, i2), this.f11256i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f11256i; i2++) {
            if (obj.equals(Boolean.valueOf(this.f11255h[i2]))) {
                boolean[] zArr = this.f11255h;
                System.arraycopy(zArr, i2 + 1, zArr, i2, (this.f11256i - i2) - 1);
                this.f11256i--;
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
            boolean[] zArr = this.f11255h;
            System.arraycopy(zArr, i3, zArr, i2, this.f11256i - i3);
            this.f11256i -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        f(i2);
        boolean[] zArr = this.f11255h;
        boolean z = zArr[i2];
        zArr[i2] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11256i;
    }

    private cu(boolean[] zArr, int i2) {
        this.f11255h = zArr;
        this.f11256i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        boolean[] zArr = this.f11255h;
        boolean z = zArr[i2];
        if (i2 < this.f11256i - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f11256i--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }
}
