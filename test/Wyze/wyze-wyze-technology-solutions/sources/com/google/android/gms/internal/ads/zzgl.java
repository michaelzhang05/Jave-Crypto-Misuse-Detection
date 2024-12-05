package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.net.Uri;
import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.UUID;

@TargetApi(16)
@Deprecated
/* loaded from: classes2.dex */
public final class zzgl implements zzhn {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f15065b;

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f15066c;

    /* renamed from: d, reason: collision with root package name */
    private final FileDescriptor f15067d;

    /* renamed from: e, reason: collision with root package name */
    private final long f15068e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15069f;

    /* renamed from: g, reason: collision with root package name */
    private MediaExtractor f15070g;

    /* renamed from: h, reason: collision with root package name */
    private zzho[] f15071h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f15072i;

    /* renamed from: j, reason: collision with root package name */
    private int f15073j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f15074k;
    private boolean[] l;
    private long m;

    public zzgl(Context context, Uri uri, Map<String, String> map, int i2) {
        zzkh.d(zzkq.a >= 16);
        this.f15073j = 2;
        this.a = (Context) zzkh.c(context);
        this.f15065b = (Uri) zzkh.c(uri);
        this.f15066c = null;
        this.f15067d = null;
        this.f15068e = 0L;
        this.f15069f = 0L;
    }

    private final void b(long j2, boolean z) {
        if (!z && this.m == j2) {
            return;
        }
        this.m = j2;
        int i2 = 0;
        this.f15070g.seekTo(j2, 0);
        while (true) {
            int[] iArr = this.f15074k;
            if (i2 >= iArr.length) {
                return;
            }
            if (iArr[i2] != 0) {
                this.l[i2] = true;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void a() {
        MediaExtractor mediaExtractor;
        zzkh.d(this.f15073j > 0);
        int i2 = this.f15073j - 1;
        this.f15073j = i2;
        if (i2 != 0 || (mediaExtractor = this.f15070g) == null) {
            return;
        }
        mediaExtractor.release();
        this.f15070g = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void p(int i2, long j2) {
        zzkh.d(this.f15072i);
        zzkh.d(this.f15074k[i2] == 0);
        this.f15074k[i2] = 1;
        this.f15070g.selectTrack(i2);
        b(j2, j2 != 0);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final long q() {
        zzkh.d(this.f15072i);
        long cachedDuration = this.f15070g.getCachedDuration();
        if (cachedDuration == -1) {
            return -1L;
        }
        long sampleTime = this.f15070g.getSampleTime();
        if (sampleTime == -1) {
            return -3L;
        }
        return sampleTime + cachedDuration;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int r() {
        zzkh.d(this.f15072i);
        return this.f15074k.length;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void s(long j2) {
        zzkh.d(this.f15072i);
        b(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final boolean t(long j2) throws IOException {
        if (!this.f15072i) {
            MediaExtractor mediaExtractor = new MediaExtractor();
            this.f15070g = mediaExtractor;
            Context context = this.a;
            if (context != null) {
                mediaExtractor.setDataSource(context, this.f15065b, (Map<String, String>) null);
            } else {
                mediaExtractor.setDataSource((FileDescriptor) null, 0L, 0L);
            }
            int[] iArr = new int[this.f15070g.getTrackCount()];
            this.f15074k = iArr;
            this.l = new boolean[iArr.length];
            this.f15071h = new zzho[iArr.length];
            for (int i2 = 0; i2 < this.f15074k.length; i2++) {
                MediaFormat trackFormat = this.f15070g.getTrackFormat(i2);
                this.f15071h[i2] = new zzho(trackFormat.getString("mime"), trackFormat.containsKey("durationUs") ? trackFormat.getLong("durationUs") : -1L);
            }
            this.f15072i = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final zzho u(int i2) {
        zzkh.d(this.f15072i);
        return this.f15071h[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final int v(int i2, long j2, zzhk zzhkVar, zzhm zzhmVar, boolean z) {
        Map<UUID, byte[]> psshInfo;
        zzkh.d(this.f15072i);
        zzkh.d(this.f15074k[i2] != 0);
        boolean[] zArr = this.l;
        if (zArr[i2]) {
            zArr[i2] = false;
            return -5;
        }
        if (z) {
            return -2;
        }
        if (this.f15074k[i2] != 2) {
            zzhkVar.a = zzhj.b(this.f15070g.getTrackFormat(i2));
            zzhx zzhxVar = null;
            if (zzkq.a >= 18 && (psshInfo = this.f15070g.getPsshInfo()) != null && !psshInfo.isEmpty()) {
                zzhxVar = new zzhx("video/mp4");
                zzhxVar.a(psshInfo);
            }
            zzhkVar.f15101b = zzhxVar;
            this.f15074k[i2] = 2;
            return -4;
        }
        int sampleTrackIndex = this.f15070g.getSampleTrackIndex();
        if (sampleTrackIndex != i2) {
            return sampleTrackIndex < 0 ? -1 : -2;
        }
        ByteBuffer byteBuffer = zzhmVar.f15102b;
        if (byteBuffer != null) {
            int position = byteBuffer.position();
            int readSampleData = this.f15070g.readSampleData(zzhmVar.f15102b, position);
            zzhmVar.f15103c = readSampleData;
            zzhmVar.f15102b.position(position + readSampleData);
        } else {
            zzhmVar.f15103c = 0;
        }
        zzhmVar.f15105e = this.f15070g.getSampleTime();
        zzhmVar.f15104d = this.f15070g.getSampleFlags() & 3;
        if (zzhmVar.a()) {
            zzhmVar.a.b(this.f15070g);
        }
        this.m = -1L;
        this.f15070g.advance();
        return -3;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final boolean w(long j2) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzhn
    public final void x(int i2) {
        zzkh.d(this.f15072i);
        zzkh.d(this.f15074k[i2] != 0);
        this.f15070g.unselectTrack(i2);
        this.l[i2] = false;
        this.f15074k[i2] = 0;
    }
}
