package i3;

import L5.s;
import e3.m;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: i3.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2780c {

    /* renamed from: a, reason: collision with root package name */
    private final m f31584a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i3.c$a */
    /* loaded from: classes4.dex */
    public static final class a extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31585a;

        /* renamed from: c, reason: collision with root package name */
        int f31587c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31585a = obj;
            this.f31587c |= Integer.MIN_VALUE;
            Object a8 = C2780c.this.a(null, null, this);
            if (a8 == Q5.b.e()) {
                return a8;
            }
            return s.a(a8);
        }
    }

    public C2780c(m stripeRepository) {
        AbstractC3159y.i(stripeRepository, "stripeRepository");
        this.f31584a = stripeRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r13, java.lang.String r14, P5.d r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof i3.C2780c.a
            if (r0 == 0) goto L14
            r0 = r15
            i3.c$a r0 = (i3.C2780c.a) r0
            int r1 = r0.f31587c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f31587c = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            i3.c$a r0 = new i3.c$a
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r5.f31585a
            java.lang.Object r0 = Q5.b.e()
            int r1 = r5.f31587c
            r2 = 1
            if (r1 == 0) goto L39
            if (r1 != r2) goto L31
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r13 = r15.k()
            goto L56
        L31:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L39:
            L5.t.b(r15)
            e3.m r1 = r12.f31584a
            x2.j$c r3 = new x2.j$c
            r10 = 6
            r11 = 0
            r8 = 0
            r9 = 0
            r6 = r3
            r7 = r13
            r6.<init>(r7, r8, r9, r10, r11)
            r5.f31587c = r2
            r4 = 0
            r6 = 4
            r7 = 0
            r2 = r14
            java.lang.Object r13 = e3.m.a.d(r1, r2, r3, r4, r5, r6, r7)
            if (r13 != r0) goto L56
            return r0
        L56:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i3.C2780c.a(java.lang.String, java.lang.String, P5.d):java.lang.Object");
    }
}
