package A2;

import androidx.browser.trusted.sharing.ShareTarget;
import java.io.OutputStream;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private Map f115a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f116b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f117b = new a(ShareTarget.METHOD_GET, 0, ShareTarget.METHOD_GET);

        /* renamed from: c, reason: collision with root package name */
        public static final a f118c = new a(ShareTarget.METHOD_POST, 1, ShareTarget.METHOD_POST);

        /* renamed from: d, reason: collision with root package name */
        public static final a f119d = new a("DELETE", 2, "DELETE");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f120e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f121f;

        /* renamed from: a, reason: collision with root package name */
        private final String f122a;

        static {
            a[] a8 = a();
            f120e = a8;
            f121f = U5.b.a(a8);
        }

        private a(String str, int i8, String str2) {
            this.f122a = str2;
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f117b, f118c, f119d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f120e.clone();
        }

        public final String b() {
            return this.f122a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: b, reason: collision with root package name */
        public static final b f123b = new b("Form", 0, ShareTarget.ENCODING_TYPE_URL_ENCODED);

        /* renamed from: c, reason: collision with root package name */
        public static final b f124c = new b("MultipartForm", 1, ShareTarget.ENCODING_TYPE_MULTIPART);

        /* renamed from: d, reason: collision with root package name */
        public static final b f125d = new b("Json", 2, "application/json");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f126e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f127f;

        /* renamed from: a, reason: collision with root package name */
        private final String f128a;

        static {
            b[] a8 = a();
            f126e = a8;
            f127f = U5.b.a(a8);
        }

        private b(String str, int i8, String str2) {
            this.f128a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f123b, f124c, f125d};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f126e.clone();
        }

        public final String b() {
            return this.f128a;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f128a;
        }
    }

    public abstract Map a();

    public abstract a b();

    public Map c() {
        return this.f115a;
    }

    public abstract Iterable d();

    public boolean e() {
        return this.f116b;
    }

    public abstract String f();

    public void g(OutputStream outputStream) {
        AbstractC3255y.i(outputStream, "outputStream");
    }
}
