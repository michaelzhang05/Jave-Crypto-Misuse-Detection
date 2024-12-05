package kotlin.reflect.x.internal.l0.d.a;

import kotlin.collections.b0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.y;
import kotlin.reflect.x.internal.l0.d.a.h0;
import kotlin.reflect.x.internal.l0.d.b.v;

/* compiled from: specialBuiltinMembers.kt */
/* loaded from: classes2.dex */
public final class f extends h0 {
    public static final f n = new f();

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final a f19872f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf(f.n.j(bVar));
        }
    }

    /* compiled from: specialBuiltinMembers.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<kotlin.reflect.jvm.internal.impl.descriptors.b, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f19873f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
            l.f(bVar, "it");
            return Boolean.valueOf((bVar instanceof y) && f.n.j(bVar));
        }
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        boolean J;
        J = b0.J(h0.a.e(), v.d(bVar));
        return J;
    }

    public static final y k(y yVar) {
        l.f(yVar, "functionDescriptor");
        f fVar = n;
        kotlin.reflect.x.internal.l0.f.f name = yVar.getName();
        l.e(name, "functionDescriptor.name");
        if (fVar.l(name)) {
            return (y) kotlin.reflect.x.internal.l0.i.t.a.c(yVar, false, a.f19872f, 1, null);
        }
        return null;
    }

    public static final h0.b m(kotlin.reflect.jvm.internal.impl.descriptors.b bVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.b c2;
        String d2;
        l.f(bVar, "<this>");
        h0.a aVar = h0.a;
        if (!aVar.d().contains(bVar.getName()) || (c2 = kotlin.reflect.x.internal.l0.i.t.a.c(bVar, false, b.f19873f, 1, null)) == null || (d2 = v.d(c2)) == null) {
            return null;
        }
        return aVar.l(d2);
    }

    public final boolean l(kotlin.reflect.x.internal.l0.f.f fVar) {
        l.f(fVar, "<this>");
        return h0.a.d().contains(fVar);
    }
}
