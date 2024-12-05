package Y3;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f13173c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f13174d = new g("Text", 0, "01", true);

    /* renamed from: e, reason: collision with root package name */
    public static final g f13175e = new g("SingleSelect", 1, "02", true);

    /* renamed from: f, reason: collision with root package name */
    public static final g f13176f = new g("MultiSelect", 2, "03", true);

    /* renamed from: g, reason: collision with root package name */
    public static final g f13177g = new g("OutOfBand", 3, "04", false);

    /* renamed from: h, reason: collision with root package name */
    public static final g f13178h = new g("Html", 4, "05", false);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ g[] f13179i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ R5.a f13180j;

    /* renamed from: a, reason: collision with root package name */
    private final String f13181a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f13182b;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final g a(String str) {
            Object obj;
            Iterator<E> it = g.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (AbstractC3159y.d(str, ((g) obj).b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (g) obj;
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        g[] a8 = a();
        f13179i = a8;
        f13180j = R5.b.a(a8);
        f13173c = new a(null);
    }

    private g(String str, int i8, String str2, boolean z8) {
        this.f13181a = str2;
        this.f13182b = z8;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f13174d, f13175e, f13176f, f13177g, f13178h};
    }

    public static R5.a c() {
        return f13180j;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f13179i.clone();
    }

    public final String b() {
        return this.f13181a;
    }

    public final boolean d() {
        return this.f13182b;
    }
}
