package A2;

import A2.G;
import A2.y;
import P5.AbstractC1378t;
import android.os.Parcel;
import android.os.Parcelable;
import j6.C3205d;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import u2.C4054a;
import u2.C4056c;
import w2.C4139f;

/* loaded from: classes4.dex */
public final class j extends G {

    /* renamed from: q, reason: collision with root package name */
    public static final a f172q = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final G.a f173c;

    /* renamed from: d, reason: collision with root package name */
    private final String f174d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f175e;

    /* renamed from: f, reason: collision with root package name */
    private final c f176f;

    /* renamed from: g, reason: collision with root package name */
    private final C4056c f177g;

    /* renamed from: h, reason: collision with root package name */
    private final String f178h;

    /* renamed from: i, reason: collision with root package name */
    private final String f179i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f180j;

    /* renamed from: k, reason: collision with root package name */
    private final String f181k;

    /* renamed from: l, reason: collision with root package name */
    private final y.b f182l;

    /* renamed from: m, reason: collision with root package name */
    private final G.b f183m;

    /* renamed from: n, reason: collision with root package name */
    private final Iterable f184n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f185o;

    /* renamed from: p, reason: collision with root package name */
    private Map f186p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C4056c f187a;

        /* renamed from: b, reason: collision with root package name */
        private final String f188b;

        /* renamed from: c, reason: collision with root package name */
        private final String f189c;

        public b(C4056c c4056c, String apiVersion, String sdkVersion) {
            AbstractC3255y.i(apiVersion, "apiVersion");
            AbstractC3255y.i(sdkVersion, "sdkVersion");
            this.f187a = c4056c;
            this.f188b = apiVersion;
            this.f189c = sdkVersion;
        }

        public static /* synthetic */ j b(b bVar, String str, c cVar, Map map, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                z8 = false;
            }
            return bVar.a(str, cVar, map, z8);
        }

        public static /* synthetic */ j d(b bVar, String str, c cVar, Map map, boolean z8, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                map = null;
            }
            if ((i8 & 8) != 0) {
                z8 = false;
            }
            return bVar.c(str, cVar, map, z8);
        }

        public final j a(String url, c options, Map map, boolean z8) {
            AbstractC3255y.i(url, "url");
            AbstractC3255y.i(options, "options");
            return new j(G.a.f117b, url, map, options, this.f187a, this.f188b, this.f189c, z8);
        }

        public final j c(String url, c options, Map map, boolean z8) {
            AbstractC3255y.i(url, "url");
            AbstractC3255y.i(options, "options");
            return new j(G.a.f118c, url, map, options, this.f187a, this.f188b, this.f189c, z8);
        }
    }

    public j(G.a method, String baseUrl, Map map, c options, C4056c c4056c, String apiVersion, String sdkVersion, boolean z8) {
        AbstractC3255y.i(method, "method");
        AbstractC3255y.i(baseUrl, "baseUrl");
        AbstractC3255y.i(options, "options");
        AbstractC3255y.i(apiVersion, "apiVersion");
        AbstractC3255y.i(sdkVersion, "sdkVersion");
        this.f173c = method;
        this.f174d = baseUrl;
        this.f175e = map;
        this.f176f = options;
        this.f177g = c4056c;
        this.f178h = apiVersion;
        this.f179i = sdkVersion;
        this.f180j = z8;
        this.f181k = v.f242a.c(map);
        y.b bVar = new y.b(options, c4056c, null, apiVersion, sdkVersion, 4, null);
        this.f182l = bVar;
        this.f183m = G.b.f123b;
        this.f184n = t.a();
        this.f185o = bVar.b();
        this.f186p = bVar.c();
    }

    private final byte[] i() {
        try {
            byte[] bytes = this.f181k.getBytes(C3205d.f34020b);
            AbstractC3255y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C4139f(null, null, 0, "Unable to encode parameters to " + C3205d.f34020b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // A2.G
    public Map a() {
        return this.f185o;
    }

    @Override // A2.G
    public G.a b() {
        return this.f173c;
    }

    @Override // A2.G
    public Map c() {
        return this.f186p;
    }

    @Override // A2.G
    public Iterable d() {
        return this.f184n;
    }

    @Override // A2.G
    public boolean e() {
        return this.f180j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f173c == jVar.f173c && AbstractC3255y.d(this.f174d, jVar.f174d) && AbstractC3255y.d(this.f175e, jVar.f175e) && AbstractC3255y.d(this.f176f, jVar.f176f) && AbstractC3255y.d(this.f177g, jVar.f177g) && AbstractC3255y.d(this.f178h, jVar.f178h) && AbstractC3255y.d(this.f179i, jVar.f179i) && this.f180j == jVar.f180j) {
            return true;
        }
        return false;
    }

    @Override // A2.G
    public String f() {
        if (G.a.f117b != b() && G.a.f119d != b()) {
            return this.f174d;
        }
        String str = this.f174d;
        String str2 = this.f181k;
        if (str2.length() <= 0) {
            str2 = null;
        }
        List r8 = AbstractC1378t.r(str, str2);
        String str3 = "?";
        if (j6.n.H(this.f174d, "?", false, 2, null)) {
            str3 = "&";
        }
        return AbstractC1378t.w0(r8, str3, null, null, 0, null, null, 62, null);
    }

    @Override // A2.G
    public void g(OutputStream outputStream) {
        AbstractC3255y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }

    public final String h() {
        return this.f174d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f173c.hashCode() * 31) + this.f174d.hashCode()) * 31;
        Map map = this.f175e;
        int i8 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f176f.hashCode()) * 31;
        C4056c c4056c = this.f177g;
        if (c4056c != null) {
            i8 = c4056c.hashCode();
        }
        return ((((((hashCode3 + i8) * 31) + this.f178h.hashCode()) * 31) + this.f179i.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f180j);
    }

    public String toString() {
        return b().b() + " " + this.f174d;
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f191a;

        /* renamed from: b, reason: collision with root package name */
        private final String f192b;

        /* renamed from: c, reason: collision with root package name */
        private final String f193c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f190d = new a(null);
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
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String apiKey, String str, String str2) {
            AbstractC3255y.i(apiKey, "apiKey");
            this.f191a = apiKey;
            this.f192b = str;
            this.f193c = str2;
            new C4054a().b(apiKey);
        }

        public static /* synthetic */ c b(c cVar, String str, String str2, String str3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = cVar.f191a;
            }
            if ((i8 & 2) != 0) {
                str2 = cVar.f192b;
            }
            if ((i8 & 4) != 0) {
                str3 = cVar.f193c;
            }
            return cVar.a(str, str2, str3);
        }

        public final c a(String apiKey, String str, String str2) {
            AbstractC3255y.i(apiKey, "apiKey");
            return new c(apiKey, str, str2);
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
            if (AbstractC3255y.d(this.f191a, cVar.f191a) && AbstractC3255y.d(this.f192b, cVar.f192b) && AbstractC3255y.d(this.f193c, cVar.f193c)) {
                return true;
            }
            return false;
        }

        public final String g() {
            return this.f191a;
        }

        public final boolean h() {
            return j6.n.C(this.f191a, "uk_", false, 2, null);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f191a.hashCode() * 31;
            String str = this.f192b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            String str2 = this.f193c;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public final String i() {
            return this.f193c;
        }

        public final String l() {
            return this.f192b;
        }

        public String toString() {
            return "Options(apiKey=" + this.f191a + ", stripeAccount=" + this.f192b + ", idempotencyKey=" + this.f193c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f191a);
            out.writeString(this.f192b);
            out.writeString(this.f193c);
        }

        public /* synthetic */ c(String str, String str2, String str3, int i8, AbstractC3247p abstractC3247p) {
            this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
            this((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke(), null, 4, null);
            AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3255y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}
