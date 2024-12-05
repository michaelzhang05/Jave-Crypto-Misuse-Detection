package kotlin.reflect.jvm.internal.impl.descriptors.n1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* compiled from: Annotations.kt */
/* loaded from: classes2.dex */
public final class l implements g {

    /* renamed from: f, reason: collision with root package name */
    private final g f21684f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f21685g;

    /* renamed from: h, reason: collision with root package name */
    private final Function1<kotlin.reflect.x.internal.l0.f.c, Boolean> f21686h;

    /* JADX WARN: Multi-variable type inference failed */
    public l(g gVar, boolean z, Function1<? super kotlin.reflect.x.internal.l0.f.c, Boolean> function1) {
        kotlin.jvm.internal.l.f(gVar, "delegate");
        kotlin.jvm.internal.l.f(function1, "fqNameFilter");
        this.f21684f = gVar;
        this.f21685g = z;
        this.f21686h = function1;
    }

    private final boolean a(c cVar) {
        kotlin.reflect.x.internal.l0.f.c d2 = cVar.d();
        return d2 != null && this.f21686h.invoke(d2).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean A(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        if (this.f21686h.invoke(cVar).booleanValue()) {
            return this.f21684f.A(cVar);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public c e(kotlin.reflect.x.internal.l0.f.c cVar) {
        kotlin.jvm.internal.l.f(cVar, "fqName");
        if (this.f21686h.invoke(cVar).booleanValue()) {
            return this.f21684f.e(cVar);
        }
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n1.g
    public boolean isEmpty() {
        boolean z;
        g gVar = this.f21684f;
        if (!(gVar instanceof Collection) || !((Collection) gVar).isEmpty()) {
            Iterator<c> it = gVar.iterator();
            while (it.hasNext()) {
                if (a(it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return this.f21685g ? !z : z;
    }

    @Override // java.lang.Iterable
    public Iterator<c> iterator() {
        g gVar = this.f21684f;
        ArrayList arrayList = new ArrayList();
        for (c cVar : gVar) {
            if (a(cVar)) {
                arrayList.add(cVar);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l(g gVar, Function1<? super kotlin.reflect.x.internal.l0.f.c, Boolean> function1) {
        this(gVar, false, function1);
        kotlin.jvm.internal.l.f(gVar, "delegate");
        kotlin.jvm.internal.l.f(function1, "fqNameFilter");
    }
}
