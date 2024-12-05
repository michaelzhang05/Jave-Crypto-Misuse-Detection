package kotlin.reflect.x.internal.l0.d.a;

import java.util.Collection;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.d.a.o0.h;
import kotlin.reflect.x.internal.l0.d.a.o0.i;

/* compiled from: AnnotationQualifiersFqNames.kt */
/* loaded from: classes2.dex */
public final class q {
    private final i a;

    /* renamed from: b, reason: collision with root package name */
    private final Collection<b> f20192b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f20193c;

    /* JADX WARN: Multi-variable type inference failed */
    public q(i iVar, Collection<? extends b> collection, boolean z) {
        l.f(iVar, "nullabilityQualifier");
        l.f(collection, "qualifierApplicabilityTypes");
        this.a = iVar;
        this.f20192b = collection;
        this.f20193c = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ q b(q qVar, i iVar, Collection collection, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            iVar = qVar.a;
        }
        if ((i2 & 2) != 0) {
            collection = qVar.f20192b;
        }
        if ((i2 & 4) != 0) {
            z = qVar.f20193c;
        }
        return qVar.a(iVar, collection, z);
    }

    public final q a(i iVar, Collection<? extends b> collection, boolean z) {
        l.f(iVar, "nullabilityQualifier");
        l.f(collection, "qualifierApplicabilityTypes");
        return new q(iVar, collection, z);
    }

    public final boolean c() {
        return this.f20193c;
    }

    public final i d() {
        return this.a;
    }

    public final Collection<b> e() {
        return this.f20192b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return l.a(this.a, qVar.a) && l.a(this.f20192b, qVar.f20192b) && this.f20193c == qVar.f20193c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.f20192b.hashCode()) * 31;
        boolean z = this.f20193c;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.a + ", qualifierApplicabilityTypes=" + this.f20192b + ", definitelyNotNull=" + this.f20193c + ')';
    }

    public /* synthetic */ q(i iVar, Collection collection, boolean z, int i2, g gVar) {
        this(iVar, collection, (i2 & 4) != 0 ? iVar.c() == h.NOT_NULL : z);
    }
}
