package j4;

import android.text.SpannableString;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final SpannableString f33957a;

    /* renamed from: b, reason: collision with root package name */
    private final SpannableString f33958b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33959c;

    public d(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        AbstractC3255y.i(primaryText, "primaryText");
        AbstractC3255y.i(secondaryText, "secondaryText");
        AbstractC3255y.i(placeId, "placeId");
        this.f33957a = primaryText;
        this.f33958b = secondaryText;
        this.f33959c = placeId;
    }

    public final String a() {
        return this.f33959c;
    }

    public final SpannableString b() {
        return this.f33957a;
    }

    public final SpannableString c() {
        return this.f33958b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f33957a, dVar.f33957a) && AbstractC3255y.d(this.f33958b, dVar.f33958b) && AbstractC3255y.d(this.f33959c, dVar.f33959c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f33957a.hashCode() * 31) + this.f33958b.hashCode()) * 31) + this.f33959c.hashCode();
    }

    public String toString() {
        SpannableString spannableString = this.f33957a;
        SpannableString spannableString2 = this.f33958b;
        return "AutocompletePrediction(primaryText=" + ((Object) spannableString) + ", secondaryText=" + ((Object) spannableString2) + ", placeId=" + this.f33959c + ")";
    }
}
