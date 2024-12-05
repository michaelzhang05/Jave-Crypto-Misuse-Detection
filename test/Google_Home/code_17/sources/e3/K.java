package e3;

import P5.AbstractC1378t;
import P5.a0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31376b;

    /* renamed from: c, reason: collision with root package name */
    public static final K f31377c = new K("ApplePay", 0, a0.d("apple_pay"));

    /* renamed from: d, reason: collision with root package name */
    public static final K f31378d = new K("GooglePay", 1, a0.i("android_pay", "google"));

    /* renamed from: e, reason: collision with root package name */
    public static final K f31379e = new K("Masterpass", 2, a0.d("masterpass"));

    /* renamed from: f, reason: collision with root package name */
    public static final K f31380f = new K("VisaCheckout", 3, a0.d("visa_checkout"));

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ K[] f31381g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31382h;

    /* renamed from: a, reason: collision with root package name */
    private final Set f31383a;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final K a(String str) {
            Object obj;
            Iterator<E> it = K.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC1378t.d0(((K) obj).f31383a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (K) obj;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        K[] a8 = a();
        f31381g = a8;
        f31382h = U5.b.a(a8);
        f31376b = new a(null);
    }

    private K(String str, int i8, Set set) {
        this.f31383a = set;
    }

    private static final /* synthetic */ K[] a() {
        return new K[]{f31377c, f31378d, f31379e, f31380f};
    }

    public static U5.a c() {
        return f31382h;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f31381g.clone();
    }
}
