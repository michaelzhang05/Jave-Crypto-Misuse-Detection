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
    private Xfermode f18482a;

    /* renamed from: b, reason: collision with root package name */
    private int f18483b;

    /* renamed from: c, reason: collision with root package name */
    private int f18484c;

    /* renamed from: d, reason: collision with root package name */
    private int f18485d;

    /* renamed from: e, reason: collision with root package name */
    private int f18486e;

    /* renamed from: f, reason: collision with root package name */
    private int f18487f;

    /* renamed from: g, reason: collision with root package name */
    private int f18488g;

    /* renamed from: h, reason: collision with root package name */
    private int f18489h;

    /* renamed from: i, reason: collision with root package name */
    private int f18490i;

    /* renamed from: j, reason: collision with root package name */
    private int f18491j;

    /* renamed from: k, reason: collision with root package name */
    private float[] f18492k;

    /* renamed from: l, reason: collision with root package name */
    private float[] f18493l;

    /* renamed from: m, reason: collision with root package name */
    private RectF f18494m;

    /* renamed from: n, reason: collision with root package name */
    private RectF f18495n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f18496o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f18497p;

    /* renamed from: q, reason: collision with root package name */
    private Path f18498q;

    /* renamed from: r, reason: collision with root package name */
    private Paint f18499r;

    public MBridgeImageView(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f18494m, null, 31);
            int i8 = this.f18483b;
            int i9 = this.f18490i;
            int i10 = this.f18484c;
            canvas.scale(((i8 - (i9 * 2)) * 1.0f) / i8, ((i10 - (i9 * 2)) * 1.0f) / i10, i8 / 2.0f, i10 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f18499r;
            if (paint != null) {
                paint.reset();
                this.f18499r.setAntiAlias(true);
                this.f18499r.setStyle(Paint.Style.FILL);
                this.f18499r.setXfermode(this.f18482a);
            }
            Path path = this.f18498q;
            if (path != null) {
                path.reset();
                this.f18498q.addRoundRect(this.f18494m, this.f18493l, Path.Direction.CCW);
            }
            canvas.drawPath(this.f18498q, this.f18499r);
            Paint paint2 = this.f18499r;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f18496o) {
                int i11 = this.f18490i;
                int i12 = this.f18491j;
                RectF rectF = this.f18495n;
                float[] fArr = this.f18492k;
                try {
                    Path path2 = this.f18498q;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f18499r;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i11);
                        this.f18499r.setColor(i12);
                        this.f18499r.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f18498q;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f18498q, this.f18499r);
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
        this.f18483b = i8;
        this.f18484c = i9;
        int i15 = 0;
        if (this.f18497p) {
            try {
                if (this.f18492k != null && this.f18493l != null) {
                    while (true) {
                        i12 = 2;
                        if (i15 >= 2) {
                            break;
                        }
                        float[] fArr = this.f18492k;
                        int i16 = this.f18486e;
                        fArr[i15] = i16;
                        this.f18493l[i15] = i16 - (this.f18490i / 2.0f);
                        i15++;
                    }
                    while (true) {
                        i13 = 4;
                        if (i12 >= 4) {
                            break;
                        }
                        float[] fArr2 = this.f18492k;
                        int i17 = this.f18487f;
                        fArr2[i12] = i17;
                        this.f18493l[i12] = i17 - (this.f18490i / 2.0f);
                        i12++;
                    }
                    while (true) {
                        if (i13 >= 6) {
                            break;
                        }
                        float[] fArr3 = this.f18492k;
                        int i18 = this.f18488g;
                        fArr3[i13] = i18;
                        this.f18493l[i13] = i18 - (this.f18490i / 2.0f);
                        i13++;
                    }
                    for (i14 = 6; i14 < 8; i14++) {
                        float[] fArr4 = this.f18492k;
                        int i19 = this.f18489h;
                        fArr4[i14] = i19;
                        this.f18493l[i14] = i19 - (this.f18490i / 2.0f);
                    }
                }
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        } else if (this.f18492k != null && this.f18493l != null) {
            while (true) {
                try {
                    float[] fArr5 = this.f18492k;
                    if (i15 >= fArr5.length) {
                        break;
                    }
                    int i20 = this.f18485d;
                    fArr5[i15] = i20;
                    this.f18493l[i15] = i20 - (this.f18490i / 2.0f);
                    i15++;
                } catch (Exception e9) {
                    e9.printStackTrace();
                }
            }
        }
        RectF rectF = this.f18495n;
        if (rectF != null) {
            int i21 = this.f18490i;
            rectF.set(i21 / 2.0f, i21 / 2.0f, this.f18483b - (i21 / 2.0f), this.f18484c - (i21 / 2.0f));
        }
        RectF rectF2 = this.f18494m;
        if (rectF2 != null) {
            rectF2.set(0.0f, 0.0f, this.f18483b, this.f18484c);
        }
    }

    public void setBorder(int i8, int i9, int i10) {
        this.f18496o = true;
        this.f18490i = i9;
        this.f18491j = i10;
        this.f18485d = i8;
    }

    public void setCornerRadius(int i8) {
        this.f18485d = i8;
    }

    public void setCustomBorder(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f18496o = true;
        this.f18497p = true;
        this.f18490i = i12;
        this.f18491j = i13;
        this.f18486e = i8;
        this.f18488g = i10;
        this.f18487f = i9;
        this.f18489h = i11;
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBridgeImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f18498q = new Path();
        this.f18499r = new Paint();
        this.f18492k = new float[8];
        this.f18493l = new float[8];
        this.f18495n = new RectF();
        this.f18494m = new RectF();
        this.f18482a = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
