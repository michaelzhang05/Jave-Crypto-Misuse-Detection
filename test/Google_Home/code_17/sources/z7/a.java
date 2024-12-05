package z7;

import U6.AbstractC1464w;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import q7.C3883a;

/* loaded from: classes5.dex */
public class a implements Key, PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3883a f41182a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1464w f41183b;

    public a(Z6.b bVar) {
        a(bVar);
    }

    private void a(Z6.b bVar) {
        this.f41183b = bVar.l();
        this.f41182a = (C3883a) v7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return H7.a.c(this.f41182a.a(), ((a) obj).f41182a.a());
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return v7.b.a(this.f41182a, this.f41183b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return H7.a.o(this.f41182a.a());
    }
}
