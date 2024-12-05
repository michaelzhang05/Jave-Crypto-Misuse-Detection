package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.e.c;
import kotlin.reflect.x.internal.l0.e.z.c;
import kotlin.reflect.x.internal.l0.e.z.g;

/* compiled from: ProtoContainer.kt */
/* loaded from: classes2.dex */
public abstract class z {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final g f21147b;

    /* renamed from: c, reason: collision with root package name */
    private final z0 f21148c;

    /* compiled from: ProtoContainer.kt */
    /* loaded from: classes2.dex */
    public static final class a extends z {

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.e.c f21149d;

        /* renamed from: e, reason: collision with root package name */
        private final a f21150e;

        /* renamed from: f, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.f.b f21151f;

        /* renamed from: g, reason: collision with root package name */
        private final c.EnumC0324c f21152g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f21153h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.reflect.x.internal.l0.e.c cVar, kotlin.reflect.x.internal.l0.e.z.c cVar2, g gVar, z0 z0Var, a aVar) {
            super(cVar2, gVar, z0Var, null);
            l.f(cVar, "classProto");
            l.f(cVar2, "nameResolver");
            l.f(gVar, "typeTable");
            this.f21149d = cVar;
            this.f21150e = aVar;
            this.f21151f = x.a(cVar2, cVar.G0());
            c.EnumC0324c d2 = kotlin.reflect.x.internal.l0.e.z.b.f20695f.d(cVar.F0());
            this.f21152g = d2 == null ? c.EnumC0324c.CLASS : d2;
            Boolean d3 = kotlin.reflect.x.internal.l0.e.z.b.f20696g.d(cVar.F0());
            l.e(d3, "IS_INNER.get(classProto.flags)");
            this.f21153h = d3.booleanValue();
        }

        @Override // kotlin.reflect.x.internal.l0.j.b.z
        public kotlin.reflect.x.internal.l0.f.c a() {
            kotlin.reflect.x.internal.l0.f.c b2 = this.f21151f.b();
            l.e(b2, "classId.asSingleFqName()");
            return b2;
        }

        public final kotlin.reflect.x.internal.l0.f.b e() {
            return this.f21151f;
        }

        public final kotlin.reflect.x.internal.l0.e.c f() {
            return this.f21149d;
        }

        public final c.EnumC0324c g() {
            return this.f21152g;
        }

        public final a h() {
            return this.f21150e;
        }

        public final boolean i() {
            return this.f21153h;
        }
    }

    /* compiled from: ProtoContainer.kt */
    /* loaded from: classes2.dex */
    public static final class b extends z {

        /* renamed from: d, reason: collision with root package name */
        private final kotlin.reflect.x.internal.l0.f.c f21154d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(kotlin.reflect.x.internal.l0.f.c cVar, kotlin.reflect.x.internal.l0.e.z.c cVar2, g gVar, z0 z0Var) {
            super(cVar2, gVar, z0Var, null);
            l.f(cVar, "fqName");
            l.f(cVar2, "nameResolver");
            l.f(gVar, "typeTable");
            this.f21154d = cVar;
        }

        @Override // kotlin.reflect.x.internal.l0.j.b.z
        public kotlin.reflect.x.internal.l0.f.c a() {
            return this.f21154d;
        }
    }

    private z(kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar, z0 z0Var) {
        this.a = cVar;
        this.f21147b = gVar;
        this.f21148c = z0Var;
    }

    public /* synthetic */ z(kotlin.reflect.x.internal.l0.e.z.c cVar, g gVar, z0 z0Var, kotlin.jvm.internal.g gVar2) {
        this(cVar, gVar, z0Var);
    }

    public abstract kotlin.reflect.x.internal.l0.f.c a();

    public final kotlin.reflect.x.internal.l0.e.z.c b() {
        return this.a;
    }

    public final z0 c() {
        return this.f21148c;
    }

    public final g d() {
        return this.f21147b;
    }

    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }
}
