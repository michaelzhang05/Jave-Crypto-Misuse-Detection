package com.stripe.android.model;

import P5.AbstractC1378t;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.StripeIntent;
import j6.C3205d;
import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class x implements Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private final String f25850a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25851b;

    /* renamed from: c, reason: collision with root package name */
    private final String f25852c;

    /* renamed from: d, reason: collision with root package name */
    private final b f25853d;

    /* loaded from: classes4.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x createFromParcel(Parcel parcel) {
            AbstractC3255y.i(parcel, "parcel");
            return new x(parcel.readString(), parcel.readString(), parcel.readString(), b.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final x[] newArray(int i8) {
            return new x[i8];
        }
    }

    public x(String source, String directoryServerName, String serverTransactionId, b directoryServerEncryption) {
        AbstractC3255y.i(source, "source");
        AbstractC3255y.i(directoryServerName, "directoryServerName");
        AbstractC3255y.i(serverTransactionId, "serverTransactionId");
        AbstractC3255y.i(directoryServerEncryption, "directoryServerEncryption");
        this.f25850a = source;
        this.f25851b = directoryServerName;
        this.f25852c = serverTransactionId;
        this.f25853d = directoryServerEncryption;
    }

    public final b a() {
        return this.f25853d;
    }

    public final String b() {
        return this.f25851b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return AbstractC3255y.d(this.f25850a, xVar.f25850a) && AbstractC3255y.d(this.f25851b, xVar.f25851b) && AbstractC3255y.d(this.f25852c, xVar.f25852c) && AbstractC3255y.d(this.f25853d, xVar.f25853d);
    }

    public final String g() {
        return this.f25850a;
    }

    public int hashCode() {
        return (((((this.f25850a.hashCode() * 31) + this.f25851b.hashCode()) * 31) + this.f25852c.hashCode()) * 31) + this.f25853d.hashCode();
    }

    public String toString() {
        return "Stripe3ds2Fingerprint(source=" + this.f25850a + ", directoryServerName=" + this.f25851b + ", serverTransactionId=" + this.f25852c + ", directoryServerEncryption=" + this.f25853d + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3255y.i(out, "out");
        out.writeString(this.f25850a);
        out.writeString(this.f25851b);
        out.writeString(this.f25852c);
        this.f25853d.writeToParcel(out, i8);
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable {

        /* renamed from: a, reason: collision with root package name */
        private final String f25856a;

        /* renamed from: b, reason: collision with root package name */
        private final PublicKey f25857b;

        /* renamed from: c, reason: collision with root package name */
        private final List f25858c;

        /* renamed from: d, reason: collision with root package name */
        private final String f25859d;

        /* renamed from: e, reason: collision with root package name */
        private static final a f25854e = new a(null);

        /* renamed from: f, reason: collision with root package name */
        public static final int f25855f = 8;
        public static final Parcelable.Creator<b> CREATOR = new C0528b();

        /* loaded from: classes4.dex */
        private static final class a {
            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final X509Certificate c(String str) {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                byte[] bytes = str.getBytes(C3205d.f34020b);
                AbstractC3255y.h(bytes, "getBytes(...)");
                Certificate generateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
                AbstractC3255y.g(generateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return (X509Certificate) generateCertificate;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final List d(List list) {
                List list2 = list;
                ArrayList arrayList = new ArrayList(AbstractC1378t.x(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(b.f25854e.c((String) it.next()));
                }
                return arrayList;
            }

            public /* synthetic */ a(AbstractC3247p abstractC3247p) {
                this();
            }
        }

        /* renamed from: com.stripe.android.model.x$b$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0528b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b createFromParcel(Parcel parcel) {
                AbstractC3255y.i(parcel, "parcel");
                String readString = parcel.readString();
                PublicKey publicKey = (PublicKey) parcel.readSerializable();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i8 = 0; i8 != readInt; i8++) {
                    arrayList.add(parcel.readSerializable());
                }
                return new b(readString, publicKey, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final b[] newArray(int i8) {
                return new b[i8];
            }
        }

        public b(String directoryServerId, PublicKey directoryServerPublicKey, List rootCerts, String str) {
            AbstractC3255y.i(directoryServerId, "directoryServerId");
            AbstractC3255y.i(directoryServerPublicKey, "directoryServerPublicKey");
            AbstractC3255y.i(rootCerts, "rootCerts");
            this.f25856a = directoryServerId;
            this.f25857b = directoryServerPublicKey;
            this.f25858c = rootCerts;
            this.f25859d = str;
        }

        public final String b() {
            return this.f25856a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f25856a, bVar.f25856a) && AbstractC3255y.d(this.f25857b, bVar.f25857b) && AbstractC3255y.d(this.f25858c, bVar.f25858c) && AbstractC3255y.d(this.f25859d, bVar.f25859d);
        }

        public final PublicKey g() {
            return this.f25857b;
        }

        public final String h() {
            return this.f25859d;
        }

        public int hashCode() {
            int hashCode = ((((this.f25856a.hashCode() * 31) + this.f25857b.hashCode()) * 31) + this.f25858c.hashCode()) * 31;
            String str = this.f25859d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final List i() {
            return this.f25858c;
        }

        public String toString() {
            return "DirectoryServerEncryption(directoryServerId=" + this.f25856a + ", directoryServerPublicKey=" + this.f25857b + ", rootCerts=" + this.f25858c + ", keyId=" + this.f25859d + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            AbstractC3255y.i(out, "out");
            out.writeString(this.f25856a);
            out.writeSerializable(this.f25857b);
            List list = this.f25858c;
            out.writeInt(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                out.writeSerializable((Serializable) it.next());
            }
            out.writeString(this.f25859d);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public b(java.lang.String r3, java.lang.String r4, java.util.List r5, java.lang.String r6) {
            /*
                r2 = this;
                java.lang.String r0 = "directoryServerId"
                kotlin.jvm.internal.AbstractC3255y.i(r3, r0)
                java.lang.String r0 = "dsCertificateData"
                kotlin.jvm.internal.AbstractC3255y.i(r4, r0)
                java.lang.String r0 = "rootCertsData"
                kotlin.jvm.internal.AbstractC3255y.i(r5, r0)
                com.stripe.android.model.x$b$a r0 = com.stripe.android.model.x.b.f25854e
                java.security.cert.X509Certificate r4 = com.stripe.android.model.x.b.a.a(r0, r4)
                java.security.PublicKey r4 = r4.getPublicKey()
                java.lang.String r1 = "getPublicKey(...)"
                kotlin.jvm.internal.AbstractC3255y.h(r4, r1)
                java.util.List r5 = com.stripe.android.model.x.b.a.b(r0, r5)
                r2.<init>(r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.x.b.<init>(java.lang.String, java.lang.String, java.util.List, java.lang.String):void");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(StripeIntent.a.j.b sdkData) {
        this(sdkData.i(), sdkData.h(), sdkData.p(), new b(sdkData.g().a(), sdkData.g().b(), sdkData.g().h(), sdkData.g().g()));
        AbstractC3255y.i(sdkData, "sdkData");
    }
}
