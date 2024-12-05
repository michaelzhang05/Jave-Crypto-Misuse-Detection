package g4;

import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f31234a;

    public f(List autocompletePredictions) {
        AbstractC3159y.i(autocompletePredictions, "autocompletePredictions");
        this.f31234a = autocompletePredictions;
    }

    public final List a() {
        return this.f31234a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3159y.d(this.f31234a, ((f) obj).f31234a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f31234a.hashCode();
    }

    public String toString() {
        return "FindAutocompletePredictionsResponse(autocompletePredictions=" + this.f31234a + ")";
    }
}
