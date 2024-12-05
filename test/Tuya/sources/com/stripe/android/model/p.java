package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import M5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import b3.C1864I;
import b3.C1869d;
import b3.InterfaceC1863H;
import b3.K;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.o;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24583a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f24584b;

    /* renamed from: c, reason: collision with root package name */
    private final c f24585c;

    /* renamed from: d, reason: collision with root package name */
    private final h f24586d;

    /* renamed from: e, reason: collision with root package name */
    private final g f24587e;

    /* renamed from: f, reason: collision with root package name */
    private final k f24588f;

    /* renamed from: g, reason: collision with root package name */
    private final a f24589g;

    /* renamed from: h, reason: collision with root package name */
    private final b f24590h;

    /* renamed from: i, reason: collision with root package name */
    private final l f24591i;

    /* renamed from: j, reason: collision with root package name */
    private final o f24592j;

    /* renamed from: k, reason: collision with root package name */
    private final j f24593k;

    /* renamed from: l, reason: collision with root package name */
    private final n f24594l;

    /* renamed from: m, reason: collision with root package name */
    private final i f24595m;

    /* renamed from: n, reason: collision with root package name */
    private final d f24596n;

    /* renamed from: o, reason: collision with root package name */
    private final m f24597o;

    /* renamed from: p, reason: collision with root package name */
    private final o.e f24598p;

    /* renamed from: q, reason: collision with root package name */
    private final o.b f24599q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f24600r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f24601s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f24602t;

    /* renamed from: u, reason: collision with root package name */
    public static final e f24581u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f24582v = 8;
    public static final Parcelable.Creator<p> CREATOR = new f();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24605a;

        /* renamed from: b, reason: collision with root package name */
        private String f24606b;

        /* renamed from: c, reason: collision with root package name */
        private static final C0521a f24603c = new C0521a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f24604d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0521a {
            private C0521a() {
            }

            public /* synthetic */ C0521a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String bsbNumber, String accountNumber) {
            AbstractC3159y.i(bsbNumber, "bsbNumber");
            AbstractC3159y.i(accountNumber, "accountNumber");
            this.f24605a = bsbNumber;
            this.f24606b = accountNumber;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f24605a, aVar.f24605a) && AbstractC3159y.d(this.f24606b, aVar.f24606b);
        }

        public int hashCode() {
            return (this.f24605a.hashCode() * 31) + this.f24606b.hashCode();
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f24605a + ", accountNumber=" + this.f24606b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24605a);
            out.writeString(this.f24606b);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            return Q.k(L5.x.a("bsb_number", this.f24605a), L5.x.a("account_number", this.f24606b));
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24609a;

        /* renamed from: b, reason: collision with root package name */
        private String f24610b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f24607c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f24608d = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0522b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final b a(p params) {
                Map map;
                Object obj;
                String str;
                Object obj2;
                String str2;
                AbstractC3159y.i(params, "params");
                Object obj3 = params.y().get(o.p.f24538o.f24550a);
                if (obj3 instanceof Map) {
                    map = (Map) obj3;
                } else {
                    map = null;
                }
                if (map != null) {
                    obj = map.get("account_number");
                } else {
                    obj = null;
                }
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (map != null) {
                    obj2 = map.get("sort_code");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str2 = (String) obj2;
                } else {
                    str2 = null;
                }
                if (str == null || str2 == null) {
                    return null;
                }
                return new b(str, str2);
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.p$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0522b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String accountNumber, String sortCode) {
            AbstractC3159y.i(accountNumber, "accountNumber");
            AbstractC3159y.i(sortCode, "sortCode");
            this.f24609a = accountNumber;
            this.f24610b = sortCode;
        }

        public final String b() {
            return this.f24609a;
        }

        public final String c() {
            return this.f24610b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3159y.d(this.f24609a, bVar.f24609a) && AbstractC3159y.d(this.f24610b, bVar.f24610b);
        }

        public int hashCode() {
            return (this.f24609a.hashCode() * 31) + this.f24610b.hashCode();
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.f24609a + ", sortCode=" + this.f24610b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24609a);
            out.writeString(this.f24610b);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            return Q.k(L5.x.a("account_number", this.f24609a), L5.x.a("sort_code", this.f24610b));
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1863H, Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return new d();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e {
        private e() {
        }

        public static /* synthetic */ p e(e eVar, c cVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.a(cVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p f(e eVar, g gVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.b(gVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p g(e eVar, j jVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.c(jVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p h(e eVar, n nVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                eVar2 = null;
            }
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                bVar = null;
            }
            return eVar.d(nVar, eVar2, map, bVar);
        }

        public static /* synthetic */ p n(e eVar, o.e eVar2, Map map, o.b bVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                eVar2 = null;
            }
            if ((i8 & 2) != 0) {
                map = null;
            }
            if ((i8 & 4) != 0) {
                bVar = null;
            }
            return eVar.m(eVar2, map, bVar);
        }

        private final String p(p pVar, String str) {
            Object obj;
            Map map;
            Object obj2;
            Map map2 = pVar.f24602t;
            if (map2 != null) {
                obj = map2.get("billing_details");
            } else {
                obj = null;
            }
            if (obj instanceof Map) {
                map = (Map) obj;
            } else {
                map = null;
            }
            if (map != null) {
                obj2 = map.get(str);
            } else {
                obj2 = null;
            }
            if (!(obj2 instanceof String)) {
                return null;
            }
            return (String) obj2;
        }

        public final p a(c card, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(card, "card");
            return new p(card, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final p b(g fpx, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(fpx, "fpx");
            return new p(fpx, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final p c(j netbanking, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(netbanking, "netbanking");
            return new p(netbanking, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final p d(n usBankAccount, o.e eVar, Map map, o.b bVar) {
            AbstractC3159y.i(usBankAccount, "usBankAccount");
            return new p(usBankAccount, bVar, eVar, map, (AbstractC3151p) null);
        }

        public final b i(p params) {
            AbstractC3159y.i(params, "params");
            return b.f24607c.a(params);
        }

        public final p j(JSONObject googlePayPaymentData) {
            String str;
            C1869d b8;
            K b9;
            AbstractC3159y.i(googlePayPaymentData, "googlePayPaymentData");
            com.stripe.android.model.k b10 = com.stripe.android.model.k.f24303g.b(googlePayPaymentData);
            C1864I i8 = b10.i();
            String str2 = null;
            if (i8 != null) {
                str = i8.getId();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str3 = str;
            if (i8 != null && (b8 = i8.b()) != null && (b9 = b8.b()) != null) {
                str2 = b9.toString();
            }
            return e(this, new c(null, null, null, null, str3, a0.j(str2), null, 79, null), new o.e(b10.b(), b10.c(), b10.e(), b10.f()), null, null, 12, null);
        }

        public final p k(String paymentMethodId, boolean z8, Set productUsage) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            AbstractC3159y.i(productUsage, "productUsage");
            return new p(o.p.f24531h.f24550a, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, productUsage, Q.e(L5.x.a("link", Q.e(L5.x.a("payment_method_id", paymentMethodId)))), 262140, null);
        }

        public final p l(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3159y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3159y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new p(o.p.f24531h, null, null, null, null, null, null, null, null, null, null, new i(paymentDetailsId, consumerSessionClientSecret, map), null, null, null, null, null, null, null, 522238, null);
        }

        public final p m(o.e eVar, Map map, o.b bVar) {
            return new p(o.p.f24522O, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409598, null);
        }

        public final p o(String code, o.e eVar, boolean z8, Map map, Set productUsage, o.b bVar) {
            AbstractC3159y.i(code, "code");
            AbstractC3159y.i(productUsage, "productUsage");
            return new p(code, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, null, productUsage, map, 163836, null);
        }

        public final String q(p params) {
            String str;
            AbstractC3159y.i(params, "params");
            o.e j8 = params.j();
            if (j8 == null || (str = j8.f24449b) == null) {
                return p(params, NotificationCompat.CATEGORY_EMAIL);
            }
            return str;
        }

        public final String r(p params) {
            String str;
            AbstractC3159y.i(params, "params");
            o.e j8 = params.j();
            if (j8 == null || (str = j8.f24450c) == null) {
                return p(params, "name");
            }
            return str;
        }

        public /* synthetic */ e(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p createFromParcel(Parcel parcel) {
            i iVar;
            n nVar;
            LinkedHashMap linkedHashMap;
            LinkedHashSet linkedHashSet;
            LinkedHashMap linkedHashMap2;
            AbstractC3159y.i(parcel, "parcel");
            String readString = parcel.readString();
            boolean z8 = parcel.readInt() != 0;
            c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            h createFromParcel2 = parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel);
            g createFromParcel3 = parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel);
            k createFromParcel4 = parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel);
            a createFromParcel5 = parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel);
            b createFromParcel6 = parcel.readInt() == 0 ? null : b.CREATOR.createFromParcel(parcel);
            l createFromParcel7 = parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel);
            o createFromParcel8 = parcel.readInt() == 0 ? null : o.CREATOR.createFromParcel(parcel);
            j createFromParcel9 = parcel.readInt() == 0 ? null : j.CREATOR.createFromParcel(parcel);
            n createFromParcel10 = parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel);
            i createFromParcel11 = parcel.readInt() == 0 ? null : i.CREATOR.createFromParcel(parcel);
            d createFromParcel12 = parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel);
            m createFromParcel13 = parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel);
            o.e createFromParcel14 = parcel.readInt() == 0 ? null : o.e.CREATOR.createFromParcel(parcel);
            o.b createFromParcel15 = parcel.readInt() == 0 ? null : o.b.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                nVar = createFromParcel10;
                iVar = createFromParcel11;
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt);
                iVar = createFromParcel11;
                int i8 = 0;
                while (i8 != readInt) {
                    linkedHashMap3.put(parcel.readString(), parcel.readString());
                    i8++;
                    readInt = readInt;
                    createFromParcel10 = createFromParcel10;
                }
                nVar = createFromParcel10;
                linkedHashMap = linkedHashMap3;
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(readInt2);
            for (int i9 = 0; i9 != readInt2; i9++) {
                linkedHashSet2.add(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = null;
            } else {
                int readInt3 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt3);
                int i10 = 0;
                while (i10 != readInt3) {
                    linkedHashMap4.put(parcel.readString(), parcel.readValue(p.class.getClassLoader()));
                    i10++;
                    readInt3 = readInt3;
                    linkedHashSet2 = linkedHashSet2;
                }
                linkedHashSet = linkedHashSet2;
                linkedHashMap2 = linkedHashMap4;
            }
            return new p(readString, z8, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, nVar, iVar, createFromParcel12, createFromParcel13, createFromParcel14, createFromParcel15, linkedHashMap, linkedHashSet, linkedHashMap2);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final p[] newArray(int i8) {
            return new p[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24624a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24622b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24623c = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str) {
            this.f24624a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC3159y.d(this.f24624a, ((g) obj).f24624a);
        }

        public int hashCode() {
            String str = this.f24624a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Fpx(bank=" + this.f24624a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24624a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24624a;
            if (str != null) {
                map = Q.e(L5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24627a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24625b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24626c = 8;
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new h(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(String str) {
            this.f24627a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC3159y.d(this.f24627a, ((h) obj).f24627a);
        }

        public int hashCode() {
            String str = this.f24627a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Ideal(bank=" + this.f24627a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24627a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24627a;
            if (str != null) {
                map = Q.e(L5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24630a;

        /* renamed from: b, reason: collision with root package name */
        private String f24631b;

        /* renamed from: c, reason: collision with root package name */
        private Map f24632c;

        /* renamed from: d, reason: collision with root package name */
        private static final a f24628d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f24629e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readValue(i.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new i(readString, readString2, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3159y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3159y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.f24630a = paymentDetailsId;
            this.f24631b = consumerSessionClientSecret;
            this.f24632c = map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return AbstractC3159y.d(this.f24630a, iVar.f24630a) && AbstractC3159y.d(this.f24631b, iVar.f24631b) && AbstractC3159y.d(this.f24632c, iVar.f24632c);
        }

        public int hashCode() {
            int hashCode = ((this.f24630a.hashCode() * 31) + this.f24631b.hashCode()) * 31;
            Map map = this.f24632c;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.f24630a + ", consumerSessionClientSecret=" + this.f24631b + ", extraParams=" + this.f24632c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24630a);
            out.writeString(this.f24631b);
            Map map = this.f24632c;
            if (map == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeValue(entry.getValue());
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map k8 = Q.k(L5.x.a("payment_details_id", this.f24630a), L5.x.a("credentials", Q.e(L5.x.a("consumer_session_client_secret", this.f24631b))));
            Map map = this.f24632c;
            if (map == null) {
                map = Q.h();
            }
            return Q.q(k8, map);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24635a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24633b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24634c = 8;
        public static final Parcelable.Creator<j> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new j(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i8) {
                return new j[i8];
            }
        }

        public j(String bank) {
            AbstractC3159y.i(bank, "bank");
            this.f24635a = bank;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && AbstractC3159y.d(this.f24635a, ((j) obj).f24635a);
        }

        public int hashCode() {
            return this.f24635a.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f24635a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24635a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            String lowerCase = this.f24635a.toLowerCase(Locale.ROOT);
            AbstractC3159y.h(lowerCase, "toLowerCase(...)");
            return Q.e(L5.x.a("bank", lowerCase));
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24638a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24636b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24637c = 8;
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new k(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str) {
            this.f24638a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && AbstractC3159y.d(this.f24638a, ((k) obj).f24638a);
        }

        public int hashCode() {
            String str = this.f24638a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SepaDebit(iban=" + this.f24638a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24638a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24638a;
            if (str != null) {
                map = Q.e(L5.x.a("iban", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24641a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24639b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f24640c = 8;
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new l(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String country) {
            AbstractC3159y.i(country, "country");
            this.f24641a = country;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && AbstractC3159y.d(this.f24641a, ((l) obj).f24641a);
        }

        public int hashCode() {
            return this.f24641a.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f24641a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24641a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            String upperCase = this.f24641a.toUpperCase(Locale.ROOT);
            AbstractC3159y.h(upperCase, "toUpperCase(...)");
            return Q.e(L5.x.a("country", upperCase));
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC1863H, Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return new m();
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f24644a;

        /* renamed from: b, reason: collision with root package name */
        private String f24645b;

        /* renamed from: c, reason: collision with root package name */
        private String f24646c;

        /* renamed from: d, reason: collision with root package name */
        private o.r.c f24647d;

        /* renamed from: e, reason: collision with root package name */
        private o.r.b f24648e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f24642f = new a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f24643g = 8;
        public static final Parcelable.Creator<n> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.r.c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? o.r.b.CREATOR.createFromParcel(parcel) : null, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public /* synthetic */ n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar, AbstractC3151p abstractC3151p) {
            this(str, str2, str3, cVar, bVar);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return AbstractC3159y.d(this.f24644a, nVar.f24644a) && AbstractC3159y.d(this.f24645b, nVar.f24645b) && AbstractC3159y.d(this.f24646c, nVar.f24646c) && this.f24647d == nVar.f24647d && this.f24648e == nVar.f24648e;
        }

        public int hashCode() {
            String str = this.f24644a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24645b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24646c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o.r.c cVar = this.f24647d;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            o.r.b bVar = this.f24648e;
            return hashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + this.f24644a + ", accountNumber=" + this.f24645b + ", routingNumber=" + this.f24646c + ", accountType=" + this.f24647d + ", accountHolderType=" + this.f24648e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24644a);
            out.writeString(this.f24645b);
            out.writeString(this.f24646c);
            o.r.c cVar = this.f24647d;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.r.b bVar = this.f24648e;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                bVar.writeToParcel(out, i8);
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            String str = this.f24644a;
            if (str != null) {
                AbstractC3159y.f(str);
                return Q.e(L5.x.a("link_account_session", str));
            }
            String str2 = this.f24645b;
            AbstractC3159y.f(str2);
            L5.r a8 = L5.x.a("account_number", str2);
            String str3 = this.f24646c;
            AbstractC3159y.f(str3);
            L5.r a9 = L5.x.a("routing_number", str3);
            o.r.c cVar = this.f24647d;
            AbstractC3159y.f(cVar);
            L5.r a10 = L5.x.a("account_type", cVar.e());
            o.r.b bVar = this.f24648e;
            AbstractC3159y.f(bVar);
            return Q.k(a8, a9, a10, L5.x.a("account_holder_type", bVar.e()));
        }

        private n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar) {
            this.f24644a = str;
            this.f24645b = str2;
            this.f24646c = str3;
            this.f24647d = cVar;
            this.f24648e = bVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public n(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            AbstractC3159y.i(linkAccountSessionId, "linkAccountSessionId");
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24650a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f24649b = new a(null);
        public static final Parcelable.Creator<o> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(String str) {
            this.f24650a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && AbstractC3159y.d(this.f24650a, ((o) obj).f24650a);
        }

        public int hashCode() {
            String str = this.f24650a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f24650a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24650a);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            String str = this.f24650a;
            if (str != null) {
                map = Q.e(L5.x.a("vpa", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }
    }

    public /* synthetic */ p(c cVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(cVar, bVar, eVar, map);
    }

    private final Map s() {
        i iVar;
        Map y8;
        String str = this.f24583a;
        Map map = null;
        if (AbstractC3159y.d(str, o.p.f24532i.f24550a)) {
            c cVar = this.f24585c;
            if (cVar != null) {
                y8 = cVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24535l.f24550a)) {
            h hVar = this.f24586d;
            if (hVar != null) {
                y8 = hVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24534k.f24550a)) {
            g gVar = this.f24587e;
            if (gVar != null) {
                y8 = gVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24536m.f24550a)) {
            k kVar = this.f24588f;
            if (kVar != null) {
                y8 = kVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24537n.f24550a)) {
            a aVar = this.f24589g;
            if (aVar != null) {
                y8 = aVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24538o.f24550a)) {
            b bVar = this.f24590h;
            if (bVar != null) {
                y8 = bVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24539p.f24550a)) {
            l lVar = this.f24591i;
            if (lVar != null) {
                y8 = lVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24540q.f24550a)) {
            o oVar = this.f24592j;
            if (oVar != null) {
                y8 = oVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24508A.f24550a)) {
            j jVar = this.f24593k;
            if (jVar != null) {
                y8 = jVar.y();
            }
            y8 = null;
        } else if (AbstractC3159y.d(str, o.p.f24522O.f24550a)) {
            n nVar = this.f24594l;
            if (nVar != null) {
                y8 = nVar.y();
            }
            y8 = null;
        } else {
            if (AbstractC3159y.d(str, o.p.f24531h.f24550a) && (iVar = this.f24595m) != null) {
                y8 = iVar.y();
            }
            y8 = null;
        }
        if (y8 == null || y8.isEmpty()) {
            y8 = null;
        }
        if (y8 != null) {
            map = Q.e(L5.x.a(this.f24583a, y8));
        }
        if (map == null) {
            return Q.h();
        }
        return map;
    }

    public final String c() {
        Map map;
        Object obj;
        String str;
        Object obj2 = y().get("card");
        if (obj2 instanceof Map) {
            map = (Map) obj2;
        } else {
            map = null;
        }
        if (map != null) {
            obj = map.get("number");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (str == null) {
            return null;
        }
        return g6.n.V0(str, 4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final p e(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(productUsage, "productUsage");
        return new p(code, z8, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3159y.d(this.f24583a, pVar.f24583a) && this.f24584b == pVar.f24584b && AbstractC3159y.d(this.f24585c, pVar.f24585c) && AbstractC3159y.d(this.f24586d, pVar.f24586d) && AbstractC3159y.d(this.f24587e, pVar.f24587e) && AbstractC3159y.d(this.f24588f, pVar.f24588f) && AbstractC3159y.d(this.f24589g, pVar.f24589g) && AbstractC3159y.d(this.f24590h, pVar.f24590h) && AbstractC3159y.d(this.f24591i, pVar.f24591i) && AbstractC3159y.d(this.f24592j, pVar.f24592j) && AbstractC3159y.d(this.f24593k, pVar.f24593k) && AbstractC3159y.d(this.f24594l, pVar.f24594l) && AbstractC3159y.d(this.f24595m, pVar.f24595m) && AbstractC3159y.d(this.f24596n, pVar.f24596n) && AbstractC3159y.d(this.f24597o, pVar.f24597o) && AbstractC3159y.d(this.f24598p, pVar.f24598p) && this.f24599q == pVar.f24599q && AbstractC3159y.d(this.f24600r, pVar.f24600r) && AbstractC3159y.d(this.f24601s, pVar.f24601s) && AbstractC3159y.d(this.f24602t, pVar.f24602t);
    }

    public int hashCode() {
        int hashCode = ((this.f24583a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24584b)) * 31;
        c cVar = this.f24585c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        h hVar = this.f24586d;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.f24587e;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        k kVar = this.f24588f;
        int hashCode5 = (hashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        a aVar = this.f24589g;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f24590h;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f24591i;
        int hashCode8 = (hashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        o oVar = this.f24592j;
        int hashCode9 = (hashCode8 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        j jVar = this.f24593k;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        n nVar = this.f24594l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        i iVar = this.f24595m;
        int hashCode12 = (hashCode11 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        d dVar = this.f24596n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.f24597o;
        int hashCode14 = (hashCode13 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o.e eVar = this.f24598p;
        int hashCode15 = (hashCode14 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o.b bVar2 = this.f24599q;
        int hashCode16 = (hashCode15 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Map map = this.f24600r;
        int hashCode17 = (((hashCode16 + (map == null ? 0 : map.hashCode())) * 31) + this.f24601s.hashCode()) * 31;
        Map map2 = this.f24602t;
        return hashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public final /* synthetic */ Set i() {
        Set f8;
        if (AbstractC3159y.d(this.f24583a, o.p.f24532i.f24550a)) {
            c cVar = this.f24585c;
            if (cVar == null || (f8 = cVar.b()) == null) {
                f8 = a0.f();
            }
            return a0.m(f8, this.f24601s);
        }
        return this.f24601s;
    }

    public final o.e j() {
        return this.f24598p;
    }

    public final String k() {
        return this.f24583a;
    }

    public final boolean n() {
        return this.f24584b;
    }

    public final String o() {
        return this.f24583a;
    }

    public String toString() {
        return "PaymentMethodCreateParams(code=" + this.f24583a + ", requiresMandate=" + this.f24584b + ", card=" + this.f24585c + ", ideal=" + this.f24586d + ", fpx=" + this.f24587e + ", sepaDebit=" + this.f24588f + ", auBecsDebit=" + this.f24589g + ", bacsDebit=" + this.f24590h + ", sofort=" + this.f24591i + ", upi=" + this.f24592j + ", netbanking=" + this.f24593k + ", usBankAccount=" + this.f24594l + ", link=" + this.f24595m + ", cashAppPay=" + this.f24596n + ", swish=" + this.f24597o + ", billingDetails=" + this.f24598p + ", allowRedisplay=" + this.f24599q + ", metadata=" + this.f24600r + ", productUsage=" + this.f24601s + ", overrideParamMap=" + this.f24602t + ")";
    }

    public final String u() {
        Map map;
        Object obj = y().get("link");
        if (obj instanceof Map) {
            map = (Map) obj;
        } else {
            map = null;
        }
        if (map == null) {
            return null;
        }
        Object obj2 = map.get("payment_method_id");
        if (!(obj2 instanceof String)) {
            return null;
        }
        return (String) obj2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24583a);
        out.writeInt(this.f24584b ? 1 : 0);
        c cVar = this.f24585c;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        h hVar = this.f24586d;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        g gVar = this.f24587e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        k kVar = this.f24588f;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        a aVar = this.f24589g;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        b bVar = this.f24590h;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        l lVar = this.f24591i;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        o oVar = this.f24592j;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        j jVar = this.f24593k;
        if (jVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            jVar.writeToParcel(out, i8);
        }
        n nVar = this.f24594l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        i iVar = this.f24595m;
        if (iVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iVar.writeToParcel(out, i8);
        }
        d dVar = this.f24596n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        m mVar = this.f24597o;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        o.e eVar = this.f24598p;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        o.b bVar2 = this.f24599q;
        if (bVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar2.writeToParcel(out, i8);
        }
        Map map = this.f24600r;
        if (map == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(map.size());
            for (Map.Entry entry : map.entrySet()) {
                out.writeString((String) entry.getKey());
                out.writeString((String) entry.getValue());
            }
        }
        Set set = this.f24601s;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Map map2 = this.f24602t;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            out.writeString((String) entry2.getKey());
            out.writeValue(entry2.getValue());
        }
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map map2;
        Map map3 = this.f24602t;
        Map map4 = null;
        if (map3 == null) {
            Map e8 = Q.e(L5.x.a("type", this.f24583a));
            o.e eVar = this.f24598p;
            if (eVar != null) {
                map = Q.e(L5.x.a("billing_details", eVar.y()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(Q.q(e8, map), s());
            Map map5 = this.f24600r;
            if (map5 != null) {
                map2 = Q.e(L5.x.a(TtmlNode.TAG_METADATA, map5));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            map3 = Q.q(q8, map2);
        }
        o.b bVar = this.f24599q;
        if (bVar != null) {
            map4 = Q.e(L5.x.a("allow_redisplay", bVar.e()));
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        return Q.q(map3, map4);
    }

    public /* synthetic */ p(g gVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(gVar, bVar, eVar, map);
    }

    public /* synthetic */ p(j jVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(jVar, bVar, eVar, map);
    }

    public /* synthetic */ p(n nVar, o.b bVar, o.e eVar, Map map, AbstractC3151p abstractC3151p) {
        this(nVar, bVar, eVar, map);
    }

    public p(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3159y.i(code, "code");
        AbstractC3159y.i(productUsage, "productUsage");
        this.f24583a = code;
        this.f24584b = z8;
        this.f24585c = cVar;
        this.f24586d = hVar;
        this.f24587e = gVar;
        this.f24588f = kVar;
        this.f24589g = aVar;
        this.f24590h = bVar;
        this.f24591i = lVar;
        this.f24592j = oVar;
        this.f24593k = jVar;
        this.f24594l = nVar;
        this.f24595m = iVar;
        this.f24596n = dVar;
        this.f24597o = mVar;
        this.f24598p = eVar;
        this.f24599q = bVar2;
        this.f24600r = map;
        this.f24601s = productUsage;
        this.f24602t = map2;
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f24613a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f24614b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f24615c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24616d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24617e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f24618f;

        /* renamed from: g, reason: collision with root package name */
        private final C0523c f24619g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f24611h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f24612i = 8;
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3159y.i(parcel, "parcel");
                String readString = parcel.readString();
                Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashSet = null;
                } else {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                }
                return new c(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet, parcel.readInt() != 0 ? C0523c.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* renamed from: com.stripe.android.model.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0523c implements InterfaceC1863H, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f24621a;

            /* renamed from: b, reason: collision with root package name */
            private static final a f24620b = new a(null);
            public static final Parcelable.Creator<C0523c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.p$c$c$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.p$c$c$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0523c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new C0523c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0523c[] newArray(int i8) {
                    return new C0523c[i8];
                }
            }

            public C0523c(String str) {
                this.f24621a = str;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof C0523c) && AbstractC3159y.d(((C0523c) obj).f24621a, this.f24621a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f24621a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f24621a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24621a);
            }

            @Override // b3.InterfaceC1863H
            public Map y() {
                String str = this.f24621a;
                if (str != null) {
                    return Q.e(L5.x.a("preferred", str));
                }
                return Q.h();
            }
        }

        public c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0523c c0523c) {
            this.f24613a = str;
            this.f24614b = num;
            this.f24615c = num2;
            this.f24616d = str2;
            this.f24617e = str3;
            this.f24618f = set;
            this.f24619g = c0523c;
        }

        public final Set b() {
            return this.f24618f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3159y.d(this.f24613a, cVar.f24613a) && AbstractC3159y.d(this.f24614b, cVar.f24614b) && AbstractC3159y.d(this.f24615c, cVar.f24615c) && AbstractC3159y.d(this.f24616d, cVar.f24616d) && AbstractC3159y.d(this.f24617e, cVar.f24617e) && AbstractC3159y.d(this.f24618f, cVar.f24618f) && AbstractC3159y.d(this.f24619g, cVar.f24619g);
        }

        public int hashCode() {
            String str = this.f24613a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f24614b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f24615c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f24616d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24617e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set set = this.f24618f;
            int hashCode6 = (hashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            C0523c c0523c = this.f24619g;
            return hashCode6 + (c0523c != null ? c0523c.hashCode() : 0);
        }

        public String toString() {
            return "Card(number=" + this.f24613a + ", expiryMonth=" + this.f24614b + ", expiryYear=" + this.f24615c + ", cvc=" + this.f24616d + ", token=" + this.f24617e + ", attribution=" + this.f24618f + ", networks=" + this.f24619g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24613a);
            Integer num = this.f24614b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24615c;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f24616d);
            out.writeString(this.f24617e);
            Set set = this.f24618f;
            if (set == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
            }
            C0523c c0523c = this.f24619g;
            if (c0523c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c0523c.writeToParcel(out, i8);
            }
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            L5.r rVar;
            L5.r a8 = L5.x.a("number", this.f24613a);
            L5.r a9 = L5.x.a("exp_month", this.f24614b);
            L5.r a10 = L5.x.a("exp_year", this.f24615c);
            L5.r a11 = L5.x.a("cvc", this.f24616d);
            L5.r a12 = L5.x.a("token", this.f24617e);
            C0523c c0523c = this.f24619g;
            if (c0523c != null) {
                map = c0523c.y();
            } else {
                map = null;
            }
            List<L5.r> p8 = AbstractC1246t.p(a8, a9, a10, a11, a12, L5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (L5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = L5.x.a(rVar2.c(), d8);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return Q.w(arrayList);
        }

        public /* synthetic */ c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0523c c0523c, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? null : num2, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : set, (i8 & 64) != 0 ? null : c0523c);
        }
    }

    public /* synthetic */ p(String str, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3151p abstractC3151p) {
        this(str, z8, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : hVar, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? null : kVar, (i8 & 64) != 0 ? null : aVar, (i8 & 128) != 0 ? null : bVar, (i8 & 256) != 0 ? null : lVar, (i8 & 512) != 0 ? null : oVar, (i8 & 1024) != 0 ? null : jVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : iVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : mVar, (32768 & i8) != 0 ? null : eVar, (65536 & i8) != 0 ? null : bVar2, (131072 & i8) != 0 ? null : map, (262144 & i8) != 0 ? a0.f() : set, (i8 & 524288) != 0 ? null : map2);
    }

    public /* synthetic */ p(o.p pVar, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3151p abstractC3151p) {
        this(pVar, (i8 & 2) != 0 ? null : cVar, (i8 & 4) != 0 ? null : hVar, (i8 & 8) != 0 ? null : gVar, (i8 & 16) != 0 ? null : kVar, (i8 & 32) != 0 ? null : aVar, (i8 & 64) != 0 ? null : bVar, (i8 & 128) != 0 ? null : lVar, (i8 & 256) != 0 ? null : oVar, (i8 & 512) != 0 ? null : jVar, (i8 & 1024) != 0 ? null : nVar, (i8 & 2048) != 0 ? null : iVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : mVar, (i8 & 16384) != 0 ? null : eVar, (i8 & 32768) != 0 ? null : bVar2, (i8 & 65536) != 0 ? null : map, (i8 & 131072) != 0 ? a0.f() : set, (i8 & 262144) == 0 ? map2 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(o.p type, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        this(type.f24550a, type.f24553d, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
        AbstractC3159y.i(type, "type");
        AbstractC3159y.i(productUsage, "productUsage");
    }

    private p(c cVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24532i, cVar, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409596, null);
    }

    private p(g gVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24534k, null, null, gVar, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409590, null);
    }

    private p(j jVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24508A, null, null, null, null, null, null, null, null, jVar, null, null, null, null, eVar, bVar, map, null, null, 409086, null);
    }

    private p(n nVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f24522O, null, null, null, null, null, null, null, null, null, nVar, null, null, null, eVar, bVar, map, null, null, 408574, null);
    }
}
