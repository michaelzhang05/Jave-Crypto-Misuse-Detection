package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.session.d;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class MediaSessionCompat {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* loaded from: classes.dex */
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        ResultReceiver f14454a;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i8) {
                return new ResultReceiverWrapper[i8];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f14454a = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            this.f14454a.writeToParcel(parcel, i8);
        }
    }

    /* loaded from: classes.dex */
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final Object f14455a;

        /* renamed from: b, reason: collision with root package name */
        private b f14456b;

        /* renamed from: c, reason: collision with root package name */
        private Bundle f14457c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i8) {
                return new Token[i8];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        public static Token a(Object obj) {
            return b(obj, null);
        }

        public static Token b(Object obj, b bVar) {
            if (obj != null) {
                return new Token(d.a(obj), bVar);
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Token token = (Token) obj;
            Object obj2 = this.f14455a;
            if (obj2 == null) {
                if (token.f14455a == null) {
                    return true;
                }
                return false;
            }
            Object obj3 = token.f14455a;
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public b g() {
            return this.f14456b;
        }

        public Object h() {
            return this.f14455a;
        }

        public int hashCode() {
            Object obj = this.f14455a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public void i(b bVar) {
            this.f14456b = bVar;
        }

        public void l(Bundle bundle) {
            this.f14457c = bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            parcel.writeParcelable((Parcelable) this.f14455a, i8);
        }

        Token(Object obj, b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, b bVar, Bundle bundle) {
            this.f14455a = obj;
            this.f14456b = bVar;
            this.f14457c = bundle;
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    /* loaded from: classes.dex */
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private final MediaDescriptionCompat f14451a;

        /* renamed from: b, reason: collision with root package name */
        private final long f14452b;

        /* renamed from: c, reason: collision with root package name */
        private Object f14453c;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i8) {
                return new QueueItem[i8];
            }
        }

        private QueueItem(Object obj, MediaDescriptionCompat mediaDescriptionCompat, long j8) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null.");
            }
            if (j8 != -1) {
                this.f14451a = mediaDescriptionCompat;
                this.f14452b = j8;
                this.f14453c = obj;
                return;
            }
            throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
        }

        public static QueueItem a(Object obj) {
            if (obj != null) {
                return new QueueItem(obj, MediaDescriptionCompat.a(d.a.a(obj)), d.a.b(obj));
            }
            return null;
        }

        public static List b(List list) {
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(a(it.next()));
                }
                return arrayList;
            }
            return null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f14451a + ", Id=" + this.f14452b + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            this.f14451a.writeToParcel(parcel, i8);
            parcel.writeLong(this.f14452b);
        }

        QueueItem(Parcel parcel) {
            this.f14451a = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f14452b = parcel.readLong();
        }
    }
}
