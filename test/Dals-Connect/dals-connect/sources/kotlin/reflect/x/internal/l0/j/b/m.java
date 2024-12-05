package kotlin.reflect.x.internal.l0.j.b;

import java.util.List;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.e.s;
import kotlin.reflect.x.internal.l0.e.z.a;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.e.z.g;
import kotlin.reflect.x.internal.l0.e.z.h;
import kotlin.reflect.x.internal.l0.e.z.i;
import kotlin.reflect.x.internal.l0.j.b.g0.f;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class m {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final c f21101b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.m f21102c;

    /* renamed from: d, reason: collision with root package name */
    private final g f21103d;

    /* renamed from: e, reason: collision with root package name */
    private final h f21104e;

    /* renamed from: f, reason: collision with root package name */
    private final a f21105f;

    /* renamed from: g, reason: collision with root package name */
    private final f f21106g;

    /* renamed from: h, reason: collision with root package name */
    private final d0 f21107h;

    /* renamed from: i, reason: collision with root package name */
    private final w f21108i;

    public m(k kVar, c cVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar, g gVar, h hVar, a aVar, f fVar, d0 d0Var, List<s> list) {
        String c2;
        l.f(kVar, "components");
        l.f(cVar, "nameResolver");
        l.f(mVar, "containingDeclaration");
        l.f(gVar, "typeTable");
        l.f(hVar, "versionRequirementTable");
        l.f(aVar, "metadataVersion");
        l.f(list, "typeParameters");
        this.a = kVar;
        this.f21101b = cVar;
        this.f21102c = mVar;
        this.f21103d = gVar;
        this.f21104e = hVar;
        this.f21105f = aVar;
        this.f21106g = fVar;
        this.f21107h = new d0(this, d0Var, list, "Deserializer for \"" + mVar.getName() + '\"', (fVar == null || (c2 = fVar.c()) == null) ? "[container not found]" : c2);
        this.f21108i = new w(this);
    }

    public static /* synthetic */ m b(m mVar, kotlin.reflect.jvm.internal.impl.descriptors.m mVar2, List list, c cVar, g gVar, h hVar, a aVar, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            cVar = mVar.f21101b;
        }
        c cVar2 = cVar;
        if ((i2 & 8) != 0) {
            gVar = mVar.f21103d;
        }
        g gVar2 = gVar;
        if ((i2 & 16) != 0) {
            hVar = mVar.f21104e;
        }
        h hVar2 = hVar;
        if ((i2 & 32) != 0) {
            aVar = mVar.f21105f;
        }
        return mVar.a(mVar2, list, cVar2, gVar2, hVar2, aVar);
    }

    public final m a(kotlin.reflect.jvm.internal.impl.descriptors.m mVar, List<s> list, c cVar, g gVar, h hVar, a aVar) {
        l.f(mVar, "descriptor");
        l.f(list, "typeParameterProtos");
        l.f(cVar, "nameResolver");
        l.f(gVar, "typeTable");
        h hVar2 = hVar;
        l.f(hVar2, "versionRequirementTable");
        l.f(aVar, "metadataVersion");
        k kVar = this.a;
        if (!i.b(aVar)) {
            hVar2 = this.f21104e;
        }
        return new m(kVar, cVar, mVar, gVar, hVar2, aVar, this.f21106g, this.f21107h, list);
    }

    public final k c() {
        return this.a;
    }

    public final f d() {
        return this.f21106g;
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.m e() {
        return this.f21102c;
    }

    public final w f() {
        return this.f21108i;
    }

    public final c g() {
        return this.f21101b;
    }

    public final n h() {
        return this.a.u();
    }

    public final d0 i() {
        return this.f21107h;
    }

    public final g j() {
        return this.f21103d;
    }

    public final h k() {
        return this.f21104e;
    }
}
