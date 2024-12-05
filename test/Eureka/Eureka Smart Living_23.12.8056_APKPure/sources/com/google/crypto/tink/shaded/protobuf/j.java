package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h0;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j implements c1 {

    /* renamed from: a, reason: collision with root package name */
    private final i f5524a;

    /* renamed from: b, reason: collision with root package name */
    private int f5525b;

    /* renamed from: c, reason: collision with root package name */
    private int f5526c;

    /* renamed from: d, reason: collision with root package name */
    private int f5527d = 0;

    private j(i iVar) {
        i iVar2 = (i) z.b(iVar, "input");
        this.f5524a = iVar2;
        iVar2.f5502d = this;
    }

    public static j O(i iVar) {
        j jVar = iVar.f5502d;
        return jVar != null ? jVar : new j(iVar);
    }

    private void P(Object obj, d1 d1Var, p pVar) {
        int i6 = this.f5526c;
        this.f5526c = p1.c(p1.a(this.f5525b), 4);
        try {
            d1Var.h(obj, this, pVar);
            if (this.f5525b == this.f5526c) {
            } else {
                throw a0.h();
            }
        } finally {
            this.f5526c = i6;
        }
    }

    private void Q(Object obj, d1 d1Var, p pVar) {
        int C = this.f5524a.C();
        i iVar = this.f5524a;
        if (iVar.f5499a >= iVar.f5500b) {
            throw a0.i();
        }
        int l6 = iVar.l(C);
        this.f5524a.f5499a++;
        d1Var.h(obj, this, pVar);
        this.f5524a.a(0);
        r5.f5499a--;
        this.f5524a.k(l6);
    }

    private Object R(d1 d1Var, p pVar) {
        Object g6 = d1Var.g();
        P(g6, d1Var, pVar);
        d1Var.i(g6);
        return g6;
    }

    private Object S(d1 d1Var, p pVar) {
        Object g6 = d1Var.g();
        Q(g6, d1Var, pVar);
        d1Var.i(g6);
        return g6;
    }

    private void U(int i6) {
        if (this.f5524a.d() != i6) {
            throw a0.m();
        }
    }

    private void V(int i6) {
        if (p1.b(this.f5525b) != i6) {
            throw a0.e();
        }
    }

    private void W(int i6) {
        if ((i6 & 3) != 0) {
            throw a0.h();
        }
    }

    private void X(int i6) {
        if ((i6 & 7) != 0) {
            throw a0.h();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public String A() {
        V(2);
        return this.f5524a.z();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void B(List list, d1 d1Var, p pVar) {
        int B;
        if (p1.b(this.f5525b) != 3) {
            throw a0.e();
        }
        int i6 = this.f5525b;
        do {
            list.add(R(d1Var, pVar));
            if (this.f5524a.e() || this.f5527d != 0) {
                return;
            } else {
                B = this.f5524a.B();
            }
        } while (B == i6);
        this.f5527d = B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void C(List list, d1 d1Var, p pVar) {
        int B;
        if (p1.b(this.f5525b) != 2) {
            throw a0.e();
        }
        int i6 = this.f5525b;
        do {
            list.add(S(d1Var, pVar));
            if (this.f5524a.e() || this.f5527d != 0) {
                return;
            } else {
                B = this.f5524a.B();
            }
        } while (B == i6);
        this.f5527d = B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public long D() {
        V(0);
        return this.f5524a.u();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public String E() {
        V(2);
        return this.f5524a.A();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int F() {
        V(5);
        return this.f5524a.q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void G(List list) {
        int B;
        int B2;
        if (!(list instanceof f0)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 1) {
                if (b6 != 2) {
                    throw a0.e();
                }
                int C = this.f5524a.C();
                X(C);
                int d6 = this.f5524a.d() + C;
                do {
                    list.add(Long.valueOf(this.f5524a.r()));
                } while (this.f5524a.d() < d6);
                return;
            }
            do {
                list.add(Long.valueOf(this.f5524a.r()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        f0 f0Var = (f0) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 1) {
            if (b7 != 2) {
                throw a0.e();
            }
            int C2 = this.f5524a.C();
            X(C2);
            int d7 = this.f5524a.d() + C2;
            do {
                f0Var.i(this.f5524a.r());
            } while (this.f5524a.d() < d7);
            return;
        }
        do {
            f0Var.i(this.f5524a.r());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void H(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof y)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Integer.valueOf(this.f5524a.t()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Integer.valueOf(this.f5524a.t()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        y yVar = (y) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                yVar.i(this.f5524a.t());
            } while (this.f5524a.d() < d6);
        }
        do {
            yVar.i(this.f5524a.t());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public boolean I() {
        V(0);
        return this.f5524a.m();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void J(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof y)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Integer.valueOf(this.f5524a.p()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Integer.valueOf(this.f5524a.p()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        y yVar = (y) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                yVar.i(this.f5524a.p());
            } while (this.f5524a.d() < d6);
        }
        do {
            yVar.i(this.f5524a.p());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int K() {
        int i6 = this.f5527d;
        if (i6 != 0) {
            this.f5525b = i6;
            this.f5527d = 0;
        } else {
            this.f5525b = this.f5524a.B();
        }
        int i7 = this.f5525b;
        if (i7 == 0 || i7 == this.f5526c) {
            return Integer.MAX_VALUE;
        }
        return p1.a(i7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void L(Object obj, d1 d1Var, p pVar) {
        V(3);
        P(obj, d1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void M(List list) {
        T(list, false);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public long N() {
        V(1);
        return this.f5524a.w();
    }

    public void T(List list, boolean z5) {
        int B;
        int B2;
        if (p1.b(this.f5525b) != 2) {
            throw a0.e();
        }
        if (!(list instanceof d0) || z5) {
            do {
                list.add(z5 ? E() : A());
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        d0 d0Var = (d0) list;
        do {
            d0Var.g(c());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void a(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof f0)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Long.valueOf(this.f5524a.D()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Long.valueOf(this.f5524a.D()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        f0 f0Var = (f0) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                f0Var.i(this.f5524a.D());
            } while (this.f5524a.d() < d6);
        }
        do {
            f0Var.i(this.f5524a.D());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void b(List list) {
        T(list, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public h c() {
        V(2);
        return this.f5524a.n();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void d(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof y)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Integer.valueOf(this.f5524a.x()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Integer.valueOf(this.f5524a.x()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        y yVar = (y) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                yVar.i(this.f5524a.x());
            } while (this.f5524a.d() < d6);
        }
        do {
            yVar.i(this.f5524a.x());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int e() {
        V(0);
        return this.f5524a.p();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void f(List list) {
        int B;
        int B2;
        if (!(list instanceof v)) {
            int b6 = p1.b(this.f5525b);
            if (b6 == 2) {
                int C = this.f5524a.C();
                W(C);
                int d6 = this.f5524a.d() + C;
                do {
                    list.add(Float.valueOf(this.f5524a.s()));
                } while (this.f5524a.d() < d6);
                return;
            }
            if (b6 != 5) {
                throw a0.e();
            }
            do {
                list.add(Float.valueOf(this.f5524a.s()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        v vVar = (v) list;
        int b7 = p1.b(this.f5525b);
        if (b7 == 2) {
            int C2 = this.f5524a.C();
            W(C2);
            int d7 = this.f5524a.d() + C2;
            do {
                vVar.i(this.f5524a.s());
            } while (this.f5524a.d() < d7);
            return;
        }
        if (b7 != 5) {
            throw a0.e();
        }
        do {
            vVar.i(this.f5524a.s());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int g() {
        V(0);
        return this.f5524a.C();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int h() {
        V(0);
        return this.f5524a.t();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void i(Object obj, d1 d1Var, p pVar) {
        V(2);
        Q(obj, d1Var, pVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int j() {
        return this.f5525b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public long k() {
        V(0);
        return this.f5524a.D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void l(List list) {
        int B;
        int B2;
        if (!(list instanceof y)) {
            int b6 = p1.b(this.f5525b);
            if (b6 == 2) {
                int C = this.f5524a.C();
                W(C);
                int d6 = this.f5524a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f5524a.q()));
                } while (this.f5524a.d() < d6);
                return;
            }
            if (b6 != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f5524a.q()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        y yVar = (y) list;
        int b7 = p1.b(this.f5525b);
        if (b7 == 2) {
            int C2 = this.f5524a.C();
            W(C2);
            int d7 = this.f5524a.d() + C2;
            do {
                yVar.i(this.f5524a.q());
            } while (this.f5524a.d() < d7);
            return;
        }
        if (b7 != 5) {
            throw a0.e();
        }
        do {
            yVar.i(this.f5524a.q());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public long m() {
        V(1);
        return this.f5524a.r();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void n(List list) {
        int B;
        int B2;
        if (!(list instanceof y)) {
            int b6 = p1.b(this.f5525b);
            if (b6 == 2) {
                int C = this.f5524a.C();
                W(C);
                int d6 = this.f5524a.d() + C;
                do {
                    list.add(Integer.valueOf(this.f5524a.v()));
                } while (this.f5524a.d() < d6);
                return;
            }
            if (b6 != 5) {
                throw a0.e();
            }
            do {
                list.add(Integer.valueOf(this.f5524a.v()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        y yVar = (y) list;
        int b7 = p1.b(this.f5525b);
        if (b7 == 2) {
            int C2 = this.f5524a.C();
            W(C2);
            int d7 = this.f5524a.d() + C2;
            do {
                yVar.i(this.f5524a.v());
            } while (this.f5524a.d() < d7);
            return;
        }
        if (b7 != 5) {
            throw a0.e();
        }
        do {
            yVar.i(this.f5524a.v());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public boolean o() {
        int i6;
        if (this.f5524a.e() || (i6 = this.f5525b) == this.f5526c) {
            return false;
        }
        return this.f5524a.E(i6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int p() {
        V(0);
        return this.f5524a.x();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void q(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof f0)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Long.valueOf(this.f5524a.y()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Long.valueOf(this.f5524a.y()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        f0 f0Var = (f0) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                f0Var.i(this.f5524a.y());
            } while (this.f5524a.d() < d6);
        }
        do {
            f0Var.i(this.f5524a.y());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public long r() {
        V(0);
        return this.f5524a.y();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public double readDouble() {
        V(1);
        return this.f5524a.o();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public float readFloat() {
        V(5);
        return this.f5524a.s();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public int s() {
        V(5);
        return this.f5524a.v();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void t(List list) {
        int B;
        if (p1.b(this.f5525b) != 2) {
            throw a0.e();
        }
        do {
            list.add(c());
            if (this.f5524a.e()) {
                return;
            } else {
                B = this.f5524a.B();
            }
        } while (B == this.f5525b);
        this.f5527d = B;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void u(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof y)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Integer.valueOf(this.f5524a.C()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Integer.valueOf(this.f5524a.C()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        y yVar = (y) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                yVar.i(this.f5524a.C());
            } while (this.f5524a.d() < d6);
        }
        do {
            yVar.i(this.f5524a.C());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void v(Map map, h0.a aVar, p pVar) {
        V(2);
        this.f5524a.l(this.f5524a.C());
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void w(List list) {
        int B;
        int B2;
        if (!(list instanceof m)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 1) {
                if (b6 != 2) {
                    throw a0.e();
                }
                int C = this.f5524a.C();
                X(C);
                int d6 = this.f5524a.d() + C;
                do {
                    list.add(Double.valueOf(this.f5524a.o()));
                } while (this.f5524a.d() < d6);
                return;
            }
            do {
                list.add(Double.valueOf(this.f5524a.o()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        m mVar = (m) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 1) {
            if (b7 != 2) {
                throw a0.e();
            }
            int C2 = this.f5524a.C();
            X(C2);
            int d7 = this.f5524a.d() + C2;
            do {
                mVar.i(this.f5524a.o());
            } while (this.f5524a.d() < d7);
            return;
        }
        do {
            mVar.i(this.f5524a.o());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void x(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof f0)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Long.valueOf(this.f5524a.u()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Long.valueOf(this.f5524a.u()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        f0 f0Var = (f0) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                f0Var.i(this.f5524a.u());
            } while (this.f5524a.d() < d6);
        }
        do {
            f0Var.i(this.f5524a.u());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void y(List list) {
        int B;
        int d6;
        int B2;
        if (!(list instanceof f)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 0) {
                if (b6 != 2) {
                    throw a0.e();
                }
                d6 = this.f5524a.d() + this.f5524a.C();
                do {
                    list.add(Boolean.valueOf(this.f5524a.m()));
                } while (this.f5524a.d() < d6);
            }
            do {
                list.add(Boolean.valueOf(this.f5524a.m()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        f fVar = (f) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 0) {
            if (b7 != 2) {
                throw a0.e();
            }
            d6 = this.f5524a.d() + this.f5524a.C();
            do {
                fVar.i(this.f5524a.m());
            } while (this.f5524a.d() < d6);
        }
        do {
            fVar.i(this.f5524a.m());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
        return;
        U(d6);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.c1
    public void z(List list) {
        int B;
        int B2;
        if (!(list instanceof f0)) {
            int b6 = p1.b(this.f5525b);
            if (b6 != 1) {
                if (b6 != 2) {
                    throw a0.e();
                }
                int C = this.f5524a.C();
                X(C);
                int d6 = this.f5524a.d() + C;
                do {
                    list.add(Long.valueOf(this.f5524a.w()));
                } while (this.f5524a.d() < d6);
                return;
            }
            do {
                list.add(Long.valueOf(this.f5524a.w()));
                if (this.f5524a.e()) {
                    return;
                } else {
                    B = this.f5524a.B();
                }
            } while (B == this.f5525b);
            this.f5527d = B;
            return;
        }
        f0 f0Var = (f0) list;
        int b7 = p1.b(this.f5525b);
        if (b7 != 1) {
            if (b7 != 2) {
                throw a0.e();
            }
            int C2 = this.f5524a.C();
            X(C2);
            int d7 = this.f5524a.d() + C2;
            do {
                f0Var.i(this.f5524a.w());
            } while (this.f5524a.d() < d7);
            return;
        }
        do {
            f0Var.i(this.f5524a.w());
            if (this.f5524a.e()) {
                return;
            } else {
                B2 = this.f5524a.B();
            }
        } while (B2 == this.f5525b);
        this.f5527d = B2;
    }
}
