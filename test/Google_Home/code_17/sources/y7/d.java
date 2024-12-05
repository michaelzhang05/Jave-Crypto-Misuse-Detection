package y7;

import a7.C1677a;
import a7.C1678b;
import java.io.IOException;
import java.security.PublicKey;
import p7.C3790g;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private C3790g f41064a;

    public d(C3790g c3790g) {
        this.f41064a = c3790g;
    }

    public G7.a a() {
        return this.f41064a.a();
    }

    public int b() {
        return this.f41064a.b();
    }

    public int c() {
        return this.f41064a.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f41064a.b() != dVar.b() || this.f41064a.c() != dVar.c() || !this.f41064a.a().equals(dVar.a())) {
            return false;
        }
        return true;
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new C1678b(new C1677a(n7.e.f35682m), new n7.d(this.f41064a.b(), this.f41064a.c(), this.f41064a.a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f41064a.b() + (this.f41064a.c() * 37)) * 37) + this.f41064a.a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f41064a.b() + "\n") + " error correction capability: " + this.f41064a.c() + "\n") + " generator matrix           : " + this.f41064a.a();
    }
}
