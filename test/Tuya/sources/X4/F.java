package X4;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class F implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12344a;

    /* renamed from: b, reason: collision with root package name */
    private String f12345b;

    /* renamed from: c, reason: collision with root package name */
    private String f12346c;

    /* renamed from: d, reason: collision with root package name */
    private String f12347d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f12343e = new b(null);
    public static Parcelable.Creator<F> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public F createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new F(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public F[] newArray(int i8) {
            return new F[i8];
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
            ArrayList arrayList = new ArrayList();
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
                if (i8 == 1 && jSONArray != null) {
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        int length = jSONArray.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            JSONObject jsonObjectRelatedPost = jSONArray.getJSONObject(i9);
                            F f8 = new F();
                            AbstractC3159y.h(jsonObjectRelatedPost, "jsonObjectRelatedPost");
                            f8.j(jsonObjectRelatedPost);
                            arrayList2.add(f8);
                        }
                        return arrayList2;
                    } catch (Exception e8) {
                        arrayList = arrayList2;
                        e = e8;
                        e.printStackTrace();
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Exception e9) {
                e = e9;
            }
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public F() {
    }

    public final String b() {
        return this.f12346c;
    }

    public final String c() {
        return this.f12345b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        if (this.f12345b != null) {
            return this.f12345b + UptodownApp.f28003B.r() + ":webp";
        }
        return null;
    }

    public final String f() {
        return this.f12347d;
    }

    public final String i() {
        return this.f12344a;
    }

    public final void j(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        try {
            if (!jsonObject.isNull("url")) {
                this.f12344a = jsonObject.getString("url");
            }
            if (!jsonObject.isNull("image")) {
                this.f12345b = jsonObject.getString("image");
            }
            if (!jsonObject.isNull("date")) {
                this.f12346c = jsonObject.getString("date");
            }
            if (!jsonObject.isNull(CampaignEx.JSON_KEY_TITLE)) {
                this.f12347d = jsonObject.getString(CampaignEx.JSON_KEY_TITLE);
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12344a);
        parcel.writeString(this.f12345b);
        parcel.writeString(this.f12346c);
        parcel.writeString(this.f12347d);
    }

    public F(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12344a = source.readString();
        this.f12345b = source.readString();
        this.f12346c = source.readString();
        this.f12347d = source.readString();
    }
}
