package X4;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class z implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12741a;

    /* renamed from: b, reason: collision with root package name */
    private long f12742b;

    /* renamed from: c, reason: collision with root package name */
    private String f12743c;

    /* renamed from: d, reason: collision with root package name */
    private long f12744d;

    /* renamed from: e, reason: collision with root package name */
    private String f12745e;

    /* renamed from: f, reason: collision with root package name */
    private String f12746f;

    /* renamed from: g, reason: collision with root package name */
    private String f12747g;

    /* renamed from: h, reason: collision with root package name */
    public static final b f12740h = new b(null);
    public static Parcelable.Creator<z> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
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
            AbstractC3159y.i(sJson, "sJson");
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
                            zVar.n(jSONObject2.getString("fileID"));
                        }
                        if (!jSONObject2.isNull("version")) {
                            zVar.I(jSONObject2.getString("version"));
                        }
                        if (!jSONObject2.isNull("versionCode")) {
                            zVar.G(jSONObject2.getLong("versionCode"));
                        }
                        if (!jSONObject2.isNull("sizeInBytes")) {
                            zVar.z(jSONObject2.getLong("sizeInBytes"));
                        }
                        if (!jSONObject2.isNull("minSDKVersion")) {
                            zVar.u(jSONObject2.getString("minSDKVersion"));
                        }
                        if (!jSONObject2.isNull("lastUpdate")) {
                            zVar.s(jSONObject2.getString("lastUpdate"));
                        }
                        if (!jSONObject2.isNull("fileType")) {
                            zVar.o(jSONObject2.getString("fileType"));
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

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public z() {
        this.f12742b = -1L;
        this.f12744d = -1L;
    }

    public final void G(long j8) {
        this.f12744d = j8;
    }

    public final void I(String str) {
        this.f12741a = str;
    }

    public final String b() {
        return this.f12747g;
    }

    public final String c() {
        return this.f12746f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12743c;
    }

    public final String f() {
        return this.f12745e;
    }

    public final long i() {
        return this.f12742b;
    }

    public final long j() {
        return this.f12744d;
    }

    public final String k() {
        return this.f12741a;
    }

    public final void n(String str) {
        this.f12747g = str;
    }

    public final void o(String str) {
        this.f12746f = str;
    }

    public final void s(String str) {
        this.f12743c = str;
    }

    public final void u(String str) {
        this.f12745e = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12741a);
        parcel.writeString(this.f12743c);
        parcel.writeLong(this.f12744d);
        parcel.writeString(this.f12745e);
        parcel.writeString(this.f12746f);
        parcel.writeString(this.f12747g);
        parcel.writeLong(this.f12742b);
    }

    public final void z(long j8) {
        this.f12742b = j8;
    }

    public z(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12742b = -1L;
        this.f12744d = -1L;
        this.f12741a = source.readString();
        this.f12743c = source.readString();
        this.f12744d = source.readLong();
        this.f12745e = source.readString();
        this.f12746f = source.readString();
        this.f12747g = source.readString();
        this.f12742b = source.readLong();
    }
}
