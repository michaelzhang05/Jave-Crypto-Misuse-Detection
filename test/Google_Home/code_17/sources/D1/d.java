package D1;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class d extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1771a;

    /* renamed from: b, reason: collision with root package name */
    private final AudioManager f1772b;

    /* renamed from: c, reason: collision with root package name */
    private final a f1773c;

    /* renamed from: d, reason: collision with root package name */
    private final c f1774d;

    /* renamed from: e, reason: collision with root package name */
    private float f1775e;

    public d(Handler handler, Context context, a aVar, c cVar) {
        super(handler);
        this.f1771a = context;
        this.f1772b = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.f1773c = aVar;
        this.f1774d = cVar;
    }

    private float a() {
        return this.f1773c.a(this.f1772b.getStreamVolume(3), this.f1772b.getStreamMaxVolume(3));
    }

    private boolean b(float f8) {
        if (f8 != this.f1775e) {
            return true;
        }
        return false;
    }

    private void c() {
        this.f1774d.a(this.f1775e);
    }

    public void d() {
        this.f1775e = a();
        c();
        this.f1771a.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public void e() {
        this.f1771a.getContentResolver().unregisterContentObserver(this);
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z8) {
        super.onChange(z8);
        float a8 = a();
        if (b(a8)) {
            this.f1775e = a8;
            c();
        }
    }
}
