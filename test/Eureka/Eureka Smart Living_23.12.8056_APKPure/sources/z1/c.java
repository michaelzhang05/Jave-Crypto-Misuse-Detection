package z1;

import android.util.Base64;

/* loaded from: classes.dex */
public abstract class c {
    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
