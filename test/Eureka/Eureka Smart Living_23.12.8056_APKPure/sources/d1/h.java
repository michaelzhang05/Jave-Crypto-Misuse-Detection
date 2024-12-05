package d1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final b1.b f6449a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f6450b;

    public h(b1.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f6449a = bVar;
        this.f6450b = bArr;
    }

    public byte[] a() {
        return this.f6450b;
    }

    public b1.b b() {
        return this.f6449a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f6449a.equals(hVar.f6449a)) {
            return Arrays.equals(this.f6450b, hVar.f6450b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6449a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6450b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f6449a + ", bytes=[...]}";
    }
}
