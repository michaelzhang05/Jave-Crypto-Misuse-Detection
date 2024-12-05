package E7;

import U6.AbstractC1464w;
import U6.C1456n;
import java.io.IOException;
import java.security.PrivateKey;
import n7.j;
import w7.s;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C1456n f2662a;

    /* renamed from: b, reason: collision with root package name */
    private transient s f2663b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1464w f2664c;

    public a(Z6.b bVar) {
        a(bVar);
    }

    private void a(Z6.b bVar) {
        this.f2664c = bVar.l();
        this.f2662a = j.m(bVar.n().n()).o().l();
        this.f2663b = (s) v7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f2662a.o(aVar.f2662a) && H7.a.a(this.f2663b.c(), aVar.f2663b.c())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return v7.b.a(this.f2663b, this.f2664c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f2662a.hashCode() + (H7.a.k(this.f2663b.c()) * 37);
    }
}
