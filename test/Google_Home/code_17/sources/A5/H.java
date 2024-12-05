package a5;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class H implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f13989a;

    /* renamed from: b, reason: collision with root package name */
    private int f13990b;

    /* renamed from: c, reason: collision with root package name */
    private int f13991c;

    /* renamed from: d, reason: collision with root package name */
    private String f13992d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f13993e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new H(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public H[] newArray(int i8) {
            return new H[i8];
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public H() {
    }

    public final void a(JSONObject jsonObject) {
        AbstractC3255y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("sha256")) {
            this.f13989a = jsonObject.getString("sha256");
        }
        if (!jsonObject.isNull("scans")) {
            this.f13990b = jsonObject.getInt("scans");
        }
        if (!jsonObject.isNull("positives")) {
            this.f13991c = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("lastAnalysis")) {
            this.f13992d = jsonObject.getString("lastAnalysis");
        }
        if (!jsonObject.isNull("infections")) {
            this.f13993e = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("infections");
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C1651s c1651s = new C1651s();
                c1651s.a(jSONArray.getJSONObject(i8));
                ArrayList arrayList = this.f13993e;
                AbstractC3255y.f(arrayList);
                arrayList.add(c1651s);
            }
        }
    }

    public final ArrayList b() {
        return this.f13993e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String g() {
        return this.f13992d;
    }

    public final int h() {
        return this.f13991c;
    }

    public final int i() {
        return this.f13990b;
    }

    public final String l() {
        return this.f13989a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f13989a);
        parcel.writeInt(this.f13990b);
        parcel.writeInt(this.f13991c);
        parcel.writeString(this.f13992d);
        parcel.writeList(this.f13993e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(Parcel parcel) {
        this();
        AbstractC3255y.i(parcel, "parcel");
        this.f13989a = parcel.readString();
        this.f13990b = parcel.readInt();
        this.f13991c = parcel.readInt();
        this.f13992d = parcel.readString();
        ArrayList arrayList = this.f13993e;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f13993e = arrayList2;
            AbstractC3255y.f(arrayList2);
            parcel.readList(arrayList2, C1651s.class.getClassLoader());
        }
    }
}
