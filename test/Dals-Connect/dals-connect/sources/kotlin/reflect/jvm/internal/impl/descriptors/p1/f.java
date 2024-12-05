package kotlin.reflect.jvm.internal.impl.descriptors.p1;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.i1;
import kotlin.reflect.jvm.internal.impl.descriptors.w0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.l.l1;

/* compiled from: ClassConstructorDescriptorImpl.java */
/* loaded from: classes2.dex */
public class f extends p implements kotlin.reflect.jvm.internal.impl.descriptors.d {
    protected final boolean J;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.l lVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, boolean z, b.a aVar, z0 z0Var) {
        super(eVar, lVar, gVar, kotlin.reflect.x.internal.l0.f.h.f20732i, aVar, z0Var);
        if (eVar == null) {
            v(0);
        }
        if (gVar == null) {
            v(1);
        }
        if (aVar == null) {
            v(2);
        }
        if (z0Var == null) {
            v(3);
        }
        this.J = z;
    }

    private List<w0> l1() {
        kotlin.reflect.jvm.internal.impl.descriptors.e b2 = b();
        if (!b2.F0().isEmpty()) {
            List<w0> F0 = b2.F0();
            if (F0 == null) {
                v(15);
            }
            return F0;
        }
        List<w0> emptyList = Collections.emptyList();
        if (emptyList == null) {
            v(16);
        }
        return emptyList;
    }

    public static f o1(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, boolean z, z0 z0Var) {
        if (eVar == null) {
            v(4);
        }
        if (gVar == null) {
            v(5);
        }
        if (z0Var == null) {
            v(6);
        }
        return new f(eVar, null, gVar, z, b.a.DECLARATION, z0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void v(int r8) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.p1.f.v(int):void");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public boolean B() {
        return this.J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l
    public kotlin.reflect.jvm.internal.impl.descriptors.e C() {
        kotlin.reflect.jvm.internal.impl.descriptors.e b2 = b();
        if (b2 == null) {
            v(18);
        }
        return b2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.m
    public <R, D> R L(kotlin.reflect.jvm.internal.impl.descriptors.o<R, D> oVar, D d2) {
        return oVar.h(this, d2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.b, kotlin.reflect.jvm.internal.impl.descriptors.a
    public Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.y> e() {
        Set emptySet = Collections.emptySet();
        if (emptySet == null) {
            v(21);
        }
        return emptySet;
    }

    public w0 m1() {
        kotlin.reflect.jvm.internal.impl.descriptors.e b2 = b();
        if (!b2.m()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.m b3 = b2.b();
        if (b3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.e) {
            return ((kotlin.reflect.jvm.internal.impl.descriptors.e) b3).K0();
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    /* renamed from: n1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d k0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, b.a aVar, boolean z) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.k0(mVar, d0Var, uVar, aVar, z);
        if (dVar == null) {
            v(27);
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    /* renamed from: p1, reason: merged with bridge method [inline-methods] */
    public f M0(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, kotlin.reflect.jvm.internal.impl.descriptors.y yVar, b.a aVar, kotlin.reflect.x.internal.l0.f.f fVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, z0 z0Var) {
        if (mVar == null) {
            v(23);
        }
        if (aVar == null) {
            v(24);
        }
        if (gVar == null) {
            v(25);
        }
        if (z0Var == null) {
            v(26);
        }
        b.a aVar2 = b.a.DECLARATION;
        if (aVar != aVar2 && aVar != b.a.SYNTHESIZED) {
            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + mVar + "\nkind: " + aVar);
        }
        return new f((kotlin.reflect.jvm.internal.impl.descriptors.e) mVar, this, gVar, this.J, aVar2, z0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.e b() {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = (kotlin.reflect.jvm.internal.impl.descriptors.e) super.b();
        if (eVar == null) {
            v(17);
        }
        return eVar;
    }

    public f r1(List<i1> list, kotlin.reflect.jvm.internal.impl.descriptors.u uVar) {
        if (list == null) {
            v(13);
        }
        if (uVar == null) {
            v(14);
        }
        s1(list, uVar, b().w());
        return this;
    }

    public f s1(List<i1> list, kotlin.reflect.jvm.internal.impl.descriptors.u uVar, List<e1> list2) {
        if (list == null) {
            v(10);
        }
        if (uVar == null) {
            v(11);
        }
        if (list2 == null) {
            v(12);
        }
        super.S0(null, m1(), l1(), list2, list, null, kotlin.reflect.jvm.internal.impl.descriptors.d0.FINAL, uVar);
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.b
    public void x0(Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.b> collection) {
        if (collection == null) {
            v(22);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.b1
    public kotlin.reflect.jvm.internal.impl.descriptors.d c(l1 l1Var) {
        if (l1Var == null) {
            v(20);
        }
        return (kotlin.reflect.jvm.internal.impl.descriptors.d) super.c(l1Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.p, kotlin.reflect.jvm.internal.impl.descriptors.p1.k, kotlin.reflect.jvm.internal.impl.descriptors.p1.j, kotlin.reflect.jvm.internal.impl.descriptors.m
    /* renamed from: a */
    public kotlin.reflect.jvm.internal.impl.descriptors.d L0() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) super.L0();
        if (dVar == null) {
            v(19);
        }
        return dVar;
    }
}
