package J3;

import j2.AbstractC3053E;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    private final int f4823a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4824b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4825c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f4826d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4827e;

    /* renamed from: f, reason: collision with root package name */
    private final Function0 f4828f;

    /* loaded from: classes4.dex */
    public interface a {

        /* renamed from: J3.G$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0093a implements a {

            /* renamed from: a, reason: collision with root package name */
            private final boolean f4829a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f4830b;

            /* renamed from: c, reason: collision with root package name */
            private final Function0 f4831c;

            public C0093a(boolean z8, boolean z9, Function0 onEditIconPressed) {
                AbstractC3159y.i(onEditIconPressed, "onEditIconPressed");
                this.f4829a = z8;
                this.f4830b = z9;
                this.f4831c = onEditIconPressed;
            }

            public final boolean a() {
                return this.f4830b;
            }

            public final Function0 b() {
                return this.f4831c;
            }

            public final boolean c() {
                return this.f4829a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0093a)) {
                    return false;
                }
                C0093a c0093a = (C0093a) obj;
                if (this.f4829a == c0093a.f4829a && this.f4830b == c0093a.f4830b && AbstractC3159y.d(this.f4831c, c0093a.f4831c)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return (((androidx.compose.foundation.a.a(this.f4829a) * 31) + androidx.compose.foundation.a.a(this.f4830b)) * 31) + this.f4831c.hashCode();
            }

            public String toString() {
                return "Maybe(isEditing=" + this.f4829a + ", canEdit=" + this.f4830b + ", onEditIconPressed=" + this.f4831c + ")";
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements a {

            /* renamed from: a, reason: collision with root package name */
            public static final b f4832a = new b();

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
        AbstractC3159y.i(onEditIconPressed, "onEditIconPressed");
        this.f4823a = i8;
        this.f4824b = i9;
        this.f4825c = z8;
        this.f4826d = z9;
        this.f4827e = z10;
        this.f4828f = onEditIconPressed;
    }

    public final int a() {
        return this.f4824b;
    }

    public final int b() {
        if (this.f4827e) {
            return AbstractC3053E.f32883h0;
        }
        return AbstractC3053E.f32885i0;
    }

    public final int c() {
        return this.f4823a;
    }

    public final Function0 d() {
        return this.f4828f;
    }

    public final boolean e() {
        return this.f4826d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g8 = (G) obj;
        if (this.f4823a == g8.f4823a && this.f4824b == g8.f4824b && this.f4825c == g8.f4825c && this.f4826d == g8.f4826d && this.f4827e == g8.f4827e && AbstractC3159y.d(this.f4828f, g8.f4828f)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f4825c;
    }

    public final boolean g() {
        return this.f4827e;
    }

    public int hashCode() {
        return (((((((((this.f4823a * 31) + this.f4824b) * 31) + androidx.compose.foundation.a.a(this.f4825c)) * 31) + androidx.compose.foundation.a.a(this.f4826d)) * 31) + androidx.compose.foundation.a.a(this.f4827e)) * 31) + this.f4828f.hashCode();
    }

    public String toString() {
        return "PaymentSheetTopBarState(icon=" + this.f4823a + ", contentDescription=" + this.f4824b + ", showTestModeLabel=" + this.f4825c + ", showEditMenu=" + this.f4826d + ", isEditing=" + this.f4827e + ", onEditIconPressed=" + this.f4828f + ")";
    }
}
