package M3;

import e3.EnumC2791e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import p4.t0;

/* renamed from: M3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1320o {

    /* renamed from: a, reason: collision with root package name */
    private final b f7049a;

    /* renamed from: b, reason: collision with root package name */
    private final String f7050b;

    /* renamed from: c, reason: collision with root package name */
    private final B2.b f7051c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f7052d;

    /* renamed from: e, reason: collision with root package name */
    private final a f7053e;

    /* renamed from: f, reason: collision with root package name */
    private final List f7054f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f7055g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f7056h;

    /* renamed from: i, reason: collision with root package name */
    private final B2.b f7057i;

    /* renamed from: M3.o$a */
    /* loaded from: classes4.dex */
    public static final class a implements t0 {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC2791e f7058a;

        public a(EnumC2791e brand) {
            AbstractC3255y.i(brand, "brand");
            this.f7058a = brand;
        }

        public final EnumC2791e a() {
            return this.f7058a;
        }

        @Override // p4.t0
        public B2.b b() {
            return B2.c.b(this.f7058a.h());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f7058a == ((a) obj).f7058a) {
                return true;
            }
            return false;
        }

        @Override // p4.t0
        public Integer getIcon() {
            return Integer.valueOf(this.f7058a.k());
        }

        public int hashCode() {
            return this.f7058a.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(brand=" + this.f7058a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: M3.o$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f7059a = new b("Idle", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f7060b = new b("Updating", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f7061c = new b("Removing", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f7062d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ U5.a f7063e;

        static {
            b[] a8 = a();
            f7062d = a8;
            f7063e = U5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f7059a, f7060b, f7061c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f7062d.clone();
        }
    }

    public C1320o(b status, String last4, B2.b displayName, boolean z8, a selectedBrand, List availableBrands, boolean z9, boolean z10, B2.b bVar) {
        AbstractC3255y.i(status, "status");
        AbstractC3255y.i(last4, "last4");
        AbstractC3255y.i(displayName, "displayName");
        AbstractC3255y.i(selectedBrand, "selectedBrand");
        AbstractC3255y.i(availableBrands, "availableBrands");
        this.f7049a = status;
        this.f7050b = last4;
        this.f7051c = displayName;
        this.f7052d = z8;
        this.f7053e = selectedBrand;
        this.f7054f = availableBrands;
        this.f7055g = z9;
        this.f7056h = z10;
        this.f7057i = bVar;
    }

    public final List a() {
        return this.f7054f;
    }

    public final boolean b() {
        return this.f7055g;
    }

    public final boolean c() {
        return this.f7052d;
    }

    public final boolean d() {
        return this.f7056h;
    }

    public final B2.b e() {
        return this.f7051c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1320o)) {
            return false;
        }
        C1320o c1320o = (C1320o) obj;
        if (this.f7049a == c1320o.f7049a && AbstractC3255y.d(this.f7050b, c1320o.f7050b) && AbstractC3255y.d(this.f7051c, c1320o.f7051c) && this.f7052d == c1320o.f7052d && AbstractC3255y.d(this.f7053e, c1320o.f7053e) && AbstractC3255y.d(this.f7054f, c1320o.f7054f) && this.f7055g == c1320o.f7055g && this.f7056h == c1320o.f7056h && AbstractC3255y.d(this.f7057i, c1320o.f7057i)) {
            return true;
        }
        return false;
    }

    public final B2.b f() {
        return this.f7057i;
    }

    public final String g() {
        return this.f7050b;
    }

    public final a h() {
        return this.f7053e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f7049a.hashCode() * 31) + this.f7050b.hashCode()) * 31) + this.f7051c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f7052d)) * 31) + this.f7053e.hashCode()) * 31) + this.f7054f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f7055g)) * 31) + androidx.compose.foundation.a.a(this.f7056h)) * 31;
        B2.b bVar = this.f7057i;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final b i() {
        return this.f7049a;
    }

    public String toString() {
        return "EditPaymentMethodViewState(status=" + this.f7049a + ", last4=" + this.f7050b + ", displayName=" + this.f7051c + ", canUpdate=" + this.f7052d + ", selectedBrand=" + this.f7053e + ", availableBrands=" + this.f7054f + ", canRemove=" + this.f7055g + ", confirmRemoval=" + this.f7056h + ", error=" + this.f7057i + ")";
    }

    public /* synthetic */ C1320o(b bVar, String str, B2.b bVar2, boolean z8, a aVar, List list, boolean z9, boolean z10, B2.b bVar3, int i8, AbstractC3247p abstractC3247p) {
        this(bVar, str, bVar2, z8, aVar, list, z9, (i8 & 128) != 0 ? false : z10, (i8 & 256) != 0 ? null : bVar3);
    }
}
