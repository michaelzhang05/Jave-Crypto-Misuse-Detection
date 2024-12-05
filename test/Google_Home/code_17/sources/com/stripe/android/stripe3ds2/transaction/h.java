package com.stripe.android.stripe3ds2.transaction;

import O5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class h implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f27892a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends h {
        public static final Parcelable.Creator<a> CREATOR = new C0676a();

        /* renamed from: b, reason: collision with root package name */
        private final String f27893b;

        /* renamed from: c, reason: collision with root package name */
        private final b4.g f27894c;

        /* renamed from: d, reason: collision with root package name */
        private final n f27895d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0676a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : b4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, b4.g gVar, n intentData) {
            super(null);
            AbstractC3255y.i(intentData, "intentData");
            this.f27893b = str;
            this.f27894c = gVar;
            this.f27895d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public b4.g a() {
            return this.f27894c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f27895d;
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
            return AbstractC3255y.d(this.f27893b, aVar.f27893b) && this.f27894c == aVar.f27894c && AbstractC3255y.d(this.f27895d, aVar.f27895d);
        }

        public final String h() {
            return this.f27893b;
        }

        public int hashCode() {
            String str = this.f27893b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            b4.g gVar = this.f27894c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f27895d.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.f27893b + ", initialUiType=" + this.f27894c + ", intentData=" + this.f27895d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27893b);
            b4.g gVar = this.f27894c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f27895d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final h a(Intent intent) {
            h hVar;
            if (intent == null || (hVar = (h) IntentCompat.getParcelableExtra(intent, "extra_result", h.class)) == null) {
                return new e(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, n.f27941e.a());
            }
            return hVar;
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f27896b;

        /* renamed from: c, reason: collision with root package name */
        private final b4.g f27897c;

        /* renamed from: d, reason: collision with root package name */
        private final n f27898d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readInt() == 0 ? null : b4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String uiTypeCode, b4.g gVar, n intentData) {
            super(null);
            AbstractC3255y.i(uiTypeCode, "uiTypeCode");
            AbstractC3255y.i(intentData, "intentData");
            this.f27896b = uiTypeCode;
            this.f27897c = gVar;
            this.f27898d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public b4.g a() {
            return this.f27897c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f27898d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3255y.d(this.f27896b, cVar.f27896b) && this.f27897c == cVar.f27897c && AbstractC3255y.d(this.f27898d, cVar.f27898d);
        }

        public final String h() {
            return this.f27896b;
        }

        public int hashCode() {
            int hashCode = this.f27896b.hashCode() * 31;
            b4.g gVar = this.f27897c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f27898d.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.f27896b + ", initialUiType=" + this.f27897c + ", intentData=" + this.f27898d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27896b);
            b4.g gVar = this.f27897c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f27898d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends h {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final b4.d f27899b;

        /* renamed from: c, reason: collision with root package name */
        private final b4.g f27900c;

        /* renamed from: d, reason: collision with root package name */
        private final n f27901d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new d(b4.d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : b4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(b4.d data, b4.g gVar, n intentData) {
            super(null);
            AbstractC3255y.i(data, "data");
            AbstractC3255y.i(intentData, "intentData");
            this.f27899b = data;
            this.f27900c = gVar;
            this.f27901d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public b4.g a() {
            return this.f27900c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f27901d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3255y.d(this.f27899b, dVar.f27899b) && this.f27900c == dVar.f27900c && AbstractC3255y.d(this.f27901d, dVar.f27901d);
        }

        public int hashCode() {
            int hashCode = this.f27899b.hashCode() * 31;
            b4.g gVar = this.f27900c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f27901d.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f27899b + ", initialUiType=" + this.f27900c + ", intentData=" + this.f27901d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            this.f27899b.writeToParcel(out, i8);
            b4.g gVar = this.f27900c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f27901d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends h {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f27902b;

        /* renamed from: c, reason: collision with root package name */
        private final b4.g f27903c;

        /* renamed from: d, reason: collision with root package name */
        private final n f27904d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new e((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : b4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable throwable, b4.g gVar, n intentData) {
            super(null);
            AbstractC3255y.i(throwable, "throwable");
            AbstractC3255y.i(intentData, "intentData");
            this.f27902b = throwable;
            this.f27903c = gVar;
            this.f27904d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public b4.g a() {
            return this.f27903c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f27904d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return AbstractC3255y.d(this.f27902b, eVar.f27902b) && this.f27903c == eVar.f27903c && AbstractC3255y.d(this.f27904d, eVar.f27904d);
        }

        public int hashCode() {
            int hashCode = this.f27902b.hashCode() * 31;
            b4.g gVar = this.f27903c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f27904d.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f27902b + ", initialUiType=" + this.f27903c + ", intentData=" + this.f27904d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f27902b);
            b4.g gVar = this.f27903c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f27904d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends h {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f27905b;

        /* renamed from: c, reason: collision with root package name */
        private final b4.g f27906c;

        /* renamed from: d, reason: collision with root package name */
        private final n f27907d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new f(parcel.readString(), parcel.readInt() == 0 ? null : b4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String uiTypeCode, b4.g gVar, n intentData) {
            super(null);
            AbstractC3255y.i(uiTypeCode, "uiTypeCode");
            AbstractC3255y.i(intentData, "intentData");
            this.f27905b = uiTypeCode;
            this.f27906c = gVar;
            this.f27907d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public b4.g a() {
            return this.f27906c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f27907d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return AbstractC3255y.d(this.f27905b, fVar.f27905b) && this.f27906c == fVar.f27906c && AbstractC3255y.d(this.f27907d, fVar.f27907d);
        }

        public final String h() {
            return this.f27905b;
        }

        public int hashCode() {
            int hashCode = this.f27905b.hashCode() * 31;
            b4.g gVar = this.f27906c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f27907d.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.f27905b + ", initialUiType=" + this.f27906c + ", intentData=" + this.f27907d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27905b);
            b4.g gVar = this.f27906c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f27907d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends h {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f27908b;

        /* renamed from: c, reason: collision with root package name */
        private final b4.g f27909c;

        /* renamed from: d, reason: collision with root package name */
        private final n f27910d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readInt() == 0 ? null : b4.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, b4.g gVar, n intentData) {
            super(null);
            AbstractC3255y.i(intentData, "intentData");
            this.f27908b = str;
            this.f27909c = gVar;
            this.f27910d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public b4.g a() {
            return this.f27909c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n b() {
            return this.f27910d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return AbstractC3255y.d(this.f27908b, gVar.f27908b) && this.f27909c == gVar.f27909c && AbstractC3255y.d(this.f27910d, gVar.f27910d);
        }

        public final String h() {
            return this.f27908b;
        }

        public int hashCode() {
            String str = this.f27908b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            b4.g gVar = this.f27909c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f27910d.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.f27908b + ", initialUiType=" + this.f27909c + ", intentData=" + this.f27910d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f27908b);
            b4.g gVar = this.f27909c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f27910d.writeToParcel(out, i8);
        }
    }

    private h() {
    }

    public abstract b4.g a();

    public abstract n b();

    public final Bundle g() {
        return BundleKt.bundleOf(x.a("extra_result", this));
    }

    public /* synthetic */ h(AbstractC3247p abstractC3247p) {
        this();
    }
}
