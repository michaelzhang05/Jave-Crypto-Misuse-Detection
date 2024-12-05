package kotlin.reflect.x.internal.l0.i.w.o;

import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.l.m0;

/* compiled from: ImplicitClassReceiver.kt */
/* loaded from: classes2.dex */
public class e implements f, h {
    private final kotlin.reflect.jvm.internal.impl.descriptors.e a;

    /* renamed from: b, reason: collision with root package name */
    private final e f20951b;

    /* renamed from: c, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.e f20952c;

    public e(kotlin.reflect.jvm.internal.impl.descriptors.e eVar, e eVar2) {
        l.f(eVar, "classDescriptor");
        this.a = eVar;
        this.f20951b = eVar2 == null ? this : eVar2;
        this.f20952c = eVar;
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.o.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m0 getType() {
        m0 s = this.a.s();
        l.e(s, "classDescriptor.defaultType");
        return s;
    }

    public boolean equals(Object obj) {
        kotlin.reflect.jvm.internal.impl.descriptors.e eVar = this.a;
        e eVar2 = obj instanceof e ? (e) obj : null;
        return l.a(eVar, eVar2 != null ? eVar2.a : null);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @Override // kotlin.reflect.x.internal.l0.i.w.o.h
    public final kotlin.reflect.jvm.internal.impl.descriptors.e r() {
        return this.a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
