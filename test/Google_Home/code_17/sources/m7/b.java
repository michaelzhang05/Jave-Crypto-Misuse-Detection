package M7;

import android.graphics.Typeface;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f7247a;

    /* renamed from: b, reason: collision with root package name */
    public final Typeface f7248b;

    public b(Typeface typeface, Typeface typeface2) {
        this.f7247a = typeface;
        this.f7248b = typeface2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (AbstractC3255y.d(this.f7247a, bVar.f7247a) && AbstractC3255y.d(this.f7248b, bVar.f7248b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Typeface typeface = this.f7247a;
        int i8 = 0;
        if (typeface == null) {
            hashCode = 0;
        } else {
            hashCode = typeface.hashCode();
        }
        int i9 = hashCode * 31;
        Typeface typeface2 = this.f7248b;
        if (typeface2 != null) {
            i8 = typeface2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("ChoiceFonts(bold=");
        a8.append(this.f7247a);
        a8.append(", regular=");
        a8.append(this.f7248b);
        a8.append(')');
        return a8.toString();
    }
}
