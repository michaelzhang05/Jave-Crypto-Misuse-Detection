package u;

import java.util.Arrays;
import s.C3982c;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final C3982c f39889a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f39890b;

    public h(C3982c c3982c, byte[] bArr) {
        if (c3982c != null) {
            if (bArr != null) {
                this.f39889a = c3982c;
                this.f39890b = bArr;
                return;
            }
            throw new NullPointerException("bytes is null");
        }
        throw new NullPointerException("encoding is null");
    }

    public byte[] a() {
        return this.f39890b;
    }

    public C3982c b() {
        return this.f39889a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f39889a.equals(hVar.f39889a)) {
            return false;
        }
        return Arrays.equals(this.f39890b, hVar.f39890b);
    }

    public int hashCode() {
        return ((this.f39889a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f39890b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f39889a + ", bytes=[...]}";
    }
}
