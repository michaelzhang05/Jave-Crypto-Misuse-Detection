package l3;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import com.stripe.android.view.InterfaceC2464p;
import j3.InterfaceC3074a;
import x2.j;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3176f implements InterfaceC3074a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l3.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f33899a;

        /* renamed from: b, reason: collision with root package name */
        Object f33900b;

        /* renamed from: c, reason: collision with root package name */
        Object f33901c;

        /* renamed from: d, reason: collision with root package name */
        Object f33902d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f33903e;

        /* renamed from: g, reason: collision with root package name */
        int f33905g;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f33903e = obj;
            this.f33905g |= Integer.MIN_VALUE;
            return AbstractC3176f.this.d(null, null, null, this);
        }
    }

    @Override // j3.InterfaceC3074a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        InterfaceC3074a.C0768a.b(this, activityResultCaller, activityResultCallback);
    }

    @Override // j3.InterfaceC3074a
    public void c() {
        InterfaceC3074a.C0768a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.stripe.android.view.InterfaceC2464p r6, java.lang.Object r7, x2.j.c r8, P5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof l3.AbstractC3176f.a
            if (r0 == 0) goto L13
            r0 = r9
            l3.f$a r0 = (l3.AbstractC3176f.a) r0
            int r1 = r0.f33905g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f33905g = r1
            goto L18
        L13:
            l3.f$a r0 = new l3.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f33903e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f33905g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r9)
            goto L72
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f33902d
            r8 = r6
            x2.j$c r8 = (x2.j.c) r8
            java.lang.Object r7 = r0.f33901c
            java.lang.Object r6 = r0.f33900b
            com.stripe.android.view.p r6 = (com.stripe.android.view.InterfaceC2464p) r6
            java.lang.Object r2 = r0.f33899a
            l3.f r2 = (l3.AbstractC3176f) r2
            L5.t.b(r9)
            goto L60
        L47:
            L5.t.b(r9)
            androidx.lifecycle.LifecycleOwner r9 = r6.d()
            r0.f33899a = r5
            r0.f33900b = r6
            r0.f33901c = r7
            r0.f33902d = r8
            r0.f33905g = r4
            java.lang.Object r9 = l3.AbstractC3177g.a(r9, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r2 = r5
        L60:
            r9 = 0
            r0.f33899a = r9
            r0.f33900b = r9
            r0.f33901c = r9
            r0.f33902d = r9
            r0.f33905g = r3
            java.lang.Object r6 = r2.e(r6, r7, r8, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            L5.I r6 = L5.I.f6487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.AbstractC3176f.d(com.stripe.android.view.p, java.lang.Object, x2.j$c, P5.d):java.lang.Object");
    }

    protected abstract Object e(InterfaceC2464p interfaceC2464p, Object obj, j.c cVar, P5.d dVar);
}
