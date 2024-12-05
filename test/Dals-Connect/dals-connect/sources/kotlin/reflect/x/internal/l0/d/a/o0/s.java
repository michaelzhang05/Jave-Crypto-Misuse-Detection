package kotlin.reflect.x.internal.l0.d.a.o0;

import java.util.Set;
import kotlin.collections.b0;
import kotlin.collections.r;
import kotlin.collections.v0;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.f.c;
import kotlin.reflect.x.internal.l0.l.m1;
import kotlin.reflect.x.internal.l0.l.w1.i;

/* compiled from: typeEnhancementUtils.kt */
/* loaded from: classes2.dex */
public final class s {
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d2, code lost:
    
        if (r6 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.x.internal.l0.d.a.o0.e a(kotlin.reflect.x.internal.l0.d.a.o0.e r6, java.util.Collection<kotlin.reflect.x.internal.l0.d.a.o0.e> r7, boolean r8, boolean r9, boolean r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.l.f(r6, r0)
            java.lang.String r0 = "superQualifiers"
            kotlin.jvm.internal.l.f(r7, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r7.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r1.next()
            kotlin.f0.x.e.l0.d.a.o0.e r2 = (kotlin.reflect.x.internal.l0.d.a.o0.e) r2
            kotlin.f0.x.e.l0.d.a.o0.h r2 = b(r2)
            if (r2 == 0) goto L13
            r0.add(r2)
            goto L13
        L29:
            java.util.Set r0 = kotlin.collections.r.C0(r0)
            kotlin.f0.x.e.l0.d.a.o0.h r1 = b(r6)
            kotlin.f0.x.e.l0.d.a.o0.h r0 = e(r0, r1, r8)
            if (r0 != 0) goto L63
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        L40:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            kotlin.f0.x.e.l0.d.a.o0.e r3 = (kotlin.reflect.x.internal.l0.d.a.o0.e) r3
            kotlin.f0.x.e.l0.d.a.o0.h r3 = r3.d()
            if (r3 == 0) goto L40
            r1.add(r3)
            goto L40
        L56:
            java.util.Set r1 = kotlin.collections.r.C0(r1)
            kotlin.f0.x.e.l0.d.a.o0.h r2 = r6.d()
            kotlin.f0.x.e.l0.d.a.o0.h r1 = e(r1, r2, r8)
            goto L64
        L63:
            r1 = r0
        L64:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r7.iterator()
        L6d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L83
            java.lang.Object r4 = r3.next()
            kotlin.f0.x.e.l0.d.a.o0.e r4 = (kotlin.reflect.x.internal.l0.d.a.o0.e) r4
            kotlin.f0.x.e.l0.d.a.o0.f r4 = r4.c()
            if (r4 == 0) goto L6d
            r2.add(r4)
            goto L6d
        L83:
            java.util.Set r2 = kotlin.collections.r.C0(r2)
            kotlin.f0.x.e.l0.d.a.o0.f r3 = kotlin.reflect.x.internal.l0.d.a.o0.f.MUTABLE
            kotlin.f0.x.e.l0.d.a.o0.f r4 = kotlin.reflect.x.internal.l0.d.a.o0.f.READ_ONLY
            kotlin.f0.x.e.l0.d.a.o0.f r5 = r6.c()
            java.lang.Object r8 = d(r2, r3, r4, r5, r8)
            kotlin.f0.x.e.l0.d.a.o0.f r8 = (kotlin.reflect.x.internal.l0.d.a.o0.f) r8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto La9
            if (r10 != 0) goto La5
            if (r9 == 0) goto La3
            kotlin.f0.x.e.l0.d.a.o0.h r9 = kotlin.reflect.x.internal.l0.d.a.o0.h.NULLABLE
            if (r1 != r9) goto La3
            goto La5
        La3:
            r9 = 0
            goto La6
        La5:
            r9 = 1
        La6:
            if (r9 != 0) goto La9
            r2 = r1
        La9:
            kotlin.f0.x.e.l0.d.a.o0.h r9 = kotlin.reflect.x.internal.l0.d.a.o0.h.NOT_NULL
            if (r2 != r9) goto Ld6
            boolean r6 = r6.b()
            if (r6 != 0) goto Ld4
            boolean r6 = r7.isEmpty()
            if (r6 == 0) goto Lbb
        Lb9:
            r6 = 0
            goto Ld2
        Lbb:
            java.util.Iterator r6 = r7.iterator()
        Lbf:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto Lb9
            java.lang.Object r7 = r6.next()
            kotlin.f0.x.e.l0.d.a.o0.e r7 = (kotlin.reflect.x.internal.l0.d.a.o0.e) r7
            boolean r7 = r7.b()
            if (r7 == 0) goto Lbf
            r6 = 1
        Ld2:
            if (r6 == 0) goto Ld6
        Ld4:
            r6 = 1
            goto Ld7
        Ld6:
            r6 = 0
        Ld7:
            if (r2 == 0) goto Ldc
            if (r0 == r1) goto Ldc
            goto Ldd
        Ldc:
            r3 = 0
        Ldd:
            kotlin.f0.x.e.l0.d.a.o0.e r7 = new kotlin.f0.x.e.l0.d.a.o0.e
            r7.<init>(r2, r8, r6, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.x.internal.l0.d.a.o0.s.a(kotlin.f0.x.e.l0.d.a.o0.e, java.util.Collection, boolean, boolean, boolean):kotlin.f0.x.e.l0.d.a.o0.e");
    }

    private static final h b(e eVar) {
        if (eVar.e()) {
            return null;
        }
        return eVar.d();
    }

    public static final boolean c(m1 m1Var, i iVar) {
        l.f(m1Var, "<this>");
        l.f(iVar, "type");
        c cVar = a0.u;
        l.e(cVar, "ENHANCED_NULLABILITY_ANNOTATION");
        return m1Var.l0(iVar, cVar);
    }

    private static final <T> T d(Set<? extends T> set, T t, T t2, T t3, boolean z) {
        Set k2;
        Set<? extends T> C0;
        if (z) {
            T t4 = set.contains(t) ? t : set.contains(t2) ? t2 : null;
            if (l.a(t4, t) && l.a(t3, t2)) {
                return null;
            }
            return t3 == null ? t4 : t3;
        }
        if (t3 != null) {
            k2 = v0.k(set, t3);
            C0 = b0.C0(k2);
            if (C0 != null) {
                set = C0;
            }
        }
        return (T) r.o0(set);
    }

    private static final h e(Set<? extends h> set, h hVar, boolean z) {
        h hVar2 = h.FORCE_FLEXIBILITY;
        return hVar == hVar2 ? hVar2 : (h) d(set, h.NOT_NULL, h.NULLABLE, hVar, z);
    }
}
