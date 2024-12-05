package b4;

import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f15458c;

    /* renamed from: d, reason: collision with root package name */
    public static final g f15459d = new g("Text", 0, "01", true);

    /* renamed from: e, reason: collision with root package name */
    public static final g f15460e = new g("SingleSelect", 1, "02", true);

    /* renamed from: f, reason: collision with root package name */
    public static final g f15461f = new g("MultiSelect", 2, "03", true);

    /* renamed from: g, reason: collision with root package name */
    public static final g f15462g = new g("OutOfBand", 3, "04", false);

    /* renamed from: h, reason: collision with root package name */
    public static final g f15463h = new g("Html", 4, "05", false);

    /* renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ g[] f15464i;

    /* renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ U5.a f15465j;

    /* renamed from: a, reason: collision with root package name */
    private final String f15466a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15467b;

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
                    if (AbstractC3255y.d(str, ((g) obj).b())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (g) obj;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        g[] a8 = a();
        f15464i = a8;
        f15465j = U5.b.a(a8);
        f15458c = new a(null);
    }

    private g(String str, int i8, String str2, boolean z8) {
        this.f15466a = str2;
        this.f15467b = z8;
    }

    private static final /* synthetic */ g[] a() {
        return new g[]{f15459d, f15460e, f15461f, f15462g, f15463h};
    }

    public static U5.a c() {
        return f15465j;
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f15464i.clone();
    }

    public final String b() {
        return this.f15466a;
    }

    public final boolean d() {
        return this.f15467b;
    }
}
