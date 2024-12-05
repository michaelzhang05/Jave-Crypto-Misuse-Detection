package l6;

/* renamed from: l6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3353a implements InterfaceC3358f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0785a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34619a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34620b;

        /* renamed from: d, reason: collision with root package name */
        int f34622d;

        C0785a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34620b = obj;
            this.f34622d |= Integer.MIN_VALUE;
            return AbstractC3353a.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // l6.InterfaceC3358f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(l6.InterfaceC3359g r6, P5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l6.AbstractC3353a.C0785a
            if (r0 == 0) goto L13
            r0 = r7
            l6.a$a r0 = (l6.AbstractC3353a.C0785a) r0
            int r1 = r0.f34622d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34622d = r1
            goto L18
        L13:
            l6.a$a r0 = new l6.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f34620b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f34622d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f34619a
            m6.t r6 = (m6.t) r6
            L5.t.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            L5.t.b(r7)
            m6.t r7 = new m6.t
            P5.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f34619a = r7     // Catch: java.lang.Throwable -> L55
            r0.f34622d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.f(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            L5.I r6 = L5.I.f6487a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3353a.collect(l6.g, P5.d):java.lang.Object");
    }

    public abstract Object f(InterfaceC3359g interfaceC3359g, P5.d dVar);
}
