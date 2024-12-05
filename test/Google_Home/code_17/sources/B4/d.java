package b4;

import a4.q;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class d implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final String f15422a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15423b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15424c;

    /* renamed from: d, reason: collision with root package name */
    private final String f15425d;

    /* renamed from: e, reason: collision with root package name */
    private final c f15426e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15427f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15428g;

    /* renamed from: h, reason: collision with root package name */
    private final String f15429h;

    /* renamed from: i, reason: collision with root package name */
    private final String f15430i;

    /* renamed from: j, reason: collision with root package name */
    private final q f15431j;

    /* renamed from: k, reason: collision with root package name */
    public static final a f15421k = new a(null);
    public static final Parcelable.Creator<d> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final d a(JSONObject payload) {
            q qVar;
            AbstractC3255y.i(payload, "payload");
            String optString = payload.optString("threeDSServerTransID");
            String optString2 = payload.optString("acsTransID");
            String optString3 = payload.optString("dsTransID");
            String optString4 = payload.optString("errorCode");
            AbstractC3255y.h(optString4, "optString(...)");
            c a8 = c.f15432b.a(payload.optString("errorComponent"));
            String optString5 = payload.optString("errorDescription");
            AbstractC3255y.h(optString5, "optString(...)");
            String optString6 = payload.optString("errorDetail");
            AbstractC3255y.h(optString6, "optString(...)");
            String optString7 = payload.optString("errorMessageType");
            String optString8 = payload.optString("messageVersion");
            AbstractC3255y.h(optString8, "optString(...)");
            String optString9 = payload.optString("sdkTransID");
            if (optString9 != null) {
                qVar = new q(optString9);
            } else {
                qVar = null;
            }
            return new d(optString, optString2, optString3, optString4, a8, optString5, optString6, optString7, optString8, qVar);
        }

        public final boolean b(JSONObject payload) {
            AbstractC3255y.i(payload, "payload");
            return AbstractC3255y.d("Erro", payload.optString("messageType"));
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d createFromParcel(Parcel parcel) {
            c valueOf;
            AbstractC3255y.i(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            q qVar = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = c.valueOf(parcel.readString());
            }
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            if (parcel.readInt() != 0) {
                qVar = q.CREATOR.createFromParcel(parcel);
            }
            return new d(readString, readString2, readString3, readString4, valueOf, readString5, readString6, readString7, readString8, qVar);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final d[] newArray(int i8) {
            return new d[i8];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: b, reason: collision with root package name */
        public static final a f15432b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f15433c = new c("ThreeDsSdk", 0, "C");

        /* renamed from: d, reason: collision with root package name */
        public static final c f15434d = new c("ThreeDsServer", 1, ExifInterface.LATITUDE_SOUTH);

        /* renamed from: e, reason: collision with root package name */
        public static final c f15435e = new c("DirectoryServer", 2, "D");

        /* renamed from: f, reason: collision with root package name */
        public static final c f15436f = new c("Acs", 3, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ c[] f15437g;

        /* renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ U5.a f15438h;

        /* renamed from: a, reason: collision with root package name */
        private final String f15439a;

        /* loaded from: classes4.dex */
        public static final class a {
            private a() {
            }

            public final c a(String str) {
                Object obj;
                Iterator<E> it = c.c().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (AbstractC3255y.d(((c) obj).b(), str)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                return (c) obj;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        static {
            c[] a8 = a();
            f15437g = a8;
            f15438h = U5.b.a(a8);
            f15432b = new a(null);
        }

        private c(String str, int i8, String str2) {
            this.f15439a = str2;
        }

        private static final /* synthetic */ c[] a() {
            return new c[]{f15433c, f15434d, f15435e, f15436f};
        }

        public static U5.a c() {
            return f15438h;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) f15437g.clone();
        }

        public final String b() {
            return this.f15439a;
        }
    }

    public d(String str, String str2, String str3, String errorCode, c cVar, String errorDescription, String errorDetail, String str4, String messageVersion, q qVar) {
        AbstractC3255y.i(errorCode, "errorCode");
        AbstractC3255y.i(errorDescription, "errorDescription");
        AbstractC3255y.i(errorDetail, "errorDetail");
        AbstractC3255y.i(messageVersion, "messageVersion");
        this.f15422a = str;
        this.f15423b = str2;
        this.f15424c = str3;
        this.f15425d = errorCode;
        this.f15426e = cVar;
        this.f15427f = errorDescription;
        this.f15428g = errorDetail;
        this.f15429h = str4;
        this.f15430i = messageVersion;
        this.f15431j = qVar;
    }

    public final JSONObject a() {
        JSONObject put = new JSONObject().put("messageType", "Erro").put("messageVersion", this.f15430i).put("sdkTransID", this.f15431j).put("errorCode", this.f15425d).put("errorDescription", this.f15427f).put("errorDetail", this.f15428g);
        String str = this.f15422a;
        if (str != null) {
            put.put("threeDSServerTransID", str);
        }
        String str2 = this.f15423b;
        if (str2 != null) {
            put.put("acsTransID", str2);
        }
        String str3 = this.f15424c;
        if (str3 != null) {
            put.put("dsTransID", str3);
        }
        c cVar = this.f15426e;
        if (cVar != null) {
            put.put("errorComponent", cVar.b());
        }
        String str4 = this.f15429h;
        if (str4 != null) {
            put.put("errorMessageType", str4);
        }
        AbstractC3255y.f(put);
        return put;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f15422a, dVar.f15422a) && AbstractC3255y.d(this.f15423b, dVar.f15423b) && AbstractC3255y.d(this.f15424c, dVar.f15424c) && AbstractC3255y.d(this.f15425d, dVar.f15425d) && this.f15426e == dVar.f15426e && AbstractC3255y.d(this.f15427f, dVar.f15427f) && AbstractC3255y.d(this.f15428g, dVar.f15428g) && AbstractC3255y.d(this.f15429h, dVar.f15429h) && AbstractC3255y.d(this.f15430i, dVar.f15430i) && AbstractC3255y.d(this.f15431j, dVar.f15431j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        String str = this.f15422a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f15423b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f15424c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode6 = (((i10 + hashCode3) * 31) + this.f15425d.hashCode()) * 31;
        c cVar = this.f15426e;
        if (cVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = cVar.hashCode();
        }
        int hashCode7 = (((((hashCode6 + hashCode4) * 31) + this.f15427f.hashCode()) * 31) + this.f15428g.hashCode()) * 31;
        String str4 = this.f15429h;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int hashCode8 = (((hashCode7 + hashCode5) * 31) + this.f15430i.hashCode()) * 31;
        q qVar = this.f15431j;
        if (qVar != null) {
            i8 = qVar.hashCode();
        }
        return hashCode8 + i8;
    }

    public String toString() {
        return "ErrorData(serverTransId=" + this.f15422a + ", acsTransId=" + this.f15423b + ", dsTransId=" + this.f15424c + ", errorCode=" + this.f15425d + ", errorComponent=" + this.f15426e + ", errorDescription=" + this.f15427f + ", errorDetail=" + this.f15428g + ", errorMessageType=" + this.f15429h + ", messageVersion=" + this.f15430i + ", sdkTransId=" + this.f15431j + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f15422a);
        out.writeString(this.f15423b);
        out.writeString(this.f15424c);
        out.writeString(this.f15425d);
        c cVar = this.f15426e;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(cVar.name());
        }
        out.writeString(this.f15427f);
        out.writeString(this.f15428g);
        out.writeString(this.f15429h);
        out.writeString(this.f15430i);
        q qVar = this.f15431j;
        if (qVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            qVar.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, c cVar, String str5, String str6, String str7, String str8, q qVar, int i8, AbstractC3247p abstractC3247p) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : str3, str4, (i8 & 16) != 0 ? null : cVar, str5, str6, (i8 & 128) != 0 ? null : str7, str8, qVar);
    }
}
