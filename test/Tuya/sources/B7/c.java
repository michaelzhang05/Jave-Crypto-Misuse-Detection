package B7;

import R6.AbstractC1355w;
import R6.C1347n;
import java.io.IOException;
import java.security.PrivateKey;
import k7.i;
import t7.y;

/* loaded from: classes5.dex */
public class c implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient y f1072a;

    /* renamed from: b, reason: collision with root package name */
    private transient C1347n f1073b;

    /* renamed from: c, reason: collision with root package name */
    private transient AbstractC1355w f1074c;

    public c(W6.b bVar) {
        a(bVar);
    }

    private void a(W6.b bVar) {
        this.f1074c = bVar.m();
        this.f1073b = i.p(bVar.q().q()).q().m();
        this.f1072a = (y) s7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1073b.r(cVar.f1073b) && E7.a.a(this.f1072a.c(), cVar.f1072a.c())) {
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
            return s7.b.a(this.f1072a, this.f1074c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f1073b.hashCode() + (E7.a.k(this.f1072a.c()) * 37);
    }
}
