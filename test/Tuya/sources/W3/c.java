package w3;

import M5.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import y3.AbstractC3991f;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final Map f39008a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3991f.a f39009b;

    public c(Map fieldValuePairs, AbstractC3991f.a userRequestedReuse) {
        AbstractC3159y.i(fieldValuePairs, "fieldValuePairs");
        AbstractC3159y.i(userRequestedReuse, "userRequestedReuse");
        this.f39008a = fieldValuePairs;
        this.f39009b = userRequestedReuse;
    }

    public final Map a() {
        return this.f39008a;
    }

    public final AbstractC3991f.a b() {
        return this.f39009b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (AbstractC3159y.d(this.f39008a, cVar.f39008a) && this.f39009b == cVar.f39009b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f39008a.hashCode() * 31) + this.f39009b.hashCode();
    }

    public String toString() {
        return "FormFieldValues(fieldValuePairs=" + this.f39008a + ", userRequestedReuse=" + this.f39009b + ")";
    }

    public /* synthetic */ c(Map map, AbstractC3991f.a aVar, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? Q.h() : map, aVar);
    }
}
