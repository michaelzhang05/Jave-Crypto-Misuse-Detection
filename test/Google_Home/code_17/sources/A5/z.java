package a5;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class z implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f14362a;

    /* renamed from: b, reason: collision with root package name */
    private long f14363b;

    /* renamed from: c, reason: collision with root package name */
    private String f14364c;

    /* renamed from: d, reason: collision with root package name */
    private long f14365d;

    /* renamed from: e, reason: collision with root package name */
    private String f14366e;

    /* renamed from: f, reason: collision with root package name */
    private String f14367f;

    /* renamed from: g, reason: collision with root package name */
    private String f14368g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f14361h = new b(null);
    public static Parcelable.Creator<z> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new z(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z[] newArray(int i8) {
            return new z[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final ArrayList a(String sJson) {
            int i8;
            JSONArray jSONArray;
            AbstractC3255y.i(sJson, "sJson");
            ArrayList arrayList = null;
            try {
                JSONObject jSONObject = new JSONObject(sJson);
                if (!jSONObject.isNull("success")) {
                    i8 = jSONObject.optInt("success", 0);
                } else {
                    i8 = 1;
                }
                if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    jSONArray = jSONObject.optJSONArray(DataSchemeDataSource.SCHEME_DATA);
                } else {
                    jSONArray = null;
                }
                if (i8 != 1 || jSONArray == null) {
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                try {
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        z zVar = new z();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                        if (!jSONObject2.isNull("fileID")) {
                            zVar.s(jSONObject2.getString("fileID"));
                        }
                        if (!jSONObject2.isNull("version")) {
                            zVar.z(jSONObject2.getString("version"));
                        }
                        if (!jSONObject2.isNull("versionCode")) {
                            zVar.y(jSONObject2.getLong("versionCode"));
                        }
                        if (!jSONObject2.isNull("sizeInBytes")) {
                            zVar.x(jSONObject2.getLong("sizeInBytes"));
                        }
                        if (!jSONObject2.isNull("minSDKVersion")) {
                            zVar.w(jSONObject2.getString("minSDKVersion"));
                        }
                        if (!jSONObject2.isNull("lastUpdate")) {
                            zVar.v(jSONObject2.getString("lastUpdate"));
                        }
                        if (!jSONObject2.isNull("fileType")) {
                            zVar.u(jSONObject2.getString("fileType"));
                        }
                        arrayList2.add(zVar);
                    }
                    return arrayList2;
                } catch (Exception e8) {
                    arrayList = arrayList2;
                    e = e8;
                    e.printStackTrace();
                    return arrayList;
                }
            } catch (Exception e9) {
                e = e9;
            }
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public z() {
        this.f14363b = -1L;
        this.f14365d = -1L;
    }

    public final String a() {
        return this.f14368g;
    }

    public final String b() {
        return this.f14367f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String g() {
        return this.f14364c;
    }

    public final String h() {
        return this.f14366e;
    }

    public final long i() {
        return this.f14363b;
    }

    public final long l() {
        return this.f14365d;
    }

    public final String p() {
        return this.f14362a;
    }

    public final void s(String str) {
        this.f14368g = str;
    }

    public final void u(String str) {
        this.f14367f = str;
    }

    public final void v(String str) {
        this.f14364c = str;
    }

    public final void w(String str) {
        this.f14366e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f14362a);
        parcel.writeString(this.f14364c);
        parcel.writeLong(this.f14365d);
        parcel.writeString(this.f14366e);
        parcel.writeString(this.f14367f);
        parcel.writeString(this.f14368g);
        parcel.writeLong(this.f14363b);
    }

    public final void x(long j8) {
        this.f14363b = j8;
    }

    public final void y(long j8) {
        this.f14365d = j8;
    }

    public final void z(String str) {
        this.f14362a = str;
    }

    public z(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14363b = -1L;
        this.f14365d = -1L;
        this.f14362a = source.readString();
        this.f14364c = source.readString();
        this.f14365d = source.readLong();
        this.f14366e = source.readString();
        this.f14367f = source.readString();
        this.f14368g = source.readString();
        this.f14363b = source.readLong();
    }
}
