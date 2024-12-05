package com.google.zxing.j;

import com.google.zxing.WriterException;
import com.google.zxing.c;
import com.google.zxing.e;
import com.google.zxing.g.b;
import com.google.zxing.j.b.d;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: PDF417Writer.java */
/* loaded from: classes2.dex */
public final class a implements e {
    private static b b(byte[][] bArr, int i2) {
        int i3 = i2 * 2;
        b bVar = new b(bArr[0].length + i3, bArr.length + i3);
        bVar.c();
        int g2 = (bVar.g() - i2) - 1;
        int i4 = 0;
        while (i4 < bArr.length) {
            byte[] bArr2 = bArr[i4];
            for (int i5 = 0; i5 < bArr[0].length; i5++) {
                if (bArr2[i5] == 1) {
                    bVar.i(i5 + i2, g2);
                }
            }
            i4++;
            g2--;
        }
        return bVar;
    }

    private static b c(com.google.zxing.j.b.e eVar, String str, int i2, int i3, int i4, int i5) throws WriterException {
        boolean z;
        eVar.e(str, i2);
        byte[][] b2 = eVar.f().b(1, 4);
        if ((i4 > i3) != (b2[0].length < b2.length)) {
            b2 = d(b2);
            z = true;
        } else {
            z = false;
        }
        int length = i3 / b2[0].length;
        int length2 = i4 / b2.length;
        if (length >= length2) {
            length = length2;
        }
        if (length > 1) {
            byte[][] b3 = eVar.f().b(length, length << 2);
            if (z) {
                b3 = d(b3);
            }
            return b(b3, i5);
        }
        return b(b2, i5);
    }

    private static byte[][] d(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance((Class<?>) byte.class, bArr[0].length, bArr.length);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            int length = (bArr.length - i2) - 1;
            for (int i3 = 0; i3 < bArr[0].length; i3++) {
                bArr2[i3][length] = bArr[i2][i3];
            }
        }
        return bArr2;
    }

    @Override // com.google.zxing.e
    public b a(String str, com.google.zxing.a aVar, int i2, int i3, Map<c, ?> map) throws WriterException {
        int i4;
        int i5;
        if (aVar == com.google.zxing.a.PDF_417) {
            com.google.zxing.j.b.e eVar = new com.google.zxing.j.b.e();
            if (map != null) {
                c cVar = c.PDF417_COMPACT;
                if (map.containsKey(cVar)) {
                    eVar.h(Boolean.valueOf(map.get(cVar).toString()).booleanValue());
                }
                c cVar2 = c.PDF417_COMPACTION;
                if (map.containsKey(cVar2)) {
                    eVar.i(com.google.zxing.j.b.c.valueOf(map.get(cVar2).toString()));
                }
                c cVar3 = c.PDF417_DIMENSIONS;
                if (map.containsKey(cVar3)) {
                    d dVar = (d) map.get(cVar3);
                    eVar.j(dVar.a(), dVar.c(), dVar.b(), dVar.d());
                }
                c cVar4 = c.MARGIN;
                int parseInt = map.containsKey(cVar4) ? Integer.parseInt(map.get(cVar4).toString()) : 30;
                c cVar5 = c.ERROR_CORRECTION;
                int parseInt2 = map.containsKey(cVar5) ? Integer.parseInt(map.get(cVar5).toString()) : 2;
                c cVar6 = c.CHARACTER_SET;
                if (map.containsKey(cVar6)) {
                    eVar.k(Charset.forName(map.get(cVar6).toString()));
                }
                i5 = parseInt;
                i4 = parseInt2;
            } else {
                i4 = 2;
                i5 = 30;
            }
            return c(eVar, str, i4, i2, i3, i5);
        }
        throw new IllegalArgumentException("Can only encode PDF_417, but got ".concat(String.valueOf(aVar)));
    }
}
