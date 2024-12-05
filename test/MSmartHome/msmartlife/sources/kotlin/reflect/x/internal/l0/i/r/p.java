package kotlin.reflect.x.internal.l0.i.r;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.t;
import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import kotlin.reflect.x.internal.l0.l.e0;
import kotlin.reflect.x.internal.l0.l.e1;
import kotlin.reflect.x.internal.l0.l.t1.g;

/* compiled from: IntegerValueTypeConstructor.kt */
/* loaded from: classes2.dex */
public final class p implements e1 {
    private final long a;

    /* renamed from: b, reason: collision with root package name */
    private final g0 f20885b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<e0> f20886c;

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public Collection<e0> a() {
        return this.f20886c;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public e1 b(g gVar) {
        l.f(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    /* renamed from: c */
    public /* bridge */ /* synthetic */ h w() {
        return (h) g();
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public boolean e() {
        return false;
    }

    public Void g() {
        return null;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public List<kotlin.reflect.jvm.internal.impl.descriptors.e1> getParameters() {
        List<kotlin.reflect.jvm.internal.impl.descriptors.e1> i2;
        i2 = t.i();
        return i2;
    }

    @Override // kotlin.reflect.x.internal.l0.l.e1
    public kotlin.reflect.x.internal.l0.b.h o() {
        return this.f20885b.o();
    }

    public String toString() {
        return "IntegerValueType(" + this.a + ')';
    }
}
