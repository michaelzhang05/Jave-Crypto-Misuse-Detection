package com.stripe.android.model;

import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.os.EnvironmentCompat;
import e3.C2779C;
import e3.EnumC2791e;
import e3.InterfaceC2784H;
import g3.AbstractC2878a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class o implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    public final String f25463a;

    /* renamed from: b, reason: collision with root package name */
    public final Long f25464b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f25465c;

    /* renamed from: d, reason: collision with root package name */
    public final String f25466d;

    /* renamed from: e, reason: collision with root package name */
    public final p f25467e;

    /* renamed from: f, reason: collision with root package name */
    public final e f25468f;

    /* renamed from: g, reason: collision with root package name */
    public final String f25469g;

    /* renamed from: h, reason: collision with root package name */
    public final g f25470h;

    /* renamed from: i, reason: collision with root package name */
    public final h f25471i;

    /* renamed from: j, reason: collision with root package name */
    public final k f25472j;

    /* renamed from: k, reason: collision with root package name */
    public final l f25473k;

    /* renamed from: l, reason: collision with root package name */
    public final n f25474l;

    /* renamed from: m, reason: collision with root package name */
    public final c f25475m;

    /* renamed from: n, reason: collision with root package name */
    public final d f25476n;

    /* renamed from: o, reason: collision with root package name */
    public final C0516o f25477o;

    /* renamed from: p, reason: collision with root package name */
    public final s f25478p;

    /* renamed from: q, reason: collision with root package name */
    public final m f25479q;

    /* renamed from: r, reason: collision with root package name */
    public final r f25480r;

    /* renamed from: s, reason: collision with root package name */
    public final b f25481s;

    /* renamed from: t, reason: collision with root package name */
    public static final i f25461t = new i(null);

    /* renamed from: u, reason: collision with root package name */
    public static final int f25462u = 8;
    public static final Parcelable.Creator<o> CREATOR = new j();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b implements y2.f {
        public static final Parcelable.Creator<b> CREATOR;

        /* renamed from: b, reason: collision with root package name */
        public static final b f25489b = new b("UNSPECIFIED", 0, "unspecified");

        /* renamed from: c, reason: collision with root package name */
        public static final b f25490c = new b("LIMITED", 1, "limited");

        /* renamed from: d, reason: collision with root package name */
        public static final b f25491d = new b("ALWAYS", 2, "always");

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ b[] f25492e;

        /* renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25493f;

        /* renamed from: a, reason: collision with root package name */
        private final String f25494a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return b.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        static {
            b[] a8 = a();
            f25492e = a8;
            f25493f = U5.b.a(a8);
            CREATOR = new a();
        }

        private b(String str, int i8, String str2) {
            this.f25494a = str2;
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f25489b, f25490c, f25491d};
        }

        public static U5.a b() {
            return f25493f;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f25492e.clone();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String g() {
            return this.f25494a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(name());
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends q {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25495a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25496b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25497c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25495a = str;
            this.f25496b = str2;
            this.f25497c = str3;
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
            return AbstractC3255y.d(this.f25495a, cVar.f25495a) && AbstractC3255y.d(this.f25496b, cVar.f25496b) && AbstractC3255y.d(this.f25497c, cVar.f25497c);
        }

        public int hashCode() {
            String str = this.f25495a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25496b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25497c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "AuBecsDebit(bsbNumber=" + this.f25495a + ", fingerprint=" + this.f25496b + ", last4=" + this.f25497c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25495a);
            out.writeString(this.f25496b);
            out.writeString(this.f25497c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends q {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25498a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25499b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25500c;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25498a = str;
            this.f25499b = str2;
            this.f25500c = str3;
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
            return AbstractC3255y.d(this.f25498a, dVar.f25498a) && AbstractC3255y.d(this.f25499b, dVar.f25499b) && AbstractC3255y.d(this.f25500c, dVar.f25500c);
        }

        public int hashCode() {
            String str = this.f25498a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25499b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25500c;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BacsDebit(fingerprint=" + this.f25498a + ", last4=" + this.f25499b + ", sortCode=" + this.f25500c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25498a);
            out.writeString(this.f25499b);
            out.writeString(this.f25500c);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private String f25511a;

        /* renamed from: b, reason: collision with root package name */
        private Long f25512b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f25513c;

        /* renamed from: d, reason: collision with root package name */
        private p f25514d;

        /* renamed from: e, reason: collision with root package name */
        private String f25515e;

        /* renamed from: f, reason: collision with root package name */
        private e f25516f;

        /* renamed from: g, reason: collision with root package name */
        private b f25517g;

        /* renamed from: h, reason: collision with root package name */
        private String f25518h;

        /* renamed from: i, reason: collision with root package name */
        private g f25519i;

        /* renamed from: j, reason: collision with root package name */
        private h f25520j;

        /* renamed from: k, reason: collision with root package name */
        private l f25521k;

        /* renamed from: l, reason: collision with root package name */
        private k f25522l;

        /* renamed from: m, reason: collision with root package name */
        private n f25523m;

        /* renamed from: n, reason: collision with root package name */
        private c f25524n;

        /* renamed from: o, reason: collision with root package name */
        private d f25525o;

        /* renamed from: p, reason: collision with root package name */
        private C0516o f25526p;

        /* renamed from: q, reason: collision with root package name */
        private m f25527q;

        /* renamed from: r, reason: collision with root package name */
        private r f25528r;

        /* renamed from: s, reason: collision with root package name */
        private s f25529s;

        public final o a() {
            String str = this.f25511a;
            Long l8 = this.f25512b;
            boolean z8 = this.f25513c;
            p pVar = this.f25514d;
            return new o(str, l8, z8, this.f25515e, pVar, this.f25516f, this.f25518h, this.f25519i, this.f25520j, this.f25522l, this.f25521k, this.f25523m, this.f25524n, this.f25525o, this.f25526p, null, this.f25527q, this.f25528r, this.f25517g, 32768, null);
        }

        public final f b(b bVar) {
            this.f25517g = bVar;
            return this;
        }

        public final f c(c cVar) {
            this.f25524n = cVar;
            return this;
        }

        public final f d(d dVar) {
            this.f25525o = dVar;
            return this;
        }

        public final f e(e eVar) {
            this.f25516f = eVar;
            return this;
        }

        public final f f(g gVar) {
            this.f25519i = gVar;
            return this;
        }

        public final f g(h hVar) {
            this.f25520j = hVar;
            return this;
        }

        public final f h(String str) {
            this.f25515e = str;
            return this;
        }

        public final f i(Long l8) {
            this.f25512b = l8;
            return this;
        }

        public final f j(String str) {
            this.f25518h = str;
            return this;
        }

        public final f k(k kVar) {
            this.f25522l = kVar;
            return this;
        }

        public final f l(String str) {
            this.f25511a = str;
            return this;
        }

        public final f m(l lVar) {
            this.f25521k = lVar;
            return this;
        }

        public final f n(boolean z8) {
            this.f25513c = z8;
            return this;
        }

        public final f o(m mVar) {
            this.f25527q = mVar;
            return this;
        }

        public final f p(n nVar) {
            this.f25523m = nVar;
            return this;
        }

        public final f q(C0516o c0516o) {
            this.f25526p = c0516o;
            return this;
        }

        public final f r(p pVar) {
            this.f25514d = pVar;
            return this;
        }

        public final f s(r rVar) {
            this.f25528r = rVar;
            return this;
        }

        public final f t(s sVar) {
            this.f25529s = sVar;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends q {
        public static final Parcelable.Creator<h> CREATOR = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final a f25549b;

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ h f25550c;

        /* renamed from: a, reason: collision with root package name */
        private final boolean f25551a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final h a() {
                return h.f25550c;
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
                return new h(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final h[] newArray(int i8) {
                return new h[i8];
            }
        }

        static {
            AbstractC3247p abstractC3247p = null;
            f25549b = new a(abstractC3247p);
            f25550c = new h(false, 1, abstractC3247p);
        }

        public /* synthetic */ h(boolean z8, int i8, AbstractC3247p abstractC3247p) {
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
            return (obj instanceof h) && this.f25551a == ((h) obj).f25551a;
        }

        public int hashCode() {
            return androidx.compose.foundation.a.a(this.f25551a);
        }

        public String toString() {
            return "CardPresent(ignore=" + this.f25551a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeInt(this.f25551a ? 1 : 0);
        }

        public h(boolean z8) {
            super(null);
            this.f25551a = z8;
        }
    }

    /* loaded from: classes4.dex */
    public static final class i {
        private i() {
        }

        public /* synthetic */ i(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new o(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : e.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : g.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : h.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : k.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : l.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : n.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : C0516o.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : s.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : m.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : r.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? b.CREATOR.createFromParcel(parcel) : null);
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
        public final String f25552a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25553b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25552a = str;
            this.f25553b = str2;
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
            return AbstractC3255y.d(this.f25552a, kVar.f25552a) && AbstractC3255y.d(this.f25553b, kVar.f25553b);
        }

        public int hashCode() {
            String str = this.f25552a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25553b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Fpx(bank=" + this.f25552a + ", accountHolderType=" + this.f25553b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25552a);
            out.writeString(this.f25553b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends q {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25554a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25555b;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25554a = str;
            this.f25555b = str2;
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
            return AbstractC3255y.d(this.f25554a, lVar.f25554a) && AbstractC3255y.d(this.f25555b, lVar.f25555b);
        }

        public int hashCode() {
            String str = this.f25554a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25555b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Ideal(bank=" + this.f25554a + ", bankIdentifierCode=" + this.f25555b + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25554a);
            out.writeString(this.f25555b);
        }
    }

    /* loaded from: classes4.dex */
    public static final class m extends q {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25556a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final m createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25556a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && AbstractC3255y.d(this.f25556a, ((m) obj).f25556a);
        }

        public int hashCode() {
            String str = this.f25556a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Netbanking(bank=" + this.f25556a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25556a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class n extends q {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25557a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25558b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25559c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25560d;

        /* renamed from: e, reason: collision with root package name */
        public final String f25561e;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25557a = str;
            this.f25558b = str2;
            this.f25559c = str3;
            this.f25560d = str4;
            this.f25561e = str5;
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
            return AbstractC3255y.d(this.f25557a, nVar.f25557a) && AbstractC3255y.d(this.f25558b, nVar.f25558b) && AbstractC3255y.d(this.f25559c, nVar.f25559c) && AbstractC3255y.d(this.f25560d, nVar.f25560d) && AbstractC3255y.d(this.f25561e, nVar.f25561e);
        }

        public int hashCode() {
            String str = this.f25557a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f25558b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25559c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25560d;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f25561e;
            return hashCode4 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SepaDebit(bankCode=" + this.f25557a + ", branchCode=" + this.f25558b + ", country=" + this.f25559c + ", fingerprint=" + this.f25560d + ", last4=" + this.f25561e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25557a);
            out.writeString(this.f25558b);
            out.writeString(this.f25559c);
            out.writeString(this.f25560d);
            out.writeString(this.f25561e);
        }
    }

    /* renamed from: com.stripe.android.model.o$o, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0516o extends q {
        public static final Parcelable.Creator<C0516o> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25562a;

        /* renamed from: com.stripe.android.model.o$o$a */
        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C0516o createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new C0516o(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final C0516o[] newArray(int i8) {
                return new C0516o[i8];
            }
        }

        public C0516o(String str) {
            super(null);
            this.f25562a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0516o) && AbstractC3255y.d(this.f25562a, ((C0516o) obj).f25562a);
        }

        public int hashCode() {
            String str = this.f25562a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Sofort(country=" + this.f25562a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25562a);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class q implements y2.f {
        private q() {
        }

        public /* synthetic */ q(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class r extends q {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final b f25611a;

        /* renamed from: b, reason: collision with root package name */
        public final c f25612b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25613c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25614d;

        /* renamed from: e, reason: collision with root package name */
        public final String f25615e;

        /* renamed from: f, reason: collision with root package name */
        public final String f25616f;

        /* renamed from: g, reason: collision with root package name */
        public final d f25617g;

        /* renamed from: h, reason: collision with root package name */
        public final String f25618h;

        /* renamed from: i, reason: collision with root package name */
        public final String f25619i;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final r createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
        public static final class b implements y2.f {
            public static final Parcelable.Creator<b> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final b f25620b = new b("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final b f25621c = new b("INDIVIDUAL", 1, "individual");

            /* renamed from: d, reason: collision with root package name */
            public static final b f25622d = new b("COMPANY", 2, "company");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ b[] f25623e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25624f;

            /* renamed from: a, reason: collision with root package name */
            private final String f25625a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return b.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            static {
                b[] a8 = a();
                f25623e = a8;
                f25624f = U5.b.a(a8);
                CREATOR = new a();
            }

            private b(String str, int i8, String str2) {
                this.f25625a = str2;
            }

            private static final /* synthetic */ b[] a() {
                return new b[]{f25620b, f25621c, f25622d};
            }

            public static U5.a b() {
                return f25624f;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) f25623e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String g() {
                return this.f25625a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes4.dex */
        public static final class c implements y2.f {
            public static final Parcelable.Creator<c> CREATOR;

            /* renamed from: b, reason: collision with root package name */
            public static final c f25626b = new c("UNKNOWN", 0, EnvironmentCompat.MEDIA_UNKNOWN);

            /* renamed from: c, reason: collision with root package name */
            public static final c f25627c = new c("CHECKING", 1, "checking");

            /* renamed from: d, reason: collision with root package name */
            public static final c f25628d = new c("SAVINGS", 2, "savings");

            /* renamed from: e, reason: collision with root package name */
            private static final /* synthetic */ c[] f25629e;

            /* renamed from: f, reason: collision with root package name */
            private static final /* synthetic */ U5.a f25630f;

            /* renamed from: a, reason: collision with root package name */
            private final String f25631a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return c.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            static {
                c[] a8 = a();
                f25629e = a8;
                f25630f = U5.b.a(a8);
                CREATOR = new a();
            }

            private c(String str, int i8, String str2) {
                this.f25631a = str2;
            }

            private static final /* synthetic */ c[] a() {
                return new c[]{f25626b, f25627c, f25628d};
            }

            public static U5.a b() {
                return f25630f;
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) f25629e.clone();
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public final String g() {
                return this.f25631a;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(name());
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements y2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final String f25632a;

            /* renamed from: b, reason: collision with root package name */
            private final List f25633b;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new d(parcel.readString(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(String str, List supported) {
                AbstractC3255y.i(supported, "supported");
                this.f25632a = str;
                this.f25633b = supported;
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
                return AbstractC3255y.d(this.f25632a, dVar.f25632a) && AbstractC3255y.d(this.f25633b, dVar.f25633b);
            }

            public int hashCode() {
                String str = this.f25632a;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.f25633b.hashCode();
            }

            public String toString() {
                return "USBankNetworks(preferred=" + this.f25632a + ", supported=" + this.f25633b + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25632a);
                out.writeStringList(this.f25633b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(b accountHolderType, c accountType, String str, String str2, String str3, String str4, d dVar, String str5) {
            super(null);
            AbstractC3255y.i(accountHolderType, "accountHolderType");
            AbstractC3255y.i(accountType, "accountType");
            this.f25611a = accountHolderType;
            this.f25612b = accountType;
            this.f25613c = str;
            this.f25614d = str2;
            this.f25615e = str3;
            this.f25616f = str4;
            this.f25617g = dVar;
            this.f25618h = str5;
            this.f25619i = str4;
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
            return this.f25611a == rVar.f25611a && this.f25612b == rVar.f25612b && AbstractC3255y.d(this.f25613c, rVar.f25613c) && AbstractC3255y.d(this.f25614d, rVar.f25614d) && AbstractC3255y.d(this.f25615e, rVar.f25615e) && AbstractC3255y.d(this.f25616f, rVar.f25616f) && AbstractC3255y.d(this.f25617g, rVar.f25617g) && AbstractC3255y.d(this.f25618h, rVar.f25618h);
        }

        public int hashCode() {
            int hashCode = ((this.f25611a.hashCode() * 31) + this.f25612b.hashCode()) * 31;
            String str = this.f25613c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25614d;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25615e;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25616f;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f25617g;
            int hashCode6 = (hashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            String str5 = this.f25618h;
            return hashCode6 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "USBankAccount(accountHolderType=" + this.f25611a + ", accountType=" + this.f25612b + ", bankName=" + this.f25613c + ", fingerprint=" + this.f25614d + ", last4=" + this.f25615e + ", financialConnectionsAccount=" + this.f25616f + ", networks=" + this.f25617g + ", routingNumber=" + this.f25618h + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f25611a.writeToParcel(out, i8);
            this.f25612b.writeToParcel(out, i8);
            out.writeString(this.f25613c);
            out.writeString(this.f25614d);
            out.writeString(this.f25615e);
            out.writeString(this.f25616f);
            d dVar = this.f25617g;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25618h);
        }
    }

    /* loaded from: classes4.dex */
    public static final class s extends q {
        public static final Parcelable.Creator<s> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        public final String f25634a;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final s createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            this.f25634a = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && AbstractC3255y.d(this.f25634a, ((s) obj).f25634a);
        }

        public int hashCode() {
            String str = this.f25634a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "Upi(vpa=" + this.f25634a + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25634a);
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class t {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25635a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.f25587i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.f25588j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.f25589k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.f25590l.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.f25591m.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.f25592n.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.f25593o.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.f25594p.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.f25577O.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f25635a = iArr;
        }
    }

    public o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0516o c0516o, s sVar, m mVar, r rVar, b bVar) {
        this.f25463a = str;
        this.f25464b = l8;
        this.f25465c = z8;
        this.f25466d = str2;
        this.f25467e = pVar;
        this.f25468f = eVar;
        this.f25469g = str3;
        this.f25470h = gVar;
        this.f25471i = hVar;
        this.f25472j = kVar;
        this.f25473k = lVar;
        this.f25474l = nVar;
        this.f25475m = cVar;
        this.f25476n = dVar;
        this.f25477o = c0516o;
        this.f25478p = sVar;
        this.f25479q = mVar;
        this.f25480r = rVar;
        this.f25481s = bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0013 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a() {
        /*
            r3 = this;
            com.stripe.android.model.o$p r0 = r3.f25467e
            if (r0 != 0) goto L6
            r0 = -1
            goto Le
        L6:
            int[] r1 = com.stripe.android.model.o.t.f25635a
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
            com.stripe.android.model.o$r r0 = r3.f25480r
            if (r0 == 0) goto L42
            goto L13
        L1a:
            com.stripe.android.model.o$o r0 = r3.f25477o
            if (r0 == 0) goto L42
            goto L13
        L1f:
            com.stripe.android.model.o$d r0 = r3.f25476n
            if (r0 == 0) goto L42
            goto L13
        L24:
            com.stripe.android.model.o$c r0 = r3.f25475m
            if (r0 == 0) goto L42
            goto L13
        L29:
            com.stripe.android.model.o$n r0 = r3.f25474l
            if (r0 == 0) goto L42
            goto L13
        L2e:
            com.stripe.android.model.o$l r0 = r3.f25473k
            if (r0 == 0) goto L42
            goto L13
        L33:
            com.stripe.android.model.o$k r0 = r3.f25472j
            if (r0 == 0) goto L42
            goto L13
        L38:
            com.stripe.android.model.o$h r0 = r3.f25471i
            if (r0 == 0) goto L42
            goto L13
        L3d:
            com.stripe.android.model.o$g r0 = r3.f25470h
            if (r0 == 0) goto L42
            goto L13
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.o.a():boolean");
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
        return AbstractC3255y.d(this.f25463a, oVar.f25463a) && AbstractC3255y.d(this.f25464b, oVar.f25464b) && this.f25465c == oVar.f25465c && AbstractC3255y.d(this.f25466d, oVar.f25466d) && this.f25467e == oVar.f25467e && AbstractC3255y.d(this.f25468f, oVar.f25468f) && AbstractC3255y.d(this.f25469g, oVar.f25469g) && AbstractC3255y.d(this.f25470h, oVar.f25470h) && AbstractC3255y.d(this.f25471i, oVar.f25471i) && AbstractC3255y.d(this.f25472j, oVar.f25472j) && AbstractC3255y.d(this.f25473k, oVar.f25473k) && AbstractC3255y.d(this.f25474l, oVar.f25474l) && AbstractC3255y.d(this.f25475m, oVar.f25475m) && AbstractC3255y.d(this.f25476n, oVar.f25476n) && AbstractC3255y.d(this.f25477o, oVar.f25477o) && AbstractC3255y.d(this.f25478p, oVar.f25478p) && AbstractC3255y.d(this.f25479q, oVar.f25479q) && AbstractC3255y.d(this.f25480r, oVar.f25480r) && this.f25481s == oVar.f25481s;
    }

    public int hashCode() {
        String str = this.f25463a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l8 = this.f25464b;
        int hashCode2 = (((hashCode + (l8 == null ? 0 : l8.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25465c)) * 31;
        String str2 = this.f25466d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.f25467e;
        int hashCode4 = (hashCode3 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        e eVar = this.f25468f;
        int hashCode5 = (hashCode4 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str3 = this.f25469g;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        g gVar = this.f25470h;
        int hashCode7 = (hashCode6 + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f25471i;
        int hashCode8 = (hashCode7 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        k kVar = this.f25472j;
        int hashCode9 = (hashCode8 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        l lVar = this.f25473k;
        int hashCode10 = (hashCode9 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f25474l;
        int hashCode11 = (hashCode10 + (nVar == null ? 0 : nVar.hashCode())) * 31;
        c cVar = this.f25475m;
        int hashCode12 = (hashCode11 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f25476n;
        int hashCode13 = (hashCode12 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        C0516o c0516o = this.f25477o;
        int hashCode14 = (hashCode13 + (c0516o == null ? 0 : c0516o.hashCode())) * 31;
        s sVar = this.f25478p;
        int hashCode15 = (hashCode14 + (sVar == null ? 0 : sVar.hashCode())) * 31;
        m mVar = this.f25479q;
        int hashCode16 = (hashCode15 + (mVar == null ? 0 : mVar.hashCode())) * 31;
        r rVar = this.f25480r;
        int hashCode17 = (hashCode16 + (rVar == null ? 0 : rVar.hashCode())) * 31;
        b bVar = this.f25481s;
        return hashCode17 + (bVar != null ? bVar.hashCode() : 0);
    }

    public String toString() {
        return "PaymentMethod(id=" + this.f25463a + ", created=" + this.f25464b + ", liveMode=" + this.f25465c + ", code=" + this.f25466d + ", type=" + this.f25467e + ", billingDetails=" + this.f25468f + ", customerId=" + this.f25469g + ", card=" + this.f25470h + ", cardPresent=" + this.f25471i + ", fpx=" + this.f25472j + ", ideal=" + this.f25473k + ", sepaDebit=" + this.f25474l + ", auBecsDebit=" + this.f25475m + ", bacsDebit=" + this.f25476n + ", sofort=" + this.f25477o + ", upi=" + this.f25478p + ", netbanking=" + this.f25479q + ", usBankAccount=" + this.f25480r + ", allowRedisplay=" + this.f25481s + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25463a);
        Long l8 = this.f25464b;
        if (l8 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeLong(l8.longValue());
        }
        out.writeInt(this.f25465c ? 1 : 0);
        out.writeString(this.f25466d);
        p pVar = this.f25467e;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        e eVar = this.f25468f;
        if (eVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            eVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25469g);
        g gVar = this.f25470h;
        if (gVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            gVar.writeToParcel(out, i8);
        }
        h hVar = this.f25471i;
        if (hVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            hVar.writeToParcel(out, i8);
        }
        k kVar = this.f25472j;
        if (kVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            kVar.writeToParcel(out, i8);
        }
        l lVar = this.f25473k;
        if (lVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            lVar.writeToParcel(out, i8);
        }
        n nVar = this.f25474l;
        if (nVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            nVar.writeToParcel(out, i8);
        }
        c cVar = this.f25475m;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i8);
        }
        d dVar = this.f25476n;
        if (dVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            dVar.writeToParcel(out, i8);
        }
        C0516o c0516o = this.f25477o;
        if (c0516o == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            c0516o.writeToParcel(out, i8);
        }
        s sVar = this.f25478p;
        if (sVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sVar.writeToParcel(out, i8);
        }
        m mVar = this.f25479q;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
        r rVar = this.f25480r;
        if (rVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            rVar.writeToParcel(out, i8);
        }
        b bVar = this.f25481s;
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
        public static final class C0511a implements a {

            /* renamed from: b, reason: collision with root package name */
            private static final boolean f25483b = false;

            /* renamed from: a, reason: collision with root package name */
            public static final C0511a f25482a = new C0511a();

            /* renamed from: c, reason: collision with root package name */
            private static final int f25484c = 5;
            public static final Parcelable.Creator<C0511a> CREATOR = new C0512a();

            /* renamed from: com.stripe.android.model.o$a$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0512a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final C0511a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    parcel.readInt();
                    return C0511a.f25482a;
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final C0511a[] newArray(int i8) {
                    return new C0511a[i8];
                }
            }

            private C0511a() {
            }

            @Override // com.stripe.android.model.o.a
            public int N() {
                return f25484c;
            }

            @Override // com.stripe.android.model.o.a
            public boolean T() {
                return f25483b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0511a);
            }

            public int hashCode() {
                return -1728259977;
            }

            public String toString() {
                return "None";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(1);
            }
        }

        int N();

        boolean T();

        /* loaded from: classes4.dex */
        public static final class b implements a {
            public static final Parcelable.Creator<b> CREATOR = new C0513a();

            /* renamed from: a, reason: collision with root package name */
            private final int f25485a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25486b;

            /* renamed from: com.stripe.android.model.o$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0513a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(int i8) {
                this.f25485a = i8;
                this.f25486b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int N() {
                return this.f25485a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean T() {
                return this.f25486b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f25485a == ((b) obj).f25485a;
            }

            public int hashCode() {
                return this.f25485a;
            }

            public String toString() {
                return "Poll(retryCount=" + this.f25485a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(this.f25485a);
            }

            public /* synthetic */ b(int i8, int i9, AbstractC3247p abstractC3247p) {
                this((i9 & 1) != 0 ? 5 : i8);
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements a {
            public static final Parcelable.Creator<c> CREATOR = new C0514a();

            /* renamed from: a, reason: collision with root package name */
            private final int f25487a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25488b;

            /* renamed from: com.stripe.android.model.o$a$c$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0514a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new c(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final c[] newArray(int i8) {
                    return new c[i8];
                }
            }

            public c(int i8) {
                this.f25487a = i8;
                this.f25488b = true;
            }

            @Override // com.stripe.android.model.o.a
            public int N() {
                return this.f25487a;
            }

            @Override // com.stripe.android.model.o.a
            public boolean T() {
                return this.f25488b;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f25487a == ((c) obj).f25487a;
            }

            public int hashCode() {
                return this.f25487a;
            }

            public String toString() {
                return "Refresh(retryCount=" + this.f25487a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(this.f25487a);
            }

            public /* synthetic */ c(int i8, int i9, AbstractC3247p abstractC3247p) {
                this((i9 & 1) != 0 ? 1 : i8);
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends q {
        public static final Parcelable.Creator<g> CREATOR = new b();

        /* renamed from: a, reason: collision with root package name */
        public final EnumC2791e f25530a;

        /* renamed from: b, reason: collision with root package name */
        public final a f25531b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25532c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f25533d;

        /* renamed from: e, reason: collision with root package name */
        public final Integer f25534e;

        /* renamed from: f, reason: collision with root package name */
        public final String f25535f;

        /* renamed from: g, reason: collision with root package name */
        public final String f25536g;

        /* renamed from: h, reason: collision with root package name */
        public final String f25537h;

        /* renamed from: i, reason: collision with root package name */
        public final d f25538i;

        /* renamed from: j, reason: collision with root package name */
        public final AbstractC2878a f25539j;

        /* renamed from: k, reason: collision with root package name */
        public final c f25540k;

        /* renamed from: l, reason: collision with root package name */
        public final String f25541l;

        /* loaded from: classes4.dex */
        public static final class a implements y2.f {
            public static final Parcelable.Creator<a> CREATOR = new C0515a();

            /* renamed from: a, reason: collision with root package name */
            public final String f25542a;

            /* renamed from: b, reason: collision with root package name */
            public final String f25543b;

            /* renamed from: c, reason: collision with root package name */
            public final String f25544c;

            /* renamed from: com.stripe.android.model.o$g$a$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0515a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new a(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final a[] newArray(int i8) {
                    return new a[i8];
                }
            }

            public a(String str, String str2, String str3) {
                this.f25542a = str;
                this.f25543b = str2;
                this.f25544c = str3;
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
                return AbstractC3255y.d(this.f25542a, aVar.f25542a) && AbstractC3255y.d(this.f25543b, aVar.f25543b) && AbstractC3255y.d(this.f25544c, aVar.f25544c);
            }

            public int hashCode() {
                String str = this.f25542a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.f25543b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f25544c;
                return hashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public String toString() {
                return "Checks(addressLine1Check=" + this.f25542a + ", addressPostalCodeCheck=" + this.f25543b + ", cvcCheck=" + this.f25544c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeString(this.f25542a);
                out.writeString(this.f25543b);
                out.writeString(this.f25544c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new g(EnumC2791e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : d.CREATOR.createFromParcel(parcel), (AbstractC2878a) parcel.readParcelable(g.class.getClassLoader()), parcel.readInt() != 0 ? c.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements y2.f {
            public static final Parcelable.Creator<c> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            private final Set f25545a;

            /* renamed from: b, reason: collision with root package name */
            private final boolean f25546b;

            /* renamed from: c, reason: collision with root package name */
            private final String f25547c;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
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
                AbstractC3255y.i(available, "available");
                this.f25545a = available;
                this.f25546b = z8;
                this.f25547c = str;
            }

            public final Set a() {
                return this.f25545a;
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
                return AbstractC3255y.d(this.f25545a, cVar.f25545a) && this.f25546b == cVar.f25546b && AbstractC3255y.d(this.f25547c, cVar.f25547c);
            }

            public int hashCode() {
                int hashCode = ((this.f25545a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f25546b)) * 31;
                String str = this.f25547c;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                return "Networks(available=" + this.f25545a + ", selectionMandatory=" + this.f25546b + ", preferred=" + this.f25547c + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                Set set = this.f25545a;
                out.writeInt(set.size());
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    out.writeString((String) it.next());
                }
                out.writeInt(this.f25546b ? 1 : 0);
                out.writeString(this.f25547c);
            }
        }

        /* loaded from: classes4.dex */
        public static final class d implements y2.f {
            public static final Parcelable.Creator<d> CREATOR = new a();

            /* renamed from: a, reason: collision with root package name */
            public final boolean f25548a;

            /* loaded from: classes4.dex */
            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final d createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new d(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final d[] newArray(int i8) {
                    return new d[i8];
                }
            }

            public d(boolean z8) {
                this.f25548a = z8;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f25548a == ((d) obj).f25548a;
            }

            public int hashCode() {
                return androidx.compose.foundation.a.a(this.f25548a);
            }

            public String toString() {
                return "ThreeDSecureUsage(isSupported=" + this.f25548a + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeInt(this.f25548a ? 1 : 0);
            }
        }

        public /* synthetic */ g(EnumC2791e enumC2791e, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2878a abstractC2878a, c cVar, String str5, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? EnumC2791e.f31452w : enumC2791e, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : str, (i8 & 8) != 0 ? null : num, (i8 & 16) != 0 ? null : num2, (i8 & 32) != 0 ? null : str2, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : str4, (i8 & 256) != 0 ? null : dVar, (i8 & 512) != 0 ? null : abstractC2878a, (i8 & 1024) != 0 ? null : cVar, (i8 & 2048) == 0 ? str5 : null);
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
            return this.f25530a == gVar.f25530a && AbstractC3255y.d(this.f25531b, gVar.f25531b) && AbstractC3255y.d(this.f25532c, gVar.f25532c) && AbstractC3255y.d(this.f25533d, gVar.f25533d) && AbstractC3255y.d(this.f25534e, gVar.f25534e) && AbstractC3255y.d(this.f25535f, gVar.f25535f) && AbstractC3255y.d(this.f25536g, gVar.f25536g) && AbstractC3255y.d(this.f25537h, gVar.f25537h) && AbstractC3255y.d(this.f25538i, gVar.f25538i) && AbstractC3255y.d(this.f25539j, gVar.f25539j) && AbstractC3255y.d(this.f25540k, gVar.f25540k) && AbstractC3255y.d(this.f25541l, gVar.f25541l);
        }

        public int hashCode() {
            int hashCode = this.f25530a.hashCode() * 31;
            a aVar = this.f25531b;
            int hashCode2 = (hashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str = this.f25532c;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f25533d;
            int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.f25534e;
            int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str2 = this.f25535f;
            int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25536g;
            int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f25537h;
            int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            d dVar = this.f25538i;
            int hashCode9 = (hashCode8 + (dVar == null ? 0 : dVar.hashCode())) * 31;
            AbstractC2878a abstractC2878a = this.f25539j;
            int hashCode10 = (hashCode9 + (abstractC2878a == null ? 0 : abstractC2878a.hashCode())) * 31;
            c cVar = this.f25540k;
            int hashCode11 = (hashCode10 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str5 = this.f25541l;
            return hashCode11 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "Card(brand=" + this.f25530a + ", checks=" + this.f25531b + ", country=" + this.f25532c + ", expiryMonth=" + this.f25533d + ", expiryYear=" + this.f25534e + ", fingerprint=" + this.f25535f + ", funding=" + this.f25536g + ", last4=" + this.f25537h + ", threeDSecureUsage=" + this.f25538i + ", wallet=" + this.f25539j + ", networks=" + this.f25540k + ", displayBrand=" + this.f25541l + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25530a.name());
            a aVar = this.f25531b;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25532c);
            Integer num = this.f25533d;
            if (num == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num.intValue());
            }
            Integer num2 = this.f25534e;
            if (num2 == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(num2.intValue());
            }
            out.writeString(this.f25535f);
            out.writeString(this.f25536g);
            out.writeString(this.f25537h);
            d dVar = this.f25538i;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i8);
            }
            out.writeParcelable(this.f25539j, i8);
            c cVar = this.f25540k;
            if (cVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                cVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25541l);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EnumC2791e brand, a aVar, String str, Integer num, Integer num2, String str2, String str3, String str4, d dVar, AbstractC2878a abstractC2878a, c cVar, String str5) {
            super(null);
            AbstractC3255y.i(brand, "brand");
            this.f25530a = brand;
            this.f25531b = aVar;
            this.f25532c = str;
            this.f25533d = num;
            this.f25534e = num2;
            this.f25535f = str2;
            this.f25536g = str3;
            this.f25537h = str4;
            this.f25538i = dVar;
            this.f25539j = abstractC2878a;
            this.f25540k = cVar;
            this.f25541l = str5;
        }
    }

    /* loaded from: classes4.dex */
    public static final class e implements y2.f, InterfaceC2784H {

        /* renamed from: f, reason: collision with root package name */
        public static final int f25502f = 0;

        /* renamed from: a, reason: collision with root package name */
        public final com.stripe.android.model.a f25503a;

        /* renamed from: b, reason: collision with root package name */
        public final String f25504b;

        /* renamed from: c, reason: collision with root package name */
        public final String f25505c;

        /* renamed from: d, reason: collision with root package name */
        public final String f25506d;

        /* renamed from: e, reason: collision with root package name */
        public static final b f25501e = new b(null);
        public static final Parcelable.Creator<e> CREATOR = new c();

        /* loaded from: classes4.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private com.stripe.android.model.a f25507a;

            /* renamed from: b, reason: collision with root package name */
            private String f25508b;

            /* renamed from: c, reason: collision with root package name */
            private String f25509c;

            /* renamed from: d, reason: collision with root package name */
            private String f25510d;

            public final e a() {
                return new e(this.f25507a, this.f25508b, this.f25509c, this.f25510d);
            }

            public final a b(com.stripe.android.model.a aVar) {
                this.f25507a = aVar;
                return this;
            }

            public final a c(String str) {
                this.f25508b = str;
                return this;
            }

            public final a d(String str) {
                this.f25509c = str;
                return this;
            }

            public final a e(String str) {
                this.f25510d = str;
                return this;
            }
        }

        /* loaded from: classes4.dex */
        public static final class b {
            private b() {
            }

            public final e a(C2779C shippingInformation) {
                AbstractC3255y.i(shippingInformation, "shippingInformation");
                return new e(shippingInformation.a(), null, shippingInformation.b(), shippingInformation.g(), 2, null);
            }

            public /* synthetic */ b(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class c implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e(parcel.readInt() == 0 ? null : com.stripe.android.model.a.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(com.stripe.android.model.a aVar, String str, String str2, String str3) {
            this.f25503a = aVar;
            this.f25504b = str;
            this.f25505c = str2;
            this.f25506d = str3;
        }

        @Override // e3.InterfaceC2784H
        public Map B() {
            Map map;
            Map map2;
            Map map3;
            Map h8 = Q.h();
            com.stripe.android.model.a aVar = this.f25503a;
            Map map4 = null;
            if (aVar != null) {
                map = Q.e(O5.x.a("address", aVar.B()));
            } else {
                map = null;
            }
            if (map == null) {
                map = Q.h();
            }
            Map q8 = Q.q(h8, map);
            String str = this.f25504b;
            if (str != null) {
                map2 = Q.e(O5.x.a(NotificationCompat.CATEGORY_EMAIL, str));
            } else {
                map2 = null;
            }
            if (map2 == null) {
                map2 = Q.h();
            }
            Map q9 = Q.q(q8, map2);
            String str2 = this.f25505c;
            if (str2 != null) {
                map3 = Q.e(O5.x.a("name", str2));
            } else {
                map3 = null;
            }
            if (map3 == null) {
                map3 = Q.h();
            }
            Map q10 = Q.q(q9, map3);
            String str3 = this.f25506d;
            if (str3 != null) {
                map4 = Q.e(O5.x.a(HintConstants.AUTOFILL_HINT_PHONE, str3));
            }
            if (map4 == null) {
                map4 = Q.h();
            }
            return Q.q(q10, map4);
        }

        public final boolean a() {
            com.stripe.android.model.a aVar = this.f25503a;
            if ((aVar == null || !aVar.p()) && this.f25504b == null && this.f25505c == null && this.f25506d == null) {
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
            return AbstractC3255y.d(this.f25503a, eVar.f25503a) && AbstractC3255y.d(this.f25504b, eVar.f25504b) && AbstractC3255y.d(this.f25505c, eVar.f25505c) && AbstractC3255y.d(this.f25506d, eVar.f25506d);
        }

        public int hashCode() {
            com.stripe.android.model.a aVar = this.f25503a;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            String str = this.f25504b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f25505c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f25506d;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "BillingDetails(address=" + this.f25503a + ", email=" + this.f25504b + ", name=" + this.f25505c + ", phone=" + this.f25506d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            com.stripe.android.model.a aVar = this.f25503a;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i8);
            }
            out.writeString(this.f25504b);
            out.writeString(this.f25505c);
            out.writeString(this.f25506d);
        }

        public /* synthetic */ e(com.stripe.android.model.a aVar, String str, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
            this((i8 & 1) != 0 ? null : aVar, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class p implements Parcelable {

        /* renamed from: A, reason: collision with root package name */
        public static final p f25563A;

        /* renamed from: B, reason: collision with root package name */
        public static final p f25564B;
        public static final Parcelable.Creator<p> CREATOR;

        /* renamed from: D, reason: collision with root package name */
        public static final p f25566D;

        /* renamed from: E, reason: collision with root package name */
        public static final p f25567E;

        /* renamed from: F, reason: collision with root package name */
        public static final p f25568F;

        /* renamed from: G, reason: collision with root package name */
        public static final p f25569G;

        /* renamed from: H, reason: collision with root package name */
        public static final p f25570H;

        /* renamed from: I, reason: collision with root package name */
        public static final p f25571I;

        /* renamed from: J, reason: collision with root package name */
        public static final p f25572J;

        /* renamed from: K, reason: collision with root package name */
        public static final p f25573K;

        /* renamed from: L, reason: collision with root package name */
        public static final p f25574L;

        /* renamed from: M, reason: collision with root package name */
        public static final p f25575M;

        /* renamed from: N, reason: collision with root package name */
        public static final p f25576N;

        /* renamed from: O, reason: collision with root package name */
        public static final p f25577O;

        /* renamed from: P, reason: collision with root package name */
        public static final p f25578P;

        /* renamed from: R, reason: collision with root package name */
        public static final p f25580R;

        /* renamed from: S, reason: collision with root package name */
        public static final p f25581S;

        /* renamed from: T, reason: collision with root package name */
        public static final p f25582T;

        /* renamed from: U, reason: collision with root package name */
        private static final /* synthetic */ p[] f25583U;

        /* renamed from: V, reason: collision with root package name */
        private static final /* synthetic */ U5.a f25584V;

        /* renamed from: g, reason: collision with root package name */
        public static final a f25585g;

        /* renamed from: h, reason: collision with root package name */
        public static final p f25586h;

        /* renamed from: i, reason: collision with root package name */
        public static final p f25587i;

        /* renamed from: j, reason: collision with root package name */
        public static final p f25588j;

        /* renamed from: k, reason: collision with root package name */
        public static final p f25589k;

        /* renamed from: l, reason: collision with root package name */
        public static final p f25590l;

        /* renamed from: m, reason: collision with root package name */
        public static final p f25591m;

        /* renamed from: n, reason: collision with root package name */
        public static final p f25592n;

        /* renamed from: o, reason: collision with root package name */
        public static final p f25593o;

        /* renamed from: p, reason: collision with root package name */
        public static final p f25594p;

        /* renamed from: q, reason: collision with root package name */
        public static final p f25595q;

        /* renamed from: s, reason: collision with root package name */
        public static final p f25597s;

        /* renamed from: t, reason: collision with root package name */
        public static final p f25598t;

        /* renamed from: u, reason: collision with root package name */
        public static final p f25599u;

        /* renamed from: v, reason: collision with root package name */
        public static final p f25600v;

        /* renamed from: w, reason: collision with root package name */
        public static final p f25601w;

        /* renamed from: x, reason: collision with root package name */
        public static final p f25602x;

        /* renamed from: y, reason: collision with root package name */
        public static final p f25603y;

        /* renamed from: z, reason: collision with root package name */
        public static final p f25604z;

        /* renamed from: a, reason: collision with root package name */
        public final String f25605a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f25606b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f25607c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f25608d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f25609e;

        /* renamed from: f, reason: collision with root package name */
        private final a f25610f;

        /* renamed from: r, reason: collision with root package name */
        public static final p f25596r = new p("P24", 10, "p24", false, false, false, false, null, 32, null);

        /* renamed from: C, reason: collision with root package name */
        public static final p f25565C = new p("WeChatPay", 21, "wechat_pay", false, false, false, false, new a.c(5));

        /* renamed from: Q, reason: collision with root package name */
        public static final p f25579Q = new p("Boleto", 35, "boleto", false, true, false, true, null, 32, 0 == true ? 1 : 0);

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final /* synthetic */ p a(String str) {
                Object obj;
                Iterator<E> it = p.g().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((p) obj).f25605a, str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (p) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
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
            f25586h = new p("Link", 0, "link", false, z8, true, z9, null, 32, null);
            int i8 = 32;
            AbstractC3247p abstractC3247p = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            a aVar = null;
            f25587i = new p("Card", 1, "card", true, z10, z11, z12, aVar, i8, abstractC3247p);
            int i9 = 32;
            AbstractC3247p abstractC3247p2 = null;
            boolean z13 = false;
            boolean z14 = false;
            a aVar2 = null;
            f25588j = new p("CardPresent", 2, "card_present", z8, z13, z9, z14, aVar2, i9, abstractC3247p2);
            boolean z15 = false;
            f25589k = new p("Fpx", 3, "fpx", z15, z10, z11, z12, aVar, i8, abstractC3247p);
            boolean z16 = true;
            f25590l = new p("Ideal", 4, "ideal", z8, z13, z16, z14, aVar2, i9, abstractC3247p2);
            boolean z17 = true;
            boolean z18 = true;
            f25591m = new p("SepaDebit", 5, "sepa_debit", z15, z10, z17, z18, aVar, i8, abstractC3247p);
            boolean z19 = true;
            f25592n = new p("AuBecsDebit", 6, "au_becs_debit", true, z13, z16, z19, aVar2, i9, abstractC3247p2);
            f25593o = new p("BacsDebit", 7, "bacs_debit", true, z10, z17, z18, aVar, i8, abstractC3247p);
            f25594p = new p("Sofort", 8, "sofort", false, z13, z16, z19, aVar2, i9, abstractC3247p2);
            int i10 = 0;
            int i11 = 1;
            AbstractC3247p abstractC3247p3 = null;
            f25595q = new p("Upi", 9, "upi", false, false, false, false, new a.c(i10, i11, abstractC3247p3));
            int i12 = 32;
            AbstractC3247p abstractC3247p4 = null;
            boolean z20 = false;
            boolean z21 = false;
            boolean z22 = true;
            boolean z23 = false;
            a aVar3 = null;
            f25597s = new p("Bancontact", 11, "bancontact", z20, z21, z22, z23, aVar3, i12, abstractC3247p4);
            int i13 = 32;
            AbstractC3247p abstractC3247p5 = null;
            boolean z24 = false;
            boolean z25 = false;
            f25598t = new p("Giropay", 12, "giropay", z24, false, z25, false, null, i13, abstractC3247p5);
            f25599u = new p("Eps", 13, "eps", z20, z21, z22, z23, aVar3, i12, abstractC3247p4);
            f25600v = new p("Oxxo", 14, "oxxo", z24, true, z25, true, 0 == true ? 1 : 0, i13, abstractC3247p5);
            boolean z26 = false;
            f25601w = new p("Alipay", 15, "alipay", z20, z21, z26, z23, aVar3, i12, abstractC3247p4);
            boolean z27 = false;
            boolean z28 = false;
            f25602x = new p("GrabPay", 16, "grabpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3247p5);
            f25603y = new p("PayPal", 17, "paypal", z20, z21, z26, z23, aVar3, i12, abstractC3247p4);
            f25604z = new p("AfterpayClearpay", 18, "afterpay_clearpay", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3247p5);
            f25563A = new p("Netbanking", 19, "netbanking", z20, z21, z26, z23, aVar3, i12, abstractC3247p4);
            f25564B = new p("Blik", 20, "blik", z24, z27, z25, z28, 0 == true ? 1 : 0, i13, abstractC3247p5);
            f25566D = new p("Klarna", 22, "klarna", false, false, z24, z27, null, 32, 0 == true ? 1 : 0);
            int i14 = 32;
            AbstractC3247p abstractC3247p6 = null;
            boolean z29 = false;
            boolean z30 = false;
            a aVar4 = null;
            f25567E = new p("Affirm", 23, "affirm", z29, false, z30, false, aVar4, i14, abstractC3247p6);
            int i15 = 32;
            AbstractC3247p abstractC3247p7 = null;
            a aVar5 = null;
            f25568F = new p("RevolutPay", 24, "revolut_pay", z20, z21, z26, z23, aVar5, i15, abstractC3247p7);
            int i16 = 32;
            AbstractC3247p abstractC3247p8 = null;
            boolean z31 = false;
            boolean z32 = false;
            f25569G = new p("Sunbit", 25, "sunbit", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3247p8);
            f25570H = new p("Billie", 26, "billie", z20, z21, z26, z23, aVar5, i15, abstractC3247p7);
            f25571I = new p("Satispay", 27, "satispay", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3247p8);
            f25572J = new p("AmazonPay", 28, "amazon_pay", z20, z21, z26, z23, aVar5, i15, abstractC3247p7);
            f25573K = new p("Alma", 29, "alma", z24, z27, z31, z32, 0 == true ? 1 : 0, i16, abstractC3247p8);
            f25574L = new p("MobilePay", 30, "mobilepay", z20, z21, z26, z23, aVar5, i15, abstractC3247p7);
            boolean z33 = true;
            f25575M = new p("Multibanco", 31, "multibanco", z24, true, z31, z33, 0 == true ? 1 : 0, i16, abstractC3247p8);
            f25576N = new p("Zip", 32, "zip", z20, z21, z26, z23, aVar5, i15, abstractC3247p7);
            f25577O = new p("USBankAccount", 33, "us_bank_account", true, false, true, z33, 0 == true ? 1 : 0, i16, abstractC3247p8);
            f25578P = new p("CashAppPay", 34, "cashapp", false, false, false, false, new a.c(i10, i11, abstractC3247p3));
            f25580R = new p("Konbini", 36, "konbini", z29, true, z30, true, aVar4, i14, abstractC3247p6);
            f25581S = new p("Swish", 37, "swish", false, false, false, false, new a.b(i10, i11, abstractC3247p3));
            f25582T = new p("Twint", 38, "twint", false, false, false, false, new a.b(i10, i11, abstractC3247p3));
            p[] a8 = a();
            f25583U = a8;
            f25584V = U5.b.a(a8);
            f25585g = new a(abstractC3247p3);
            CREATOR = new b();
        }

        private p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar) {
            this.f25605a = str2;
            this.f25606b = z8;
            this.f25607c = z9;
            this.f25608d = z10;
            this.f25609e = z11;
            this.f25610f = aVar;
        }

        private static final /* synthetic */ p[] a() {
            return new p[]{f25586h, f25587i, f25588j, f25589k, f25590l, f25591m, f25592n, f25593o, f25594p, f25595q, f25596r, f25597s, f25598t, f25599u, f25600v, f25601w, f25602x, f25603y, f25604z, f25563A, f25564B, f25565C, f25566D, f25567E, f25568F, f25569G, f25570H, f25571I, f25572J, f25573K, f25574L, f25575M, f25576N, f25577O, f25578P, f25579Q, f25580R, f25581S, f25582T};
        }

        public static U5.a g() {
            return f25584V;
        }

        public static p valueOf(String str) {
            return (p) Enum.valueOf(p.class, str);
        }

        public static p[] values() {
            return (p[]) f25583U.clone();
        }

        public final a b() {
            return this.f25610f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean h() {
            return this.f25609e;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f25605a;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(name());
        }

        /* synthetic */ p(String str, int i8, String str2, boolean z8, boolean z9, boolean z10, boolean z11, a aVar, int i9, AbstractC3247p abstractC3247p) {
            this(str, i8, str2, z8, z9, z10, z11, (i9 & 32) != 0 ? a.C0511a.f25482a : aVar);
        }
    }

    public /* synthetic */ o(String str, Long l8, boolean z8, String str2, p pVar, e eVar, String str3, g gVar, h hVar, k kVar, l lVar, n nVar, c cVar, d dVar, C0516o c0516o, s sVar, m mVar, r rVar, b bVar, int i8, AbstractC3247p abstractC3247p) {
        this(str, l8, z8, str2, pVar, (i8 & 32) != 0 ? null : eVar, (i8 & 64) != 0 ? null : str3, (i8 & 128) != 0 ? null : gVar, (i8 & 256) != 0 ? null : hVar, (i8 & 512) != 0 ? null : kVar, (i8 & 1024) != 0 ? null : lVar, (i8 & 2048) != 0 ? null : nVar, (i8 & 4096) != 0 ? null : cVar, (i8 & 8192) != 0 ? null : dVar, (i8 & 16384) != 0 ? null : c0516o, (32768 & i8) != 0 ? null : sVar, (65536 & i8) != 0 ? null : mVar, (131072 & i8) != 0 ? null : rVar, (i8 & 262144) != 0 ? null : bVar);
    }
}
