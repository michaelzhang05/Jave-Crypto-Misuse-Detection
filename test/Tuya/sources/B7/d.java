package B7;

import R6.C1347n;
import java.io.IOException;
import java.security.PublicKey;
import t7.z;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient z f1075a;

    /* renamed from: b, reason: collision with root package name */
    private transient C1347n f1076b;

    public d(X6.b bVar) {
        a(bVar);
    }

    private void a(X6.b bVar) {
        z zVar = (z) s7.c.a(bVar);
        this.f1075a = zVar;
        this.f1076b = e.a(zVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                if (this.f1076b.r(dVar.f1076b)) {
                    if (E7.a.a(this.f1075a.getEncoded(), dVar.f1075a.getEncoded())) {
                        return true;
                    }
                }
                return false;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "XMSS";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return s7.d.a(this.f1075a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        try {
            return this.f1076b.hashCode() + (E7.a.k(this.f1075a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f1076b.hashCode();
        }
    }
}
