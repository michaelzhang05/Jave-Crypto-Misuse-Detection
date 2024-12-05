package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.zzk;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;

@zzard
@TargetApi(14)
/* loaded from: classes2.dex */
public final class zzbcd extends zzbco implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, TextureView.SurfaceTextureListener {

    /* renamed from: h, reason: collision with root package name */
    private static final Map<Integer, String> f13165h;

    /* renamed from: i, reason: collision with root package name */
    private final zzbdg f13166i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f13167j;

    /* renamed from: k, reason: collision with root package name */
    private int f13168k;
    private int l;
    private MediaPlayer m;
    private Uri n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private zzbdd t;
    private boolean u;
    private int v;
    private zzbcn w;

    static {
        HashMap hashMap = new HashMap();
        f13165h = hashMap;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 17) {
            hashMap.put(-1004, "MEDIA_ERROR_IO");
            hashMap.put(-1007, "MEDIA_ERROR_MALFORMED");
            hashMap.put(-1010, "MEDIA_ERROR_UNSUPPORTED");
            hashMap.put(-110, "MEDIA_ERROR_TIMED_OUT");
            hashMap.put(3, "MEDIA_INFO_VIDEO_RENDERING_START");
        }
        hashMap.put(100, "MEDIA_ERROR_SERVER_DIED");
        hashMap.put(1, "MEDIA_ERROR_UNKNOWN");
        hashMap.put(1, "MEDIA_INFO_UNKNOWN");
        hashMap.put(700, "MEDIA_INFO_VIDEO_TRACK_LAGGING");
        hashMap.put(701, "MEDIA_INFO_BUFFERING_START");
        hashMap.put(702, "MEDIA_INFO_BUFFERING_END");
        hashMap.put(800, "MEDIA_INFO_BAD_INTERLEAVING");
        hashMap.put(801, "MEDIA_INFO_NOT_SEEKABLE");
        hashMap.put(802, "MEDIA_INFO_METADATA_UPDATE");
        if (i2 >= 19) {
            hashMap.put(901, "MEDIA_INFO_UNSUPPORTED_SUBTITLE");
            hashMap.put(902, "MEDIA_INFO_SUBTITLE_TIMED_OUT");
        }
    }

    public zzbcd(Context context, boolean z, boolean z2, zzbde zzbdeVar, zzbdg zzbdgVar) {
        super(context);
        this.f13168k = 0;
        this.l = 0;
        setSurfaceTextureListener(this);
        this.f13166i = zzbdgVar;
        this.u = z;
        this.f13167j = z2;
        zzbdgVar.b(this);
    }

    private final void q(boolean z) {
        zzawz.m("AdMediaPlayerView release");
        zzbdd zzbddVar = this.t;
        if (zzbddVar != null) {
            zzbddVar.j();
            this.t = null;
        }
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
            this.m.release();
            this.m = null;
            r(0);
            if (z) {
                this.l = 0;
                this.l = 0;
            }
        }
    }

    private final void r(int i2) {
        if (i2 == 3) {
            this.f13166i.e();
            this.f13170g.d();
        } else if (this.f13168k == 3) {
            this.f13166i.f();
            this.f13170g.e();
        }
        this.f13168k = i2;
    }

    private final void w(float f2) {
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.setVolume(f2, f2);
            } catch (IllegalStateException unused) {
            }
        } else {
            zzbad.i("AdMediaPlayerView setMediaPlayerVolume() called before onPrepared().");
        }
    }

    private final void x() {
        zzawz.m("AdMediaPlayerView init MediaPlayer");
        SurfaceTexture surfaceTexture = getSurfaceTexture();
        if (this.n == null || surfaceTexture == null) {
            return;
        }
        q(false);
        try {
            zzk.zzlw();
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.m = mediaPlayer;
            mediaPlayer.setOnBufferingUpdateListener(this);
            this.m.setOnCompletionListener(this);
            this.m.setOnErrorListener(this);
            this.m.setOnInfoListener(this);
            this.m.setOnPreparedListener(this);
            this.m.setOnVideoSizeChangedListener(this);
            this.q = 0;
            if (this.u) {
                zzbdd zzbddVar = new zzbdd(getContext());
                this.t = zzbddVar;
                zzbddVar.b(surfaceTexture, getWidth(), getHeight());
                this.t.start();
                SurfaceTexture k2 = this.t.k();
                if (k2 != null) {
                    surfaceTexture = k2;
                } else {
                    this.t.j();
                    this.t = null;
                }
            }
            this.m.setDataSource(getContext(), this.n);
            zzk.zzlx();
            this.m.setSurface(new Surface(surfaceTexture));
            this.m.setAudioStreamType(3);
            this.m.setScreenOnWhilePlaying(true);
            this.m.prepareAsync();
            r(1);
        } catch (IOException | IllegalArgumentException | IllegalStateException e2) {
            String valueOf = String.valueOf(this.n);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Failed to initialize MediaPlayer at ");
            sb.append(valueOf);
            zzbad.d(sb.toString(), e2);
            onError(this.m, 1, 0);
        }
    }

    private final void y() {
        if (this.f13167j && z() && this.m.getCurrentPosition() > 0 && this.l != 3) {
            zzawz.m("AdMediaPlayerView nudging MediaPlayer");
            w(0.0f);
            this.m.start();
            int currentPosition = this.m.getCurrentPosition();
            long a = zzk.zzln().a();
            while (z() && this.m.getCurrentPosition() == currentPosition && zzk.zzln().a() - a <= 250) {
            }
            this.m.pause();
            a();
        }
    }

    private final boolean z() {
        int i2;
        return (this.m == null || (i2 = this.f13168k) == -1 || i2 == 0 || i2 == 1) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbco, com.google.android.gms.internal.ads.g8
    public final void a() {
        w(this.f13170g.a());
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void c() {
        zzawz.m("AdMediaPlayerView pause");
        if (z() && this.m.isPlaying()) {
            this.m.pause();
            r(4);
            zzaxi.a.post(new v7(this));
        }
        this.l = 4;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void d() {
        zzawz.m("AdMediaPlayerView play");
        if (z()) {
            this.m.start();
            r(3);
            this.f13169f.b();
            zzaxi.a.post(new u7(this));
        }
        this.l = 3;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void e(int i2) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("AdMediaPlayerView seek ");
        sb.append(i2);
        zzawz.m(sb.toString());
        if (z()) {
            this.m.seekTo(i2);
            this.v = 0;
        } else {
            this.v = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void f() {
        zzawz.m("AdMediaPlayerView stop");
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            this.m.release();
            this.m = null;
            r(0);
            this.l = 0;
        }
        this.f13166i.a();
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void g(float f2, float f3) {
        zzbdd zzbddVar = this.t;
        if (zzbddVar != null) {
            zzbddVar.e(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getCurrentPosition() {
        if (z()) {
            return this.m.getCurrentPosition();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getDuration() {
        if (z()) {
            return this.m.getDuration();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoHeight() {
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final int getVideoWidth() {
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void h(zzbcn zzbcnVar) {
        this.w = zzbcnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final String o() {
        String str = this.u ? " spherical" : HttpUrl.FRAGMENT_ENCODE_SET;
        return str.length() != 0 ? "MediaPlayer".concat(str) : new String("MediaPlayer");
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i2) {
        this.q = i2;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        zzawz.m("AdMediaPlayerView completion");
        r(5);
        this.l = 5;
        zzaxi.a.post(new p7(this));
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f13165h;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 38 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer error: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzbad.i(sb.toString());
        r(-1);
        this.l = -1;
        zzaxi.a.post(new q7(this, str, str2));
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i2, int i3) {
        Map<Integer, String> map = f13165h;
        String str = map.get(Integer.valueOf(i2));
        String str2 = map.get(Integer.valueOf(i3));
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 37 + String.valueOf(str2).length());
        sb.append("AdMediaPlayerView MediaPlayer info: ");
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        zzawz.m(sb.toString());
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0065, code lost:
    
        if (r1 > r6) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.o
            int r0 = android.view.TextureView.getDefaultSize(r0, r6)
            int r1 = r5.p
            int r1 = android.view.TextureView.getDefaultSize(r1, r7)
            int r2 = r5.o
            if (r2 <= 0) goto L83
            int r2 = r5.p
            if (r2 <= 0) goto L83
            com.google.android.gms.internal.ads.zzbdd r2 = r5.t
            if (r2 != 0) goto L83
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L47
            if (r1 != r2) goto L47
            int r0 = r5.o
            int r1 = r0 * r7
            int r2 = r5.p
            int r3 = r6 * r2
            if (r1 >= r3) goto L3c
            int r0 = r0 * r7
            int r0 = r0 / r2
            goto L6a
        L3c:
            int r1 = r0 * r7
            int r3 = r6 * r2
            if (r1 <= r3) goto L67
            int r2 = r2 * r6
            int r1 = r2 / r0
            goto L58
        L47:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L5a
            int r0 = r5.p
            int r0 = r0 * r6
            int r2 = r5.o
            int r0 = r0 / r2
            if (r1 != r3) goto L57
            if (r0 <= r7) goto L57
            goto L67
        L57:
            r1 = r0
        L58:
            r0 = r6
            goto L83
        L5a:
            if (r1 != r2) goto L6c
            int r1 = r5.o
            int r1 = r1 * r7
            int r2 = r5.p
            int r1 = r1 / r2
            if (r0 != r3) goto L69
            if (r1 <= r6) goto L69
        L67:
            r0 = r6
            goto L6a
        L69:
            r0 = r1
        L6a:
            r1 = r7
            goto L83
        L6c:
            int r2 = r5.o
            int r4 = r5.p
            if (r1 != r3) goto L78
            if (r4 <= r7) goto L78
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L7a
        L78:
            r1 = r2
            r7 = r4
        L7a:
            if (r0 != r3) goto L69
            if (r1 <= r6) goto L69
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L58
        L83:
            r5.setMeasuredDimension(r0, r1)
            com.google.android.gms.internal.ads.zzbdd r6 = r5.t
            if (r6 == 0) goto L8d
            r6.i(r0, r1)
        L8d:
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 16
            if (r6 != r7) goto La6
            int r6 = r5.r
            if (r6 <= 0) goto L99
            if (r6 != r0) goto L9f
        L99:
            int r6 = r5.s
            if (r6 <= 0) goto La2
            if (r6 == r1) goto La2
        L9f:
            r5.y()
        La2:
            r5.r = r0
            r5.s = r1
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbcd.onMeasure(int, int):void");
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        zzawz.m("AdMediaPlayerView prepared");
        r(2);
        this.f13166i.d();
        zzaxi.a.post(new o7(this));
        this.o = mediaPlayer.getVideoWidth();
        this.p = mediaPlayer.getVideoHeight();
        int i2 = this.v;
        if (i2 != 0) {
            e(i2);
        }
        y();
        int i3 = this.o;
        int i4 = this.p;
        StringBuilder sb = new StringBuilder(62);
        sb.append("AdMediaPlayerView stream dimensions: ");
        sb.append(i3);
        sb.append(" x ");
        sb.append(i4);
        zzbad.h(sb.toString());
        if (this.l == 3) {
            d();
        }
        a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzawz.m("AdMediaPlayerView surface created");
        x();
        zzaxi.a.post(new r7(this));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzawz.m("AdMediaPlayerView surface destroyed");
        MediaPlayer mediaPlayer = this.m;
        if (mediaPlayer != null && this.v == 0) {
            this.v = mediaPlayer.getCurrentPosition();
        }
        zzbdd zzbddVar = this.t;
        if (zzbddVar != null) {
            zzbddVar.j();
        }
        zzaxi.a.post(new t7(this));
        q(true);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
        zzawz.m("AdMediaPlayerView surface changed");
        boolean z = this.l == 3;
        boolean z2 = this.o == i2 && this.p == i3;
        if (this.m != null && z && z2) {
            int i4 = this.v;
            if (i4 != 0) {
                e(i4);
            }
            d();
        }
        zzbdd zzbddVar = this.t;
        if (zzbddVar != null) {
            zzbddVar.i(i2, i3);
        }
        zzaxi.a.post(new s7(this, i2, i3));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f13166i.c(this);
        this.f13169f.a(surfaceTexture, this.w);
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdMediaPlayerView size changed: ");
        sb.append(i2);
        sb.append(" x ");
        sb.append(i3);
        zzawz.m(sb.toString());
        this.o = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.p = videoHeight;
        if (this.o == 0 || videoHeight == 0) {
            return;
        }
        requestLayout();
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i2) {
        StringBuilder sb = new StringBuilder(58);
        sb.append("AdMediaPlayerView window visibility changed to ");
        sb.append(i2);
        zzawz.m(sb.toString());
        zzaxi.a.post(new Runnable(this, i2) { // from class: com.google.android.gms.internal.ads.n7

            /* renamed from: f, reason: collision with root package name */
            private final zzbcd f11855f;

            /* renamed from: g, reason: collision with root package name */
            private final int f11856g;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.f11855f = this;
                this.f11856g = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11855f.s(this.f11856g);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void s(int i2) {
        zzbcn zzbcnVar = this.w;
        if (zzbcnVar != null) {
            zzbcnVar.onWindowVisibilityChanged(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbco
    public final void setVideoPath(String str) {
        Uri parse = Uri.parse(str);
        zzvv z = zzvv.z(parse);
        if (z == null || z.f15686f != null) {
            if (z != null) {
                parse = Uri.parse(z.f15686f);
            }
            this.n = parse;
            this.v = 0;
            x();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public final String toString() {
        String name = zzbcd.class.getName();
        String hexString = Integer.toHexString(hashCode());
        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
        sb.append(name);
        sb.append("@");
        sb.append(hexString);
        return sb.toString();
    }
}
