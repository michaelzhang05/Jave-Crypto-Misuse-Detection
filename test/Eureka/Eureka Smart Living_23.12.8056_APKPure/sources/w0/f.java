package w0;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import androidx.biometric.BiometricPrompt;
import androidx.biometric.u;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private u f9712a;

    /* renamed from: b, reason: collision with root package name */
    private Context f9713b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f9714c;

    /* renamed from: d, reason: collision with root package name */
    private BiometricPrompt f9715d;

    /* renamed from: e, reason: collision with root package name */
    private BiometricPrompt.d f9716e;

    /* renamed from: f, reason: collision with root package name */
    private w0.a f9717f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends BiometricPrompt.a {
        a() {
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void a(int i6, CharSequence charSequence) {
            super.a(i6, charSequence);
            Toast.makeText(f.this.f9713b, "Authentication error: " + ((Object) charSequence), 0).show();
            f.this.f9717f.b();
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void b() {
            super.b();
            Toast.makeText(f.this.f9713b, "Authentication failed", 0).show();
            f.this.f9717f.b();
        }

        @Override // androidx.biometric.BiometricPrompt.a
        public void c(BiometricPrompt.b bVar) {
            super.c(bVar);
            f.this.f9717f.a(bVar);
        }
    }

    public f(Context context, u uVar, w0.a aVar) {
        this.f9713b = context;
        this.f9712a = uVar;
        this.f9717f = aVar;
    }

    private void d(String str, String str2) {
        Executor h6 = androidx.core.content.a.h(this.f9713b);
        this.f9714c = h6;
        this.f9715d = new BiometricPrompt((androidx.fragment.app.j) this.f9713b, h6, new a());
        this.f9716e = new BiometricPrompt.d.a().d(str).c(str2).b(32783).a();
    }

    public boolean c() {
        Toast makeText;
        String str;
        Boolean bool = Boolean.FALSE;
        u g6 = u.g(this.f9713b);
        this.f9712a = g6;
        int a6 = g6.a(32783);
        if (a6 != 0) {
            if (a6 != 1) {
                if (a6 != 11) {
                    str = a6 == 12 ? "No biometric features available on this device." : "The user hasn't associated any biometric credentials with their account..";
                }
                Log.e("MY_APP_TAG", str);
                makeText = Toast.makeText(this.f9713b, str, 1);
            } else {
                Log.e("MY_APP_TAG", "Biometric features are currently unavailable.");
                makeText = Toast.makeText(this.f9713b, "App can authenticate using biometrics.", 1);
            }
            makeText.show();
        } else {
            Log.d("MY_APP_TAG", "App can authenticate using biometrics.");
            Toast.makeText(this.f9713b, "App can authenticate using biometrics.", 1).show();
            bool = Boolean.TRUE;
        }
        return bool.booleanValue();
    }

    public void e(String str, String str2) {
        d(str, str2);
        try {
            this.f9715d.a(this.f9716e);
        } catch (Exception e6) {
            e6.printStackTrace();
            throw new Exception(e6);
        }
    }
}
