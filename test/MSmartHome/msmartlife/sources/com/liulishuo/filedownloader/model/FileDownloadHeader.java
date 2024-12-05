package com.liulishuo.filedownloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class FileDownloadHeader implements Parcelable {
    public static final Parcelable.Creator<FileDownloadHeader> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private HashMap<String, List<String>> f17187f;

    /* loaded from: classes2.dex */
    static class a implements Parcelable.Creator<FileDownloadHeader> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader createFromParcel(Parcel parcel) {
            return new FileDownloadHeader(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public FileDownloadHeader[] newArray(int i2) {
            return new FileDownloadHeader[i2];
        }
    }

    public FileDownloadHeader() {
    }

    public void a(String str, String str2) {
        if (str != null) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException("name is empty");
            }
            if (str2 != null) {
                if (this.f17187f == null) {
                    this.f17187f = new HashMap<>();
                }
                List<String> list = this.f17187f.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f17187f.put(str, list);
                }
                if (list.contains(str2)) {
                    return;
                }
                list.add(str2);
                return;
            }
            throw new NullPointerException("value == null");
        }
        throw new NullPointerException("name == null");
    }

    public HashMap<String, List<String>> b() {
        return this.f17187f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f17187f.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeMap(this.f17187f);
    }

    protected FileDownloadHeader(Parcel parcel) {
        this.f17187f = parcel.readHashMap(String.class.getClassLoader());
    }
}
