package J3;

import b3.EnumC1870e;
import java.util.List;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import m4.t0;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: J3.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1207o {

    /* renamed from: a, reason: collision with root package name */
    private final b f5343a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5344b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3983b f5345c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f5346d;

    /* renamed from: e, reason: collision with root package name */
    private final a f5347e;

    /* renamed from: f, reason: collision with root package name */
    private final List f5348f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f5349g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f5350h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3983b f5351i;

    /* renamed from: J3.o$a */
    /* loaded from: classes4.dex */
    public static final class a implements t0 {

        /* renamed from: a, reason: collision with root package name */
        private final EnumC1870e f5352a;

        public a(EnumC1870e brand) {
            AbstractC3159y.i(brand, "brand");
            this.f5352a = brand;
        }

        public final EnumC1870e a() {
            return this.f5352a;
        }

        @Override // m4.t0
        public InterfaceC3983b b() {
            return AbstractC3984c.b(this.f5352a.h());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && this.f5352a == ((a) obj).f5352a) {
                return true;
            }
            return false;
        }

        @Override // m4.t0
        public Integer getIcon() {
            return Integer.valueOf(this.f5352a.l());
        }

        public int hashCode() {
            return this.f5352a.hashCode();
        }

        public String toString() {
            return "CardBrandChoice(brand=" + this.f5352a + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: J3.o$b */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5353a = new b("Idle", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f5354b = new b("Updating", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f5355c = new b("Removing", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f5356d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ R5.a f5357e;

        static {
            b[] a8 = a();
            f5356d = a8;
            f5357e = R5.b.a(a8);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f5353a, f5354b, f5355c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5356d.clone();
        }
    }

    public C1207o(b status, String last4, InterfaceC3983b displayName, boolean z8, a selectedBrand, List availableBrands, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b) {
        AbstractC3159y.i(status, "status");
        AbstractC3159y.i(last4, "last4");
        AbstractC3159y.i(displayName, "displayName");
        AbstractC3159y.i(selectedBrand, "selectedBrand");
        AbstractC3159y.i(availableBrands, "availableBrands");
        this.f5343a = status;
        this.f5344b = last4;
        this.f5345c = displayName;
        this.f5346d = z8;
        this.f5347e = selectedBrand;
        this.f5348f = availableBrands;
        this.f5349g = z9;
        this.f5350h = z10;
        this.f5351i = interfaceC3983b;
    }

    public final List a() {
        return this.f5348f;
    }

    public final boolean b() {
        return this.f5349g;
    }

    public final boolean c() {
        return this.f5346d;
    }

    public final boolean d() {
        return this.f5350h;
    }

    public final InterfaceC3983b e() {
        return this.f5345c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1207o)) {
            return false;
        }
        C1207o c1207o = (C1207o) obj;
        if (this.f5343a == c1207o.f5343a && AbstractC3159y.d(this.f5344b, c1207o.f5344b) && AbstractC3159y.d(this.f5345c, c1207o.f5345c) && this.f5346d == c1207o.f5346d && AbstractC3159y.d(this.f5347e, c1207o.f5347e) && AbstractC3159y.d(this.f5348f, c1207o.f5348f) && this.f5349g == c1207o.f5349g && this.f5350h == c1207o.f5350h && AbstractC3159y.d(this.f5351i, c1207o.f5351i)) {
            return true;
        }
        return false;
    }

    public final InterfaceC3983b f() {
        return this.f5351i;
    }

    public final String g() {
        return this.f5344b;
    }

    public final a h() {
        return this.f5347e;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f5343a.hashCode() * 31) + this.f5344b.hashCode()) * 31) + this.f5345c.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f5346d)) * 31) + this.f5347e.hashCode()) * 31) + this.f5348f.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f5349g)) * 31) + androidx.compose.foundation.a.a(this.f5350h)) * 31;
        InterfaceC3983b interfaceC3983b = this.f5351i;
        if (interfaceC3983b == null) {
            hashCode = 0;
        } else {
            hashCode = interfaceC3983b.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final b i() {
        return this.f5343a;
    }

    public String toString() {
        return "EditPaymentMethodViewState(status=" + this.f5343a + ", last4=" + this.f5344b + ", displayName=" + this.f5345c + ", canUpdate=" + this.f5346d + ", selectedBrand=" + this.f5347e + ", availableBrands=" + this.f5348f + ", canRemove=" + this.f5349g + ", confirmRemoval=" + this.f5350h + ", error=" + this.f5351i + ")";
    }

    public /* synthetic */ C1207o(b bVar, String str, InterfaceC3983b interfaceC3983b, boolean z8, a aVar, List list, boolean z9, boolean z10, InterfaceC3983b interfaceC3983b2, int i8, AbstractC3151p abstractC3151p) {
        this(bVar, str, interfaceC3983b, z8, aVar, list, z9, (i8 & 128) != 0 ? false : z10, (i8 & 256) != 0 ? null : interfaceC3983b2);
    }
}
