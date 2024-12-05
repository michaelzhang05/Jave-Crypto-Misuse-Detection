package x7;

import R6.AbstractC1355w;
import java.io.IOException;
import java.security.PrivateKey;
import o7.AbstractC3589c;
import o7.C3587a;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private transient C3587a f39645a;

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC1355w f39646b;

    public a(W6.b bVar) {
        a(bVar);
    }

    private void a(W6.b bVar) {
        this.f39646b = bVar.m();
        this.f39645a = (C3587a) s7.a.b(bVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f39645a.b() == aVar.f39645a.b() && E7.a.a(this.f39645a.a(), aVar.f39645a.a())) {
            return true;
        }
        return false;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return AbstractC3589c.a(this.f39645a.b());
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return s7.b.a(this.f39645a, this.f39646b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return this.f39645a.b() + (E7.a.k(this.f39645a.a()) * 37);
    }
}
