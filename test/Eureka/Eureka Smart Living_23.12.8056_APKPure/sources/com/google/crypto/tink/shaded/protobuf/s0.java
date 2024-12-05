package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.e;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class s0 implements d1 {

    /* renamed from: a, reason: collision with root package name */
    private final o0 f5645a;

    /* renamed from: b, reason: collision with root package name */
    private final j1 f5646b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5647c;

    /* renamed from: d, reason: collision with root package name */
    private final q f5648d;

    private s0(j1 j1Var, q qVar, o0 o0Var) {
        this.f5646b = j1Var;
        this.f5647c = qVar.e(o0Var);
        this.f5648d = qVar;
        this.f5645a = o0Var;
    }

    private int k(j1 j1Var, Object obj) {
        return j1Var.i(j1Var.g(obj));
    }

    private void l(j1 j1Var, q qVar, Object obj, c1 c1Var, p pVar) {
        Object f6 = j1Var.f(obj);
        t d6 = qVar.d(obj);
        do {
            try {
                if (c1Var.K() == Integer.MAX_VALUE) {
                    return;
                }
            } finally {
                j1Var.o(obj, f6);
            }
        } while (n(c1Var, pVar, qVar, d6, j1Var, f6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s0 m(j1 j1Var, q qVar, o0 o0Var) {
        return new s0(j1Var, qVar, o0Var);
    }

    private boolean n(c1 c1Var, p pVar, q qVar, t tVar, j1 j1Var, Object obj) {
        int j6 = c1Var.j();
        if (j6 != p1.f5584a) {
            if (p1.b(j6) != 2) {
                return c1Var.o();
            }
            Object b6 = qVar.b(pVar, this.f5645a, p1.a(j6));
            if (b6 == null) {
                return j1Var.m(obj, c1Var);
            }
            qVar.h(c1Var, b6, pVar, tVar);
            return true;
        }
        Object obj2 = null;
        h hVar = null;
        int i6 = 0;
        while (c1Var.K() != Integer.MAX_VALUE) {
            int j7 = c1Var.j();
            if (j7 == p1.f5586c) {
                i6 = c1Var.g();
                obj2 = qVar.b(pVar, this.f5645a, i6);
            } else if (j7 == p1.f5587d) {
                if (obj2 != null) {
                    qVar.h(c1Var, obj2, pVar, tVar);
                } else {
                    hVar = c1Var.c();
                }
            } else if (!c1Var.o()) {
                break;
            }
        }
        if (c1Var.j() != p1.f5585b) {
            throw a0.b();
        }
        if (hVar != null) {
            if (obj2 != null) {
                qVar.i(hVar, obj2, pVar, tVar);
            } else {
                j1Var.d(obj, i6, hVar);
            }
        }
        return true;
    }

    private void o(j1 j1Var, Object obj, q1 q1Var) {
        j1Var.s(j1Var.g(obj), q1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void a(Object obj, Object obj2) {
        f1.F(this.f5646b, obj, obj2);
        if (this.f5647c) {
            f1.D(this.f5648d, obj, obj2);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public final boolean b(Object obj) {
        return this.f5648d.c(obj).e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public boolean c(Object obj, Object obj2) {
        if (!this.f5646b.g(obj).equals(this.f5646b.g(obj2))) {
            return false;
        }
        if (this.f5647c) {
            return this.f5648d.c(obj).equals(this.f5648d.c(obj2));
        }
        return true;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void d(Object obj, byte[] bArr, int i6, int i7, e.a aVar) {
        x xVar = (x) obj;
        if (xVar.unknownFields == k1.c()) {
            xVar.unknownFields = k1.k();
        }
        androidx.appcompat.app.f0.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void e(Object obj, q1 q1Var) {
        Iterator f6 = this.f5648d.c(obj).f();
        if (f6.hasNext()) {
            androidx.appcompat.app.f0.a(((Map.Entry) f6.next()).getKey());
            throw null;
        }
        o(this.f5646b, obj, q1Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public int f(Object obj) {
        int k6 = k(this.f5646b, obj) + 0;
        return this.f5647c ? k6 + this.f5648d.c(obj).b() : k6;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public Object g() {
        o0 o0Var = this.f5645a;
        return o0Var instanceof x ? ((x) o0Var).J() : o0Var.d().g();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void h(Object obj, c1 c1Var, p pVar) {
        l(this.f5646b, this.f5648d, obj, c1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public void i(Object obj) {
        this.f5646b.j(obj);
        this.f5648d.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.d1
    public int j(Object obj) {
        int hashCode = this.f5646b.g(obj).hashCode();
        return this.f5647c ? (hashCode * 53) + this.f5648d.c(obj).hashCode() : hashCode;
    }
}
