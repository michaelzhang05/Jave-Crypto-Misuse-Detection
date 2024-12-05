package k6;

import L5.I;
import L5.s;
import i6.H;
import i6.InterfaceC2837o;
import i6.M;
import i6.O;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3160z;

/* loaded from: classes5.dex */
public abstract class q {

    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f33626a;

        /* renamed from: b */
        Object f33627b;

        /* renamed from: c */
        /* synthetic */ Object f33628c;

        /* renamed from: d */
        int f33629d;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33628c = obj;
            this.f33629d |= Integer.MIN_VALUE;
            return q.a(null, null, this);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends AbstractC3160z implements Function1 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2837o f33630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC2837o interfaceC2837o) {
            super(1);
            this.f33630a = interfaceC2837o;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return I.f6487a;
        }

        public final void invoke(Throwable th) {
            InterfaceC2837o interfaceC2837o = this.f33630a;
            s.a aVar = L5.s.f6511b;
            interfaceC2837o.resumeWith(L5.s.b(I.f6487a));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(k6.s r4, kotlin.jvm.functions.Function0 r5, P5.d r6) {
        /*
            boolean r0 = r6 instanceof k6.q.a
            if (r0 == 0) goto L13
            r0 = r6
            k6.q$a r0 = (k6.q.a) r0
            int r1 = r0.f33629d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33629d = r1
            goto L18
        L13:
            k6.q$a r0 = new k6.q$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f33628c
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f33629d
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.f33627b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.f33626a
            k6.s r4 = (k6.s) r4
            L5.t.b(r6)     // Catch: java.lang.Throwable -> L32
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
            L5.t.b(r6)
            P5.g r6 = r0.getContext()
            i6.x0$b r2 = i6.InterfaceC2855x0.f31809n0
            P5.g$b r6 = r6.get(r2)
            if (r6 != r4) goto L7f
            r0.f33626a = r4     // Catch: java.lang.Throwable -> L32
            r0.f33627b = r5     // Catch: java.lang.Throwable -> L32
            r0.f33629d = r3     // Catch: java.lang.Throwable -> L32
            i6.p r6 = new i6.p     // Catch: java.lang.Throwable -> L32
            P5.d r2 = Q5.b.c(r0)     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L32
            r6.B()     // Catch: java.lang.Throwable -> L32
            k6.q$b r2 = new k6.q$b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r4.s(r2)     // Catch: java.lang.Throwable -> L32
            java.lang.Object r4 = r6.y()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r6 = Q5.b.e()     // Catch: java.lang.Throwable -> L32
            if (r4 != r6) goto L72
            kotlin.coroutines.jvm.internal.h.c(r0)     // Catch: java.lang.Throwable -> L32
        L72:
            if (r4 != r1) goto L75
            return r1
        L75:
            r5.invoke()
            L5.I r4 = L5.I.f6487a
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
        throw new UnsupportedOperationException("Method not decompiled: k6.q.a(k6.s, kotlin.jvm.functions.Function0, P5.d):java.lang.Object");
    }

    public static final u b(M m8, P5.g gVar, int i8, EnumC3132a enumC3132a, O o8, Function1 function1, X5.n nVar) {
        r rVar = new r(H.e(m8, gVar), g.b(i8, enumC3132a, null, 4, null));
        if (function1 != null) {
            rVar.u(function1);
        }
        rVar.N0(o8, rVar, nVar);
        return rVar;
    }

    public static /* synthetic */ u c(M m8, P5.g gVar, int i8, EnumC3132a enumC3132a, O o8, Function1 function1, X5.n nVar, int i9, Object obj) {
        int i10;
        if ((i9 & 1) != 0) {
            gVar = P5.h.f7994a;
        }
        P5.g gVar2 = gVar;
        if ((i9 & 2) != 0) {
            i10 = 0;
        } else {
            i10 = i8;
        }
        if ((i9 & 4) != 0) {
            enumC3132a = EnumC3132a.SUSPEND;
        }
        EnumC3132a enumC3132a2 = enumC3132a;
        if ((i9 & 8) != 0) {
            o8 = O.DEFAULT;
        }
        O o9 = o8;
        if ((i9 & 16) != 0) {
            function1 = null;
        }
        return b(m8, gVar2, i10, enumC3132a2, o9, function1, nVar);
    }
}
