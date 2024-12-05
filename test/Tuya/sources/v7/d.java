package v7;

import java.io.IOException;
import java.security.PublicKey;
import m7.C3447g;

/* loaded from: classes5.dex */
public class d implements PublicKey {

    /* renamed from: a, reason: collision with root package name */
    private C3447g f38933a;

    public d(C3447g c3447g) {
        this.f38933a = c3447g;
    }

    public D7.a a() {
        return this.f38933a.a();
    }

    public int b() {
        return this.f38933a.b();
    }

    public int c() {
        return this.f38933a.c();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f38933a.b() != dVar.b() || this.f38933a.c() != dVar.c() || !this.f38933a.a().equals(dVar.a())) {
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
            return new X6.b(new X6.a(k7.e.f33690m), new k7.d(this.f38933a.b(), this.f38933a.c(), this.f38933a.a())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return ((this.f38933a.b() + (this.f38933a.c() * 37)) * 37) + this.f38933a.a().hashCode();
    }

    public String toString() {
        return (("McEliecePublicKey:\n length of the code         : " + this.f38933a.b() + "\n") + " error correction capability: " + this.f38933a.c() + "\n") + " generator matrix           : " + this.f38933a.a();
    }
}
