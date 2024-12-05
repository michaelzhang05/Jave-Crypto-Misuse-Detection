package kotlin.reflect.x.internal.l0.e.a0.b;

import kotlin.jvm.internal.l;

/* compiled from: utfEncoding.kt */
/* loaded from: classes2.dex */
public final class j {
    public static final byte[] a(String[] strArr) {
        l.f(strArr, "strings");
        int i2 = 0;
        for (String str : strArr) {
            i2 += str.length();
        }
        byte[] bArr = new byte[i2];
        int i3 = 0;
        for (String str2 : strArr) {
            int length = str2.length();
            int i4 = 0;
            while (i4 < length) {
                bArr[i3] = (byte) str2.charAt(i4);
                i4++;
                i3++;
            }
        }
        return bArr;
    }
}
