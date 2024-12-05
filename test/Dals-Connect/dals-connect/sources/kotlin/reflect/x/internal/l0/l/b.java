package kotlin.reflect.x.internal.l0.l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.i.t.a;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: AbstractClassTypeConstructor.java */
/* loaded from: classes2.dex */
public abstract class b extends g implements e1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n nVar) {
        super(nVar);
        if (nVar == null) {
            v(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void v(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.l.b.v(int):void");
    }

    @Override // kotlin.reflect.x.internal.l0.l.m
    protected boolean i(h hVar) {
        if (hVar == null) {
            v(2);
        }
        return (hVar instanceof e) && g(w(), hVar);
    }

    @Override // kotlin.reflect.x.internal.l0.l.g
    protected e0 m() {
        if (kotlin.reflect.x.internal.l0.b.h.t0(w())) {
            return null;
        }
        return o().i();
    }

    @Override // kotlin.reflect.x.internal.l0.l.g
    protected Collection<e0> n(boolean z) {
        m b2 = w().b();
        if (!(b2 instanceof e)) {
            List emptyList = Collections.emptyList();
            if (emptyList == null) {
                v(3);
            }
            return emptyList;
        }
        kotlin.reflect.jvm.internal.impl.utils.e eVar = new kotlin.reflect.jvm.internal.impl.utils.e();
        e eVar2 = (e) b2;
        eVar.add(eVar2.s());
        e U = eVar2.U();
        if (z && U != null) {
            eVar.add(U.s());
        }
        return eVar;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        kotlin.reflect.x.internal.l0.b.h f2 = a.f(w());
        if (f2 == null) {
            v(1);
        }
        return f2;
    }

    public abstract e w();
}
