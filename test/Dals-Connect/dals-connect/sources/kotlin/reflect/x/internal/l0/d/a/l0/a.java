package kotlin.reflect.x.internal.l0.d.a.l0;

import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.x.internal.l0.d.a.n0.z;
import kotlin.reflect.x.internal.l0.d.a.x;

/* compiled from: context.kt */
/* loaded from: classes2.dex */
public final class a {

    /* compiled from: context.kt */
    /* renamed from: kotlin.f0.x.e.l0.d.a.l0.a$a */
    /* loaded from: classes2.dex */
    public static final class C0289a extends Lambda implements Function0<x> {

        /* renamed from: f */
        final /* synthetic */ g f19953f;

        /* renamed from: g */
        final /* synthetic */ g f19954g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0289a(g gVar, g gVar2) {
            super(0);
            this.f19953f = gVar;
            this.f19954g = gVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final x invoke() {
            return a.g(this.f19953f, this.f19954g.getAnnotations());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: context.kt */
    /* loaded from: classes2.dex */
    public static final class b extends Lambda implements Function0<x> {

        /* renamed from: f */
        final /* synthetic */ g f19955f;

        /* renamed from: g */
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n1.g f19956g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar2) {
            super(0);
            this.f19955f = gVar;
            this.f19956g = gVar2;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b */
        public final x invoke() {
            return a.g(this.f19955f, this.f19956g);
        }
    }

    private static final g a(g gVar, m mVar, z zVar, int i2, Lazy<x> lazy) {
        k f2;
        kotlin.reflect.x.internal.l0.d.a.l0.b a = gVar.a();
        if (zVar != null) {
            f2 = new h(gVar, mVar, zVar, i2);
        } else {
            f2 = gVar.f();
        }
        return new g(a, f2, lazy);
    }

    public static final g b(g gVar, k kVar) {
        l.f(gVar, "<this>");
        l.f(kVar, "typeParameterResolver");
        return new g(gVar.a(), kVar, gVar.c());
    }

    public static final g c(g gVar, g gVar2, z zVar, int i2) {
        Lazy a;
        l.f(gVar, "<this>");
        l.f(gVar2, "containingDeclaration");
        a = i.a(LazyThreadSafetyMode.NONE, new C0289a(gVar, gVar2));
        return a(gVar, gVar2, zVar, i2, a);
    }

    public static /* synthetic */ g d(g gVar, g gVar2, z zVar, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            zVar = null;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return c(gVar, gVar2, zVar, i2);
    }

    public static final g e(g gVar, m mVar, z zVar, int i2) {
        l.f(gVar, "<this>");
        l.f(mVar, "containingDeclaration");
        l.f(zVar, "typeParameterOwner");
        return a(gVar, mVar, zVar, i2, gVar.c());
    }

    public static /* synthetic */ g f(g gVar, m mVar, z zVar, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        return e(gVar, mVar, zVar, i2);
    }

    public static final x g(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar2) {
        l.f(gVar, "<this>");
        l.f(gVar2, "additionalAnnotations");
        return gVar.a().a().c(gVar.b(), gVar2);
    }

    public static final g h(g gVar, kotlin.reflect.jvm.internal.impl.descriptors.n1.g gVar2) {
        Lazy a;
        l.f(gVar, "<this>");
        l.f(gVar2, "additionalAnnotations");
        if (gVar2.isEmpty()) {
            return gVar;
        }
        kotlin.reflect.x.internal.l0.d.a.l0.b a2 = gVar.a();
        k f2 = gVar.f();
        a = i.a(LazyThreadSafetyMode.NONE, new b(gVar, gVar2));
        return new g(a2, f2, a);
    }

    public static final g i(g gVar, kotlin.reflect.x.internal.l0.d.a.l0.b bVar) {
        l.f(gVar, "<this>");
        l.f(bVar, "components");
        return new g(bVar, gVar.f(), gVar.c());
    }
}
