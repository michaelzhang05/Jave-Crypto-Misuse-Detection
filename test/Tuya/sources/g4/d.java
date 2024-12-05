package g4;

import android.text.SpannableString;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final SpannableString f31230a;

    /* renamed from: b, reason: collision with root package name */
    private final SpannableString f31231b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31232c;

    public d(SpannableString primaryText, SpannableString secondaryText, String placeId) {
        AbstractC3159y.i(primaryText, "primaryText");
        AbstractC3159y.i(secondaryText, "secondaryText");
        AbstractC3159y.i(placeId, "placeId");
        this.f31230a = primaryText;
        this.f31231b = secondaryText;
        this.f31232c = placeId;
    }

    public final String a() {
        return this.f31232c;
    }

    public final SpannableString b() {
        return this.f31230a;
    }

    public final SpannableString c() {
        return this.f31231b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f31230a, dVar.f31230a) && AbstractC3159y.d(this.f31231b, dVar.f31231b) && AbstractC3159y.d(this.f31232c, dVar.f31232c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f31230a.hashCode() * 31) + this.f31231b.hashCode()) * 31) + this.f31232c.hashCode();
    }

    public String toString() {
        SpannableString spannableString = this.f31230a;
        SpannableString spannableString2 = this.f31231b;
        return "AutocompletePrediction(primaryText=" + ((Object) spannableString) + ", secondaryText=" + ((Object) spannableString2) + ", placeId=" + this.f31232c + ")";
    }
}
