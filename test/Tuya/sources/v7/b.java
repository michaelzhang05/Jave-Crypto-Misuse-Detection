package v7;

import java.io.IOException;
import java.security.PublicKey;
import k7.C3134b;
import m7.C3443c;

/* loaded from: classes5.dex */
public class b implements Y6.b, PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private C3443c f38931a;

    public b(C3443c c3443c) {
        this.f38931a = c3443c;
    }

    public D7.a a() {
        return this.f38931a.b();
    }

    public int b() {
        return this.f38931a.c();
    }

    public int c() {
        return this.f38931a.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f38931a.c() != bVar.b() || this.f38931a.d() != bVar.c() || !this.f38931a.b().equals(bVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new X6.b(new X6.a(k7.e.f33691n), new C3134b(this.f38931a.c(), this.f38931a.d(), this.f38931a.b(), g.a(this.f38931a.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f38931a.c() + (this.f38931a.d() * 37)) * 37) + this.f38931a.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f38931a.c() + "\n") + " error correction capability: " + this.f38931a.d() + "\n") + " generator matrix           : " + this.f38931a.b().toString();
    }
}
