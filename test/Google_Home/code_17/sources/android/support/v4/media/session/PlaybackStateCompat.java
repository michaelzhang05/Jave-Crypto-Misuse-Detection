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
    final int f14463a;

    /* renamed from: b, reason: collision with root package name */
    final long f14464b;

    /* renamed from: c, reason: collision with root package name */
    final long f14465c;

    /* renamed from: d, reason: collision with root package name */
    final float f14466d;

    /* renamed from: e, reason: collision with root package name */
    final long f14467e;

    /* renamed from: f, reason: collision with root package name */
    final int f14468f;

    /* renamed from: g, reason: collision with root package name */
    final CharSequence f14469g;

    /* renamed from: h, reason: collision with root package name */
    final long f14470h;

    /* renamed from: i, reason: collision with root package name */
    List f14471i;

    /* renamed from: j, reason: collision with root package name */
    final long f14472j;

    /* renamed from: k, reason: collision with root package name */
    final Bundle f14473k;

    /* renamed from: l, reason: collision with root package name */
    private Object f14474l;

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
        this.f14463a = i8;
        this.f14464b = j8;
        this.f14465c = j9;
        this.f14466d = f8;
        this.f14467e = j10;
        this.f14468f = i9;
        this.f14469g = charSequence;
        this.f14470h = j11;
        this.f14471i = new ArrayList(list);
        this.f14472j = j12;
        this.f14473k = bundle;
    }

    public static PlaybackStateCompat a(Object obj) {
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
                arrayList2.add(CustomAction.a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = g.a(obj);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(e.i(obj), e.h(obj), e.c(obj), e.g(obj), e.a(obj), 0, e.e(obj), e.f(obj), arrayList, e.b(obj), bundle);
        playbackStateCompat.f14474l = obj;
        return playbackStateCompat;
    }

    public static int u(long j8) {
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

    public long b() {
        return this.f14467e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long g() {
        return this.f14465c;
    }

    public int h() {
        return this.f14468f;
    }

    public CharSequence i() {
        return this.f14469g;
    }

    public float l() {
        return this.f14466d;
    }

    public long p() {
        return this.f14464b;
    }

    public int s() {
        return this.f14463a;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f14463a + ", position=" + this.f14464b + ", buffered position=" + this.f14465c + ", speed=" + this.f14466d + ", updated=" + this.f14470h + ", actions=" + this.f14467e + ", error code=" + this.f14468f + ", error message=" + this.f14469g + ", custom actions=" + this.f14471i + ", active item id=" + this.f14472j + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f14463a);
        parcel.writeLong(this.f14464b);
        parcel.writeFloat(this.f14466d);
        parcel.writeLong(this.f14470h);
        parcel.writeLong(this.f14465c);
        parcel.writeLong(this.f14467e);
        TextUtils.writeToParcel(this.f14469g, parcel, i8);
        parcel.writeTypedList(this.f14471i);
        parcel.writeLong(this.f14472j);
        parcel.writeBundle(this.f14473k);
        parcel.writeInt(this.f14468f);
    }

    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final String f14475a;

        /* renamed from: b, reason: collision with root package name */
        private final CharSequence f14476b;

        /* renamed from: c, reason: collision with root package name */
        private final int f14477c;

        /* renamed from: d, reason: collision with root package name */
        private final Bundle f14478d;

        /* renamed from: e, reason: collision with root package name */
        private Object f14479e;

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
            this.f14475a = str;
            this.f14476b = charSequence;
            this.f14477c = i8;
            this.f14478d = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj != null) {
                CustomAction customAction = new CustomAction(e.a.a(obj), e.a.d(obj), e.a.c(obj), e.a.b(obj));
                customAction.f14479e = obj;
                return customAction;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f14476b) + ", mIcon=" + this.f14477c + ", mExtras=" + this.f14478d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeString(this.f14475a);
            TextUtils.writeToParcel(this.f14476b, parcel, i8);
            parcel.writeInt(this.f14477c);
            parcel.writeBundle(this.f14478d);
        }

        CustomAction(Parcel parcel) {
            this.f14475a = parcel.readString();
            this.f14476b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14477c = parcel.readInt();
            this.f14478d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f14463a = parcel.readInt();
        this.f14464b = parcel.readLong();
        this.f14466d = parcel.readFloat();
        this.f14470h = parcel.readLong();
        this.f14465c = parcel.readLong();
        this.f14467e = parcel.readLong();
        this.f14469g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f14471i = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f14472j = parcel.readLong();
        this.f14473k = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f14468f = parcel.readInt();
    }
}
