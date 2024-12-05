package z1;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f9932a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f9933b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr, boolean z5) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (int i6 = 0; i6 < length && (!z5 || i6 != length - 1 || (bArr[i6] & 255) != 0); i6++) {
            char[] cArr = f9932a;
            sb.append(cArr[(bArr[i6] & 240) >>> 4]);
            sb.append(cArr[bArr[i6] & 15]);
        }
        return sb.toString();
    }
}
