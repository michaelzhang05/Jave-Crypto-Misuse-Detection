package com.stripe.android.stripe3ds2.views;

import O5.s;
import O5.t;
import P5.AbstractC1378t;
import androidx.core.os.EnvironmentCompat;
import j6.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0677a f28056e;

    /* renamed from: g, reason: collision with root package name */
    public static final a f28058g;

    /* renamed from: i, reason: collision with root package name */
    public static final a f28060i;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ a[] f28064m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ U5.a f28065n;

    /* renamed from: a, reason: collision with root package name */
    private final String f28066a;

    /* renamed from: b, reason: collision with root package name */
    private final int f28067b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f28068c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f28069d;

    /* renamed from: f, reason: collision with root package name */
    public static final a f28057f = new a("Visa", 0, "visa", S3.c.f9766h, Integer.valueOf(S3.f.f9813f), false, 8, null);

    /* renamed from: h, reason: collision with root package name */
    public static final a f28059h = new a("Amex", 2, "american_express", S3.c.f9759a, Integer.valueOf(S3.f.f9808a), false, 8, null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f28061j = new a("CartesBancaires", 4, "cartes_bancaires", S3.c.f9760b, Integer.valueOf(S3.f.f9809b), true);

    /* renamed from: k, reason: collision with root package name */
    public static final a f28062k = new a("UnionPay", 5, "unionpay", S3.c.f9764f, Integer.valueOf(S3.f.f9812e), false, 8, null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f28063l = new a("Unknown", 6, EnvironmentCompat.MEDIA_UNKNOWN, S3.c.f9765g, null, false, 8, null);

    /* renamed from: com.stripe.android.stripe3ds2.views.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0677a {
        private C0677a() {
        }

        public final a a(String directoryServerName, X3.c errorReporter) {
            Object obj;
            Object b8;
            AbstractC3255y.i(directoryServerName, "directoryServerName");
            AbstractC3255y.i(errorReporter, "errorReporter");
            Iterator<E> it = a.d().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (n.s(((a) obj).b(), n.M0(directoryServerName).toString(), true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            a aVar = (a) obj;
            if (aVar != null) {
                b8 = s.b(aVar);
            } else {
                U5.a d8 = a.d();
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(d8, 10));
                Iterator<E> it2 = d8.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((a) it2.next()).b());
                }
                s.a aVar2 = s.f8302b;
                b8 = s.b(t.a(new U3.b("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + ".", null, 2, null)));
            }
            Throwable e8 = s.e(b8);
            if (e8 != null) {
                errorReporter.l(e8);
            }
            a aVar3 = a.f28063l;
            if (s.g(b8)) {
                b8 = aVar3;
            }
            return (a) b8;
        }

        public /* synthetic */ C0677a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    static {
        int i8 = 8;
        AbstractC3247p abstractC3247p = null;
        boolean z8 = false;
        f28058g = new a("Mastercard", 1, "mastercard", S3.c.f9763e, Integer.valueOf(S3.f.f9811d), z8, i8, abstractC3247p);
        f28060i = new a("Discover", 3, "discover", S3.c.f9761c, Integer.valueOf(S3.f.f9810c), z8, i8, abstractC3247p);
        a[] a8 = a();
        f28064m = a8;
        f28065n = U5.b.a(a8);
        f28056e = new C0677a(null);
    }

    private a(String str, int i8, String str2, int i9, Integer num, boolean z8) {
        this.f28066a = str2;
        this.f28067b = i9;
        this.f28068c = num;
        this.f28069d = z8;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f28057f, f28058g, f28059h, f28060i, f28061j, f28062k, f28063l};
    }

    public static U5.a d() {
        return f28065n;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28064m.clone();
    }

    public final String b() {
        return this.f28066a;
    }

    public final int c() {
        return this.f28067b;
    }

    public final Integer e() {
        return this.f28068c;
    }

    public final boolean f() {
        return this.f28069d;
    }

    /* synthetic */ a(String str, int i8, String str2, int i9, Integer num, boolean z8, int i10, AbstractC3247p abstractC3247p) {
        this(str, i8, str2, i9, num, (i10 & 8) != 0 ? false : z8);
    }
}
