package com.stripe.android.model;

import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import b3.InterfaceC1863H;
import com.mbridge.msdk.MBridgeConstans;
import com.stripe.android.model.b;
import com.stripe.android.model.o;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class r implements InterfaceC1863H, Parcelable {

    /* renamed from: b */
    public static final int f24656b = 0;

    /* renamed from: a */
    private final o.p f24657a;

    /* loaded from: classes4.dex */
    public static final class a extends r {

        /* renamed from: c */
        private String f24660c;

        /* renamed from: d */
        public static final C0525a f24658d = new C0525a(null);

        /* renamed from: e */
        public static final int f24659e = 8;
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: com.stripe.android.model.r$a$a */
        /* loaded from: classes4.dex */
        public static final class C0525a {
            private C0525a() {
            }

            public /* synthetic */ C0525a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            super(o.p.f24509B, null);
            AbstractC3159y.i(code, "code");
            this.f24660c = code;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.e(L5.x.a("code", this.f24660c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f24660c, ((a) obj).f24660c);
        }

        public int hashCode() {
            return this.f24660c.hashCode();
        }

        public String toString() {
            return "Blik(code=" + this.f24660c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24660c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends r {

        /* renamed from: c */
        private String f24663c;

        /* renamed from: d */
        private String f24664d;

        /* renamed from: e */
        private b.c f24665e;

        /* renamed from: f */
        private Boolean f24666f;

        /* renamed from: g */
        private static final a f24661g = new a(null);

        /* renamed from: h */
        public static final int f24662h = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0526b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.r$b$b */
        /* loaded from: classes4.dex */
        public static final class C0526b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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

        public /* synthetic */ b(String str, String str2, b.c cVar, Boolean bool, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar, (i8 & 8) != 0 ? null : bool);
        }

        public static /* synthetic */ b e(b bVar, String str, String str2, b.c cVar, Boolean bool, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = bVar.f24663c;
            }
            if ((i8 & 2) != 0) {
                str2 = bVar.f24664d;
            }
            if ((i8 & 4) != 0) {
                cVar = bVar.f24665e;
            }
            if ((i8 & 8) != 0) {
                bool = bVar.f24666f;
            }
            return bVar.c(str, str2, cVar, bool);
        }

        @Override // com.stripe.android.model.r
        public List b() {
            String str;
            L5.r a8 = L5.x.a("cvc", this.f24663c);
            L5.r a9 = L5.x.a("network", this.f24664d);
            L5.r a10 = L5.x.a("moto", this.f24666f);
            b.c cVar = this.f24665e;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1246t.p(a8, a9, a10, L5.x.a("setup_future_usage", str));
        }

        public final b c(String str, String str2, b.c cVar, Boolean bool) {
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
            return AbstractC3159y.d(this.f24663c, bVar.f24663c) && AbstractC3159y.d(this.f24664d, bVar.f24664d) && this.f24665e == bVar.f24665e && AbstractC3159y.d(this.f24666f, bVar.f24666f);
        }

        public final b.c f() {
            return this.f24665e;
        }

        public int hashCode() {
            String str = this.f24663c;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24664d;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            b.c cVar = this.f24665e;
            int hashCode3 = (hashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Boolean bool = this.f24666f;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public String toString() {
            return "Card(cvc=" + this.f24663c + ", network=" + this.f24664d + ", setupFutureUsage=" + this.f24665e + ", moto=" + this.f24666f + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24663c);
            out.writeString(this.f24664d);
            b.c cVar = this.f24665e;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(cVar.name());
            }
            Boolean bool = this.f24666f;
            if (bool == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }

        public b(String str, String str2, b.c cVar, Boolean bool) {
            super(o.p.f24532i, null);
            this.f24663c = str;
            this.f24664d = str2;
            this.f24665e = cVar;
            this.f24666f = bool;
        }

        public /* synthetic */ b(String str, String str2, b.c cVar, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : cVar);
        }

        public b(String str, String str2, b.c cVar) {
            this(str, str2, cVar, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends r {

        /* renamed from: c */
        private final String f24668c;

        /* renamed from: d */
        public static final a f24667d = new a(null);
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
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            super(o.p.f24525R, null);
            AbstractC3159y.i(confirmationNumber, "confirmationNumber");
            this.f24668c = confirmationNumber;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.e(L5.x.a("confirmation_number", this.f24668c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC3159y.d(this.f24668c, ((c) obj).f24668c);
        }

        public int hashCode() {
            return this.f24668c.hashCode();
        }

        public String toString() {
            return "Konbini(confirmationNumber=" + this.f24668c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24668c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends r {

        /* renamed from: c */
        private b.c f24671c;

        /* renamed from: d */
        public static final a f24669d = new a(null);

        /* renamed from: e */
        public static final int f24670e = 8;
        public static final Parcelable.Creator<d> CREATOR = new b();

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
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readInt() == 0 ? null : b.c.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(b.c cVar) {
            super(o.p.f24522O, null);
            this.f24671c = cVar;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            String str;
            b.c cVar = this.f24671c;
            if (cVar != null) {
                str = cVar.b();
            } else {
                str = null;
            }
            return AbstractC1246t.e(L5.x.a("setup_future_usage", str));
        }

        public final b.c c() {
            return this.f24671c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f24671c == ((d) obj).f24671c;
        }

        public int hashCode() {
            b.c cVar = this.f24671c;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "USBankAccount(setupFutureUsage=" + this.f24671c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            b.c cVar = this.f24671c;
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
        private String f24674c;

        /* renamed from: d */
        public static final a f24672d = new a(null);

        /* renamed from: e */
        public static final int f24673e = 8;
        public static final Parcelable.Creator<e> CREATOR = new b();

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
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
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
            super(o.p.f24510C, null);
            AbstractC3159y.i(appId, "appId");
            this.f24674c = appId;
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.p(L5.x.a("client", "android"), L5.x.a(MBridgeConstans.APP_ID, this.f24674c));
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && AbstractC3159y.d(this.f24674c, ((e) obj).f24674c);
        }

        public int hashCode() {
            return this.f24674c.hashCode();
        }

        public String toString() {
            return "WeChatPay(appId=" + this.f24674c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24674c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends r {

        /* renamed from: c */
        public static final f f24675c = new f();
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                parcel.readInt();
                return f.f24675c;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        private f() {
            super(o.p.f24510C, null);
        }

        @Override // com.stripe.android.model.r
        public List b() {
            return AbstractC1246t.e(L5.x.a("client", "mobile_web"));
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

    public /* synthetic */ r(o.p pVar, AbstractC3151p abstractC3151p) {
        this(pVar);
    }

    public abstract List b();

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        List<L5.r> b8 = b();
        Map h8 = Q.h();
        for (L5.r rVar : b8) {
            String str = (String) rVar.a();
            Object b9 = rVar.b();
            if (b9 != null) {
                map = Q.e(L5.x.a(str, b9));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            h8 = Q.q(h8, map);
        }
        if (!h8.isEmpty()) {
            return Q.e(L5.x.a(this.f24657a.f24550a, h8));
        }
        return Q.h();
    }

    private r(o.p pVar) {
        this.f24657a = pVar;
    }
}
