package kotlin.reflect.x.internal.l0.d.a;

import java.util.Collection;
import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import kotlin.reflect.x.internal.l0.b.h;
import kotlin.reflect.x.internal.l0.f.f;

/* compiled from: ClassicBuiltinSpecialProperties.kt */
/* loaded from: classes2.dex */
public final class i {
    public static final i a = new i();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClassicBuiltinSpecialProperties.kt */
    /* loaded from: classes2.dex */
    public static final class a extends Lambda implements Function1<b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f19910f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf(i.a.b(bVar));
        }
    }

    private i() {
    }

    private final boolean c(b bVar) {
        boolean J;
        J = b0.J(g.a.c(), kotlin.reflect.x.internal.l0.i.t.a.d(bVar));
        if (J && bVar.h().isEmpty()) {
            return true;
        }
        if (!h.f0(bVar)) {
            return false;
        }
        Collection<? extends b> e2 = bVar.e();
        l.e(e2, "overriddenDescriptors");
        if (!e2.isEmpty()) {
            for (b bVar2 : e2) {
                i iVar = a;
                l.e(bVar2, "it");
                if (iVar.b(bVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String a(b bVar) {
        f fVar;
        l.f(bVar, "<this>");
        h.f0(bVar);
        b c2 = kotlin.reflect.x.internal.l0.i.t.a.c(kotlin.reflect.x.internal.l0.i.t.a.o(bVar), false, a.f19910f, 1, null);
        if (c2 == null || (fVar = g.a.a().get(kotlin.reflect.x.internal.l0.i.t.a.h(c2))) == null) {
            return null;
        }
        return fVar.f();
    }

    public final boolean b(b bVar) {
        l.f(bVar, "callableMemberDescriptor");
        if (g.a.d().contains(bVar.getName())) {
            return c(bVar);
        }
        return false;
    }
}
