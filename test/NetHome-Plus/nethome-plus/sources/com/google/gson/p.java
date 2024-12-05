package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LongSerializationPolicy.java */
/* loaded from: classes2.dex */
public abstract class p {

    /* renamed from: f, reason: collision with root package name */
    public static final p f16846f;

    /* renamed from: g, reason: collision with root package name */
    public static final p f16847g;

    /* renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ p[] f16848h;

    /* compiled from: LongSerializationPolicy.java */
    /* loaded from: classes2.dex */
    enum a extends p {
        a(String str, int i2) {
            super(str, i2, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f16846f = aVar;
        p pVar = new p("STRING", 1) { // from class: com.google.gson.p.b
            {
                a aVar2 = null;
            }
        };
        f16847g = pVar;
        f16848h = new p[]{aVar, pVar};
    }

    private p(String str, int i2) {
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f16848h.clone();
    }

    /* synthetic */ p(String str, int i2, a aVar) {
        this(str, i2);
    }
}
