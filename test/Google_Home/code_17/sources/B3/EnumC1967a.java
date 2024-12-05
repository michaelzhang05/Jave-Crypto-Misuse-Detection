package b3;

import P5.AbstractC1378t;
import P5.a0;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: b3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class EnumC1967a {

    /* renamed from: a, reason: collision with root package name */
    public static final EnumC1967a f15307a = new EnumC1967a("Unsupported", 0) { // from class: b3.a.e
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            AbstractC3255y.i(metadata, "metadata");
            return false;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final EnumC1967a f15308b = new EnumC1967a("UnsupportedForSetup", 1) { // from class: b3.a.f
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            AbstractC3255y.i(metadata, "metadata");
            return !metadata.Y();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC1967a f15309c = new EnumC1967a("ShippingAddress", 2) { // from class: b3.a.d
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            n nVar;
            n.h hVar;
            AbstractC3255y.i(metadata, "metadata");
            if (metadata.u()) {
                return true;
            }
            StripeIntent W7 = metadata.W();
            String str = null;
            if (W7 instanceof n) {
                nVar = (n) W7;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                hVar = nVar.p();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                str = hVar.b();
            }
            if (str != null && hVar.a().g() != null && hVar.a().b() != null && hVar.a().i() != null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC1967a f15310d = new EnumC1967a("MerchantSupportsDelayedPaymentMethods", 3) { // from class: b3.a.c
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            AbstractC3255y.i(metadata, "metadata");
            return metadata.s();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC1967a f15311e = new EnumC1967a("FinancialConnectionsSdk", 4) { // from class: b3.a.a
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            AbstractC3255y.i(metadata, "metadata");
            return metadata.y();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC1967a f15312f = new EnumC1967a("ValidUsBankVerificationMethod", 5) { // from class: b3.a.g
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            Map map;
            Object obj;
            boolean z8;
            AbstractC3255y.i(metadata, "metadata");
            Object obj2 = metadata.W().O().get(o.p.f25577O.f25605a);
            String str = null;
            if (obj2 instanceof Map) {
                map = (Map) obj2;
            } else {
                map = null;
            }
            if (map != null) {
                obj = map.get("verification_method");
            } else {
                obj = null;
            }
            if (obj instanceof String) {
                str = (String) obj;
            }
            boolean d02 = AbstractC1378t.d0(a0.i("instant", "automatic"), str);
            if (metadata.W().d() == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (!d02 && !z8) {
                return false;
            }
            return true;
        }
    };

    /* renamed from: g, reason: collision with root package name */
    public static final EnumC1967a f15313g = new EnumC1967a("InstantDebits", 6) { // from class: b3.a.b
        {
            AbstractC3247p abstractC3247p = null;
        }

        @Override // b3.EnumC1967a
        public boolean b(C1970d metadata) {
            boolean z8;
            AbstractC3255y.i(metadata, "metadata");
            boolean z9 = !metadata.W().e().contains(o.p.f25577O.f25605a);
            boolean contains = metadata.W().K().contains("bank_account");
            if (metadata.W().d() == null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z9 && contains && !z8) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumC1967a[] f15314h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ U5.a f15315i;

    static {
        EnumC1967a[] a8 = a();
        f15314h = a8;
        f15315i = U5.b.a(a8);
    }

    public /* synthetic */ EnumC1967a(String str, int i8, AbstractC3247p abstractC3247p) {
        this(str, i8);
    }

    private static final /* synthetic */ EnumC1967a[] a() {
        return new EnumC1967a[]{f15307a, f15308b, f15309c, f15310d, f15311e, f15312f, f15313g};
    }

    public static EnumC1967a valueOf(String str) {
        return (EnumC1967a) Enum.valueOf(EnumC1967a.class, str);
    }

    public static EnumC1967a[] values() {
        return (EnumC1967a[]) f15314h.clone();
    }

    public abstract boolean b(C1970d c1970d);

    private EnumC1967a(String str, int i8) {
    }
}
