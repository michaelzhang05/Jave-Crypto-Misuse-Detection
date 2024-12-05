package androidx.leanback.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;

@Deprecated
/* loaded from: classes3.dex */
public abstract class MediaControllerGlue extends PlaybackControlGlue {
    static final boolean DEBUG = false;
    static final String TAG = "MediaControllerGlue";
    private final MediaControllerCompat.a mCallback;
    MediaControllerCompat mMediaController;

    public MediaControllerGlue(Context context, int[] iArr, int[] iArr2) {
        super(context, iArr, iArr2);
        this.mCallback = new MediaControllerCompat.a() { // from class: androidx.leanback.media.MediaControllerGlue.1
            @Override // android.support.v4.media.session.MediaControllerCompat.a
            public void onMetadataChanged(MediaMetadataCompat mediaMetadataCompat) {
                MediaControllerGlue.this.onMetadataChanged();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a
            public void onPlaybackStateChanged(PlaybackStateCompat playbackStateCompat) {
                MediaControllerGlue.this.onStateChanged();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a
            public void onSessionDestroyed() {
                MediaControllerGlue.this.mMediaController = null;
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a
            public void onSessionEvent(String str, Bundle bundle) {
            }
        };
    }

    public void attachToMediaController(MediaControllerCompat mediaControllerCompat) {
        if (mediaControllerCompat != this.mMediaController) {
            detach();
            this.mMediaController = mediaControllerCompat;
            if (mediaControllerCompat != null) {
                mediaControllerCompat.e(this.mCallback);
            }
            onMetadataChanged();
            onStateChanged();
        }
    }

    public void detach() {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.g(this.mCallback);
        }
        this.mMediaController = null;
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getCurrentPosition() {
        return (int) this.mMediaController.c().k();
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getCurrentSpeedId() {
        int j8 = (int) this.mMediaController.c().j();
        int i8 = 0;
        if (j8 == 0) {
            return 0;
        }
        if (j8 == 1) {
            return 1;
        }
        if (j8 > 0) {
            int[] fastForwardSpeeds = getFastForwardSpeeds();
            while (i8 < fastForwardSpeeds.length) {
                if (j8 == fastForwardSpeeds[i8]) {
                    return i8 + 10;
                }
                i8++;
            }
        } else {
            int[] rewindSpeeds = getRewindSpeeds();
            while (i8 < rewindSpeeds.length) {
                if ((-j8) == rewindSpeeds[i8]) {
                    return (-10) - i8;
                }
                i8++;
            }
        }
        Log.w(TAG, "Couldn't find index for speed " + j8);
        return -1;
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public Drawable getMediaArt() {
        Bitmap c8 = this.mMediaController.b().e().c();
        if (c8 == null) {
            return null;
        }
        return new BitmapDrawable(getContext().getResources(), c8);
    }

    public final MediaControllerCompat getMediaController() {
        return this.mMediaController;
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public int getMediaDuration() {
        return (int) this.mMediaController.b().f("android.media.metadata.DURATION");
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public CharSequence getMediaSubtitle() {
        return this.mMediaController.b().e().f();
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public CharSequence getMediaTitle() {
        return this.mMediaController.b().e().i();
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public long getSupportedActions() {
        long j8;
        long c8 = this.mMediaController.c().c();
        if ((512 & c8) != 0) {
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
        if ((c8 & 8) != 0) {
            return j8 | 32;
        }
        return j8;
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public boolean hasValidMedia() {
        MediaControllerCompat mediaControllerCompat = this.mMediaController;
        if (mediaControllerCompat != null && mediaControllerCompat.b() != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public boolean isMediaPlaying() {
        if (this.mMediaController.c().n() == 3) {
            return true;
        }
        return false;
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void next() {
        this.mMediaController.d().h();
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void pause() {
        this.mMediaController.d().b();
    }

    @Override // androidx.leanback.media.PlaybackControlGlue
    public void play(int i8) {
        if (i8 == 1) {
            this.mMediaController.d().c();
        } else if (i8 > 0) {
            this.mMediaController.d().a();
        } else {
            this.mMediaController.d().d();
        }
    }

    @Override // androidx.leanback.media.PlaybackGlue
    public void previous() {
        this.mMediaController.d().i();
    }
}
