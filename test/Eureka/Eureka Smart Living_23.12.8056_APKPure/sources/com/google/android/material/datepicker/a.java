package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0084a();

    /* renamed from: a, reason: collision with root package name */
    private final m f4910a;

    /* renamed from: b, reason: collision with root package name */
    private final m f4911b;

    /* renamed from: c, reason: collision with root package name */
    private final c f4912c;

    /* renamed from: d, reason: collision with root package name */
    private m f4913d;

    /* renamed from: e, reason: collision with root package name */
    private final int f4914e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4915f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4916g;

    /* renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0084a implements Parcelable.Creator {
        C0084a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i6) {
            return new a[i6];
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: f, reason: collision with root package name */
        static final long f4917f = w.a(m.b(1900, 0).f5000f);

        /* renamed from: g, reason: collision with root package name */
        static final long f4918g = w.a(m.b(2100, 11).f5000f);

        /* renamed from: a, reason: collision with root package name */
        private long f4919a;

        /* renamed from: b, reason: collision with root package name */
        private long f4920b;

        /* renamed from: c, reason: collision with root package name */
        private Long f4921c;

        /* renamed from: d, reason: collision with root package name */
        private int f4922d;

        /* renamed from: e, reason: collision with root package name */
        private c f4923e;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(a aVar) {
            this.f4919a = f4917f;
            this.f4920b = f4918g;
            this.f4923e = g.a(Long.MIN_VALUE);
            this.f4919a = aVar.f4910a.f5000f;
            this.f4920b = aVar.f4911b.f5000f;
            this.f4921c = Long.valueOf(aVar.f4913d.f5000f);
            this.f4922d = aVar.f4914e;
            this.f4923e = aVar.f4912c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f4923e);
            m c6 = m.c(this.f4919a);
            m c7 = m.c(this.f4920b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l6 = this.f4921c;
            return new a(c6, c7, cVar, l6 == null ? null : m.c(l6.longValue()), this.f4922d, null);
        }

        public b b(long j6) {
            this.f4921c = Long.valueOf(j6);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c extends Parcelable {
        boolean g(long j6);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i6) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f4910a = mVar;
        this.f4911b = mVar2;
        this.f4913d = mVar3;
        this.f4914e = i6;
        this.f4912c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i6 < 0 || i6 > w.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f4916g = mVar.l(mVar2) + 1;
        this.f4915f = (mVar2.f4997c - mVar.f4997c) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4910a.equals(aVar.f4910a) && this.f4911b.equals(aVar.f4911b) && androidx.core.util.c.a(this.f4913d, aVar.f4913d) && this.f4914e == aVar.f4914e && this.f4912c.equals(aVar.f4912c);
    }

    public c f() {
        return this.f4912c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m h() {
        return this.f4911b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4910a, this.f4911b, this.f4913d, Integer.valueOf(this.f4914e), this.f4912c});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        return this.f4914e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int j() {
        return this.f4916g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m k() {
        return this.f4913d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m l() {
        return this.f4910a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int m() {
        return this.f4915f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i6) {
        parcel.writeParcelable(this.f4910a, 0);
        parcel.writeParcelable(this.f4911b, 0);
        parcel.writeParcelable(this.f4913d, 0);
        parcel.writeParcelable(this.f4912c, 0);
        parcel.writeInt(this.f4914e);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i6, C0084a c0084a) {
        this(mVar, mVar2, cVar, mVar3, i6);
    }
}
