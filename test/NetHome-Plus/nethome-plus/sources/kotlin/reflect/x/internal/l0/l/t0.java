package kotlin.reflect.x.internal.l0.l;

import cm.aptoide.pt.database.room.RoomNotification;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.r;
import kotlin.collections.u;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.e1;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.jvm.internal.impl.descriptors.i;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.y;

/* compiled from: StarProjectionImpl.kt */
/* loaded from: classes2.dex */
public final class t0 {

    /* compiled from: StarProjectionImpl.kt */
    /* loaded from: classes2.dex */
    public static final class a extends f1 {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List<e1> f21295d;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends e1> list) {
            this.f21295d = list;
        }

        @Override // kotlin.reflect.x.internal.l0.l.f1
        public g1 k(e1 e1Var) {
            l.f(e1Var, RoomNotification.KEY);
            if (!this.f21295d.contains(e1Var)) {
                return null;
            }
            h c2 = e1Var.c();
            l.d(c2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
            return n1.s((e1) c2);
        }
    }

    private static final e0 a(List<? extends e1> list, List<? extends e0> list2, kotlin.reflect.x.internal.l0.b.h hVar) {
        e0 p = l1.g(new a(list)).p((e0) r.R(list2), r1.OUT_VARIANCE);
        if (p == null) {
            p = hVar.y();
        }
        l.e(p, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return p;
    }

    public static final e0 b(e1 e1Var) {
        int t;
        int t2;
        l.f(e1Var, "<this>");
        m b2 = e1Var.b();
        l.e(b2, "this.containingDeclaration");
        if (b2 instanceof i) {
            List<e1> parameters = ((i) b2).g().getParameters();
            l.e(parameters, "descriptor.typeConstructor.parameters");
            t2 = u.t(parameters, 10);
            ArrayList arrayList = new ArrayList(t2);
            Iterator<T> it = parameters.iterator();
            while (it.hasNext()) {
                e1 g2 = ((e1) it.next()).g();
                l.e(g2, "it.typeConstructor");
                arrayList.add(g2);
            }
            List<e0> upperBounds = e1Var.getUpperBounds();
            l.e(upperBounds, "upperBounds");
            return a(arrayList, upperBounds, kotlin.reflect.x.internal.l0.i.t.a.f(e1Var));
        }
        if (b2 instanceof y) {
            List<e1> typeParameters = ((y) b2).getTypeParameters();
            l.e(typeParameters, "descriptor.typeParameters");
            t = u.t(typeParameters, 10);
            ArrayList arrayList2 = new ArrayList(t);
            Iterator<T> it2 = typeParameters.iterator();
            while (it2.hasNext()) {
                e1 g3 = ((e1) it2.next()).g();
                l.e(g3, "it.typeConstructor");
                arrayList2.add(g3);
            }
            List<e0> upperBounds2 = e1Var.getUpperBounds();
            l.e(upperBounds2, "upperBounds");
            return a(arrayList2, upperBounds2, kotlin.reflect.x.internal.l0.i.t.a.f(e1Var));
        }
        throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
    }
}
