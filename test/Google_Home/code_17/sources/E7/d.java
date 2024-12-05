package E7;

import U6.C1456n;
import a7.C1678b;
import java.io.IOException;
import java.security.PublicKey;
import w7.z;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient z f2670a;

    /* renamed from: b, reason: collision with root package name */
    private transient C1456n f2671b;

    public d(C1678b c1678b) {
        a(c1678b);
    }

    private void a(C1678b c1678b) {
        z zVar = (z) v7.c.a(c1678b);
        this.f2670a = zVar;
        this.f2671b = e.a(zVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            try {
                if (this.f2671b.o(dVar.f2671b)) {
                    if (H7.a.a(this.f2670a.getEncoded(), dVar.f2670a.getEncoded())) {
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
            return v7.d.a(this.f2670a).getEncoded();
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
            return this.f2671b.hashCode() + (H7.a.k(this.f2670a.getEncoded()) * 37);
        } catch (IOException unused) {
            return this.f2671b.hashCode();
        }
    }
}
