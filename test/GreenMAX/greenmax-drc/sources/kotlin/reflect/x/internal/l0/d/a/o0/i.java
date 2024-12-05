package kotlin.reflect.x.internal.l0.d.a.o0;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* compiled from: NullabilityQualifierWithMigrationStatus.kt */
/* loaded from: classes2.dex */
public final class i {
    private final h a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f20135b;

    public i(h hVar, boolean z) {
        l.f(hVar, "qualifier");
        this.a = hVar;
        this.f20135b = z;
    }

    public static /* synthetic */ i b(i iVar, h hVar, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            hVar = iVar.a;
        }
        if ((i2 & 2) != 0) {
            z = iVar.f20135b;
        }
        return iVar.a(hVar, z);
    }

    public final i a(h hVar, boolean z) {
        l.f(hVar, "qualifier");
        return new i(hVar, z);
    }

    public final h c() {
        return this.a;
    }

    public final boolean d() {
        return this.f20135b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.a == iVar.a && this.f20135b == iVar.f20135b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.f20135b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode + i2;
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.a + ", isForWarningOnly=" + this.f20135b + ')';
    }

    public /* synthetic */ i(h hVar, boolean z, int i2, g gVar) {
        this(hVar, (i2 & 2) != 0 ? false : z);
    }
}
