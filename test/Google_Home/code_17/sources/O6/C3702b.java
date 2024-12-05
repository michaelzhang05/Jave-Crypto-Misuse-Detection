package o6;

import a6.InterfaceC1668n;
import kotlin.jvm.internal.AbstractC3247p;
import n6.EnumC3487a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3702b extends C3704d {

    /* renamed from: e, reason: collision with root package name */
    private final InterfaceC1668n f36624e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o6.b$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36625a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36626b;

        /* renamed from: d, reason: collision with root package name */
        int f36628d;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36626b = obj;
            this.f36628d |= Integer.MIN_VALUE;
            return C3702b.this.h(null, this);
        }
    }

    public /* synthetic */ C3702b(InterfaceC1668n interfaceC1668n, S5.g gVar, int i8, EnumC3487a enumC3487a, int i9, AbstractC3247p abstractC3247p) {
        this(interfaceC1668n, (i9 & 2) != 0 ? S5.h.f9825a : gVar, (i9 & 4) != 0 ? -2 : i8, (i9 & 8) != 0 ? EnumC3487a.SUSPEND : enumC3487a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // o6.C3704d, p6.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(n6.s r5, S5.d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof o6.C3702b.a
            if (r0 == 0) goto L13
            r0 = r6
            o6.b$a r0 = (o6.C3702b.a) r0
            int r1 = r0.f36628d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36628d = r1
            goto L18
        L13:
            o6.b$a r0 = new o6.b$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36626b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f36628d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f36625a
            n6.s r5 = (n6.s) r5
            O5.t.b(r6)
            goto L43
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            O5.t.b(r6)
            r0.f36625a = r5
            r0.f36628d = r3
            java.lang.Object r6 = super.h(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            boolean r5 = r5.z()
            if (r5 == 0) goto L4c
            O5.I r5 = O5.I.f8278a
            return r5
        L4c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.C3702b.h(n6.s, S5.d):java.lang.Object");
    }

    @Override // o6.C3704d, p6.e
    protected p6.e i(S5.g gVar, int i8, EnumC3487a enumC3487a) {
        return new C3702b(this.f36624e, gVar, i8, enumC3487a);
    }

    public C3702b(InterfaceC1668n interfaceC1668n, S5.g gVar, int i8, EnumC3487a enumC3487a) {
        super(interfaceC1668n, gVar, i8, enumC3487a);
        this.f36624e = interfaceC1668n;
    }
}
