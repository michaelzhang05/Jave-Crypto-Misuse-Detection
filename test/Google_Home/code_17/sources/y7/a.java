package y7;

import G7.h;
import G7.i;
import a7.C1677a;
import java.io.IOException;
import java.security.PrivateKey;
import n7.C3488a;
import p7.C3785b;

/* loaded from: classes5.dex */
public class a implements PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private C3785b f41061a;

    public a(C3785b c3785b) {
        this.f41061a = c3785b;
    }

    public G7.b a() {
        return this.f41061a.b();
    }

    public i b() {
        return this.f41061a.c();
    }

    public G7.a c() {
        return this.f41061a.d();
    }

    public int d() {
        return this.f41061a.e();
    }

    public int e() {
        return this.f41061a.f();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (e() != aVar.e() || d() != aVar.d() || !a().equals(aVar.a()) || !b().equals(aVar.b()) || !f().equals(aVar.f()) || !c().equals(aVar.c())) {
            return false;
        }
        return true;
    }

    public h f() {
        return this.f41061a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece-CCA2";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new Z6.b(new C1677a(n7.e.f35683n), new C3488a(e(), d(), a(), b(), f(), g.a(this.f41061a.a()))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((this.f41061a.e() * 37) + this.f41061a.f()) * 37) + this.f41061a.b().hashCode()) * 37) + this.f41061a.c().hashCode()) * 37) + this.f41061a.g().hashCode()) * 37) + this.f41061a.d().hashCode();
    }
}
