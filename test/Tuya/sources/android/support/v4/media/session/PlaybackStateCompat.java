package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.e;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    final int f13664a;

    /* renamed from: b, reason: collision with root package name */
    final long f13665b;

    /* renamed from: c, reason: collision with root package name */
    final long f13666c;

    /* renamed from: d, reason: collision with root package name */
    final float f13667d;

    /* renamed from: e, reason: collision with root package name */
    final long f13668e;

    /* renamed from: f, reason: collision with root package name */
    final int f13669f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f13670g;

    /* renamed from: h, reason: collision with root package name */
    final long f13671h;

    /* renamed from: i, reason: collision with root package name */
    List f13672i;

    /* renamed from: j, reason: collision with root package name */
    final long f13673j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f13674k;

    /* renamed from: l, reason: collision with root package name */
    private Object f13675l;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i8) {
            return new PlaybackStateCompat[i8];
        }
    }

    PlaybackStateCompat(int i8, long j8, long j9, float f8, long j10, int i9, CharSequence charSequence, long j11, List list, long j12, Bundle bundle) {
        this.f13664a = i8;
        this.f13665b = j8;
        this.f13666c = j9;
        this.f13667d = f8;
        this.f13668e = j10;
        this.f13669f = i9;
        this.f13670g = charSequence;
        this.f13671h = j11;
        this.f13672i = new ArrayList(list);
        this.f13673j = j12;
        this.f13674k = bundle;
    }

    public static PlaybackStateCompat b(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        List d8 = e.d(obj);
        if (d8 != null) {
            ArrayList arrayList2 = new ArrayList(d8.size());
            Iterator it = d8.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.b(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = g.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.i(obj), e.h(obj), e.c(obj), e.g(obj), e.a(obj), 0, e.e(obj), e.f(obj), arrayList, e.b(obj), bundle);
        playbackStateCompat.f13675l = obj;
        return playbackStateCompat;
    }

    public static int o(long j8) {
        if (j8 == 4) {
            return 126;
        }
        if (j8 == 2) {
            return 127;
        }
        if (j8 == 32) {
            return 87;
        }
        if (j8 == 16) {
            return 88;
        }
        if (j8 == 1) {
            return 86;
        }
        if (j8 == 64) {
            return 90;
        }
        if (j8 == 8) {
            return 89;
        }
        return j8 == 512 ? 85 : 0;
    }

    public long c() {
        return this.f13668e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f13666c;
    }

    public int f() {
        return this.f13669f;
    }

    public CharSequence i() {
        return this.f13670g;
    }

    public float j() {
        return this.f13667d;
    }

    public long k() {
        return this.f13665b;
    }

    public int n() {
        return this.f13664a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f13664a + ", position=" + this.f13665b + ", buffered position=" + this.f13666c + ", speed=" + this.f13667d + ", updated=" + this.f13671h + ", actions=" + this.f13668e + ", error code=" + this.f13669f + ", error message=" + this.f13670g + ", custom actions=" + this.f13672i + ", active item id=" + this.f13673j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f13664a);
        parcel.writeLong(this.f13665b);
        parcel.writeFloat(this.f13667d);
        parcel.writeLong(this.f13671h);
        parcel.writeLong(this.f13666c);
        parcel.writeLong(this.f13668e);
        TextUtils.writeToParcel(this.f13670g, parcel, i8);
        parcel.writeTypedList(this.f13672i);
        parcel.writeLong(this.f13673j);
        parcel.writeBundle(this.f13674k);
        parcel.writeInt(this.f13669f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f13676a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f13677b;

        /* renamed from: c, reason: collision with root package name */
        private final int f13678c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f13679d;

        /* renamed from: e, reason: collision with root package name */
        private Object f13680e;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i8) {
                return new CustomAction[i8];
            }
        }

        CustomAction(String str, CharSequence charSequence, int i8, Bundle bundle) {
            this.f13676a = str;
            this.f13677b = charSequence;
            this.f13678c = i8;
            this.f13679d = bundle;
        }

        public static CustomAction b(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(e.a.a(obj), e.a.d(obj), e.a.c(obj), e.a.b(obj));
                customAction.f13680e = obj;
                return customAction;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f13677b) + ", mIcon=" + this.f13678c + ", mExtras=" + this.f13679d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f13676a);
            TextUtils.writeToParcel(this.f13677b, parcel, i8);
            parcel.writeInt(this.f13678c);
            parcel.writeBundle(this.f13679d);
        }

        CustomAction(Parcel parcel) {
            this.f13676a = parcel.readString();
            this.f13677b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f13678c = parcel.readInt();
            this.f13679d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f13664a = parcel.readInt();
        this.f13665b = parcel.readLong();
        this.f13667d = parcel.readFloat();
        this.f13671h = parcel.readLong();
        this.f13666c = parcel.readLong();
        this.f13668e = parcel.readLong();
        this.f13670g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f13672i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f13673j = parcel.readLong();
        this.f13674k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f13669f = parcel.readInt();
    }
}
