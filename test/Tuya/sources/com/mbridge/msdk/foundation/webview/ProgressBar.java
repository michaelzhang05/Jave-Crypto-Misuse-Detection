package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.webview.c;

/* loaded from: classes4.dex */
public class ProgressBar extends View implements c {

    /* renamed from: a, reason: collision with root package name */
    Runnable f20151a;

    /* renamed from: b, reason: collision with root package name */
    private float f20152b;

    /* renamed from: c, reason: collision with root package name */
    private float f20153c;

    /* renamed from: d, reason: collision with root package name */
    private float f20154d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f20155e;

    /* renamed from: f, reason: collision with root package name */
    private float f20156f;

    /* renamed from: g, reason: collision with root package name */
    private long f20157g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f20158h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f20159i;

    /* renamed from: j, reason: collision with root package name */
    private int f20160j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f20161k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f20162l;

    /* renamed from: m, reason: collision with root package name */
    private long f20163m;

    /* renamed from: n, reason: collision with root package name */
    private float f20164n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f20165o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f20166p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f20167q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f20168r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f20169s;

    /* renamed from: t, reason: collision with root package name */
    private float f20170t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f20171u;

    /* renamed from: v, reason: collision with root package name */
    private int f20172v;

    /* renamed from: w, reason: collision with root package name */
    private int f20173w;

    /* renamed from: x, reason: collision with root package name */
    private int f20174x;

    /* renamed from: y, reason: collision with root package name */
    private long f20175y;

    public ProgressBar(Context context) {
        super(context);
        this.f20151a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f20157g = 25L;
        this.f20158h = new Handler(Looper.getMainLooper());
        this.f20161k = false;
        this.f20164n = 0.95f;
        this.f20165o = false;
        this.f20168r = new Rect();
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r12.f20162l != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005f, code lost:
    
        r7 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r12.f20162l != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0054, code lost:
    
        if (r12.f20162l != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005d, code lost:
    
        if (r12.f20162l != false) goto L30;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r13) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.webview.ProgressBar.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public Bitmap getDrawingCache(boolean z8) {
        return null;
    }

    public float getProgress() {
        return this.f20152b;
    }

    public void initResource(boolean z8) {
        if (!z8 && (this.f20159i != null || this.f20167q != null || this.f20169s != null || this.f20155e != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f20159i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f20159i.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f20167q = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f20167q.getIntrinsicHeight());
        }
        this.f20169s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f20155e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
    }

    @Override // android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f20170t = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f20161k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        Drawable drawable = this.f20159i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f20167q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z8) {
        this.f20165o = z8;
        if (!z8) {
            this.f20163m = System.currentTimeMillis();
        }
    }

    public void setProgress(float f8, boolean z8) {
        if (z8 && f8 >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setProgressBarListener(c.a aVar) {
        this.f20166p = aVar;
    }

    public void setProgressState(int i8) {
        if (i8 != 5) {
            if (i8 != 6) {
                if (i8 != 7) {
                    if (i8 == 8) {
                        this.f20174x = 1;
                        if (this.f20173w == 1) {
                            startEndAnimation();
                            return;
                        }
                        return;
                    }
                    return;
                }
                startEndAnimation();
                return;
            }
            this.f20173w = 1;
            if (this.f20174x == 1) {
                startEndAnimation();
            }
            this.f20175y = 0L;
            return;
        }
        this.f20172v = 1;
        this.f20173w = 0;
        this.f20174x = 0;
        this.f20175y = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        if (i8 == 0) {
            c.a aVar = this.f20166p;
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        c.a aVar2 = this.f20166p;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    public void setVisible(boolean z8) {
        if (z8) {
            this.f20162l = true;
            this.f20163m = System.currentTimeMillis();
            this.f20154d = 0.0f;
            this.f20175y = 0L;
            this.f20171u = false;
            this.f20156f = 0.0f;
            this.f20152b = 0.0f;
            this.f20170t = getMeasuredWidth();
            this.f20165o = false;
            this.f20172v = 0;
            this.f20173w = 0;
            this.f20174x = 0;
            Drawable drawable = this.f20159i;
            if (drawable != null) {
                this.f20160j = -drawable.getIntrinsicWidth();
            } else {
                this.f20160j = 0;
            }
            Drawable drawable2 = this.f20169s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f20155e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f20167q;
            if (drawable4 != null) {
                drawable4.setAlpha(255);
            }
            setVisibility(0);
            invalidate();
            return;
        }
        setVisibility(4);
    }

    public void startEndAnimation() {
        if (!this.f20171u) {
            this.f20171u = true;
            this.f20156f = 0.0f;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20151a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f20157g = 25L;
        this.f20158h = new Handler(Looper.getMainLooper());
        this.f20161k = false;
        this.f20164n = 0.95f;
        this.f20165o = false;
        this.f20168r = new Rect();
        setWillNotDraw(false);
    }
}
