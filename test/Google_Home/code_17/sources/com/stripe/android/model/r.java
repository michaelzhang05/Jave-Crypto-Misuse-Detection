package com.stripe.android.model;

import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import e3.InterfaceC2784H;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class r implements InterfaceC2784H, Parcelable {

    /* renamed from: b */
    public static final int f25711b = 0;

    /* renamed from: a */
    private final o.p f25712a;

    /* loaded from: classes4.dex */
    public static final class a extends r {

        /* renamed from: c */
        private String f25715c;

        /* renamed from: d */
        public static final C0521a f25713d = new C0521a(null);

        /* renamed from: e */
        public static final int f25714e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.r$a$a */
        /* loaded from: classes4.dex */
        public static final class C0521a {
            private C0521a() {
            }

            public /* synthetic */ C0521a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String code) {
            super(o.p.f25564B, null);
            AbstractC3255y.i(code, "code");
            this.f25715c = code;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1378t.e(O5.x.a("code", this.f25715c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f25715c, ((a) obj).f25715c);
        }

        public int hashCode() {
            return this.f25715c.hashCode();
        }

        public String toString() {
            return "Blik(code=" + this.f25715c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25715c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r {

        /* renamed from: c */
        private String f25718c;

        /* renamed from: d */
        private String f25719d;

        /* renamed from: e */
        private b.c f25720e;

        /* renamed from: f */
        private Boolean f25721f;

        /* renamed from: g */
        private static final a f25716g = new a(null);

        /* renamed from: h */
        public static final int f25717h = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0522b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.r$b$b */
        /* loaded from: classes4.dex */
        public static final class C0522b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Boolean bool = null;
                b.c valueOf = parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString());
                if (parcel.readInt() != 0) {
                    bool = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new b(readString, readString2, valueOf, bool);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, Boolean bool, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ b g(b bVar, String str, String str2, b.c cVar, Boolean bool, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = bVar.f25718c;
            }
            if ((i8 & 2) != 0) {
                str2 = bVar.f25719d;
            }
            if ((i8 & 4) != 0) {
                cVar = bVar.f25720e;
            }
            if ((i8 & 8) != 0) {
                bool = bVar.f25721f;
            }
            return bVar.b(str, str2, cVar, bool);
        }

        @Override // com.stripe.android.model.r
        public List a() {
            String str;
            O5.r a8 = O5.x.a("cvc", this.f25718c);
            O5.r a9 = O5.x.a("network", this.f25719d);
            O5.r a10 = O5.x.a("moto", this.f25721f);
            b.c cVar = this.f25720e;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1378t.p(a8, a9, a10, O5.x.a("setup_future_usage", str));
        }

        public final b b(String str, String str2, b.c cVar, Boolean bool) {
            return new b(str, str2, cVar, bool);
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
            return AbstractC3255y.d(this.f25718c, bVar.f25718c) && AbstractC3255y.d(this.f25719d, bVar.f25719d) && this.f25720e == bVar.f25720e && AbstractC3255y.d(this.f25721f, bVar.f25721f);
        }

        public final b.c h() {
            return this.f25720e;
        }

        public int hashCode() {
            String str = this.f25718c;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25719d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b.c cVar = this.f25720e;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Boolean bool = this.f25721f;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Card(cvc=" + this.f25718c + ", network=" + this.f25719d + ", setupFutureUsage=" + this.f25720e + ", moto=" + this.f25721f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25718c);
            out.writeString(this.f25719d);
            b.c cVar = this.f25720e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
            Boolean bool = this.f25721f;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public b(String str, String str2, b.c cVar, Boolean bool) {
            super(o.p.f25587i, null);
            this.f25718c = str;
            this.f25719d = str2;
            this.f25720e = cVar;
            this.f25721f = bool;
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar);
        }

        public b(String str, String str2, b.c cVar) {
            this(str, str2, cVar, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends r {

        /* renamed from: c */
        private final String f25723c;

        /* renamed from: d */
        public static final a f25722d = new a(null);
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
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String confirmationNumber) {
            super(o.p.f25580R, null);
            AbstractC3255y.i(confirmationNumber, "confirmationNumber");
            this.f25723c = confirmationNumber;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1378t.e(O5.x.a("confirmation_number", this.f25723c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3255y.d(this.f25723c, ((c) obj).f25723c);
        }

        public int hashCode() {
            return this.f25723c.hashCode();
        }

        public String toString() {
            return "Konbini(confirmationNumber=" + this.f25723c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25723c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends r {

        /* renamed from: c */
        private b.c f25726c;

        /* renamed from: d */
        public static final a f25724d = new a(null);

        /* renamed from: e */
        public static final int f25725e = 8;
        public static final Parcelable.Creator<d> CREATOR = new b();

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
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(b.c cVar) {
            super(o.p.f25577O, null);
            this.f25726c = cVar;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            String str;
            b.c cVar = this.f25726c;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1378t.e(O5.x.a("setup_future_usage", str));
        }

        public final b.c b() {
            return this.f25726c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f25726c == ((d) obj).f25726c;
        }

        public int hashCode() {
            b.c cVar = this.f25726c;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "USBankAccount(setupFutureUsage=" + this.f25726c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            b.c cVar = this.f25726c;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends r {

        /* renamed from: c */
        private String f25729c;

        /* renamed from: d */
        public static final a f25727d = new a(null);

        /* renamed from: e */
        public static final int f25728e = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

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
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String appId) {
            super(o.p.f25565C, null);
            AbstractC3255y.i(appId, "appId");
            this.f25729c = appId;
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1378t.p(O5.x.a("client", "android"), O5.x.a(MBridgeConstans.APP_ID, this.f25729c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3255y.d(this.f25729c, ((e) obj).f25729c);
        }

        public int hashCode() {
            return this.f25729c.hashCode();
        }

        public String toString() {
            return "WeChatPay(appId=" + this.f25729c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25729c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends r {

        /* renamed from: c */
        public static final f f25730c = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                parcel.readInt();
                return f.f25730c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        private f() {
            super(o.p.f25565C, null);
        }

        @Override // com.stripe.android.model.r
        public List a() {
            return AbstractC1378t.e(O5.x.a("client", "mobile_web"));
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

    public /* synthetic */ r(o.p pVar, AbstractC3247p abstractC3247p) {
        this(pVar);
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        List<O5.r> a8 = a();
        Map h8 = Q.h();
        for (O5.r rVar : a8) {
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
        if (!h8.isEmpty()) {
            return Q.e(O5.x.a(this.f25712a.f25605a, h8));
        }
        return Q.h();
    }

    public abstract List a();

    private r(o.p pVar) {
        this.f25712a = pVar;
    }
}
