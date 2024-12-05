package a5;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class T implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f14074a;

    /* renamed from: b, reason: collision with root package name */
    private String f14075b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f14073c = new b(null);
    public static Parcelable.Creator<T> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T createFromParcel(Parcel source) {
            AbstractC3255y.i(source, "source");
            return new T(source);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public T[] newArray(int i8) {
            return new T[i8];
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public final T a(JSONObject jsonObjectVideo) {
            AbstractC3255y.i(jsonObjectVideo, "jsonObjectVideo");
            T t8 = new T();
            if (!jsonObjectVideo.isNull("youtubeID")) {
                t8.b(jsonObjectVideo.getString("youtubeID"));
            }
            if (!jsonObjectVideo.isNull("image")) {
                t8.g(jsonObjectVideo.getString("image"));
            }
            return t8;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    public T() {
    }

    public final String a() {
        if (this.f14075b != null) {
            return this.f14075b + UptodownApp.f29058B.r() + ":webp";
        }
        return null;
    }

    public final void b(String str) {
        this.f14074a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void g(String str) {
        this.f14075b = str;
    }

    public final String getId() {
        return this.f14074a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3255y.i(parcel, "parcel");
        parcel.writeString(this.f14074a);
        parcel.writeString(this.f14075b);
    }

    public T(Parcel source) {
        AbstractC3255y.i(source, "source");
        this.f14074a = source.readString();
        this.f14075b = source.readString();
    }
}
