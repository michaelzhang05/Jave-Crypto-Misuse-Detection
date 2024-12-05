package P6;

import P6.C1282h;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: P6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1275a {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f8028a;

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8029b;

    static {
        C1282h.a aVar = C1282h.f8066d;
        f8028a = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").j();
        f8029b = aVar.c("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").j();
    }

    public static final byte[] a(String str) {
        int i8;
        char charAt;
        AbstractC3159y.i(str, "<this>");
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i9 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i9];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            char charAt2 = str.charAt(i13);
            if ('A' <= charAt2 && charAt2 < '[') {
                i8 = charAt2 - 'A';
            } else if ('a' <= charAt2 && charAt2 < '{') {
                i8 = charAt2 - 'G';
            } else if ('0' <= charAt2 && charAt2 < ':') {
                i8 = charAt2 + 4;
            } else if (charAt2 != '+' && charAt2 != '-') {
                if (charAt2 != '/' && charAt2 != '_') {
                    if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                        return null;
                    }
                } else {
                    i8 = 63;
                }
            } else {
                i8 = 62;
            }
            i11 = (i11 << 6) | i8;
            i10++;
            if (i10 % 4 == 0) {
                bArr[i12] = (byte) (i11 >> 16);
                int i14 = i12 + 2;
                bArr[i12 + 1] = (byte) (i11 >> 8);
                i12 += 3;
                bArr[i14] = (byte) i11;
            }
        }
        int i15 = i10 % 4;
        if (i15 == 1) {
            return null;
        }
        if (i15 != 2) {
            if (i15 == 3) {
                int i16 = i11 << 6;
                int i17 = i12 + 1;
                bArr[i12] = (byte) (i16 >> 16);
                i12 += 2;
                bArr[i17] = (byte) (i16 >> 8);
            }
        } else {
            bArr[i12] = (byte) ((i11 << 12) >> 16);
            i12++;
        }
        if (i12 == i9) {
            return bArr;
        }
        byte[] copyOf = Arrays.copyOf(bArr, i12);
        AbstractC3159y.h(copyOf, "copyOf(this, newSize)");
        return copyOf;
    }

    public static final String b(byte[] bArr, byte[] map) {
        AbstractC3159y.i(bArr, "<this>");
        AbstractC3159y.i(map, "map");
        byte[] bArr2 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            byte b8 = bArr[i8];
            int i10 = i8 + 2;
            byte b9 = bArr[i8 + 1];
            i8 += 3;
            byte b10 = bArr[i10];
            bArr2[i9] = map[(b8 & 255) >> 2];
            bArr2[i9 + 1] = map[((b8 & 3) << 4) | ((b9 & 255) >> 4)];
            int i11 = i9 + 3;
            bArr2[i9 + 2] = map[((b9 & 15) << 2) | ((b10 & 255) >> 6)];
            i9 += 4;
            bArr2[i11] = map[b10 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 != 1) {
            if (length2 == 2) {
                int i12 = i8 + 1;
                byte b11 = bArr[i8];
                byte b12 = bArr[i12];
                bArr2[i9] = map[(b11 & 255) >> 2];
                bArr2[i9 + 1] = map[((b11 & 3) << 4) | ((b12 & 255) >> 4)];
                bArr2[i9 + 2] = map[(b12 & 15) << 2];
                bArr2[i9 + 3] = 61;
            }
        } else {
            byte b13 = bArr[i8];
            bArr2[i9] = map[(b13 & 255) >> 2];
            bArr2[i9 + 1] = map[(b13 & 3) << 4];
            bArr2[i9 + 2] = 61;
            bArr2[i9 + 3] = 61;
        }
        return c0.c(bArr2);
    }

    public static /* synthetic */ String c(byte[] bArr, byte[] bArr2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            bArr2 = f8028a;
        }
        return b(bArr, bArr2);
    }
}
