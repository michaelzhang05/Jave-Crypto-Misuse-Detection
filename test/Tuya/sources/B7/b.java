package B7;

import R6.C1347n;
import java.io.IOException;
import java.security.PublicKey;
import t7.t;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C1347n f1070a;

    /* renamed from: b, reason: collision with root package name */
    private transient t f1071b;

    public b(X6.b bVar) {
        a(bVar);
    }

    private void a(X6.b bVar) {
        t tVar = (t) s7.c.a(bVar);
        this.f1071b = tVar;
        this.f1070a = e.a(tVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1070a.r(bVar.f1070a) && E7.a.a(this.f1071b.e(), bVar.f1071b.e())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSSMT";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return s7.d.a(this.f1071b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f1070a.hashCode() + (E7.a.k(this.f1071b.e()) * 37);
    }
}
