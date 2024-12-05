package E7;

import U6.C1456n;
import a7.C1678b;
import java.io.IOException;
import java.security.PublicKey;
import w7.t;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C1456n f2665a;

    /* renamed from: b, reason: collision with root package name */
    private transient t f2666b;

    public b(C1678b c1678b) {
        a(c1678b);
    }

    private void a(C1678b c1678b) {
        t tVar = (t) v7.c.a(c1678b);
        this.f2666b = tVar;
        this.f2665a = e.a(tVar.a());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f2665a.o(bVar.f2665a) && H7.a.a(this.f2666b.e(), bVar.f2666b.e())) {
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
            return v7.d.a(this.f2666b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f2665a.hashCode() + (H7.a.k(this.f2666b.e()) * 37);
    }
}
