package kotlin.reflect.x.internal.l0;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.x;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.d.a.a0;
import kotlin.reflect.x.internal.l0.d.a.z;
import kotlin.reflect.x.internal.l0.d.b.q;
import kotlin.reflect.x.internal.l0.f.b;
import kotlin.reflect.x.internal.l0.f.c;

/* compiled from: SpecialJvmAnnotations.kt */
/* loaded from: classes2.dex */
public final class a {
    public static final a a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Set<b> f19661b;

    /* renamed from: c, reason: collision with root package name */
    private static final b f19662c;

    /* compiled from: SpecialJvmAnnotations.kt */
    /* renamed from: kotlin.f0.x.e.l0.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0278a implements q.c {
        final /* synthetic */ x a;

        C0278a(x xVar) {
            this.a = xVar;
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.c
        public void a() {
        }

        @Override // kotlin.f0.x.e.l0.d.b.q.c
        public q.a b(b bVar, z0 z0Var) {
            l.f(bVar, "classId");
            l.f(z0Var, "source");
            if (!l.a(bVar, z.a.a())) {
                return null;
            }
            this.a.f19474f = true;
            return null;
        }
    }

    static {
        List l;
        l = t.l(a0.a, a0.f19842k, a0.l, a0.f19835d, a0.f19837f, a0.f19840i);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = l.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(b.m((c) it.next()));
        }
        f19661b = linkedHashSet;
        b m = b.m(a0.f19841j);
        l.e(m, "topLevel(JvmAnnotationNames.REPEATABLE_ANNOTATION)");
        f19662c = m;
    }

    private a() {
    }

    public final b a() {
        return f19662c;
    }

    public final Set<b> b() {
        return f19661b;
    }

    public final boolean c(q qVar) {
        l.f(qVar, "klass");
        x xVar = new x();
        qVar.b(new C0278a(xVar), null);
        return xVar.f19474f;
    }
}
