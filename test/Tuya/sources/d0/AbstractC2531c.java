package d0;

import android.util.Base64;
import java.security.SecureRandom;

/* renamed from: d0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2531c {

    /* renamed from: a, reason: collision with root package name */
    private static final SecureRandom f30093a = new SecureRandom();

    public static String a() {
        byte[] bArr = new byte[16];
        f30093a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
