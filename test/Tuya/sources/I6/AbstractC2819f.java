package i6;

import M5.AbstractC1246t;
import java.util.Collection;

/* renamed from: i6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2819f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i6.f$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f31765a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31766b;

        /* renamed from: c, reason: collision with root package name */
        int f31767c;

        a(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f31766b = obj;
            this.f31767c |= Integer.MIN_VALUE;
            return AbstractC2819f.b(null, this);
        }
    }

    public static final Object a(Collection collection, P5.d dVar) {
        if (collection.isEmpty()) {
            return AbstractC1246t.m();
        }
        return new C2817e((U[]) collection.toArray(new U[0])).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.Collection r4, P5.d r5) {
        /*
            boolean r0 = r5 instanceof i6.AbstractC2819f.a
            if (r0 == 0) goto L13
            r0 = r5
            i6.f$a r0 = (i6.AbstractC2819f.a) r0
            int r1 = r0.f31767c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f31767c = r1
            goto L18
        L13:
            i6.f$a r0 = new i6.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f31766b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f31767c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f31765a
            java.util.Iterator r4 = (java.util.Iterator) r4
            L5.t.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            L5.t.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            i6.x0 r5 = (i6.InterfaceC2855x0) r5
            r0.f31765a = r4
            r0.f31767c = r3
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            L5.I r4 = L5.I.f6487a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i6.AbstractC2819f.b(java.util.Collection, P5.d):java.lang.Object");
    }
}
