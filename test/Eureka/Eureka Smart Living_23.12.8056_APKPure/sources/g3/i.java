package g3;

import com.google.crypto.tink.shaded.protobuf.a0;
import com.google.crypto.tink.shaded.protobuf.o0;
import java.security.GeneralSecurityException;
import o3.d;

/* loaded from: classes.dex */
class i implements h {

    /* renamed from: a, reason: collision with root package name */
    private final o3.d f6709a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f6710b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final d.a f6711a;

        a(d.a aVar) {
            this.f6711a = aVar;
        }

        private o0 b(o0 o0Var) {
            this.f6711a.e(o0Var);
            return this.f6711a.a(o0Var);
        }

        o0 a(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return b(this.f6711a.d(hVar));
        }
    }

    public i(o3.d dVar, Class cls) {
        if (!dVar.i().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", dVar.toString(), cls.getName()));
        }
        this.f6709a = dVar;
        this.f6710b = cls;
    }

    private a e() {
        return new a(this.f6709a.f());
    }

    private Object f(o0 o0Var) {
        if (Void.class.equals(this.f6710b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.f6709a.j(o0Var);
        return this.f6709a.e(o0Var, this.f6710b);
    }

    @Override // g3.h
    public final t3.y a(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return (t3.y) t3.y.c0().s(b()).t(e().a(hVar).f()).r(this.f6709a.g()).i();
        } catch (a0 e6) {
            throw new GeneralSecurityException("Unexpected proto", e6);
        }
    }

    @Override // g3.h
    public final String b() {
        return this.f6709a.d();
    }

    @Override // g3.h
    public final Object c(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return f(this.f6709a.h(hVar));
        } catch (a0 e6) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f6709a.c().getName(), e6);
        }
    }

    @Override // g3.h
    public final o0 d(com.google.crypto.tink.shaded.protobuf.h hVar) {
        try {
            return e().a(hVar);
        } catch (a0 e6) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.f6709a.f().b().getName(), e6);
        }
    }
}
