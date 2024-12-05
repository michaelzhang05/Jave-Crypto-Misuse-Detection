package X4;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X4.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1507q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12703a;

    /* renamed from: b, reason: collision with root package name */
    private String f12704b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f12702c = new b(null);
    public static Parcelable.Creator<C1507q> CREATOR = new a();

    /* renamed from: X4.q$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1507q createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1507q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1507q[] newArray(int i8) {
            return new C1507q[i8];
        }
    }

    /* renamed from: X4.q$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final ArrayList a(String faqsJson) {
            int i8;
            JSONArray jSONArray;
            AbstractC3159y.i(faqsJson, "faqsJson");
            ArrayList arrayList = new ArrayList();
            try {
                JSONObject jSONObject = new JSONObject(faqsJson);
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
                    int length = jSONArray.length();
                    for (int i9 = 0; i9 < length; i9++) {
                        JSONObject jsonObjectRelatedPost = jSONArray.getJSONObject(i9);
                        C1507q c1507q = new C1507q();
                        AbstractC3159y.h(jsonObjectRelatedPost, "jsonObjectRelatedPost");
                        c1507q.e(jsonObjectRelatedPost);
                        arrayList.add(c1507q);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1507q() {
    }

    public final String b() {
        return this.f12704b;
    }

    public final String c() {
        return this.f12703a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void e(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        try {
            if (!jsonObject.isNull("question")) {
                this.f12703a = jsonObject.getString("question");
            }
            if (!jsonObject.isNull("answer")) {
                this.f12704b = jsonObject.getString("answer");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12703a);
        parcel.writeString(this.f12704b);
    }

    public C1507q(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12703a = source.readString();
        this.f12704b = source.readString();
    }
}
