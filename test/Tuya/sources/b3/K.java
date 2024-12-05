package b3;

import M5.AbstractC1246t;
import M5.a0;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class K {

    /* renamed from: b, reason: collision with root package name */
    public static final a f14370b;

    /* renamed from: c, reason: collision with root package name */
    public static final K f14371c = new K("ApplePay", 0, a0.d("apple_pay"));

    /* renamed from: d, reason: collision with root package name */
    public static final K f14372d = new K("GooglePay", 1, a0.i("android_pay", "google"));

    /* renamed from: e, reason: collision with root package name */
    public static final K f14373e = new K("Masterpass", 2, a0.d("masterpass"));

    /* renamed from: f, reason: collision with root package name */
    public static final K f14374f = new K("VisaCheckout", 3, a0.d("visa_checkout"));

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ K[] f14375g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ R5.a f14376h;

    /* renamed from: a, reason: collision with root package name */
    private final Set f14377a;

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
                    if (AbstractC1246t.d0(((K) obj).f14377a, str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (K) obj;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        K[] a8 = a();
        f14375g = a8;
        f14376h = R5.b.a(a8);
        f14370b = new a(null);
    }

    private K(String str, int i8, Set set) {
        this.f14377a = set;
    }

    private static final /* synthetic */ K[] a() {
        return new K[]{f14371c, f14372d, f14373e, f14374f};
    }

    public static R5.a c() {
        return f14376h;
    }

    public static K valueOf(String str) {
        return (K) Enum.valueOf(K.class, str);
    }

    public static K[] values() {
        return (K[]) f14375g.clone();
    }
}
