package x0;

import java.util.Map;
import w0.InterfaceC4120c;

/* loaded from: classes3.dex */
public abstract class z {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    private static abstract class a implements InterfaceC4120c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f40668a = new C0925a("KEY", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f40669b = new b("VALUE", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f40670c = a();

        /* renamed from: x0.z$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        enum C0925a extends a {
            C0925a(String str, int i8) {
                super(str, i8, null);
            }

            @Override // w0.InterfaceC4120c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getKey();
            }
        }

        /* loaded from: classes3.dex */
        enum b extends a {
            b(String str, int i8) {
                super(str, i8, null);
            }

            @Override // w0.InterfaceC4120c
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object apply(Map.Entry entry) {
                return entry.getValue();
            }
        }

        private a(String str, int i8) {
        }

        private static /* synthetic */ a[] a() {
            return new a[]{f40668a, f40669b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f40670c.clone();
        }

        /* synthetic */ a(String str, int i8, y yVar) {
            this(str, i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC4120c b() {
        return a.f40668a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(Map map) {
        StringBuilder a8 = AbstractC4173h.a(map.size());
        a8.append('{');
        boolean z8 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z8) {
                a8.append(", ");
            }
            a8.append(entry.getKey());
            a8.append('=');
            a8.append(entry.getValue());
            z8 = false;
        }
        a8.append('}');
        return a8.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static InterfaceC4120c d() {
        return a.f40669b;
    }
}
