package com.flurry.sdk;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u2 extends c3 implements x2 {

    /* loaded from: classes2.dex */
    final class a extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ u6 f10188h;

        a(u6 u6Var) {
            this.f10188h = u6Var;
        }

        @Override // com.flurry.sdk.f2
        public final void a() {
            u2.this.w(this.f10188h);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(x2 x2Var) {
        super("BufferModule", x2Var);
    }

    @Override // com.flurry.sdk.c3
    protected final void b(u6 u6Var) {
        m(new a(u6Var));
    }
}
