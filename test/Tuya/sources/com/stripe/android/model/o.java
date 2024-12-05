package com.stripe.android.model;

import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import b3.C1858C;
import b3.EnumC1870e;
import b3.InterfaceC1863H;
import d3.AbstractC2554a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class o implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f24408a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f24409b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f24410c;

    /* renamed from: d, reason: collision with root package name */
    public final String f24411d;

    /* renamed from: e, reason: collision with root package name */
    public final p f24412e;

    /* renamed from: f, reason: collision with root package name */
    public final e f24413f;

    /* renamed from: g, reason: collision with root package name */
    public final String f24414g;

    /* renamed from: h, reason: collision with root package name */
    public final g f24415h;

    /* renamed from: i, reason: collision with root package name */
    public final h f24416i;

    /* renamed from: j, reason: collision with root package name */
    public final k f24417j;

    /* renamed from: k, reason: collision with root package name */
    public final l f24418k;

    /* renamed from: l, reason: collision with root package name */
    public final n f24419l;

    /* renamed from: m, reason: collision with root package name */
    public final c f24420m;

    /* renamed from: n, reason: collision with root package name */
    public final d f24421n;

    /* renamed from: o, reason: collision with root package name */
    public final C0520o f24422o;

    /* renamed from: p, reason: collision with root package name */
    public final s f24423p;

    /* renamed from: q, reason: collision with root package name */
    public final m f24424q;

    /* renamed from: r, reason: collision with root package name */
    public final r f24425r;

    /* renamed from: s, reason: collision with root package name */
    public final b f24426s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f24406t = new i(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f24407u = 8;
    public static final Parcelable.Creator<o> CREATOR = new j();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements v2.f {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final b f24434b = new b("UNSPECIFIED", 0, "unspecified");

        /* renamed from: c, reason: collision with root package name */
        public static final b f24435c = new b("LIMITED", 1, "limited");

        /* renamed from: d, reason: collision with root package name */
        public static final b f24436d = new b("ALWAYS", 2, "always");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f24437e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24438f;

        /* renamed from: a, reason: collision with root package name */
        private final String f24439a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] b8 = b();
            f24437e = b8;
            f24438f = R5.b.a(b8);
            CREATOR = new a();
        }

        private b(String str, int i8, String str2) {
            this.f24439a = str2;
        }

        private static final /* synthetic */ b[] b() {
            return new b[]{f24434b, f24435c, f24436d};
        }

        public static R5.a c() {
            return f24438f;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f24437e.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f24439a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24440a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24441b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24442c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String str, String str2, String str3) {
            super(null);
            this.f24440a = str;
            this.f24441b = str2;
            this.f24442c = str3;
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
            return AbstractC3159y.d(this.f24440a, cVar.f24440a) && AbstractC3159y.d(this.f24441b, cVar.f24441b) && AbstractC3159y.d(this.f24442c, cVar.f24442c);
        }

        public int hashCode() {
            String str = this.f24440a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24441b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24442c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f24440a + ", fingerprint=" + this.f24441b + ", last4=" + this.f24442c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24440a);
            out.writeString(this.f24441b);
            out.writeString(this.f24442c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends q {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24443a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24444b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24445c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        public d(String str, String str2, String str3) {
            super(null);
            this.f24443a = str;
            this.f24444b = str2;
            this.f24445c = str3;
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
            return AbstractC3159y.d(this.f24443a, dVar.f24443a) && AbstractC3159y.d(this.f24444b, dVar.f24444b) && AbstractC3159y.d(this.f24445c, dVar.f24445c);
        }

        public int hashCode() {
            String str = this.f24443a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24444b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24445c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.f24443a + ", last4=" + this.f24444b + ", sortCode=" + this.f24445c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24443a);
            out.writeString(this.f24444b);
            out.writeString(this.f24445c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private String f24456a;

        /* renamed from: b, reason: collision with root package name */
        private Long f24457b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f24458c;

        /* renamed from: d, reason: collision with root package name */
        private p f24459d;

        /* renamed from: e, reason: collision with root package name */
        private String f24460e;

        /* renamed from: f, reason: collision with root package name */
        private e f24461f;

        /* renamed from: g, reason: collision with root package name */
        private b f24462g;

        /* renamed from: h, reason: collision with root package name */
        private String f24463h;

        /* renamed from: i, reason: collision with root package name */
        private g f24464i;

        /* renamed from: j, reason: collision with root package name */
        private h f24465j;

        /* renamed from: k, reason: collision with root package name */
        private l f24466k;

        /* renamed from: l, reason: collision with root package name */
        private k f24467l;

        /* renamed from: m, reason: collision with root package name */
        private n f24468m;

        /* renamed from: n, reason: collision with root package name */
        private c f24469n;

        /* renamed from: o, reason: collision with root package name */
        private d f24470o;

        /* renamed from: p, reason: collision with root package name */
        private C0520o f24471p;

        /* renamed from: q, reason: collision with root package name */
        private m f24472q;

        /* renamed from: r, reason: collision with root package name */
        private r f24473r;

        /* renamed from: s, reason: collision with root package name */
        private s f24474s;

        public final o a() {
            String str = this.f24456a;
            Long l8 = this.f24457b;
            boolean z8 = this.f24458c;
            p pVar = this.f24459d;
            return new o(str, l8, z8, this.f24460e, pVar, this.f24461f, this.f24463h, this.f24464i, this.f24465j, this.f24467l, this.f24466k, this.f24468m, this.f24469n, this.f24470o, this.f24471p, null, this.f24472q, this.f24473r, this.f24462g, 32768, null);
        }

        public final f b(b bVar) {
            this.f24462g = bVar;
            return this;
        }

        public final f c(c cVar) {
            this.f24469n = cVar;
            return this;
        }

        public final f d(d dVar) {
            this.f24470o = dVar;
            return this;
        }

        public final f e(e eVar) {
            this.f24461f = eVar;
            return this;
        }

        public final f f(g gVar) {
            this.f24464i = gVar;
            return this;
        }

        public final f g(h hVar) {
            this.f24465j = hVar;
            return this;
        }

        public final f h(String str) {
            this.f24460e = str;
            return this;
        }

        public final f i(Long l8) {
            this.f24457b = l8;
            return this;
        }

        public final f j(String str) {
            this.f24463h = str;
            return this;
        }

        public final f k(k kVar) {
            this.f24467l = kVar;
            return this;
        }

        public final f l(String str) {
            this.f24456a = str;
            return this;
        }

        public final f m(l lVar) {
            this.f24466k = lVar;
            return this;
        }

        public final f n(boolean z8) {
            this.f24458c = z8;
            return this;
        }

        public final f o(m mVar) {
            this.f24472q = mVar;
            return this;
        }

        public final f p(n nVar) {
            this.f24468m = nVar;
            return this;
        }

        public final f q(C0520o c0520o) {
            this.f24471p = c0520o;
            return this;
        }

        public final f r(p pVar) {
            this.f24459d = pVar;
            return this;
        }

        public final f s(r rVar) {
            this.f24473r = rVar;
            return this;
        }

        public final f t(s sVar) {
            this.f24474s = sVar;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends q {
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final a f24494b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ h f24495c;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f24496a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final h a() {
                return h.f24495c;
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
                return new h(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        static {
            AbstractC3151p abstractC3151p = null;
            f24494b = new a(abstractC3151p);
            f24495c = new h(false, 1, abstractC3151p);
        }

        public /* synthetic */ h(boolean z8, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? true : z8);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f24496a == ((h) obj).f24496a;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f24496a);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.f24496a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeInt(this.f24496a ? 1 : 0);
        }

        public h(boolean z8) {
            super(null);
            this.f24496a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i {
        private i() {
        }

        public /* synthetic */ i(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new o(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C0520o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o[] newArray(int i8) {
            return new o[i8];
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends q {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24497a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24498b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final k[] newArray(int i8) {
                return new k[i8];
            }
        }

        public k(String str, String str2) {
            super(null);
            this.f24497a = str;
            this.f24498b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return AbstractC3159y.d(this.f24497a, kVar.f24497a) && AbstractC3159y.d(this.f24498b, kVar.f24498b);
        }

        public int hashCode() {
            String str = this.f24497a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24498b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.f24497a + ", accountHolderType=" + this.f24498b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24497a);
            out.writeString(this.f24498b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends q {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24499a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24500b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new l(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final l[] newArray(int i8) {
                return new l[i8];
            }
        }

        public l(String str, String str2) {
            super(null);
            this.f24499a = str;
            this.f24500b = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return AbstractC3159y.d(this.f24499a, lVar.f24499a) && AbstractC3159y.d(this.f24500b, lVar.f24500b);
        }

        public int hashCode() {
            String str = this.f24499a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24500b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.f24499a + ", bankIdentifierCode=" + this.f24500b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24499a);
            out.writeString(this.f24500b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends q {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24501a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new m(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final m[] newArray(int i8) {
                return new m[i8];
            }
        }

        public m(String str) {
            super(null);
            this.f24501a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && AbstractC3159y.d(this.f24501a, ((m) obj).f24501a);
        }

        public int hashCode() {
            String str = this.f24501a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f24501a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24501a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends q {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24502a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24503b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24504c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24505d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24506e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new n(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final n[] newArray(int i8) {
                return new n[i8];
            }
        }

        public n(String str, String str2, String str3, String str4, String str5) {
            super(null);
            this.f24502a = str;
            this.f24503b = str2;
            this.f24504c = str3;
            this.f24505d = str4;
            this.f24506e = str5;
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
            return AbstractC3159y.d(this.f24502a, nVar.f24502a) && AbstractC3159y.d(this.f24503b, nVar.f24503b) && AbstractC3159y.d(this.f24504c, nVar.f24504c) && AbstractC3159y.d(this.f24505d, nVar.f24505d) && AbstractC3159y.d(this.f24506e, nVar.f24506e);
        }

        public int hashCode() {
            String str = this.f24502a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f24503b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24504c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24505d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f24506e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f24502a + ", branchCode=" + this.f24503b + ", country=" + this.f24504c + ", fingerprint=" + this.f24505d + ", last4=" + this.f24506e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24502a);
            out.writeString(this.f24503b);
            out.writeString(this.f24504c);
            out.writeString(this.f24505d);
            out.writeString(this.f24506e);
        }
    }

    /* renamed from: com.stripe.android.model.o$o, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0520o extends q {
        public static final Parcelable.Creator<C0520o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24507a;

        /* renamed from: com.stripe.android.model.o$o$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0520o createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new C0520o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0520o[] newArray(int i8) {
                return new C0520o[i8];
            }
        }

        public C0520o(String str) {
            super(null);
            this.f24507a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0520o) && AbstractC3159y.d(this.f24507a, ((C0520o) obj).f24507a);
        }

        public int hashCode() {
            String str = this.f24507a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f24507a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24507a);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class q implements v2.f {
        private q() {
        }

        public /* synthetic */ q(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends q {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final b f24556a;

        /* renamed from: b, reason: collision with root package name */
        public final c f24557b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24558c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24559d;

        /* renamed from: e, reason: collision with root package name */
        public final String f24560e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24561f;

        /* renamed from: g, reason: collision with root package name */
        public final d f24562g;

        /* renamed from: h, reason: collision with root package name */
        public final String f24563h;

        /* renamed from: i, reason: collision with root package name */
        public final String f24564i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new r(b.CREATOR.createFromParcel(parcel), c.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final r[] newArray(int i8) {
                return new r[i8];
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class b implements v2.f {
            public static final Parcelable.Creator<b> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final b f24565b = new b("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final b f24566c = new b("INDIVIDUAL", 1, "individual");

            /* renamed from: d, reason: collision with root package name */
            public static final b f24567d = new b("COMPANY", 2, "company");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ b[] f24568e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24569f;

            /* renamed from: a, reason: collision with root package name */
            private final String f24570a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return b.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            static {
                b[] b8 = b();
                f24568e = b8;
                f24569f = R5.b.a(b8);
                CREATOR = new a();
            }

            private b(String str, int i8, String str2) {
                this.f24570a = str2;
            }

            private static final /* synthetic */ b[] b() {
                return new b[]{f24565b, f24566c, f24567d};
            }

            public static R5.a c() {
                return f24569f;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f24568e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f24570a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c implements v2.f {
            public static final Parcelable.Creator<c> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final c f24571b = new c("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final c f24572c = new c("CHECKING", 1, "checking");

            /* renamed from: d, reason: collision with root package name */
            public static final c f24573d = new c("SAVINGS", 2, "savings");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f24574e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ R5.a f24575f;

            /* renamed from: a, reason: collision with root package name */
            private final String f24576a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return c.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            static {
                c[] b8 = b();
                f24574e = b8;
                f24575f = R5.b.a(b8);
                CREATOR = new a();
            }

            private c(String str, int i8, String str2) {
                this.f24576a = str2;
            }

            private static final /* synthetic */ c[] b() {
                return new c[]{f24571b, f24572c, f24573d};
            }

            public static R5.a c() {
                return f24575f;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f24574e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String e() {
                return this.f24576a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements v2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f24577a;

            /* renamed from: b, reason: collision with root package name */
            private final List f24578b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str, List supported) {
                AbstractC3159y.i(supported, "supported");
                this.f24577a = str;
                this.f24578b = supported;
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
                return AbstractC3159y.d(this.f24577a, dVar.f24577a) && AbstractC3159y.d(this.f24578b, dVar.f24578b);
            }

            public int hashCode() {
                String str = this.f24577a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f24578b.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.f24577a + ", supported=" + this.f24578b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24577a);
                out.writeStringList(this.f24578b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(b accountHolderType, c accountType, String str, String str2, String str3, String str4, d dVar, String str5) {
            super(null);
            AbstractC3159y.i(accountHolderType, "accountHolderType");
            AbstractC3159y.i(accountType, "accountType");
            this.f24556a = accountHolderType;
            this.f24557b = accountType;
            this.f24558c = str;
            this.f24559d = str2;
            this.f24560e = str3;
            this.f24561f = str4;
            this.f24562g = dVar;
            this.f24563h = str5;
            this.f24564i = str4;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            return this.f24556a == rVar.f24556a && this.f24557b == rVar.f24557b && AbstractC3159y.d(this.f24558c, rVar.f24558c) && AbstractC3159y.d(this.f24559d, rVar.f24559d) && AbstractC3159y.d(this.f24560e, rVar.f24560e) && AbstractC3159y.d(this.f24561f, rVar.f24561f) && AbstractC3159y.d(this.f24562g, rVar.f24562g) && AbstractC3159y.d(this.f24563h, rVar.f24563h);
        }

        public int hashCode() {
            int hashCode = ((this.f24556a.hashCode() * 31) + this.f24557b.hashCode()) * 31;
            String str = this.f24558c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24559d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24560e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24561f;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f24562g;
            int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str5 = this.f24563h;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.f24556a + ", accountType=" + this.f24557b + ", bankName=" + this.f24558c + ", fingerprint=" + this.f24559d + ", last4=" + this.f24560e + ", financialConnectionsAccount=" + this.f24561f + ", networks=" + this.f24562g + ", routingNumber=" + this.f24563h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f24556a.writeToParcel(out, i8);
            this.f24557b.writeToParcel(out, i8);
            out.writeString(this.f24558c);
            out.writeString(this.f24559d);
            out.writeString(this.f24560e);
            out.writeString(this.f24561f);
            d dVar = this.f24562g;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24563h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends q {
        public static final Parcelable.Creator<s> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f24579a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new s(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final s[] newArray(int i8) {
                return new s[i8];
            }
        }

        public s(String str) {
            super(null);
            this.f24579a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && AbstractC3159y.d(this.f24579a, ((s) obj).f24579a);
        }

        public int hashCode() {
            String str = this.f24579a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f24579a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24579a);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class t {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f24580a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f24532i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f24533j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f24534k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f24535l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f24536m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f24537n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.f24538o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.f24539p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.f24522O.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f24580a = iArr;
        }
    }

    public o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0520o c0520o, s sVar, m mVar, r rVar, b bVar) {
        this.f24408a = str;
        this.f24409b = l8;
        this.f24410c = z8;
        this.f24411d = str2;
        this.f24412e = pVar;
        this.f24413f = eVar;
        this.f24414g = str3;
        this.f24415h = gVar;
        this.f24416i = hVar;
        this.f24417j = kVar;
        this.f24418k = lVar;
        this.f24419l = nVar;
        this.f24420m = cVar;
        this.f24421n = dVar;
        this.f24422o = c0520o;
        this.f24423p = sVar;
        this.f24424q = mVar;
        this.f24425r = rVar;
        this.f24426s = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r3 = this;
            com.stripe.android.model.o$p r0 = r3.f24412e
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            int[] r1 = com.stripe.android.model.o.t.f24580a
            int r0 = r0.ordinal()
            r0 = r1[r0]
        Le:
            r1 = 0
            r2 = 1
            switch(r0) {
                case 1: goto L3d;
                case 2: goto L38;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L29;
                case 6: goto L24;
                case 7: goto L1f;
                case 8: goto L1a;
                case 9: goto L15;
                default: goto L13;
            }
        L13:
            r1 = 1
            goto L42
        L15:
            com.stripe.android.model.o$r r0 = r3.f24425r
            if (r0 == 0) goto L42
            goto L13
        L1a:
            com.stripe.android.model.o$o r0 = r3.f24422o
            if (r0 == 0) goto L42
            goto L13
        L1f:
            com.stripe.android.model.o$d r0 = r3.f24421n
            if (r0 == 0) goto L42
            goto L13
        L24:
            com.stripe.android.model.o$c r0 = r3.f24420m
            if (r0 == 0) goto L42
            goto L13
        L29:
            com.stripe.android.model.o$n r0 = r3.f24419l
            if (r0 == 0) goto L42
            goto L13
        L2e:
            com.stripe.android.model.o$l r0 = r3.f24418k
            if (r0 == 0) goto L42
            goto L13
        L33:
            com.stripe.android.model.o$k r0 = r3.f24417j
            if (r0 == 0) goto L42
            goto L13
        L38:
            com.stripe.android.model.o$h r0 = r3.f24416i
            if (r0 == 0) goto L42
            goto L13
        L3d:
            com.stripe.android.model.o$g r0 = r3.f24415h
            if (r0 == 0) goto L42
            goto L13
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.o.b():boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return AbstractC3159y.d(this.f24408a, oVar.f24408a) && AbstractC3159y.d(this.f24409b, oVar.f24409b) && this.f24410c == oVar.f24410c && AbstractC3159y.d(this.f24411d, oVar.f24411d) && this.f24412e == oVar.f24412e && AbstractC3159y.d(this.f24413f, oVar.f24413f) && AbstractC3159y.d(this.f24414g, oVar.f24414g) && AbstractC3159y.d(this.f24415h, oVar.f24415h) && AbstractC3159y.d(this.f24416i, oVar.f24416i) && AbstractC3159y.d(this.f24417j, oVar.f24417j) && AbstractC3159y.d(this.f24418k, oVar.f24418k) && AbstractC3159y.d(this.f24419l, oVar.f24419l) && AbstractC3159y.d(this.f24420m, oVar.f24420m) && AbstractC3159y.d(this.f24421n, oVar.f24421n) && AbstractC3159y.d(this.f24422o, oVar.f24422o) && AbstractC3159y.d(this.f24423p, oVar.f24423p) && AbstractC3159y.d(this.f24424q, oVar.f24424q) && AbstractC3159y.d(this.f24425r, oVar.f24425r) && this.f24426s == oVar.f24426s;
    }

    public int hashCode() {
        String str = this.f24408a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f24409b;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f24410c)) * 31;
        String str2 = this.f24411d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.f24412e;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        e eVar = this.f24413f;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.f24414g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.f24415h;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f24416i;
        int hashCode8 = (hashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        k kVar = this.f24417j;
        int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.f24418k;
        int hashCode10 = (hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f24419l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        c cVar = this.f24420m;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f24421n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C0520o c0520o = this.f24422o;
        int hashCode14 = (hashCode13 + (c0520o == null ? 0 : c0520o.hashCode())) * 31;
        s sVar = this.f24423p;
        int hashCode15 = (hashCode14 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        m mVar = this.f24424q;
        int hashCode16 = (hashCode15 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        r rVar = this.f24425r;
        int hashCode17 = (hashCode16 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        b bVar = this.f24426s;
        return hashCode17 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.f24408a + ", created=" + this.f24409b + ", liveMode=" + this.f24410c + ", code=" + this.f24411d + ", type=" + this.f24412e + ", billingDetails=" + this.f24413f + ", customerId=" + this.f24414g + ", card=" + this.f24415h + ", cardPresent=" + this.f24416i + ", fpx=" + this.f24417j + ", ideal=" + this.f24418k + ", sepaDebit=" + this.f24419l + ", auBecsDebit=" + this.f24420m + ", bacsDebit=" + this.f24421n + ", sofort=" + this.f24422o + ", upi=" + this.f24423p + ", netbanking=" + this.f24424q + ", usBankAccount=" + this.f24425r + ", allowRedisplay=" + this.f24426s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f24408a);
        Long l8 = this.f24409b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeInt(this.f24410c ? 1 : 0);
        out.writeString(this.f24411d);
        p pVar = this.f24412e;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        e eVar = this.f24413f;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeString(this.f24414g);
        g gVar = this.f24415h;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f24416i;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        k kVar = this.f24417j;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        l lVar = this.f24418k;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        n nVar = this.f24419l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        c cVar = this.f24420m;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        d dVar = this.f24421n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        C0520o c0520o = this.f24422o;
        if (c0520o == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0520o.writeToParcel(out, i8);
        }
        s sVar = this.f24423p;
        if (sVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sVar.writeToParcel(out, i8);
        }
        m mVar = this.f24424q;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        r rVar = this.f24425r;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        b bVar = this.f24426s;
        if (bVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bVar.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface a extends Parcelable {

        /* renamed from: com.stripe.android.model.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0515a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f24428b = false;

            /* renamed from: a, reason: collision with root package name */
            public static final C0515a f24427a = new C0515a();

            /* renamed from: c, reason: collision with root package name */
            private static final int f24429c = 5;
            public static final Parcelable.Creator<C0515a> CREATOR = new C0516a();

            /* renamed from: com.stripe.android.model.o$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0516a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0515a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    parcel.readInt();
                    return C0515a.f24427a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0515a[] newArray(int i8) {
                    return new C0515a[i8];
                }
            }

            private C0515a() {
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return f24429c;
            }

            @Override // com.stripe.android.model.o.a
            public boolean U() {
                return f24428b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0515a);
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(1);
            }
        }

        int M();

        boolean U();

        /* loaded from: classes4.dex */
        public static final class b implements a {
            public static final Parcelable.Creator<b> CREATOR = new C0517a();

            /* renamed from: a, reason: collision with root package name */
            private final int f24430a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24431b;

            /* renamed from: com.stripe.android.model.o$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0517a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(int i8) {
                this.f24430a = i8;
                this.f24431b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return this.f24430a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean U() {
                return this.f24431b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f24430a == ((b) obj).f24430a;
            }

            public int hashCode() {
                return this.f24430a;
            }

            public String toString() {
                return "Poll(retryCount=" + this.f24430a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24430a);
            }

            public /* synthetic */ b(int i8, int i9, AbstractC3151p abstractC3151p) {
                this((i9 & 1) != 0 ? 5 : i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements a {
            public static final Parcelable.Creator<c> CREATOR = new C0518a();

            /* renamed from: a, reason: collision with root package name */
            private final int f24432a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24433b;

            /* renamed from: com.stripe.android.model.o$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0518a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new c(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(int i8) {
                this.f24432a = i8;
                this.f24433b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int M() {
                return this.f24432a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean U() {
                return this.f24433b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f24432a == ((c) obj).f24432a;
            }

            public int hashCode() {
                return this.f24432a;
            }

            public String toString() {
                return "Refresh(retryCount=" + this.f24432a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24432a);
            }

            public /* synthetic */ c(int i8, int i9, AbstractC3151p abstractC3151p) {
                this((i9 & 1) != 0 ? 1 : i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends q {
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final EnumC1870e f24475a;

        /* renamed from: b, reason: collision with root package name */
        public final a f24476b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24477c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f24478d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f24479e;

        /* renamed from: f, reason: collision with root package name */
        public final String f24480f;

        /* renamed from: g, reason: collision with root package name */
        public final String f24481g;

        /* renamed from: h, reason: collision with root package name */
        public final String f24482h;

        /* renamed from: i, reason: collision with root package name */
        public final d f24483i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC2554a f24484j;

        /* renamed from: k, reason: collision with root package name */
        public final c f24485k;

        /* renamed from: l, reason: collision with root package name */
        public final String f24486l;

        /* loaded from: classes4.dex */
        public static final class a implements v2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0519a();

            /* renamed from: a, reason: collision with root package name */
            public final String f24487a;

            /* renamed from: b, reason: collision with root package name */
            public final String f24488b;

            /* renamed from: c, reason: collision with root package name */
            public final String f24489c;

            /* renamed from: com.stripe.android.model.o$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0519a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String str, String str2, String str3) {
                this.f24487a = str;
                this.f24488b = str2;
                this.f24489c = str3;
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
                return AbstractC3159y.d(this.f24487a, aVar.f24487a) && AbstractC3159y.d(this.f24488b, aVar.f24488b) && AbstractC3159y.d(this.f24489c, aVar.f24489c);
            }

            public int hashCode() {
                String str = this.f24487a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f24488b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f24489c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.f24487a + ", addressPostalCodeCheck=" + this.f24488b + ", cvcCheck=" + this.f24489c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeString(this.f24487a);
                out.writeString(this.f24488b);
                out.writeString(this.f24489c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(EnumC1870e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), (AbstractC2554a) parcel.readParcelable(g.class.getClassLoader()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements v2.f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Set f24490a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f24491b;

            /* renamed from: c, reason: collision with root package name */
            private final String f24492c;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    for (int i8 = 0; i8 != readInt; i8++) {
                        linkedHashSet.add(parcel.readString());
                    }
                    return new c(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(Set available, boolean z8, String str) {
                AbstractC3159y.i(available, "available");
                this.f24490a = available;
                this.f24491b = z8;
                this.f24492c = str;
            }

            public final Set b() {
                return this.f24490a;
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
                return AbstractC3159y.d(this.f24490a, cVar.f24490a) && this.f24491b == cVar.f24491b && AbstractC3159y.d(this.f24492c, cVar.f24492c);
            }

            public int hashCode() {
                int hashCode = ((this.f24490a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f24491b)) * 31;
                String str = this.f24492c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.f24490a + ", selectionMandatory=" + this.f24491b + ", preferred=" + this.f24492c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                Set set = this.f24490a;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f24491b ? 1 : 0);
                out.writeString(this.f24492c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements v2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public final boolean f24493a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new d(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(boolean z8) {
                this.f24493a = z8;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f24493a == ((d) obj).f24493a;
            }

            public int hashCode() {
                return androidx.compose.foundation.a.a(this.f24493a);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.f24493a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeInt(this.f24493a ? 1 : 0);
            }
        }

        public /* synthetic */ g(EnumC1870e enumC1870e, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2554a abstractC2554a, c cVar, String str5, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? EnumC1870e.f14446w : enumC1870e, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? null : num2, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : str4, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : abstractC2554a, (i8 & 1024) != 0 ? null : cVar, (i8 & 2048) == 0 ? str5 : null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f24475a == gVar.f24475a && AbstractC3159y.d(this.f24476b, gVar.f24476b) && AbstractC3159y.d(this.f24477c, gVar.f24477c) && AbstractC3159y.d(this.f24478d, gVar.f24478d) && AbstractC3159y.d(this.f24479e, gVar.f24479e) && AbstractC3159y.d(this.f24480f, gVar.f24480f) && AbstractC3159y.d(this.f24481g, gVar.f24481g) && AbstractC3159y.d(this.f24482h, gVar.f24482h) && AbstractC3159y.d(this.f24483i, gVar.f24483i) && AbstractC3159y.d(this.f24484j, gVar.f24484j) && AbstractC3159y.d(this.f24485k, gVar.f24485k) && AbstractC3159y.d(this.f24486l, gVar.f24486l);
        }

        public int hashCode() {
            int hashCode = this.f24475a.hashCode() * 31;
            a aVar = this.f24476b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f24477c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f24478d;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f24479e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f24480f;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24481g;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f24482h;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f24483i;
            int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            AbstractC2554a abstractC2554a = this.f24484j;
            int hashCode10 = (hashCode9 + (abstractC2554a == null ? 0 : abstractC2554a.hashCode())) * 31;
            c cVar = this.f24485k;
            int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.f24486l;
            return hashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.f24475a + ", checks=" + this.f24476b + ", country=" + this.f24477c + ", expiryMonth=" + this.f24478d + ", expiryYear=" + this.f24479e + ", fingerprint=" + this.f24480f + ", funding=" + this.f24481g + ", last4=" + this.f24482h + ", threeDSecureUsage=" + this.f24483i + ", wallet=" + this.f24484j + ", networks=" + this.f24485k + ", displayBrand=" + this.f24486l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f24475a.name());
            a aVar = this.f24476b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24477c);
            Integer num = this.f24478d;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f24479e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f24480f);
            out.writeString(this.f24481g);
            out.writeString(this.f24482h);
            d dVar = this.f24483i;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f24484j, i8);
            c cVar = this.f24485k;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24486l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC1870e brand, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2554a abstractC2554a, c cVar, String str5) {
            super(null);
            AbstractC3159y.i(brand, "brand");
            this.f24475a = brand;
            this.f24476b = aVar;
            this.f24477c = str;
            this.f24478d = num;
            this.f24479e = num2;
            this.f24480f = str2;
            this.f24481g = str3;
            this.f24482h = str4;
            this.f24483i = dVar;
            this.f24484j = abstractC2554a;
            this.f24485k = cVar;
            this.f24486l = str5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements v2.f, InterfaceC1863H {

        /* renamed from: f, reason: collision with root package name */
        public static final int f24447f = 0;

        /* renamed from: a, reason: collision with root package name */
        public final com.stripe.android.model.a f24448a;

        /* renamed from: b, reason: collision with root package name */
        public final String f24449b;

        /* renamed from: c, reason: collision with root package name */
        public final String f24450c;

        /* renamed from: d, reason: collision with root package name */
        public final String f24451d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f24446e = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private com.stripe.android.model.a f24452a;

            /* renamed from: b, reason: collision with root package name */
            private String f24453b;

            /* renamed from: c, reason: collision with root package name */
            private String f24454c;

            /* renamed from: d, reason: collision with root package name */
            private String f24455d;

            public final e a() {
                return new e(this.f24452a, this.f24453b, this.f24454c, this.f24455d);
            }

            public final a b(com.stripe.android.model.a aVar) {
                this.f24452a = aVar;
                return this;
            }

            public final a c(String str) {
                this.f24453b = str;
                return this;
            }

            public final a d(String str) {
                this.f24454c = str;
                return this;
            }

            public final a e(String str) {
                this.f24455d = str;
                return this;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final e a(C1858C shippingInformation) {
                AbstractC3159y.i(shippingInformation, "shippingInformation");
                return new e(shippingInformation.b(), null, shippingInformation.c(), shippingInformation.e(), 2, null);
            }

            public /* synthetic */ b(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f24448a = aVar;
            this.f24449b = str;
            this.f24450c = str2;
            this.f24451d = str3;
        }

        public final boolean b() {
            com.stripe.android.model.a aVar = this.f24448a;
            if ((aVar == null || !aVar.k()) && this.f24449b == null && this.f24450c == null && this.f24451d == null) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3159y.d(this.f24448a, eVar.f24448a) && AbstractC3159y.d(this.f24449b, eVar.f24449b) && AbstractC3159y.d(this.f24450c, eVar.f24450c) && AbstractC3159y.d(this.f24451d, eVar.f24451d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f24448a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f24449b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f24450c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f24451d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.f24448a + ", email=" + this.f24449b + ", name=" + this.f24450c + ", phone=" + this.f24451d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            com.stripe.android.model.a aVar = this.f24448a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f24449b);
            out.writeString(this.f24450c);
            out.writeString(this.f24451d);
        }

        @Override // b3.InterfaceC1863H
        public Map y() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f24448a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(L5.x.a("address", aVar.y()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f24449b;
            if (str != null) {
                map2 = Q.e(L5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f24450c;
            if (str2 != null) {
                map3 = Q.e(L5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f24451d;
            if (str3 != null) {
                map4 = Q.e(L5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }

        public /* synthetic */ e(com.stripe.android.model.a aVar, String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: A, reason: collision with root package name */
        public static final p f24508A;

        /* renamed from: B, reason: collision with root package name */
        public static final p f24509B;
        public static final Parcelable.Creator<p> CREATOR;

        /* renamed from: D, reason: collision with root package name */
        public static final p f24511D;

        /* renamed from: E, reason: collision with root package name */
        public static final p f24512E;

        /* renamed from: F, reason: collision with root package name */
        public static final p f24513F;

        /* renamed from: G, reason: collision with root package name */
        public static final p f24514G;

        /* renamed from: H, reason: collision with root package name */
        public static final p f24515H;

        /* renamed from: I, reason: collision with root package name */
        public static final p f24516I;

        /* renamed from: J, reason: collision with root package name */
        public static final p f24517J;

        /* renamed from: K, reason: collision with root package name */
        public static final p f24518K;

        /* renamed from: L, reason: collision with root package name */
        public static final p f24519L;

        /* renamed from: M, reason: collision with root package name */
        public static final p f24520M;

        /* renamed from: N, reason: collision with root package name */
        public static final p f24521N;

        /* renamed from: O, reason: collision with root package name */
        public static final p f24522O;

        /* renamed from: P, reason: collision with root package name */
        public static final p f24523P;

        /* renamed from: R, reason: collision with root package name */
        public static final p f24525R;

        /* renamed from: S, reason: collision with root package name */
        public static final p f24526S;

        /* renamed from: T, reason: collision with root package name */
        public static final p f24527T;

        /* renamed from: U, reason: collision with root package name */
        private static final /* synthetic */ p[] f24528U;

        /* renamed from: V, reason: collision with root package name */
        private static final /* synthetic */ R5.a f24529V;

        /* renamed from: g, reason: collision with root package name */
        public static final a f24530g;

        /* renamed from: h, reason: collision with root package name */
        public static final p f24531h;

        /* renamed from: i, reason: collision with root package name */
        public static final p f24532i;

        /* renamed from: j, reason: collision with root package name */
        public static final p f24533j;

        /* renamed from: k, reason: collision with root package name */
        public static final p f24534k;

        /* renamed from: l, reason: collision with root package name */
        public static final p f24535l;

        /* renamed from: m, reason: collision with root package name */
        public static final p f24536m;

        /* renamed from: n, reason: collision with root package name */
        public static final p f24537n;

        /* renamed from: o, reason: collision with root package name */
        public static final p f24538o;

        /* renamed from: p, reason: collision with root package name */
        public static final p f24539p;

        /* renamed from: q, reason: collision with root package name */
        public static final p f24540q;

        /* renamed from: s, reason: collision with root package name */
        public static final p f24542s;

        /* renamed from: t, reason: collision with root package name */
        public static final p f24543t;

        /* renamed from: u, reason: collision with root package name */
        public static final p f24544u;

        /* renamed from: v, reason: collision with root package name */
        public static final p f24545v;

        /* renamed from: w, reason: collision with root package name */
        public static final p f24546w;

        /* renamed from: x, reason: collision with root package name */
        public static final p f24547x;

        /* renamed from: y, reason: collision with root package name */
        public static final p f24548y;

        /* renamed from: z, reason: collision with root package name */
        public static final p f24549z;

        /* renamed from: a, reason: collision with root package name */
        public final String f24550a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f24551b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f24552c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f24553d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f24554e;

        /* renamed from: f, reason: collision with root package name */
        private final a f24555f;

        /* renamed from: r, reason: collision with root package name */
        public static final p f24541r = new p("P24", 10, "p24", false, false, false, false, null, 32, null);

        /* renamed from: C, reason: collision with root package name */
        public static final p f24510C = new p("WeChatPay", 21, "wechat_pay", false, false, false, false, new a.c(5));

        /* renamed from: Q, reason: collision with root package name */
        public static final p f24524Q = new p("Boleto", 35, "boleto", false, true, false, true, null, 32, 0 == true ? 1 : 0);

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final /* synthetic */ p a(String str) {
                Object obj;
                Iterator<E> it = p.e().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3159y.d(((p) obj).f24550a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (p) obj;
            }

            public /* synthetic */ a(AbstractC3151p abstractC3151p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return p.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final p[] newArray(int i8) {
                return new p[i8];
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            boolean z8 = false;
            boolean z9 = false;
            f24531h = new p("Link", 0, "link", false, z8, true, z9, null, 32, null);
            int i8 = 32;
            AbstractC3151p abstractC3151p = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            a aVar = null;
            f24532i = new p("Card", 1, "card", true, z10, z11, z12, aVar, i8, abstractC3151p);
            int i9 = 32;
            AbstractC3151p abstractC3151p2 = null;
            boolean z13 = false;
            boolean z14 = false;
            a aVar2 = null;
            f24533j = new p("CardPresent", 2, "card_present", z8, z13, z9, z14, aVar2, i9, abstractC3151p2);
            boolean z15 = false;
            f24534k = new p("Fpx", 3, "fpx", z15, z10, z11, z12, aVar, i8, abstractC3151p);
            boolean z16 = true;
            f24535l = new p("Ideal", 4, "ideal", z8, z13, z16, z14, aVar2, i9, abstractC3151p2);
            boolean z17 = true;
            boolean z18 = true;
            f24536m = new p("SepaDebit", 5, "sepa_debit", z15, z10, z17, z18, aVar, i8, abstractC3151p);
            boolean z19 = true;
            f24537n = new p("AuBecsDebit", 6, "au_becs_debit", true, z13, z16, z19, aVar2, i9, abstractC3151p2);
            f24538o = new p("BacsDebit", 7, "bacs_debit", true, z10, z17, z18, aVar, i8, abstractC3151p);
            f24539p = new p("Sofort", 8, "sofort", false, z13, z16, z19, aVar2, i9, abstractC3151p2);
            int i10 = 0;
            int i11 = 1;
            AbstractC3151p abstractC3151p3 = null;
            f24540q = new p("Upi", 9, "upi", false, false, false, false, new a.c(i10, i11, abstractC3151p3));
            int i12 = 32;
            AbstractC3151p abstractC3151p4 = null;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = true;
            boolean z23 = false;
            a aVar3 = null;
            f24542s = new p("Bancontact", 11, "bancontact", z20, z21, z22, z23, aVar3, i12, abstractC3151p4);
            int i13 = 32;
            AbstractC3151p abstractC3151p5 = null;
            boolean z24 = false;
            boolean z25 = false;
            f24543t = new p("Giropay", 12, "giropay", z24, false, z25, false, null, i13, abstractC3151p5);
            f24544u = new p("Eps", 13, "eps", z20, z21, z22, z23, aVar3, i12, abstractC3151p4);
            f24545v = new p("Oxxo", 14, "oxxo", z24, true, z25, true, 0 == true ? 1 : 0, i13, abstractC3151p5);
            boolean z26 = false;
            f24546w = new p("Alipay", 15, "alipay", z20, z21, z26, z23, aVar3, i12, abstractC3151p4);
            boolean z27 = false;
            boolean z28 = false;
            f24547x = new p("GrabPay", 16, "grabpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3151p5);
            f24548y = new p("PayPal", 17, "paypal", z20, z21, z26, z23, aVar3, i12, abstractC3151p4);
            f24549z = new p("AfterpayClearpay", 18, "afterpay_clearpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3151p5);
            f24508A = new p("Netbanking", 19, "netbanking", z20, z21, z26, z23, aVar3, i12, abstractC3151p4);
            f24509B = new p("Blik", 20, "blik", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3151p5);
            f24511D = new p("Klarna", 22, "klarna", false, false, z24, z27, null, 32, 0 == true ? 1 : 0);
            int i14 = 32;
            AbstractC3151p abstractC3151p6 = null;
            boolean z29 = false;
            boolean z30 = false;
            a aVar4 = null;
            f24512E = new p("Affirm", 23, "affirm", z29, false, z30, false, aVar4, i14, abstractC3151p6);
            int i15 = 32;
            AbstractC3151p abstractC3151p7 = null;
            a aVar5 = null;
            f24513F = new p("RevolutPay", 24, "revolut_pay", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            int i16 = 32;
            AbstractC3151p abstractC3151p8 = null;
            boolean z31 = false;
            boolean z32 = false;
            f24514G = new p("Sunbit", 25, "sunbit", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24515H = new p("Billie", 26, "billie", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            f24516I = new p("Satispay", 27, "satispay", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24517J = new p("AmazonPay", 28, "amazon_pay", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            f24518K = new p("Alma", 29, "alma", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24519L = new p("MobilePay", 30, "mobilepay", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            boolean z33 = true;
            f24520M = new p("Multibanco", 31, "multibanco", z24, true, z31, z33, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24521N = new p("Zip", 32, "zip", z20, z21, z26, z23, aVar5, i15, abstractC3151p7);
            f24522O = new p("USBankAccount", 33, "us_bank_account", true, false, true, z33, 0 == true ? 1 : 0, i16, abstractC3151p8);
            f24523P = new p("CashAppPay", 34, "cashapp", false, false, false, false, new a.c(i10, i11, abstractC3151p3));
            f24525R = new p("Konbini", 36, "konbini", z29, true, z30, true, aVar4, i14, abstractC3151p6);
            f24526S = new p("Swish", 37, "swish", false, false, false, false, new a.b(i10, i11, abstractC3151p3));
            f24527T = new p("Twint", 38, "twint", false, false, false, false, new a.b(i10, i11, abstractC3151p3));
            p[] b8 = b();
            f24528U = b8;
            f24529V = R5.b.a(b8);
            f24530g = new a(abstractC3151p3);
            CREATOR = new b();
        }

        private p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar) {
            this.f24550a = str2;
            this.f24551b = z8;
            this.f24552c = z9;
            this.f24553d = z10;
            this.f24554e = z11;
            this.f24555f = aVar;
        }

        private static final /* synthetic */ p[] b() {
            return new p[]{f24531h, f24532i, f24533j, f24534k, f24535l, f24536m, f24537n, f24538o, f24539p, f24540q, f24541r, f24542s, f24543t, f24544u, f24545v, f24546w, f24547x, f24548y, f24549z, f24508A, f24509B, f24510C, f24511D, f24512E, f24513F, f24514G, f24515H, f24516I, f24517J, f24518K, f24519L, f24520M, f24521N, f24522O, f24523P, f24524Q, f24525R, f24526S, f24527T};
        }

        public static R5.a e() {
            return f24529V;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f24528U.clone();
        }

        public final a c() {
            return this.f24555f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean f() {
            return this.f24554e;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f24550a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(name());
        }

        /* synthetic */ p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar, int i9, AbstractC3151p abstractC3151p) {
            this(str, i8, str2, z8, z9, z10, z11, (i9 & 32) != 0 ? a.C0515a.f24427a : aVar);
        }
    }

    public /* synthetic */ o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0520o c0520o, s sVar, m mVar, r rVar, b bVar, int i8, AbstractC3151p abstractC3151p) {
        this(str, l8, z8, str2, pVar, (i8 & 32) != 0 ? null : eVar, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : gVar, (i8 & 256) != 0 ? null : hVar, (i8 & 512) != 0 ? null : kVar, (i8 & 1024) != 0 ? null : lVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : cVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : c0520o, (32768 & i8) != 0 ? null : sVar, (65536 & i8) != 0 ? null : mVar, (131072 & i8) != 0 ? null : rVar, (i8 & 262144) != 0 ? null : bVar);
    }
}
