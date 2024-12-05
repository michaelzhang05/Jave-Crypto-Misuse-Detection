package u3;

/* loaded from: classes.dex */
public abstract class k {
    public static byte[] a(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Expected a string of even length");
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i6 = 0; i6 < length; i6++) {
            int i7 = i6 * 2;
            int digit = Character.digit(str.charAt(i7), 16);
            int digit2 = Character.digit(str.charAt(i7 + 1), 16);
            if (digit == -1 || digit2 == -1) {
                throw new IllegalArgumentException("input is not hexadecimal");
            }
            bArr[i6] = (byte) ((digit * 16) + digit2);
        }
        return bArr;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b6 : bArr) {
            int i6 = b6 & 255;
            sb.append("0123456789abcdef".charAt(i6 / 16));
            sb.append("0123456789abcdef".charAt(i6 % 16));
        }
        return sb.toString();
    }
}
