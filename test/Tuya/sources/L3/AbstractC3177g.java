package l3;

import L5.I;
import i6.InterfaceC2854x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: l3.g */
/* loaded from: classes4.dex */
public abstract class AbstractC3177g {

    /* renamed from: l3.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3160z implements Function0 {

        /* renamed from: a */
        final /* synthetic */ InterfaceC2854x f33906a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2854x interfaceC2854x) {
            super(0);
            this.f33906a = interfaceC2854x;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return Boolean.valueOf(this.f33906a.x(I.f6487a));
        }
    }

    /* renamed from: l3.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f33907a;

        /* renamed from: b */
        /* synthetic */ Object f33908b;

        /* renamed from: c */
        int f33909c;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33908b = obj;
            this.f33909c |= Integer.MIN_VALUE;
            return AbstractC3177g.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(androidx.lifecycle.LifecycleOwner r10, P5.d r11) {
        /*
            boolean r0 = r11 instanceof l3.AbstractC3177g.b
            if (r0 == 0) goto L13
            r0 = r11
            l3.g$b r0 = (l3.AbstractC3177g.b) r0
            int r1 = r0.f33909c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33909c = r1
            goto L18
        L13:
            l3.g$b r0 = new l3.g$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f33908b
            java.lang.Object r7 = Q5.b.e()
            int r1 = r0.f33909c
            r8 = 2
            r9 = 0
            r2 = 1
            if (r1 == 0) goto L3e
            if (r1 == r2) goto L36
            if (r1 != r8) goto L2e
            L5.t.b(r11)
            goto L9e
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            java.lang.Object r10 = r0.f33907a
            i6.x r10 = (i6.InterfaceC2854x) r10
            L5.t.b(r11)
            goto L92
        L3e:
            L5.t.b(r11)
            i6.x r11 = i6.AbstractC2858z.b(r9, r2, r9)
            androidx.lifecycle.Lifecycle r1 = r10.getLifecycle()
            androidx.lifecycle.Lifecycle$State r10 = androidx.lifecycle.Lifecycle.State.RESUMED
            i6.J0 r3 = i6.C2812b0.c()
            i6.J0 r4 = r3.G()
            P5.g r3 = r0.getContext()
            boolean r3 = r4.isDispatchNeeded(r3)
            if (r3 != 0) goto L7f
            androidx.lifecycle.Lifecycle$State r5 = r1.getCurrentState()
            androidx.lifecycle.Lifecycle$State r6 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r5 == r6) goto L79
            androidx.lifecycle.Lifecycle$State r5 = r1.getCurrentState()
            int r5 = r5.compareTo(r10)
            if (r5 < 0) goto L7f
            L5.I r10 = L5.I.f6487a
            boolean r10 = r11.x(r10)
            kotlin.coroutines.jvm.internal.b.a(r10)
            goto L93
        L79:
            androidx.lifecycle.LifecycleDestroyedException r10 = new androidx.lifecycle.LifecycleDestroyedException
            r10.<init>()
            throw r10
        L7f:
            l3.g$a r5 = new l3.g$a
            r5.<init>(r11)
            r0.f33907a = r11
            r0.f33909c = r2
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
            r0.f33907a = r9
            r0.f33909c = r8
            java.lang.Object r10 = r11.g(r0)
            if (r10 != r7) goto L9e
            return r7
        L9e:
            L5.I r10 = L5.I.f6487a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC3177g.b(androidx.lifecycle.LifecycleOwner, P5.d):java.lang.Object");
    }
}
