package C7;

import U6.AbstractC1464w;
import U6.C1439a0;
import U6.C1456n;
import a7.C1677a;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import n7.e;
import n7.h;
import u7.C4070b;

/* loaded from: classes5.dex */
public class a implements PrivateKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient C1456n f1690a;

    /* renamed from: b, reason: collision with root package name */
    private transient C4070b f1691b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1464w f1692c;

    public a(Z6.b bVar) {
        a(bVar);
    }

    private void a(Z6.b bVar) {
        this.f1692c = bVar.l();
        this.f1690a = h.l(bVar.n().n()).m().l();
        this.f1691b = (C4070b) v7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1690a.o(aVar.f1690a) && H7.a.a(this.f1691b.b(), aVar.f1691b.b())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        Z6.b bVar;
        try {
            if (this.f1691b.a() != null) {
                bVar = v7.b.a(this.f1691b, this.f1692c);
            } else {
                bVar = new Z6.b(new C1677a(e.f35687r, new h(new C1677a(this.f1690a))), new C1439a0(this.f1691b.b()), this.f1692c);
            }
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f1690a.hashCode() + (H7.a.k(this.f1691b.b()) * 37);
    }
}
