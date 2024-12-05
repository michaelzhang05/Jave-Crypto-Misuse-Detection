package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzadu extends RelativeLayout {

    /* renamed from: f, reason: collision with root package name */
    private static final float[] f12662f = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    /* renamed from: g, reason: collision with root package name */
    private AnimationDrawable f12663g;

    public zzadu(Context context, zzadt zzadtVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.j(zzadtVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(f12662f, null, null));
        shapeDrawable.getPaint().setColor(zzadtVar.I7());
        setLayoutParams(layoutParams);
        zzk.zzli().c(this, shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzadtVar.X0())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzadtVar.X0());
            textView.setTextColor(zzadtVar.J7());
            textView.setTextSize(zzadtVar.K7());
            zzyt.a();
            int a = zzazt.a(context, 4);
            zzyt.a();
            textView.setPadding(a, 0, zzazt.a(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List<zzadw> L7 = zzadtVar.L7();
        if (L7 != null && L7.size() > 1) {
            this.f12663g = new AnimationDrawable();
            Iterator<zzadw> it = L7.iterator();
            while (it.hasNext()) {
                try {
                    this.f12663g.addFrame((Drawable) ObjectWrapper.R(it.next().y4()), zzadtVar.M7());
                } catch (Exception e2) {
                    zzbad.c("Error while getting drawable.", e2);
                }
            }
            zzk.zzli().c(imageView, this.f12663g);
        } else if (L7.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.R(L7.get(0).y4()));
            } catch (Exception e3) {
                zzbad.c("Error while getting drawable.", e3);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.f12663g;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
