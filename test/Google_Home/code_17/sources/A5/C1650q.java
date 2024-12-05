package a5;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a5.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1650q implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f14324a;

    /* renamed from: b, reason: collision with root package name */
    private String f14325b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f14323c = new b(null);
    public static Parcelable.Creator<C1650q> CREATOR = new a();

    /* renamed from: a5.q$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1650q createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new C1650q(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1650q[] newArray(int i8) {
            return new C1650q[i8];
        }
    }

    /* renamed from: a5.q$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final ArrayList a(String faqsJson) {
            int i8;
            JSONArray jSONArray;
            AbstractC3255y.i(faqsJson, "faqsJson");
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
                        C1650q c1650q = new C1650q();
                        AbstractC3255y.h(jsonObjectRelatedPost, "jsonObjectRelatedPost");
                        c1650q.g(jsonObjectRelatedPost);
                        arrayList.add(c1650q);
                    }
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

    public C1650q() {
    }

    public final String a() {
        return this.f14325b;
    }

    public final String b() {
        return this.f14324a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void g(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        try {
            if (!jsonObject.isNull("question")) {
                this.f14324a = jsonObject.getString("question");
            }
            if (!jsonObject.isNull("answer")) {
                this.f14325b = jsonObject.getString("answer");
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f14324a);
        parcel.writeString(this.f14325b);
    }

    public C1650q(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14324a = source.readString();
        this.f14325b = source.readString();
    }
}
