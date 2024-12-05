package com.hutchind.cordova.plugins.streamingmedia;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import u4.a;

/* loaded from: classes.dex */
public class SimpleAudioStream extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnBufferingUpdateListener, MediaController.MediaPlayerControl {

    /* renamed from: d, reason: collision with root package name */
    private View f6028d;

    /* renamed from: e, reason: collision with root package name */
    private String f6029e;

    /* renamed from: a, reason: collision with root package name */
    private String f6025a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private MediaPlayer f6026b = null;

    /* renamed from: c, reason: collision with root package name */
    private MediaController f6027c = null;

    /* renamed from: f, reason: collision with root package name */
    private Boolean f6030f = Boolean.TRUE;

    private void a() {
        Uri parse = Uri.parse(this.f6029e);
        try {
            MediaPlayer mediaPlayer = this.f6026b;
            if (mediaPlayer == null) {
                this.f6026b = new MediaPlayer();
            } else {
                try {
                    mediaPlayer.stop();
                    this.f6026b.reset();
                } catch (Exception e6) {
                    Log.e(this.f6025a, e6.toString());
                }
            }
            this.f6026b.setDataSource(this, parse);
            this.f6026b.setAudioStreamType(3);
            this.f6026b.setOnPreparedListener(this);
            this.f6026b.setOnCompletionListener(this);
            this.f6026b.setOnBufferingUpdateListener(this);
            this.f6026b.setOnErrorListener(this);
            this.f6026b.setScreenOnWhilePlaying(true);
            this.f6027c = new MediaController(this);
            this.f6026b.prepareAsync();
            Log.d(this.f6025a, "LoadClip Done");
        } catch (Throwable th) {
            Log.d(this.f6025a, th.toString());
        }
    }

    private void b() {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
            } catch (Exception e6) {
                Log.d(this.f6025a, e6.toString());
            }
        }
    }

    private void c(int i6, String str) {
        Intent intent = new Intent();
        intent.putExtra("message", str);
        setResult(i6, intent);
        finish();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            return mediaPlayer.isPlaying();
        } catch (Exception e6) {
            Log.d(this.f6025a, e6.toString());
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        c(-1, null);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i6) {
        Log.d(this.f6025a, "PlayerService onBufferingUpdate : " + i6 + "%");
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        b();
        if (this.f6030f.booleanValue()) {
            Log.v(this.f6025a, "FINISHING ACTIVITY");
            c(-1, null);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        Bundle extras = getIntent().getExtras();
        this.f6029e = extras.getString("mediaUrl");
        String string = extras.getString("bgColor");
        String string2 = extras.getString("bgImage");
        String string3 = extras.getString("bgImageScale");
        this.f6030f = Boolean.valueOf(extras.getBoolean("shouldAutoClose", true));
        String lowerCase = string3 == null ? "center" : string3.toLowerCase();
        int parseColor = string != null ? Color.parseColor(string) : -16777216;
        ImageView.ScaleType scaleType = lowerCase.equals("fit") ? ImageView.ScaleType.FIT_CENTER : lowerCase.equals("stretch") ? ImageView.ScaleType.FIT_XY : ImageView.ScaleType.CENTER;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(parseColor);
        if (string2 != null) {
            ImageView imageView = new ImageView(this);
            new a(string2, imageView, getApplicationContext()).execute(null, null);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            imageView.setLayoutParams(layoutParams);
            imageView.setScaleType(scaleType);
            relativeLayout.addView(imageView);
        }
        ViewGroup.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        View view = new View(this);
        this.f6028d = view;
        relativeLayout.addView(view);
        setContentView(relativeLayout, layoutParams2);
        this.f6028d.setKeepScreenOn(true);
        if (!Boolean.valueOf(extras.getBoolean("keepAwake", true)).booleanValue()) {
            this.f6028d.setKeepScreenOn(false);
        }
        a();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.reset();
                this.f6026b.release();
            } catch (Exception e6) {
                Log.e(this.f6025a, e6.toString());
            }
            this.f6026b = null;
        }
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i6, int i7) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Media Player Error: ");
        if (i6 == 1) {
            str = "Unknown";
        } else if (i6 == 100) {
            str = "Server Died";
        } else if (i6 != 200) {
            sb.append(" Non standard (");
            sb.append(i6);
            str = ")";
        } else {
            str = "Not Valid for Progressive Playback";
        }
        sb.append(str);
        sb.append(" (" + i6 + ") ");
        sb.append(i7);
        Log.e(this.f6025a, sb.toString());
        c(0, sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Log.d(this.f6025a, "Stream is prepared");
        this.f6027c.setMediaPlayer(this);
        this.f6027c.setAnchorView(this.f6028d);
        this.f6026b.start();
        this.f6027c.setEnabled(true);
        this.f6027c.show();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MediaController mediaController = this.f6027c;
        if (mediaController == null) {
            return false;
        }
        mediaController.show();
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.pause();
            } catch (Exception e6) {
                Log.d(this.f6025a, e6.toString());
            }
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i6) {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i6);
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void start() {
        MediaPlayer mediaPlayer = this.f6026b;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }
}
