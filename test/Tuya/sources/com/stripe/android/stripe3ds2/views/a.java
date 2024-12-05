package com.stripe.android.stripe3ds2.views;

import L5.s;
import L5.t;
import M5.AbstractC1246t;
import androidx.core.os.EnvironmentCompat;
import g6.n;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0681a f27001e;

    /* renamed from: g, reason: collision with root package name */
    public static final a f27003g;

    /* renamed from: i, reason: collision with root package name */
    public static final a f27005i;

    /* renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ a[] f27009m;

    /* renamed from: n, reason: collision with root package name */
    private static final /* synthetic */ R5.a f27010n;

    /* renamed from: a, reason: collision with root package name */
    private final String f27011a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27012b;

    /* renamed from: c, reason: collision with root package name */
    private final Integer f27013c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f27014d;

    /* renamed from: f, reason: collision with root package name */
    public static final a f27002f = new a("Visa", 0, "visa", P3.c.f7935h, Integer.valueOf(P3.f.f7982f), false, 8, null);

    /* renamed from: h, reason: collision with root package name */
    public static final a f27004h = new a("Amex", 2, "american_express", P3.c.f7928a, Integer.valueOf(P3.f.f7977a), false, 8, null);

    /* renamed from: j, reason: collision with root package name */
    public static final a f27006j = new a("CartesBancaires", 4, "cartes_bancaires", P3.c.f7929b, Integer.valueOf(P3.f.f7978b), true);

    /* renamed from: k, reason: collision with root package name */
    public static final a f27007k = new a("UnionPay", 5, "unionpay", P3.c.f7933f, Integer.valueOf(P3.f.f7981e), false, 8, null);

    /* renamed from: l, reason: collision with root package name */
    public static final a f27008l = new a("Unknown", 6, EnvironmentCompat.MEDIA_UNKNOWN, P3.c.f7934g, null, false, 8, null);

    /* renamed from: com.stripe.android.stripe3ds2.views.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0681a {
        private C0681a() {
        }

        public final a a(String directoryServerName, U3.c errorReporter) {
            Object obj;
            Object b8;
            AbstractC3159y.i(directoryServerName, "directoryServerName");
            AbstractC3159y.i(errorReporter, "errorReporter");
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
                R5.a d8 = a.d();
                ArrayList arrayList = new ArrayList(AbstractC1246t.x(d8, 10));
                Iterator<E> it2 = d8.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((a) it2.next()).b());
                }
                s.a aVar2 = s.f6511b;
                b8 = s.b(t.a(new R3.b("Directory server name '" + directoryServerName + "' is not supported. Must be one of " + arrayList + ".", null, 2, null)));
            }
            Throwable e8 = s.e(b8);
            if (e8 != null) {
                errorReporter.i(e8);
            }
            a aVar3 = a.f27008l;
            if (s.g(b8)) {
                b8 = aVar3;
            }
            return (a) b8;
        }

        public /* synthetic */ C0681a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    static {
        int i8 = 8;
        AbstractC3151p abstractC3151p = null;
        boolean z8 = false;
        f27003g = new a("Mastercard", 1, "mastercard", P3.c.f7932e, Integer.valueOf(P3.f.f7980d), z8, i8, abstractC3151p);
        f27005i = new a("Discover", 3, "discover", P3.c.f7930c, Integer.valueOf(P3.f.f7979c), z8, i8, abstractC3151p);
        a[] a8 = a();
        f27009m = a8;
        f27010n = R5.b.a(a8);
        f27001e = new C0681a(null);
    }

    private a(String str, int i8, String str2, int i9, Integer num, boolean z8) {
        this.f27011a = str2;
        this.f27012b = i9;
        this.f27013c = num;
        this.f27014d = z8;
    }

    private static final /* synthetic */ a[] a() {
        return new a[]{f27002f, f27003g, f27004h, f27005i, f27006j, f27007k, f27008l};
    }

    public static R5.a d() {
        return f27010n;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f27009m.clone();
    }

    public final String b() {
        return this.f27011a;
    }

    public final int c() {
        return this.f27012b;
    }

    public final Integer e() {
        return this.f27013c;
    }

    public final boolean f() {
        return this.f27014d;
    }

    /* synthetic */ a(String str, int i8, String str2, int i9, Integer num, boolean z8, int i10, AbstractC3151p abstractC3151p) {
        this(str, i8, str2, i9, num, (i10 & 8) != 0 ? false : z8);
    }
}
