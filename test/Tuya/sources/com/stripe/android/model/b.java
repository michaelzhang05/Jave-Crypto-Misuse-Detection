package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import b3.InterfaceC1863H;
import b3.InterfaceC1874i;
import com.stripe.android.model.m;
import com.stripe.android.model.r;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class b implements InterfaceC1874i {

    /* renamed from: a, reason: collision with root package name */
    private final p f24215a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24216b;

    /* renamed from: c, reason: collision with root package name */
    private final w f24217c;

    /* renamed from: d, reason: collision with root package name */
    private final String f24218d;

    /* renamed from: e, reason: collision with root package name */
    private final String f24219e;

    /* renamed from: f, reason: collision with root package name */
    private String f24220f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f24221g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f24222h;

    /* renamed from: i, reason: collision with root package name */
    private r f24223i;

    /* renamed from: j, reason: collision with root package name */
    private String f24224j;

    /* renamed from: k, reason: collision with root package name */
    private m f24225k;

    /* renamed from: l, reason: collision with root package name */
    private c f24226l;

    /* renamed from: m, reason: collision with root package name */
    private d f24227m;

    /* renamed from: n, reason: collision with root package name */
    private String f24228n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f24213o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f24214p = 8;
    public static final Parcelable.Creator<b> CREATOR = new C0499b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ b c(a aVar, p pVar, String str, Boolean bool, String str2, m mVar, c cVar, d dVar, r rVar, int i8, Object obj) {
            Boolean bool2;
            String str3;
            m mVar2;
            c cVar2;
            d dVar2;
            r rVar2;
            if ((i8 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i8 & 8) != 0) {
                str3 = null;
            } else {
                str3 = str2;
            }
            if ((i8 & 16) != 0) {
                mVar2 = null;
            } else {
                mVar2 = mVar;
            }
            if ((i8 & 32) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 64) != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            if ((i8 & 128) != 0) {
                rVar2 = null;
            } else {
                rVar2 = rVar;
            }
            return aVar.b(pVar, str, bool2, str3, mVar2, cVar2, dVar2, rVar2);
        }

        public static /* synthetic */ b e(a aVar, String str, String str2, Boolean bool, r rVar, String str3, m mVar, c cVar, d dVar, int i8, Object obj) {
            Boolean bool2;
            r rVar2;
            String str4;
            m mVar2;
            c cVar2;
            d dVar2;
            if ((i8 & 4) != 0) {
                bool2 = null;
            } else {
                bool2 = bool;
            }
            if ((i8 & 8) != 0) {
                rVar2 = null;
            } else {
                rVar2 = rVar;
            }
            if ((i8 & 16) != 0) {
                str4 = null;
            } else {
                str4 = str3;
            }
            if ((i8 & 32) != 0) {
                mVar2 = null;
            } else {
                mVar2 = mVar;
            }
            if ((i8 & 64) != 0) {
                cVar2 = null;
            } else {
                cVar2 = cVar;
            }
            if ((i8 & 128) != 0) {
                dVar2 = null;
            } else {
                dVar2 = dVar;
            }
            return aVar.d(str, str2, bool2, rVar2, str4, mVar2, cVar2, dVar2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final b a(String clientSecret, String paymentMethodId, r rVar) {
            r.b bVar;
            AbstractC3159y.i(clientSecret, "clientSecret");
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            c cVar = null;
            if (rVar instanceof r.b) {
                bVar = (r.b) rVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                cVar = bVar.f();
            }
            AbstractC3151p abstractC3151p = null;
            return new b(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new r.b(null, null, cVar, Boolean.TRUE, 3, abstractC3151p), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 15917, abstractC3151p);
        }

        public final b b(p paymentMethodCreateParams, String clientSecret, Boolean bool, String str, m mVar, c cVar, d dVar, r rVar) {
            AbstractC3159y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3159y.i(clientSecret, "clientSecret");
            return new b(paymentMethodCreateParams, null, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8366, null);
        }

        public final b d(String paymentMethodId, String clientSecret, Boolean bool, r rVar, String str, m mVar, c cVar, d dVar) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            AbstractC3159y.i(clientSecret, "clientSecret");
            return new b(null, paymentMethodId, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8365, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0499b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AbstractC3159y.i(parcel, "parcel");
            p createFromParcel = parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            w createFromParcel2 = parcel.readInt() == 0 ? null : w.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new b(createFromParcel, readString, createFromParcel2, readString2, readString3, readString4, valueOf, parcel.readInt() != 0, (r) parcel.readParcelable(b.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.valueOf(parcel.readString()), parcel.readInt() != 0 ? d.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final b[] newArray(int i8) {
            return new b[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final c f24229b = new c("OnSession", 0, "on_session");

        /* renamed from: c, reason: collision with root package name */
        public static final c f24230c = new c("OffSession", 1, "off_session");

        /* renamed from: d, reason: collision with root package name */
        public static final c f24231d = new c("Blank", 2, "");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f24232e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24233f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24234a;

        static {
            c[] a8 = a();
            f24232e = a8;
            f24233f = R5.b.a(a8);
        }

        private c(String str, int i8, String str2) {
            this.f24234a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f24229b, f24230c, f24231d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f24232e.clone();
        }

        public final String b() {
            return this.f24234a;
        }
    }

    public b(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        this.f24215a = pVar;
        this.f24216b = str;
        this.f24217c = wVar;
        this.f24218d = str2;
        this.f24219e = clientSecret;
        this.f24220f = str3;
        this.f24221g = bool;
        this.f24222h = z8;
        this.f24223i = rVar;
        this.f24224j = str4;
        this.f24225k = mVar;
        this.f24226l = cVar;
        this.f24227m = dVar;
        this.f24228n = str5;
    }

    public static /* synthetic */ b c(b bVar, p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, Object obj) {
        return bVar.b((i8 & 1) != 0 ? bVar.f24215a : pVar, (i8 & 2) != 0 ? bVar.f24216b : str, (i8 & 4) != 0 ? bVar.f24217c : wVar, (i8 & 8) != 0 ? bVar.f24218d : str2, (i8 & 16) != 0 ? bVar.f24219e : str3, (i8 & 32) != 0 ? bVar.f24220f : str4, (i8 & 64) != 0 ? bVar.f24221g : bool, (i8 & 128) != 0 ? bVar.f24222h : z8, (i8 & 256) != 0 ? bVar.f24223i : rVar, (i8 & 512) != 0 ? bVar.f24224j : str5, (i8 & 1024) != 0 ? bVar.f24225k : mVar, (i8 & 2048) != 0 ? bVar.f24226l : cVar, (i8 & 4096) != 0 ? bVar.f24227m : dVar, (i8 & 8192) != 0 ? bVar.f24228n : str6);
    }

    private final Map e() {
        Map y8;
        m mVar = this.f24225k;
        if (mVar == null || (y8 = mVar.y()) == null) {
            p pVar = this.f24215a;
            if (pVar != null && pVar.n() && this.f24224j == null) {
                return new m(m.c.a.f24320e.a()).y();
            }
            return null;
        }
        return y8;
    }

    private final Map j() {
        p pVar = this.f24215a;
        if (pVar != null) {
            return Q.e(L5.x.a("payment_method_data", pVar.y()));
        }
        String str = this.f24216b;
        if (str != null) {
            return Q.e(L5.x.a("payment_method", str));
        }
        w wVar = this.f24217c;
        if (wVar != null) {
            return Q.e(L5.x.a("source_data", wVar.y()));
        }
        String str2 = this.f24218d;
        if (str2 != null) {
            return Q.e(L5.x.a("source", str2));
        }
        return Q.h();
    }

    @Override // b3.InterfaceC1874i
    public void W(String str) {
        this.f24220f = str;
    }

    public final b b(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3159y.i(clientSecret, "clientSecret");
        return new b(pVar, str, wVar, str2, clientSecret, str3, bool, z8, rVar, str4, mVar, cVar, dVar, str5);
    }

    @Override // b3.InterfaceC1874i
    public String d() {
        return this.f24219e;
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
        return AbstractC3159y.d(this.f24215a, bVar.f24215a) && AbstractC3159y.d(this.f24216b, bVar.f24216b) && AbstractC3159y.d(this.f24217c, bVar.f24217c) && AbstractC3159y.d(this.f24218d, bVar.f24218d) && AbstractC3159y.d(this.f24219e, bVar.f24219e) && AbstractC3159y.d(this.f24220f, bVar.f24220f) && AbstractC3159y.d(this.f24221g, bVar.f24221g) && this.f24222h == bVar.f24222h && AbstractC3159y.d(this.f24223i, bVar.f24223i) && AbstractC3159y.d(this.f24224j, bVar.f24224j) && AbstractC3159y.d(this.f24225k, bVar.f24225k) && this.f24226l == bVar.f24226l && AbstractC3159y.d(this.f24227m, bVar.f24227m) && AbstractC3159y.d(this.f24228n, bVar.f24228n);
    }

    public final p f() {
        return this.f24215a;
    }

    public int hashCode() {
        p pVar = this.f24215a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        String str = this.f24216b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f24217c;
        int hashCode3 = (hashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.f24218d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f24219e.hashCode()) * 31;
        String str3 = this.f24220f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f24221g;
        int hashCode6 = (((hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24222h)) * 31;
        r rVar = this.f24223i;
        int hashCode7 = (hashCode6 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str4 = this.f24224j;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        m mVar = this.f24225k;
        int hashCode9 = (hashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        c cVar = this.f24226l;
        int hashCode10 = (hashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f24227m;
        int hashCode11 = (hashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str5 = this.f24228n;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final r i() {
        return this.f24223i;
    }

    public final w k() {
        return this.f24217c;
    }

    @Override // b3.InterfaceC1874i
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public b C(boolean z8) {
        return c(this, null, null, null, null, null, null, null, z8, null, null, null, null, null, null, 16255, null);
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.f24215a + ", paymentMethodId=" + this.f24216b + ", sourceParams=" + this.f24217c + ", sourceId=" + this.f24218d + ", clientSecret=" + this.f24219e + ", returnUrl=" + this.f24220f + ", savePaymentMethod=" + this.f24221g + ", useStripeSdk=" + this.f24222h + ", paymentMethodOptions=" + this.f24223i + ", mandateId=" + this.f24224j + ", mandateData=" + this.f24225k + ", setupFutureUsage=" + this.f24226l + ", shipping=" + this.f24227m + ", receiptEmail=" + this.f24228n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        p pVar = this.f24215a;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24216b);
        w wVar = this.f24217c;
        if (wVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24218d);
        out.writeString(this.f24219e);
        out.writeString(this.f24220f);
        Boolean bool = this.f24221g;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.f24222h ? 1 : 0);
        out.writeParcelable(this.f24223i, i8);
        out.writeString(this.f24224j);
        m mVar = this.f24225k;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        c cVar = this.f24226l;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        d dVar = this.f24227m;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24228n);
    }

    @Override // b3.InterfaceC1874i
    public String x() {
        return this.f24220f;
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map k8 = Q.k(L5.x.a("client_secret", d()), L5.x.a("use_stripe_sdk", Boolean.valueOf(this.f24222h)));
        Boolean bool = this.f24221g;
        Map map8 = null;
        if (bool != null) {
            map = Q.e(L5.x.a("save_payment_method", bool));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(k8, map);
        String str = this.f24224j;
        if (str != null) {
            map2 = Q.e(L5.x.a("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        Map e8 = e();
        if (e8 != null) {
            map3 = Q.e(L5.x.a("mandate_data", e8));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        String x8 = x();
        if (x8 != null) {
            map4 = Q.e(L5.x.a("return_url", x8));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        r rVar = this.f24223i;
        if (rVar != null) {
            map5 = Q.e(L5.x.a("payment_method_options", rVar.y()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        c cVar = this.f24226l;
        if (cVar != null) {
            map6 = Q.e(L5.x.a("setup_future_usage", cVar.b()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        d dVar = this.f24227m;
        if (dVar != null) {
            map7 = Q.e(L5.x.a("shipping", dVar.y()));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(Q.q(q13, map7), j());
        String str2 = this.f24228n;
        if (str2 != null) {
            map8 = Q.e(L5.x.a("receipt_email", str2));
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        return Q.q(q14, map8);
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1863H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f24236a;

        /* renamed from: b, reason: collision with root package name */
        private final String f24237b;

        /* renamed from: c, reason: collision with root package name */
        private final String f24238c;

        /* renamed from: d, reason: collision with root package name */
        private final String f24239d;

        /* renamed from: e, reason: collision with root package name */
        private final String f24240e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f24235f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0500b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0500b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String name, String str, String str2, String str3) {
            AbstractC3159y.i(address, "address");
            AbstractC3159y.i(name, "name");
            this.f24236a = address;
            this.f24237b = name;
            this.f24238c = str;
            this.f24239d = str2;
            this.f24240e = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3159y.d(this.f24236a, dVar.f24236a) && AbstractC3159y.d(this.f24237b, dVar.f24237b) && AbstractC3159y.d(this.f24238c, dVar.f24238c) && AbstractC3159y.d(this.f24239d, dVar.f24239d) && AbstractC3159y.d(this.f24240e, dVar.f24240e);
        }

        public int hashCode() {
            int hashCode = ((this.f24236a.hashCode() * 31) + this.f24237b.hashCode()) * 31;
            String str = this.f24238c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24239d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24240e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f24236a + ", name=" + this.f24237b + ", carrier=" + this.f24238c + ", phone=" + this.f24239d + ", trackingNumber=" + this.f24240e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24236a.writeToParcel(out, i8);
            out.writeString(this.f24237b);
            out.writeString(this.f24238c);
            out.writeString(this.f24239d);
            out.writeString(this.f24240e);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            List<L5.r> p8 = AbstractC1246t.p(L5.x.a("address", this.f24236a.y()), L5.x.a("name", this.f24237b), L5.x.a("carrier", this.f24238c), L5.x.a(HintConstants.AUTOFILL_HINT_PHONE, this.f24239d), L5.x.a("tracking_number", this.f24240e));
            Map h8 = Q.h();
            for (L5.r rVar : p8) {
                String str = (String) rVar.a();
                Object b8 = rVar.b();
                if (b8 != null) {
                    map = Q.e(L5.x.a(str, b8));
                } else {
                    map = null;
                }
                if (map == null) {
                    map = Q.h();
                }
                h8 = Q.q(h8, map);
            }
            return h8;
        }

        public /* synthetic */ d(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4, int i8, AbstractC3151p abstractC3151p) {
            this(aVar, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ b(p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, AbstractC3151p abstractC3151p) {
        this((i8 & 1) != 0 ? null : pVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : wVar, (i8 & 8) != 0 ? null : str2, str3, (i8 & 32) != 0 ? null : str4, (i8 & 64) != 0 ? null : bool, (i8 & 128) != 0 ? false : z8, (i8 & 256) != 0 ? null : rVar, (i8 & 512) != 0 ? null : str5, (i8 & 1024) != 0 ? null : mVar, (i8 & 2048) != 0 ? null : cVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : str6);
    }
}
