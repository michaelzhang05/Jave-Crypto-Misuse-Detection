package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* loaded from: classes2.dex */
public abstract class LargeMessageSnapshot extends MessageSnapshot {

    /* loaded from: classes2.dex */
    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public CompletedFlowDirectlySnapshot(int i2, boolean z, long j2) {
            super(i2, z, j2);
        }
    }

    /* loaded from: classes2.dex */
    public static class PausedSnapshot extends PendingMessageSnapshot {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PausedSnapshot(int i2, long j2, long j3) {
            super(i2, j2, j3);
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -2;
        }
    }

    /* loaded from: classes2.dex */
    public static class PendingMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final long f17163h;

        /* renamed from: i, reason: collision with root package name */
        private final long f17164i;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.e(), pendingMessageSnapshot.f(), pendingMessageSnapshot.g());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long f() {
            return this.f17163h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long g() {
            return this.f17164i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f17163h);
            parcel.writeLong(this.f17164i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PendingMessageSnapshot(int i2, long j2, long j3) {
            super(i2);
            this.f17163h = j2;
            this.f17164i = j3;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17163h = parcel.readLong();
            this.f17164i = parcel.readLong();
        }
    }

    /* loaded from: classes2.dex */
    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public WarnFlowDirectlySnapshot(int i2, long j2, long j3) {
            super(i2, j2, j3);
        }
    }

    /* loaded from: classes2.dex */
    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public WarnMessageSnapshot(int i2, long j2, long j3) {
            super(i2, j2, j3);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.b
        public MessageSnapshot a() {
            return new PendingMessageSnapshot(this);
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    LargeMessageSnapshot(int i2) {
        super(i2);
        this.f17168g = true;
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public int i() {
        if (f() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) f();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public int j() {
        if (g() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) g();
    }

    /* loaded from: classes2.dex */
    public static class ProgressMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final long f17165h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProgressMessageSnapshot(int i2, long j2) {
            super(i2);
            this.f17165h = j2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long f() {
            return this.f17165h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f17165h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17165h = parcel.readLong();
        }
    }

    /* loaded from: classes2.dex */
    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* renamed from: j, reason: collision with root package name */
        private final int f17166j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RetryMessageSnapshot(int i2, long j2, Throwable th, int i3) {
            super(i2, j2, th);
            this.f17166j = i3;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int h() {
            return this.f17166j;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.LargeMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f17166j);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17166j = parcel.readInt();
        }
    }

    /* loaded from: classes2.dex */
    public static class CompletedSnapshot extends LargeMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final boolean f17155h;

        /* renamed from: i, reason: collision with root package name */
        private final long f17156i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CompletedSnapshot(int i2, boolean z, long j2) {
            super(i2);
            this.f17155h = z;
            this.f17156i = j2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long g() {
            return this.f17156i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean p() {
            return this.f17155h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f17155h ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f17156i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f17155h = parcel.readByte() != 0;
            this.f17156i = parcel.readLong();
        }
    }

    /* loaded from: classes2.dex */
    public static class ErrorMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final long f17161h;

        /* renamed from: i, reason: collision with root package name */
        private final Throwable f17162i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ErrorMessageSnapshot(int i2, long j2, Throwable th) {
            super(i2);
            this.f17161h = j2;
            this.f17162i = th;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long f() {
            return this.f17161h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public Throwable l() {
            return this.f17162i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeLong(this.f17161h);
            parcel.writeSerializable(this.f17162i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17161h = parcel.readLong();
            this.f17162i = (Throwable) parcel.readSerializable();
        }
    }

    LargeMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    /* loaded from: classes2.dex */
    public static class ConnectedMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final boolean f17157h;

        /* renamed from: i, reason: collision with root package name */
        private final long f17158i;

        /* renamed from: j, reason: collision with root package name */
        private final String f17159j;

        /* renamed from: k, reason: collision with root package name */
        private final String f17160k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ConnectedMessageSnapshot(int i2, boolean z, long j2, String str, String str2) {
            super(i2);
            this.f17157h = z;
            this.f17158i = j2;
            this.f17159j = str;
            this.f17160k = str2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String c() {
            return this.f17159j;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String d() {
            return this.f17160k;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public long g() {
            return this.f17158i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean n() {
            return this.f17157h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f17157h ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f17158i);
            parcel.writeString(this.f17159j);
            parcel.writeString(this.f17160k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17157h = parcel.readByte() != 0;
            this.f17158i = parcel.readLong();
            this.f17159j = parcel.readString();
            this.f17160k = parcel.readString();
        }
    }
}
