package E0;

import H0.AbstractC1176j;
import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final Context f1912a;

    /* renamed from: b, reason: collision with root package name */
    private b f1913b = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f1914a;

        /* renamed from: b, reason: collision with root package name */
        private final String f1915b;

        private b() {
            int r8 = AbstractC1176j.r(e.this.f1912a, "com.google.firebase.crashlytics.unity_version", TypedValues.Custom.S_STRING);
            if (r8 == 0) {
                if (e.this.c("flutter_assets/NOTICES.Z")) {
                    this.f1914a = "Flutter";
                    this.f1915b = null;
                    f.f().i("Development platform is: Flutter");
                    return;
                } else {
                    this.f1914a = null;
                    this.f1915b = null;
                    return;
                }
            }
            this.f1914a = "Unity";
            String string = e.this.f1912a.getResources().getString(r8);
            this.f1915b = string;
            f.f().i("Unity Editor version is: " + string);
        }
    }

    public e(Context context) {
        this.f1912a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f1912a.getAssets() == null) {
            return false;
        }
        try {
            InputStream open = this.f1912a.getAssets().open(str);
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
        if (this.f1913b == null) {
            this.f1913b = new b();
        }
        return this.f1913b;
    }

    public String d() {
        return f().f1914a;
    }

    public String e() {
        return f().f1915b;
    }
}
