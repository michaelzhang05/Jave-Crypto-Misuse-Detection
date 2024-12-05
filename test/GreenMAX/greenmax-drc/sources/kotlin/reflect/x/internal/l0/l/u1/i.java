package kotlin.reflect.x.internal.l0.l.u1;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.x.internal.l0.b.e;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: ErrorTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class i implements e1 {
    private final j a;

    /* renamed from: b, reason: collision with root package name */
    private final String[] f21354b;

    /* renamed from: c, reason: collision with root package name */
    private final String f21355c;

    public i(j jVar, String... strArr) {
        l.f(jVar, "kind");
        l.f(strArr, "formatParams");
        this.a = jVar;
        this.f21354b = strArr;
        String f2 = b.ERROR_TYPE.f();
        String f3 = jVar.f();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(f3, Arrays.copyOf(copyOf, copyOf.length));
        l.e(format, "format(this, *args)");
        String format2 = String.format(f2, Arrays.copyOf(new Object[]{format}, 1));
        l.e(format2, "format(this, *args)");
        this.f21355c = format2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public Collection<e0> a() {
        List i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public e1 b(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: c */
    public h w() {
        return k.a.h();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public boolean e() {
        return false;
    }

    public final j g() {
        return this.a;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public List<kotlin.reflect.jvm.internal.impl.descriptors.e1> getParameters() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.e1> i2;
        i2 = t.i();
        return i2;
    }

    public final String h(int i2) {
        return this.f21354b[i2];
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        return e.f19666h.a();
    }

    public String toString() {
        return this.f21355c;
    }
}
