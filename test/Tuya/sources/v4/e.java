package v4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import l6.InterfaceC3349K;
import l6.InterfaceC3358f;

/* loaded from: classes4.dex */
public final class e implements InterfaceC3349K {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3358f f38806a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f38807b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f38808a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38809b;

        /* renamed from: d, reason: collision with root package name */
        int f38811d;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38809b = obj;
            this.f38811d |= Integer.MIN_VALUE;
            return e.this.collect(null, this);
        }
    }

    public e(InterfaceC3358f flow, Function0 produceValue) {
        AbstractC3159y.i(flow, "flow");
        AbstractC3159y.i(produceValue, "produceValue");
        this.f38806a = flow;
        this.f38807b = produceValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // l6.z, l6.InterfaceC3358f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(l6.InterfaceC3359g r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v4.e.a
            if (r0 == 0) goto L13
            r0 = r6
            v4.e$a r0 = (v4.e.a) r0
            int r1 = r0.f38811d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38811d = r1
            goto L18
        L13:
            v4.e$a r0 = new v4.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38809b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f38811d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f38808a
            i6.x0 r5 = (i6.InterfaceC2855x0) r5
            L5.t.b(r6)
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            L5.t.b(r6)
            P5.g r6 = r0.getContext()
            i6.x0$b r2 = i6.InterfaceC2855x0.f31809n0
            P5.g$b r6 = r6.get(r2)
            i6.x0 r6 = (i6.InterfaceC2855x0) r6
            l6.f r2 = r4.f38806a
            l6.f r2 = l6.AbstractC3360h.n(r2)
            r0.f38808a = r6
            r0.f38811d = r3
            java.lang.Object r5 = r2.collect(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            r5 = r6
        L56:
            if (r5 == 0) goto L56
            i6.B0.k(r5)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.e.collect(l6.g, P5.d):java.lang.Object");
    }

    @Override // l6.InterfaceC3349K
    public Object getValue() {
        return this.f38807b.invoke();
    }
}
