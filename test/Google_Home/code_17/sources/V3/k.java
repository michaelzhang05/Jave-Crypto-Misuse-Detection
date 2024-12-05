package V3;

import android.content.Context;
import android.provider.Settings;
import c4.InterfaceC2046d;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public final class k implements InterfaceC2046d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f10847a;

    public k(Context context) {
        AbstractC3255y.i(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC3255y.h(applicationContext, "getApplicationContext(...)");
        this.f10847a = applicationContext;
    }

    @Override // c4.InterfaceC2046d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j get() {
        String string = Settings.Secure.getString(this.f10847a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new j(string);
    }
}
