package a5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: a5.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1644k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f14256a;

    /* renamed from: b, reason: collision with root package name */
    private String f14257b;

    /* renamed from: c, reason: collision with root package name */
    private String f14258c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f14259d;

    /* renamed from: e, reason: collision with root package name */
    private int f14260e;

    /* renamed from: f, reason: collision with root package name */
    private int f14261f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f14255g = new b(null);
    public static Parcelable.Creator<C1644k> CREATOR = new a();

    /* renamed from: a5.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1644k createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new C1644k(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1644k[] newArray(int i8) {
            return new C1644k[i8];
        }
    }

    /* renamed from: a5.k$b */
    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public static /* synthetic */ ArrayList b(b bVar, String str, int i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = 0;
            }
            return bVar.a(str, i8);
        }

        public final ArrayList a(String json, int i8) {
            AbstractC3255y.i(json, "json");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(json).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jsonObjectTop = jSONArray.getJSONObject(i9);
                C1644k c1644k = new C1644k(0, null, null, 7, null);
                AbstractC3255y.h(jsonObjectTop, "jsonObjectTop");
                c1644k.w(jsonObjectTop, i8);
                arrayList.add(c1644k);
            }
            return arrayList;
        }

        public final ArrayList c(String json) {
            AbstractC3255y.i(json, "json");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(json).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject jsonObjectTop = jSONArray.getJSONObject(i8);
                C1644k c1644k = new C1644k(0, null, null, 7, null);
                AbstractC3255y.h(jsonObjectTop, "jsonObjectTop");
                c1644k.x(jsonObjectTop);
                arrayList.add(c1644k);
            }
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public C1644k(int i8, String str, String str2) {
        this.f14256a = i8;
        this.f14257b = str;
        this.f14258c = str2;
    }

    public final void H(boolean z8) {
        this.f14259d = z8;
    }

    public final void J(int i8) {
        this.f14256a = i8;
    }

    public final void U(String str) {
        this.f14257b = str;
    }

    public final void W(int i8) {
        this.f14260e = i8;
    }

    public final String a() {
        return this.f14258c;
    }

    public final int b() {
        return this.f14256a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final int g() {
        int i8 = this.f14256a;
        if (i8 != 648 && i8 != 567 && i8 != 563) {
            return 20;
        }
        return 12;
    }

    public final String h() {
        return this.f14257b;
    }

    public final int i() {
        return this.f14260e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int l() {
        /*
            r3 = this;
            int r0 = r3.f14260e
            r1 = 523(0x20b, float:7.33E-43)
            r2 = 1
            if (r0 != r1) goto L1e
            int r0 = r3.f14256a
            r1 = 568(0x238, float:7.96E-43)
            if (r0 == r1) goto L1e
            r1 = 593(0x251, float:8.31E-43)
            if (r0 == r1) goto L1e
            r1 = 645(0x285, float:9.04E-43)
            if (r0 == r1) goto L1e
            switch(r0) {
                case 558: goto L1d;
                case 559: goto L1d;
                case 560: goto L1d;
                case 561: goto L1e;
                case 562: goto L1d;
                default: goto L18;
            }
        L18:
            switch(r0) {
                case 564: goto L1d;
                case 565: goto L1d;
                case 566: goto L1d;
                default: goto L1b;
            }
        L1b:
            r2 = 6
            goto L1e
        L1d:
            r2 = 5
        L1e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a5.C1644k.l():int");
    }

    public final boolean p() {
        if (this.f14260e != 0) {
            return true;
        }
        return false;
    }

    public final boolean s() {
        return this.f14259d;
    }

    public final int u() {
        return this.f14261f;
    }

    public final void v(JSONObject jsonObjectData) {
        AbstractC3255y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("name")) {
            this.f14257b = jsonObjectData.getString("name");
        }
        if (!jsonObjectData.isNull("id")) {
            this.f14256a = jsonObjectData.getInt("id");
        }
        if (!jsonObjectData.isNull("isGame")) {
            this.f14261f = jsonObjectData.getInt("isGame");
        }
    }

    public final void w(JSONObject jsonObjectData, int i8) {
        AbstractC3255y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("name")) {
            this.f14257b = jsonObjectData.getString("name");
        }
        if (!jsonObjectData.isNull("id")) {
            this.f14256a = jsonObjectData.getInt("id");
        }
        this.f14260e = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeInt(this.f14256a);
        parcel.writeString(this.f14257b);
        parcel.writeString(this.f14258c);
        parcel.writeBooleanArray(new boolean[]{this.f14259d});
        parcel.writeInt(this.f14260e);
        parcel.writeInt(this.f14261f);
    }

    public final void x(JSONObject jsonObjectData) {
        AbstractC3255y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("id")) {
            this.f14256a = jsonObjectData.getInt("id");
        }
        if (!jsonObjectData.isNull("name")) {
            this.f14257b = jsonObjectData.getString("name");
        } else if (!jsonObjectData.isNull("value")) {
            this.f14257b = jsonObjectData.getString("value");
        }
        if (!jsonObjectData.isNull("description")) {
            this.f14258c = jsonObjectData.getString("description");
        }
        this.f14259d = true;
    }

    public final void y(Bundle arg) {
        AbstractC3255y.i(arg, "arg");
        this.f14256a = arg.getInt("id");
        this.f14257b = arg.getString("name");
        this.f14258c = arg.getString("description");
        this.f14259d = arg.getBoolean("isFloating");
        this.f14260e = arg.getInt("parentCategoryId");
        this.f14261f = arg.getInt("isGame");
    }

    public final Bundle z() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f14256a);
        bundle.putString("name", this.f14257b);
        bundle.putString("description", this.f14258c);
        bundle.putBoolean("isFloating", this.f14259d);
        bundle.putInt("parentCategoryId", this.f14260e);
        bundle.putInt("isGame", this.f14261f);
        return bundle;
    }

    public /* synthetic */ C1644k(int i8, String str, String str2, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1644k(Parcel source) {
        this(0, null, null, 7, null);
        AbstractC3255y.i(source, "source");
        this.f14256a = source.readInt();
        this.f14257b = source.readString();
        this.f14258c = source.readString();
        boolean[] zArr = new boolean[1];
        source.readBooleanArray(zArr);
        this.f14259d = zArr[0];
        this.f14260e = source.readInt();
        this.f14261f = source.readInt();
    }
}
