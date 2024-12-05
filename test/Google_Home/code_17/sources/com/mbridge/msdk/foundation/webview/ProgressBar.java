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
    Runnable f21206a;

    /* renamed from: b, reason: collision with root package name */
    private float f21207b;

    /* renamed from: c, reason: collision with root package name */
    private float f21208c;

    /* renamed from: d, reason: collision with root package name */
    private float f21209d;

    /* renamed from: e, reason: collision with root package name */
    private Drawable f21210e;

    /* renamed from: f, reason: collision with root package name */
    private float f21211f;

    /* renamed from: g, reason: collision with root package name */
    private long f21212g;

    /* renamed from: h, reason: collision with root package name */
    private Handler f21213h;

    /* renamed from: i, reason: collision with root package name */
    private Drawable f21214i;

    /* renamed from: j, reason: collision with root package name */
    private int f21215j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f21216k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f21217l;

    /* renamed from: m, reason: collision with root package name */
    private long f21218m;

    /* renamed from: n, reason: collision with root package name */
    private float f21219n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f21220o;

    /* renamed from: p, reason: collision with root package name */
    private c.a f21221p;

    /* renamed from: q, reason: collision with root package name */
    private Drawable f21222q;

    /* renamed from: r, reason: collision with root package name */
    private Rect f21223r;

    /* renamed from: s, reason: collision with root package name */
    private Drawable f21224s;

    /* renamed from: t, reason: collision with root package name */
    private float f21225t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f21226u;

    /* renamed from: v, reason: collision with root package name */
    private int f21227v;

    /* renamed from: w, reason: collision with root package name */
    private int f21228w;

    /* renamed from: x, reason: collision with root package name */
    private int f21229x;

    /* renamed from: y, reason: collision with root package name */
    private long f21230y;

    public ProgressBar(Context context) {
        super(context);
        this.f21206a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f21212g = 25L;
        this.f21213h = new Handler(Looper.getMainLooper());
        this.f21216k = false;
        this.f21219n = 0.95f;
        this.f21220o = false;
        this.f21223r = new Rect();
        setWillNotDraw(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r12.f21217l != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x005f, code lost:
    
        r7 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004b, code lost:
    
        if (r12.f21217l != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0054, code lost:
    
        if (r12.f21217l != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x005d, code lost:
    
        if (r12.f21217l != false) goto L30;
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
        return this.f21207b;
    }

    public void initResource(boolean z8) {
        if (!z8 && (this.f21214i != null || this.f21222q != null || this.f21224s != null || this.f21210e != null)) {
            return;
        }
        Drawable drawable = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_highlight", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f21214i = drawable;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f21214i.getIntrinsicHeight());
        }
        Drawable drawable2 = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_head", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f21222q = drawable2;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, drawable2.getIntrinsicWidth(), this.f21222q.getIntrinsicHeight());
        }
        this.f21224s = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_tail", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
        this.f21210e = getResources().getDrawable(getResources().getIdentifier("mbridge_cm_end_animation", "drawable", com.mbridge.msdk.foundation.controller.c.m().g()));
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
        this.f21225t = getMeasuredWidth();
    }

    public void onThemeChange() {
        if (this.f21216k) {
            initResource(true);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        super.onWindowFocusChanged(z8);
        Drawable drawable = this.f21214i;
        if (drawable != null) {
            drawable.setBounds(0, 0, (int) (drawable.getIntrinsicWidth() * 1.5d), getHeight());
        }
        Drawable drawable2 = this.f21222q;
        if (drawable2 != null) {
            drawable2.setBounds(0, 0, getWidth(), getHeight());
        }
    }

    public void setPaused(boolean z8) {
        this.f21220o = z8;
        if (!z8) {
            this.f21218m = System.currentTimeMillis();
        }
    }

    public void setProgress(float f8, boolean z8) {
        if (z8 && f8 >= 1.0f) {
            startEndAnimation();
        }
    }

    public void setProgressBarListener(c.a aVar) {
        this.f21221p = aVar;
    }

    public void setProgressState(int i8) {
        if (i8 != 5) {
            if (i8 != 6) {
                if (i8 != 7) {
                    if (i8 == 8) {
                        this.f21229x = 1;
                        if (this.f21228w == 1) {
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
            this.f21228w = 1;
            if (this.f21229x == 1) {
                startEndAnimation();
            }
            this.f21230y = 0L;
            return;
        }
        this.f21227v = 1;
        this.f21228w = 0;
        this.f21229x = 0;
        this.f21230y = 0L;
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        if (i8 == 0) {
            c.a aVar = this.f21221p;
            if (aVar != null) {
                aVar.a(true);
                return;
            }
            return;
        }
        c.a aVar2 = this.f21221p;
        if (aVar2 != null) {
            aVar2.a(false);
        }
    }

    public void setVisible(boolean z8) {
        if (z8) {
            this.f21217l = true;
            this.f21218m = System.currentTimeMillis();
            this.f21209d = 0.0f;
            this.f21230y = 0L;
            this.f21226u = false;
            this.f21211f = 0.0f;
            this.f21207b = 0.0f;
            this.f21225t = getMeasuredWidth();
            this.f21220o = false;
            this.f21227v = 0;
            this.f21228w = 0;
            this.f21229x = 0;
            Drawable drawable = this.f21214i;
            if (drawable != null) {
                this.f21215j = -drawable.getIntrinsicWidth();
            } else {
                this.f21215j = 0;
            }
            Drawable drawable2 = this.f21224s;
            if (drawable2 != null) {
                drawable2.setAlpha(255);
            }
            Drawable drawable3 = this.f21210e;
            if (drawable3 != null) {
                drawable3.setAlpha(255);
            }
            Drawable drawable4 = this.f21222q;
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
        if (!this.f21226u) {
            this.f21226u = true;
            this.f21211f = 0.0f;
        }
    }

    public ProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21206a = new Runnable() { // from class: com.mbridge.msdk.foundation.webview.ProgressBar.1
            @Override // java.lang.Runnable
            public final void run() {
                ProgressBar.this.invalidate();
            }
        };
        this.f21212g = 25L;
        this.f21213h = new Handler(Looper.getMainLooper());
        this.f21216k = false;
        this.f21219n = 0.95f;
        this.f21220o = false;
        this.f21223r = new Rect();
        setWillNotDraw(false);
    }
}
