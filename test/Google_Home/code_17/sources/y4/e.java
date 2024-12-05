package y4;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;
import o6.InterfaceC3706f;

/* loaded from: classes4.dex */
public final class e implements InterfaceC3698L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3706f f40937a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f40938b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f40939a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f40940b;

        /* renamed from: d, reason: collision with root package name */
        int f40942d;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f40940b = obj;
            this.f40942d |= Integer.MIN_VALUE;
            return e.this.collect(null, this);
        }
    }

    public e(InterfaceC3706f flow, Function0 produceValue) {
        AbstractC3255y.i(flow, "flow");
        AbstractC3255y.i(produceValue, "produceValue");
        this.f40937a = flow;
        this.f40938b = produceValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0057 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // o6.InterfaceC3687A, o6.InterfaceC3706f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object collect(o6.InterfaceC3707g r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof y4.e.a
            if (r0 == 0) goto L13
            r0 = r6
            y4.e$a r0 = (y4.e.a) r0
            int r1 = r0.f40942d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40942d = r1
            goto L18
        L13:
            y4.e$a r0 = new y4.e$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40940b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f40942d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f40939a
            l6.x0 r5 = (l6.InterfaceC3390x0) r5
            O5.t.b(r6)
            goto L56
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            O5.t.b(r6)
            S5.g r6 = r0.getContext()
            l6.x0$b r2 = l6.InterfaceC3390x0.f34661n0
            S5.g$b r6 = r6.get(r2)
            l6.x0 r6 = (l6.InterfaceC3390x0) r6
            o6.f r2 = r4.f40937a
            o6.f r2 = o6.AbstractC3708h.p(r2)
            r0.f40939a = r6
            r0.f40942d = r3
            java.lang.Object r5 = r2.collect(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            r5 = r6
        L56:
            if (r5 == 0) goto L56
            l6.B0.k(r5)
            goto L56
        */
        throw new UnsupportedOperationException("Method not decompiled: y4.e.collect(o6.g, S5.d):java.lang.Object");
    }

    @Override // o6.InterfaceC3698L
    public Object getValue() {
        return this.f40938b.invoke();
    }
}
