package b4;

import P5.AbstractC1378t;
import P5.N;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import g6.i;
import g6.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f15442a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15443b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15444c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f15445d;

    /* renamed from: e, reason: collision with root package name */
    public static final a f15440e = new a(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: f, reason: collision with root package name */
    private static final List f15441f = AbstractC1378t.m();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        private final e a(JSONObject jSONObject) {
            String optString = jSONObject.optString("name");
            if (optString.length() <= 64) {
                String optString2 = jSONObject.optString("id");
                if (optString2.length() <= 64) {
                    HashMap hashMap = new HashMap();
                    JSONObject optJSONObject = jSONObject.optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (optJSONObject != null) {
                        Iterator<String> keys = optJSONObject.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            String optString3 = optJSONObject.optString(next);
                            if (optString3.length() <= 8059) {
                                AbstractC3255y.f(next);
                                AbstractC3255y.f(optString3);
                                hashMap.put(next, optString3);
                            } else {
                                throw c.f15417d.a("messageExtension.data.value");
                            }
                        }
                    }
                    AbstractC3255y.f(optString);
                    AbstractC3255y.f(optString2);
                    return new e(optString, optString2, jSONObject.optBoolean("criticalityIndicator"), hashMap);
                }
                throw c.f15417d.a("messageExtension.id");
            }
            throw c.f15417d.a("messageExtension.name");
        }

        public final List b(JSONArray jSONArray) {
            if (jSONArray == null) {
                return null;
            }
            i s8 = m.s(0, jSONArray.length());
            ArrayList arrayList = new ArrayList();
            Iterator it = s8.iterator();
            while (it.hasNext()) {
                JSONObject optJSONObject = jSONArray.optJSONObject(((N) it).nextInt());
                if (optJSONObject != null) {
                    arrayList.add(optJSONObject);
                }
            }
            ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(e.f15440e.a((JSONObject) it2.next()));
            }
            if (arrayList2.size() <= 10) {
                return arrayList2;
            }
            throw c.f15417d.a("messageExtensions");
        }

        public final JSONArray c(List list) {
            if (list == null) {
                return null;
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((e) it.next()).g());
            }
            return jSONArray;
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e createFromParcel(Parcel parcel) {
            boolean z8;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt);
            for (int i8 = 0; i8 != readInt; i8++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new e(readString, readString2, z8, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e[] newArray(int i8) {
            return new e[i8];
        }
    }

    public e(String name, String id, boolean z8, Map data) {
        AbstractC3255y.i(name, "name");
        AbstractC3255y.i(id, "id");
        AbstractC3255y.i(data, "data");
        this.f15442a = name;
        this.f15443b = id;
        this.f15444c = z8;
        this.f15445d = data;
    }

    public final boolean a() {
        return this.f15444c;
    }

    public final boolean b() {
        return f15441f.contains(this.f15442a);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3255y.d(this.f15442a, eVar.f15442a) && AbstractC3255y.d(this.f15443b, eVar.f15443b) && this.f15444c == eVar.f15444c && AbstractC3255y.d(this.f15445d, eVar.f15445d)) {
            return true;
        }
        return false;
    }

    public final JSONObject g() {
        JSONObject put = new JSONObject().put("name", this.f15442a).put("id", this.f15443b).put("criticalityIndicator", this.f15444c).put(DataSchemeDataSource.SCHEME_DATA, new JSONObject(this.f15445d));
        AbstractC3255y.h(put, "put(...)");
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((this.f15442a.hashCode() * 31) + this.f15443b.hashCode()) * 31;
        boolean z8 = this.f15444c;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        return ((hashCode + i8) * 31) + this.f15445d.hashCode();
    }

    public String toString() {
        return "MessageExtension(name=" + this.f15442a + ", id=" + this.f15443b + ", criticalityIndicator=" + this.f15444c + ", data=" + this.f15445d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f15442a);
        out.writeString(this.f15443b);
        out.writeInt(this.f15444c ? 1 : 0);
        Map map = this.f15445d;
        out.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            out.writeString((String) entry.getKey());
            out.writeString((String) entry.getValue());
        }
    }
}
