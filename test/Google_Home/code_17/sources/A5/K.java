package a5;

import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3660F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class K implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f14003a;

    /* renamed from: b, reason: collision with root package name */
    private String f14004b;

    /* renamed from: c, reason: collision with root package name */
    private String f14005c;

    /* renamed from: d, reason: collision with root package name */
    private String f14006d;

    /* renamed from: e, reason: collision with root package name */
    private long f14007e;

    /* renamed from: f, reason: collision with root package name */
    private String f14008f;

    /* renamed from: g, reason: collision with root package name */
    private int f14009g;

    /* renamed from: h, reason: collision with root package name */
    private int f14010h;

    /* renamed from: i, reason: collision with root package name */
    private String f14011i;

    /* renamed from: j, reason: collision with root package name */
    private int f14012j;

    /* renamed from: k, reason: collision with root package name */
    private int f14013k;

    /* renamed from: l, reason: collision with root package name */
    private String f14014l;

    /* renamed from: m, reason: collision with root package name */
    private int f14015m;

    /* renamed from: n, reason: collision with root package name */
    private String f14016n;

    /* renamed from: o, reason: collision with root package name */
    public static final b f14002o = new b(null);
    public static Parcelable.Creator<K> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public K createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
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
            Object f14017a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14018b;

            /* renamed from: d, reason: collision with root package name */
            int f14020d;

            a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f14018b = obj;
                this.f14020d |= Integer.MIN_VALUE;
                return b.this.c(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a5.K$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0266b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f14021a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f14022b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ K f14023c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f14024d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0266b(Context context, K k8, kotlin.jvm.internal.Q q8, S5.d dVar) {
                super(2, dVar);
                this.f14022b = context;
                this.f14023c = k8;
                this.f14024d = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0266b(this.f14022b, this.f14023c, this.f14024d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f14021a == 0) {
                    O5.t.b(obj);
                    I y02 = new C3660F(this.f14022b).y0(this.f14023c.l());
                    if (!y02.b() && y02.d() != null) {
                        String d8 = y02.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            this.f14024d.f34160a = jSONObject.getInt("success");
                        }
                        if (this.f14024d.f34160a == 1) {
                            K k8 = this.f14023c;
                            k8.a0(k8.p() + 1);
                        } else {
                            C3655A.f36474a.m(this.f14023c.l());
                        }
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((C0266b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        private b() {
        }

        public final K a(JSONObject jsonObject) {
            AbstractC3255y.i(jsonObject, "jsonObject");
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
                k8.J(jsonObject.getInt("totalAnswers"));
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
            SettingsPreferences.a aVar = SettingsPreferences.f30353b;
            String t8 = aVar.t(context);
            String u8 = aVar.u(context);
            if (u8 == null) {
                u8 = MBridgeConstans.ENDCARD_URL_TYPE_PL;
            }
            if (str == null || !j6.n.s(str, t8, true) || System.currentTimeMillis() - Long.parseLong(u8) >= 600000) {
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
        public final java.lang.Object c(a5.K r7, android.content.Context r8, S5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof a5.K.b.a
                if (r0 == 0) goto L13
                r0 = r9
                a5.K$b$a r0 = (a5.K.b.a) r0
                int r1 = r0.f14020d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f14020d = r1
                goto L18
            L13:
                a5.K$b$a r0 = new a5.K$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f14018b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f14020d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f14017a
                kotlin.jvm.internal.Q r7 = (kotlin.jvm.internal.Q) r7
                O5.t.b(r9)
                goto L5c
            L2d:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L35:
                O5.t.b(r9)
                o5.A r9 = o5.C3655A.f36474a
                long r4 = r7.l()
                r9.b(r4)
                kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
                r9.<init>()
                l6.I r2 = l6.C3347b0.b()
                a5.K$b$b r4 = new a5.K$b$b
                r5 = 0
                r4.<init>(r8, r7, r9, r5)
                r0.f14017a = r9
                r0.f14020d = r3
                java.lang.Object r7 = l6.AbstractC3360i.g(r2, r4, r0)
                if (r7 != r1) goto L5b
                return r1
            L5b:
                r7 = r9
            L5c:
                int r7 = r7.f34160a
                java.lang.Integer r7 = kotlin.coroutines.jvm.internal.b.c(r7)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: a5.K.b.c(a5.K, android.content.Context, S5.d):java.lang.Object");
        }

        public final void d(K k8, JSONObject jsonObject) {
            AbstractC3255y.i(k8, "<this>");
            AbstractC3255y.i(jsonObject, "jsonObject");
            if (!jsonObject.isNull(CampaignEx.JSON_KEY_STAR)) {
                k8.b0(jsonObject.getInt(CampaignEx.JSON_KEY_STAR));
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                k8.c0(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
        }

        public final ArrayList e(JSONArray jsonArray) {
            AbstractC3255y.i(jsonArray, "jsonArray");
            ArrayList arrayList = new ArrayList();
            try {
                int length = jsonArray.length();
                for (int i8 = 0; i8 < length; i8++) {
                    JSONObject jSONObject = jsonArray.getJSONObject(i8);
                    AbstractC3255y.h(jSONObject, "jsonArray.getJSONObject(i)");
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
                    SettingsPreferences.f30353b.N0(context, str);
                }
                if (str2 != null && str2.length() != 0) {
                    SettingsPreferences.f30353b.O0(context, str2);
                }
            }
        }

        public final K g(JSONObject jsonObject) {
            AbstractC3255y.i(jsonObject, "jsonObject");
            K k8 = new K();
            if (!jsonObject.isNull("id")) {
                k8.Z(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("appName")) {
                k8.W(jsonObject.getString("appName"));
            }
            if (!jsonObject.isNull("appID")) {
                k8.U(jsonObject.getLong("appID"));
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
                k8.J(jsonObject.getInt("totalAnswers"));
            }
            return k8;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final K f14025a;

        /* renamed from: b, reason: collision with root package name */
        private final int f14026b;

        public c(K review, int i8) {
            AbstractC3255y.i(review, "review");
            this.f14025a = review;
            this.f14026b = i8;
        }

        public final K a() {
            return this.f14025a;
        }

        public final int b() {
            return this.f14026b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (AbstractC3255y.d(this.f14025a, cVar.f14025a) && this.f14026b == cVar.f14026b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f14025a.hashCode() * 31) + this.f14026b;
        }

        public String toString() {
            return "ReviewLikeData(review=" + this.f14025a + ", reviewLikedSuccessfully=" + this.f14026b + ')';
        }
    }

    public K() {
    }

    public final boolean H() {
        if (this.f14015m == 1) {
            return true;
        }
        return false;
    }

    public final void J(int i8) {
        this.f14010h = i8;
    }

    public final void U(long j8) {
        this.f14007e = j8;
    }

    public final void W(String str) {
        this.f14014l = str;
    }

    public final void X(int i8) {
        this.f14013k = i8;
    }

    public final void Y(String str) {
        this.f14006d = str;
    }

    public final void Z(long j8) {
        this.f14003a = j8;
    }

    public final int a() {
        return this.f14010h;
    }

    public final void a0(int i8) {
        this.f14012j = i8;
    }

    public final long b() {
        return this.f14007e;
    }

    public final void b0(int i8) {
        this.f14009g = i8;
    }

    public final void c0(String str) {
        this.f14008f = str;
    }

    public final void d0(String str) {
        this.f14011i = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void e0(int i8) {
        this.f14015m = i8;
    }

    public final void f0(String str) {
        this.f14004b = str;
    }

    public final String g() {
        return this.f14014l;
    }

    public final void g0(String str) {
        this.f14005c = str;
    }

    public final int h() {
        return this.f14013k;
    }

    public final void h0(String str) {
        this.f14016n = str;
    }

    public final String i() {
        return this.f14006d;
    }

    public final long l() {
        return this.f14003a;
    }

    public final int p() {
        return this.f14012j;
    }

    public final int s() {
        return this.f14009g;
    }

    public final String u() {
        return this.f14008f;
    }

    public final Spanned v() {
        String str = this.f14008f;
        if (str == null) {
            return null;
        }
        C3655A c3655a = C3655A.f36474a;
        AbstractC3255y.f(str);
        return c3655a.c(j6.n.A(str, "\n", "<br />", false, 4, null));
    }

    public final String w() {
        return this.f14011i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeLong(this.f14003a);
        parcel.writeLong(this.f14007e);
        parcel.writeString(this.f14005c);
        parcel.writeString(this.f14004b);
        parcel.writeString(this.f14006d);
        parcel.writeString(this.f14008f);
        parcel.writeInt(this.f14009g);
        parcel.writeInt(this.f14010h);
        parcel.writeString(this.f14011i);
        parcel.writeInt(this.f14012j);
        parcel.writeInt(this.f14013k);
        parcel.writeString(this.f14014l);
        parcel.writeInt(this.f14015m);
        parcel.writeString(this.f14016n);
    }

    public final String x() {
        return this.f14004b;
    }

    public final String y() {
        return this.f14005c;
    }

    public final String z() {
        return this.f14016n;
    }

    public K(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14003a = source.readLong();
        this.f14007e = source.readLong();
        this.f14005c = source.readString();
        this.f14004b = source.readString();
        this.f14006d = source.readString();
        this.f14008f = source.readString();
        this.f14009g = source.readInt();
        this.f14010h = source.readInt();
        this.f14011i = source.readString();
        this.f14012j = source.readInt();
        this.f14013k = source.readInt();
        this.f14014l = source.readString();
        this.f14015m = source.readInt();
        this.f14016n = source.readString();
    }
}
