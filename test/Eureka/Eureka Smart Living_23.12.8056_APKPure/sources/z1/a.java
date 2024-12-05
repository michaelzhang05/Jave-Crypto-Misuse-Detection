package z1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public abstract class a {
    public static byte[] a(Context context, String str) {
        MessageDigest b6;
        PackageInfo d6 = b2.d.a(context).d(str, 64);
        Signature[] signatureArr = d6.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b6 = b("SHA1")) == null) {
            return null;
        }
        return b6.digest(d6.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i6 = 0; i6 < 2; i6++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
