package e3;

import L5.x;
import M5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2582d implements v2.f {

    /* renamed from: a, reason: collision with root package name */
    private final String f30234a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30235b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30236c;

    /* renamed from: d, reason: collision with root package name */
    private final long f30237d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f30232e = new a(null);
    public static final Parcelable.Creator<C2582d> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final long f30233f = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: e3.d$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: e3.d$b */
    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2582d createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new C2582d(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2582d[] newArray(int i8) {
            return new C2582d[i8];
        }
    }

    public C2582d(String guid, String muid, String sid, long j8) {
        AbstractC3159y.i(guid, "guid");
        AbstractC3159y.i(muid, "muid");
        AbstractC3159y.i(sid, "sid");
        this.f30234a = guid;
        this.f30235b = muid;
        this.f30236c = sid;
        this.f30237d = j8;
    }

    public final String b() {
        return this.f30234a;
    }

    public final String c() {
        return this.f30235b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Map e() {
        return Q.k(x.a("guid", this.f30234a), x.a("muid", this.f30235b), x.a("sid", this.f30236c));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2582d)) {
            return false;
        }
        C2582d c2582d = (C2582d) obj;
        if (AbstractC3159y.d(this.f30234a, c2582d.f30234a) && AbstractC3159y.d(this.f30235b, c2582d.f30235b) && AbstractC3159y.d(this.f30236c, c2582d.f30236c) && this.f30237d == c2582d.f30237d) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f30236c;
    }

    public int hashCode() {
        return (((((this.f30234a.hashCode() * 31) + this.f30235b.hashCode()) * 31) + this.f30236c.hashCode()) * 31) + androidx.collection.a.a(this.f30237d);
    }

    public final boolean i(long j8) {
        if (j8 - this.f30237d > f30233f) {
            return true;
        }
        return false;
    }

    public final JSONObject j() {
        JSONObject put = new JSONObject().put("guid", this.f30234a).put("muid", this.f30235b).put("sid", this.f30236c).put(CampaignEx.JSON_KEY_TIMESTAMP, this.f30237d);
        AbstractC3159y.h(put, "put(...)");
        return put;
    }

    public String toString() {
        return "FraudDetectionData(guid=" + this.f30234a + ", muid=" + this.f30235b + ", sid=" + this.f30236c + ", timestamp=" + this.f30237d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3159y.i(out, "out");
        out.writeString(this.f30234a);
        out.writeString(this.f30235b);
        out.writeString(this.f30236c);
        out.writeLong(this.f30237d);
    }
}
