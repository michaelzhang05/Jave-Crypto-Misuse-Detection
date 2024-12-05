package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class MBridgeImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private Xfermode f19537a;

    /* renamed from: b, reason: collision with root package name */
    private int f19538b;

    /* renamed from: c, reason: collision with root package name */
    private int f19539c;

    /* renamed from: d, reason: collision with root package name */
    private int f19540d;

    /* renamed from: e, reason: collision with root package name */
    private int f19541e;

    /* renamed from: f, reason: collision with root package name */
    private int f19542f;

    /* renamed from: g, reason: collision with root package name */
    private int f19543g;

    /* renamed from: h, reason: collision with root package name */
    private int f19544h;

    /* renamed from: i, reason: collision with root package name */
    private int f19545i;

    /* renamed from: j, reason: collision with root package name */
    private int f19546j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f19547k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f19548l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f19549m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f19550n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f19551o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f19552p;

    /* renamed from: q, reason: collision with root package name */
    private Path f19553q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f19554r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f19549m, null, 31);
            int i8 = this.f19538b;
            int i9 = this.f19545i;
            int i10 = this.f19539c;
            canvas.scale(((i8 - (i9 * 2)) * 1.0f) / i8, ((i10 - (i9 * 2)) * 1.0f) / i10, i8 / 2.0f, i10 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f19554r;
            if (paint != null) {
                paint.reset();
                this.f19554r.setAntiAlias(true);
                this.f19554r.setStyle(Paint.Style.FILL);
                this.f19554r.setXfermode(this.f19537a);
            }
            Path path = this.f19553q;
            if (path != null) {
                path.reset();
                this.f19553q.addRoundRect(this.f19549m, this.f19548l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f19553q, this.f19554r);
            Paint paint2 = this.f19554r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f19551o) {
                int i11 = this.f19545i;
                int i12 = this.f19546j;
                RectF rectF = this.f19550n;
                float[] fArr = this.f19547k;
                try {
                    Path path2 = this.f19553q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f19554r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i11);
                        this.f19554r.setColor(i12);
                        this.f19554r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f19553q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f19553q, this.f19554r);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.a("MBridgeImageView", e9.getMessage());
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        super.onSizeChanged(i8, i9, i10, i11);
        this.f19538b = i8;
        this.f19539c = i9;
        int i15 = 0;
        if (this.f19552p) {
            try {
                if (this.f19547k != null && this.f19548l != null) {
                    while (true) {
                        i12 = 2;
                        if (i15 >= 2) {
                            break;
                        }
                        float[] fArr = this.f19547k;
                        int i16 = this.f19541e;
                        fArr[i15] = i16;
                        this.f19548l[i15] = i16 - (this.f19545i / 2.0f);
                        i15++;
                    }
                    while (true) {
                        i13 = 4;
                        if (i12 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f19547k;
                        int i17 = this.f19542f;
                        fArr2[i12] = i17;
                        this.f19548l[i12] = i17 - (this.f19545i / 2.0f);
                        i12++;
                    }
                    while (true) {
                        if (i13 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f19547k;
                        int i18 = this.f19543g;
                        fArr3[i13] = i18;
                        this.f19548l[i13] = i18 - (this.f19545i / 2.0f);
                        i13++;
                    }
                    for (i14 = 6; i14 < 8; i14++) {
                        float[] fArr4 = this.f19547k;
                        int i19 = this.f19544h;
                        fArr4[i14] = i19;
                        this.f19548l[i14] = i19 - (this.f19545i / 2.0f);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } else if (this.f19547k != null && this.f19548l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f19547k;
                    if (i15 >= fArr5.length) {
                        break;
                    }
                    int i20 = this.f19540d;
                    fArr5[i15] = i20;
                    this.f19548l[i15] = i20 - (this.f19545i / 2.0f);
                    i15++;
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }
        RectF rectF = this.f19550n;
        if (rectF != null) {
            int i21 = this.f19545i;
            rectF.set(i21 / 2.0f, i21 / 2.0f, this.f19538b - (i21 / 2.0f), this.f19539c - (i21 / 2.0f));
        }
        RectF rectF2 = this.f19549m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f19538b, this.f19539c);
        }
    }

    public void setBorder(int i8, int i9, int i10) {
        this.f19551o = true;
        this.f19545i = i9;
        this.f19546j = i10;
        this.f19540d = i8;
    }

    public void setCornerRadius(int i8) {
        this.f19540d = i8;
    }

    public void setCustomBorder(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f19551o = true;
        this.f19552p = true;
        this.f19545i = i12;
        this.f19546j = i13;
        this.f19541e = i8;
        this.f19543g = i10;
        this.f19542f = i9;
        this.f19544h = i11;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19553q = new Path();
        this.f19554r = new Paint();
        this.f19547k = new float[8];
        this.f19548l = new float[8];
        this.f19550n = new RectF();
        this.f19549m = new RectF();
        this.f19537a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
