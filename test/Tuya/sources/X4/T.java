package X4;

import android.os.Parcel;
import android.os.Parcelable;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class T implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private String f12453a;

    /* renamed from: b, reason: collision with root package name */
    private String f12454b;

    /* renamed from: c, reason: collision with root package name */
    public static final b f12452c = new b(null);
    public static Parcelable.Creator<T> CREATOR = new a();

    /* loaded from: classes5.dex */
    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public T createFromParcel(Parcel source) {
            AbstractC3159y.i(source, "source");
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
            AbstractC3159y.i(jsonObjectVideo, "jsonObjectVideo");
            T t8 = new T();
            if (!jsonObjectVideo.isNull("youtubeID")) {
                t8.c(jsonObjectVideo.getString("youtubeID"));
            }
            if (!jsonObjectVideo.isNull("image")) {
                t8.e(jsonObjectVideo.getString("image"));
            }
            return t8;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    public T() {
    }

    public final String b() {
        if (this.f12454b != null) {
            return this.f12454b + UptodownApp.f28003B.r() + ":webp";
        }
        return null;
    }

    public final void c(String str) {
        this.f12453a = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public final void e(String str) {
        this.f12454b = str;
    }

    public final String getId() {
        return this.f12453a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        AbstractC3159y.i(parcel, "parcel");
        parcel.writeString(this.f12453a);
        parcel.writeString(this.f12454b);
    }

    public T(Parcel source) {
        AbstractC3159y.i(source, "source");
        this.f12453a = source.readString();
        this.f12454b = source.readString();
    }
}
