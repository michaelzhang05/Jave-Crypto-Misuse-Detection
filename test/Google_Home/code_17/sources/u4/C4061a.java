package u4;

import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: u4.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4061a {

    /* renamed from: a, reason: collision with root package name */
    private final String f40039a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f40040b;

    public C4061a(String str, boolean z8) {
        this.f40039a = str;
        this.f40040b = z8;
    }

    public static /* synthetic */ C4061a b(C4061a c4061a, String str, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = c4061a.f40039a;
        }
        if ((i8 & 2) != 0) {
            z8 = c4061a.f40040b;
        }
        return c4061a.a(str, z8);
    }

    public final C4061a a(String str, boolean z8) {
        return new C4061a(str, z8);
    }

    public final String c() {
        return this.f40039a;
    }

    public final boolean d() {
        return this.f40040b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4061a)) {
            return false;
        }
        C4061a c4061a = (C4061a) obj;
        if (AbstractC3255y.d(this.f40039a, c4061a.f40039a) && this.f40040b == c4061a.f40040b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f40039a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + androidx.compose.foundation.a.a(this.f40040b);
    }

    public String toString() {
        return "FormFieldEntry(value=" + this.f40039a + ", isComplete=" + this.f40040b + ")";
    }
}
