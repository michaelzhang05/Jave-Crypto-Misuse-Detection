package kotlin.reflect.x.internal.l0.j.b.g0;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p1.p;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.e.i;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.e.z.h;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: DeserializedMemberDescriptor.kt */
/* loaded from: classes2.dex */
public final class k extends g0 implements b {
    private final i J;
    private final c K;
    private final g L;
    private final h M;
    private final f N;

    public /* synthetic */ k(m mVar, y0 y0Var, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, f fVar, b.a aVar, i iVar, c cVar, g gVar2, h hVar, f fVar2, z0 z0Var, int i2, kotlin.jvm.internal.g gVar3) {
        this(mVar, y0Var, gVar, fVar, aVar, iVar, cVar, gVar2, hVar, fVar2, (i2 & 1024) != 0 ? null : z0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.p1.g0, kotlin.reflect.jvm.internal.impl.descriptors.p1.p
    protected p M0(m mVar, y yVar, b.a aVar, f fVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, z0 z0Var) {
        f fVar2;
        l.f(mVar, "newOwner");
        l.f(aVar, "kind");
        l.f(gVar, "annotations");
        l.f(z0Var, "source");
        y0 y0Var = (y0) yVar;
        if (fVar == null) {
            f name = getName();
            l.e(name, "name");
            fVar2 = name;
        } else {
            fVar2 = fVar;
        }
        k kVar = new k(mVar, y0Var, gVar, fVar2, aVar, E(), Z(), T(), r1(), c0(), z0Var);
        kVar.Z0(R0());
        return kVar;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    public g T() {
        return this.L;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    public c Z() {
        return this.K;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    public f c0() {
        return this.N;
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.g0.g
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public i E() {
        return this.J;
    }

    public h r1() {
        return this.M;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m mVar, y0 y0Var, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar, f fVar, b.a aVar, i iVar, c cVar, g gVar2, h hVar, f fVar2, z0 z0Var) {
        super(mVar, y0Var, gVar, fVar, aVar, z0Var == null ? z0.a : z0Var);
        l.f(mVar, "containingDeclaration");
        l.f(gVar, "annotations");
        l.f(fVar, "name");
        l.f(aVar, "kind");
        l.f(iVar, "proto");
        l.f(cVar, "nameResolver");
        l.f(gVar2, "typeTable");
        l.f(hVar, "versionRequirementTable");
        this.J = iVar;
        this.K = cVar;
        this.L = gVar2;
        this.M = hVar;
        this.N = fVar2;
    }
}
