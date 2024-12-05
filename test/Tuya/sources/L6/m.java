package L6;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private int f6705a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f6706b = new int[10];

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f6705a = 0;
        Arrays.fill(this.f6706b, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(int i8) {
        return this.f6706b[i8];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        if ((this.f6705a & 2) != 0) {
            return this.f6706b[1];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int d() {
        if ((this.f6705a & 128) != 0) {
            return this.f6706b[7];
        }
        return 65535;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int e(int i8) {
        if ((this.f6705a & 16) != 0) {
            return this.f6706b[4];
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int f(int i8) {
        if ((this.f6705a & 32) != 0) {
            return this.f6706b[5];
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(int i8) {
        if (((1 << i8) & this.f6705a) != 0) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(m mVar) {
        for (int i8 = 0; i8 < 10; i8++) {
            if (mVar.g(i8)) {
                i(i8, mVar.b(i8));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m i(int i8, int i9) {
        if (i8 >= 0) {
            int[] iArr = this.f6706b;
            if (i8 < iArr.length) {
                this.f6705a = (1 << i8) | this.f6705a;
                iArr[i8] = i9;
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return Integer.bitCount(this.f6705a);
    }
}
