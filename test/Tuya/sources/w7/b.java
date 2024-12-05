package w7;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import s7.d;

/* loaded from: classes5.dex */
public class b implements Key, PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient n7.b f39061a;

    public b(X6.b bVar) {
        a(bVar);
    }

    private void a(X6.b bVar) {
        this.f39061a = (n7.b) s7.c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            return E7.a.a(this.f39061a.a(), ((b) obj).f39061a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f39061a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return E7.a.k(this.f39061a.a());
    }
}
