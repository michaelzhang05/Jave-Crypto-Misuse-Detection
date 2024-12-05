package u;

import java.util.Arrays;
import s.C3700b;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C3700b f38461a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f38462b;

    public h(C3700b c3700b, byte[] bArr) {
        if (c3700b != null) {
            if (bArr != null) {
                this.f38461a = c3700b;
                this.f38462b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f38462b;
    }

    public C3700b b() {
        return this.f38461a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f38461a.equals(hVar.f38461a)) {
            return false;
        }
        return Arrays.equals(this.f38462b, hVar.f38462b);
    }

    public int hashCode() {
        return ((this.f38461a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f38462b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f38461a + ", bytes=[...]}";
    }
}
