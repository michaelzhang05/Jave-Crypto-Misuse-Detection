package v3;

import java.util.Arrays;
import u3.k;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9664a;

    private a(byte[] bArr, int i6, int i7) {
        byte[] bArr2 = new byte[i7];
        this.f9664a = bArr2;
        System.arraycopy(bArr, i6, bArr2, 0, i7);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public static a b(byte[] bArr, int i6, int i7) {
        if (bArr != null) {
            return new a(bArr, i6, i7);
        }
        throw new NullPointerException("data must be non-null");
    }

    public int c() {
        return this.f9664a.length;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f9664a, this.f9664a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f9664a);
    }

    public String toString() {
        return "Bytes(" + k.b(this.f9664a) + ")";
    }
}
