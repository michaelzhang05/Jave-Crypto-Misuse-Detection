package X4;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class H implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private String f12368a;

    /* renamed from: b, reason: collision with root package name */
    private int f12369b;

    /* renamed from: c, reason: collision with root package name */
    private int f12370c;

    /* renamed from: d, reason: collision with root package name */
    private String f12371d;

    /* renamed from: e, reason: collision with root package name */
    private ArrayList f12372e;

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        private a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public H createFromParcel(Parcel parcel) {
            AbstractC3159y.i(parcel, "parcel");
            return new H(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public H[] newArray(int i8) {
            return new H[i8];
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public H() {
    }

    public final void b(JSONObject jsonObject) {
        AbstractC3159y.i(jsonObject, "jsonObject");
        if (!jsonObject.isNull("sha256")) {
            this.f12368a = jsonObject.getString("sha256");
        }
        if (!jsonObject.isNull("scans")) {
            this.f12369b = jsonObject.getInt("scans");
        }
        if (!jsonObject.isNull("positives")) {
            this.f12370c = jsonObject.getInt("positives");
        }
        if (!jsonObject.isNull("lastAnalysis")) {
            this.f12371d = jsonObject.getString("lastAnalysis");
        }
        if (!jsonObject.isNull("infections")) {
            this.f12372e = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("infections");
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                C1508s c1508s = new C1508s();
                c1508s.b(jSONArray.getJSONObject(i8));
                ArrayList arrayList = this.f12372e;
                AbstractC3159y.f(arrayList);
                arrayList.add(c1508s);
            }
        }
    }

    public final ArrayList c() {
        return this.f12372e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f12371d;
    }

    public final int f() {
        return this.f12370c;
    }

    public final int i() {
        return this.f12369b;
    }

    public final String j() {
        return this.f12368a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12368a);
        parcel.writeInt(this.f12369b);
        parcel.writeInt(this.f12370c);
        parcel.writeString(this.f12371d);
        parcel.writeList(this.f12372e);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public H(Parcel parcel) {
        this();
        AbstractC3159y.i(parcel, "parcel");
        this.f12368a = parcel.readString();
        this.f12369b = parcel.readInt();
        this.f12370c = parcel.readInt();
        this.f12371d = parcel.readString();
        ArrayList arrayList = this.f12372e;
        if (arrayList == null || arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            this.f12372e = arrayList2;
            AbstractC3159y.f(arrayList2);
            parcel.readList(arrayList2, C1508s.class.getClassLoader());
        }
    }
}
