package a4;

import b4.C1975a;
import b4.d;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3255y;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;
import o6.w;

/* loaded from: classes4.dex */
public final class j implements v {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.k f13898a;

    /* renamed from: b, reason: collision with root package name */
    private final C1975a f13899b;

    /* renamed from: c, reason: collision with root package name */
    private final long f13900c;

    /* renamed from: d, reason: collision with root package name */
    private final w f13901d;

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC3698L f13902e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f13903a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13904b;

        /* renamed from: d, reason: collision with root package name */
        int f13906d;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f13904b = obj;
            this.f13906d |= Integer.MIN_VALUE;
            return j.this.b(this);
        }
    }

    public j(int i8, com.stripe.android.stripe3ds2.transaction.k errorRequestExecutor, C1975a creqData) {
        AbstractC3255y.i(errorRequestExecutor, "errorRequestExecutor");
        AbstractC3255y.i(creqData, "creqData");
        this.f13898a = errorRequestExecutor;
        this.f13899b = creqData;
        this.f13900c = TimeUnit.MINUTES.toMillis(i8);
        w a8 = AbstractC3700N.a(Boolean.FALSE);
        this.f13901d = a8;
        this.f13902e = a8;
    }

    private final b4.d c() {
        String v8 = this.f13899b.v();
        String g8 = this.f13899b.g();
        b4.f fVar = b4.f.f15453j;
        return new b4.d(v8, g8, null, String.valueOf(fVar.b()), d.c.f15433c, fVar.c(), "Timeout expiry reached for the transaction", null, this.f13899b.s(), this.f13899b.u(), 132, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // a4.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof a4.j.a
            if (r0 == 0) goto L13
            r0 = r7
            a4.j$a r0 = (a4.j.a) r0
            int r1 = r0.f13906d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f13906d = r1
            goto L18
        L13:
            a4.j$a r0 = new a4.j$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f13904b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f13906d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f13903a
            a4.j r0 = (a4.j) r0
            O5.t.b(r7)
            goto L46
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            O5.t.b(r7)
            long r4 = r6.f13900c
            r0.f13903a = r6
            r0.f13906d = r3
            java.lang.Object r7 = l6.X.b(r4, r0)
            if (r7 != r1) goto L45
            return r1
        L45:
            r0 = r6
        L46:
            r0.e()
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.j.b(S5.d):java.lang.Object");
    }

    @Override // a4.v
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceC3698L a() {
        return this.f13902e;
    }

    public final void e() {
        this.f13898a.a(c());
        this.f13901d.setValue(Boolean.TRUE);
    }
}
