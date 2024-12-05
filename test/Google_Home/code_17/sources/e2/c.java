package E2;

import O5.I;
import O5.s;
import O5.t;
import a6.InterfaceC1668n;
import kotlin.coroutines.jvm.internal.l;
import l6.M;
import l6.U;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f2299a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f2300b;

        /* renamed from: c, reason: collision with root package name */
        int f2301c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f2300b = obj;
            this.f2301c |= Integer.MIN_VALUE;
            Object b8 = c.b(null, 0L, null, this);
            if (b8 == T5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f2302a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U f2303b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U u8, S5.d dVar) {
            super(2, dVar);
            this.f2303b = u8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f2303b, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f2302a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                U u8 = this.f2303b;
                this.f2302a = 1;
                obj = u8.D(this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(l6.U r4, long r5, kotlin.jvm.functions.Function0 r7, S5.d r8) {
        /*
            boolean r0 = r8 instanceof E2.c.a
            if (r0 == 0) goto L13
            r0 = r8
            E2.c$a r0 = (E2.c.a) r0
            int r1 = r0.f2301c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f2301c = r1
            goto L18
        L13:
            E2.c$a r0 = new E2.c$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f2300b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f2301c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f2299a
            r7 = r4
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            O5.t.b(r8)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            O5.t.b(r8)
            E2.c$b r8 = new E2.c$b
            r2 = 0
            r8.<init>(r4, r2)
            r0.f2299a = r7
            r0.f2301c = r3
            java.lang.Object r8 = l6.a1.e(r5, r8, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            if (r8 == 0) goto L51
            java.lang.Object r4 = O5.s.b(r8)
            goto L66
        L51:
            O5.s$a r4 = O5.s.f8302b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Object r5 = r7.invoke()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5)
            java.lang.Object r4 = O5.t.a(r4)
            java.lang.Object r4 = O5.s.b(r4)
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: E2.c.b(l6.U, long, kotlin.jvm.functions.Function0, S5.d):java.lang.Object");
    }
}
