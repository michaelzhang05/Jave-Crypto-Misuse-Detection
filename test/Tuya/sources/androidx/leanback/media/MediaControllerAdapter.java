package androidx.leanback.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.cache.CacheDataSource;

/* loaded from: classes3.dex */
public class MediaControllerAdapter extends PlayerAdapter {
    private static final boolean DEBUG = false;
    private static final String TAG = "MediaControllerAdapter";
    private MediaControllerCompat mController;
    Handler mHandler = new Handler();
    private final Runnable mPositionUpdaterRunnable = new Runnable() { // from class: androidx.leanback.media.MediaControllerAdapter.1
        @Override // java.lang.Runnable
        public void run() {
            MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
            MediaControllerAdapter.this.mHandler.postDelayed(this, r0.getUpdatePeriod());
        }
    };
    boolean mIsBuffering = false;
    MediaControllerCompat.a mMediaControllerCallback = new MediaControllerCompat.a() { // from class: androidx.leanback.media.MediaControllerAdapter.2
        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
            MediaControllerAdapter.this.getCallback().onMetadataChanged(MediaControllerAdapter.this);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.a
        public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
            if (MediaControllerAdapter.this.mIsBuffering && playbackStateCompat.n() != 6) {
                MediaControllerAdapter.this.getCallback().onBufferingStateChanged(MediaControllerAdapter.this, false);
                MediaControllerAdapter.this.getCallback().onBufferedPositionChanged(MediaControllerAdapter.this);
                MediaControllerAdapter.this.mIsBuffering = false;
            }
            if (playbackStateCompat.n() != 0) {
                if (playbackStateCompat.n() == 1) {
                    MediaControllerAdapter.this.getCallback().onPlayCompleted(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.n() == 2) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.n() == 3) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.n() == 6) {
                    MediaControllerAdapter mediaControllerAdapter = MediaControllerAdapter.this;
                    mediaControllerAdapter.mIsBuffering = true;
                    mediaControllerAdapter.getCallback().onBufferingStateChanged(MediaControllerAdapter.this, true);
                    MediaControllerAdapter.this.getCallback().onBufferedPositionChanged(MediaControllerAdapter.this);
                    return;
                }
                if (playbackStateCompat.n() == 7) {
                    if (playbackStateCompat.i() == null) {
                        MediaControllerAdapter.this.getCallback().onError(MediaControllerAdapter.this, playbackStateCompat.f(), "");
                        return;
                    } else {
                        MediaControllerAdapter.this.getCallback().onError(MediaControllerAdapter.this, playbackStateCompat.f(), playbackStateCompat.i().toString());
                        return;
                    }
                }
                if (playbackStateCompat.n() == 4) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                } else if (playbackStateCompat.n() == 5) {
                    MediaControllerAdapter.this.getCallback().onPlayStateChanged(MediaControllerAdapter.this);
                    MediaControllerAdapter.this.getCallback().onCurrentPositionChanged(MediaControllerAdapter.this);
                }
            }
        }
    };

    public MediaControllerAdapter(MediaControllerCompat mediaControllerCompat) {
        if (mediaControllerCompat != null) {
            this.mController = mediaControllerCompat;
            return;
        }
        throw new NullPointerException("Object of MediaControllerCompat is null");
    }

    private int mapRepeatActionToRepeatMode(int i8) {
        if (i8 == 0) {
            return 0;
        }
        if (i8 != 1) {
            return i8 != 2 ? -1 : 1;
        }
        return 2;
    }

    private int mapShuffleActionToShuffleMode(int i8) {
        if (i8 != 0) {
            return i8 != 1 ? -1 : 1;
        }
        return 0;
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void fastForward() {
        this.mController.d().a();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getBufferedPosition() {
        if (this.mController.c() == null) {
            return 0L;
        }
        return this.mController.c().e();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getCurrentPosition() {
        if (this.mController.c() == null) {
            return 0L;
        }
        return this.mController.c().k();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getDuration() {
        if (this.mController.b() == null) {
            return 0L;
        }
        return (int) this.mController.b().f("android.media.metadata.DURATION");
    }

    public Drawable getMediaArt(Context context) {
        Bitmap c8;
        if (this.mController.b() == null || (c8 = this.mController.b().e().c()) == null) {
            return null;
        }
        return new BitmapDrawable(context.getResources(), c8);
    }

    public MediaControllerCompat getMediaController() {
        return this.mController;
    }

    public CharSequence getMediaSubtitle() {
        if (this.mController.b() == null) {
            return "";
        }
        return this.mController.b().e().f();
    }

    public CharSequence getMediaTitle() {
        if (this.mController.b() == null) {
            return "";
        }
        return this.mController.b().e().i();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public long getSupportedActions() {
        long j8;
        if (this.mController.c() == null) {
            return 0L;
        }
        long c8 = this.mController.c().c();
        if ((c8 & 512) != 0) {
            j8 = 64;
        } else {
            j8 = 0;
        }
        if ((c8 & 32) != 0) {
            j8 |= 256;
        }
        if ((c8 & 16) != 0) {
            j8 |= 16;
        }
        if ((64 & c8) != 0) {
            j8 |= 128;
        }
        if ((8 & c8) != 0) {
            j8 |= 32;
        }
        if ((262144 & c8) != 0) {
            j8 |= 512;
        }
        if ((c8 & CacheDataSource.DEFAULT_MAX_CACHE_FILE_SIZE) != 0) {
            return j8 | 1024;
        }
        return j8;
    }

    int getUpdatePeriod() {
        return 16;
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public boolean isPlaying() {
        if (this.mController.c() == null) {
            return false;
        }
        if (this.mController.c().n() != 3 && this.mController.c().n() != 4 && this.mController.c().n() != 5) {
            return false;
        }
        return true;
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void next() {
        this.mController.d().h();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onAttachedToHost(PlaybackGlueHost playbackGlueHost) {
        this.mController.e(this.mMediaControllerCallback);
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void onDetachedFromHost() {
        this.mController.g(this.mMediaControllerCallback);
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void pause() {
        this.mController.d().b();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void play() {
        this.mController.d().c();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void previous() {
        this.mController.d().i();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void rewind() {
        this.mController.d().d();
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void seekTo(long j8) {
        this.mController.d().e(j8);
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setProgressUpdatingEnabled(boolean z8) {
        this.mHandler.removeCallbacks(this.mPositionUpdaterRunnable);
        if (!z8) {
            return;
        }
        this.mHandler.postDelayed(this.mPositionUpdaterRunnable, getUpdatePeriod());
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setRepeatAction(int i8) {
        this.mController.d().f(mapRepeatActionToRepeatMode(i8));
    }

    @Override // androidx.leanback.media.PlayerAdapter
    public void setShuffleAction(int i8) {
        this.mController.d().g(mapShuffleActionToShuffleMode(i8));
    }
}
