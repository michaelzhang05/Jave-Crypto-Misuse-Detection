package kotlin.reflect.x.internal.l0.b.q;

import java.io.InputStream;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.g;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;
import kotlin.reflect.jvm.internal.impl.descriptors.o1.c;
import kotlin.reflect.x.internal.l0.c.b.c;
import kotlin.reflect.x.internal.l0.d.b.o;
import kotlin.reflect.x.internal.l0.j.b.d;
import kotlin.reflect.x.internal.l0.j.b.j;
import kotlin.reflect.x.internal.l0.j.b.k;
import kotlin.reflect.x.internal.l0.j.b.l;
import kotlin.reflect.x.internal.l0.j.b.p;
import kotlin.reflect.x.internal.l0.j.b.r;
import kotlin.reflect.x.internal.l0.j.b.s;
import kotlin.reflect.x.internal.l0.j.b.v;
import kotlin.reflect.x.internal.l0.k.n;

/* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
/* loaded from: classes2.dex */
public final class h extends kotlin.reflect.x.internal.l0.j.b.a {

    /* renamed from: f, reason: collision with root package name */
    public static final a f19809f = new a(null);

    /* compiled from: JvmBuiltInsPackageFragmentProvider.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n nVar, o oVar, g0 g0Var, j0 j0Var, kotlin.reflect.jvm.internal.impl.descriptors.o1.a aVar, c cVar, l lVar, kotlin.reflect.x.internal.l0.l.t1.l lVar2, kotlin.reflect.x.internal.l0.i.v.a aVar2) {
        super(nVar, oVar, g0Var);
        List l;
        kotlin.jvm.internal.l.f(nVar, "storageManager");
        kotlin.jvm.internal.l.f(oVar, "finder");
        kotlin.jvm.internal.l.f(g0Var, "moduleDescriptor");
        kotlin.jvm.internal.l.f(j0Var, "notFoundClasses");
        kotlin.jvm.internal.l.f(aVar, "additionalClassPartsProvider");
        kotlin.jvm.internal.l.f(cVar, "platformDependentDeclarationFilter");
        kotlin.jvm.internal.l.f(lVar, "deserializationConfiguration");
        kotlin.jvm.internal.l.f(lVar2, "kotlinTypeChecker");
        kotlin.jvm.internal.l.f(aVar2, "samConversionResolver");
        kotlin.reflect.x.internal.l0.j.b.o oVar2 = new kotlin.reflect.x.internal.l0.j.b.o(this);
        kotlin.reflect.x.internal.l0.j.b.f0.a aVar3 = kotlin.reflect.x.internal.l0.j.b.f0.a.n;
        d dVar = new d(g0Var, j0Var, aVar3);
        v.a aVar4 = v.a.a;
        r rVar = r.a;
        kotlin.jvm.internal.l.e(rVar, "DO_NOTHING");
        c.a aVar5 = c.a.a;
        s.a aVar6 = s.a.a;
        l = t.l(new kotlin.reflect.x.internal.l0.b.p.a(nVar, g0Var), new e(nVar, g0Var, null, 4, null));
        i(new k(nVar, g0Var, lVar, oVar2, dVar, this, aVar4, rVar, aVar5, aVar6, l, j0Var, j.a.a(), aVar, cVar, aVar3.e(), lVar2, aVar2, null, null, 786432, null));
    }

    @Override // kotlin.reflect.x.internal.l0.j.b.a
    protected p d(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        InputStream b2 = f().b(cVar);
        if (b2 != null) {
            return kotlin.reflect.x.internal.l0.j.b.f0.c.s.a(cVar, h(), g(), b2, false);
        }
        return null;
    }
}
