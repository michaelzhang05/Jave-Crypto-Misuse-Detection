package x7;

import java.io.IOException;
import java.security.PublicKey;
import o7.AbstractC3589c;
import o7.C3588b;
import s7.d;

/* loaded from: classes5.dex */
public class b implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3588b f39647a;

    public b(X6.b bVar) {
        a(bVar);
    }

    private void a(X6.b bVar) {
        this.f39647a = (C3588b) s7.c.a(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f39647a.b() == bVar.f39647a.b() && E7.a.a(this.f39647a.a(), bVar.f39647a.a())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC3589c.a(this.f39647a.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return d.a(this.f39647a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return this.f39647a.b() + (E7.a.k(this.f39647a.a()) * 37);
    }
}
