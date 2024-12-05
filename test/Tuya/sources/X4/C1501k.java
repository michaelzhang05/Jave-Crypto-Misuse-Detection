package X4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X4.k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1501k implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private int f12635a;

    /* renamed from: b, reason: collision with root package name */
    private String f12636b;

    /* renamed from: c, reason: collision with root package name */
    private String f12637c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f12638d;

    /* renamed from: e, reason: collision with root package name */
    private int f12639e;

    /* renamed from: f, reason: collision with root package name */
    private int f12640f;

    /* renamed from: g, reason: collision with root package name */
    public static final b f12634g = new b(null);
    public static Parcelable.Creator<C1501k> CREATOR = new a();

    /* renamed from: X4.k$a */
    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1501k createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
            return new C1501k(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1501k[] newArray(int i8) {
            return new C1501k[i8];
        }
    }

    /* renamed from: X4.k$b */
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
            AbstractC3159y.i(json, "json");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(json).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jsonObjectTop = jSONArray.getJSONObject(i9);
                C1501k c1501k = new C1501k(0, null, null, 7, null);
                AbstractC3159y.h(jsonObjectTop, "jsonObjectTop");
                c1501k.u(jsonObjectTop, i8);
                arrayList.add(c1501k);
            }
            return arrayList;
        }

        public final ArrayList c(String json) {
            AbstractC3159y.i(json, "json");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONObject(json).getJSONArray(DataSchemeDataSource.SCHEME_DATA);
            int length = jSONArray.length();
            for (int i8 = 0; i8 < length; i8++) {
                JSONObject jsonObjectTop = jSONArray.getJSONObject(i8);
                C1501k c1501k = new C1501k(0, null, null, 7, null);
                AbstractC3159y.h(jsonObjectTop, "jsonObjectTop");
                c1501k.z(jsonObjectTop);
                arrayList.add(c1501k);
            }
            return arrayList;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public C1501k(int i8, String str, String str2) {
        this.f12635a = i8;
        this.f12636b = str;
        this.f12637c = str2;
    }

    public final void G(Bundle arg) {
        AbstractC3159y.i(arg, "arg");
        this.f12635a = arg.getInt("id");
        this.f12636b = arg.getString("name");
        this.f12637c = arg.getString("description");
        this.f12638d = arg.getBoolean("isFloating");
        this.f12639e = arg.getInt("parentCategoryId");
        this.f12640f = arg.getInt("isGame");
    }

    public final Bundle I() {
        Bundle bundle = new Bundle();
        bundle.putInt("id", this.f12635a);
        bundle.putString("name", this.f12636b);
        bundle.putString("description", this.f12637c);
        bundle.putBoolean("isFloating", this.f12638d);
        bundle.putInt("parentCategoryId", this.f12639e);
        bundle.putInt("isGame", this.f12640f);
        return bundle;
    }

    public final void L(boolean z8) {
        this.f12638d = z8;
    }

    public final void Q(int i8) {
        this.f12635a = i8;
    }

    public final void T(String str) {
        this.f12636b = str;
    }

    public final void V(int i8) {
        this.f12639e = i8;
    }

    public final String b() {
        return this.f12637c;
    }

    public final int c() {
        return this.f12635a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final int e() {
        int i8 = this.f12635a;
        if (i8 != 648 && i8 != 567 && i8 != 563) {
            return 20;
        }
        return 12;
    }

    public final String f() {
        return this.f12636b;
    }

    public final int i() {
        return this.f12639e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001d A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j() {
        /*
            r3 = this;
            int r0 = r3.f12639e
            r1 = 523(0x20b, float:7.33E-43)
            r2 = 1
            if (r0 != r1) goto L1e
            int r0 = r3.f12635a
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
        throw new UnsupportedOperationException("Method not decompiled: X4.C1501k.j():int");
    }

    public final boolean k() {
        if (this.f12639e != 0) {
            return true;
        }
        return false;
    }

    public final boolean n() {
        return this.f12638d;
    }

    public final int o() {
        return this.f12640f;
    }

    public final void s(JSONObject jsonObjectData) {
        AbstractC3159y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("name")) {
            this.f12636b = jsonObjectData.getString("name");
        }
        if (!jsonObjectData.isNull("id")) {
            this.f12635a = jsonObjectData.getInt("id");
        }
        if (!jsonObjectData.isNull("isGame")) {
            this.f12640f = jsonObjectData.getInt("isGame");
        }
    }

    public final void u(JSONObject jsonObjectData, int i8) {
        AbstractC3159y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("name")) {
            this.f12636b = jsonObjectData.getString("name");
        }
        if (!jsonObjectData.isNull("id")) {
            this.f12635a = jsonObjectData.getInt("id");
        }
        this.f12639e = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeInt(this.f12635a);
        parcel.writeString(this.f12636b);
        parcel.writeString(this.f12637c);
        parcel.writeBooleanArray(new boolean[]{this.f12638d});
        parcel.writeInt(this.f12639e);
        parcel.writeInt(this.f12640f);
    }

    public final void z(JSONObject jsonObjectData) {
        AbstractC3159y.i(jsonObjectData, "jsonObjectData");
        if (!jsonObjectData.isNull("id")) {
            this.f12635a = jsonObjectData.getInt("id");
        }
        if (!jsonObjectData.isNull("name")) {
            this.f12636b = jsonObjectData.getString("name");
        } else if (!jsonObjectData.isNull("value")) {
            this.f12636b = jsonObjectData.getString("value");
        }
        if (!jsonObjectData.isNull("description")) {
            this.f12637c = jsonObjectData.getString("description");
        }
        this.f12638d = true;
    }

    public /* synthetic */ C1501k(int i8, String str, String str2, int i9, AbstractC3151p abstractC3151p) {
        this((i9 & 1) != 0 ? 0 : i8, (i9 & 2) != 0 ? null : str, (i9 & 4) != 0 ? null : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1501k(Parcel source) {
        this(0, null, null, 7, null);
        AbstractC3159y.i(source, "source");
        this.f12635a = source.readInt();
        this.f12636b = source.readString();
        this.f12637c = source.readString();
        boolean[] zArr = new boolean[1];
        source.readBooleanArray(zArr);
        this.f12638d = zArr[0];
        this.f12639e = source.readInt();
        this.f12640f = source.readInt();
    }
}
