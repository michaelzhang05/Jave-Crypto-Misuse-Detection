package w4;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    private MediaPlayer f9775a;

    /* renamed from: b, reason: collision with root package name */
    private int f9776b = 0;

    /* renamed from: c, reason: collision with root package name */
    Callable f9777c;

    public b(AssetFileDescriptor assetFileDescriptor, float f6) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f9775a = mediaPlayer;
        mediaPlayer.setOnCompletionListener(this);
        this.f9775a.setOnPreparedListener(this);
        this.f9775a.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        this.f9775a.setAudioStreamType(3);
        this.f9775a.setVolume(f6, f6);
        this.f9775a.prepare();
    }

    private void a(Boolean bool) {
        Boolean valueOf = Boolean.valueOf(this.f9775a.isPlaying());
        if (valueOf.booleanValue()) {
            this.f9775a.pause();
            this.f9775a.setLooping(bool.booleanValue());
            this.f9775a.seekTo(0);
            this.f9775a.start();
        }
        if (!valueOf.booleanValue() && this.f9776b == 1) {
            this.f9776b = bool.booleanValue() ? 4 : 2;
            onPrepared(this.f9775a);
        } else {
            if (valueOf.booleanValue()) {
                return;
            }
            this.f9776b = bool.booleanValue() ? 4 : 2;
            this.f9775a.setLooping(bool.booleanValue());
            this.f9775a.start();
        }
    }

    public void b() {
        a(Boolean.TRUE);
    }

    public boolean c() {
        try {
            if (!this.f9775a.isPlaying()) {
                return false;
            }
            this.f9775a.pause();
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public void d(Callable callable) {
        this.f9777c = callable;
        a(Boolean.FALSE);
    }

    public void e() {
        this.f9775a.start();
    }

    public void f(float f6) {
        try {
            this.f9775a.setVolume(f6, f6);
        } catch (IllegalStateException unused) {
        }
    }

    public void g() {
        try {
            if (this.f9775a.isPlaying()) {
                this.f9776b = 0;
                this.f9775a.pause();
                this.f9775a.seekTo(0);
            }
        } catch (IllegalStateException unused) {
        }
    }

    public void h() {
        g();
        this.f9775a.release();
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        if (this.f9776b != 5) {
            this.f9776b = 0;
            try {
                g();
                Callable callable = this.f9777c;
                if (callable != null) {
                    callable.call();
                }
            } catch (Exception e6) {
                e6.printStackTrace();
            }
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        int i6;
        int i7 = this.f9776b;
        if (i7 == 2) {
            this.f9775a.setLooping(false);
            this.f9775a.seekTo(0);
            this.f9775a.start();
            i6 = 3;
        } else if (i7 != 4) {
            this.f9776b = 1;
            this.f9775a.seekTo(0);
            return;
        } else {
            this.f9775a.setLooping(true);
            this.f9775a.seekTo(0);
            this.f9775a.start();
            i6 = 5;
        }
        this.f9776b = i6;
    }
}
