package o3;

import O5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3256z;
import l6.InterfaceC3389x;

/* renamed from: o3.g */
/* loaded from: classes4.dex */
public abstract class AbstractC3525g {

    /* renamed from: o3.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3256z implements Function0 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC3389x f35907a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3389x interfaceC3389x) {
            super(0);
            this.f35907a = interfaceC3389x;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(this.f35907a.u(I.f8278a));
        }
    }

    /* renamed from: o3.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f35908a;

        /* renamed from: b */
        /* synthetic */ Object f35909b;

        /* renamed from: c */
        int f35910c;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35909b = obj;
            this.f35910c |= Integer.MIN_VALUE;
            return AbstractC3525g.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.lifecycle.LifecycleOwner r10, S5.d r11) {
        /*
            boolean r0 = r11 instanceof o3.AbstractC3525g.b
            if (r0 == 0) goto L13
            r0 = r11
            o3.g$b r0 = (o3.AbstractC3525g.b) r0
            int r1 = r0.f35910c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35910c = r1
            goto L18
        L13:
            o3.g$b r0 = new o3.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f35909b
            java.lang.Object r7 = T5.b.e()
            int r1 = r0.f35910c
            r8 = 2
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            O5.t.b(r11)
            goto L9e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.f35908a
            l6.x r10 = (l6.InterfaceC3389x) r10
            O5.t.b(r11)
            goto L92
        L3e:
            O5.t.b(r11)
            l6.x r11 = l6.AbstractC3393z.b(r9, r2, r9)
            androidx.lifecycle.Lifecycle r1 = r10.getLifecycle()
            androidx.lifecycle.Lifecycle$State r10 = androidx.lifecycle.Lifecycle.State.RESUMED
            l6.J0 r3 = l6.C3347b0.c()
            l6.J0 r4 = r3.G()
            S5.g r3 = r0.getContext()
            boolean r3 = r4.isDispatchNeeded(r3)
            if (r3 != 0) goto L7f
            androidx.lifecycle.Lifecycle$State r5 = r1.getCurrentState()
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r6) goto L79
            androidx.lifecycle.Lifecycle$State r5 = r1.getCurrentState()
            int r5 = r5.compareTo(r10)
            if (r5 < 0) goto L7f
            O5.I r10 = O5.I.f8278a
            boolean r10 = r11.u(r10)
            kotlin.coroutines.jvm.internal.b.a(r10)
            goto L93
        L79:
            androidx.lifecycle.LifecycleDestroyedException r10 = new androidx.lifecycle.LifecycleDestroyedException
            r10.<init>()
            throw r10
        L7f:
            o3.g$a r5 = new o3.g$a
            r5.<init>(r11)
            r0.f35908a = r11
            r0.f35910c = r2
            r2 = r10
            r6 = r0
            java.lang.Object r10 = androidx.lifecycle.WithLifecycleStateKt.suspendWithStateAtLeastUnchecked(r1, r2, r3, r4, r5, r6)
            if (r10 != r7) goto L91
            return r7
        L91:
            r10 = r11
        L92:
            r11 = r10
        L93:
            r0.f35908a = r9
            r0.f35910c = r8
            java.lang.Object r10 = r11.D(r0)
            if (r10 != r7) goto L9e
            return r7
        L9e:
            O5.I r10 = O5.I.f8278a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.AbstractC3525g.b(androidx.lifecycle.LifecycleOwner, S5.d):java.lang.Object");
    }
}
