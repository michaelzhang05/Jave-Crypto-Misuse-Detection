package G0;

import J0.AbstractC1275j;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2908a;

    /* renamed from: b, reason: collision with root package name */
    private b f2909b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2910a;

        /* renamed from: b, reason: collision with root package name */
        private final String f2911b;

        private b() {
            int p8 = AbstractC1275j.p(g.this.f2908a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (p8 == 0) {
                if (g.this.c("flutter_assets/NOTICES.Z")) {
                    this.f2910a = "Flutter";
                    this.f2911b = null;
                    h.f().i("Development platform is: Flutter");
                    return;
                } else {
                    this.f2910a = null;
                    this.f2911b = null;
                    return;
                }
            }
            this.f2910a = "Unity";
            String string = g.this.f2908a.getResources().getString(p8);
            this.f2911b = string;
            h.f().i("Unity Editor version is: " + string);
        }
    }

    public g(Context context) {
        this.f2908a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f2908a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f2908a.getAssets().open(str);
            if (open != null) {
                open.close();
                return true;
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f2909b == null) {
            this.f2909b = new b();
        }
        return this.f2909b;
    }

    public String d() {
        return f().f2910a;
    }

    public String e() {
        return f().f2911b;
    }
}
