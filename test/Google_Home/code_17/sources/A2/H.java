package A2;

import A2.z;
import P5.AbstractC1378t;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class H {

    /* renamed from: h, reason: collision with root package name */
    public static final a f129h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f130a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f131b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f132c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f133d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f134e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f135f;

    /* renamed from: g, reason: collision with root package name */
    private final z f136g;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public H(int i8, Object obj, Map headers) {
        boolean z8;
        boolean z9;
        String str;
        AbstractC3255y.i(headers, "headers");
        this.f130a = i8;
        this.f131b = obj;
        this.f132c = headers;
        if (i8 == 200) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.f133d = z8;
        if (i8 >= 200 && i8 < 300) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.f134e = z9;
        this.f135f = i8 == 429;
        z.a aVar = z.f279b;
        List c8 = c("Request-Id");
        if (c8 != null) {
            str = (String) AbstractC1378t.o0(c8);
        } else {
            str = null;
        }
        this.f136g = aVar.a(str);
    }

    public final Object a() {
        return this.f131b;
    }

    public final int b() {
        return this.f130a;
    }

    public final List c(String key) {
        Object obj;
        AbstractC3255y.i(key, "key");
        Iterator it = this.f132c.entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (j6.n.s((String) ((Map.Entry) obj).getKey(), key, true)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null) {
            return null;
        }
        return (List) entry.getValue();
    }

    public final z d() {
        return this.f136g;
    }

    public final boolean e() {
        return this.f134e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        if (this.f130a == h8.f130a && AbstractC3255y.d(this.f131b, h8.f131b) && AbstractC3255y.d(this.f132c, h8.f132c)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f133d;
    }

    public int hashCode() {
        int hashCode;
        int i8 = this.f130a * 31;
        Object obj = this.f131b;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((i8 + hashCode) * 31) + this.f132c.hashCode();
    }

    public String toString() {
        return "Request-Id: " + this.f136g + ", Status Code: " + this.f130a;
    }
}
