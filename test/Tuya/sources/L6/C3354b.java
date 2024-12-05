package l6;

import k6.EnumC3132a;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: l6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3354b extends C3356d {

    /* renamed from: e, reason: collision with root package name */
    private final X5.n f34623e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34624a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34625b;

        /* renamed from: d, reason: collision with root package name */
        int f34627d;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34625b = obj;
            this.f34627d |= Integer.MIN_VALUE;
            return C3354b.this.h(null, this);
        }
    }

    public /* synthetic */ C3354b(X5.n nVar, P5.g gVar, int i8, EnumC3132a enumC3132a, int i9, AbstractC3151p abstractC3151p) {
        this(nVar, (i9 & 2) != 0 ? P5.h.f7994a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC3132a.SUSPEND : enumC3132a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // l6.C3356d, m6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(k6.s r5, P5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof l6.C3354b.a
            if (r0 == 0) goto L13
            r0 = r6
            l6.b$a r0 = (l6.C3354b.a) r0
            int r1 = r0.f34627d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34627d = r1
            goto L18
        L13:
            l6.b$a r0 = new l6.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f34625b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34627d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f34624a
            k6.s r5 = (k6.s) r5
            L5.t.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            L5.t.b(r6)
            r0.f34624a = r5
            r0.f34627d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.B()
            if (r5 == 0) goto L4c
            L5.I r5 = L5.I.f6487a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.C3354b.h(k6.s, P5.d):java.lang.Object");
    }

    @Override // l6.C3356d, m6.e
    protected m6.e i(P5.g gVar, int i8, EnumC3132a enumC3132a) {
        return new C3354b(this.f34623e, gVar, i8, enumC3132a);
    }

    public C3354b(X5.n nVar, P5.g gVar, int i8, EnumC3132a enumC3132a) {
        super(nVar, gVar, i8, enumC3132a);
        this.f34623e = nVar;
    }
}
