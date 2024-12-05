package e3;

import O5.s;
import P5.AbstractC1378t;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.MBridgeConstans;
import java.util.Collection;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: e3.F, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2782F implements InterfaceC2784H, Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f31309a;

    /* renamed from: b, reason: collision with root package name */
    private final String f31310b;

    /* renamed from: c, reason: collision with root package name */
    private final String f31311c;

    /* renamed from: d, reason: collision with root package name */
    private final String f31312d;

    /* renamed from: e, reason: collision with root package name */
    private final String f31313e;

    /* renamed from: f, reason: collision with root package name */
    private final String f31314f;

    /* renamed from: g, reason: collision with root package name */
    private final String f31315g;

    /* renamed from: h, reason: collision with root package name */
    private final int f31316h;

    /* renamed from: i, reason: collision with root package name */
    private final String f31317i;

    /* renamed from: j, reason: collision with root package name */
    public static final a f31308j = new a(null);
    public static final Parcelable.Creator<C2782F> CREATOR = new b();

    /* renamed from: e3.F$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: e3.F$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2782F createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2782F(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2782F[] newArray(int i8) {
            return new C2782F[i8];
        }
    }

    public C2782F(String sourceId, String sdkAppId, String sdkReferenceNumber, String sdkTransactionId, String deviceData, String sdkEphemeralPublicKey, String messageVersion, int i8, String str) {
        AbstractC3255y.i(sourceId, "sourceId");
        AbstractC3255y.i(sdkAppId, "sdkAppId");
        AbstractC3255y.i(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC3255y.i(sdkTransactionId, "sdkTransactionId");
        AbstractC3255y.i(deviceData, "deviceData");
        AbstractC3255y.i(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC3255y.i(messageVersion, "messageVersion");
        this.f31309a = sourceId;
        this.f31310b = sdkAppId;
        this.f31311c = sdkReferenceNumber;
        this.f31312d = sdkTransactionId;
        this.f31313e = deviceData;
        this.f31314f = sdkEphemeralPublicKey;
        this.f31315g = messageVersion;
        this.f31316h = i8;
        this.f31317i = str;
    }

    private final JSONObject b() {
        Object b8;
        try {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b(new JSONObject().put("sdkInterface", "03").put("sdkUiType", new JSONArray((Collection) AbstractC1378t.p("01", "02", "03", "04", "05"))));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (O5.s.g(b8)) {
            b8 = jSONObject;
        }
        return (JSONObject) b8;
    }

    @Override // e3.InterfaceC2784H
    public Map B() {
        Map map;
        Map k8 = Q.k(O5.x.a("source", this.f31309a), O5.x.a(MBridgeConstans.DYNAMIC_VIEW_WX_APP, a().toString()));
        String str = this.f31317i;
        if (str != null) {
            map = Q.e(O5.x.a("fallback_return_url", str));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        return Q.q(k8, map);
    }

    public final /* synthetic */ JSONObject a() {
        Object b8;
        try {
            s.a aVar = O5.s.f8302b;
            b8 = O5.s.b(new JSONObject().put("sdkAppID", this.f31310b).put("sdkTransID", this.f31312d).put("sdkEncData", this.f31313e).put("sdkEphemPubKey", new JSONObject(this.f31314f)).put("sdkMaxTimeout", j6.n.e0(String.valueOf(this.f31316h), 2, '0')).put("sdkReferenceNumber", this.f31311c).put("messageVersion", this.f31315g).put("deviceRenderOptions", b()));
        } catch (Throwable th) {
            s.a aVar2 = O5.s.f8302b;
            b8 = O5.s.b(O5.t.a(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (O5.s.g(b8)) {
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
        if (!(obj instanceof C2782F)) {
            return false;
        }
        C2782F c2782f = (C2782F) obj;
        if (AbstractC3255y.d(this.f31309a, c2782f.f31309a) && AbstractC3255y.d(this.f31310b, c2782f.f31310b) && AbstractC3255y.d(this.f31311c, c2782f.f31311c) && AbstractC3255y.d(this.f31312d, c2782f.f31312d) && AbstractC3255y.d(this.f31313e, c2782f.f31313e) && AbstractC3255y.d(this.f31314f, c2782f.f31314f) && AbstractC3255y.d(this.f31315g, c2782f.f31315g) && this.f31316h == c2782f.f31316h && AbstractC3255y.d(this.f31317i, c2782f.f31317i)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((this.f31309a.hashCode() * 31) + this.f31310b.hashCode()) * 31) + this.f31311c.hashCode()) * 31) + this.f31312d.hashCode()) * 31) + this.f31313e.hashCode()) * 31) + this.f31314f.hashCode()) * 31) + this.f31315g.hashCode()) * 31) + this.f31316h) * 31;
        String str = this.f31317i;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "Stripe3ds2AuthParams(sourceId=" + this.f31309a + ", sdkAppId=" + this.f31310b + ", sdkReferenceNumber=" + this.f31311c + ", sdkTransactionId=" + this.f31312d + ", deviceData=" + this.f31313e + ", sdkEphemeralPublicKey=" + this.f31314f + ", messageVersion=" + this.f31315g + ", maxTimeout=" + this.f31316h + ", returnUrl=" + this.f31317i + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f31309a);
        out.writeString(this.f31310b);
        out.writeString(this.f31311c);
        out.writeString(this.f31312d);
        out.writeString(this.f31313e);
        out.writeString(this.f31314f);
        out.writeString(this.f31315g);
        out.writeInt(this.f31316h);
        out.writeString(this.f31317i);
    }
}
