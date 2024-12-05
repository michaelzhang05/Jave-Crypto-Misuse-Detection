package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final n f18848a;

    /* renamed from: b, reason: collision with root package name */
    public static final n f18849b;

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ n[] f18850c;

    /* loaded from: classes4.dex */
    enum a extends n {
        a(String str, int i8) {
            super(str, i8, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f18848a = aVar;
        n nVar = new n("STRING", 1) { // from class: com.google.gson.n.b
            {
                a aVar2 = null;
            }
        };
        f18849b = nVar;
        f18850c = new n[]{aVar, nVar};
    }

    private n(String str, int i8) {
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) f18850c.clone();
    }

    /* synthetic */ n(String str, int i8, a aVar) {
        this(str, i8);
    }
}
