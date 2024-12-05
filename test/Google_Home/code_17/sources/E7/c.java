package E7;

import U6.AbstractC1464w;
import U6.C1456n;
import java.io.IOException;
import java.security.PrivateKey;
import n7.i;
import w7.y;

/* loaded from: classes5.dex */
public class c implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient y f2667a;

    /* renamed from: b, reason: collision with root package name */
    private transient C1456n f2668b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1464w f2669c;

    public c(Z6.b bVar) {
        a(bVar);
    }

    private void a(Z6.b bVar) {
        this.f2669c = bVar.l();
        this.f2668b = i.m(bVar.n().n()).n().l();
        this.f2667a = (y) v7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f2668b.o(cVar.f2668b) && H7.a.a(this.f2667a.c(), cVar.f2667a.c())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return v7.b.a(this.f2667a, this.f2669c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f2668b.hashCode() + (H7.a.k(this.f2667a.c()) * 37);
    }
}
