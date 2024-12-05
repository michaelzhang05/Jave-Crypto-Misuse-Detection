package a5;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class L implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f14028a;

    /* renamed from: b, reason: collision with root package name */
    private int f14029b;

    /* renamed from: c, reason: collision with root package name */
    private int f14030c;

    /* renamed from: d, reason: collision with root package name */
    private int f14031d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f14027e = new b(null);
    public static Parcelable.Creator<L> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new L(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public L[] newArray(int i8) {
            return new L[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final L a(JSONObject jsonObjectScreenshot) {
            AbstractC3255y.i(jsonObjectScreenshot, "jsonObjectScreenshot");
            L l8 = new L();
            if (!jsonObjectScreenshot.isNull("screenshotURL")) {
                l8.p(jsonObjectScreenshot.getString("screenshotURL"));
            }
            if (!jsonObjectScreenshot.isNull("isVertical")) {
                l8.s(jsonObjectScreenshot.getInt("isVertical"));
            }
            if (!jsonObjectScreenshot.isNull("featured")) {
                l8.l(jsonObjectScreenshot.getInt("featured"));
            }
            return l8;
        }

        public final L b(JSONObject jsonObjectScreenshot) {
            AbstractC3255y.i(jsonObjectScreenshot, "jsonObjectScreenshot");
            L l8 = new L();
            if (!jsonObjectScreenshot.isNull("screenshotURL")) {
                l8.p(jsonObjectScreenshot.getString("screenshotURL"));
            }
            if (!jsonObjectScreenshot.isNull("isVertical")) {
                l8.s(jsonObjectScreenshot.getInt("isVertical"));
            }
            return l8;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public L() {
    }

    public final int a() {
        return this.f14030c;
    }

    public final int b() {
        return this.f14029b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String g() {
        return this.f14028a;
    }

    public final String h() {
        if (this.f14028a != null) {
            return this.f14028a + UptodownApp.f29058B.D() + ":webp";
        }
        return null;
    }

    public final String i() {
        if (this.f14028a != null) {
            return this.f14028a + UptodownApp.f29058B.C() + ":webp";
        }
        return null;
    }

    public final void l(int i8) {
        this.f14030c = i8;
    }

    public final void p(String str) {
        this.f14028a = str;
    }

    public final void s(int i8) {
        this.f14031d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        AbstractC3255y.i(dest, "dest");
        dest.writeString(this.f14028a);
        dest.writeInt(this.f14029b);
        dest.writeInt(this.f14030c);
        dest.writeInt(this.f14031d);
    }

    public L(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14028a = source.readString();
        this.f14029b = source.readInt();
        this.f14030c = source.readInt();
        this.f14031d = source.readInt();
    }
}
