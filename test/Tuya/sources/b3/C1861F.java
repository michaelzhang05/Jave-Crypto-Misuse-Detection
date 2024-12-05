package b3;

import L5.s;
import M5.AbstractC1246t;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: b3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1861F implements InterfaceC1863H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f14303a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14304b;

    /* renamed from: c, reason: collision with root package name */
    private final String f14305c;

    /* renamed from: d, reason: collision with root package name */
    private final String f14306d;

    /* renamed from: e, reason: collision with root package name */
    private final String f14307e;

    /* renamed from: f, reason: collision with root package name */
    private final String f14308f;

    /* renamed from: g, reason: collision with root package name */
    private final String f14309g;

    /* renamed from: h, reason: collision with root package name */
    private final int f14310h;

    /* renamed from: i, reason: collision with root package name */
    private final String f14311i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f14302j = new a(null);
    public static final Parcelable.Creator<C1861F> CREATOR = new b();

    /* renamed from: b3.F$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: b3.F$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1861F createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C1861F(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C1861F[] newArray(int i8) {
            return new C1861F[i8];
        }
    }

    public C1861F(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i8, String str) {
        AbstractC3159y.i(sourceId, "sourceId");
        AbstractC3159y.i(sdkAppId, "sdkAppId");
        AbstractC3159y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3159y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3159y.i(deviceData, "deviceData");
        AbstractC3159y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3159y.i(messageVersion, "messageVersion");
        this.f14303a = sourceId;
        this.f14304b = sdkAppId;
        this.f14305c = sdkReferenceNumber;
        this.f14306d = sdkTransactionId;
        this.f14307e = deviceData;
        this.f14308f = sdkEphemeralPublicKey;
        this.f14309g = messageVersion;
        this.f14310h = i8;
        this.f14311i = str;
    }

    private final JSONObject c() {
        Object b8;
        try {
            s.a aVar = L5.s.f6511b;
            b8 = L5.s.b(new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) AbstractC1246t.p("01", "02", "03", "04", "05"))));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (L5.s.g(b8)) {
            b8 = jSONObject;
        }
        return (JSONObject) b8;
    }

    public final /* synthetic */ JSONObject b() {
        Object b8;
        try {
            s.a aVar = L5.s.f6511b;
            b8 = L5.s.b(new JSONObject().put("sdkAppID", this.f14304b).put("sdkTransID", this.f14306d).put("sdkEncData", this.f14307e).put("sdkEphemPubKey", new JSONObject(this.f14308f)).put("sdkMaxTimeout", g6.n.e0(String.valueOf(this.f14310h), 2, '0')).put("sdkReferenceNumber", this.f14305c).put("messageVersion", this.f14309g).put("deviceRenderOptions", c()));
        } catch (Throwable th) {
            s.a aVar2 = L5.s.f6511b;
            b8 = L5.s.b(L5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (L5.s.g(b8)) {
            b8 = jSONObject;
        }
        return (JSONObject) b8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1861F)) {
            return false;
        }
        C1861F c1861f = (C1861F) obj;
        if (AbstractC3159y.d(this.f14303a, c1861f.f14303a) && AbstractC3159y.d(this.f14304b, c1861f.f14304b) && AbstractC3159y.d(this.f14305c, c1861f.f14305c) && AbstractC3159y.d(this.f14306d, c1861f.f14306d) && AbstractC3159y.d(this.f14307e, c1861f.f14307e) && AbstractC3159y.d(this.f14308f, c1861f.f14308f) && AbstractC3159y.d(this.f14309g, c1861f.f14309g) && this.f14310h == c1861f.f14310h && AbstractC3159y.d(this.f14311i, c1861f.f14311i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f14303a.hashCode() * 31) + this.f14304b.hashCode()) * 31) + this.f14305c.hashCode()) * 31) + this.f14306d.hashCode()) * 31) + this.f14307e.hashCode()) * 31) + this.f14308f.hashCode()) * 31) + this.f14309g.hashCode()) * 31) + this.f14310h) * 31;
        String str = this.f14311i;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.f14303a + ", sdkAppId=" + this.f14304b + ", sdkReferenceNumber=" + this.f14305c + ", sdkTransactionId=" + this.f14306d + ", deviceData=" + this.f14307e + ", sdkEphemeralPublicKey=" + this.f14308f + ", messageVersion=" + this.f14309g + ", maxTimeout=" + this.f14310h + ", returnUrl=" + this.f14311i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f14303a);
        out.writeString(this.f14304b);
        out.writeString(this.f14305c);
        out.writeString(this.f14306d);
        out.writeString(this.f14307e);
        out.writeString(this.f14308f);
        out.writeString(this.f14309g);
        out.writeInt(this.f14310h);
        out.writeString(this.f14311i);
    }

    @Override // b3.InterfaceC1863H
    public Map y() {
        Map map;
        Map k8 = Q.k(L5.x.a("source", this.f14303a), L5.x.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, b().toString()));
        String str = this.f14311i;
        if (str != null) {
            map = Q.e(L5.x.a("fallback_return_url", str));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k8, map);
    }
}
