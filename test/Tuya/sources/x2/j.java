package x2;

import M5.AbstractC1246t;
import android.os.Parcel;
import android.os.Parcelable;
import g6.C2728d;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import r2.C3681a;
import r2.C3683c;
import t2.C3785f;
import x2.AbstractC3869G;
import x2.y;

/* loaded from: classes4.dex */
public final class j extends AbstractC3869G {

    /* renamed from: q, reason: collision with root package name */
    public static final a f39177q = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC3869G.a f39178c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39179d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f39180e;

    /* renamed from: f, reason: collision with root package name */
    private final c f39181f;

    /* renamed from: g, reason: collision with root package name */
    private final C3683c f39182g;

    /* renamed from: h, reason: collision with root package name */
    private final String f39183h;

    /* renamed from: i, reason: collision with root package name */
    private final String f39184i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39185j;

    /* renamed from: k, reason: collision with root package name */
    private final String f39186k;

    /* renamed from: l, reason: collision with root package name */
    private final y.b f39187l;

    /* renamed from: m, reason: collision with root package name */
    private final AbstractC3869G.b f39188m;

    /* renamed from: n, reason: collision with root package name */
    private final Iterable f39189n;

    /* renamed from: o, reason: collision with root package name */
    private final Map f39190o;

    /* renamed from: p, reason: collision with root package name */
    private Map f39191p;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C3683c f39192a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39193b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39194c;

        public b(C3683c c3683c, String apiVersion, String sdkVersion) {
            AbstractC3159y.i(apiVersion, "apiVersion");
            AbstractC3159y.i(sdkVersion, "sdkVersion");
            this.f39192a = c3683c;
            this.f39193b = apiVersion;
            this.f39194c = sdkVersion;
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
            AbstractC3159y.i(url, "url");
            AbstractC3159y.i(options, "options");
            return new j(AbstractC3869G.a.f39122b, url, map, options, this.f39192a, this.f39193b, this.f39194c, z8);
        }

        public final j c(String url, c options, Map map, boolean z8) {
            AbstractC3159y.i(url, "url");
            AbstractC3159y.i(options, "options");
            return new j(AbstractC3869G.a.f39123c, url, map, options, this.f39192a, this.f39193b, this.f39194c, z8);
        }
    }

    public j(AbstractC3869G.a method, String baseUrl, Map map, c options, C3683c c3683c, String apiVersion, String sdkVersion, boolean z8) {
        AbstractC3159y.i(method, "method");
        AbstractC3159y.i(baseUrl, "baseUrl");
        AbstractC3159y.i(options, "options");
        AbstractC3159y.i(apiVersion, "apiVersion");
        AbstractC3159y.i(sdkVersion, "sdkVersion");
        this.f39178c = method;
        this.f39179d = baseUrl;
        this.f39180e = map;
        this.f39181f = options;
        this.f39182g = c3683c;
        this.f39183h = apiVersion;
        this.f39184i = sdkVersion;
        this.f39185j = z8;
        this.f39186k = v.f39247a.c(map);
        y.b bVar = new y.b(options, c3683c, null, apiVersion, sdkVersion, 4, null);
        this.f39187l = bVar;
        this.f39188m = AbstractC3869G.b.f39128b;
        this.f39189n = t.a();
        this.f39190o = bVar.b();
        this.f39191p = bVar.c();
    }

    private final byte[] i() {
        try {
            byte[] bytes = this.f39186k.getBytes(C2728d.f31293b);
            AbstractC3159y.h(bytes, "getBytes(...)");
            return bytes;
        } catch (UnsupportedEncodingException e8) {
            throw new C3785f(null, null, 0, "Unable to encode parameters to " + C2728d.f31293b.name() + ". Please contact support@stripe.com for assistance.", e8, 7, null);
        }
    }

    @Override // x2.AbstractC3869G
    public Map a() {
        return this.f39190o;
    }

    @Override // x2.AbstractC3869G
    public AbstractC3869G.a b() {
        return this.f39178c;
    }

    @Override // x2.AbstractC3869G
    public Map c() {
        return this.f39191p;
    }

    @Override // x2.AbstractC3869G
    public Iterable d() {
        return this.f39189n;
    }

    @Override // x2.AbstractC3869G
    public boolean e() {
        return this.f39185j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f39178c == jVar.f39178c && AbstractC3159y.d(this.f39179d, jVar.f39179d) && AbstractC3159y.d(this.f39180e, jVar.f39180e) && AbstractC3159y.d(this.f39181f, jVar.f39181f) && AbstractC3159y.d(this.f39182g, jVar.f39182g) && AbstractC3159y.d(this.f39183h, jVar.f39183h) && AbstractC3159y.d(this.f39184i, jVar.f39184i) && this.f39185j == jVar.f39185j) {
            return true;
        }
        return false;
    }

    @Override // x2.AbstractC3869G
    public String f() {
        if (AbstractC3869G.a.f39122b != b() && AbstractC3869G.a.f39124d != b()) {
            return this.f39179d;
        }
        String str = this.f39179d;
        String str2 = this.f39186k;
        if (str2.length() <= 0) {
            str2 = null;
        }
        List r8 = AbstractC1246t.r(str, str2);
        String str3 = "?";
        if (g6.n.H(this.f39179d, "?", false, 2, null)) {
            str3 = "&";
        }
        return AbstractC1246t.w0(r8, str3, null, null, 0, null, null, 62, null);
    }

    @Override // x2.AbstractC3869G
    public void g(OutputStream outputStream) {
        AbstractC3159y.i(outputStream, "outputStream");
        outputStream.write(i());
        outputStream.flush();
    }

    public final String h() {
        return this.f39179d;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f39178c.hashCode() * 31) + this.f39179d.hashCode()) * 31;
        Map map = this.f39180e;
        int i8 = 0;
        if (map == null) {
            hashCode = 0;
        } else {
            hashCode = map.hashCode();
        }
        int hashCode3 = (((hashCode2 + hashCode) * 31) + this.f39181f.hashCode()) * 31;
        C3683c c3683c = this.f39182g;
        if (c3683c != null) {
            i8 = c3683c.hashCode();
        }
        return ((((((hashCode3 + i8) * 31) + this.f39183h.hashCode()) * 31) + this.f39184i.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f39185j);
    }

    public String toString() {
        return b().b() + " " + this.f39179d;
    }

    /* loaded from: classes4.dex */
    public static final class c implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f39196a;

        /* renamed from: b, reason: collision with root package name */
        private final String f39197b;

        /* renamed from: c, reason: collision with root package name */
        private final String f39198c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f39195d = new a(null);
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
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        public c(String apiKey, String str, String str2) {
            AbstractC3159y.i(apiKey, "apiKey");
            this.f39196a = apiKey;
            this.f39197b = str;
            this.f39198c = str2;
            new C3681a().b(apiKey);
        }

        public static /* synthetic */ c c(c cVar, String str, String str2, String str3, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                str = cVar.f39196a;
            }
            if ((i8 & 2) != 0) {
                str2 = cVar.f39197b;
            }
            if ((i8 & 4) != 0) {
                str3 = cVar.f39198c;
            }
            return cVar.b(str, str2, str3);
        }

        public final c b(String apiKey, String str, String str2) {
            AbstractC3159y.i(apiKey, "apiKey");
            return new c(apiKey, str, str2);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f39196a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f39196a, cVar.f39196a) && AbstractC3159y.d(this.f39197b, cVar.f39197b) && AbstractC3159y.d(this.f39198c, cVar.f39198c)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return g6.n.C(this.f39196a, "uk_", false, 2, null);
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = this.f39196a.hashCode() * 31;
            String str = this.f39197b;
            int i8 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i9 = (hashCode2 + hashCode) * 31;
            String str2 = this.f39198c;
            if (str2 != null) {
                i8 = str2.hashCode();
            }
            return i9 + i8;
        }

        public final String i() {
            return this.f39198c;
        }

        public final String j() {
            return this.f39197b;
        }

        public String toString() {
            return "Options(apiKey=" + this.f39196a + ", stripeAccount=" + this.f39197b + ", idempotencyKey=" + this.f39198c + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f39196a);
            out.writeString(this.f39197b);
            out.writeString(this.f39198c);
        }

        public /* synthetic */ c(String str, String str2, String str3, int i8, AbstractC3151p abstractC3151p) {
            this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(Function0 publishableKeyProvider, Function0 stripeAccountIdProvider) {
            this((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke(), null, 4, null);
            AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
            AbstractC3159y.i(stripeAccountIdProvider, "stripeAccountIdProvider");
        }
    }
}
