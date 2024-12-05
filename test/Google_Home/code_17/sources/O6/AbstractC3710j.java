package o6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class AbstractC3710j {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.j$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36643a;

        /* renamed from: b, reason: collision with root package name */
        Object f36644b;

        /* renamed from: c, reason: collision with root package name */
        Object f36645c;

        /* renamed from: d, reason: collision with root package name */
        boolean f36646d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f36647e;

        /* renamed from: f, reason: collision with root package name */
        int f36648f;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36647e = obj;
            this.f36648f |= Integer.MIN_VALUE;
            return AbstractC3710j.d(null, null, false, this);
        }
    }

    public static final InterfaceC3706f b(n6.u uVar) {
        return new C3703c(uVar, true, null, 0, null, 28, null);
    }

    public static final Object c(InterfaceC3707g interfaceC3707g, n6.u uVar, S5.d dVar) {
        Object d8 = d(interfaceC3707g, uVar, true, dVar);
        if (d8 == T5.b.e()) {
            return d8;
        }
        return O5.I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(o6.InterfaceC3707g r6, n6.u r7, boolean r8, S5.d r9) {
        /*
            boolean r0 = r9 instanceof o6.AbstractC3710j.a
            if (r0 == 0) goto L13
            r0 = r9
            o6.j$a r0 = (o6.AbstractC3710j.a) r0
            int r1 = r0.f36648f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36648f = r1
            goto L18
        L13:
            o6.j$a r0 = new o6.j$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f36647e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36648f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.f36646d
            java.lang.Object r6 = r0.f36645c
            n6.f r6 = (n6.f) r6
            java.lang.Object r7 = r0.f36644b
            n6.u r7 = (n6.u) r7
            java.lang.Object r2 = r0.f36643a
            o6.g r2 = (o6.InterfaceC3707g) r2
            O5.t.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.f36646d
            java.lang.Object r6 = r0.f36645c
            n6.f r6 = (n6.f) r6
            java.lang.Object r7 = r0.f36644b
            n6.u r7 = (n6.u) r7
            java.lang.Object r2 = r0.f36643a
            o6.g r2 = (o6.InterfaceC3707g) r2
            O5.t.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            O5.t.b(r9)
            o6.AbstractC3708h.u(r6)
            n6.f r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.f36643a = r6     // Catch: java.lang.Throwable -> L3c
            r0.f36644b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f36645c = r9     // Catch: java.lang.Throwable -> L3c
            r0.f36646d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f36648f = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.b(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            return r1
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.f36643a = r2     // Catch: java.lang.Throwable -> L3c
            r0.f36644b = r7     // Catch: java.lang.Throwable -> L3c
            r0.f36645c = r6     // Catch: java.lang.Throwable -> L3c
            r0.f36646d = r8     // Catch: java.lang.Throwable -> L3c
            r0.f36648f = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.emit(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            n6.k.a(r7, r6)
        L9a:
            O5.I r6 = O5.I.f8278a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            n6.k.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.AbstractC3710j.d(o6.g, n6.u, boolean, S5.d):java.lang.Object");
    }
}
