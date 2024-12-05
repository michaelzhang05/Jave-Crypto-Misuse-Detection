package Y2;

import M5.AbstractC1246t;
import M5.a0;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.n;
import com.stripe.android.model.o;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13022a = new a("Unsupported", 0) { // from class: Y2.a.e
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            AbstractC3159y.i(metadata, "metadata");
            return false;
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public static final a f13023b = new a("UnsupportedForSetup", 1) { // from class: Y2.a.f
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            AbstractC3159y.i(metadata, "metadata");
            return !metadata.Y();
        }
    };

    /* renamed from: c, reason: collision with root package name */
    public static final a f13024c = new a("ShippingAddress", 2) { // from class: Y2.a.d
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            n nVar;
            n.h hVar;
            AbstractC3159y.i(metadata, "metadata");
            if (metadata.o()) {
                return true;
            }
            StripeIntent V7 = metadata.V();
            String str = null;
            if (V7 instanceof n) {
                nVar = (n) V7;
            } else {
                nVar = null;
            }
            if (nVar != null) {
                hVar = nVar.k();
            } else {
                hVar = null;
            }
            if (hVar != null) {
                str = hVar.c();
            }
            if (str != null && hVar.b().e() != null && hVar.b().c() != null && hVar.b().i() != null) {
                return true;
            }
            return false;
        }
    };

    /* renamed from: d, reason: collision with root package name */
    public static final a f13025d = new a("MerchantSupportsDelayedPaymentMethods", 3) { // from class: Y2.a.c
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            AbstractC3159y.i(metadata, "metadata");
            return metadata.n();
        }
    };

    /* renamed from: e, reason: collision with root package name */
    public static final a f13026e = new a("FinancialConnectionsSdk", 4) { // from class: Y2.a.a
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            AbstractC3159y.i(metadata, "metadata");
            return metadata.G();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    public static final a f13027f = new a("ValidUsBankVerificationMethod", 5) { // from class: Y2.a.g
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            Map map;
            Object obj;
            boolean z8;
            AbstractC3159y.i(metadata, "metadata");
            Object obj2 = metadata.V().N().get(o.p.f24522O.f24550a);
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
            boolean d02 = AbstractC1246t.d0(a0.i("instant", "automatic"), str);
            if (metadata.V().d() == null) {
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
    public static final a f13028g = new a("InstantDebits", 6) { // from class: Y2.a.b
        {
            AbstractC3151p abstractC3151p = null;
        }

        @Override // Y2.a
        public boolean b(Y2.d metadata) {
            boolean z8;
            AbstractC3159y.i(metadata, "metadata");
            boolean z9 = !metadata.V().g().contains(o.p.f24522O.f24550a);
            boolean contains = metadata.V().H().contains("bank_account");
            if (metadata.V().d() == null) {
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
    private static final /* synthetic */ a[] f13029h;

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ R5.a f13030i;

    static {
        a[] a8 = a();
        f13029h = a8;
        f13030i = R5.b.a(a8);
    }

    public /* synthetic */ a(String str, int i8, AbstractC3151p abstractC3151p) {
        this(str, i8);
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f13022a, f13023b, f13024c, f13025d, f13026e, f13027f, f13028g};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f13029h.clone();
    }

    public abstract boolean b(Y2.d dVar);

    private a(String str, int i8) {
    }
}
