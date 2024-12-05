package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import P5.a0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.stripe.android.model.o;
import e3.C2785I;
import e3.C2790d;
import e3.InterfaceC2784H;
import e3.K;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class p implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f25638a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f25639b;

    /* renamed from: c, reason: collision with root package name */
    private final c f25640c;

    /* renamed from: d, reason: collision with root package name */
    private final h f25641d;

    /* renamed from: e, reason: collision with root package name */
    private final g f25642e;

    /* renamed from: f, reason: collision with root package name */
    private final k f25643f;

    /* renamed from: g, reason: collision with root package name */
    private final a f25644g;

    /* renamed from: h, reason: collision with root package name */
    private final b f25645h;

    /* renamed from: i, reason: collision with root package name */
    private final l f25646i;

    /* renamed from: j, reason: collision with root package name */
    private final o f25647j;

    /* renamed from: k, reason: collision with root package name */
    private final j f25648k;

    /* renamed from: l, reason: collision with root package name */
    private final n f25649l;

    /* renamed from: m, reason: collision with root package name */
    private final i f25650m;

    /* renamed from: n, reason: collision with root package name */
    private final d f25651n;

    /* renamed from: o, reason: collision with root package name */
    private final m f25652o;

    /* renamed from: p, reason: collision with root package name */
    private final o.e f25653p;

    /* renamed from: q, reason: collision with root package name */
    private final o.b f25654q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f25655r;

    /* renamed from: s, reason: collision with root package name */
    private final Set f25656s;

    /* renamed from: t, reason: collision with root package name */
    private final Map f25657t;

    /* renamed from: u, reason: collision with root package name */
    public static final e f25636u = new e(null);

    /* renamed from: v, reason: collision with root package name */
    public static final int f25637v = 8;
    public static final Parcelable.Creator<p> CREATOR = new f();

    /* loaded from: classes4.dex */
    public static final class a implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25660a;

        /* renamed from: b, reason: collision with root package name */
        private String f25661b;

        /* renamed from: c, reason: collision with root package name */
        private static final C0517a f25658c = new C0517a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f25659d = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.p$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        private static final class C0517a {
            private C0517a() {
            }

            public /* synthetic */ C0517a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        public a(String bsbNumber, String accountNumber) {
            AbstractC3255y.i(bsbNumber, "bsbNumber");
            AbstractC3255y.i(accountNumber, "accountNumber");
            this.f25660a = bsbNumber;
            this.f25661b = accountNumber;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            return Q.k(O5.x.a("bsb_number", this.f25660a), O5.x.a("account_number", this.f25661b));
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
            return AbstractC3255y.d(this.f25660a, aVar.f25660a) && AbstractC3255y.d(this.f25661b, aVar.f25661b);
        }

        public int hashCode() {
            return (this.f25660a.hashCode() * 31) + this.f25661b.hashCode();
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f25660a + ", accountNumber=" + this.f25661b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25660a);
            out.writeString(this.f25661b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25664a;

        /* renamed from: b, reason: collision with root package name */
        private String f25665b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f25662c = new a(null);

        /* renamed from: d, reason: collision with root package name */
        public static final int f25663d = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0518b();

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
                AbstractC3255y.i(params, "params");
                Object obj3 = params.B().get(o.p.f25593o.f25605a);
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

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.p$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0518b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String accountNumber, String sortCode) {
            AbstractC3255y.i(accountNumber, "accountNumber");
            AbstractC3255y.i(sortCode, "sortCode");
            this.f25664a = accountNumber;
            this.f25665b = sortCode;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            return Q.k(O5.x.a("account_number", this.f25664a), O5.x.a("sort_code", this.f25665b));
        }

        public final String a() {
            return this.f25664a;
        }

        public final String b() {
            return this.f25665b;
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
            return AbstractC3255y.d(this.f25664a, bVar.f25664a) && AbstractC3255y.d(this.f25665b, bVar.f25665b);
        }

        public int hashCode() {
            return (this.f25664a.hashCode() * 31) + this.f25665b.hashCode();
        }

        public String toString() {
            return "BacsDebit(accountNumber=" + this.f25664a + ", sortCode=" + this.f25665b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25664a);
            out.writeString(this.f25665b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2784H, Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            AbstractC3255y.i(out, "out");
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
            Map map2 = pVar.f25657t;
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
            AbstractC3255y.i(card, "card");
            return new p(card, bVar, eVar, map, (AbstractC3247p) null);
        }

        public final p b(g fpx, o.e eVar, Map map, o.b bVar) {
            AbstractC3255y.i(fpx, "fpx");
            return new p(fpx, bVar, eVar, map, (AbstractC3247p) null);
        }

        public final p c(j netbanking, o.e eVar, Map map, o.b bVar) {
            AbstractC3255y.i(netbanking, "netbanking");
            return new p(netbanking, bVar, eVar, map, (AbstractC3247p) null);
        }

        public final p d(n usBankAccount, o.e eVar, Map map, o.b bVar) {
            AbstractC3255y.i(usBankAccount, "usBankAccount");
            return new p(usBankAccount, bVar, eVar, map, (AbstractC3247p) null);
        }

        public final b i(p params) {
            AbstractC3255y.i(params, "params");
            return b.f25662c.a(params);
        }

        public final p j(JSONObject googlePayPaymentData) {
            String str;
            C2790d a8;
            K a9;
            AbstractC3255y.i(googlePayPaymentData, "googlePayPaymentData");
            com.stripe.android.model.k b8 = com.stripe.android.model.k.f25358g.b(googlePayPaymentData);
            C2785I i8 = b8.i();
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
            if (i8 != null && (a8 = i8.a()) != null && (a9 = a8.a()) != null) {
                str2 = a9.toString();
            }
            return e(this, new c(null, null, null, null, str3, a0.j(str2), null, 79, null), new o.e(b8.a(), b8.b(), b8.g(), b8.h()), null, null, 12, null);
        }

        public final p k(String paymentMethodId, boolean z8, Set productUsage) {
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            AbstractC3255y.i(productUsage, "productUsage");
            return new p(o.p.f25586h.f25605a, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, productUsage, Q.e(O5.x.a("link", Q.e(O5.x.a("payment_method_id", paymentMethodId)))), 262140, null);
        }

        public final p l(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
            AbstractC3255y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3255y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            return new p(o.p.f25586h, null, null, null, null, null, null, null, null, null, null, new i(paymentDetailsId, consumerSessionClientSecret, map), null, null, null, null, null, null, null, 522238, null);
        }

        public final p m(o.e eVar, Map map, o.b bVar) {
            return new p(o.p.f25577O, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409598, null);
        }

        public final p o(String code, o.e eVar, boolean z8, Map map, Set productUsage, o.b bVar) {
            AbstractC3255y.i(code, "code");
            AbstractC3255y.i(productUsage, "productUsage");
            return new p(code, z8, null, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, null, productUsage, map, 163836, null);
        }

        public final String q(p params) {
            String str;
            AbstractC3255y.i(params, "params");
            o.e l8 = params.l();
            if (l8 == null || (str = l8.f25504b) == null) {
                return p(params, NotificationCompat.CATEGORY_EMAIL);
            }
            return str;
        }

        public final String r(p params) {
            String str;
            AbstractC3255y.i(params, "params");
            o.e l8 = params.l();
            if (l8 == null || (str = l8.f25505c) == null) {
                return p(params, "name");
            }
            return str;
        }

        public /* synthetic */ e(AbstractC3247p abstractC3247p) {
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
            AbstractC3255y.i(parcel, "parcel");
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
    public static final class g implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25679a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25677b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25678c = 8;
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new g(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        public g(String str) {
            this.f25679a = str;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            String str = this.f25679a;
            if (str != null) {
                map = Q.e(O5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && AbstractC3255y.d(this.f25679a, ((g) obj).f25679a);
        }

        public int hashCode() {
            String str = this.f25679a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Fpx(bank=" + this.f25679a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25679a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25682a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25680b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25681c = 8;
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new h(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        public h(String str) {
            this.f25682a = str;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            String str = this.f25682a;
            if (str != null) {
                map = Q.e(O5.x.a("bank", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && AbstractC3255y.d(this.f25682a, ((h) obj).f25682a);
        }

        public int hashCode() {
            String str = this.f25682a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Ideal(bank=" + this.f25682a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25682a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25685a;

        /* renamed from: b, reason: collision with root package name */
        private String f25686b;

        /* renamed from: c, reason: collision with root package name */
        private Map f25687c;

        /* renamed from: d, reason: collision with root package name */
        private static final a f25683d = new a(null);

        /* renamed from: e, reason: collision with root package name */
        public static final int f25684e = 8;
        public static final Parcelable.Creator<i> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                AbstractC3255y.i(parcel, "parcel");
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
            AbstractC3255y.i(paymentDetailsId, "paymentDetailsId");
            AbstractC3255y.i(consumerSessionClientSecret, "consumerSessionClientSecret");
            this.f25685a = paymentDetailsId;
            this.f25686b = consumerSessionClientSecret;
            this.f25687c = map;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map k8 = Q.k(O5.x.a("payment_details_id", this.f25685a), O5.x.a("credentials", Q.e(O5.x.a("consumer_session_client_secret", this.f25686b))));
            Map map = this.f25687c;
            if (map == null) {
                map = Q.h();
            }
            return Q.q(k8, map);
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
            return AbstractC3255y.d(this.f25685a, iVar.f25685a) && AbstractC3255y.d(this.f25686b, iVar.f25686b) && AbstractC3255y.d(this.f25687c, iVar.f25687c);
        }

        public int hashCode() {
            int hashCode = ((this.f25685a.hashCode() * 31) + this.f25686b.hashCode()) * 31;
            Map map = this.f25687c;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        public String toString() {
            return "Link(paymentDetailsId=" + this.f25685a + ", consumerSessionClientSecret=" + this.f25686b + ", extraParams=" + this.f25687c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25685a);
            out.writeString(this.f25686b);
            Map map = this.f25687c;
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
    }

    /* loaded from: classes4.dex */
    public static final class j implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25690a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25688b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25689c = 8;
        public static final Parcelable.Creator<j> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new j(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final j[] newArray(int i8) {
                return new j[i8];
            }
        }

        public j(String bank) {
            AbstractC3255y.i(bank, "bank");
            this.f25690a = bank;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            String lowerCase = this.f25690a.toLowerCase(Locale.ROOT);
            AbstractC3255y.h(lowerCase, "toLowerCase(...)");
            return Q.e(O5.x.a("bank", lowerCase));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && AbstractC3255y.d(this.f25690a, ((j) obj).f25690a);
        }

        public int hashCode() {
            return this.f25690a.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f25690a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25690a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25693a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25691b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25692c = 8;
        public static final Parcelable.Creator<k> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new k(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str) {
            this.f25693a = str;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            String str = this.f25693a;
            if (str != null) {
                map = Q.e(O5.x.a("iban", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && AbstractC3255y.d(this.f25693a, ((k) obj).f25693a);
        }

        public int hashCode() {
            String str = this.f25693a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "SepaDebit(iban=" + this.f25693a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25693a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25696a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25694b = new a(null);

        /* renamed from: c, reason: collision with root package name */
        public static final int f25695c = 8;
        public static final Parcelable.Creator<l> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new l(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String country) {
            AbstractC3255y.i(country, "country");
            this.f25696a = country;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            String upperCase = this.f25696a.toUpperCase(Locale.ROOT);
            AbstractC3255y.h(upperCase, "toUpperCase(...)");
            return Q.e(O5.x.a("country", upperCase));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && AbstractC3255y.d(this.f25696a, ((l) obj).f25696a);
        }

        public int hashCode() {
            return this.f25696a.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f25696a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25696a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m implements InterfaceC2784H, Parcelable {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            AbstractC3255y.i(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private String f25699a;

        /* renamed from: b, reason: collision with root package name */
        private String f25700b;

        /* renamed from: c, reason: collision with root package name */
        private String f25701c;

        /* renamed from: d, reason: collision with root package name */
        private o.r.c f25702d;

        /* renamed from: e, reason: collision with root package name */
        private o.r.b f25703e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f25697f = new a(null);

        /* renamed from: g, reason: collision with root package name */
        public static final int f25698g = 8;
        public static final Parcelable.Creator<n> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : o.r.c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? o.r.b.CREATOR.createFromParcel(parcel) : null, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public /* synthetic */ n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar, AbstractC3247p abstractC3247p) {
            this(str, str2, str3, cVar, bVar);
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            String str = this.f25699a;
            if (str != null) {
                AbstractC3255y.f(str);
                return Q.e(O5.x.a("link_account_session", str));
            }
            String str2 = this.f25700b;
            AbstractC3255y.f(str2);
            O5.r a8 = O5.x.a("account_number", str2);
            String str3 = this.f25701c;
            AbstractC3255y.f(str3);
            O5.r a9 = O5.x.a("routing_number", str3);
            o.r.c cVar = this.f25702d;
            AbstractC3255y.f(cVar);
            O5.r a10 = O5.x.a("account_type", cVar.g());
            o.r.b bVar = this.f25703e;
            AbstractC3255y.f(bVar);
            return Q.k(a8, a9, a10, O5.x.a("account_holder_type", bVar.g()));
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
            return AbstractC3255y.d(this.f25699a, nVar.f25699a) && AbstractC3255y.d(this.f25700b, nVar.f25700b) && AbstractC3255y.d(this.f25701c, nVar.f25701c) && this.f25702d == nVar.f25702d && this.f25703e == nVar.f25703e;
        }

        public int hashCode() {
            String str = this.f25699a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25700b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25701c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            o.r.c cVar = this.f25702d;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            o.r.b bVar = this.f25703e;
            return hashCode4 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(linkAccountSessionId=" + this.f25699a + ", accountNumber=" + this.f25700b + ", routingNumber=" + this.f25701c + ", accountType=" + this.f25702d + ", accountHolderType=" + this.f25703e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25699a);
            out.writeString(this.f25700b);
            out.writeString(this.f25701c);
            o.r.c cVar = this.f25702d;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            o.r.b bVar = this.f25703e;
            if (bVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                bVar.writeToParcel(out, i8);
            }
        }

        private n(String str, String str2, String str3, o.r.c cVar, o.r.b bVar) {
            this.f25699a = str;
            this.f25700b = str2;
            this.f25701c = str3;
            this.f25702d = cVar;
            this.f25703e = bVar;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public n(String linkAccountSessionId) {
            this(linkAccountSessionId, null, null, null, null);
            AbstractC3255y.i(linkAccountSessionId, "linkAccountSessionId");
        }
    }

    /* loaded from: classes4.dex */
    public static final class o implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25705a;

        /* renamed from: b, reason: collision with root package name */
        private static final a f25704b = new a(null);
        public static final Parcelable.Creator<o> CREATOR = new b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final o createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final o[] newArray(int i8) {
                return new o[i8];
            }
        }

        public o(String str) {
            this.f25705a = str;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            String str = this.f25705a;
            if (str != null) {
                map = Q.e(O5.x.a("vpa", str));
            } else {
                map = null;
            }
            if (map == null) {
                return Q.h();
            }
            return map;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && AbstractC3255y.d(this.f25705a, ((o) obj).f25705a);
        }

        public int hashCode() {
            String str = this.f25705a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f25705a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25705a);
        }
    }

    public /* synthetic */ p(c cVar, o.b bVar, o.e eVar, Map map, AbstractC3247p abstractC3247p) {
        this(cVar, bVar, eVar, map);
    }

    private final Map v() {
        i iVar;
        Map B8;
        String str = this.f25638a;
        Map map = null;
        if (AbstractC3255y.d(str, o.p.f25587i.f25605a)) {
            c cVar = this.f25640c;
            if (cVar != null) {
                B8 = cVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25590l.f25605a)) {
            h hVar = this.f25641d;
            if (hVar != null) {
                B8 = hVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25589k.f25605a)) {
            g gVar = this.f25642e;
            if (gVar != null) {
                B8 = gVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25591m.f25605a)) {
            k kVar = this.f25643f;
            if (kVar != null) {
                B8 = kVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25592n.f25605a)) {
            a aVar = this.f25644g;
            if (aVar != null) {
                B8 = aVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25593o.f25605a)) {
            b bVar = this.f25645h;
            if (bVar != null) {
                B8 = bVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25594p.f25605a)) {
            l lVar = this.f25646i;
            if (lVar != null) {
                B8 = lVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25595q.f25605a)) {
            o oVar = this.f25647j;
            if (oVar != null) {
                B8 = oVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25563A.f25605a)) {
            j jVar = this.f25648k;
            if (jVar != null) {
                B8 = jVar.B();
            }
            B8 = null;
        } else if (AbstractC3255y.d(str, o.p.f25577O.f25605a)) {
            n nVar = this.f25649l;
            if (nVar != null) {
                B8 = nVar.B();
            }
            B8 = null;
        } else {
            if (AbstractC3255y.d(str, o.p.f25586h.f25605a) && (iVar = this.f25650m) != null) {
                B8 = iVar.B();
            }
            B8 = null;
        }
        if (B8 == null || B8.isEmpty()) {
            B8 = null;
        }
        if (B8 != null) {
            map = Q.e(O5.x.a(this.f25638a, B8));
        }
        if (map == null) {
            return Q.h();
        }
        return map;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        Map map2;
        Map map3 = this.f25657t;
        Map map4 = null;
        if (map3 == null) {
            Map e8 = Q.e(O5.x.a("type", this.f25638a));
            o.e eVar = this.f25653p;
            if (eVar != null) {
                map = Q.e(O5.x.a("billing_details", eVar.B()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(Q.q(e8, map), v());
            Map map5 = this.f25655r;
            if (map5 != null) {
                map2 = Q.e(O5.x.a(TtmlNode.TAG_METADATA, map5));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            map3 = Q.q(q8, map2);
        }
        o.b bVar = this.f25654q;
        if (bVar != null) {
            map4 = Q.e(O5.x.a("allow_redisplay", bVar.g()));
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        return Q.q(map3, map4);
    }

    public final String b() {
        Map map;
        Object obj;
        String str;
        Object obj2 = B().get("card");
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
        return j6.n.V0(str, 4);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return AbstractC3255y.d(this.f25638a, pVar.f25638a) && this.f25639b == pVar.f25639b && AbstractC3255y.d(this.f25640c, pVar.f25640c) && AbstractC3255y.d(this.f25641d, pVar.f25641d) && AbstractC3255y.d(this.f25642e, pVar.f25642e) && AbstractC3255y.d(this.f25643f, pVar.f25643f) && AbstractC3255y.d(this.f25644g, pVar.f25644g) && AbstractC3255y.d(this.f25645h, pVar.f25645h) && AbstractC3255y.d(this.f25646i, pVar.f25646i) && AbstractC3255y.d(this.f25647j, pVar.f25647j) && AbstractC3255y.d(this.f25648k, pVar.f25648k) && AbstractC3255y.d(this.f25649l, pVar.f25649l) && AbstractC3255y.d(this.f25650m, pVar.f25650m) && AbstractC3255y.d(this.f25651n, pVar.f25651n) && AbstractC3255y.d(this.f25652o, pVar.f25652o) && AbstractC3255y.d(this.f25653p, pVar.f25653p) && this.f25654q == pVar.f25654q && AbstractC3255y.d(this.f25655r, pVar.f25655r) && AbstractC3255y.d(this.f25656s, pVar.f25656s) && AbstractC3255y.d(this.f25657t, pVar.f25657t);
    }

    public final p g(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(productUsage, "productUsage");
        return new p(code, z8, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
    }

    public int hashCode() {
        int hashCode = ((this.f25638a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25639b)) * 31;
        c cVar = this.f25640c;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        h hVar = this.f25641d;
        int hashCode3 = (hashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        g gVar = this.f25642e;
        int hashCode4 = (hashCode3 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        k kVar = this.f25643f;
        int hashCode5 = (hashCode4 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        a aVar = this.f25644g;
        int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        b bVar = this.f25645h;
        int hashCode7 = (hashCode6 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        l lVar = this.f25646i;
        int hashCode8 = (hashCode7 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        o oVar = this.f25647j;
        int hashCode9 = (hashCode8 + (oVar == null ? 0 : oVar.hashCode())) * 31;
        j jVar = this.f25648k;
        int hashCode10 = (hashCode9 + (jVar == null ? 0 : jVar.hashCode())) * 31;
        n nVar = this.f25649l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        i iVar = this.f25650m;
        int hashCode12 = (hashCode11 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        d dVar = this.f25651n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        m mVar = this.f25652o;
        int hashCode14 = (hashCode13 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        o.e eVar = this.f25653p;
        int hashCode15 = (hashCode14 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        o.b bVar2 = this.f25654q;
        int hashCode16 = (hashCode15 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
        Map map = this.f25655r;
        int hashCode17 = (((hashCode16 + (map == null ? 0 : map.hashCode())) * 31) + this.f25656s.hashCode()) * 31;
        Map map2 = this.f25657t;
        return hashCode17 + (map2 != null ? map2.hashCode() : 0);
    }

    public final /* synthetic */ Set i() {
        Set f8;
        if (AbstractC3255y.d(this.f25638a, o.p.f25587i.f25605a)) {
            c cVar = this.f25640c;
            if (cVar == null || (f8 = cVar.a()) == null) {
                f8 = a0.f();
            }
            return a0.m(f8, this.f25656s);
        }
        return this.f25656s;
    }

    public final o.e l() {
        return this.f25653p;
    }

    public final String p() {
        return this.f25638a;
    }

    public final boolean s() {
        return this.f25639b;
    }

    public String toString() {
        return "PaymentMethodCreateParams(code=" + this.f25638a + ", requiresMandate=" + this.f25639b + ", card=" + this.f25640c + ", ideal=" + this.f25641d + ", fpx=" + this.f25642e + ", sepaDebit=" + this.f25643f + ", auBecsDebit=" + this.f25644g + ", bacsDebit=" + this.f25645h + ", sofort=" + this.f25646i + ", upi=" + this.f25647j + ", netbanking=" + this.f25648k + ", usBankAccount=" + this.f25649l + ", link=" + this.f25650m + ", cashAppPay=" + this.f25651n + ", swish=" + this.f25652o + ", billingDetails=" + this.f25653p + ", allowRedisplay=" + this.f25654q + ", metadata=" + this.f25655r + ", productUsage=" + this.f25656s + ", overrideParamMap=" + this.f25657t + ")";
    }

    public final String u() {
        return this.f25638a;
    }

    public final String w() {
        Map map;
        Object obj = B().get("link");
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
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25638a);
        out.writeInt(this.f25639b ? 1 : 0);
        c cVar = this.f25640c;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        h hVar = this.f25641d;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        g gVar = this.f25642e;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        k kVar = this.f25643f;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        a aVar = this.f25644g;
        if (aVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            aVar.writeToParcel(out, i8);
        }
        b bVar = this.f25645h;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
        l lVar = this.f25646i;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        o oVar = this.f25647j;
        if (oVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            oVar.writeToParcel(out, i8);
        }
        j jVar = this.f25648k;
        if (jVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            jVar.writeToParcel(out, i8);
        }
        n nVar = this.f25649l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        i iVar = this.f25650m;
        if (iVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            iVar.writeToParcel(out, i8);
        }
        d dVar = this.f25651n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        m mVar = this.f25652o;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        o.e eVar = this.f25653p;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        o.b bVar2 = this.f25654q;
        if (bVar2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar2.writeToParcel(out, i8);
        }
        Map map = this.f25655r;
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
        Set set = this.f25656s;
        out.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            out.writeString((String) it.next());
        }
        Map map2 = this.f25657t;
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

    public /* synthetic */ p(g gVar, o.b bVar, o.e eVar, Map map, AbstractC3247p abstractC3247p) {
        this(gVar, bVar, eVar, map);
    }

    public /* synthetic */ p(j jVar, o.b bVar, o.e eVar, Map map, AbstractC3247p abstractC3247p) {
        this(jVar, bVar, eVar, map);
    }

    public /* synthetic */ p(n nVar, o.b bVar, o.e eVar, Map map, AbstractC3247p abstractC3247p) {
        this(nVar, bVar, eVar, map);
    }

    public p(String code, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        AbstractC3255y.i(code, "code");
        AbstractC3255y.i(productUsage, "productUsage");
        this.f25638a = code;
        this.f25639b = z8;
        this.f25640c = cVar;
        this.f25641d = hVar;
        this.f25642e = gVar;
        this.f25643f = kVar;
        this.f25644g = aVar;
        this.f25645h = bVar;
        this.f25646i = lVar;
        this.f25647j = oVar;
        this.f25648k = jVar;
        this.f25649l = nVar;
        this.f25650m = iVar;
        this.f25651n = dVar;
        this.f25652o = mVar;
        this.f25653p = eVar;
        this.f25654q = bVar2;
        this.f25655r = map;
        this.f25656s = productUsage;
        this.f25657t = map2;
    }

    /* loaded from: classes4.dex */
    public static final class c implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25668a;

        /* renamed from: b, reason: collision with root package name */
        private final Integer f25669b;

        /* renamed from: c, reason: collision with root package name */
        private final Integer f25670c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25671d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25672e;

        /* renamed from: f, reason: collision with root package name */
        private final Set f25673f;

        /* renamed from: g, reason: collision with root package name */
        private final C0519c f25674g;

        /* renamed from: h, reason: collision with root package name */
        public static final a f25666h = new a(null);

        /* renamed from: i, reason: collision with root package name */
        public static final int f25667i = 8;
        public static final Parcelable.Creator<c> CREATOR = new b();

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                LinkedHashSet linkedHashSet;
                AbstractC3255y.i(parcel, "parcel");
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
                return new c(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet, parcel.readInt() != 0 ? C0519c.CREATOR.createFromParcel(parcel) : null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* renamed from: com.stripe.android.model.p$c$c, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0519c implements InterfaceC2784H, Parcelable {

            /* renamed from: a, reason: collision with root package name */
            private final String f25676a;

            /* renamed from: b, reason: collision with root package name */
            private static final a f25675b = new a(null);
            public static final Parcelable.Creator<C0519c> CREATOR = new b();

            /* renamed from: com.stripe.android.model.p$c$c$a */
            /* loaded from: classes4.dex */
            private static final class a {
                private a() {
                }

                public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                    this();
                }
            }

            /* renamed from: com.stripe.android.model.p$c$c$b */
            /* loaded from: classes4.dex */
            public static final class b implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0519c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new C0519c(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0519c[] newArray(int i8) {
                    return new C0519c[i8];
                }
            }

            public C0519c(String str) {
                this.f25676a = str;
            }

            @Override // e3.InterfaceC2784H
            public Map B() {
                String str = this.f25676a;
                if (str != null) {
                    return Q.e(O5.x.a("preferred", str));
                }
                return Q.h();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if ((obj instanceof C0519c) && AbstractC3255y.d(((C0519c) obj).f25676a, this.f25676a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return Objects.hash(this.f25676a);
            }

            public String toString() {
                return "PaymentMethodCreateParams.Card.Networks(preferred=" + this.f25676a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25676a);
            }
        }

        public c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0519c c0519c) {
            this.f25668a = str;
            this.f25669b = num;
            this.f25670c = num2;
            this.f25671d = str2;
            this.f25672e = str3;
            this.f25673f = set;
            this.f25674g = c0519c;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            O5.r rVar;
            O5.r a8 = O5.x.a("number", this.f25668a);
            O5.r a9 = O5.x.a("exp_month", this.f25669b);
            O5.r a10 = O5.x.a("exp_year", this.f25670c);
            O5.r a11 = O5.x.a("cvc", this.f25671d);
            O5.r a12 = O5.x.a("token", this.f25672e);
            C0519c c0519c = this.f25674g;
            if (c0519c != null) {
                map = c0519c.B();
            } else {
                map = null;
            }
            List<O5.r> p8 = AbstractC1378t.p(a8, a9, a10, a11, a12, O5.x.a("networks", map));
            ArrayList arrayList = new ArrayList();
            for (O5.r rVar2 : p8) {
                Object d8 = rVar2.d();
                if (d8 != null) {
                    rVar = O5.x.a(rVar2.c(), d8);
                } else {
                    rVar = null;
                }
                if (rVar != null) {
                    arrayList.add(rVar);
                }
            }
            return Q.w(arrayList);
        }

        public final Set a() {
            return this.f25673f;
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
            return AbstractC3255y.d(this.f25668a, cVar.f25668a) && AbstractC3255y.d(this.f25669b, cVar.f25669b) && AbstractC3255y.d(this.f25670c, cVar.f25670c) && AbstractC3255y.d(this.f25671d, cVar.f25671d) && AbstractC3255y.d(this.f25672e, cVar.f25672e) && AbstractC3255y.d(this.f25673f, cVar.f25673f) && AbstractC3255y.d(this.f25674g, cVar.f25674g);
        }

        public int hashCode() {
            String str = this.f25668a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.f25669b;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25670c;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f25671d;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25672e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Set set = this.f25673f;
            int hashCode6 = (hashCode5 + (set == null ? 0 : set.hashCode())) * 31;
            C0519c c0519c = this.f25674g;
            return hashCode6 + (c0519c != null ? c0519c.hashCode() : 0);
        }

        public String toString() {
            return "Card(number=" + this.f25668a + ", expiryMonth=" + this.f25669b + ", expiryYear=" + this.f25670c + ", cvc=" + this.f25671d + ", token=" + this.f25672e + ", attribution=" + this.f25673f + ", networks=" + this.f25674g + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25668a);
            Integer num = this.f25669b;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25670c;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f25671d);
            out.writeString(this.f25672e);
            Set set = this.f25673f;
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
            C0519c c0519c = this.f25674g;
            if (c0519c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c0519c.writeToParcel(out, i8);
            }
        }

        public /* synthetic */ c(String str, Integer num, Integer num2, String str2, String str3, Set set, C0519c c0519c, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : num, (i8 & 4) != 0 ? null : num2, (i8 & 8) != 0 ? null : str2, (i8 & 16) != 0 ? null : str3, (i8 & 32) != 0 ? null : set, (i8 & 64) != 0 ? null : c0519c);
        }
    }

    public /* synthetic */ p(String str, boolean z8, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3247p abstractC3247p) {
        this(str, z8, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : hVar, (i8 & 16) != 0 ? null : gVar, (i8 & 32) != 0 ? null : kVar, (i8 & 64) != 0 ? null : aVar, (i8 & 128) != 0 ? null : bVar, (i8 & 256) != 0 ? null : lVar, (i8 & 512) != 0 ? null : oVar, (i8 & 1024) != 0 ? null : jVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : iVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : mVar, (32768 & i8) != 0 ? null : eVar, (65536 & i8) != 0 ? null : bVar2, (131072 & i8) != 0 ? null : map, (262144 & i8) != 0 ? a0.f() : set, (i8 & 524288) != 0 ? null : map2);
    }

    public /* synthetic */ p(o.p pVar, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set set, Map map2, int i8, AbstractC3247p abstractC3247p) {
        this(pVar, (i8 & 2) != 0 ? null : cVar, (i8 & 4) != 0 ? null : hVar, (i8 & 8) != 0 ? null : gVar, (i8 & 16) != 0 ? null : kVar, (i8 & 32) != 0 ? null : aVar, (i8 & 64) != 0 ? null : bVar, (i8 & 128) != 0 ? null : lVar, (i8 & 256) != 0 ? null : oVar, (i8 & 512) != 0 ? null : jVar, (i8 & 1024) != 0 ? null : nVar, (i8 & 2048) != 0 ? null : iVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : mVar, (i8 & 16384) != 0 ? null : eVar, (i8 & 32768) != 0 ? null : bVar2, (i8 & 65536) != 0 ? null : map, (i8 & 131072) != 0 ? a0.f() : set, (i8 & 262144) == 0 ? map2 : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(o.p type, c cVar, h hVar, g gVar, k kVar, a aVar, b bVar, l lVar, o oVar, j jVar, n nVar, i iVar, d dVar, m mVar, o.e eVar, o.b bVar2, Map map, Set productUsage, Map map2) {
        this(type.f25605a, type.f25608d, cVar, hVar, gVar, kVar, aVar, bVar, lVar, oVar, jVar, nVar, iVar, dVar, mVar, eVar, bVar2, map, productUsage, map2);
        AbstractC3255y.i(type, "type");
        AbstractC3255y.i(productUsage, "productUsage");
    }

    private p(c cVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25587i, cVar, null, null, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409596, null);
    }

    private p(g gVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25589k, null, null, gVar, null, null, null, null, null, null, null, null, null, null, eVar, bVar, map, null, null, 409590, null);
    }

    private p(j jVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25563A, null, null, null, null, null, null, null, null, jVar, null, null, null, null, eVar, bVar, map, null, null, 409086, null);
    }

    private p(n nVar, o.b bVar, o.e eVar, Map map) {
        this(o.p.f25577O, null, null, null, null, null, null, null, null, null, nVar, null, null, null, eVar, bVar, map, null, null, 408574, null);
    }
}
