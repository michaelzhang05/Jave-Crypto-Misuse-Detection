package s1;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import v1.k1;
import v1.l1;

/* loaded from: classes.dex */
abstract class t extends k1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f9235a;

    /* JADX INFO: Access modifiers changed from: protected */
    public t(byte[] bArr) {
        v1.n.a(bArr.length == 25);
        this.f9235a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    abstract byte[] c();

    public final boolean equals(Object obj) {
        c2.a k6;
        if (obj != null && (obj instanceof l1)) {
            try {
                l1 l1Var = (l1) obj;
                if (l1Var.v() == this.f9235a && (k6 = l1Var.k()) != null) {
                    return Arrays.equals(c(), (byte[]) c2.b.b(k6));
                }
                return false;
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f9235a;
    }

    @Override // v1.l1
    public final c2.a k() {
        return c2.b.c(c());
    }

    @Override // v1.l1
    public final int v() {
        return this.f9235a;
    }
}
