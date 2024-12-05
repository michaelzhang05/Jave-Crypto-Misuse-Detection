package a5;

import a6.InterfaceC1668n;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import o5.C3655A;
import o5.C3660F;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class G implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private long f13970a;

    /* renamed from: b, reason: collision with root package name */
    private String f13971b;

    /* renamed from: c, reason: collision with root package name */
    private String f13972c;

    /* renamed from: d, reason: collision with root package name */
    private String f13973d;

    /* renamed from: e, reason: collision with root package name */
    private long f13974e;

    /* renamed from: f, reason: collision with root package name */
    private String f13975f;

    /* renamed from: g, reason: collision with root package name */
    private String f13976g;

    /* renamed from: h, reason: collision with root package name */
    private int f13977h;

    /* renamed from: i, reason: collision with root package name */
    private int f13978i;

    /* renamed from: j, reason: collision with root package name */
    private int f13979j;

    /* renamed from: k, reason: collision with root package name */
    private String f13980k;

    /* renamed from: l, reason: collision with root package name */
    public static final b f13969l = new b(null);
    public static Parcelable.Creator<G> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public G createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new G(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public G[] newArray(int i8) {
            return new G[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: a, reason: collision with root package name */
            Object f13981a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f13982b;

            /* renamed from: d, reason: collision with root package name */
            int f13984d;

            a(S5.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f13982b = obj;
                this.f13984d |= Integer.MIN_VALUE;
                return b.this.b(null, null, this);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a5.G$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0265b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f13985a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f13986b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ G f13987c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.Q f13988d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0265b(Context context, G g8, kotlin.jvm.internal.Q q8, S5.d dVar) {
                super(2, dVar);
                this.f13986b = context;
                this.f13987c = g8;
                this.f13988d = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new C0265b(this.f13986b, this.f13987c, this.f13988d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f13985a == 0) {
                    O5.t.b(obj);
                    I x02 = new C3660F(this.f13986b).x0(this.f13987c.g());
                    if (!x02.b() && x02.d() != null) {
                        String d8 = x02.d();
                        AbstractC3255y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            this.f13988d.f34160a = jSONObject.getInt("success");
                        }
                        if (this.f13988d.f34160a == 1) {
                            G g8 = this.f13987c;
                            g8.z(g8.h() + 1);
                        }
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(l6.M m8, S5.d dVar) {
                return ((C0265b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        private b() {
        }

        public final G a(JSONObject jsonObject) {
            AbstractC3255y.i(jsonObject, "jsonObject");
            G g8 = new G();
            if (!jsonObject.isNull("id")) {
                g8.y(jsonObject.getLong("id"));
            }
            if (!jsonObject.isNull("userName")) {
                g8.X(jsonObject.getString("userName"));
                if (!jsonObject.isNull("userAvatar")) {
                    g8.x(jsonObject.getString("userAvatar"));
                }
                if (!jsonObject.isNull("userID")) {
                    g8.W(jsonObject.getString("userID"));
                }
            }
            if (!jsonObject.isNull(MimeTypes.BASE_TYPE_TEXT)) {
                g8.H(jsonObject.getString(MimeTypes.BASE_TYPE_TEXT));
            }
            if (!jsonObject.isNull("timeAgo")) {
                g8.J(jsonObject.getString("timeAgo"));
            }
            if (!jsonObject.isNull("likes")) {
                g8.z(jsonObject.getInt("likes"));
            }
            if (!jsonObject.isNull("isAuthorVerified")) {
                g8.w(jsonObject.getInt("isAuthorVerified"));
            }
            if (!jsonObject.isNull("isTurbo")) {
                g8.U(jsonObject.getInt("isTurbo"));
            }
            if (!jsonObject.isNull("usernameFormat")) {
                g8.Y(jsonObject.getString("usernameFormat"));
            }
            return g8;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object b(a5.G r7, android.content.Context r8, S5.d r9) {
            /*
                r6 = this;
                boolean r0 = r9 instanceof a5.G.b.a
                if (r0 == 0) goto L13
                r0 = r9
                a5.G$b$a r0 = (a5.G.b.a) r0
                int r1 = r0.f13984d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f13984d = r1
                goto L18
            L13:
                a5.G$b$a r0 = new a5.G$b$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f13982b
                java.lang.Object r1 = T5.b.e()
                int r2 = r0.f13984d
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r7 = r0.f13981a
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
                long r4 = r7.g()
                r9.a(r4)
                kotlin.jvm.internal.Q r9 = new kotlin.jvm.internal.Q
                r9.<init>()
                l6.I r2 = l6.C3347b0.b()
                a5.G$b$b r4 = new a5.G$b$b
                r5 = 0
                r4.<init>(r8, r7, r9, r5)
                r0.f13981a = r9
                r0.f13984d = r3
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
            throw new UnsupportedOperationException("Method not decompiled: a5.G.b.b(a5.G, android.content.Context, S5.d):java.lang.Object");
        }

        public final ArrayList c(JSONArray jsonArray) {
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

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public G() {
    }

    public final void H(String str) {
        this.f13975f = str;
    }

    public final void J(String str) {
        this.f13976g = str;
    }

    public final void U(int i8) {
        this.f13979j = i8;
    }

    public final void W(String str) {
        this.f13972c = str;
    }

    public final void X(String str) {
        this.f13971b = str;
    }

    public final void Y(String str) {
        this.f13980k = str;
    }

    public final int a() {
        return this.f13978i;
    }

    public final String b() {
        return this.f13973d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final long g() {
        return this.f13970a;
    }

    public final int h() {
        return this.f13977h;
    }

    public final Spanned i() {
        String str = this.f13975f;
        if (str == null) {
            return null;
        }
        C3655A c3655a = C3655A.f36474a;
        AbstractC3255y.f(str);
        return c3655a.c(j6.n.A(str, "\n", "<br />", false, 4, null));
    }

    public final String l() {
        return this.f13976g;
    }

    public final String p() {
        return this.f13972c;
    }

    public final String s() {
        return this.f13971b;
    }

    public final String u() {
        return this.f13980k;
    }

    public final boolean v() {
        if (this.f13979j == 1) {
            return true;
        }
        return false;
    }

    public final void w(int i8) {
        this.f13978i = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeLong(this.f13970a);
        parcel.writeLong(this.f13974e);
        parcel.writeString(this.f13971b);
        parcel.writeString(this.f13972c);
        parcel.writeString(this.f13973d);
        parcel.writeString(this.f13975f);
        parcel.writeString(this.f13976g);
        parcel.writeInt(this.f13977h);
        parcel.writeInt(this.f13978i);
        parcel.writeInt(this.f13979j);
        parcel.writeString(this.f13980k);
    }

    public final void x(String str) {
        this.f13973d = str;
    }

    public final void y(long j8) {
        this.f13970a = j8;
    }

    public final void z(int i8) {
        this.f13977h = i8;
    }

    public G(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f13970a = source.readLong();
        this.f13974e = source.readLong();
        this.f13971b = source.readString();
        this.f13972c = source.readString();
        this.f13973d = source.readString();
        this.f13975f = source.readString();
        this.f13976g = source.readString();
        this.f13977h = source.readInt();
        this.f13978i = source.readInt();
        this.f13979j = source.readInt();
        this.f13980k = source.readString();
    }
}
