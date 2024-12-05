package y7;

import G7.h;
import G7.i;
import a7.C1677a;
import b7.InterfaceC1991b;
import java.io.IOException;
import java.security.PrivateKey;
import n7.C3490c;
import p7.C3789f;

/* loaded from: classes5.dex */
public class c implements InterfaceC1991b, PrivateKey {

    /* renamed from: a, reason: collision with root package name */
    private C3789f f41063a;

    public c(C3789f c3789f) {
        this.f41063a = c3789f;
    }

    public G7.b a() {
        return this.f41063a.a();
    }

    public i b() {
        return this.f41063a.b();
    }

    public int c() {
        return this.f41063a.c();
    }

    public int d() {
        return this.f41063a.d();
    }

    public h e() {
        return this.f41063a.e();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (d() != cVar.d() || c() != cVar.c() || !a().equals(cVar.a()) || !b().equals(cVar.b()) || !g().equals(cVar.g()) || !e().equals(cVar.e()) || !f().equals(cVar.f())) {
            return false;
        }
        return true;
    }

    public h f() {
        return this.f41063a.f();
    }

    public G7.a g() {
        return this.f41063a.g();
    }

    @Override // java.security.Key
    public String getAlgorithm() {
        return "McEliece";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new Z6.b(new C1677a(n7.e.f35682m), new C3490c(this.f41063a.d(), this.f41063a.c(), this.f41063a.a(), this.f41063a.b(), this.f41063a.e(), this.f41063a.f(), this.f41063a.g())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int hashCode() {
        return (((((((((((this.f41063a.c() * 37) + this.f41063a.d()) * 37) + this.f41063a.a().hashCode()) * 37) + this.f41063a.b().hashCode()) * 37) + this.f41063a.e().hashCode()) * 37) + this.f41063a.f().hashCode()) * 37) + this.f41063a.g().hashCode();
    }
}
