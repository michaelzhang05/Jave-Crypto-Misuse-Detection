package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public abstract class b implements com.google.gson.c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f17551a;

    /* renamed from: b, reason: collision with root package name */
    public static final b f17552b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f17553c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f17554d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f17555e;

    /* renamed from: f, reason: collision with root package name */
    public static final b f17556f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f17557g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ b[] f17558h;

    /* loaded from: classes3.dex */
    enum a extends b {
        a(String str, int i8) {
            super(str, i8, null);
        }

        @Override // com.google.gson.c
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f17551a = aVar;
        b bVar = new b("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.b.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return b.c(field.getName());
            }
        };
        f17552b = bVar;
        b bVar2 = new b("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.b.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return b.c(b.b(field.getName(), ' '));
            }
        };
        f17553c = bVar2;
        b bVar3 = new b("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.b.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return b.b(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        };
        f17554d = bVar3;
        b bVar4 = new b("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: com.google.gson.b.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return b.b(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        };
        f17555e = bVar4;
        b bVar5 = new b("LOWER_CASE_WITH_DASHES", 5) { // from class: com.google.gson.b.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return b.b(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        };
        f17556f = bVar5;
        b bVar6 = new b("LOWER_CASE_WITH_DOTS", 6) { // from class: com.google.gson.b.g
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.c
            public String a(Field field) {
                return b.b(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        };
        f17557g = bVar6;
        f17558h = new b[]{aVar, bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
    }

    private b(String str, int i8) {
    }

    static String b(String str, char c8) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c8);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String c(String str) {
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i8 == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i8) + upperCase + str.substring(i8 + 1);
            }
        }
        return str;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f17558h.clone();
    }

    /* synthetic */ b(String str, int i8, a aVar) {
        this(str, i8);
    }
}
