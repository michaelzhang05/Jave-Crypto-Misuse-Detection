package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.b;
import android.support.v4.media.c;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final String f6f;

    /* renamed from: g, reason: collision with root package name */
    private final CharSequence f7g;

    /* renamed from: h, reason: collision with root package name */
    private final CharSequence f8h;

    /* renamed from: i, reason: collision with root package name */
    private final CharSequence f9i;

    /* renamed from: j, reason: collision with root package name */
    private final Bitmap f10j;

    /* renamed from: k, reason: collision with root package name */
    private final Uri f11k;
    private final Bundle l;
    private final Uri m;
    private Object n;

    /* loaded from: classes.dex */
    static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            if (Build.VERSION.SDK_INT < 21) {
                return new MediaDescriptionCompat(parcel);
            }
            return MediaDescriptionCompat.a(android.support.v4.media.b.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i2) {
            return new MediaDescriptionCompat[i2];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private CharSequence f12b;

        /* renamed from: c, reason: collision with root package name */
        private CharSequence f13c;

        /* renamed from: d, reason: collision with root package name */
        private CharSequence f14d;

        /* renamed from: e, reason: collision with root package name */
        private Bitmap f15e;

        /* renamed from: f, reason: collision with root package name */
        private Uri f16f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f17g;

        /* renamed from: h, reason: collision with root package name */
        private Uri f18h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.a, this.f12b, this.f13c, this.f14d, this.f15e, this.f16f, this.f17g, this.f18h);
        }

        public b b(CharSequence charSequence) {
            this.f14d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f17g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f15e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f16f = uri;
            return this;
        }

        public b f(String str) {
            this.a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f18h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f13c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f12b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6f = str;
        this.f7g = charSequence;
        this.f8h = charSequence2;
        this.f9i = charSequence3;
        this.f10j = bitmap;
        this.f11k = uri;
        this.l = bundle;
        this.m = uri2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.support.v4.media.MediaDescriptionCompat a(java.lang.Object r9) {
        /*
            r0 = 0
            if (r9 == 0) goto L7e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 21
            if (r1 < r2) goto L7e
            android.support.v4.media.MediaDescriptionCompat$b r2 = new android.support.v4.media.MediaDescriptionCompat$b
            r2.<init>()
            java.lang.String r3 = android.support.v4.media.b.f(r9)
            r2.f(r3)
            java.lang.CharSequence r3 = android.support.v4.media.b.h(r9)
            r2.i(r3)
            java.lang.CharSequence r3 = android.support.v4.media.b.g(r9)
            r2.h(r3)
            java.lang.CharSequence r3 = android.support.v4.media.b.b(r9)
            r2.b(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.b.d(r9)
            r2.d(r3)
            android.net.Uri r3 = android.support.v4.media.b.e(r9)
            r2.e(r3)
            android.os.Bundle r3 = android.support.v4.media.b.c(r9)
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4a
            android.support.v4.media.session.MediaSessionCompat.a(r3)
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4b
        L4a:
            r5 = r0
        L4b:
            if (r5 == 0) goto L63
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5d
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5d
            goto L64
        L5d:
            r3.remove(r4)
            r3.remove(r6)
        L63:
            r0 = r3
        L64:
            r2.c(r0)
            if (r5 == 0) goto L6d
            r2.g(r5)
            goto L78
        L6d:
            r0 = 23
            if (r1 < r0) goto L78
            android.net.Uri r0 = android.support.v4.media.c.a(r9)
            r2.g(r0)
        L78:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.a()
            r0.n = r9
        L7e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a(java.lang.Object):android.support.v4.media.MediaDescriptionCompat");
    }

    public Object b() {
        int i2;
        Object obj = this.n;
        if (obj != null || (i2 = Build.VERSION.SDK_INT) < 21) {
            return obj;
        }
        Object b2 = b.a.b();
        b.a.g(b2, this.f6f);
        b.a.i(b2, this.f7g);
        b.a.h(b2, this.f8h);
        b.a.c(b2, this.f9i);
        b.a.e(b2, this.f10j);
        b.a.f(b2, this.f11k);
        Bundle bundle = this.l;
        if (i2 < 23 && this.m != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.m);
        }
        b.a.d(b2, bundle);
        if (i2 >= 23) {
            c.a.a(b2, this.m);
        }
        Object a2 = b.a.a(b2);
        this.n = a2;
        return a2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f7g) + ", " + ((Object) this.f8h) + ", " + ((Object) this.f9i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        if (Build.VERSION.SDK_INT < 21) {
            parcel.writeString(this.f6f);
            TextUtils.writeToParcel(this.f7g, parcel, i2);
            TextUtils.writeToParcel(this.f8h, parcel, i2);
            TextUtils.writeToParcel(this.f9i, parcel, i2);
            parcel.writeParcelable(this.f10j, i2);
            parcel.writeParcelable(this.f11k, i2);
            parcel.writeBundle(this.l);
            parcel.writeParcelable(this.m, i2);
            return;
        }
        android.support.v4.media.b.i(b(), parcel, i2);
    }

    MediaDescriptionCompat(Parcel parcel) {
        this.f6f = parcel.readString();
        this.f7g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f8h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f9i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        ClassLoader classLoader = MediaDescriptionCompat.class.getClassLoader();
        this.f10j = (Bitmap) parcel.readParcelable(classLoader);
        this.f11k = (Uri) parcel.readParcelable(classLoader);
        this.l = parcel.readBundle(classLoader);
        this.m = (Uri) parcel.readParcelable(classLoader);
    }
}
