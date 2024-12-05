package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import b4.C1975a;
import c4.C2045c;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements Serializable, Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0673a();

        /* renamed from: a, reason: collision with root package name */
        private final Y3.k f27872a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27873b;

        /* renamed from: c, reason: collision with root package name */
        private final C1975a f27874c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27875d;

        /* renamed from: e, reason: collision with root package name */
        private final b f27876e;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0673a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                return new a((Y3.k) parcel.readSerializable(), parcel.readString(), C1975a.CREATOR.createFromParcel(parcel), parcel.readString(), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Serializable, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C0674a();

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f27877a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f27878b;

            /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0674a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3255y.i(parcel, "parcel");
                    return new b(parcel.createByteArray(), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                AbstractC3255y.i(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                AbstractC3255y.i(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.f27877a = sdkPrivateKeyEncoded;
                this.f27878b = acsPublicKeyEncoded;
            }

            private final boolean g(b bVar) {
                if (Arrays.equals(this.f27877a, bVar.f27877a) && Arrays.equals(this.f27878b, bVar.f27878b)) {
                    return true;
                }
                return false;
            }

            public final byte[] a() {
                return this.f27878b;
            }

            public final byte[] b() {
                return this.f27877a;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof b) {
                    return g((b) obj);
                }
                return false;
            }

            public int hashCode() {
                return C2045c.b(this.f27877a, this.f27878b);
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.f27877a) + ", acsPublicKeyEncoded=" + Arrays.toString(this.f27878b) + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3255y.i(out, "out");
                out.writeByteArray(this.f27877a);
                out.writeByteArray(this.f27878b);
            }
        }

        public a(Y3.k messageTransformer, String sdkReferenceId, C1975a creqData, String acsUrl, b keys) {
            AbstractC3255y.i(messageTransformer, "messageTransformer");
            AbstractC3255y.i(sdkReferenceId, "sdkReferenceId");
            AbstractC3255y.i(creqData, "creqData");
            AbstractC3255y.i(acsUrl, "acsUrl");
            AbstractC3255y.i(keys, "keys");
            this.f27872a = messageTransformer;
            this.f27873b = sdkReferenceId;
            this.f27874c = creqData;
            this.f27875d = acsUrl;
            this.f27876e = keys;
        }

        public final String a() {
            return this.f27875d;
        }

        public final b b() {
            return this.f27876e;
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
            return AbstractC3255y.d(this.f27872a, aVar.f27872a) && AbstractC3255y.d(this.f27873b, aVar.f27873b) && AbstractC3255y.d(this.f27874c, aVar.f27874c) && AbstractC3255y.d(this.f27875d, aVar.f27875d) && AbstractC3255y.d(this.f27876e, aVar.f27876e);
        }

        public final Y3.k g() {
            return this.f27872a;
        }

        public final String h() {
            return this.f27873b;
        }

        public int hashCode() {
            return (((((((this.f27872a.hashCode() * 31) + this.f27873b.hashCode()) * 31) + this.f27874c.hashCode()) * 31) + this.f27875d.hashCode()) * 31) + this.f27876e.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.f27872a + ", sdkReferenceId=" + this.f27873b + ", creqData=" + this.f27874c + ", acsUrl=" + this.f27875d + ", keys=" + this.f27876e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeSerializable(this.f27872a);
            out.writeString(this.f27873b);
            this.f27874c.writeToParcel(out, i8);
            out.writeString(this.f27875d);
            this.f27876e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Serializable {
        c H(X3.c cVar, S5.g gVar);
    }

    Object a(C1975a c1975a, S5.d dVar);
}
