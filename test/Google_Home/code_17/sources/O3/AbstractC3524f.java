package o3;

import A2.j;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import com.stripe.android.view.InterfaceC2658p;
import m3.InterfaceC3428a;

/* renamed from: o3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3524f implements InterfaceC3428a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o3.f$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f35900a;

        /* renamed from: b, reason: collision with root package name */
        Object f35901b;

        /* renamed from: c, reason: collision with root package name */
        Object f35902c;

        /* renamed from: d, reason: collision with root package name */
        Object f35903d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f35904e;

        /* renamed from: g, reason: collision with root package name */
        int f35906g;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f35904e = obj;
            this.f35906g |= Integer.MIN_VALUE;
            return AbstractC3524f.this.d(null, null, null, this);
        }
    }

    @Override // m3.InterfaceC3428a
    public void b(ActivityResultCaller activityResultCaller, ActivityResultCallback activityResultCallback) {
        InterfaceC3428a.C0798a.b(this, activityResultCaller, activityResultCallback);
    }

    @Override // m3.InterfaceC3428a
    public void c() {
        InterfaceC3428a.C0798a.a(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.stripe.android.view.InterfaceC2658p r6, java.lang.Object r7, A2.j.c r8, S5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof o3.AbstractC3524f.a
            if (r0 == 0) goto L13
            r0 = r9
            o3.f$a r0 = (o3.AbstractC3524f.a) r0
            int r1 = r0.f35906g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35906g = r1
            goto L18
        L13:
            o3.f$a r0 = new o3.f$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f35904e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f35906g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r9)
            goto L72
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            java.lang.Object r6 = r0.f35903d
            r8 = r6
            A2.j$c r8 = (A2.j.c) r8
            java.lang.Object r7 = r0.f35902c
            java.lang.Object r6 = r0.f35901b
            com.stripe.android.view.p r6 = (com.stripe.android.view.InterfaceC2658p) r6
            java.lang.Object r2 = r0.f35900a
            o3.f r2 = (o3.AbstractC3524f) r2
            O5.t.b(r9)
            goto L60
        L47:
            O5.t.b(r9)
            androidx.lifecycle.LifecycleOwner r9 = r6.d()
            r0.f35900a = r5
            r0.f35901b = r6
            r0.f35902c = r7
            r0.f35903d = r8
            r0.f35906g = r4
            java.lang.Object r9 = o3.AbstractC3525g.a(r9, r0)
            if (r9 != r1) goto L5f
            return r1
        L5f:
            r2 = r5
        L60:
            r9 = 0
            r0.f35900a = r9
            r0.f35901b = r9
            r0.f35902c = r9
            r0.f35903d = r9
            r0.f35906g = r3
            java.lang.Object r6 = r2.e(r6, r7, r8, r0)
            if (r6 != r1) goto L72
            return r1
        L72:
            O5.I r6 = O5.I.f8278a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o3.AbstractC3524f.d(com.stripe.android.view.p, java.lang.Object, A2.j$c, S5.d):java.lang.Object");
    }

    protected abstract Object e(InterfaceC2658p interfaceC2658p, Object obj, j.c cVar, S5.d dVar);
}
