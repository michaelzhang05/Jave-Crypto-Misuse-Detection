package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import com.stripe.android.model.m;
import com.stripe.android.model.r;
import e3.InterfaceC2784H;
import e3.InterfaceC2795i;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class b implements InterfaceC2795i {

    /* renamed from: a, reason: collision with root package name */
    private final p f25270a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25271b;

    /* renamed from: c, reason: collision with root package name */
    private final w f25272c;

    /* renamed from: d, reason: collision with root package name */
    private final String f25273d;

    /* renamed from: e, reason: collision with root package name */
    private final String f25274e;

    /* renamed from: f, reason: collision with root package name */
    private String f25275f;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f25276g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f25277h;

    /* renamed from: i, reason: collision with root package name */
    private r f25278i;

    /* renamed from: j, reason: collision with root package name */
    private String f25279j;

    /* renamed from: k, reason: collision with root package name */
    private m f25280k;

    /* renamed from: l, reason: collision with root package name */
    private c f25281l;

    /* renamed from: m, reason: collision with root package name */
    private d f25282m;

    /* renamed from: n, reason: collision with root package name */
    private String f25283n;

    /* renamed from: o, reason: collision with root package name */
    public static final a f25268o = new a(null);

    /* renamed from: p, reason: collision with root package name */
    public static final int f25269p = 8;
    public static final Parcelable.Creator<b> CREATOR = new C0495b();

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
            AbstractC3255y.i(clientSecret, "clientSecret");
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            c cVar = null;
            if (rVar instanceof r.b) {
                bVar = (r.b) rVar;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                cVar = bVar.h();
            }
            AbstractC3247p abstractC3247p = null;
            return new b(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new r.b(null, null, cVar, Boolean.TRUE, 3, abstractC3247p), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, null, 15917, abstractC3247p);
        }

        public final b b(p paymentMethodCreateParams, String clientSecret, Boolean bool, String str, m mVar, c cVar, d dVar, r rVar) {
            AbstractC3255y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3255y.i(clientSecret, "clientSecret");
            return new b(paymentMethodCreateParams, null, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8366, null);
        }

        public final b d(String paymentMethodId, String clientSecret, Boolean bool, r rVar, String str, m mVar, c cVar, d dVar) {
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            AbstractC3255y.i(clientSecret, "clientSecret");
            return new b(null, paymentMethodId, null, null, clientSecret, null, bool, false, rVar, str, mVar, cVar, dVar, null, 8365, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.model.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0495b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b createFromParcel(Parcel parcel) {
            Boolean valueOf;
            AbstractC3255y.i(parcel, "parcel");
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
        public static final c f25284b = new c("OnSession", 0, "on_session");

        /* renamed from: c, reason: collision with root package name */
        public static final c f25285c = new c("OffSession", 1, "off_session");

        /* renamed from: d, reason: collision with root package name */
        public static final c f25286d = new c("Blank", 2, "");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ c[] f25287e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25288f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25289a;

        static {
            c[] a8 = a();
            f25287e = a8;
            f25288f = U5.b.a(a8);
        }

        private c(String str, int i8, String str2) {
            this.f25289a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f25284b, f25285c, f25286d};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f25287e.clone();
        }

        public final String b() {
            return this.f25289a;
        }
    }

    public b(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        this.f25270a = pVar;
        this.f25271b = str;
        this.f25272c = wVar;
        this.f25273d = str2;
        this.f25274e = clientSecret;
        this.f25275f = str3;
        this.f25276g = bool;
        this.f25277h = z8;
        this.f25278i = rVar;
        this.f25279j = str4;
        this.f25280k = mVar;
        this.f25281l = cVar;
        this.f25282m = dVar;
        this.f25283n = str5;
    }

    public static /* synthetic */ b b(b bVar, p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, Object obj) {
        return bVar.a((i8 & 1) != 0 ? bVar.f25270a : pVar, (i8 & 2) != 0 ? bVar.f25271b : str, (i8 & 4) != 0 ? bVar.f25272c : wVar, (i8 & 8) != 0 ? bVar.f25273d : str2, (i8 & 16) != 0 ? bVar.f25274e : str3, (i8 & 32) != 0 ? bVar.f25275f : str4, (i8 & 64) != 0 ? bVar.f25276g : bool, (i8 & 128) != 0 ? bVar.f25277h : z8, (i8 & 256) != 0 ? bVar.f25278i : rVar, (i8 & 512) != 0 ? bVar.f25279j : str5, (i8 & 1024) != 0 ? bVar.f25280k : mVar, (i8 & 2048) != 0 ? bVar.f25281l : cVar, (i8 & 4096) != 0 ? bVar.f25282m : dVar, (i8 & 8192) != 0 ? bVar.f25283n : str6);
    }

    private final Map g() {
        Map B8;
        m mVar = this.f25280k;
        if (mVar == null || (B8 = mVar.B()) == null) {
            p pVar = this.f25270a;
            if (pVar != null && pVar.s() && this.f25279j == null) {
                return new m(m.c.a.f25375e.a()).B();
            }
            return null;
        }
        return B8;
    }

    private final Map l() {
        p pVar = this.f25270a;
        if (pVar != null) {
            return Q.e(O5.x.a("payment_method_data", pVar.B()));
        }
        String str = this.f25271b;
        if (str != null) {
            return Q.e(O5.x.a("payment_method", str));
        }
        w wVar = this.f25272c;
        if (wVar != null) {
            return Q.e(O5.x.a("source_data", wVar.B()));
        }
        String str2 = this.f25273d;
        if (str2 != null) {
            return Q.e(O5.x.a("source", str2));
        }
        return Q.h();
    }

    @Override // e3.InterfaceC2795i
    public String A() {
        return this.f25275f;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        Map map5;
        Map map6;
        Map map7;
        Map k8 = Q.k(O5.x.a("client_secret", d()), O5.x.a("use_stripe_sdk", Boolean.valueOf(this.f25277h)));
        Boolean bool = this.f25276g;
        Map map8 = null;
        if (bool != null) {
            map = Q.e(O5.x.a("save_payment_method", bool));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(k8, map);
        String str = this.f25279j;
        if (str != null) {
            map2 = Q.e(O5.x.a("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        Map g8 = g();
        if (g8 != null) {
            map3 = Q.e(O5.x.a("mandate_data", g8));
        } else {
            map3 = null;
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        Map q10 = Q.q(q9, map3);
        String A8 = A();
        if (A8 != null) {
            map4 = Q.e(O5.x.a("return_url", A8));
        } else {
            map4 = null;
        }
        if (map4 == null) {
            map4 = Q.h();
        }
        Map q11 = Q.q(q10, map4);
        r rVar = this.f25278i;
        if (rVar != null) {
            map5 = Q.e(O5.x.a("payment_method_options", rVar.B()));
        } else {
            map5 = null;
        }
        if (map5 == null) {
            map5 = Q.h();
        }
        Map q12 = Q.q(q11, map5);
        c cVar = this.f25281l;
        if (cVar != null) {
            map6 = Q.e(O5.x.a("setup_future_usage", cVar.b()));
        } else {
            map6 = null;
        }
        if (map6 == null) {
            map6 = Q.h();
        }
        Map q13 = Q.q(q12, map6);
        d dVar = this.f25282m;
        if (dVar != null) {
            map7 = Q.e(O5.x.a("shipping", dVar.B()));
        } else {
            map7 = null;
        }
        if (map7 == null) {
            map7 = Q.h();
        }
        Map q14 = Q.q(Q.q(q13, map7), l());
        String str2 = this.f25283n;
        if (str2 != null) {
            map8 = Q.e(O5.x.a("receipt_email", str2));
        }
        if (map8 == null) {
            map8 = Q.h();
        }
        return Q.q(q14, map8);
    }

    @Override // e3.InterfaceC2795i
    public void V(String str) {
        this.f25275f = str;
    }

    public final b a(p pVar, String str, w wVar, String str2, String clientSecret, String str3, Boolean bool, boolean z8, r rVar, String str4, m mVar, c cVar, d dVar, String str5) {
        AbstractC3255y.i(clientSecret, "clientSecret");
        return new b(pVar, str, wVar, str2, clientSecret, str3, bool, z8, rVar, str4, mVar, cVar, dVar, str5);
    }

    @Override // e3.InterfaceC2795i
    public String d() {
        return this.f25274e;
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
        return AbstractC3255y.d(this.f25270a, bVar.f25270a) && AbstractC3255y.d(this.f25271b, bVar.f25271b) && AbstractC3255y.d(this.f25272c, bVar.f25272c) && AbstractC3255y.d(this.f25273d, bVar.f25273d) && AbstractC3255y.d(this.f25274e, bVar.f25274e) && AbstractC3255y.d(this.f25275f, bVar.f25275f) && AbstractC3255y.d(this.f25276g, bVar.f25276g) && this.f25277h == bVar.f25277h && AbstractC3255y.d(this.f25278i, bVar.f25278i) && AbstractC3255y.d(this.f25279j, bVar.f25279j) && AbstractC3255y.d(this.f25280k, bVar.f25280k) && this.f25281l == bVar.f25281l && AbstractC3255y.d(this.f25282m, bVar.f25282m) && AbstractC3255y.d(this.f25283n, bVar.f25283n);
    }

    public final p h() {
        return this.f25270a;
    }

    public int hashCode() {
        p pVar = this.f25270a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        String str = this.f25271b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w wVar = this.f25272c;
        int hashCode3 = (hashCode2 + (wVar == null ? 0 : wVar.hashCode())) * 31;
        String str2 = this.f25273d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f25274e.hashCode()) * 31;
        String str3 = this.f25275f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f25276g;
        int hashCode6 = (((hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25277h)) * 31;
        r rVar = this.f25278i;
        int hashCode7 = (hashCode6 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        String str4 = this.f25279j;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        m mVar = this.f25280k;
        int hashCode9 = (hashCode8 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        c cVar = this.f25281l;
        int hashCode10 = (hashCode9 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f25282m;
        int hashCode11 = (hashCode10 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        String str5 = this.f25283n;
        return hashCode11 + (str5 != null ? str5.hashCode() : 0);
    }

    public final r i() {
        return this.f25278i;
    }

    public final w p() {
        return this.f25272c;
    }

    @Override // e3.InterfaceC2795i
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public b E(boolean z8) {
        return b(this, null, null, null, null, null, null, null, z8, null, null, null, null, null, null, 16255, null);
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.f25270a + ", paymentMethodId=" + this.f25271b + ", sourceParams=" + this.f25272c + ", sourceId=" + this.f25273d + ", clientSecret=" + this.f25274e + ", returnUrl=" + this.f25275f + ", savePaymentMethod=" + this.f25276g + ", useStripeSdk=" + this.f25277h + ", paymentMethodOptions=" + this.f25278i + ", mandateId=" + this.f25279j + ", mandateData=" + this.f25280k + ", setupFutureUsage=" + this.f25281l + ", shipping=" + this.f25282m + ", receiptEmail=" + this.f25283n + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        p pVar = this.f25270a;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25271b);
        w wVar = this.f25272c;
        if (wVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            wVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25273d);
        out.writeString(this.f25274e);
        out.writeString(this.f25275f);
        Boolean bool = this.f25276g;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.f25277h ? 1 : 0);
        out.writeParcelable(this.f25278i, i8);
        out.writeString(this.f25279j);
        m mVar = this.f25280k;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        c cVar = this.f25281l;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        d dVar = this.f25282m;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25283n);
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC2784H, Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.model.a f25291a;

        /* renamed from: b, reason: collision with root package name */
        private final String f25292b;

        /* renamed from: c, reason: collision with root package name */
        private final String f25293c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25294d;

        /* renamed from: e, reason: collision with root package name */
        private final String f25295e;

        /* renamed from: f, reason: collision with root package name */
        private static final a f25290f = new a(null);
        public static final Parcelable.Creator<d> CREATOR = new C0496b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.b$d$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0496b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(com.stripe.android.model.a address, String name, String str, String str2, String str3) {
            AbstractC3255y.i(address, "address");
            AbstractC3255y.i(name, "name");
            this.f25291a = address;
            this.f25292b = name;
            this.f25293c = str;
            this.f25294d = str2;
            this.f25295e = str3;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            List<O5.r> p8 = AbstractC1378t.p(O5.x.a("address", this.f25291a.B()), O5.x.a("name", this.f25292b), O5.x.a("carrier", this.f25293c), O5.x.a(HintConstants.AUTOFILL_HINT_PHONE, this.f25294d), O5.x.a("tracking_number", this.f25295e));
            Map h8 = Q.h();
            for (O5.r rVar : p8) {
                String str = (String) rVar.a();
                Object b8 = rVar.b();
                if (b8 != null) {
                    map = Q.e(O5.x.a(str, b8));
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
            return AbstractC3255y.d(this.f25291a, dVar.f25291a) && AbstractC3255y.d(this.f25292b, dVar.f25292b) && AbstractC3255y.d(this.f25293c, dVar.f25293c) && AbstractC3255y.d(this.f25294d, dVar.f25294d) && AbstractC3255y.d(this.f25295e, dVar.f25295e);
        }

        public int hashCode() {
            int hashCode = ((this.f25291a.hashCode() * 31) + this.f25292b.hashCode()) * 31;
            String str = this.f25293c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25294d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25295e;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Shipping(address=" + this.f25291a + ", name=" + this.f25292b + ", carrier=" + this.f25293c + ", phone=" + this.f25294d + ", trackingNumber=" + this.f25295e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f25291a.writeToParcel(out, i8);
            out.writeString(this.f25292b);
            out.writeString(this.f25293c);
            out.writeString(this.f25294d);
            out.writeString(this.f25295e);
        }

        public /* synthetic */ d(com.stripe.android.model.a aVar, String str, String str2, String str3, String str4, int i8, AbstractC3247p abstractC3247p) {
            this(aVar, str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ b(p pVar, String str, w wVar, String str2, String str3, String str4, Boolean bool, boolean z8, r rVar, String str5, m mVar, c cVar, d dVar, String str6, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : pVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : wVar, (i8 & 8) != 0 ? null : str2, str3, (i8 & 32) != 0 ? null : str4, (i8 & 64) != 0 ? null : bool, (i8 & 128) != 0 ? false : z8, (i8 & 256) != 0 ? null : rVar, (i8 & 512) != 0 ? null : str5, (i8 & 1024) != 0 ? null : mVar, (i8 & 2048) != 0 ? null : cVar, (i8 & 4096) != 0 ? null : dVar, (i8 & 8192) != 0 ? null : str6);
    }
}
