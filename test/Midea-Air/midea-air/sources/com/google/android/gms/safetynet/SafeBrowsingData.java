package com.google.android.gms.safetynet;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* loaded from: classes2.dex */
public class SafeBrowsingData extends AbstractSafeParcelable {

    /* renamed from: g, reason: collision with root package name */
    @SafeParcelable.Field
    private String f16294g;

    /* renamed from: h, reason: collision with root package name */
    @SafeParcelable.Field
    private DataHolder f16295h;

    /* renamed from: i, reason: collision with root package name */
    @SafeParcelable.Field
    private ParcelFileDescriptor f16296i;

    /* renamed from: j, reason: collision with root package name */
    @SafeParcelable.Field
    private long f16297j;

    /* renamed from: k, reason: collision with root package name */
    @SafeParcelable.Field
    private byte[] f16298k;
    private byte[] l;
    private File m;

    /* renamed from: f, reason: collision with root package name */
    private static final String f16293f = SafeBrowsingData.class.getSimpleName();
    public static final Parcelable.Creator<SafeBrowsingData> CREATOR = new zzj();

    public SafeBrowsingData() {
        this(null, null, null, 0L, null);
    }

    @SafeParcelable.Constructor
    public SafeBrowsingData(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) DataHolder dataHolder, @SafeParcelable.Param(id = 4) ParcelFileDescriptor parcelFileDescriptor, @SafeParcelable.Param(id = 5) long j2, @SafeParcelable.Param(id = 6) byte[] bArr) {
        this.f16294g = str;
        this.f16295h = dataHolder;
        this.f16296i = parcelFileDescriptor;
        this.f16297j = j2;
        this.f16298k = bArr;
    }

    private final FileOutputStream P() {
        Throwable th;
        File file;
        File file2 = this.m;
        if (file2 == null) {
            return null;
        }
        try {
            file = File.createTempFile("xlb", ".tmp", file2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f16296i = ParcelFileDescriptor.open(file, 268435456);
                if (file != null) {
                    file.delete();
                }
                return fileOutputStream;
            } catch (IOException unused) {
                if (file != null) {
                    file.delete();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (file != null) {
                    file.delete();
                }
                throw th;
            }
        } catch (IOException unused2) {
            file = null;
        } catch (Throwable th3) {
            th = th3;
            file = null;
        }
    }

    private static void Y(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public long D() {
        return this.f16297j;
    }

    public String J() {
        return this.f16294g;
    }

    public byte[] L() {
        return this.f16298k;
    }

    public DataHolder w() {
        return this.f16295h;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f16296i
            r1 = 1
            if (r0 != 0) goto L31
            byte[] r0 = r3.l
            if (r0 == 0) goto L31
            java.io.FileOutputStream r0 = r3.P()
            if (r0 == 0) goto L31
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.l     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            int r2 = r2.length     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            byte[] r2 = r3.l     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r0.write(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            Y(r0)
            r0 = 1
            goto L32
        L29:
            r4 = move-exception
            Y(r0)
            throw r4
        L2e:
            Y(r0)
        L31:
            r0 = 0
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r5 = r5 | r1
        L36:
            com.google.android.gms.safetynet.zzj.a(r3, r4, r5)
            r4 = 0
            r3.f16296i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.safetynet.SafeBrowsingData.writeToParcel(android.os.Parcel, int):void");
    }

    public ParcelFileDescriptor z() {
        return this.f16296i;
    }
}
