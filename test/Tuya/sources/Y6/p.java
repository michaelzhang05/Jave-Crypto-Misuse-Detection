package y6;

import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import z6.S;

/* loaded from: classes5.dex */
public final class p extends x {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f40013a;

    /* renamed from: b, reason: collision with root package name */
    private final v6.f f40014b;

    /* renamed from: c, reason: collision with root package name */
    private final String f40015c;

    public /* synthetic */ p(Object obj, boolean z8, v6.f fVar, int i8, AbstractC3151p abstractC3151p) {
        this(obj, z8, (i8 & 4) != 0 ? null : fVar);
    }

    @Override // y6.x
    public String a() {
        return this.f40015c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (h() == pVar.h() && AbstractC3159y.d(a(), pVar.a())) {
            return true;
        }
        return false;
    }

    public final v6.f g() {
        return this.f40014b;
    }

    public boolean h() {
        return this.f40013a;
    }

    public int hashCode() {
        return (androidx.compose.foundation.a.a(h()) * 31) + a().hashCode();
    }

    @Override // y6.x
    public String toString() {
        if (h()) {
            StringBuilder sb = new StringBuilder();
            S.c(sb, a());
            String sb2 = sb.toString();
            AbstractC3159y.h(sb2, "toString(...)");
            return sb2;
        }
        return a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Object body, boolean z8, v6.f fVar) {
        super(null);
        AbstractC3159y.i(body, "body");
        this.f40013a = z8;
        this.f40014b = fVar;
        this.f40015c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }
}
