package l3;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f7400a = Logger.getLogger(b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f7401b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: l3.b$b, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class EnumC0114b {

        /* renamed from: a, reason: collision with root package name */
        public static final EnumC0114b f7402a;

        /* renamed from: b, reason: collision with root package name */
        public static final EnumC0114b f7403b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ EnumC0114b[] f7404c;

        /* renamed from: l3.b$b$a */
        /* loaded from: classes.dex */
        enum a extends EnumC0114b {
            a(String str, int i6) {
                super(str, i6);
            }

            @Override // l3.b.EnumC0114b
            public boolean a() {
                return !b.c();
            }
        }

        /* renamed from: l3.b$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        enum C0115b extends EnumC0114b {
            C0115b(String str, int i6) {
                super(str, i6);
            }

            @Override // l3.b.EnumC0114b
            public boolean a() {
                return !b.c() || b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f7402a = aVar;
            C0115b c0115b = new C0115b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f7403b = c0115b;
            f7404c = new EnumC0114b[]{aVar, c0115b};
        }

        private EnumC0114b(String str, int i6) {
        }

        public static EnumC0114b valueOf(String str) {
            return (EnumC0114b) Enum.valueOf(EnumC0114b.class, str);
        }

        public static EnumC0114b[] values() {
            return (EnumC0114b[]) f7404c.clone();
        }

        public abstract boolean a();
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f7400a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return l3.a.a() || f7401b.get();
    }
}
