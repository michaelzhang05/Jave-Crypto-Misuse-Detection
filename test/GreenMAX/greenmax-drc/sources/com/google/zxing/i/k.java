package com.google.zxing.i;

import com.google.zxing.FormatException;
import com.google.zxing.WriterException;
import java.util.Map;

/* compiled from: EAN8Writer.java */
/* loaded from: classes2.dex */
public final class k extends q {
    @Override // com.google.zxing.i.n, com.google.zxing.e
    public com.google.zxing.g.b a(String str, com.google.zxing.a aVar, int i2, int i3, Map<com.google.zxing.c, ?> map) throws WriterException {
        if (aVar == com.google.zxing.a.EAN_8) {
            return super.a(str, aVar, i2, i3, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.i.n
    public boolean[] c(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + p.b(str);
            } catch (FormatException e2) {
                throw new IllegalArgumentException(e2);
            }
        } else if (length == 8) {
            try {
                if (!p.a(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        } else {
            throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[67];
        int b2 = n.b(zArr, 0, p.a, true) + 0;
        for (int i2 = 0; i2 <= 3; i2++) {
            b2 += n.b(zArr, b2, p.f17088d[Character.digit(str.charAt(i2), 10)], false);
        }
        int b3 = b2 + n.b(zArr, b2, p.f17086b, false);
        for (int i3 = 4; i3 <= 7; i3++) {
            b3 += n.b(zArr, b3, p.f17088d[Character.digit(str.charAt(i3), 10)], true);
        }
        n.b(zArr, b3, p.a, true);
        return zArr;
    }
}
