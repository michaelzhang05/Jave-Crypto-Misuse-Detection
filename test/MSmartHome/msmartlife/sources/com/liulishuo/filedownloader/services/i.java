package com.liulishuo.filedownloader.services;

import android.R;
import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;
import e.h.a.d0;

/* compiled from: ForegroundServiceConfig.java */
@TargetApi(26)
/* loaded from: classes2.dex */
public class i {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private String f17222b;

    /* renamed from: c, reason: collision with root package name */
    private String f17223c;

    /* renamed from: d, reason: collision with root package name */
    private Notification f17224d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f17225e;

    /* compiled from: ForegroundServiceConfig.java */
    /* loaded from: classes2.dex */
    public static class b {
        private int a;

        /* renamed from: b, reason: collision with root package name */
        private String f17226b;

        /* renamed from: c, reason: collision with root package name */
        private String f17227c;

        /* renamed from: d, reason: collision with root package name */
        private Notification f17228d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f17229e;

        public i a() {
            i iVar = new i();
            String str = this.f17226b;
            if (str == null) {
                str = "filedownloader_channel";
            }
            iVar.i(str);
            String str2 = this.f17227c;
            if (str2 == null) {
                str2 = "Filedownloader";
            }
            iVar.j(str2);
            int i2 = this.a;
            if (i2 == 0) {
                i2 = R.drawable.arrow_down_float;
            }
            iVar.k(i2);
            iVar.g(this.f17229e);
            iVar.h(this.f17228d);
            return iVar;
        }

        public b b(boolean z) {
            this.f17229e = z;
            return this;
        }
    }

    private Notification a(Context context) {
        String string = context.getString(d0.f17772b);
        String string2 = context.getString(d0.a);
        Notification.Builder builder = new Notification.Builder(context, this.f17222b);
        builder.setContentTitle(string).setContentText(string2).setSmallIcon(R.drawable.arrow_down_float);
        return builder.build();
    }

    public Notification b(Context context) {
        if (this.f17224d == null) {
            if (e.h.a.k0.d.a) {
                e.h.a.k0.d.a(this, "build default notification", new Object[0]);
            }
            this.f17224d = a(context);
        }
        return this.f17224d;
    }

    public String c() {
        return this.f17222b;
    }

    public String d() {
        return this.f17223c;
    }

    public int e() {
        return this.a;
    }

    public boolean f() {
        return this.f17225e;
    }

    public void g(boolean z) {
        this.f17225e = z;
    }

    public void h(Notification notification) {
        this.f17224d = notification;
    }

    public void i(String str) {
        this.f17222b = str;
    }

    public void j(String str) {
        this.f17223c = str;
    }

    public void k(int i2) {
        this.a = i2;
    }

    public String toString() {
        return "ForegroundServiceConfig{notificationId=" + this.a + ", notificationChannelId='" + this.f17222b + "', notificationChannelName='" + this.f17223c + "', notification=" + this.f17224d + ", needRecreateChannelId=" + this.f17225e + '}';
    }

    private i() {
    }
}
