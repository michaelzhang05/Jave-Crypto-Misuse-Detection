package S3;

import android.content.Context;
import android.provider.Settings;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public final class k implements Z3.d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9204a;

    public k(Context context) {
        AbstractC3159y.i(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC3159y.h(applicationContext, "getApplicationContext(...)");
        this.f9204a = applicationContext;
    }

    @Override // Z3.d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public j get() {
        String string = Settings.Secure.getString(this.f9204a.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new j(string);
    }
}
