package M3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import m2.AbstractC3407E;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final int f6529a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6530b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6531c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f6532d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6533e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f6534f;

    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: M3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0118a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f6535a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f6536b;

            /* renamed from: c, reason: collision with root package name */
            private final Function0 f6537c;

            public C0118a(boolean z8, boolean z9, Function0 onEditIconPressed) {
                AbstractC3255y.i(onEditIconPressed, "onEditIconPressed");
                this.f6535a = z8;
                this.f6536b = z9;
                this.f6537c = onEditIconPressed;
            }

            public final boolean a() {
                return this.f6536b;
            }

            public final Function0 b() {
                return this.f6537c;
            }

            public final boolean c() {
                return this.f6535a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0118a)) {
                    return false;
                }
                C0118a c0118a = (C0118a) obj;
                if (this.f6535a == c0118a.f6535a && this.f6536b == c0118a.f6536b && AbstractC3255y.d(this.f6537c, c0118a.f6537c)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((androidx.compose.foundation.a.a(this.f6535a) * 31) + androidx.compose.foundation.a.a(this.f6536b)) * 31) + this.f6537c.hashCode();
            }

            public String toString() {
                return "Maybe(isEditing=" + this.f6535a + ", canEdit=" + this.f6536b + ", onEditIconPressed=" + this.f6537c + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f6538a = new b();

            private b() {
            }

            public boolean equals(Object obj) {
                if (this == obj || (obj instanceof b)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return 2105449614;
            }

            public String toString() {
                return "Never";
            }
        }
    }

    public G(int i8, int i9, boolean z8, boolean z9, boolean z10, Function0 onEditIconPressed) {
        AbstractC3255y.i(onEditIconPressed, "onEditIconPressed");
        this.f6529a = i8;
        this.f6530b = i9;
        this.f6531c = z8;
        this.f6532d = z9;
        this.f6533e = z10;
        this.f6534f = onEditIconPressed;
    }

    public final int a() {
        return this.f6530b;
    }

    public final int b() {
        if (this.f6533e) {
            return AbstractC3407E.f34859h0;
        }
        return AbstractC3407E.f34861i0;
    }

    public final int c() {
        return this.f6529a;
    }

    public final Function0 d() {
        return this.f6534f;
    }

    public final boolean e() {
        return this.f6532d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f6529a == g8.f6529a && this.f6530b == g8.f6530b && this.f6531c == g8.f6531c && this.f6532d == g8.f6532d && this.f6533e == g8.f6533e && AbstractC3255y.d(this.f6534f, g8.f6534f)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f6531c;
    }

    public final boolean g() {
        return this.f6533e;
    }

    public int hashCode() {
        return (((((((((this.f6529a * 31) + this.f6530b) * 31) + androidx.compose.foundation.a.a(this.f6531c)) * 31) + androidx.compose.foundation.a.a(this.f6532d)) * 31) + androidx.compose.foundation.a.a(this.f6533e)) * 31) + this.f6534f.hashCode();
    }

    public String toString() {
        return "PaymentSheetTopBarState(icon=" + this.f6529a + ", contentDescription=" + this.f6530b + ", showTestModeLabel=" + this.f6531c + ", showEditMenu=" + this.f6532d + ", isEditing=" + this.f6533e + ", onEditIconPressed=" + this.f6534f + ")";
    }
}
