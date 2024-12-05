package X3;

import Y3.d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3159y;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f12277a;

    /* renamed from: b, reason: collision with root package name */
    private final Y3.a f12278b;

    /* renamed from: c, reason: collision with root package name */
    private final long f12279c;

    /* renamed from: d, reason: collision with root package name */
    private final l6.v f12280d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3349K f12281e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f12282a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f12283b;

        /* renamed from: d, reason: collision with root package name */
        int f12285d;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f12283b = obj;
            this.f12285d |= Integer.MIN_VALUE;
            return j.this.b(this);
        }
    }

    public j(int i8, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, Y3.a creqData) {
        AbstractC3159y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3159y.i(creqData, "creqData");
        this.f12277a = errorRequestExecutor;
        this.f12278b = creqData;
        this.f12279c = TimeUnit.MINUTES.toMillis(i8);
        l6.v a8 = AbstractC3351M.a(Boolean.FALSE);
        this.f12280d = a8;
        this.f12281e = a8;
    }

    private final Y3.d c() {
        String o8 = this.f12278b.o();
        String e8 = this.f12278b.e();
        Y3.f fVar = Y3.f.f13168j;
        return new Y3.d(o8, e8, null, String.valueOf(fVar.b()), d.c.f13148c, fVar.c(), "Timeout expiry reached for the transaction", null, this.f12278b.k(), this.f12278b.n(), 132, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // X3.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X3.j.a
            if (r0 == 0) goto L13
            r0 = r7
            X3.j$a r0 = (X3.j.a) r0
            int r1 = r0.f12285d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12285d = r1
            goto L18
        L13:
            X3.j$a r0 = new X3.j$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f12283b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f12285d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f12282a
            X3.j r0 = (X3.j) r0
            L5.t.b(r7)
            goto L46
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            L5.t.b(r7)
            long r4 = r6.f12279c
            r0.f12282a = r6
            r0.f12285d = r3
            java.lang.Object r7 = i6.X.b(r4, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r0 = r6
        L46:
            r0.e()
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X3.j.b(P5.d):java.lang.Object");
    }

    @Override // X3.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC3349K a() {
        return this.f12281e;
    }

    public final void e() {
        this.f12277a.a(c());
        this.f12280d.setValue(Boolean.TRUE);
    }
}
