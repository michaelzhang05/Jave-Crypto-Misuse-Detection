package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;

/* loaded from: classes.dex */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;

    /* renamed from: d, reason: collision with root package name */
    static final ArrayMap f13623d;

    /* renamed from: e, reason: collision with root package name */
    private static final String[] f13624e;

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f13625f;

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f13626g;

    /* renamed from: a, reason: collision with root package name */
    final Bundle f13627a;

    /* renamed from: b, reason: collision with root package name */
    private Object f13628b;

    /* renamed from: c, reason: collision with root package name */
    private MediaDescriptionCompat f13629c;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaMetadataCompat[] newArray(int i8) {
            return new MediaMetadataCompat[i8];
        }
    }

    static {
        ArrayMap arrayMap = new ArrayMap();
        f13623d = arrayMap;
        arrayMap.put("android.media.metadata.TITLE", 1);
        arrayMap.put("android.media.metadata.ARTIST", 1);
        arrayMap.put("android.media.metadata.DURATION", 0);
        arrayMap.put("android.media.metadata.ALBUM", 1);
        arrayMap.put("android.media.metadata.AUTHOR", 1);
        arrayMap.put("android.media.metadata.WRITER", 1);
        arrayMap.put("android.media.metadata.COMPOSER", 1);
        arrayMap.put("android.media.metadata.COMPILATION", 1);
        arrayMap.put("android.media.metadata.DATE", 1);
        arrayMap.put("android.media.metadata.YEAR", 0);
        arrayMap.put("android.media.metadata.GENRE", 1);
        arrayMap.put("android.media.metadata.TRACK_NUMBER", 0);
        arrayMap.put("android.media.metadata.NUM_TRACKS", 0);
        arrayMap.put("android.media.metadata.DISC_NUMBER", 0);
        arrayMap.put("android.media.metadata.ALBUM_ARTIST", 1);
        arrayMap.put("android.media.metadata.ART", 2);
        arrayMap.put("android.media.metadata.ART_URI", 1);
        arrayMap.put("android.media.metadata.ALBUM_ART", 2);
        arrayMap.put("android.media.metadata.ALBUM_ART_URI", 1);
        arrayMap.put("android.media.metadata.USER_RATING", 3);
        arrayMap.put("android.media.metadata.RATING", 3);
        arrayMap.put("android.media.metadata.DISPLAY_TITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        arrayMap.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        arrayMap.put("android.media.metadata.DISPLAY_ICON", 2);
        arrayMap.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        arrayMap.put("android.media.metadata.MEDIA_ID", 1);
        arrayMap.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        arrayMap.put("android.media.metadata.MEDIA_URI", 1);
        arrayMap.put("android.media.metadata.ADVERTISEMENT", 0);
        arrayMap.put("android.media.metadata.DOWNLOAD_STATUS", 0);
        f13624e = new String[]{"android.media.metadata.TITLE", "android.media.metadata.ARTIST", "android.media.metadata.ALBUM", "android.media.metadata.ALBUM_ARTIST", "android.media.metadata.WRITER", "android.media.metadata.AUTHOR", "android.media.metadata.COMPOSER"};
        f13625f = new String[]{"android.media.metadata.DISPLAY_ICON", "android.media.metadata.ART", "android.media.metadata.ALBUM_ART"};
        f13626g = new String[]{"android.media.metadata.DISPLAY_ICON_URI", "android.media.metadata.ART_URI", "android.media.metadata.ALBUM_ART_URI"};
        CREATOR = new a();
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f13627a = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }

    public static MediaMetadataCompat b(Object obj) {
        if (obj != null) {
            Parcel obtain = Parcel.obtain();
            g.a(obj, obtain, 0);
            obtain.setDataPosition(0);
            MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
            obtain.recycle();
            createFromParcel.f13628b = obj;
            return createFromParcel;
        }
        return null;
    }

    public Bitmap c(String str) {
        try {
            return (Bitmap) this.f13627a.getParcelable(str);
        } catch (Exception e8) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e8);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public MediaDescriptionCompat e() {
        Uri uri;
        Bitmap bitmap;
        Uri uri2;
        MediaDescriptionCompat mediaDescriptionCompat = this.f13629c;
        if (mediaDescriptionCompat != null) {
            return mediaDescriptionCompat;
        }
        String i8 = i("android.media.metadata.MEDIA_ID");
        CharSequence[] charSequenceArr = new CharSequence[3];
        CharSequence j8 = j("android.media.metadata.DISPLAY_TITLE");
        if (!TextUtils.isEmpty(j8)) {
            charSequenceArr[0] = j8;
            charSequenceArr[1] = j("android.media.metadata.DISPLAY_SUBTITLE");
            charSequenceArr[2] = j("android.media.metadata.DISPLAY_DESCRIPTION");
        } else {
            int i9 = 0;
            int i10 = 0;
            while (i9 < 3) {
                String[] strArr = f13624e;
                if (i10 >= strArr.length) {
                    break;
                }
                int i11 = i10 + 1;
                CharSequence j9 = j(strArr[i10]);
                if (!TextUtils.isEmpty(j9)) {
                    charSequenceArr[i9] = j9;
                    i9++;
                }
                i10 = i11;
            }
        }
        int i12 = 0;
        while (true) {
            String[] strArr2 = f13625f;
            uri = null;
            if (i12 < strArr2.length) {
                bitmap = c(strArr2[i12]);
                if (bitmap != null) {
                    break;
                }
                i12++;
            } else {
                bitmap = null;
                break;
            }
        }
        int i13 = 0;
        while (true) {
            String[] strArr3 = f13626g;
            if (i13 < strArr3.length) {
                String i14 = i(strArr3[i13]);
                if (!TextUtils.isEmpty(i14)) {
                    uri2 = Uri.parse(i14);
                    break;
                }
                i13++;
            } else {
                uri2 = null;
                break;
            }
        }
        String i15 = i("android.media.metadata.MEDIA_URI");
        if (!TextUtils.isEmpty(i15)) {
            uri = Uri.parse(i15);
        }
        MediaDescriptionCompat.b bVar = new MediaDescriptionCompat.b();
        bVar.f(i8);
        bVar.i(charSequenceArr[0]);
        bVar.h(charSequenceArr[1]);
        bVar.b(charSequenceArr[2]);
        bVar.d(bitmap);
        bVar.e(uri2);
        bVar.g(uri);
        Bundle bundle = new Bundle();
        if (this.f13627a.containsKey("android.media.metadata.BT_FOLDER_TYPE")) {
            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", f("android.media.metadata.BT_FOLDER_TYPE"));
        }
        if (this.f13627a.containsKey("android.media.metadata.DOWNLOAD_STATUS")) {
            bundle.putLong("android.media.extra.DOWNLOAD_STATUS", f("android.media.metadata.DOWNLOAD_STATUS"));
        }
        if (!bundle.isEmpty()) {
            bVar.c(bundle);
        }
        MediaDescriptionCompat a8 = bVar.a();
        this.f13629c = a8;
        return a8;
    }

    public long f(String str) {
        return this.f13627a.getLong(str, 0L);
    }

    public String i(String str) {
        CharSequence charSequence = this.f13627a.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public CharSequence j(String str) {
        return this.f13627a.getCharSequence(str);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeBundle(this.f13627a);
    }
}
