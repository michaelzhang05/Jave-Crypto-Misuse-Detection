package com.mbridge.msdk.foundation.tools;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f19978a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f19979b = new byte[128];

    /* renamed from: c, reason: collision with root package name */
    private static Map<Character, Character> f19980c;

    /* renamed from: d, reason: collision with root package name */
    private static char[] f19981d;

    static {
        char[] cArr = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        f19978a = cArr;
        HashMap hashMap = new HashMap();
        f19980c = hashMap;
        hashMap.put('A', 'v');
        f19980c.put('B', 'S');
        f19980c.put('C', 'o');
        f19980c.put('D', 'a');
        f19980c.put('E', 'j');
        f19980c.put('F', 'c');
        f19980c.put('G', '7');
        f19980c.put('H', 'd');
        f19980c.put('I', 'R');
        f19980c.put('J', 'z');
        f19980c.put('K', 'p');
        f19980c.put('L', 'W');
        f19980c.put('M', 'i');
        f19980c.put('N', 'f');
        f19980c.put('O', 'G');
        f19980c.put('P', 'y');
        f19980c.put('Q', 'N');
        f19980c.put('R', 'x');
        f19980c.put('S', 'Z');
        f19980c.put('T', 'n');
        f19980c.put('U', 'V');
        f19980c.put('V', '5');
        f19980c.put('W', 'k');
        f19980c.put('X', '+');
        f19980c.put('Y', 'D');
        f19980c.put('Z', 'H');
        f19980c.put('a', 'L');
        f19980c.put('b', 'Y');
        f19980c.put('c', 'h');
        f19980c.put('d', 'J');
        f19980c.put('e', '4');
        f19980c.put('f', '6');
        f19980c.put('g', 'l');
        f19980c.put('h', 't');
        f19980c.put('i', '0');
        f19980c.put('j', 'U');
        f19980c.put('k', '3');
        f19980c.put('l', 'Q');
        f19980c.put('m', 'r');
        f19980c.put('n', 'g');
        f19980c.put('o', 'E');
        f19980c.put('p', 'u');
        f19980c.put('q', 'q');
        f19980c.put('r', '8');
        f19980c.put('s', 's');
        f19980c.put('t', 'w');
        f19980c.put('u', '/');
        f19980c.put('v', 'X');
        f19980c.put('w', 'M');
        f19980c.put('x', 'e');
        f19980c.put('y', 'B');
        f19980c.put('z', 'A');
        f19980c.put('0', 'T');
        f19980c.put('1', '2');
        f19980c.put('2', 'F');
        f19980c.put('3', 'b');
        f19980c.put('4', '9');
        f19980c.put('5', 'P');
        f19980c.put('6', '1');
        f19980c.put('7', 'O');
        f19980c.put('8', 'I');
        f19980c.put('9', 'K');
        f19980c.put('+', 'm');
        f19980c.put('/', 'C');
        f19981d = new char[cArr.length];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            char[] cArr2 = f19978a;
            if (i9 >= cArr2.length) {
                break;
            }
            f19981d[i9] = f19980c.get(Character.valueOf(cArr2[i9])).charValue();
            i9++;
        }
        int i10 = 0;
        while (true) {
            byte[] bArr = f19979b;
            if (i10 >= bArr.length) {
                break;
            }
            bArr[i10] = Byte.MAX_VALUE;
            i10++;
        }
        while (true) {
            char[] cArr3 = f19981d;
            if (i8 < cArr3.length) {
                f19979b[cArr3[i8]] = (byte) i8;
                i8++;
            } else {
                return;
            }
        }
    }

    private static int a(char[] cArr, byte[] bArr, int i8) {
        try {
            char c8 = cArr[3];
            char c9 = c8 == '=' ? (char) 2 : (char) 3;
            char c10 = cArr[2];
            if (c10 == '=') {
                c9 = 1;
            }
            byte[] bArr2 = f19979b;
            byte b8 = bArr2[cArr[0]];
            byte b9 = bArr2[cArr[1]];
            byte b10 = bArr2[c10];
            byte b11 = bArr2[c8];
            if (c9 == 1) {
                bArr[i8] = (byte) (((b9 >> 4) & 3) | ((b8 << 2) & 252));
                return 1;
            }
            if (c9 == 2) {
                bArr[i8] = (byte) ((3 & (b9 >> 4)) | ((b8 << 2) & 252));
                bArr[i8 + 1] = (byte) (((b9 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b10 >> 2) & 15));
                return 2;
            }
            if (c9 == 3) {
                bArr[i8] = (byte) (((b8 << 2) & 252) | ((b9 >> 4) & 3));
                bArr[i8 + 1] = (byte) (((b9 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((b10 >> 2) & 15));
                bArr[i8 + 2] = (byte) (((b10 << 6) & PsExtractor.AUDIO_STREAM) | (b11 & 63));
                return 3;
            }
            throw new RuntimeException("Internal Error");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String b(String str) {
        byte[] bytes = str.getBytes();
        return a(bytes, 0, bytes.length);
    }

    private static byte[] c(String str) {
        int i8;
        try {
            int length = str.length();
            int i9 = 259;
            if (length < 259) {
                i9 = length;
            }
            char[] cArr = new char[i9];
            int i10 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i10];
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (i11 < length) {
                int i14 = i11 + 256;
                if (i14 <= length) {
                    str.getChars(i11, i14, cArr, i13);
                    i8 = i13 + 256;
                } else {
                    str.getChars(i11, length, cArr, i13);
                    i8 = (length - i11) + i13;
                }
                int i15 = i13;
                while (i13 < i8) {
                    char c8 = cArr[i13];
                    if (c8 != '=') {
                        byte[] bArr2 = f19979b;
                        if (c8 < bArr2.length) {
                            if (bArr2[c8] == Byte.MAX_VALUE) {
                            }
                        }
                        i13++;
                    }
                    int i16 = i15 + 1;
                    cArr[i15] = c8;
                    if (i16 == 4) {
                        i12 += a(cArr, bArr, i12);
                        i15 = 0;
                    } else {
                        i15 = i16;
                    }
                    i13++;
                }
                i11 = i14;
                i13 = i15;
            }
            if (i12 == i10) {
                return bArr;
            }
            byte[] bArr3 = new byte[i12];
            System.arraycopy(bArr, 0, bArr3, 0, i12);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String a(String str) {
        byte[] c8 = c(str);
        if (c8 == null || c8.length <= 0) {
            return null;
        }
        return new String(c8);
    }

    private static String a(byte[] bArr, int i8, int i9) {
        if (i9 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i9 / 3) << 2) + 4];
            int i10 = 0;
            while (i9 >= 3) {
                int i11 = ((bArr[i8] & 255) << 16) + ((bArr[i8 + 1] & 255) << 8) + (bArr[i8 + 2] & 255);
                char[] cArr2 = f19981d;
                cArr[i10] = cArr2[i11 >> 18];
                cArr[i10 + 1] = cArr2[(i11 >> 12) & 63];
                int i12 = i10 + 3;
                cArr[i10 + 2] = cArr2[(i11 >> 6) & 63];
                i10 += 4;
                cArr[i12] = cArr2[i11 & 63];
                i8 += 3;
                i9 -= 3;
            }
            if (i9 == 1) {
                int i13 = bArr[i8] & 255;
                char[] cArr3 = f19981d;
                cArr[i10] = cArr3[i13 >> 2];
                cArr[i10 + 1] = cArr3[(i13 << 4) & 63];
                int i14 = i10 + 3;
                cArr[i10 + 2] = '=';
                i10 += 4;
                cArr[i14] = '=';
            } else if (i9 == 2) {
                int i15 = ((bArr[i8] & 255) << 8) + (bArr[i8 + 1] & 255);
                char[] cArr4 = f19981d;
                cArr[i10] = cArr4[i15 >> 10];
                cArr[i10 + 1] = cArr4[(i15 >> 4) & 63];
                int i16 = i10 + 3;
                cArr[i10 + 2] = cArr4[(i15 << 2) & 63];
                i10 += 4;
                cArr[i16] = '=';
            }
            return new String(cArr, 0, i10);
        } catch (Exception unused) {
            return null;
        }
    }
}
