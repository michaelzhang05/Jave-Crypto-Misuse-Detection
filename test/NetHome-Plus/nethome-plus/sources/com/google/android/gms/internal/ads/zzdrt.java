package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzdrt implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final wx f14896f = new wx();

    /* renamed from: g, reason: collision with root package name */
    private boolean f14897g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f14898h;

    /* renamed from: i, reason: collision with root package name */
    private wx[] f14899i;

    /* renamed from: j, reason: collision with root package name */
    private int f14900j;

    zzdrt() {
        this(10);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.f14900j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final wx c(int i2) {
        return this.f14899i[i2];
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i2 = this.f14900j;
        zzdrt zzdrtVar = new zzdrt(i2);
        System.arraycopy(this.f14898h, 0, zzdrtVar.f14898h, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            wx[] wxVarArr = this.f14899i;
            if (wxVarArr[i3] != null) {
                zzdrtVar.f14899i[i3] = (wx) wxVarArr[i3].clone();
            }
        }
        zzdrtVar.f14900j = i2;
        return zzdrtVar;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzdrt)) {
            return false;
        }
        zzdrt zzdrtVar = (zzdrt) obj;
        int i2 = this.f14900j;
        if (i2 != zzdrtVar.f14900j) {
            return false;
        }
        int[] iArr = this.f14898h;
        int[] iArr2 = zzdrtVar.f14898h;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                z = true;
                break;
            }
            if (iArr[i3] != iArr2[i3]) {
                z = false;
                break;
            }
            i3++;
        }
        if (z) {
            wx[] wxVarArr = this.f14899i;
            wx[] wxVarArr2 = zzdrtVar.f14899i;
            int i4 = this.f14900j;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                }
                if (!wxVarArr[i5].equals(wxVarArr2[i5])) {
                    z2 = false;
                    break;
                }
                i5++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i2 = 17;
        for (int i3 = 0; i3 < this.f14900j; i3++) {
            i2 = (((i2 * 31) + this.f14898h[i3]) * 31) + this.f14899i[i3].hashCode();
        }
        return i2;
    }

    private zzdrt(int i2) {
        this.f14897g = false;
        int i3 = i2 << 2;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 4;
        this.f14898h = new int[i6];
        this.f14899i = new wx[i6];
        this.f14900j = 0;
    }
}
