package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import e.h.a.k0.f;

/* loaded from: classes2.dex */
public abstract class MessageSnapshot implements Parcelable {
    public static final Parcelable.Creator<MessageSnapshot> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private final int f17167f;

    /* renamed from: g, reason: collision with root package name */
    protected boolean f17168g;

    /* loaded from: classes2.dex */
    public static class NoFieldException extends IllegalStateException {
        NoFieldException(String str, MessageSnapshot messageSnapshot) {
            super(f.o("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.e()), Byte.valueOf(messageSnapshot.k()), messageSnapshot.getClass().getName()));
        }
    }

    /* loaded from: classes2.dex */
    public static class StartedMessageSnapshot extends MessageSnapshot {
        /* JADX INFO: Access modifiers changed from: package-private */
        public StartedMessageSnapshot(int i2) {
            super(i2);
        }

        @Override // com.liulishuo.filedownloader.message.MessageSnapshot
        public byte k() {
            return (byte) 6;
        }

        StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<MessageSnapshot> {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public com.liulishuo.filedownloader.message.MessageSnapshot createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                byte r0 = r5.readByte()
                r1 = 1
                if (r0 != r1) goto L9
                r0 = 1
                goto La
            L9:
                r0 = 0
            La:
                byte r2 = r5.readByte()
                r3 = -4
                if (r2 == r3) goto L84
                r3 = -3
                if (r2 == r3) goto L76
                r3 = -1
                if (r2 == r3) goto L68
                if (r2 == r1) goto L5a
                r1 = 2
                if (r2 == r1) goto L4c
                r1 = 3
                if (r2 == r1) goto L3e
                r1 = 5
                if (r2 == r1) goto L30
                r1 = 6
                if (r2 == r1) goto L28
                r5 = 0
                goto L92
            L28:
                com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot
                r1.<init>(r5)
            L2d:
                r5 = r1
                goto L92
            L30:
                if (r0 == 0) goto L38
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L38:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L3e:
                if (r0 == 0) goto L46
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L46:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L4c:
                if (r0 == 0) goto L54
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L54:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L5a:
                if (r0 == 0) goto L62
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L62:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L68:
                if (r0 == 0) goto L70
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L70:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L76:
                if (r0 == 0) goto L7e
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L2d
            L7e:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L2d
            L84:
                if (r0 == 0) goto L8c
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L8c:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L2d
            L92:
                if (r5 == 0) goto L97
                r5.f17168g = r0
                return r5
            L97:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Can't restore the snapshot because unknown status: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                goto Laf
            Lae:
                throw r5
            Laf:
                goto Lae
            */
            throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.message.MessageSnapshot.a.createFromParcel(android.os.Parcel):com.liulishuo.filedownloader.message.MessageSnapshot");
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MessageSnapshot[] newArray(int i2) {
            return new MessageSnapshot[i2];
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        MessageSnapshot a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageSnapshot(int i2) {
        this.f17167f = i2;
    }

    public String c() {
        throw new NoFieldException("getEtag", this);
    }

    public String d() {
        throw new NoFieldException("getFileName", this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f17167f;
    }

    public long f() {
        throw new NoFieldException("getLargeSofarBytes", this);
    }

    public long g() {
        throw new NoFieldException("getLargeTotalBytes", this);
    }

    public int h() {
        throw new NoFieldException("getRetryingTimes", this);
    }

    public int i() {
        throw new NoFieldException("getSmallSofarBytes", this);
    }

    public int j() {
        throw new NoFieldException("getSmallTotalBytes", this);
    }

    public abstract /* synthetic */ byte k();

    public Throwable l() {
        throw new NoFieldException("getThrowable", this);
    }

    public boolean m() {
        return this.f17168g;
    }

    public boolean n() {
        throw new NoFieldException("isResuming", this);
    }

    public boolean p() {
        throw new NoFieldException("isReusedDownloadedFile", this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeByte(this.f17168g ? (byte) 1 : (byte) 0);
        parcel.writeByte(k());
        parcel.writeInt(this.f17167f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MessageSnapshot(Parcel parcel) {
        this.f17167f = parcel.readInt();
    }
}
