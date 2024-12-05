package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes2.dex */
public final class zzjv implements zzkf {
    private final zzke a;

    /* renamed from: b, reason: collision with root package name */
    private RandomAccessFile f15203b;

    /* renamed from: c, reason: collision with root package name */
    private String f15204c;

    /* renamed from: d, reason: collision with root package name */
    private long f15205d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f15206e;

    public zzjv() {
        this(null);
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws zzjw {
        try {
            this.f15204c = zzjqVar.a.toString();
            RandomAccessFile randomAccessFile = new RandomAccessFile(zzjqVar.a.getPath(), "r");
            this.f15203b = randomAccessFile;
            randomAccessFile.seek(zzjqVar.f15182c);
            long j2 = zzjqVar.f15183d;
            if (j2 == -1) {
                j2 = this.f15203b.length() - zzjqVar.f15182c;
            }
            this.f15205d = j2;
            if (j2 >= 0) {
                this.f15206e = true;
                zzke zzkeVar = this.a;
                if (zzkeVar != null) {
                    zzkeVar.b();
                }
                return this.f15205d;
            }
            throw new EOFException();
        } catch (IOException e2) {
            throw new zzjw(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzjp
    public final void close() throws zzjw {
        RandomAccessFile randomAccessFile = this.f15203b;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                } catch (IOException e2) {
                    throw new zzjw(e2);
                }
            } finally {
                this.f15203b = null;
                this.f15204c = null;
                if (this.f15206e) {
                    this.f15206e = false;
                    zzke zzkeVar = this.a;
                    if (zzkeVar != null) {
                        zzkeVar.c();
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws zzjw {
        long j2 = this.f15205d;
        if (j2 == 0) {
            return -1;
        }
        try {
            int read = this.f15203b.read(bArr, i2, (int) Math.min(j2, i3));
            if (read > 0) {
                this.f15205d -= read;
                zzke zzkeVar = this.a;
                if (zzkeVar != null) {
                    zzkeVar.a(read);
                }
            }
            return read;
        } catch (IOException e2) {
            throw new zzjw(e2);
        }
    }

    public zzjv(zzke zzkeVar) {
        this.a = zzkeVar;
    }
}
