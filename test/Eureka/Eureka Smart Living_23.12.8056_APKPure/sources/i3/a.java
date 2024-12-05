package i3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;

/* loaded from: classes.dex */
abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f6982a = e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    static void a(int[] iArr, int i6, int i7, int i8, int i9) {
        int i10 = iArr[i6] + iArr[i7];
        iArr[i6] = i10;
        int b6 = b(i10 ^ iArr[i9], 16);
        iArr[i9] = b6;
        int i11 = iArr[i8] + b6;
        iArr[i8] = i11;
        int b7 = b(iArr[i7] ^ i11, 12);
        iArr[i7] = b7;
        int i12 = iArr[i6] + b7;
        iArr[i6] = i12;
        int b8 = b(iArr[i9] ^ i12, 8);
        iArr[i9] = b8;
        int i13 = iArr[i8] + b8;
        iArr[i8] = i13;
        iArr[i7] = b(iArr[i7] ^ i13, 7);
    }

    private static int b(int i6, int i7) {
        return (i6 >>> (-i7)) | (i6 << i7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(int[] iArr, int[] iArr2) {
        int[] iArr3 = f6982a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(int[] iArr) {
        for (int i6 = 0; i6 < 10; i6++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int[] e(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }
}
