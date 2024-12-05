package B2;

import L5.I;
import L5.s;
import L5.t;
import X5.n;
import i6.M;
import i6.U;
import kotlin.coroutines.jvm.internal.l;

/* loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f704a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f705b;

        /* renamed from: c, reason: collision with root package name */
        int f706c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f705b = obj;
            this.f706c |= Integer.MIN_VALUE;
            Object b8 = c.b(null, 0L, null, this);
            if (b8 == Q5.b.e()) {
                return b8;
            }
            return s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f707a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ U f708b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(U u8, P5.d dVar) {
            super(2, dVar);
            this.f708b = u8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f708b, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f707a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                U u8 = this.f708b;
                this.f707a = 1;
                obj = u8.g(this);
                if (obj == e8) {
                    return e8;
                }
            }
            return obj;
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
    public static final java.lang.Object b(i6.U r4, long r5, kotlin.jvm.functions.Function0 r7, P5.d r8) {
        /*
            boolean r0 = r8 instanceof B2.c.a
            if (r0 == 0) goto L13
            r0 = r8
            B2.c$a r0 = (B2.c.a) r0
            int r1 = r0.f706c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f706c = r1
            goto L18
        L13:
            B2.c$a r0 = new B2.c$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f705b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f706c
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r4 = r0.f704a
            r7 = r4
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            L5.t.b(r8)
            goto L4a
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            L5.t.b(r8)
            B2.c$b r8 = new B2.c$b
            r2 = 0
            r8.<init>(r4, r2)
            r0.f704a = r7
            r0.f706c = r3
            java.lang.Object r8 = i6.a1.e(r5, r8, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            if (r8 == 0) goto L51
            java.lang.Object r4 = L5.s.b(r8)
            goto L66
        L51:
            L5.s$a r4 = L5.s.f6511b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.Object r5 = r7.invoke()
            java.lang.String r5 = (java.lang.String) r5
            r4.<init>(r5)
            java.lang.Object r4 = L5.t.a(r4)
            java.lang.Object r4 = L5.s.b(r4)
        L66:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: B2.c.b(i6.U, long, kotlin.jvm.functions.Function0, P5.d):java.lang.Object");
    }
}
