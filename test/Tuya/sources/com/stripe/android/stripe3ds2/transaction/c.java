package com.stripe.android.stripe3ds2.transaction;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public interface c {

    /* loaded from: classes4.dex */
    public static final class a implements Serializable, Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0677a();

        /* renamed from: a, reason: collision with root package name */
        private final V3.k f26817a;

        /* renamed from: b, reason: collision with root package name */
        private final String f26818b;

        /* renamed from: c, reason: collision with root package name */
        private final Y3.a f26819c;

        /* renamed from: d, reason: collision with root package name */
        private final String f26820d;

        /* renamed from: e, reason: collision with root package name */
        private final b f26821e;

        /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0677a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a createFromParcel(Parcel parcel) {
                AbstractC3159y.i(parcel, "parcel");
                return new a((V3.k) parcel.readSerializable(), parcel.readString(), Y3.a.CREATOR.createFromParcel(parcel), parcel.readString(), b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final a[] newArray(int i8) {
                return new a[i8];
            }
        }

        /* loaded from: classes4.dex */
        public static final class b implements Serializable, Parcelable {
            public static final Parcelable.Creator<b> CREATOR = new C0678a();

            /* renamed from: a, reason: collision with root package name */
            private final byte[] f26822a;

            /* renamed from: b, reason: collision with root package name */
            private final byte[] f26823b;

            /* renamed from: com.stripe.android.stripe3ds2.transaction.c$a$b$a, reason: collision with other inner class name */
            /* loaded from: classes4.dex */
            public static final class C0678a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final b createFromParcel(Parcel parcel) {
                    AbstractC3159y.i(parcel, "parcel");
                    return new b(parcel.createByteArray(), parcel.createByteArray());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final b[] newArray(int i8) {
                    return new b[i8];
                }
            }

            public b(byte[] sdkPrivateKeyEncoded, byte[] acsPublicKeyEncoded) {
                AbstractC3159y.i(sdkPrivateKeyEncoded, "sdkPrivateKeyEncoded");
                AbstractC3159y.i(acsPublicKeyEncoded, "acsPublicKeyEncoded");
                this.f26822a = sdkPrivateKeyEncoded;
                this.f26823b = acsPublicKeyEncoded;
            }

            private final boolean e(b bVar) {
                if (Arrays.equals(this.f26822a, bVar.f26822a) && Arrays.equals(this.f26823b, bVar.f26823b)) {
                    return true;
                }
                return false;
            }

            public final byte[] b() {
                return this.f26823b;
            }

            public final byte[] c() {
                return this.f26822a;
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
                    return e((b) obj);
                }
                return false;
            }

            public int hashCode() {
                return Z3.c.b(this.f26822a, this.f26823b);
            }

            public String toString() {
                return "Keys(sdkPrivateKeyEncoded=" + Arrays.toString(this.f26822a) + ", acsPublicKeyEncoded=" + Arrays.toString(this.f26823b) + ")";
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel out, int i8) {
                AbstractC3159y.i(out, "out");
                out.writeByteArray(this.f26822a);
                out.writeByteArray(this.f26823b);
            }
        }

        public a(V3.k messageTransformer, String sdkReferenceId, Y3.a creqData, String acsUrl, b keys) {
            AbstractC3159y.i(messageTransformer, "messageTransformer");
            AbstractC3159y.i(sdkReferenceId, "sdkReferenceId");
            AbstractC3159y.i(creqData, "creqData");
            AbstractC3159y.i(acsUrl, "acsUrl");
            AbstractC3159y.i(keys, "keys");
            this.f26817a = messageTransformer;
            this.f26818b = sdkReferenceId;
            this.f26819c = creqData;
            this.f26820d = acsUrl;
            this.f26821e = keys;
        }

        public final String b() {
            return this.f26820d;
        }

        public final b c() {
            return this.f26821e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final V3.k e() {
            return this.f26817a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f26817a, aVar.f26817a) && AbstractC3159y.d(this.f26818b, aVar.f26818b) && AbstractC3159y.d(this.f26819c, aVar.f26819c) && AbstractC3159y.d(this.f26820d, aVar.f26820d) && AbstractC3159y.d(this.f26821e, aVar.f26821e);
        }

        public final String f() {
            return this.f26818b;
        }

        public int hashCode() {
            return (((((((this.f26817a.hashCode() * 31) + this.f26818b.hashCode()) * 31) + this.f26819c.hashCode()) * 31) + this.f26820d.hashCode()) * 31) + this.f26821e.hashCode();
        }

        public String toString() {
            return "Config(messageTransformer=" + this.f26817a + ", sdkReferenceId=" + this.f26818b + ", creqData=" + this.f26819c + ", acsUrl=" + this.f26820d + ", keys=" + this.f26821e + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3159y.i(out, "out");
            out.writeSerializable(this.f26817a);
            out.writeString(this.f26818b);
            this.f26819c.writeToParcel(out, i8);
            out.writeString(this.f26820d);
            this.f26821e.writeToParcel(out, i8);
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends Serializable {
        c s(U3.c cVar, P5.g gVar);
    }

    Object a(Y3.a aVar, P5.d dVar);
}
