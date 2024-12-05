package O;

import R.AbstractC1319p;
import R.S;
import R.v0;
import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public abstract class z extends v0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7689a;

    /* JADX INFO: Access modifiers changed from: protected */
    public z(byte[] bArr) {
        boolean z8;
        if (bArr.length == 25) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC1319p.a(z8);
        this.f7689a = Arrays.hashCode(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static byte[] l(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e8) {
            throw new AssertionError(e8);
        }
    }

    @Override // R.S
    public final int c() {
        return this.f7689a;
    }

    @Override // R.S
    public final Z.a d() {
        return Z.b.m0(m0());
    }

    public final boolean equals(Object obj) {
        Z.a d8;
        if (obj != null && (obj instanceof S)) {
            try {
                S s8 = (S) obj;
                if (s8.c() != this.f7689a || (d8 = s8.d()) == null) {
                    return false;
                }
                return Arrays.equals(m0(), (byte[]) Z.b.l(d8));
            } catch (RemoteException e8) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f7689a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract byte[] m0();
}
