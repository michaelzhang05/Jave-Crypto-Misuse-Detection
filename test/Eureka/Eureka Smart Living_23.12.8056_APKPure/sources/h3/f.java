package h3;

import java.security.GeneralSecurityException;
import o3.d;
import t3.y;

/* loaded from: classes.dex */
public class f extends o3.d {

    /* loaded from: classes.dex */
    class a extends o3.m {
        a(Class cls) {
            super(cls);
        }

        @Override // o3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u3.l a(t3.f fVar) {
            return new u3.a(fVar.Z().x(), fVar.a0().X());
        }
    }

    /* loaded from: classes.dex */
    class b extends d.a {
        b(Class cls) {
            super(cls);
        }

        @Override // o3.d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t3.f a(t3.g gVar) {
            return (t3.f) t3.f.c0().s(gVar.Z()).r(com.google.crypto.tink.shaded.protobuf.h.l(u3.p.c(gVar.Y()))).t(f.this.l()).i();
        }

        @Override // o3.d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t3.g d(com.google.crypto.tink.shaded.protobuf.h hVar) {
            return t3.g.b0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
        }

        @Override // o3.d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(t3.g gVar) {
            u3.r.a(gVar.Y());
            f.this.o(gVar.Z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        super(t3.f.class, new a(u3.l.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o(t3.h hVar) {
        if (hVar.X() < 12 || hVar.X() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // o3.d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // o3.d
    public d.a f() {
        return new b(t3.g.class);
    }

    @Override // o3.d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // o3.d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public t3.f h(com.google.crypto.tink.shaded.protobuf.h hVar) {
        return t3.f.d0(hVar, com.google.crypto.tink.shaded.protobuf.p.b());
    }

    @Override // o3.d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(t3.f fVar) {
        u3.r.c(fVar.b0(), l());
        u3.r.a(fVar.Z().size());
        o(fVar.a0());
    }
}
