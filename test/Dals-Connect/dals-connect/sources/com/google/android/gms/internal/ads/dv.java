package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
final class dv extends yt<Float> implements zzdoj<Float>, gw, RandomAccess {

    /* renamed from: g, reason: collision with root package name */
    private static final dv f11324g;

    /* renamed from: h, reason: collision with root package name */
    private float[] f11325h;

    /* renamed from: i, reason: collision with root package name */
    private int f11326i;

    static {
        dv dvVar = new dv(new float[0], 0);
        f11324g = dvVar;
        dvVar.v();
    }

    dv() {
        this(new float[10], 0);
    }

    private final void b(int i2, float f2) {
        int i3;
        a();
        if (i2 >= 0 && i2 <= (i3 = this.f11326i)) {
            float[] fArr = this.f11325h;
            if (i3 < fArr.length) {
                System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
            } else {
                float[] fArr2 = new float[((i3 * 3) / 2) + 1];
                System.arraycopy(fArr, 0, fArr2, 0, i2);
                System.arraycopy(this.f11325h, i2, fArr2, i2 + 1, this.f11326i - i2);
                this.f11325h = fArr2;
            }
            this.f11325h[i2] = f2;
            this.f11326i++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(o(i2));
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f11326i) {
            throw new IndexOutOfBoundsException(o(i2));
        }
    }

    private final String o(int i2) {
        int i3 = this.f11326i;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        b(i2, ((Float) obj).floatValue());
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        zzdod.a(collection);
        if (!(collection instanceof dv)) {
            return super.addAll(collection);
        }
        dv dvVar = (dv) collection;
        int i2 = dvVar.f11326i;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f11326i;
        if (Integer.MAX_VALUE - i3 >= i2) {
            int i4 = i3 + i2;
            float[] fArr = this.f11325h;
            if (i4 > fArr.length) {
                this.f11325h = Arrays.copyOf(fArr, i4);
            }
            System.arraycopy(dvVar.f11325h, 0, this.f11325h, this.f11326i, dvVar.f11326i);
            this.f11326i = i4;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dv)) {
            return super.equals(obj);
        }
        dv dvVar = (dv) obj;
        if (this.f11326i != dvVar.f11326i) {
            return false;
        }
        float[] fArr = dvVar.f11325h;
        for (int i2 = 0; i2 < this.f11326i; i2++) {
            if (Float.floatToIntBits(this.f11325h[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        f(i2);
        return Float.valueOf(this.f11325h[i2]);
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f11326i; i3++) {
            i2 = (i2 * 31) + Float.floatToIntBits(this.f11325h[i3]);
        }
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzdoj
    public final /* synthetic */ zzdoj<Float> l(int i2) {
        if (i2 >= this.f11326i) {
            return new dv(Arrays.copyOf(this.f11325h, i2), this.f11326i);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.yt, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i2 = 0; i2 < this.f11326i; i2++) {
            if (obj.equals(Float.valueOf(this.f11325h[i2]))) {
                float[] fArr = this.f11325h;
                System.arraycopy(fArr, i2 + 1, fArr, i2, (this.f11326i - i2) - 1);
                this.f11326i--;
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
            float[] fArr = this.f11325h;
            System.arraycopy(fArr, i3, fArr, i2, this.f11326i - i3);
            this.f11326i -= i3 - i2;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        float floatValue = ((Float) obj).floatValue();
        a();
        f(i2);
        float[] fArr = this.f11325h;
        float f2 = fArr[i2];
        fArr[i2] = floatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f11326i;
    }

    public final void w(float f2) {
        b(this.f11326i, f2);
    }

    private dv(float[] fArr, int i2) {
        this.f11325h = fArr;
        this.f11326i = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        float[] fArr = this.f11325h;
        float f2 = fArr[i2];
        if (i2 < this.f11326i - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f11326i--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }
}
