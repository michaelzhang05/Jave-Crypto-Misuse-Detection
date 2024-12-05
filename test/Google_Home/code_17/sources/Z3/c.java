package z3;

import B3.f;
import P5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f41131a;

    /* renamed from: b, reason: collision with root package name */
    private final f.a f41132b;

    public c(Map fieldValuePairs, f.a userRequestedReuse) {
        AbstractC3255y.i(fieldValuePairs, "fieldValuePairs");
        AbstractC3255y.i(userRequestedReuse, "userRequestedReuse");
        this.f41131a = fieldValuePairs;
        this.f41132b = userRequestedReuse;
    }

    public final Map a() {
        return this.f41131a;
    }

    public final f.a b() {
        return this.f41132b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3255y.d(this.f41131a, cVar.f41131a) && this.f41132b == cVar.f41132b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f41131a.hashCode() * 31) + this.f41132b.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.f41131a + ", userRequestedReuse=" + this.f41132b + ")";
    }

    public /* synthetic */ c(Map map, f.a aVar, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? Q.h() : map, aVar);
    }
}
