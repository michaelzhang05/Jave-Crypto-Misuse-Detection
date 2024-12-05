package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public abstract class p1 {

    /* renamed from: a, reason: collision with root package name */
    static final int f5584a = c(1, 3);

    /* renamed from: b, reason: collision with root package name */
    static final int f5585b = c(1, 4);

    /* renamed from: c, reason: collision with root package name */
    static final int f5586c = c(2, 0);

    /* renamed from: d, reason: collision with root package name */
    static final int f5587d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        public static final b f5588c;

        /* renamed from: d, reason: collision with root package name */
        public static final b f5589d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f5590e;

        /* renamed from: f, reason: collision with root package name */
        public static final b f5591f;

        /* renamed from: g, reason: collision with root package name */
        public static final b f5592g;

        /* renamed from: h, reason: collision with root package name */
        public static final b f5593h;

        /* renamed from: i, reason: collision with root package name */
        public static final b f5594i;

        /* renamed from: j, reason: collision with root package name */
        public static final b f5595j;

        /* renamed from: k, reason: collision with root package name */
        public static final b f5596k;

        /* renamed from: l, reason: collision with root package name */
        public static final b f5597l;

        /* renamed from: m, reason: collision with root package name */
        public static final b f5598m;

        /* renamed from: n, reason: collision with root package name */
        public static final b f5599n;

        /* renamed from: o, reason: collision with root package name */
        public static final b f5600o;

        /* renamed from: p, reason: collision with root package name */
        public static final b f5601p;

        /* renamed from: q, reason: collision with root package name */
        public static final b f5602q;

        /* renamed from: r, reason: collision with root package name */
        public static final b f5603r;

        /* renamed from: s, reason: collision with root package name */
        public static final b f5604s;

        /* renamed from: t, reason: collision with root package name */
        public static final b f5605t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ b[] f5606u;

        /* renamed from: a, reason: collision with root package name */
        private final c f5607a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5608b;

        /* loaded from: classes.dex */
        enum a extends b {
            a(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.p1$b$b, reason: collision with other inner class name */
        /* loaded from: classes.dex */
        enum C0090b extends b {
            C0090b(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        /* loaded from: classes.dex */
        enum c extends b {
            c(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        /* loaded from: classes.dex */
        enum d extends b {
            d(String str, int i6, c cVar, int i7) {
                super(str, i6, cVar, i7);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f5588c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f5589d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f5590e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f5591f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f5592g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f5593h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f5594i = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f5595j = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f5596k = aVar;
            c cVar3 = c.MESSAGE;
            C0090b c0090b = new C0090b("GROUP", 9, cVar3, 3);
            f5597l = c0090b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f5598m = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f5599n = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f5600o = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f5601p = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f5602q = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f5603r = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f5604s = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f5605t = bVar14;
            f5606u = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0090b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i6, c cVar, int i7) {
            this.f5607a = cVar;
            this.f5608b = i7;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f5606u.clone();
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(h.f5485b),
        ENUM(null),
        MESSAGE(null);


        /* renamed from: a, reason: collision with root package name */
        private final Object f5619a;

        c(Object obj) {
            this.f5619a = obj;
        }
    }

    public static int a(int i6) {
        return i6 >>> 3;
    }

    public static int b(int i6) {
        return i6 & 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i6, int i7) {
        return (i6 << 3) | i7;
    }
}
