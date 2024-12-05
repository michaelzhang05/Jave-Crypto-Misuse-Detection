package A7;

import U6.AbstractC1464w;
import java.io.IOException;
import java.security.PrivateKey;
import r7.AbstractC3979c;
import r7.C3977a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3977a f640a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1464w f641b;

    public a(Z6.b bVar) {
        a(bVar);
    }

    private void a(Z6.b bVar) {
        this.f641b = bVar.l();
        this.f640a = (C3977a) v7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f640a.b() == aVar.f640a.b() && H7.a.a(this.f640a.a(), aVar.f640a.a())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC3979c.a(this.f640a.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return v7.b.a(this.f640a, this.f641b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f640a.b() + (H7.a.k(this.f640a.a()) * 37);
    }
}
