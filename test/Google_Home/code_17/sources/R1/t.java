package R1;

import d7.C2761a;
import e7.C2807a;
import g7.C2888a;
import g7.C2890c;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class t {
    public static C2761a a(SecretKey secretKey, boolean z8) {
        C2761a c2761a = new C2761a();
        c2761a.a(z8, new C2890c(secretKey.getEncoded()));
        return c2761a;
    }

    private static C2807a b(SecretKey secretKey, boolean z8, byte[] bArr, byte[] bArr2) {
        C2807a c2807a = new C2807a(a(secretKey, z8));
        c2807a.i(z8, new C2888a(new C2890c(secretKey.getEncoded()), 128, bArr, bArr2));
        return c2807a;
    }

    public static byte[] c(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        C2807a b8 = b(secretKey, false, bArr, bArr3);
        int length = bArr2.length + bArr4.length;
        byte[] bArr5 = new byte[length];
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        System.arraycopy(bArr4, 0, bArr5, bArr2.length, bArr4.length);
        byte[] bArr6 = new byte[b8.h(length)];
        try {
            b8.b(bArr6, b8.m(bArr5, 0, length, bArr6, 0));
            return bArr6;
        } catch (b7.f e8) {
            throw new N1.f("Couldn't validate GCM authentication tag: " + e8.getMessage(), e8);
        }
    }

    public static f d(SecretKey secretKey, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C2807a b8 = b(secretKey, true, bArr, bArr3);
        byte[] bArr4 = new byte[b8.h(bArr2.length)];
        int m8 = b8.m(bArr2, 0, bArr2.length, bArr4, 0);
        try {
            int b9 = (m8 + b8.b(bArr4, m8)) - 16;
            byte[] bArr5 = new byte[b9];
            byte[] bArr6 = new byte[16];
            System.arraycopy(bArr4, 0, bArr5, 0, b9);
            System.arraycopy(bArr4, b9, bArr6, 0, 16);
            return new f(bArr5, bArr6);
        } catch (b7.f e8) {
            throw new N1.f("Couldn't generate GCM authentication tag: " + e8.getMessage(), e8);
        }
    }
}
