package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i8) {
            return new BatchReportMessage[i8];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f20857a;

    /* renamed from: b, reason: collision with root package name */
    private long f20858b;

    /* renamed from: c, reason: collision with root package name */
    private String f20859c;

    public BatchReportMessage(String str, String str2, long j8) {
        this.f20859c = str;
        this.f20857a = str2;
        this.f20858b = j8;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f20857a;
    }

    public long getTimestamp() {
        return this.f20858b;
    }

    public String getUuid() {
        return this.f20859c;
    }

    public void setReportMessage(String str) {
        this.f20857a = str;
    }

    public void setTimestamp(long j8) {
        this.f20858b = j8;
    }

    public void setUuid(String str) {
        this.f20859c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f20859c);
        parcel.writeString(this.f20857a);
        parcel.writeLong(this.f20858b);
    }

    protected BatchReportMessage(Parcel parcel) {
        this.f20859c = parcel.readString();
        this.f20857a = parcel.readString();
        this.f20858b = parcel.readLong();
    }
}
