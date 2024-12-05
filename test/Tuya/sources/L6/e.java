package L6;

import P6.C1282h;
import java.io.IOException;

/* loaded from: classes5.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    static final C1282h f6572a = C1282h.f("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f6573b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};

    /* renamed from: c, reason: collision with root package name */
    static final String[] f6574c = new String[64];

    /* renamed from: d, reason: collision with root package name */
    static final String[] f6575d = new String[256];

    static {
        int i8 = 0;
        int i9 = 0;
        while (true) {
            String[] strArr = f6575d;
            if (i9 >= strArr.length) {
                break;
            }
            strArr[i9] = G6.c.o("%8s", Integer.toBinaryString(i9)).replace(' ', '0');
            i9++;
        }
        String[] strArr2 = f6574c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i10 = iArr[0];
        strArr2[i10 | 8] = strArr2[i10] + "|PADDED";
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i11 = 0; i11 < 3; i11++) {
            int i12 = iArr2[i11];
            int i13 = iArr[0];
            String[] strArr3 = f6574c;
            int i14 = i13 | i12;
            strArr3[i14] = strArr3[i13] + '|' + strArr3[i12];
            strArr3[i14 | 8] = strArr3[i13] + '|' + strArr3[i12] + "|PADDED";
        }
        while (true) {
            String[] strArr4 = f6574c;
            if (i8 < strArr4.length) {
                if (strArr4[i8] == null) {
                    strArr4[i8] = f6575d[i8];
                }
                i8++;
            } else {
                return;
            }
        }
    }

    static String a(byte b8, byte b9) {
        String str;
        if (b9 == 0) {
            return "";
        }
        if (b8 != 2 && b8 != 3) {
            if (b8 != 4 && b8 != 6) {
                if (b8 != 7 && b8 != 8) {
                    String[] strArr = f6574c;
                    if (b9 < strArr.length) {
                        str = strArr[b9];
                    } else {
                        str = f6575d[b9];
                    }
                    if (b8 == 5 && (b9 & 4) != 0) {
                        return str.replace("HEADERS", "PUSH_PROMISE");
                    }
                    if (b8 == 0 && (b9 & 32) != 0) {
                        return str.replace("PRIORITY", "COMPRESSED");
                    }
                    return str;
                }
            } else {
                if (b9 == 1) {
                    return "ACK";
                }
                return f6575d[b9];
            }
        }
        return f6575d[b9];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String b(boolean z8, int i8, int i9, byte b8, byte b9) {
        String o8;
        String str;
        String[] strArr = f6573b;
        if (b8 < strArr.length) {
            o8 = strArr[b8];
        } else {
            o8 = G6.c.o("0x%02x", Byte.valueOf(b8));
        }
        String a8 = a(b8, b9);
        if (z8) {
            str = "<<";
        } else {
            str = ">>";
        }
        return G6.c.o("%s 0x%08x %5d %-13s %s", str, Integer.valueOf(i8), Integer.valueOf(i9), o8, a8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IllegalArgumentException c(String str, Object... objArr) {
        throw new IllegalArgumentException(G6.c.o(str, objArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static IOException d(String str, Object... objArr) {
        throw new IOException(G6.c.o(str, objArr));
    }
}
