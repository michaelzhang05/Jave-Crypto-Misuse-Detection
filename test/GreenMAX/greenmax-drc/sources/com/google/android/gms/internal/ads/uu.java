package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class uu extends yt<Double> implements zzdoj<Double>, gw, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final uu f12238g;

    /* renamed from: h, reason: collision with root package name */
    private double[] f12239h;

    /* renamed from: i, reason: collision with root package name */
    private int f12240i;

    static {
        uu uuVar = new uu(new double[0], 0);
        f12238g = uuVar;
        uuVar.v();
    }

    uu() {
        this(new double[10], 0);
    }

    private final void f(int i2, double d2) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f12240i)) {
            double[] dArr = this.f12239h;
            if (i3 < dArr.length) {
                System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
            } else {
                double[] dArr2 = new double[((i3 * 3) / 2) + 1];
                System.arraycopy(dArr, 0, dArr2, 0, i2);
                System.arraycopy(this.f12239h, i2, dArr2, i2 + 1, this.f12240i - i2);
                this.f12239h = dArr2;
            }
            this.f12239h[i2] = d2;
            this.f12240i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(w(i2));
    }

    private final void o(int i2) {
        if (i2 < 0 || i2 >= this.f12240i) {
            throw new IndexOutOfBoundsException(w(i2));
        }
    }

    private final String w(int i2) {
        int i3 = this.f12240i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        f(i2, ((Double) obj).doubleValue());
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        zzdod.a(collection);
        if (!(collection instanceof uu)) {
            return super.addAll(collection);
        }
        uu uuVar = (uu) collection;
        int i2 = uuVar.f12240i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f12240i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            double[] dArr = this.f12239h;
            if (i4 > dArr.length) {
                this.f12239h = Arrays.copyOf(dArr, i4);
            }
            System.arraycopy(uuVar.f12239h, 0, this.f12239h, this.f12240i, uuVar.f12240i);
            this.f12240i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    public final void b(double d2) {
        f(this.f12240i, d2);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uu)) {
            return super.equals(obj);
        }
        uu uuVar = (uu) obj;
        if (this.f12240i != uuVar.f12240i) {
            return false;
        }
        double[] dArr = uuVar.f12239h;
        for (int i2 = 0; i2 < this.f12240i; i2++) {
            if (Double.doubleToLongBits(this.f12239h[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        o(i2);
        return Double.valueOf(this.f12239h[i2]);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f12240i; i3++) {
            i2 = (i2 * 31) + zzdod.i(Double.doubleToLongBits(this.f12239h[i3]));
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj<Double> l(int i2) {
        if (i2 >= this.f12240i) {
            return new uu(Arrays.copyOf(this.f12239h, i2), this.f12240i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f12240i; i2++) {
            if (obj.equals(Double.valueOf(this.f12239h[i2]))) {
                double[] dArr = this.f12239h;
                System.arraycopy(dArr, i2 + 1, dArr, i2, (this.f12240i - i2) - 1);
                this.f12240i--;
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
            double[] dArr = this.f12239h;
            System.arraycopy(dArr, i3, dArr, i2, this.f12240i - i3);
            this.f12240i -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        o(i2);
        double[] dArr = this.f12239h;
        double d2 = dArr[i2];
        dArr[i2] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12240i;
    }

    private uu(double[] dArr, int i2) {
        this.f12239h = dArr;
        this.f12240i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        o(i2);
        double[] dArr = this.f12239h;
        double d2 = dArr[i2];
        if (i2 < this.f12240i - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f12240i--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }
}
