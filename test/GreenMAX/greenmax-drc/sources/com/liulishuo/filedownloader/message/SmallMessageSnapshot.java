package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

/* loaded from: classes2.dex */
public abstract class SmallMessageSnapshot extends MessageSnapshot {

    /* loaded from: classes2.dex */
    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public CompletedFlowDirectlySnapshot(int i2, boolean z, int i3) {
            super(i2, z, i3);
        }
    }

    /* loaded from: classes2.dex */
    public static class PausedSnapshot extends PendingMessageSnapshot {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PausedSnapshot(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -2;
        }
    }

    /* loaded from: classes2.dex */
    public static class PendingMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final int f17177h;

        /* renamed from: i, reason: collision with root package name */
        private final int f17178i;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.e(), pendingMessageSnapshot.i(), pendingMessageSnapshot.j());
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int i() {
            return this.f17177h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f17178i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f17177h);
            parcel.writeInt(this.f17178i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PendingMessageSnapshot(int i2, int i3, int i4) {
            super(i2);
            this.f17177h = i3;
            this.f17178i = i4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17177h = parcel.readInt();
            this.f17178i = parcel.readInt();
        }
    }

    /* loaded from: classes2.dex */
    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements a {
        /* JADX INFO: Access modifiers changed from: package-private */
        public WarnFlowDirectlySnapshot(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }
    }

    /* loaded from: classes2.dex */
    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.b {
        /* JADX INFO: Access modifiers changed from: package-private */
        public WarnMessageSnapshot(int i2, int i3, int i4) {
            super(i2, i3, i4);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot.b
        public MessageSnapshot a() {
            return new PendingMessageSnapshot(this);
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.PendingMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    SmallMessageSnapshot(int i2) {
        super(i2);
        this.f17168g = false;
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public long f() {
        return i();
    }

    @Override // com.liulishuo.filedownloader.message.MessageSnapshot
    public long g() {
        return j();
    }

    /* loaded from: classes2.dex */
    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final int f17179h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProgressMessageSnapshot(int i2, int i3) {
            super(i2);
            this.f17179h = i3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int i() {
            return this.f17179h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f17179h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17179h = parcel.readInt();
        }
    }

    /* loaded from: classes2.dex */
    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* renamed from: j, reason: collision with root package name */
        private final int f17180j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public RetryMessageSnapshot(int i2, int i3, Throwable th, int i4) {
            super(i2, i3, th);
            this.f17180j = i4;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int h() {
            return this.f17180j;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 5;
        }

        @Override // com.liulishuo.filedownloader.message.SmallMessageSnapshot.ErrorMessageSnapshot, com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f17180j);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17180j = parcel.readInt();
        }
    }

    /* loaded from: classes2.dex */
    public static class CompletedSnapshot extends SmallMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final boolean f17169h;

        /* renamed from: i, reason: collision with root package name */
        private final int f17170i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CompletedSnapshot(int i2, boolean z, int i3) {
            super(i2);
            this.f17169h = z;
            this.f17170i = i3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f17170i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -3;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean p() {
            return this.f17169h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f17169h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f17170i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f17169h = parcel.readByte() != 0;
            this.f17170i = parcel.readInt();
        }
    }

    /* loaded from: classes2.dex */
    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final int f17175h;

        /* renamed from: i, reason: collision with root package name */
        private final Throwable f17176i;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ErrorMessageSnapshot(int i2, int i3, Throwable th) {
            super(i2);
            this.f17175h = i3;
            this.f17176i = th;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int i() {
            return this.f17175h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) -1;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public Throwable l() {
            return this.f17176i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f17175h);
            parcel.writeSerializable(this.f17176i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17175h = parcel.readInt();
            this.f17176i = (Throwable) parcel.readSerializable();
        }
    }

    SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    /* loaded from: classes2.dex */
    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h, reason: collision with root package name */
        private final boolean f17171h;

        /* renamed from: i, reason: collision with root package name */
        private final int f17172i;

        /* renamed from: j, reason: collision with root package name */
        private final String f17173j;

        /* renamed from: k, reason: collision with root package name */
        private final String f17174k;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ConnectedMessageSnapshot(int i2, boolean z, int i3, String str, String str2) {
            super(i2);
            this.f17171h = z;
            this.f17172i = i3;
            this.f17173j = str;
            this.f17174k = str2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String c() {
            return this.f17173j;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public String d() {
            return this.f17174k;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public int j() {
            return this.f17172i;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 2;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public boolean n() {
            return this.f17171h;
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.f17171h ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f17172i);
            parcel.writeString(this.f17173j);
            parcel.writeString(this.f17174k);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f17171h = parcel.readByte() != 0;
            this.f17172i = parcel.readInt();
            this.f17173j = parcel.readString();
            this.f17174k = parcel.readString();
        }
    }
}
