package e3;

import androidx.core.os.EnvironmentCompat;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: e3.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class EnumC2792f {

    /* renamed from: b, reason: collision with root package name */
    public static final a f31467b;

    /* renamed from: c, reason: collision with root package name */
    public static final EnumC2792f f31468c = new EnumC2792f("Credit", 0, "credit");

    /* renamed from: d, reason: collision with root package name */
    public static final EnumC2792f f31469d = new EnumC2792f("Debit", 1, "debit");

    /* renamed from: e, reason: collision with root package name */
    public static final EnumC2792f f31470e = new EnumC2792f("Prepaid", 2, "prepaid");

    /* renamed from: f, reason: collision with root package name */
    public static final EnumC2792f f31471f = new EnumC2792f("Unknown", 3, EnvironmentCompat.MEDIA_UNKNOWN);

    /* renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumC2792f[] f31472g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ U5.a f31473h;

    /* renamed from: a, reason: collision with root package name */
    private final String f31474a;

    /* renamed from: e3.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final EnumC2792f a(String str) {
            Object obj;
            Iterator<E> it = EnumC2792f.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3255y.d(((EnumC2792f) obj).b(), str)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (EnumC2792f) obj;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        EnumC2792f[] a8 = a();
        f31472g = a8;
        f31473h = U5.b.a(a8);
        f31467b = new a(null);
    }

    private EnumC2792f(String str, int i8, String str2) {
        this.f31474a = str2;
    }

    private static final /* synthetic */ EnumC2792f[] a() {
        return new EnumC2792f[]{f31468c, f31469d, f31470e, f31471f};
    }

    public static U5.a c() {
        return f31473h;
    }

    public static EnumC2792f valueOf(String str) {
        return (EnumC2792f) Enum.valueOf(EnumC2792f.class, str);
    }

    public static EnumC2792f[] values() {
        return (EnumC2792f[]) f31472g.clone();
    }

    public final String b() {
        return this.f31474a;
    }
}
