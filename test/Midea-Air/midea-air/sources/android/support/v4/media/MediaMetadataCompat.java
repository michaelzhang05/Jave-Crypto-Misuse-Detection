package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    static final c.e.a<String, Integer> f19f;

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f20g;

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f21h;

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f22i;

    /* renamed from: j, reason: collision with root package name */
    final Bundle f23j;

    /* renamed from: k, reason: collision with root package name */
    private Object f24k;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaMetadataCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i2) {
            return new MediaMetadataCompat[i2];
        }
    }

    static {
        c.e.a<String, Integer> aVar = new c.e.a<>();
        f19f = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f20g = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f21h = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f22i = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f23j = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat a(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        d.a(obj, obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f24k = obj;
        return createFromParcel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeBundle(this.f23j);
    }
}
