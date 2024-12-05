package com.hutchind.cordova.plugins.streamingmedia;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.MediaController;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.VideoView;

/* loaded from: classes.dex */
public class SimpleVideoStream extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnErrorListener, MediaPlayer.OnBufferingUpdateListener {

    /* renamed from: f, reason: collision with root package name */
    private String f6036f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6038h;

    /* renamed from: a, reason: collision with root package name */
    private String f6031a = getClass().getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private VideoView f6032b = null;

    /* renamed from: c, reason: collision with root package name */
    private MediaPlayer f6033c = null;

    /* renamed from: d, reason: collision with root package name */
    private MediaController f6034d = null;

    /* renamed from: e, reason: collision with root package name */
    private ProgressBar f6035e = null;

    /* renamed from: g, reason: collision with root package name */
    private Boolean f6037g = Boolean.TRUE;

    /* renamed from: i, reason: collision with root package name */
    private Runnable f6039i = new a();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SimpleVideoStream.this.f6032b.getCurrentPosition() > 0) {
                SimpleVideoStream.this.f6035e.setVisibility(8);
            } else {
                SimpleVideoStream.this.f6032b.postDelayed(SimpleVideoStream.this.f6039i, 100L);
            }
        }
    }

    private void d() {
        this.f6035e.setVisibility(0);
        Uri parse = Uri.parse(this.f6036f);
        try {
            this.f6032b.setOnCompletionListener(this);
            this.f6032b.setOnPreparedListener(this);
            this.f6032b.setOnErrorListener(this);
            this.f6032b.setVideoURI(parse);
            MediaController mediaController = new MediaController(this);
            this.f6034d = mediaController;
            mediaController.setAnchorView(this.f6032b);
            this.f6034d.setMediaPlayer(this.f6032b);
            if (!this.f6038h) {
                this.f6034d.setVisibility(8);
            }
            this.f6032b.setMediaController(this.f6034d);
        } catch (Throwable th) {
            Log.d(this.f6031a, th.toString());
        }
    }

    private void e(String str) {
        int i6;
        if ("landscape".equals(str)) {
            i6 = 0;
        } else if (!"portrait".equals(str)) {
            return;
        } else {
            i6 = 1;
        }
        setRequestedOrientation(i6);
    }

    private void f() {
        Log.d(this.f6031a, "Stopping video.");
        this.f6032b.stopPlayback();
    }

    private void g(int i6, String str) {
        Log.d(this.f6031a, "wrapItUp was triggered.");
        Intent intent = new Intent();
        intent.putExtra("message", str);
        setResult(i6, intent);
        finish();
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        g(-1, null);
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public void onBufferingUpdate(MediaPlayer mediaPlayer, int i6) {
        Log.d(this.f6031a, "onBufferingUpdate : " + i6 + "%");
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(MediaPlayer mediaPlayer) {
        Log.d(this.f6031a, "onCompletion triggered.");
        f();
        if (this.f6037g.booleanValue()) {
            g(-1, null);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setFlags(1024, 1024);
        Bundle extras = getIntent().getExtras();
        this.f6036f = extras.getString("mediaUrl");
        this.f6037g = Boolean.valueOf(extras.getBoolean("shouldAutoClose", true));
        this.f6038h = extras.getBoolean("controls", true);
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(-16777216);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        VideoView videoView = new VideoView(this);
        this.f6032b = videoView;
        videoView.setLayoutParams(layoutParams);
        relativeLayout.addView(this.f6032b);
        ProgressBar progressBar = new ProgressBar(this);
        this.f6035e = progressBar;
        progressBar.setIndeterminate(true);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(13, -1);
        this.f6035e.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.f6035e);
        this.f6035e.bringToFront();
        e(extras.getString("orientation"));
        setContentView(relativeLayout, layoutParams);
        d();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Log.d(this.f6031a, "onDestroy triggered.");
        f();
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(MediaPlayer mediaPlayer, int i6, int i7) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("MediaPlayer Error: ");
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
        Log.e(this.f6031a, sb.toString());
        g(0, sb.toString());
        return true;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(MediaPlayer mediaPlayer) {
        Log.d(this.f6031a, "Stream is prepared");
        this.f6033c = mediaPlayer;
        mediaPlayer.setOnBufferingUpdateListener(this);
        this.f6032b.requestFocus();
        this.f6032b.start();
        this.f6032b.postDelayed(this.f6039i, 0L);
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        MediaController mediaController = this.f6034d;
        if (mediaController == null) {
            return false;
        }
        mediaController.show();
        return false;
    }
}
