package y7;

import a7.C1677a;
import a7.C1678b;
import b7.InterfaceC1991b;
import java.io.IOException;
import java.security.PublicKey;
import n7.C3489b;
import p7.C3786c;

/* loaded from: classes5.dex */
public class b implements InterfaceC1991b, PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private C3786c f41062a;

    public b(C3786c c3786c) {
        this.f41062a = c3786c;
    }

    public G7.a a() {
        return this.f41062a.b();
    }

    public int b() {
        return this.f41062a.c();
    }

    public int c() {
        return this.f41062a.d();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f41062a.c() != bVar.b() || this.f41062a.d() != bVar.c() || !this.f41062a.b().equals(bVar.a())) {
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
            return new C1678b(new C1677a(n7.e.f35683n), new C3489b(this.f41062a.c(), this.f41062a.d(), this.f41062a.b(), g.a(this.f41062a.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f41062a.c() + (this.f41062a.d() * 37)) * 37) + this.f41062a.b().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f41062a.c() + "\n") + " error correction capability: " + this.f41062a.d() + "\n") + " generator matrix           : " + this.f41062a.b().toString();
    }
}
