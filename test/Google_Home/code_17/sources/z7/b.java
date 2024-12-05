package z7;

import a7.C1678b;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import v7.d;

/* loaded from: classes5.dex */
public class b implements Key, PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient q7.b f41184a;

    public b(C1678b c1678b) {
        a(c1678b);
    }

    private void a(C1678b c1678b) {
        this.f41184a = (q7.b) v7.c.a(c1678b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            return H7.a.a(this.f41184a.a(), ((b) obj).f41184a.a());
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "NH";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f41184a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return H7.a.k(this.f41184a.a());
    }
}
