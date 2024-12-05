package X4;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class L implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12407a;

    /* renamed from: b, reason: collision with root package name */
    private int f12408b;

    /* renamed from: c, reason: collision with root package name */
    private int f12409c;

    /* renamed from: d, reason: collision with root package name */
    private int f12410d;

    /* renamed from: e, reason: collision with root package name */
    public static final b f12406e = new b(null);
    public static Parcelable.Creator<L> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public L createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
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
            AbstractC3159y.i(jsonObjectScreenshot, "jsonObjectScreenshot");
            L l8 = new L();
            if (!jsonObjectScreenshot.isNull("screenshotURL")) {
                l8.k(jsonObjectScreenshot.getString("screenshotURL"));
            }
            if (!jsonObjectScreenshot.isNull("isVertical")) {
                l8.n(jsonObjectScreenshot.getInt("isVertical"));
            }
            if (!jsonObjectScreenshot.isNull("featured")) {
                l8.j(jsonObjectScreenshot.getInt("featured"));
            }
            return l8;
        }

        public final L b(JSONObject jsonObjectScreenshot) {
            AbstractC3159y.i(jsonObjectScreenshot, "jsonObjectScreenshot");
            L l8 = new L();
            if (!jsonObjectScreenshot.isNull("screenshotURL")) {
                l8.k(jsonObjectScreenshot.getString("screenshotURL"));
            }
            if (!jsonObjectScreenshot.isNull("isVertical")) {
                l8.n(jsonObjectScreenshot.getInt("isVertical"));
            }
            return l8;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public L() {
    }

    public final int b() {
        return this.f12409c;
    }

    public final int c() {
        return this.f12408b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final String e() {
        return this.f12407a;
    }

    public final String f() {
        if (this.f12407a != null) {
            return this.f12407a + UptodownApp.f28003B.D() + ":webp";
        }
        return null;
    }

    public final String i() {
        if (this.f12407a != null) {
            return this.f12407a + UptodownApp.f28003B.C() + ":webp";
        }
        return null;
    }

    public final void j(int i8) {
        this.f12409c = i8;
    }

    public final void k(String str) {
        this.f12407a = str;
    }

    public final void n(int i8) {
        this.f12410d = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i8) {
        AbstractC3159y.i(dest, "dest");
        dest.writeString(this.f12407a);
        dest.writeInt(this.f12408b);
        dest.writeInt(this.f12409c);
        dest.writeInt(this.f12410d);
    }

    public L(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12407a = source.readString();
        this.f12408b = source.readInt();
        this.f12409c = source.readInt();
        this.f12410d = source.readInt();
    }
}
