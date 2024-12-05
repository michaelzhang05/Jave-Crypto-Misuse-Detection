package C7;

import U6.C1456n;
import a7.C1677a;
import a7.C1678b;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import n7.e;
import n7.h;
import u7.C4071c;
import v7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey, Key {

    /* renamed from: a, reason: collision with root package name */
    private transient C1456n f1693a;

    /* renamed from: b, reason: collision with root package name */
    private transient C4071c f1694b;

    public b(C1678b c1678b) {
        a(c1678b);
    }

    private void a(C1678b c1678b) {
        this.f1693a = h.l(c1678b.l().n()).m().l();
        this.f1694b = (C4071c) v7.c.a(c1678b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1693a.o(bVar.f1693a) && H7.a.a(this.f1694b.b(), bVar.f1694b.b())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        C1678b c1678b;
        try {
            if (this.f1694b.a() != null) {
                c1678b = d.a(this.f1694b);
            } else {
                c1678b = new C1678b(new C1677a(e.f35687r, new h(new C1677a(this.f1693a))), this.f1694b.b());
            }
            return c1678b.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f1693a.hashCode() + (H7.a.k(this.f1694b.b()) * 37);
    }
}
