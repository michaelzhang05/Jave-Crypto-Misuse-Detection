package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
public final class zzye implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    private static final m3 f16179f = new m3();

    /* renamed from: g, reason: collision with root package name */
    private boolean f16180g;

    /* renamed from: h, reason: collision with root package name */
    private int[] f16181h;

    /* renamed from: i, reason: collision with root package name */
    private m3[] f16182i;

    /* renamed from: j, reason: collision with root package name */
    private int f16183j;

    zzye() {
        this(10);
    }

    private static int b(int i2) {
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
        return i3 / 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return this.f16183j;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        int i2 = this.f16183j;
        zzye zzyeVar = new zzye(i2);
        System.arraycopy(this.f16181h, 0, zzyeVar.f16181h, 0, i2);
        for (int i3 = 0; i3 < i2; i3++) {
            m3[] m3VarArr = this.f16182i;
            if (m3VarArr[i3] != null) {
                zzyeVar.f16182i[i3] = (m3) m3VarArr[i3].clone();
            }
        }
        zzyeVar.f16183j = i2;
        return zzyeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final m3 d(int i2) {
        return this.f16182i[i2];
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzye)) {
            return false;
        }
        zzye zzyeVar = (zzye) obj;
        int i2 = this.f16183j;
        if (i2 != zzyeVar.f16183j) {
            return false;
        }
        int[] iArr = this.f16181h;
        int[] iArr2 = zzyeVar.f16181h;
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
            m3[] m3VarArr = this.f16182i;
            m3[] m3VarArr2 = zzyeVar.f16182i;
            int i4 = this.f16183j;
            int i5 = 0;
            while (true) {
                if (i5 >= i4) {
                    z2 = true;
                    break;
                }
                if (!m3VarArr[i5].equals(m3VarArr2[i5])) {
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
        for (int i3 = 0; i3 < this.f16183j; i3++) {
            i2 = (((i2 * 31) + this.f16181h[i3]) * 31) + this.f16182i[i3].hashCode();
        }
        return i2;
    }

    private zzye(int i2) {
        this.f16180g = false;
        int b2 = b(i2);
        this.f16181h = new int[b2];
        this.f16182i = new m3[b2];
        this.f16183j = 0;
    }
}
