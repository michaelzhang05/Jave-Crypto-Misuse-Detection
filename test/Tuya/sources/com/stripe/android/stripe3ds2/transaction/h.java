package com.stripe.android.stripe3ds2.transaction;

import L5.x;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.content.IntentCompat;
import androidx.core.os.BundleKt;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class h implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public static final b f26837a = new b(null);

    /* loaded from: classes4.dex */
    public static final class a extends h {
        public static final Parcelable.Creator<a> CREATOR = new C0680a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26838b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26839c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26840d;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.h$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0680a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(intentData, "intentData");
            this.f26838b = str;
            this.f26839c = gVar;
            this.f26840d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26839c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26840d;
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
            return AbstractC3159y.d(this.f26838b, aVar.f26838b) && this.f26839c == aVar.f26839c && AbstractC3159y.d(this.f26840d, aVar.f26840d);
        }

        public final String f() {
            return this.f26838b;
        }

        public int hashCode() {
            String str = this.f26838b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Y3.g gVar = this.f26839c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f26840d.hashCode();
        }

        public String toString() {
            return "Canceled(uiTypeCode=" + this.f26838b + ", initialUiType=" + this.f26839c + ", intentData=" + this.f26840d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26838b);
            Y3.g gVar = this.f26839c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26840d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final h a(Intent intent) {
            h hVar;
            if (intent == null || (hVar = (h) IntentCompat.getParcelableExtra(intent, "extra_result", h.class)) == null) {
                return new e(new IllegalStateException("Intent extras did not contain a valid ChallengeResult."), null, n.f26886e.a());
            }
            return hVar;
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class c extends h {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26841b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26842c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26843d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new c(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c[] newArray(int i8) {
                return new c[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String uiTypeCode, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(uiTypeCode, "uiTypeCode");
            AbstractC3159y.i(intentData, "intentData");
            this.f26841b = uiTypeCode;
            this.f26842c = gVar;
            this.f26843d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26842c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26843d;
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
            return AbstractC3159y.d(this.f26841b, cVar.f26841b) && this.f26842c == cVar.f26842c && AbstractC3159y.d(this.f26843d, cVar.f26843d);
        }

        public final String f() {
            return this.f26841b;
        }

        public int hashCode() {
            int hashCode = this.f26841b.hashCode() * 31;
            Y3.g gVar = this.f26842c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26843d.hashCode();
        }

        public String toString() {
            return "Failed(uiTypeCode=" + this.f26841b + ", initialUiType=" + this.f26842c + ", intentData=" + this.f26843d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26841b);
            Y3.g gVar = this.f26842c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26843d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends h {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Y3.d f26844b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26845c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26846d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new d(Y3.d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d[] newArray(int i8) {
                return new d[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y3.d data, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(data, "data");
            AbstractC3159y.i(intentData, "intentData");
            this.f26844b = data;
            this.f26845c = gVar;
            this.f26846d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26845c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26846d;
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
            return AbstractC3159y.d(this.f26844b, dVar.f26844b) && this.f26845c == dVar.f26845c && AbstractC3159y.d(this.f26846d, dVar.f26846d);
        }

        public int hashCode() {
            int hashCode = this.f26844b.hashCode() * 31;
            Y3.g gVar = this.f26845c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26846d.hashCode();
        }

        public String toString() {
            return "ProtocolError(data=" + this.f26844b + ", initialUiType=" + this.f26845c + ", intentData=" + this.f26846d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            this.f26844b.writeToParcel(out, i8);
            Y3.g gVar = this.f26845c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26846d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends h {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final Throwable f26847b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26848c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26849d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new e((Throwable) parcel.readSerializable(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e[] newArray(int i8) {
                return new e[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Throwable throwable, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(throwable, "throwable");
            AbstractC3159y.i(intentData, "intentData");
            this.f26847b = throwable;
            this.f26848c = gVar;
            this.f26849d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26848c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26849d;
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
            return AbstractC3159y.d(this.f26847b, eVar.f26847b) && this.f26848c == eVar.f26848c && AbstractC3159y.d(this.f26849d, eVar.f26849d);
        }

        public int hashCode() {
            int hashCode = this.f26847b.hashCode() * 31;
            Y3.g gVar = this.f26848c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26849d.hashCode();
        }

        public String toString() {
            return "RuntimeError(throwable=" + this.f26847b + ", initialUiType=" + this.f26848c + ", intentData=" + this.f26849d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26847b);
            Y3.g gVar = this.f26848c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26849d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends h {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26850b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26851c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26852d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new f(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f[] newArray(int i8) {
                return new f[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String uiTypeCode, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(uiTypeCode, "uiTypeCode");
            AbstractC3159y.i(intentData, "intentData");
            this.f26850b = uiTypeCode;
            this.f26851c = gVar;
            this.f26852d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26851c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26852d;
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
            return AbstractC3159y.d(this.f26850b, fVar.f26850b) && this.f26851c == fVar.f26851c && AbstractC3159y.d(this.f26852d, fVar.f26852d);
        }

        public final String f() {
            return this.f26850b;
        }

        public int hashCode() {
            int hashCode = this.f26850b.hashCode() * 31;
            Y3.g gVar = this.f26851c;
            return ((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + this.f26852d.hashCode();
        }

        public String toString() {
            return "Succeeded(uiTypeCode=" + this.f26850b + ", initialUiType=" + this.f26851c + ", intentData=" + this.f26852d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26850b);
            Y3.g gVar = this.f26851c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26852d.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends h {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        private final String f26853b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.g f26854c;

        /* renamed from: d, reason: collision with root package name */
        private final n f26855d;

        /* loaded from: classes4.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new g(parcel.readString(), parcel.readInt() == 0 ? null : Y3.g.valueOf(parcel.readString()), n.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final g[] newArray(int i8) {
                return new g[i8];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, Y3.g gVar, n intentData) {
            super(null);
            AbstractC3159y.i(intentData, "intentData");
            this.f26853b = str;
            this.f26854c = gVar;
            this.f26855d = intentData;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public Y3.g b() {
            return this.f26854c;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.h
        public n c() {
            return this.f26855d;
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
            return AbstractC3159y.d(this.f26853b, gVar.f26853b) && this.f26854c == gVar.f26854c && AbstractC3159y.d(this.f26855d, gVar.f26855d);
        }

        public final String f() {
            return this.f26853b;
        }

        public int hashCode() {
            String str = this.f26853b;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Y3.g gVar = this.f26854c;
            return ((hashCode + (gVar != null ? gVar.hashCode() : 0)) * 31) + this.f26855d.hashCode();
        }

        public String toString() {
            return "Timeout(uiTypeCode=" + this.f26853b + ", initialUiType=" + this.f26854c + ", intentData=" + this.f26855d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeString(this.f26853b);
            Y3.g gVar = this.f26854c;
            if (gVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeString(gVar.name());
            }
            this.f26855d.writeToParcel(out, i8);
        }
    }

    private h() {
    }

    public abstract Y3.g b();

    public abstract n c();

    public final Bundle e() {
        return BundleKt.bundleOf(x.a("extra_result", this));
    }

    public /* synthetic */ h(AbstractC3151p abstractC3151p) {
        this();
    }
}
