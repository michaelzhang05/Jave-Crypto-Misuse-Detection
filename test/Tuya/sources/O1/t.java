package O1;

import a7.C1581a;
import b7.C1886a;
import d7.C2564a;
import d7.C2566c;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class t {
    public static C1581a a(SecretKey secretKey, boolean z8) {
        C1581a c1581a = new C1581a();
        c1581a.a(z8, new C2566c(secretKey.getEncoded()));
        return c1581a;
    }

    private static C1886a b(SecretKey secretKey, boolean z8, byte[] bArr, byte[] bArr2) {
        C1886a c1886a = new C1886a(a(secretKey, z8));
        c1886a.i(z8, new C2564a(new C2566c(secretKey.getEncoded()), 128, bArr, bArr2));
        return c1886a;
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C1886a b8 = b(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[b8.h(length)];
        try {
            b8.b(bArr6, b8.m(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (Y6.f e8) {
            throw new K1.f("Couldn't validate GCM authentication tag: " + e8.getMessage(), e8);
        }
    }

    public static f d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C1886a b8 = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[b8.h(bArr2.length)];
        int m8 = b8.m(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int b9 = (m8 + b8.b(bArr4, m8)) - 16;
            byte[] bArr5 = new byte[b9];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, b9);
            System.arraycopy(bArr4, b9, bArr6, 0, 16);
            return new f(bArr5, bArr6);
        } catch (Y6.f e8) {
            throw new K1.f("Couldn't generate GCM authentication tag: " + e8.getMessage(), e8);
        }
    }
}
