package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import f5.f;
import f5.h;

/* loaded from: classes.dex */
public final class e implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    private final IntentSender f184a;

    /* renamed from: b, reason: collision with root package name */
    private final Intent f185b;

    /* renamed from: c, reason: collision with root package name */
    private final int f186c;

    /* renamed from: d, reason: collision with root package name */
    private final int f187d;

    /* renamed from: e, reason: collision with root package name */
    public static final c f183e = new c(null);
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f188a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f189b;

        /* renamed from: c, reason: collision with root package name */
        private int f190c;

        /* renamed from: d, reason: collision with root package name */
        private int f191d;

        public a(IntentSender intentSender) {
            h.e(intentSender, "intentSender");
            this.f188a = intentSender;
        }

        public final e a() {
            return new e(this.f188a, this.f189b, this.f190c, this.f191d);
        }

        public final a b(Intent intent) {
            this.f189b = intent;
            return this;
        }

        public final a c(int i6, int i7) {
            this.f191d = i6;
            this.f190c = i7;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            h.e(parcel, "inParcel");
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i6) {
            return new e[i6];
        }
    }

    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(f fVar) {
            this();
        }
    }

    public e(IntentSender intentSender, Intent intent, int i6, int i7) {
        h.e(intentSender, "intentSender");
        this.f184a = intentSender;
        this.f185b = intent;
        this.f186c = i6;
        this.f187d = i7;
    }

    public final Intent a() {
        return this.f185b;
    }

    public final int b() {
        return this.f186c;
    }

    public final int c() {
        return this.f187d;
    }

    public final IntentSender d() {
        return this.f184a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        h.e(parcel, "dest");
        parcel.writeParcelable(this.f184a, i6);
        parcel.writeParcelable(this.f185b, i6);
        parcel.writeInt(this.f186c);
        parcel.writeInt(this.f187d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(android.os.Parcel r4) {
        /*
            r3 = this;
            java.lang.String r0 = "parcel"
            f5.h.e(r4, r0)
            java.lang.Class<android.content.IntentSender> r0 = android.content.IntentSender.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r0 = r4.readParcelable(r0)
            f5.h.b(r0)
            android.content.IntentSender r0 = (android.content.IntentSender) r0
            java.lang.Class<android.content.Intent> r1 = android.content.Intent.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            android.os.Parcelable r1 = r4.readParcelable(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            int r2 = r4.readInt()
            int r4 = r4.readInt()
            r3.<init>(r0, r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.e.<init>(android.os.Parcel):void");
    }
}
