package h3;

import O5.x;
import P5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* renamed from: h3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2902d implements y2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f32155a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32156b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32157c;

    /* renamed from: d, reason: collision with root package name */
    private final long f32158d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f32153e = new a(null);
    public static final Parcelable.Creator<C2902d> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final long f32154f = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: h3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: h3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2902d createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new C2902d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2902d[] newArray(int i8) {
            return new C2902d[i8];
        }
    }

    public C2902d(String guid, String muid, String sid, long j8) {
        AbstractC3255y.i(guid, "guid");
        AbstractC3255y.i(muid, "muid");
        AbstractC3255y.i(sid, "sid");
        this.f32155a = guid;
        this.f32156b = muid;
        this.f32157c = sid;
        this.f32158d = j8;
    }

    public final String a() {
        return this.f32155a;
    }

    public final String b() {
        return this.f32156b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2902d)) {
            return false;
        }
        C2902d c2902d = (C2902d) obj;
        if (AbstractC3255y.d(this.f32155a, c2902d.f32155a) && AbstractC3255y.d(this.f32156b, c2902d.f32156b) && AbstractC3255y.d(this.f32157c, c2902d.f32157c) && this.f32158d == c2902d.f32158d) {
            return true;
        }
        return false;
    }

    public final Map g() {
        return Q.k(x.a("guid", this.f32155a), x.a("muid", this.f32156b), x.a("sid", this.f32157c));
    }

    public final String h() {
        return this.f32157c;
    }

    public int hashCode() {
        return (((((this.f32155a.hashCode() * 31) + this.f32156b.hashCode()) * 31) + this.f32157c.hashCode()) * 31) + androidx.collection.a.a(this.f32158d);
    }

    public final boolean i(long j8) {
        if (j8 - this.f32158d > f32154f) {
            return true;
        }
        return false;
    }

    public final JSONObject l() {
        JSONObject put = new JSONObject().put("guid", this.f32155a).put("muid", this.f32156b).put("sid", this.f32157c).put(CampaignEx.JSON_KEY_TIMESTAMP, this.f32158d);
        AbstractC3255y.h(put, "put(...)");
        return put;
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.f32155a + ", muid=" + this.f32156b + ", sid=" + this.f32157c + ", timestamp=" + this.f32158d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f32155a);
        out.writeString(this.f32156b);
        out.writeString(this.f32157c);
        out.writeLong(this.f32158d);
    }
}
