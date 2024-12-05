package X4;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import l5.C3307A;
import l5.C3312F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class K implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f12382a;

    /* renamed from: b, reason: collision with root package name */
    private String f12383b;

    /* renamed from: c, reason: collision with root package name */
    private String f12384c;

    /* renamed from: d, reason: collision with root package name */
    private String f12385d;

    /* renamed from: e, reason: collision with root package name */
    private long f12386e;

    /* renamed from: f, reason: collision with root package name */
    private String f12387f;

    /* renamed from: g, reason: collision with root package name */
    private int f12388g;

    /* renamed from: h, reason: collision with root package name */
    private int f12389h;

    /* renamed from: i, reason: collision with root package name */
    private String f12390i;

    /* renamed from: j, reason: collision with root package name */
    private int f12391j;

    /* renamed from: k, reason: collision with root package name */
    private int f12392k;

    /* renamed from: l, reason: collision with root package name */
    private String f12393l;

    /* renamed from: m, reason: collision with root package name */
    private int f12394m;

    /* renamed from: n, reason: collision with root package name */
    private String f12395n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f12381o = new b(null);
    public static Parcelable.Creator<K> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new K(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public K[] newArray(int i8) {
            return new K[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f12396a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f12397b;

            /* renamed from: d, reason: collision with root package name */
            int f12399d;

            a(P5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f12397b = obj;
                this.f12399d |= Integer.MIN_VALUE;
                return b.this.c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: X4.K$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0239b extends kotlin.coroutines.jvm.internal.l implements X5.n {

            /* renamed from: a, reason: collision with root package name */
            int f12400a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f12401b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f12402c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f12403d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0239b(Context context, K k8, kotlin.jvm.internal.Q q8, P5.d dVar) {
                super(2, dVar);
                this.f12401b = context;
                this.f12402c = k8;
                this.f12403d = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final P5.d create(Object obj, P5.d dVar) {
                return new C0239b(this.f12401b, this.f12402c, this.f12403d, dVar);
            }

            @Override // X5.n
            public final Object invoke(i6.M m8, P5.d dVar) {
                return ((C0239b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Q5.b.e();
                if (this.f12400a == 0) {
                    L5.t.b(obj);
                    I y02 = new C3312F(this.f12401b).y0(this.f12402c.j());
                    if (!y02.b() && y02.d() != null) {
                        String d8 = y02.d();
                        AbstractC3159y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            this.f12403d.f33759a = jSONObject.getInt("success");
                        }
                        if (this.f12403d.f33759a == 1) {
                            K k8 = this.f12402c;
                            k8.a0(k8.k() + 1);
                        } else {
                            C3307A.f34473a.m(this.f12402c.j());
                        }
                    }
                    return L5.I.f6487a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        private b() {
        }

        public final K a(JSONObject jsonObject) {
            AbstractC3159y.i(jsonObject, "jsonObject");
            K k8 = new K();
            if (!jsonObject.isNull("id")) {
                k8.Z(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("userID")) {
                k8.f0(jsonObject.getString("userID"));
                if (!jsonObject.isNull("userName")) {
                    k8.g0(jsonObject.getString("userName"));
                }
                if (!jsonObject.isNull("userAvatar")) {
                    k8.Y(jsonObject.getString("userAvatar"));
                }
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                k8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull(CampaignEx.JSON_KEY_STAR)) {
                k8.b0(jsonObject.getInt(CampaignEx.JSON_KEY_STAR));
            }
            if (!jsonObject.isNull("totalAnswers")) {
                k8.Q(jsonObject.getInt("totalAnswers"));
            }
            if (!jsonObject.isNull("timeAgo")) {
                k8.d0(jsonObject.getString("timeAgo"));
            }
            if (!jsonObject.isNull("likes")) {
                k8.a0(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isAuthorVerified")) {
                k8.X(jsonObject.getInt("isAuthorVerified"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                k8.e0(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                k8.h0(jsonObject.getString("usernameFormat"));
            }
            return k8;
        }

        public final boolean b(Context context, String str) {
            if (context == null) {
                return false;
            }
            SettingsPreferences.a aVar = SettingsPreferences.f29323b;
            String t8 = aVar.t(context);
            String u8 = aVar.u(context);
            if (u8 == null) {
                u8 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            if (str == null || !g6.n.s(str, t8, true) || System.currentTimeMillis() - Long.parseLong(u8) >= 600000) {
                return false;
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object c(X4.K r7, android.content.Context r8, P5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof X4.K.b.a
                if (r0 == 0) goto L13
                r0 = r9
                X4.K$b$a r0 = (X4.K.b.a) r0
                int r1 = r0.f12399d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f12399d = r1
                goto L18
            L13:
                X4.K$b$a r0 = new X4.K$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f12397b
                java.lang.Object r1 = Q5.b.e()
                int r2 = r0.f12399d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f12396a
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                L5.t.b(r9)
                goto L5c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                L5.t.b(r9)
                l5.A r9 = l5.C3307A.f34473a
                long r4 = r7.j()
                r9.b(r4)
                kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
                r9.<init>()
                i6.I r2 = i6.C2812b0.b()
                X4.K$b$b r4 = new X4.K$b$b
                r5 = 0
                r4.<init>(r8, r7, r9, r5)
                r0.f12396a = r9
                r0.f12399d = r3
                java.lang.Object r7 = i6.AbstractC2825i.g(r2, r4, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                r7 = r9
            L5c:
                int r7 = r7.f33759a
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: X4.K.b.c(X4.K, android.content.Context, P5.d):java.lang.Object");
        }

        public final void d(K k8, JSONObject jsonObject) {
            AbstractC3159y.i(k8, "<this>");
            AbstractC3159y.i(jsonObject, "jsonObject");
            if (!jsonObject.isNull(CampaignEx.JSON_KEY_STAR)) {
                k8.b0(jsonObject.getInt(CampaignEx.JSON_KEY_STAR));
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                k8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
        }

        public final ArrayList e(JSONArray jsonArray) {
            AbstractC3159y.i(jsonArray, "jsonArray");
            ArrayList arrayList = new ArrayList();
            try {
                int length = jsonArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject jSONObject = jsonArray.getJSONObject(i8);
                    AbstractC3159y.h(jSONObject, "jsonArray.getJSONObject(i)");
                    arrayList.add(a(jSONObject));
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return arrayList;
        }

        public final void f(Context context, String str, String str2) {
            if (context != null) {
                if (str != null && str.length() != 0) {
                    SettingsPreferences.f29323b.N0(context, str);
                }
                if (str2 != null && str2.length() != 0) {
                    SettingsPreferences.f29323b.O0(context, str2);
                }
            }
        }

        public final K g(JSONObject jsonObject) {
            AbstractC3159y.i(jsonObject, "jsonObject");
            K k8 = new K();
            if (!jsonObject.isNull("id")) {
                k8.Z(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("appName")) {
                k8.V(jsonObject.getString("appName"));
            }
            if (!jsonObject.isNull("appID")) {
                k8.T(jsonObject.getLong("appID"));
            }
            if (!jsonObject.isNull("appIcon")) {
                k8.Y(jsonObject.getString("appIcon"));
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                k8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull("rate")) {
                k8.b0(jsonObject.getInt("rate"));
            }
            if (!jsonObject.isNull("publishedDate")) {
                k8.d0(jsonObject.getString("publishedDate"));
            }
            if (!jsonObject.isNull("likes")) {
                k8.a0(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                k8.e0(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                k8.h0(jsonObject.getString("usernameFormat"));
            }
            if (!jsonObject.isNull("totalAnswers")) {
                k8.Q(jsonObject.getInt("totalAnswers"));
            }
            return k8;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final K f12404a;

        /* renamed from: b, reason: collision with root package name */
        private final int f12405b;

        public c(K review, int i8) {
            AbstractC3159y.i(review, "review");
            this.f12404a = review;
            this.f12405b = i8;
        }

        public final K a() {
            return this.f12404a;
        }

        public final int b() {
            return this.f12405b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3159y.d(this.f12404a, cVar.f12404a) && this.f12405b == cVar.f12405b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f12404a.hashCode() * 31) + this.f12405b;
        }

        public String toString() {
            return "ReviewLikeData(review=" + this.f12404a + ", reviewLikedSuccessfully=" + this.f12405b + ')';
        }
    }

    public K() {
    }

    public final String G() {
        return this.f12384c;
    }

    public final String I() {
        return this.f12395n;
    }

    public final boolean L() {
        if (this.f12394m == 1) {
            return true;
        }
        return false;
    }

    public final void Q(int i8) {
        this.f12389h = i8;
    }

    public final void T(long j8) {
        this.f12386e = j8;
    }

    public final void V(String str) {
        this.f12393l = str;
    }

    public final void X(int i8) {
        this.f12392k = i8;
    }

    public final void Y(String str) {
        this.f12385d = str;
    }

    public final void Z(long j8) {
        this.f12382a = j8;
    }

    public final void a0(int i8) {
        this.f12391j = i8;
    }

    public final int b() {
        return this.f12389h;
    }

    public final void b0(int i8) {
        this.f12388g = i8;
    }

    public final long c() {
        return this.f12386e;
    }

    public final void c0(String str) {
        this.f12387f = str;
    }

    public final void d0(String str) {
        this.f12390i = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12393l;
    }

    public final void e0(int i8) {
        this.f12394m = i8;
    }

    public final int f() {
        return this.f12392k;
    }

    public final void f0(String str) {
        this.f12383b = str;
    }

    public final void g0(String str) {
        this.f12384c = str;
    }

    public final void h0(String str) {
        this.f12395n = str;
    }

    public final String i() {
        return this.f12385d;
    }

    public final long j() {
        return this.f12382a;
    }

    public final int k() {
        return this.f12391j;
    }

    public final int n() {
        return this.f12388g;
    }

    public final String o() {
        return this.f12387f;
    }

    public final Spanned s() {
        String str = this.f12387f;
        if (str == null) {
            return null;
        }
        C3307A c3307a = C3307A.f34473a;
        AbstractC3159y.f(str);
        return c3307a.c(g6.n.A(str, "\n", "<br />", false, 4, null));
    }

    public final String u() {
        return this.f12390i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeLong(this.f12382a);
        parcel.writeLong(this.f12386e);
        parcel.writeString(this.f12384c);
        parcel.writeString(this.f12383b);
        parcel.writeString(this.f12385d);
        parcel.writeString(this.f12387f);
        parcel.writeInt(this.f12388g);
        parcel.writeInt(this.f12389h);
        parcel.writeString(this.f12390i);
        parcel.writeInt(this.f12391j);
        parcel.writeInt(this.f12392k);
        parcel.writeString(this.f12393l);
        parcel.writeInt(this.f12394m);
        parcel.writeString(this.f12395n);
    }

    public final String z() {
        return this.f12383b;
    }

    public K(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12382a = source.readLong();
        this.f12386e = source.readLong();
        this.f12384c = source.readString();
        this.f12383b = source.readString();
        this.f12385d = source.readString();
        this.f12387f = source.readString();
        this.f12388g = source.readInt();
        this.f12389h = source.readInt();
        this.f12390i = source.readString();
        this.f12391j = source.readInt();
        this.f12392k = source.readInt();
        this.f12393l = source.readString();
        this.f12394m = source.readInt();
        this.f12395n = source.readString();
    }
}
