package kotlin.reflect.x.internal.l0.d.a.l0;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.d.a.n0.y;
import kotlin.reflect.x.internal.l0.d.a.n0.z;

/* compiled from: resolvers.kt */
/* loaded from: classes2.dex */
public final class h implements k {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final m f19980b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19981c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<y, Integer> f19982d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.k.h<y, kotlin.reflect.x.internal.l0.d.a.l0.l.m> f19983e;

    /* compiled from: resolvers.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<y, kotlin.reflect.x.internal.l0.d.a.l0.l.m> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.d.a.l0.l.m invoke(y yVar) {
            l.f(yVar, "typeParameter");
            Integer num = (Integer) h.this.f19982d.get(yVar);
            if (num == null) {
                return null;
            }
            h hVar = h.this;
            return new kotlin.reflect.x.internal.l0.d.a.l0.l.m(kotlin.reflect.x.internal.l0.d.a.l0.a.h(kotlin.reflect.x.internal.l0.d.a.l0.a.b(hVar.a, hVar), hVar.f19980b.getAnnotations()), yVar, hVar.f19981c + num.intValue(), hVar.f19980b);
        }
    }

    public h(g gVar, m mVar, z zVar, int i2) {
        l.f(gVar, "c");
        l.f(mVar, "containingDeclaration");
        l.f(zVar, "typeParameterOwner");
        this.a = gVar;
        this.f19980b = mVar;
        this.f19981c = i2;
        this.f19982d = kotlin.reflect.jvm.internal.impl.utils.a.d(zVar.getTypeParameters());
        this.f19983e = gVar.e().i(new a());
    }

    @Override // kotlin.reflect.x.internal.l0.d.a.l0.k
    public e1 a(y yVar) {
        l.f(yVar, "javaTypeParameter");
        kotlin.reflect.x.internal.l0.d.a.l0.l.m invoke = this.f19983e.invoke(yVar);
        return invoke != null ? invoke : this.a.f().a(yVar);
    }
}
