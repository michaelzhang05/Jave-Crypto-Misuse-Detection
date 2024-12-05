package j4;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final g f33960a;

    public e(g place) {
        AbstractC3255y.i(place, "place");
        this.f33960a = place;
    }

    public final g a() {
        return this.f33960a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3255y.d(this.f33960a, ((e) obj).f33960a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f33960a.hashCode();
    }

    public String toString() {
        return "FetchPlaceResponse(place=" + this.f33960a + ")";
    }
}
