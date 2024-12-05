package B7;

import R6.AbstractC1355w;
import R6.C1347n;
import java.io.IOException;
import java.security.PrivateKey;
import k7.j;
import t7.s;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C1347n f1067a;

    /* renamed from: b, reason: collision with root package name */
    private transient s f1068b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1355w f1069c;

    public a(W6.b bVar) {
        a(bVar);
    }

    private void a(W6.b bVar) {
        this.f1069c = bVar.m();
        this.f1067a = j.p(bVar.q().q()).r().m();
        this.f1068b = (s) s7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f1067a.r(aVar.f1067a) && E7.a.a(this.f1068b.c(), aVar.f1068b.c())) {
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
            return s7.b.a(this.f1068b, this.f1069c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f1067a.hashCode() + (E7.a.k(this.f1068b.c()) * 37);
    }
}
