package x7;

import U6.AbstractC1464w;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import o7.AbstractC3723g;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient AbstractC3723g f40760a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1464w f40761b;

    public a(Z6.b bVar) {
        a(bVar);
    }

    private void a(Z6.b bVar) {
        this.f40761b = bVar.l();
        this.f40760a = (AbstractC3723g) v7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            try {
                return H7.a.a(this.f40760a.getEncoded(), ((a) obj).f40760a.getEncoded());
            } catch (IOException unused) {
                throw new IllegalStateException("unable to perform equals");
            }
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "LMS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return v7.b.a(this.f40760a, this.f40761b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        try {
            return H7.a.k(this.f40760a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
