package com.bumptech.glide.p.l;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.widget.RemoteViews;

/* compiled from: NotificationTarget.java */
/* loaded from: classes.dex */
public class f extends g<Bitmap> {

    /* renamed from: f, reason: collision with root package name */
    private final RemoteViews f8922f;

    /* renamed from: g, reason: collision with root package name */
    private final Context f8923g;

    /* renamed from: h, reason: collision with root package name */
    private final int f8924h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8925i;

    /* renamed from: j, reason: collision with root package name */
    private final Notification f8926j;

    /* renamed from: k, reason: collision with root package name */
    private final int f8927k;

    private void d() {
        ((NotificationManager) com.bumptech.glide.r.j.d((NotificationManager) this.f8923g.getSystemService("notification"))).notify(this.f8925i, this.f8924h, this.f8926j);
    }

    @Override // com.bumptech.glide.p.l.i
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void onResourceReady(Bitmap bitmap, com.bumptech.glide.p.m.d<? super Bitmap> dVar) {
        this.f8922f.setImageViewBitmap(this.f8927k, bitmap);
        d();
    }
}
