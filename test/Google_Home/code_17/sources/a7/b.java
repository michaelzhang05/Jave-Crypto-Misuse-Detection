package A7;

import a7.C1678b;
import java.io.IOException;
import java.security.PublicKey;
import r7.AbstractC3979c;
import r7.C3978b;
import v7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3978b f642a;

    public b(C1678b c1678b) {
        a(c1678b);
    }

    private void a(C1678b c1678b) {
        this.f642a = (C3978b) v7.c.a(c1678b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f642a.b() == bVar.f642a.b() && H7.a.a(this.f642a.a(), bVar.f642a.a())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC3979c.a(this.f642a.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f642a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f642a.b() + (H7.a.k(this.f642a.a()) * 37);
    }
}
