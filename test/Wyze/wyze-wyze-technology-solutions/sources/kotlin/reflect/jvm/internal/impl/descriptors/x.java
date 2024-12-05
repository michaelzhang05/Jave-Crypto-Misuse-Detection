package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KDeclarationContainer;
import kotlin.sequences.Sequence;

/* compiled from: findClassInModule.kt */
/* loaded from: classes2.dex */
public final class x {

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes2.dex */
    /* synthetic */ class a extends kotlin.jvm.internal.i implements Function1<kotlin.reflect.x.internal.l0.f.b, kotlin.reflect.x.internal.l0.f.b> {

        /* renamed from: h, reason: collision with root package name */
        public static final a f21870h = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.internal.c, kotlin.reflect.KCallable
        /* renamed from: getName */
        public final String getM() {
            return "getOuterClassId";
        }

        @Override // kotlin.jvm.internal.c
        public final KDeclarationContainer getOwner() {
            return kotlin.jvm.internal.b0.b(kotlin.reflect.x.internal.l0.f.b.class);
        }

        @Override // kotlin.jvm.internal.c
        public final String getSignature() {
            return "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;";
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public final kotlin.reflect.x.internal.l0.f.b invoke(kotlin.reflect.x.internal.l0.f.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "p0");
            return bVar.g();
        }
    }

    /* compiled from: findClassInModule.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<kotlin.reflect.x.internal.l0.f.b, Integer> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f21871f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(kotlin.reflect.x.internal.l0.f.b bVar) {
            kotlin.jvm.internal.l.f(bVar, "it");
            return 0;
        }
    }

    public static final e a(g0 g0Var, kotlin.reflect.x.internal.l0.f.b bVar) {
        kotlin.jvm.internal.l.f(g0Var, "<this>");
        kotlin.jvm.internal.l.f(bVar, "classId");
        h b2 = b(g0Var, bVar);
        if (b2 instanceof e) {
            return (e) b2;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.h b(kotlin.reflect.jvm.internal.impl.descriptors.g0 r10, kotlin.reflect.x.internal.l0.f.b r11) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.x.b(kotlin.reflect.jvm.internal.impl.descriptors.g0, kotlin.f0.x.e.l0.f.b):kotlin.reflect.jvm.internal.impl.descriptors.h");
    }

    public static final e c(g0 g0Var, kotlin.reflect.x.internal.l0.f.b bVar, j0 j0Var) {
        Sequence f2;
        Sequence u;
        List<Integer> A;
        kotlin.jvm.internal.l.f(g0Var, "<this>");
        kotlin.jvm.internal.l.f(bVar, "classId");
        kotlin.jvm.internal.l.f(j0Var, "notFoundClasses");
        e a2 = a(g0Var, bVar);
        if (a2 != null) {
            return a2;
        }
        f2 = kotlin.sequences.l.f(bVar, a.f21870h);
        u = kotlin.sequences.n.u(f2, b.f21871f);
        A = kotlin.sequences.n.A(u);
        return j0Var.d(bVar, A);
    }

    public static final d1 d(g0 g0Var, kotlin.reflect.x.internal.l0.f.b bVar) {
        kotlin.jvm.internal.l.f(g0Var, "<this>");
        kotlin.jvm.internal.l.f(bVar, "classId");
        h b2 = b(g0Var, bVar);
        if (b2 instanceof d1) {
            return (d1) b2;
        }
        return null;
    }
}
