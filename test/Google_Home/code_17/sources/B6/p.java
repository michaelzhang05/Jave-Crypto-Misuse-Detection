package B6;

import C6.S;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class p extends x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1057a;

    /* renamed from: b, reason: collision with root package name */
    private final y6.f f1058b;

    /* renamed from: c, reason: collision with root package name */
    private final String f1059c;

    public /* synthetic */ p(Object obj, boolean z8, y6.f fVar, int i8, AbstractC3247p abstractC3247p) {
        this(obj, z8, (i8 & 4) != 0 ? null : fVar);
    }

    @Override // B6.x
    public String c() {
        return this.f1059c;
    }

    public final y6.f e() {
        return this.f1058b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (f() == pVar.f() && AbstractC3255y.d(c(), pVar.c())) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.f1057a;
    }

    public int hashCode() {
        return (androidx.compose.foundation.a.a(f()) * 31) + c().hashCode();
    }

    @Override // B6.x
    public String toString() {
        if (f()) {
            StringBuilder sb = new StringBuilder();
            S.c(sb, c());
            String sb2 = sb.toString();
            AbstractC3255y.h(sb2, "toString(...)");
            return sb2;
        }
        return c();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Object body, boolean z8, y6.f fVar) {
        super(null);
        AbstractC3255y.i(body, "body");
        this.f1057a = z8;
        this.f1058b = fVar;
        this.f1059c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
