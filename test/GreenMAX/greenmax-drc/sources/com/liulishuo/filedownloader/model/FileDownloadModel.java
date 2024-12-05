package com.liulishuo.filedownloader.model;

import android.content.ContentValues;
import android.os.Parcel;
import android.os.Parcelable;
import e.h.a.k0.f;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public class FileDownloadModel implements Parcelable {
    public static final Parcelable.Creator<FileDownloadModel> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private int f17188f;

    /* renamed from: g, reason: collision with root package name */
    private String f17189g;

    /* renamed from: h, reason: collision with root package name */
    private String f17190h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f17191i;

    /* renamed from: j, reason: collision with root package name */
    private String f17192j;

    /* renamed from: k, reason: collision with root package name */
    private final AtomicInteger f17193k;
    private final AtomicLong l;
    private long m;
    private String n;
    private String o;
    private int p;
    private boolean q;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<FileDownloadModel> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel createFromParcel(Parcel parcel) {
            return new FileDownloadModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadModel[] newArray(int i2) {
            return new FileDownloadModel[i2];
        }
    }

    public FileDownloadModel() {
        this.l = new AtomicLong();
        this.f17193k = new AtomicInteger();
    }

    public void A(long j2) {
        this.q = j2 > 2147483647L;
        this.m = j2;
    }

    public void B(String str) {
        this.f17189g = str;
    }

    public ContentValues C() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_id", Integer.valueOf(e()));
        contentValues.put("url", l());
        contentValues.put("path", f());
        contentValues.put("status", Byte.valueOf(h()));
        contentValues.put("sofar", Long.valueOf(g()));
        contentValues.put("total", Long.valueOf(k()));
        contentValues.put("errMsg", c());
        contentValues.put("etag", b());
        contentValues.put("connectionCount", Integer.valueOf(a()));
        contentValues.put("pathAsDirectory", Boolean.valueOf(q()));
        if (q() && d() != null) {
            contentValues.put("filename", d());
        }
        return contentValues;
    }

    public int a() {
        return this.p;
    }

    public String b() {
        return this.o;
    }

    public String c() {
        return this.n;
    }

    public String d() {
        return this.f17192j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f17188f;
    }

    public String f() {
        return this.f17190h;
    }

    public long g() {
        return this.l.get();
    }

    public byte h() {
        return (byte) this.f17193k.get();
    }

    public String i() {
        return f.B(f(), q(), d());
    }

    public String j() {
        if (i() == null) {
            return null;
        }
        return f.C(i());
    }

    public long k() {
        return this.m;
    }

    public String l() {
        return this.f17189g;
    }

    public void m(long j2) {
        this.l.addAndGet(j2);
    }

    public boolean n() {
        return this.m == -1;
    }

    public boolean p() {
        return this.q;
    }

    public boolean q() {
        return this.f17191i;
    }

    public void r() {
        this.p = 1;
    }

    public void s(int i2) {
        this.p = i2;
    }

    public void t(String str) {
        this.o = str;
    }

    public String toString() {
        return f.o("id[%d], url[%s], path[%s], status[%d], sofar[%s], total[%d], etag[%s], %s", Integer.valueOf(this.f17188f), this.f17189g, this.f17190h, Integer.valueOf(this.f17193k.get()), this.l, Long.valueOf(this.m), this.o, super.toString());
    }

    public void u(String str) {
        this.n = str;
    }

    public void v(String str) {
        this.f17192j = str;
    }

    public void w(int i2) {
        this.f17188f = i2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f17188f);
        parcel.writeString(this.f17189g);
        parcel.writeString(this.f17190h);
        parcel.writeByte(this.f17191i ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f17192j);
        parcel.writeByte((byte) this.f17193k.get());
        parcel.writeLong(this.l.get());
        parcel.writeLong(this.m);
        parcel.writeString(this.n);
        parcel.writeString(this.o);
        parcel.writeInt(this.p);
        parcel.writeByte(this.q ? (byte) 1 : (byte) 0);
    }

    public void x(String str, boolean z) {
        this.f17190h = str;
        this.f17191i = z;
    }

    public void y(long j2) {
        this.l.set(j2);
    }

    public void z(byte b2) {
        this.f17193k.set(b2);
    }

    protected FileDownloadModel(Parcel parcel) {
        this.f17188f = parcel.readInt();
        this.f17189g = parcel.readString();
        this.f17190h = parcel.readString();
        this.f17191i = parcel.readByte() != 0;
        this.f17192j = parcel.readString();
        this.f17193k = new AtomicInteger(parcel.readByte());
        this.l = new AtomicLong(parcel.readLong());
        this.m = parcel.readLong();
        this.n = parcel.readString();
        this.o = parcel.readString();
        this.p = parcel.readInt();
        this.q = parcel.readByte() != 0;
    }
}
