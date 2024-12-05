package A1;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f70b;

    /* renamed from: c, reason: collision with root package name */
    private final a f71c;

    /* renamed from: d, reason: collision with root package name */
    private final c f72d;

    /* renamed from: e, reason: collision with root package name */
    private float f73e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f69a = context;
        this.f70b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f71c = aVar;
        this.f72d = cVar;
    }

    private float a() {
        return this.f71c.a(this.f70b.getStreamVolume(3), this.f70b.getStreamMaxVolume(3));
    }

    private boolean b(float f8) {
        if (f8 != this.f73e) {
            return true;
        }
        return false;
    }

    private void c() {
        this.f72d.a(this.f73e);
    }

    public void d() {
        this.f73e = a();
        c();
        this.f69a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f69a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z8) {
        super.onChange(z8);
        float a8 = a();
        if (b(a8)) {
            this.f73e = a8;
            c();
        }
    }
}
