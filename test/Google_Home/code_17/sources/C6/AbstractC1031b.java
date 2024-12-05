package C6;

/* renamed from: C6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1031b {
    public static final byte a(char c8) {
        if (c8 < '~') {
            return C1036g.f1678c[c8];
        }
        return (byte) 0;
    }

    public static final char b(int i8) {
        if (i8 < 117) {
            return C1036g.f1677b[i8];
        }
        return (char) 0;
    }

    public static final String c(byte b8) {
        if (b8 == 1) {
            return "quotation mark '\"'";
        }
        if (b8 == 2) {
            return "string escape sequence '\\'";
        }
        if (b8 == 4) {
            return "comma ','";
        }
        if (b8 == 5) {
            return "colon ':'";
        }
        if (b8 == 6) {
            return "start of the object '{'";
        }
        if (b8 == 7) {
            return "end of the object '}'";
        }
        if (b8 == 8) {
            return "start of the array '['";
        }
        if (b8 == 9) {
            return "end of the array ']'";
        }
        if (b8 == 10) {
            return "end of the input";
        }
        if (b8 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }
}
