package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.a.b;
import com.mbridge.msdk.dycreator.a.c;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.foundation.tools.ad;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class MBCusRoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private int f19473a;

    /* renamed from: b, reason: collision with root package name */
    private int f19474b;

    /* renamed from: c, reason: collision with root package name */
    private int f19475c;

    /* renamed from: d, reason: collision with root package name */
    private int f19476d;

    /* renamed from: e, reason: collision with root package name */
    private Xfermode f19477e;

    /* renamed from: f, reason: collision with root package name */
    private int f19478f;

    /* renamed from: g, reason: collision with root package name */
    private int f19479g;

    /* renamed from: h, reason: collision with root package name */
    private int f19480h;

    /* renamed from: i, reason: collision with root package name */
    private int f19481i;

    /* renamed from: j, reason: collision with root package name */
    private int f19482j;

    /* renamed from: k, reason: collision with root package name */
    private int f19483k;

    /* renamed from: l, reason: collision with root package name */
    private int f19484l;

    /* renamed from: m, reason: collision with root package name */
    private int f19485m;

    /* renamed from: n, reason: collision with root package name */
    private int f19486n;

    /* renamed from: o, reason: collision with root package name */
    private float[] f19487o;

    /* renamed from: p, reason: collision with root package name */
    private float[] f19488p;

    /* renamed from: q, reason: collision with root package name */
    private RectF f19489q;

    /* renamed from: r, reason: collision with root package name */
    private RectF f19490r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f19491s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f19492t;

    /* renamed from: u, reason: collision with root package name */
    private Path f19493u;

    /* renamed from: v, reason: collision with root package name */
    private Paint f19494v;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19495a;

        static {
            int[] iArr = new int[c.values().length];
            f19495a = iArr;
            try {
                iArr[c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19495a[c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19495a[c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19495a[c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19495a[c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19495a[c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19495a[c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19495a[c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19495a[c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f19495a[c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f19495a[c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f19495a[c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f19495a[c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f19495a[c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f19495a[c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f19495a[c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBCusRoundImageView(Context context) {
        this(context, null);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                int i9 = AnonymousClass1.f19495a[cVar.ordinal()];
                if (i9 != 6) {
                    if (i9 != 13) {
                        if (i9 == 14) {
                            String attributeValue = attributeSet.getAttributeValue(i8);
                            if (!attributeValue.startsWith("f") && !attributeValue.startsWith("m")) {
                                if (attributeValue.startsWith("wrap")) {
                                    layoutParams.height = -2;
                                } else {
                                    layoutParams.height = b.a().b(attributeValue);
                                }
                            } else {
                                layoutParams.height = -1;
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (!attributeValue2.startsWith("f") && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.width = -2;
                            } else {
                                layoutParams.width = b.a().b(attributeValue2);
                            }
                        } else {
                            layoutParams.width = -1;
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i8);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (canvas == null) {
            return;
        }
        try {
            canvas.saveLayer(this.f19489q, null, 31);
            int i8 = this.f19478f;
            int i9 = this.f19485m;
            int i10 = this.f19479g;
            canvas.scale(((i8 - (i9 * 2)) * 1.0f) / i8, ((i10 - (i9 * 2)) * 1.0f) / i10, i8 / 2.0f, i10 / 2.0f);
            super.onDraw(canvas);
            Paint paint = this.f19494v;
            if (paint != null) {
                paint.reset();
                this.f19494v.setAntiAlias(true);
                this.f19494v.setStyle(Paint.Style.FILL);
                this.f19494v.setXfermode(this.f19477e);
            }
            Path path = this.f19493u;
            if (path != null) {
                path.reset();
                this.f19493u.addRoundRect(this.f19489q, this.f19488p, Path.Direction.CCW);
            }
            canvas.drawPath(this.f19493u, this.f19494v);
            Paint paint2 = this.f19494v;
            if (paint2 != null) {
                paint2.setXfermode(null);
            }
            canvas.restore();
            if (this.f19491s) {
                int i11 = this.f19485m;
                int i12 = this.f19486n;
                RectF rectF = this.f19490r;
                float[] fArr = this.f19487o;
                try {
                    Path path2 = this.f19493u;
                    if (path2 != null) {
                        path2.reset();
                    }
                    Paint paint3 = this.f19494v;
                    if (paint3 != null) {
                        paint3.setStrokeWidth(i11);
                        this.f19494v.setColor(i12);
                        this.f19494v.setStyle(Paint.Style.STROKE);
                    }
                    Path path3 = this.f19493u;
                    if (path3 != null) {
                        path3.addRoundRect(rectF, fArr, Path.Direction.CCW);
                    }
                    canvas.drawPath(this.f19493u, this.f19494v);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } catch (Exception e9) {
            ad.a("MBridgeImageView", e9.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a2 A[Catch: Exception -> 0x0079, TryCatch #2 {Exception -> 0x0079, blocks: (B:3:0x0003, B:19:0x009e, B:21:0x00a2, B:22:0x00b7, B:24:0x00bb, B:6:0x007b, B:8:0x007f, B:18:0x009b, B:54:0x0075, B:30:0x000e, B:32:0x0012, B:36:0x0019, B:40:0x0032, B:44:0x0049, B:48:0x0061, B:11:0x0083, B:13:0x0088), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00bb A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #2 {Exception -> 0x0079, blocks: (B:3:0x0003, B:19:0x009e, B:21:0x00a2, B:22:0x00b7, B:24:0x00bb, B:6:0x007b, B:8:0x007f, B:18:0x009b, B:54:0x0075, B:30:0x000e, B:32:0x0012, B:36:0x0019, B:40:0x0032, B:44:0x0049, B:48:0x0061, B:11:0x0083, B:13:0x0088), top: B:2:0x0003, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onSizeChanged(int r4, int r5, int r6, int r7) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.cusview.MBCusRoundImageView.onSizeChanged(int, int, int, int):void");
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, c> c8 = b.a().c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i8 = 0; i8 < attributeCount; i8++) {
            c cVar = c8.get(attributeSet.getAttributeName(i8));
            if (cVar != null) {
                switch (AnonymousClass1.f19495a[cVar.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i8);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        b.a().a(attributeSet.getAttributeValue(i8), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i8);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i8)));
                                break;
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(b.a().a(attributeSet.getAttributeValue(i8)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i8);
                        if (TextUtils.isEmpty(attributeValue3)) {
                            break;
                        } else {
                            CharSequence charSequence = (String) com.mbridge.msdk.dycreator.e.b.f19739a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i8);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = com.mbridge.msdk.dycreator.e.b.f19739a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                break;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i8);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            break;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i8);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            break;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int b8 = b.a().b(attributeSet.getAttributeValue(i8));
                        this.f19476d = b8;
                        this.f19475c = b8;
                        this.f19474b = b8;
                        this.f19473a = b8;
                        setPadding(b8, b8, b8, b8);
                        break;
                    case 9:
                        int b9 = b.a().b(attributeSet.getAttributeValue(i8));
                        this.f19474b = b9;
                        setPadding(this.f19473a, b9, this.f19475c, this.f19476d);
                        break;
                    case 10:
                        int b10 = b.a().b(attributeSet.getAttributeValue(i8));
                        this.f19476d = b10;
                        setPadding(this.f19473a, this.f19474b, this.f19475c, b10);
                        break;
                    case 11:
                        int b11 = b.a().b(attributeSet.getAttributeValue(i8));
                        this.f19473a = b11;
                        setPadding(b11, this.f19474b, this.f19475c, this.f19476d);
                        break;
                    case 12:
                        int b12 = b.a().b(attributeSet.getAttributeValue(i8));
                        this.f19475c = b12;
                        setPadding(this.f19473a, this.f19474b, b12, this.f19476d);
                        break;
                }
            }
        }
    }

    public void setBorder(int i8, int i9, int i10) {
        this.f19491s = true;
        this.f19485m = i9;
        this.f19486n = i10;
        this.f19480h = i8;
    }

    public void setCornerRadius(int i8) {
        this.f19480h = i8;
    }

    public void setCustomBorder(int i8, int i9, int i10, int i11, int i12, int i13) {
        this.f19491s = true;
        this.f19492t = true;
        this.f19485m = i12;
        this.f19486n = i13;
        this.f19481i = i8;
        this.f19483k = i10;
        this.f19482j = i9;
        this.f19484l = i11;
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public MBCusRoundImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19493u = new Path();
        this.f19494v = new Paint();
        this.f19487o = new float[8];
        this.f19488p = new float[8];
        this.f19490r = new RectF();
        this.f19489q = new RectF();
        this.f19477e = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    }
}
