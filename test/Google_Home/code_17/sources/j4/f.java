package j4;

import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f33961a;

    public f(List autocompletePredictions) {
        AbstractC3255y.i(autocompletePredictions, "autocompletePredictions");
        this.f33961a = autocompletePredictions;
    }

    public final List a() {
        return this.f33961a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3255y.d(this.f33961a, ((f) obj).f33961a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33961a.hashCode();
    }

    public String toString() {
        return "FindAutocompletePredictionsResponse(autocompletePredictions=" + this.f33961a + ")";
    }
}