package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.zzk;
import java.util.Map;
import okhttp3.HttpUrl;

@zzard
/* loaded from: classes2.dex */
public final class zzapo extends zzaqb {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f12860c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f12861d;

    /* renamed from: e, reason: collision with root package name */
    private String f12862e;

    /* renamed from: f, reason: collision with root package name */
    private long f12863f;

    /* renamed from: g, reason: collision with root package name */
    private long f12864g;

    /* renamed from: h, reason: collision with root package name */
    private String f12865h;

    /* renamed from: i, reason: collision with root package name */
    private String f12866i;

    public zzapo(zzbgz zzbgzVar, Map<String, String> map) {
        super(zzbgzVar, "createCalendarEvent");
        this.f12860c = map;
        this.f12861d = zzbgzVar.a();
        this.f12862e = k("description");
        this.f12865h = k("summary");
        this.f12863f = l("start_ticks");
        this.f12864g = l("end_ticks");
        this.f12866i = k("location");
    }

    private final String k(String str) {
        return TextUtils.isEmpty(this.f12860c.get(str)) ? HttpUrl.FRAGMENT_ENCODE_SET : this.f12860c.get(str);
    }

    private final long l(String str) {
        String str2 = this.f12860c.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    public final Intent h() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.f12862e);
        data.putExtra("eventLocation", this.f12866i);
        data.putExtra("description", this.f12865h);
        long j2 = this.f12863f;
        if (j2 > -1) {
            data.putExtra("beginTime", j2);
        }
        long j3 = this.f12864g;
        if (j3 > -1) {
            data.putExtra("endTime", j3);
        }
        data.setFlags(268435456);
        return data;
    }

    public final void i() {
        if (this.f12861d == null) {
            e("Activity context is not available.");
            return;
        }
        zzk.zzlg();
        if (!zzaxi.y(this.f12861d).e()) {
            e("This feature is not available on the device.");
            return;
        }
        zzk.zzlg();
        AlertDialog.Builder x = zzaxi.x(this.f12861d);
        Resources b2 = zzk.zzlk().b();
        x.setTitle(b2 != null ? b2.getString(R.string.s5) : "Create calendar event");
        x.setMessage(b2 != null ? b2.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        x.setPositiveButton(b2 != null ? b2.getString(R.string.s3) : "Accept", new h3(this));
        x.setNegativeButton(b2 != null ? b2.getString(R.string.s4) : "Decline", new i3(this));
        x.create().show();
    }
}
