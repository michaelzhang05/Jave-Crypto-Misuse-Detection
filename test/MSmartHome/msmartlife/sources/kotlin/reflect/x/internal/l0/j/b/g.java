package kotlin.reflect.x.internal.l0.j.b;

import kotlin.jvm.internal.l;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.x.internal.l0.e.z.a;
import kotlin.reflect.x.internal.l0.e.z.c;

/* compiled from: ClassData.kt */
/* loaded from: classes2.dex */
public final class g {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlin.reflect.x.internal.l0.e.c f20999b;

    /* renamed from: c, reason: collision with root package name */
    private final a f21000c;

    /* renamed from: d, reason: collision with root package name */
    private final z0 f21001d;

    public g(c cVar, kotlin.reflect.x.internal.l0.e.c cVar2, a aVar, z0 z0Var) {
        l.f(cVar, "nameResolver");
        l.f(cVar2, "classProto");
        l.f(aVar, "metadataVersion");
        l.f(z0Var, "sourceElement");
        this.a = cVar;
        this.f20999b = cVar2;
        this.f21000c = aVar;
        this.f21001d = z0Var;
    }

    public final c a() {
        return this.a;
    }

    public final kotlin.reflect.x.internal.l0.e.c b() {
        return this.f20999b;
    }

    public final a c() {
        return this.f21000c;
    }

    public final z0 d() {
        return this.f21001d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return l.a(this.a, gVar.a) && l.a(this.f20999b, gVar.f20999b) && l.a(this.f21000c, gVar.f21000c) && l.a(this.f21001d, gVar.f21001d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.f20999b.hashCode()) * 31) + this.f21000c.hashCode()) * 31) + this.f21001d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.a + ", classProto=" + this.f20999b + ", metadataVersion=" + this.f21000c + ", sourceElement=" + this.f21001d + ')';
    }
}
