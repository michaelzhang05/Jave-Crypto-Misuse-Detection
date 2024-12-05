package com.google.gson;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FieldNamingPolicy.java */
/* loaded from: classes2.dex */
public abstract class c implements com.google.gson.d {

    /* renamed from: f, reason: collision with root package name */
    public static final c f16828f;

    /* renamed from: g, reason: collision with root package name */
    public static final c f16829g;

    /* renamed from: h, reason: collision with root package name */
    public static final c f16830h;

    /* renamed from: i, reason: collision with root package name */
    public static final c f16831i;

    /* renamed from: j, reason: collision with root package name */
    public static final c f16832j;

    /* renamed from: k, reason: collision with root package name */
    public static final c f16833k;
    private static final /* synthetic */ c[] l;

    /* compiled from: FieldNamingPolicy.java */
    /* loaded from: classes2.dex */
    enum a extends c {
        a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // com.google.gson.d
        public String d(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f16828f = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: com.google.gson.c.b
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String d(Field field) {
                return c.n(field.getName());
            }
        };
        f16829g = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: com.google.gson.c.c
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String d(Field field) {
                return c.n(c.i(field.getName(), " "));
            }
        };
        f16830h = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: com.google.gson.c.d
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String d(Field field) {
                return c.i(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f16831i = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: com.google.gson.c.e
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String d(Field field) {
                return c.i(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f16832j = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: com.google.gson.c.f
            {
                a aVar2 = null;
            }

            @Override // com.google.gson.d
            public String d(Field field) {
                return c.i(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f16833k = cVar5;
        l = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i2) {
    }

    private static String f(char c2, String str, int i2) {
        if (i2 < str.length()) {
            return c2 + str.substring(i2);
        }
        return String.valueOf(c2);
    }

    static String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String n(String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i2 < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i2++;
            charAt = str.charAt(i2);
        }
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        sb.append(f(Character.toUpperCase(charAt), str, i2 + 1));
        return sb.toString();
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) l.clone();
    }

    /* synthetic */ c(String str, int i2, a aVar) {
        this(str, i2);
    }
}
