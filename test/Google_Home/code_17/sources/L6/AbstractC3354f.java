package l6;

import P5.AbstractC1378t;
import java.util.Collection;

/* renamed from: l6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3354f {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: l6.f$a */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f34617a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f34618b;

        /* renamed from: c, reason: collision with root package name */
        int f34619c;

        a(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f34618b = obj;
            this.f34619c |= Integer.MIN_VALUE;
            return AbstractC3354f.b(null, this);
        }
    }

    public static final Object a(Collection collection, S5.d dVar) {
        if (collection.isEmpty()) {
            return AbstractC1378t.m();
        }
        return new C3352e((U[]) collection.toArray(new U[0])).c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.Collection r4, S5.d r5) {
        /*
            boolean r0 = r5 instanceof l6.AbstractC3354f.a
            if (r0 == 0) goto L13
            r0 = r5
            l6.f$a r0 = (l6.AbstractC3354f.a) r0
            int r1 = r0.f34619c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f34619c = r1
            goto L18
        L13:
            l6.f$a r0 = new l6.f$a
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f34618b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f34619c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f34617a
            java.util.Iterator r4 = (java.util.Iterator) r4
            O5.t.b(r5)
            goto L3e
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            O5.t.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r4.next()
            l6.x0 r5 = (l6.InterfaceC3390x0) r5
            r0.f34617a = r4
            r0.f34619c = r3
            java.lang.Object r5 = r5.y(r0)
            if (r5 != r1) goto L3e
            return r1
        L55:
            O5.I r4 = O5.I.f8278a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.AbstractC3354f.b(java.util.Collection, S5.d):java.lang.Object");
    }
}
