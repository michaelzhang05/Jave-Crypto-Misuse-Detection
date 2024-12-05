package n6;

import O5.I;
import O5.s;
import a6.InterfaceC1668n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;
import l6.H;
import l6.InterfaceC3372o;
import l6.M;
import l6.O;

/* loaded from: classes5.dex */
public abstract class q {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f35618a;

        /* renamed from: b */
        Object f35619b;

        /* renamed from: c */
        /* synthetic */ Object f35620c;

        /* renamed from: d */
        int f35621d;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35620c = obj;
            this.f35621d |= Integer.MIN_VALUE;
            return q.a(null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3256z implements Function1 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3372o f35622a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC3372o interfaceC3372o) {
            super(1);
            this.f35622a = interfaceC3372o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f8278a;
        }

        public final void invoke(Throwable th) {
            InterfaceC3372o interfaceC3372o = this.f35622a;
            s.a aVar = O5.s.f8302b;
            interfaceC3372o.resumeWith(O5.s.b(I.f8278a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(n6.s r4, kotlin.jvm.functions.Function0 r5, S5.d r6) {
        /*
            boolean r0 = r6 instanceof n6.q.a
            if (r0 == 0) goto L13
            r0 = r6
            n6.q$a r0 = (n6.q.a) r0
            int r1 = r0.f35621d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35621d = r1
            goto L18
        L13:
            n6.q$a r0 = new n6.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f35620c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f35621d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f35619b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f35618a
            n6.s r4 = (n6.s) r4
            O5.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L75
        L32:
            r4 = move-exception
            goto L7b
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            O5.t.b(r6)
            S5.g r6 = r0.getContext()
            l6.x0$b r2 = l6.InterfaceC3390x0.f34661n0
            S5.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f35618a = r4     // Catch: java.lang.Throwable -> L32
            r0.f35619b = r5     // Catch: java.lang.Throwable -> L32
            r0.f35621d = r3     // Catch: java.lang.Throwable -> L32
            l6.p r6 = new l6.p     // Catch: java.lang.Throwable -> L32
            S5.d r2 = T5.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.C()     // Catch: java.lang.Throwable -> L32
            n6.q$b r2 = new n6.q$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.v(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.y()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = T5.b.e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            O5.I r4 = O5.I.f8278a
            return r4
        L7b:
            r5.invoke()
            throw r4
        L7f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n6.q.a(n6.s, kotlin.jvm.functions.Function0, S5.d):java.lang.Object");
    }

    public static final u b(M m8, S5.g gVar, int i8, EnumC3487a enumC3487a, O o8, Function1 function1, InterfaceC1668n interfaceC1668n) {
        r rVar = new r(H.e(m8, gVar), g.b(i8, enumC3487a, null, 4, null));
        if (function1 != null) {
            rVar.s(function1);
        }
        rVar.M0(o8, rVar, interfaceC1668n);
        return rVar;
    }

    public static /* synthetic */ u c(M m8, S5.g gVar, int i8, EnumC3487a enumC3487a, O o8, Function1 function1, InterfaceC1668n interfaceC1668n, int i9, Object obj) {
        int i10;
        if ((i9 & 1) != 0) {
            gVar = S5.h.f9825a;
        }
        S5.g gVar2 = gVar;
        if ((i9 & 2) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        if ((i9 & 4) != 0) {
            enumC3487a = EnumC3487a.SUSPEND;
        }
        EnumC3487a enumC3487a2 = enumC3487a;
        if ((i9 & 8) != 0) {
            o8 = O.DEFAULT;
        }
        O o9 = o8;
        if ((i9 & 16) != 0) {
            function1 = null;
        }
        return b(m8, gVar2, i10, enumC3487a2, o9, function1, interfaceC1668n);
    }
}
