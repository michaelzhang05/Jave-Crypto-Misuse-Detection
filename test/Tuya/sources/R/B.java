package R;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes3.dex */
final class B extends D {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f8451a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f8452b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f8453c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public B(Intent intent, Activity activity, int i8) {
        this.f8451a = intent;
        this.f8452b = activity;
        this.f8453c = i8;
    }

    @Override // R.D
    public final void a() {
        Intent intent = this.f8451a;
        if (intent != null) {
            this.f8452b.startActivityForResult(intent, this.f8453c);
        }
    }
}
