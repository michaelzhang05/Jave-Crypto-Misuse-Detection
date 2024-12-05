package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
class l1 extends j1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public k1 g(Object obj) {
        return ((x) obj).unknownFields;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(k1 k1Var) {
        return k1Var.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(k1 k1Var) {
        return k1Var.e();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public k1 k(k1 k1Var, k1 k1Var2) {
        return k1.c().equals(k1Var2) ? k1Var : k1.c().equals(k1Var) ? k1.j(k1Var, k1Var2) : k1Var.i(k1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public k1 n() {
        return k1.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, k1 k1Var) {
        p(obj, k1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, k1 k1Var) {
        ((x) obj).unknownFields = k1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public k1 r(k1 k1Var) {
        k1Var.h();
        return k1Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(k1 k1Var, q1 q1Var) {
        k1Var.p(q1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(k1 k1Var, q1 q1Var) {
        k1Var.r(q1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public void j(Object obj) {
        g(obj).h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    public boolean q(c1 c1Var) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(k1 k1Var, int i6, int i7) {
        k1Var.n(p1.c(i6, 5), Integer.valueOf(i7));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(k1 k1Var, int i6, long j6) {
        k1Var.n(p1.c(i6, 1), Long.valueOf(j6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(k1 k1Var, int i6, k1 k1Var2) {
        k1Var.n(p1.c(i6, 3), k1Var2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(k1 k1Var, int i6, h hVar) {
        k1Var.n(p1.c(i6, 2), hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(k1 k1Var, int i6, long j6) {
        k1Var.n(p1.c(i6, 0), Long.valueOf(j6));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.j1
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public k1 f(Object obj) {
        k1 g6 = g(obj);
        if (g6 != k1.c()) {
            return g6;
        }
        k1 k6 = k1.k();
        p(obj, k6);
        return k6;
    }
}
