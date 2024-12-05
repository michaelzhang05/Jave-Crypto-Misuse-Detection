package o6;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3701a implements InterfaceC3706f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0814a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36620a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36621b;

        /* renamed from: d, reason: collision with root package name */
        int f36623d;

        C0814a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36621b = obj;
            this.f36623d |= Integer.MIN_VALUE;
            return AbstractC3701a.this.collect(null, this);
        }
    }

    public abstract Object b(InterfaceC3707g interfaceC3707g, S5.d dVar);

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // o6.InterfaceC3706f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object collect(o6.InterfaceC3707g r6, S5.d r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof o6.AbstractC3701a.C0814a
            if (r0 == 0) goto L13
            r0 = r7
            o6.a$a r0 = (o6.AbstractC3701a.C0814a) r0
            int r1 = r0.f36623d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36623d = r1
            goto L18
        L13:
            o6.a$a r0 = new o6.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36621b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36623d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.f36620a
            p6.t r6 = (p6.t) r6
            O5.t.b(r7)     // Catch: java.lang.Throwable -> L2d
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
            O5.t.b(r7)
            p6.t r7 = new p6.t
            S5.g r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.f36620a = r7     // Catch: java.lang.Throwable -> L55
            r0.f36623d = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.b(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.releaseIntercepted()
            O5.I r6 = O5.I.f8278a
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
        throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3701a.collect(o6.g, S5.d):java.lang.Object");
    }
}
