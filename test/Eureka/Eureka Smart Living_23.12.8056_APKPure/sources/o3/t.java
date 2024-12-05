package o3;

import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8275a = Charset.forName("UTF-8");

    public static Integer a() {
        if (b()) {
            return a.a();
        }
        return null;
    }

    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }

    public static int c() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i6 = 0;
        while (i6 == 0) {
            secureRandom.nextBytes(bArr);
            i6 = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i6;
    }

    private static final byte d(char c6) {
        if (c6 >= '!' && c6 <= '~') {
            return (byte) c6;
        }
        throw new s("Not a printable ASCII character: " + c6);
    }

    public static final v3.a e(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i6 = 0; i6 < str.length(); i6++) {
            bArr[i6] = d(str.charAt(i6));
        }
        return v3.a.a(bArr);
    }
}
