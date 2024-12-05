package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.t;
import kotlin.collections.t0;
import kotlin.collections.u0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.x.internal.l0.c.b.b;
import kotlin.reflect.x.internal.l0.i.w.d;
import kotlin.reflect.x.internal.l0.i.w.h;

/* compiled from: ErrorScope.kt */
/* loaded from: classes2.dex */
public class f implements h {

    /* renamed from: b, reason: collision with root package name */
    private final g f21341b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21342c;

    public f(g gVar, String... strArr) {
        l.f(gVar, "kind");
        l.f(strArr, "formatParams");
        this.f21341b = gVar;
        String f2 = gVar.f();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(f2, Arrays.copyOf(copyOf, copyOf.length));
        l.e(format, "format(this, *args)");
        this.f21342c = format;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> b() {
        Set<kotlin.reflect.x.internal.l0.f.f> d2;
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> d() {
        Set<kotlin.reflect.x.internal.l0.f.f> d2;
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    public Set<kotlin.reflect.x.internal.l0.f.f> e() {
        Set<kotlin.reflect.x.internal.l0.f.f> d2;
        d2 = u0.d();
        return d2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public kotlin.reflect.jvm.internal.impl.descriptors.h f(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        String format = String.format(b.ERROR_CLASS.f(), Arrays.copyOf(new Object[]{fVar}, 1));
        l.e(format, "format(this, *args)");
        kotlin.reflect.x.internal.l0.f.f C = kotlin.reflect.x.internal.l0.f.f.C(format);
        l.e(C, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new a(C);
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.k
    public Collection<m> g(d dVar, Function1<? super kotlin.reflect.x.internal.l0.f.f, Boolean> function1) {
        List i2;
        l.f(dVar, "kindFilter");
        l.f(function1, "nameFilter");
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set<y0> a(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        Set<y0> c2;
        l.f(fVar, "name");
        l.f(bVar, "location");
        c2 = t0.c(new c(k.a.h()));
        return c2;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.h
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<kotlin.reflect.jvm.internal.impl.descriptors.t0> c(kotlin.reflect.x.internal.l0.f.f fVar, b bVar) {
        l.f(fVar, "name");
        l.f(bVar, "location");
        return k.a.j();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String j() {
        return this.f21342c;
    }

    public String toString() {
        return "ErrorScope{" + this.f21342c + '}';
    }
}
